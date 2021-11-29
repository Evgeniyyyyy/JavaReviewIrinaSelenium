import java.util.ArrayList;
import java.util.List;



    public class AscendingSequences {
        public int[] buildAscendingArray(int startNumber, int endNumber) {
            int[] array = new int[endNumber - startNumber + 1];
            for (int i = 0; i < endNumber - startNumber + 1; i++) {
                array[i] = startNumber + 1;
                System.out.print(array[i]);

            }
            return array;
        }

        public String buildAscendingString(int startNumber, int endNumber) {
            StringBuilder stringBuilder = new StringBuilder();

            if (startNumber < endNumber && startNumber >= Integer.MIN_VALUE && endNumber <= Integer.MAX_VALUE) {
                for (int i = startNumber; i < endNumber; i++) {
                    stringBuilder.append(i).append(" ,");
                }
                stringBuilder.append(endNumber);
                System.out.println(stringBuilder);

                return String.valueOf(stringBuilder);
            } else {
                return "Error";
            }
        }

        public List<Integer> buildAscendingList(int startNumber, int endNumber, int step){
            List<Integer> list = new ArrayList<>();
            for (int i = startNumber; i <= endNumber; i+= step) {
                list.add(i);

            }
            return list;

        }
    }




