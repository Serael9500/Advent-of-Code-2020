public class Main {
    
    public static void main (String[] args) throws Exception {
      test();
        
	    int[] entries = new int[] {
	          1945,
            2004,
            1520,
            1753,
            1463,
            1976,
            1994,
            1830,
            1942,
            1784,
            1858,
            1841,
            1721,
            1480,
            1821,
            1584,
            978,
            1530,
            1278,
            1827,
            889,
            1922,
            1996,
            1992,
            1819,
            1847,
            2010,
            2002,
            210,
            1924,
            1482,
            1451,
            1867,
            1364,
            1578,
            1623,
            1117,
            1594,
            1476,
            1879,
            1797,
            1952,
            2005,
            1734,
            1898,
            1880,
            1330,
            1854,
            1813,
            1926,
            1686,
            1286,
            1808,
            1876,
            1366,
            1995,
            1632,
            1699,
            2001,
            1365,
            1343,
            1979,
            1868,
            1815,
            820,
            1966,
            1888,
            1916,
            1852,
            1932,
            1368,
            1606,
            1825,
            1731,
            1980,
            1990,
            1818,
            1702,
            1419,
            1897,
            1970,
            1276,
            1914,
            1889,
            1953,
            1588,
            1958,
            1310,
            1391,
            1326,
            1131,
            1959,
            1844,
            1307,
            1998,
            1961,
            1708,
            1977,
            1886,
            1946,
            1516,
            1999,
            1859,
            1931,
            1853,
            1265,
            1869,
            1642,
            1740,
            1467,
            1944,
            1956,
            1263,
            1940,
            1912,
            1832,
            1872,
            1678,
            1319,
            1839,
            1689,
            1765,
            1894,
            1242,
            1983,
            1410,
            1985,
            1387,
            1022,
            1358,
            860,
            112,
            1964,
            1836,
            1838,
            1285,
            1943,
            1718,
            1351,
            760,
            1925,
            1842,
            1921,
            1967,
            1822,
            1978,
            1837,
            1378,
            1618,
            1266,
            2003,
            1972,
            666,
            1321,
            1938,
            1616,
            1892,
            831,
            1865,
            1314,
            1571,
            1806,
            1225,
            1882,
            1454,
            1257,
            1381,
            1284,
            1907,
            1950,
            1887,
            1492,
            1934,
            1709,
            1315,
            1574,
            1794,
            1576,
            1883,
            1864,
            1981,
            1317,
            1397,
            1325,
            1620,
            1895,
            1485,
            1828,
            1803,
            1715,
            1374,
            1251,
            1460,
            1863,
            1581,
            1499,
            1933,
            1982,
            1809,
            1812
	    };
	    
	    // First part.
	    int[] result = find2Sum2020(entries);
	    int mult = result[0] * result[1];
	    
	    System.out.println(result[0] + " * " + result[1] + " = " + mult);
	    
	    // Second part.
	    result = find3Sum2020(entries);
	    mult = result[0] * result[1] * result[2];
	    System.out.println(result[0] + " * " + result[1] + " * " + result[2] + " = " + mult);
    }
    
    public static int[] find2Sum2020 (int[] entries) {
        for (int i = 0; i < entries.length - 1; i++) {
            for (int j = i + 1; j < entries.length; j++) {
                if (entries[i] + entries[j] == 2020)  {
                    return new int[] { entries[i], entries[j] };
                }
            }
        }
        
        return null;
    }
    
    public static int[] find3Sum2020 (int[] entries) {
        for (int i = 0; i < entries.length - 2; i++) {
            for (int j = i + 1; j < entries.length - 1; j++) {
                for (int k = i + 2; k < entries.length; k++) {
                    if (entries[i] + entries[j] + entries[k] == 2020)  {
                        return new int[] { entries[i], entries[j], entries[k] };
                    }
                }
            }
        }
        
        return null;
    }
    
    public static void test () {
      System.out.println("-------");
	    System.out.println(" TESTS ");
	    System.out.println("-------");
        
      int[] entries = new int[] {
	          1721,
            979,
            366,
            299,
            675,
            1456
	    };
	    
	    // find2Sum2020() test.
	    int[] result = find2Sum2020(entries);
	    int mult = result[0] * result[1];
	    
	    System.out.println("[" + result[0] + ", " + result[1] + "] == [1721, 299] ? => " + (result[0] == 1721 && result[1] == 299));
	    System.out.println(mult + " = " + 514579 + " ? => " + (mult == 514579));
	    
	    System.out.println();
	    
	    // find3Sum2020() test.
	    result = find3Sum2020(entries);
	    mult = result[0] * result[1] * result[2];
	    
	    System.out.println("[" + result[0] + ", " + result[1] + ", " + result[2] + "] == [979, 366, 675] ? => " + (result[0] == 1721 && result[1] == 299 && result[2] == 675));
	    System.out.println(mult + " = " + 241861950 + " ? => " + (mult == 241861950));
	    
	    System.out.println();
	    System.out.println();
    }
}
