package com.kengoweb.codewars.kyu7.thepoetandthependulum;

public class Poet {

    private static final int DIRECTION_VECTOR = -1;

    private static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i == result.length - 1) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    private static int getCurrentPosition(int readyElements, int positionCenter) {
        if (readyElements % 2 == 0) {
            return positionCenter + readyElements / 2;
        } else {
            return positionCenter - readyElements / 2;
        }
    }

    public static int[] pendulum(final int[] values) {
        int[] result = values.clone();

        int positionCenter = result.length / 2 - 1;

        if (result.length % 2 != 0) {
            positionCenter = 1 + positionCenter;
        }

        int readyElements = 0;
        int minPosition = positionCenter;
        int maxPosition = positionCenter;

        while (readyElements < result.length) {
            int currentPosition = getCurrentPosition(readyElements + 1, positionCenter);
            int currentMinPosition = currentPosition;

            for (int i = 0; i < minPosition; i++) {
            	if (result[currentMinPosition] > result[i]) {
                    currentMinPosition = i;
                }
            }
            for (int i = maxPosition + 1; i < result.length; i++) {
            	if (result[currentMinPosition] > result[i]) {
                    currentMinPosition = i;
                }
            }
            /*
            for (int i = 0; i < result.length; i++) {
                if (readyElements > 0) {
                    if (i >= minPosition && i <= maxPosition) {
                        continue;
                    }
                }
                if (result[currentMinPosition] > result[i]) {
                    currentMinPosition = i;
                }
            }
            */

            if (currentMinPosition != currentPosition) {
                int tempValue = result[currentMinPosition];
                result[currentMinPosition] = result[currentPosition];
                result[currentPosition] = tempValue;
            }

            readyElements++;
            if (readyElements > 1) {
                if (readyElements % 2 == 0) {
                    maxPosition++;
                } else {
                    minPosition--;
                }
            }
        }

        return result;
    }
}
