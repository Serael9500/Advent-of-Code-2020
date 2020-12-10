import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        tests();
        
        int[] joltageRatings = new int[] {
            165,
            78,
            151,
            15,
            138,
            97,
            152,
            64,
            4,
            111,
            7,
            90,
            91,
            156,
            73,
            113,
            93,
            135,
            100,
            70,
            119,
            54,
            80,
            170,
            139,
            33,
            123,
            92,
            86,
            57,
            39,
            173,
            22,
            106,
            166,
            142,
            53,
            96,
            158,
            63,
            51,
            81,
            46,
            36,
            126,
            59,
            98,
            2,
            16,
            141,
            120,
            35,
            140,
            99,
            121,
            122,
            58,
            1,
            60,
            47,
            10,
            87,
            103,
            42,
            132,
            17,
            75,
            12,
            29,
            112,
            3,
            145,
            131,
            18,
            153,
            74,
            161,
            174,
            68,
            34,
            21,
            24,
            85,
            164,
            52,
            69,
            65,
            45,
            109,
            148,
            11,
            23,
            129,
            84,
            167,
            27,
            28,
            116,
            110,
            79,
            48,
            32,
            157,
            130
        };
        
        int[] diffs = getDiffs(joltageRatings);
        System.out.println(diffs[0] * diffs[2]);
        
        int count = countDifferentSets(joltageRatings);
        System.out.println(count);
    }
    
    
    public static int[] getDiffs (int[] joltageRatings) {
        ArrayList<Integer> list = completeAndSortList(joltageRatings);
        int[] diffs = new int[3];
        
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            
            switch (diff) {
                case 1:
                    diffs[0]++;
                    break;
                    
                case 2:
                    diffs[1]++;
                    break;
                    
                case 3:
                    diffs[2]++;
                    break;
            }
        }
        
        return diffs;
    }
    
    public static ArrayList<Integer> completeAndSortList (int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        Collections.sort(list);
        
        list.add(0, 0);
        list.add(list.get(list.size() - 1) + 3);
        
        return list;
    }
    
    // FIXME
    public static int countDifferentSets (int[] joltageRatings) {
        ArrayList<Integer> list = completeAndSortList(joltageRatings);
        int count = 1;
        
        for (int i = 0; i < list.size(); i++) {
            boolean canMove3 = (i + 3 < list.size()) ? list.get(i + 3) - list.get(i) <= 3 : false;
            boolean canMove2 = (i + 2 < list.size()) ? list.get(i + 2) - list.get(i) <= 3 : false;
            
            if (canMove3) {
                count *= 4;
                i += 3;
            } else if (canMove2) {
                count *= 2;
                i += 2;
            }
        }
        
        return count;
    }
    
    
    public static void tests () {
        System.out.println("-------");
        System.out.println(" TESTS ");
        System.out.println("-------");
        
        // getDiffs() 1st test
        int[] joltageRatings = new int[] {
            16,
            10,
            15,
            5,
            1,
            11,
            7,
            19,
            6,
            12,
            4
        };
        
        int[] diffs = getDiffs(joltageRatings);
        System.out.println(diffs[0] + " == 7 ? => " + (diffs[0] == 7));
        System.out.println(diffs[2] + " == 5 ? => " + (diffs[2] == 5));
        
        // getDiffs() 2nd test
        joltageRatings = new int[] {
            28,
            33,
            18,
            42,
            31,
            14,
            46,
            20,
            48,
            47,
            24,
            23,
            49,
            45,
            19,
            38,
            39,
            11,
            1,
            32,
            25,
            35,
            8,
            17,
            7,
            9,
            4,
            2,
            34,
            10,
            3
        };
        
        diffs = getDiffs(joltageRatings);
        System.out.println(diffs[0] + " == 22 ? => " + (diffs[0] == 22));
        System.out.println(diffs[2] + " == 10 ? => " + (diffs[2] == 10));
        
        System.out.println();
        
        // countDifferentSets() 1st test
        joltageRatings = new int[] {
            16,
            10,
            15,
            5,
            1,
            11,
            7,
            19,
            6,
            12,
            4
        };
        
        int count = countDifferentSets(joltageRatings);
        System.out.println(count + " == 8 ? => " + (count == 8));
        
        // countDifferentSets() 2nd test
        joltageRatings = new int[] {
            28,
            33,
            18,
            42,
            31,
            14,
            46,
            20,
            48,
            47,
            24,
            23,
            49,
            45,
            19,
            38,
            39,
            11,
            1,
            32,
            25,
            35,
            8,
            17,
            7,
            9,
            4,
            2,
            34,
            10,
            3
        };
        
        count = countDifferentSets(joltageRatings);
        System.out.println(count + " == 19208 ? => " + (count == 19208));
        
        System.out.println();
        System.out.println();
    }
    
    
}
