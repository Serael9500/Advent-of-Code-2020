public class Main {
    
    public static void main(String[] args) throws Exception {
        String[] test_forest = {
            "..##.......",
            "#...#...#..",
            ".#....#..#.",
            "..#.#...#.#",
            ".#...##..#.",
            "..#.##.....",
            ".#.#.#....#",
            ".#........#",
            "#.##...#...",
            "#...##....#",
            ".#..#...#.#"  
        };
        
        long mult = countTrees(forest, 1, 1) * 
                    countTrees(forest, 3, 1) * 
                    countTrees(forest, 5, 1) * 
                    countTrees(forest, 7, 1) *
                    countTrees(forest, 1, 2)
        ;
        System.out.println("mult -> " + mult);
    }
    
    public static long countTrees (String[] forest, int right, int down) {
        long trees = 0;
        int index = 0;
    
         for (int i = 0; i < forest.length; i += down) {
            index = mod(index, forest[i].length());
            
            if (forest[i].charAt(index) == '#') {
                trees++;
            }    
    
            index += right;
        }
    
        return trees;
    }

    public static int mod (int n, int m) {
    	while (n >= m) {
    		n -= m;
    	}

    	while (n < 0) {
    		n += m;
    	}

	    return n;
    }
    
    public static void countTreesTest () {
      String[] forest = {
            "..##.......",
            "#...#...#..",
            ".#....#..#.",
            "..#.#...#.#",
            ".#...##..#.",
            "..#.##.....",
            ".#.#.#....#",
            ".#........#",
            "#.##...#...",
            "#...##....#",
            ".#..#...#.#"  
        };
        
        assert(countTrees(forest, 1, 1), 2);
        assert(countTrees(forest, 3, 1), 7);
        assert(countTrees(forest, 5, 1), 3);
        assert(countTrees(forest, 7, 1), 4);
        assert(countTrees(forest, 1, 2), 2);
        
        long mult = countTrees(forest, 1, 1) * 
                    countTrees(forest, 3, 1) * 
                    countTrees(forest, 5, 1) * 
                    countTrees(forest, 7, 1) *
                    countTrees(forest, 1, 2)
        ;
        assert(mult, 336)
    }
    
    
}
