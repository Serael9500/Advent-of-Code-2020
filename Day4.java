import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        test();
        
        String passports = 
            "iyr:2013 hcl:#ceb3a1\n" +
            "hgt:151cm eyr:2030\n" +
            "byr:1943 ecl:grn\n" +
            "\n" +
            "eyr:1988\n" +
            "iyr:2015 ecl:gry\n" +
            "hgt:153in pid:173cm\n" +
            "hcl:0c6261 byr:1966\n" +
            "\n" +
            "hcl:#733820\n" +
            "hgt:166cm eyr:2025 pid:79215921 byr:1952 iyr:2014 ecl:blu\n" +
            "\n" +
            "eyr:2022\n" +
            "hgt:165cm hcl:#733820\n" +
            "iyr:2013 pid:073015801 ecl:oth\n" +
            "cid:101\n" +
            "\n" +
            "iyr:2013\n" +
            "ecl:brn hcl:#623a2f\n" +
            "cid:246 byr:1948 pid:122719649\n" +
            "hgt:160cm\n" +
            "eyr:2026\n" +
            "\n" +
            "eyr:2028\n" +
            "pid:229371724 hgt:154cm hcl:#ceb3a1 byr:2000 ecl:hzl iyr:2017\n" +
            "\n" +
            "eyr:2029 ecl:amb\n" +
            "byr:1980\n" +
            "hgt:177cm pid:914628384 hcl:#623a2f iyr:2013\n" +
            "\n" +
            "iyr:2019\n" +
            "eyr:2026 hcl:#efcc98 pid:475316185 byr:1945\n" +
            "hgt:76in\n" +
            "ecl:amb\n" +
            "\n" +
            "pid:371759305 iyr:2018 hcl:#623a2f eyr:2026 byr:1984 hgt:174cm\n" +
            "\n" +
            "iyr:2010 pid:184800910 ecl:amb cid:108 eyr:2028\n" +
            "hcl:#cfa07d\n" +
            "\n" +
            "iyr:2012 hcl:#b6652a hgt:160cm pid:223041037\n" +
            "eyr:2029 byr:1920 ecl:oth cid:212\n" +
            "\n" +
            "pid:775975903\n" +
            "hgt:163cm byr:1966\n" +
            "eyr:2023 ecl:amb iyr:2010\n" +
            "\n" +
            "pid:465404256 hcl:#7a54af ecl:blu hgt:180cm iyr:2018\n" +
            "eyr:2024 byr:1933\n" +
            "\n" +
            "hcl:#18171d\n" +
            "iyr:2018 hgt:185cm\n" +
            "byr:1929 eyr:2024\n" +
            "ecl:oth\n" +
            "pid:#b0990a\n" +
            "\n" +
            "byr:2017\n" +
            "hcl:#cfa07d pid:184cm hgt:187in ecl:#e97c0d iyr:2022 eyr:2013\n" +
            "\n" +
            "hgt:176cm iyr:2019 eyr:2024 ecl:brn byr:1943\n" +
            "pid:532967054 hcl:007b47\n" +
            "\n" +
            "pid:171225044 hcl:#888785 byr:1992 ecl:amb iyr:2012 eyr:2030\n" +
            "hgt:180cm\n" +
            "\n" +
            "byr:1969\n" +
            "pid:689216275 iyr:1934 eyr:2031 ecl:#e5bc14 hcl:#fffffd\n" +
            "\n" +
            "pid:166619054 cid:125 hcl:#cfa07d hgt:164cm byr:1946\n" +
            "ecl:brn iyr:2014 eyr:2023\n" +
            "\n" +
            "ecl:#c1ae72 pid:458692331 hcl:#b6652a eyr:1966 byr:1951 iyr:2023\n" +
            "\n" +
            "cid:253 pid:9096156879 hcl:9911e5\n" +
            "byr:2007\n" +
            "iyr:2019 eyr:2033 hgt:181cm\n" +
            "ecl:blu\n" +
            "\n" +
            "ecl:oth pid:180428876 iyr:2019 byr:2001 eyr:2024 hgt:172cm hcl:#7d3b0c\n" +
            "cid:81\n" +
            "\n" +
            "hgt:167cm\n" +
            "byr:2007 eyr:2030\n" +
            "iyr:1961 ecl:lzr hcl:#cfa07d\n" +
            "pid:#e254d8\n" +
            "\n" +
            "pid:377737133 hgt:160cm byr:1958 hcl:#866857 ecl:oth iyr:2015 eyr:2022 cid:350\n" +
            "\n" +
            "hgt:188cm\n" +
            "eyr:2025 ecl:brn hcl:#efcc98\n" +
            "iyr:2015 pid:321192707\n" +
            "byr:1996\n" +
            "\n" +
            "byr:1956 iyr:2018 hcl:#b6652a\n" +
            "eyr:2024\n" +
            "ecl:blu cid:343\n" +
            "hgt:152cm pid:192659885\n" +
            "\n" +
            "hgt:163cm\n" +
            "iyr:2012 byr:1952 eyr:2022 hcl:#efcc98 ecl:grn pid:337866006\n" +
            "\n" +
            "cid:134\n" +
            "byr:1941 eyr:2027 ecl:oth\n" +
            "iyr:2012 pid:303690324 hcl:#7d3b0c\n" +
            "\n" +
            "ecl:grn byr:1945 eyr:2028 hcl:#cfa07d iyr:2012 cid:108 pid:388941584 hgt:171cm\n" +
            "\n" +
            "pid:962215061 ecl:brn iyr:2019 eyr:2025 cid:163 hcl:#cfa07d byr:1958 hgt:187in\n" +
            "\n" +
            "ecl:amb\n" +
            "byr:1989 pid:118257086 iyr:2019 cid:320 hgt:158cm eyr:2027 hcl:#733820\n" +
            "\n" +
            "pid:813286578\n" +
            "iyr:2019 eyr:2031 hcl:#341e13 hgt:161cm byr:1950\n" +
            "ecl:oth\n" +
            "\n" +
            "byr:1976 ecl:blu\n" +
            "eyr:2024\n" +
            "hcl:#fffffd\n" +
            "hgt:153cm pid:552154655 iyr:2019\n" +
            "\n" +
            "eyr:2025 pid:109518209 iyr:2013 byr:1923\n" +
            "hgt:162cm\n" +
            "ecl:oth\n" +
            "\n" +
            "hgt:178cm byr:2007 hcl:#7f431f pid:7365694093 eyr:2037\n" +
            "ecl:blu iyr:2018\n" +
            "\n" +
            "eyr:2021\n" +
            "cid:105 iyr:2013 byr:1995 ecl:grn hgt:181cm\n" +
            "pid:733189859 hcl:#b6652a\n" +
            "\n" +
            "hcl:#6b5442 eyr:2028 iyr:2013 byr:1958 hgt:169cm\n" +
            "ecl:gry pid:651263830\n" +
            "cid:51\n" +
            "\n" +
            "iyr:2018 cid:59 eyr:2027 ecl:blu\n" +
            "hgt:174cm pid:269821917 byr:1971\n" +
            "\n" +
            "byr:1936 eyr:2025 ecl:hzl hcl:#b6652a\n" +
            "iyr:2019\n" +
            "pid:670202082\n" +
            "hgt:186cm\n" +
            "\n" +
            "byr:1958\n" +
            "ecl:gry hcl:#7d3b0c pid:000522430 eyr:2020\n" +
            "hgt:168cm\n" +
            "\n" +
            "iyr:2015 eyr:2022\n" +
            "pid:630105579 hcl:#7d3b0c byr:1935\n" +
            "ecl:gry hgt:153cm\n" +
            "\n" +
            "ecl:gry hcl:#fffffd hgt:172cm byr:1944\n" +
            "eyr:2021\n" +
            "iyr:2013 cid:58 pid:554670072\n" +
            "\n" +
            "byr:1983\n" +
            "eyr:2022\n" +
            "iyr:2012 hgt:176cm\n" +
            "ecl:brn pid:201965494 hcl:#dd8296\n" +
            "\n" +
            "cid:124 byr:1935 eyr:2020 ecl:blu\n" +
            "hcl:#a97842 pid:666776663 iyr:2010\n" +
            "hgt:68in\n" +
            "\n" +
            "byr:1943 pid:139343878 hgt:181cm hcl:#733820 cid:206 iyr:2018 ecl:brn\n" +
            "eyr:2029\n" +
            "\n" +
            "pid:114742677\n" +
            "ecl:amb hgt:160cm\n" +
            "byr:1975 eyr:2030\n" +
            "hcl:#866857\n" +
            "\n" +
            "iyr:2012 ecl:amb hgt:170cm pid:221200950 eyr:2028\n" +
            "hcl:#733820 cid:274\n" +
            "\n" +
            "eyr:2020\n" +
            "pid:167438086 iyr:2020 hcl:#fffffd hgt:178cm byr:1996\n" +
            "ecl:blu\n" +
            "\n" +
            "iyr:2015 hcl:#b6652a\n" +
            "pid:905439259\n" +
            "byr:1962 cid:209 ecl:brn hgt:150cm eyr:2024\n" +
            "\n" +
            "iyr:2016 ecl:amb\n" +
            "pid:855119486\n" +
            "cid:77\n" +
            "hgt:192cm byr:1947 eyr:2021 hcl:#888785\n" +
            "\n" +
            "hcl:#341e13\n" +
            "iyr:2011 hgt:157cm eyr:2030\n" +
            "pid:103806645 cid:90 ecl:grn byr:1976\n" +
            "\n" +
            "hcl:#fffffd byr:1957\n" +
            "cid:284 eyr:2026\n" +
            "pid:031705251 iyr:2019\n" +
            "hgt:166cm\n" +
            "\n" +
            "eyr:2019 byr:2019 hgt:167in\n" +
            "iyr:2014 ecl:gmt\n" +
            "\n" +
            "hcl:#18171d cid:93\n" +
            "eyr:2027\n" +
            "iyr:2013\n" +
            "pid:821161144 ecl:brn byr:2002 hgt:170cm\n" +
            "\n" +
            "hgt:181cm\n" +
            "byr:1972 iyr:2018 hcl:#fffffd\n" +
            "pid:745667222 eyr:2023\n" +
            "ecl:hzl\n" +
            "\n" +
            "hcl:#602927 byr:1996 ecl:blu pid:503245375\n" +
            "hgt:166cm eyr:2028 iyr:2018\n" +
            "\n" +
            "hgt:59in byr:1966\n" +
            "ecl:oth iyr:2016 eyr:2029 hcl:#866857\n" +
            "\n" +
            "cid:179 iyr:2012 hgt:182cm eyr:2024 pid:451186596 hcl:#6b5442 ecl:blu\n" +
            "\n" +
            "eyr:2023 iyr:2016\n" +
            "hcl:#18171d hgt:173cm cid:182 pid:979409688 ecl:brn byr:1972\n" +
            "\n" +
            "iyr:2014 eyr:2027 byr:1977 ecl:brn hgt:171cm hcl:#b6652a pid:124307431\n" +
            "\n" +
            "byr:1929 pid:048990845 ecl:hzl hgt:193cm cid:159 hcl:#b6652a eyr:2028\n" +
            "\n" +
            "ecl:gry hgt:181cm iyr:1934 byr:1970\n" +
            "eyr:2015 pid:5818817055 cid:98\n" +
            "\n" +
            "hgt:179cm\n" +
            "iyr:2014\n" +
            "eyr:2030\n" +
            "pid:397317466 byr:1967\n" +
            "hcl:#a97842\n" +
            "ecl:grn\n" +
            "\n" +
            "pid:138485312 ecl:hzl\n" +
            "hgt:151cm\n" +
            "iyr:2010 hcl:#866857 byr:1936 cid:345 eyr:2021\n" +
            "\n" +
            "ecl:oth\n" +
            "pid:687490850 eyr:2028 hcl:#9bd268 hgt:157cm iyr:2012 byr:1994\n" +
            "\n" +
            "byr:1933 pid:575158994 hgt:192cm iyr:2017 eyr:2022 hcl:#602927\n" +
            "ecl:gry\n" +
            "\n" +
            "iyr:2012\n" +
            "hcl:#7d3b0c\n" +
            "ecl:oth\n" +
            "eyr:2023 pid:615952261 byr:1959\n" +
            "hgt:152cm\n" +
            "\n" +
            "byr:2010\n" +
            "iyr:2011 hcl:z ecl:grn hgt:152cm pid:6079261766\n" +
            "\n" +
            "hcl:#18171d iyr:2012\n" +
            "byr:1986 ecl:blu\n" +
            "pid:836367740 hgt:191cm eyr:2024 cid:200\n" +
            "\n" +
            "ecl:blu pid:909247319 iyr:2019 eyr:2026 byr:1958\n" +
            "hgt:170cm\n" +
            "hcl:#b6652a cid:256\n" +
            "\n" +
            "eyr:2027 hcl:#efcc98 iyr:2010 hgt:191cm ecl:brn byr:1933\n" +
            "\n" +
            "byr:1921\n" +
            "pid:414637667 hcl:#8d840f cid:291 iyr:2013 ecl:amb eyr:2029 hgt:172cm\n" +
            "\n" +
            "byr:1961 iyr:2020 eyr:2025 pid:675731511 hgt:71in\n" +
            "ecl:blu hcl:#623a2f\n" +
            "\n" +
            "byr:1959 iyr:2002\n" +
            "hcl:#ceb3a1 eyr:2027 ecl:#633ff4\n" +
            "pid:815877728\n" +
            "\n" +
            "ecl:gry pid:812104470 byr:1938\n" +
            "hgt:70cm\n" +
            "eyr:2028 cid:285 iyr:2016 hcl:#b6652a\n" +
            "\n" +
            "cid:99 hgt:152cm byr:1971\n" +
            "eyr:2020 hcl:#733820\n" +
            "ecl:gry\n" +
            "iyr:2012 pid:020521112\n" +
            "\n" +
            "pid:803066169 hgt:157cm iyr:2014 hcl:#b6652a eyr:2025 ecl:brn byr:1981\n" +
            "\n" +
            "hcl:fafcd9 eyr:2021\n" +
            "hgt:76in\n" +
            "pid:359286290 cid:207 iyr:2018 ecl:grt\n" +
            "\n" +
            "pid:179471060 byr:1966 ecl:amb hcl:#18171d eyr:2029 iyr:2015 hgt:190cm\n" +
            "\n" +
            "hcl:#efcc98 ecl:gry\n" +
            "byr:1942\n" +
            "eyr:2026 iyr:2011\n" +
            "hgt:158cm pid:721512314\n" +
            "\n" +
            "ecl:oth eyr:2024 hcl:#8bc738\n" +
            "hgt:167cm iyr:2014 pid:729168992\n" +
            "\n" +
            "hcl:#b6652a\n" +
            "pid:179977662\n" +
            "iyr:2018\n" +
            "ecl:gry\n" +
            "byr:1973\n" +
            "hgt:155cm\n" +
            "cid:126 eyr:2030\n" +
            "\n" +
            "byr:2012 eyr:1955 hcl:z iyr:1981 pid:#66167e hgt:175in ecl:grt\n" +
            "\n" +
            "hgt:154cm cid:301 iyr:2010 hcl:#7d3b0c pid:573851812 ecl:grn eyr:2030\n" +
            "\n" +
            "pid:601712917 ecl:hzl eyr:2001 cid:70 hgt:162cm hcl:#6b5442 iyr:2018\n" +
            "byr:1959\n" +
            "\n" +
            "hgt:183cm byr:1996 eyr:2023 hcl:#866857 iyr:2018 pid:259910953 ecl:brn\n" +
            "\n" +
            "pid:751991211 hcl:z iyr:2015 eyr:2024 byr:1939 ecl:oth hgt:161cm\n" +
            "\n" +
            "eyr:2026 byr:1947\n" +
            "ecl:grn iyr:2018 cid:248 hcl:#ef5900 hgt:66in\n" +
            "\n" +
            "iyr:2028 eyr:1994 pid:9211015765\n" +
            "ecl:amb\n" +
            "hcl:cd429d\n" +
            "byr:2013\n" +
            "hgt:176cm\n" +
            "\n" +
            "hgt:193cm ecl:amb eyr:2023\n" +
            "iyr:2020 byr:1933\n" +
            "cid:50\n" +
            "hcl:#efcc98 pid:482745318\n" +
            "\n" +
            "byr:2014 pid:619629999\n" +
            "ecl:oth hgt:159cm eyr:2027 iyr:2018 hcl:#b6652a\n" +
            "\n" +
            "hcl:#b6652a eyr:2028 byr:1921\n" +
            "ecl:blu\n" +
            "pid:866536313 hgt:185cm iyr:2020\n" +
            "\n" +
            "eyr:2027 pid:904225608 iyr:2010 cid:57 hgt:161cm hcl:#83ee3c ecl:gry byr:2001\n" +
            "\n" +
            "byr:1968 pid:120450875 iyr:2018 hgt:165cm ecl:grn eyr:2022 hcl:#7d3b0c\n" +
            "\n" +
            "hcl:#a97842 byr:1964\n" +
            "eyr:2027 ecl:oth hgt:186cm iyr:2010\n" +
            "cid:226 pid:632344779\n" +
            "\n" +
            "pid:135449714\n" +
            "cid:348 iyr:2019\n" +
            "hcl:#602927\n" +
            "ecl:oth eyr:2029\n" +
            "hgt:184cm byr:1992\n" +
            "\n" +
            "eyr:2027\n" +
            "byr:1929 hgt:181cm hcl:#fffffd iyr:2019 pid:369478657\n" +
            "ecl:blu\n" +
            "\n" +
            "hgt:177cm eyr:2021 iyr:2016 ecl:gry byr:1938 hcl:#602927 pid:034365656\n" +
            "\n" +
            "iyr:2020 hcl:#866857\n" +
            "eyr:2028\n" +
            "pid:183612456 ecl:#9e25d3 hgt:159cm byr:1934\n" +
            "\n" +
            "pid:664990234 hcl:#efcc98 cid:185 iyr:2018\n" +
            "ecl:brn\n" +
            "hgt:192cm\n" +
            "byr:1942\n" +
            "eyr:2029\n" +
            "\n" +
            "eyr:2027\n" +
            "hgt:163cm pid:760854338 cid:228\n" +
            "byr:1958 iyr:2014\n" +
            "hcl:#efcc98 ecl:gry\n" +
            "\n" +
            "iyr:2014\n" +
            "hcl:#18171d hgt:157cm ecl:amb eyr:2025 byr:1957 pid:347369874\n" +
            "\n" +
            "pid:013801431 byr:1999\n" +
            "hgt:181cm eyr:2029\n" +
            "ecl:amb iyr:2010\n" +
            "hcl:#b6652a\n" +
            "\n" +
            "hgt:153 eyr:2030 byr:2022\n" +
            "hcl:z cid:84 ecl:hzl iyr:2020\n" +
            "\n" +
            "cid:315 iyr:2011\n" +
            "hgt:151cm hcl:#ffb5f9\n" +
            "pid:427813663 byr:1999 ecl:brn eyr:2025\n" +
            "\n" +
            "eyr:2024\n" +
            "cid:205 byr:2000 iyr:2020 hgt:173cm ecl:gry\n" +
            "\n" +
            "eyr:2026 byr:1996 iyr:2018 ecl:grn hgt:158cm pid:026432567 hcl:#602927\n" +
            "\n" +
            "iyr:2014\n" +
            "ecl:hzl\n" +
            "byr:1964 eyr:2020 hgt:184cm pid:031793197 hcl:#fffffd\n" +
            "\n" +
            "ecl:oth hgt:165cm byr:1982 pid:172329608 hcl:#733820\n" +
            "iyr:2019\n" +
            "eyr:2020 cid:347\n" +
            "\n" +
            "byr:2014 iyr:2011 hgt:179cm\n" +
            "hcl:z eyr:2020 ecl:grt\n" +
            "cid:134\n" +
            "\n" +
            "ecl:gry\n" +
            "iyr:2011 hcl:#a97842\n" +
            "byr:1942 pid:789953865 cid:172 hgt:180cm eyr:2027\n" +
            "\n" +
            "hgt:179cm pid:975853536\n" +
            "iyr:2018 byr:1989 hcl:#602927\n" +
            "eyr:2021 ecl:amb\n" +
            "\n" +
            "byr:2011\n" +
            "iyr:2015\n" +
            "ecl:oth\n" +
            "hcl:85d233 cid:207 eyr:2020 hgt:138 pid:6169876\n" +
            "\n" +
            "ecl:hzl eyr:2029 hcl:#efcc98\n" +
            "hgt:188cm iyr:2018 cid:143 byr:1973\n" +
            "\n" +
            "hcl:#ceb3a1 pid:762609805\n" +
            "byr:1962\n" +
            "hgt:150cm\n" +
            "iyr:2016 eyr:2024 ecl:oth\n" +
            "\n" +
            "iyr:2012\n" +
            "pid:181821528 byr:1922 ecl:gry hcl:#a97842 hgt:169cm eyr:2028\n" +
            "\n" +
            "eyr:2029 pid:776605704 byr:1964 hgt:175cm hcl:#623a2f ecl:grn\n" +
            "iyr:2011\n" +
            "\n" +
            "byr:1989 iyr:2019\n" +
            "ecl:gry pid:397990288\n" +
            "hcl:#602927 hgt:67in eyr:2030\n" +
            "cid:259\n" +
            "\n" +
            "hcl:#866857 iyr:2018 ecl:blu byr:1938 cid:227 eyr:2028 hgt:171cm\n" +
            "pid:779192850\n" +
            "\n" +
            "byr:1974 hcl:#cfa07d eyr:2026 hgt:59in cid:51 iyr:2019\n" +
            "ecl:oth pid:091591737\n" +
            "\n" +
            "byr:1952 cid:301 pid:804465935 hgt:152cm eyr:2025 hcl:#888785\n" +
            "iyr:2013 ecl:hzl\n" +
            "\n" +
            "hcl:6a32f0 eyr:2027\n" +
            "iyr:2014\n" +
            "ecl:amb byr:1933 cid:185\n" +
            "hgt:75cm\n" +
            "\n" +
            "byr:1945 hcl:#b6652a\n" +
            "hgt:163cm ecl:brn eyr:2025 iyr:2015 pid:829875350\n" +
            "\n" +
            "byr:1940 hgt:174cm iyr:2014 pid:9989523268 ecl:gry eyr:2026\n" +
            "hcl:#efcc98\n" +
            "\n" +
            "iyr:2011 ecl:lzr\n" +
            "byr:1998 hgt:182cm\n" +
            "eyr:2029 hcl:z\n" +
            "\n" +
            "pid:091142801\n" +
            "hcl:#c0946f byr:1983 ecl:blu iyr:2017 hgt:183cm eyr:2027\n" +
            "\n" +
            "ecl:oth iyr:2011 hgt:158cm byr:1950 pid:902512428 hcl:#623a2f eyr:2028\n" +
            "\n" +
            "eyr:2020\n" +
            "iyr:2020\n" +
            "ecl:oth byr:1938 hcl:#d5eb7e\n" +
            "pid:829945241 hgt:171cm\n" +
            "\n" +
            "byr:1971\n" +
            "pid:998912876 eyr:2022\n" +
            "iyr:2012 hcl:#cfa07d cid:338 ecl:brn\n" +
            "hgt:183cm\n" +
            "\n" +
            "ecl:amb hcl:#7d3b0c pid:331124964 iyr:2013 byr:1945 hgt:189cm eyr:2028\n" +
            "\n" +
            "pid:012740434 iyr:2019\n" +
            "byr:1998\n" +
            "hgt:172cm eyr:2028\n" +
            "cid:102 hcl:#866857\n" +
            "ecl:amb\n" +
            "\n" +
            "hcl:#866857\n" +
            "eyr:2027 hgt:181cm byr:1954 ecl:blu\n" +
            "iyr:2010\n" +
            "pid:211721858\n" +
            "\n" +
            "byr:1984 pid:876360762 hgt:72cm\n" +
            "eyr:2040 hcl:a60c15 iyr:1948 ecl:lzr\n" +
            "\n" +
            "hgt:167cm byr:1930 ecl:oth pid:740024142 eyr:2024 hcl:#341e13\n" +
            "iyr:2018\n" +
            "\n" +
            "byr:1968 hcl:#623a2f ecl:brn\n" +
            "cid:210 hgt:155cm\n" +
            "iyr:2017 pid:216618180 eyr:2024\n" +
            "\n" +
            "byr:1966 pid:131332466 hgt:174cm ecl:amb\n" +
            "hcl:#733820\n" +
            "iyr:2013 eyr:2023\n" +
            "\n" +
            "eyr:1985\n" +
            "pid:#fde6c1\n" +
            "hcl:z byr:2017 iyr:2027 hgt:163cm\n" +
            "\n" +
            "iyr:2016 ecl:hzl hgt:171cm\n" +
            "hcl:#888785 pid:390140479 byr:1976\n" +
            "\n" +
            "cid:327 eyr:2023 byr:1954\n" +
            "hgt:192cm iyr:2012\n" +
            "pid:413357852 ecl:blu\n" +
            "\n" +
            "iyr:2014 ecl:hzl hgt:154cm byr:1962 pid:904474869 hcl:#6b5442 eyr:2023\n" +
            "\n" +
            "ecl:hzl iyr:2012 eyr:2027 pid:663644982 hgt:175cm cid:56\n" +
            "byr:1980 hcl:#ceb3a1\n" +
            "\n" +
            "eyr:2020 iyr:2012 hgt:190cm byr:1993 hcl:#a97842\n" +
            "ecl:amb pid:418635216\n" +
            "\n" +
            "pid:845398140\n" +
            "byr:1933 iyr:2016 ecl:oth eyr:2024 hcl:#cfa07d hgt:169cm\n" +
            "\n" +
            "eyr:2040 hgt:161cm\n" +
            "byr:2018 ecl:blu\n" +
            "iyr:2022 hcl:#866857 cid:252\n" +
            "pid:286344655\n" +
            "\n" +
            "hcl:#6b5442\n" +
            "eyr:2027\n" +
            "hgt:191cm iyr:2012\n" +
            "pid:642929864 ecl:amb byr:1934\n" +
            "\n" +
            "iyr:2015 hcl:#cfa07d ecl:grn\n" +
            "eyr:2029 pid:163012663 hgt:150cm\n" +
            "\n" +
            "eyr:2030 byr:1938 hgt:188cm iyr:2018\n" +
            "pid:652645847 hcl:#b6652a ecl:grn\n" +
            "\n" +
            "pid:157056211 iyr:2010 hcl:#cfa07d ecl:gry\n" +
            "eyr:2024 byr:1961 hgt:177cm\n" +
            "\n" +
            "eyr:2020 hcl:#60945e ecl:brn iyr:2011 pid:688090869 hgt:171cm\n" +
            "byr:1941\n" +
            "\n" +
            "eyr:2023 hgt:188cm byr:1964 hcl:#7d3b0c ecl:gry iyr:2017\n" +
            "\n" +
            "byr:1996\n" +
            "hcl:#733820 pid:142902538\n" +
            "eyr:2023 iyr:2012 ecl:oth\n" +
            "hgt:166cm\n" +
            "\n" +
            "hgt:62in cid:125 eyr:2022 hcl:#b6652a iyr:2011\n" +
            "ecl:amb pid:220826562\n" +
            "\n" +
            "ecl:grn hgt:72in byr:1991 eyr:2020 pid:281076310 hcl:#6b5442\n" +
            "\n" +
            "iyr:2030 hgt:78 eyr:1966 byr:2008 cid:260 ecl:grt hcl:5d2e21\n" +
            "\n" +
            "iyr:2017 pid:388674097 byr:1950 ecl:grn cid:338\n" +
            "hgt:159cm\n" +
            "hcl:#6b5442\n" +
            "eyr:2025\n" +
            "\n" +
            "hgt:92 eyr:2031 cid:52 pid:169cm hcl:2695be\n" +
            "iyr:1987\n" +
            "byr:2011\n" +
            "\n" +
            "pid:396358436 hcl:#ceb3a1\n" +
            "byr:1976 eyr:2025\n" +
            "iyr:2012 ecl:brn\n" +
            "hgt:174cm\n" +
            "\n" +
            "pid:389292752\n" +
            "eyr:2027 cid:335 hgt:65in byr:1974 hcl:#6b5442 ecl:oth iyr:2019\n" +
            "\n" +
            "ecl:amb iyr:2010 hcl:#602927 hgt:164cm byr:1966 pid:749383114 eyr:2026\n" +
            "\n" +
            "pid:656206688\n" +
            "hgt:175cm\n" +
            "hcl:#6b5442 byr:1961 eyr:2028\n" +
            "ecl:amb iyr:2010\n" +
            "\n" +
            "hgt:179cm eyr:2028 byr:1958\n" +
            "pid:095076581 ecl:gry\n" +
            "hcl:#733820\n" +
            "iyr:2017\n" +
            "\n" +
            "byr:1960\n" +
            "cid:309 ecl:utc iyr:2012\n" +
            "hgt:172cm pid:395100903\n" +
            "eyr:2030 hcl:#cfa07d\n" +
            "\n" +
            "eyr:2021 cid:98 pid:387957353 byr:1941\n" +
            "hgt:192cm\n" +
            "hcl:#efcc98 ecl:brn\n" +
            "\n" +
            "pid:143359781\n" +
            "hcl:#a97842\n" +
            "byr:1996\n" +
            "hgt:184cm eyr:2020 cid:319 ecl:blu iyr:2020\n" +
            "\n" +
            "eyr:2025 iyr:2013 hgt:154cm hcl:#b6652a ecl:oth byr:1979 pid:976151938\n" +
            "\n" +
            "iyr:2017\n" +
            "hgt:118 ecl:#f0f31e\n" +
            "eyr:2028\n" +
            "hcl:z\n" +
            "\n" +
            "iyr:2016 hgt:153cm hcl:#6d55cd eyr:2026 ecl:hzl byr:1943 pid:257485710 cid:165\n" +
            "\n" +
            "hcl:#ceb3a1 ecl:blu byr:1937 hgt:152cm iyr:2020 eyr:2026 pid:032844291\n" +
            "\n" +
            "hcl:#fffffd byr:1937 pid:122104515 ecl:hzl\n" +
            "iyr:2018\n" +
            "eyr:2027 hgt:163cm\n" +
            "\n" +
            "byr:1987 pid:052848077 hcl:#341e13\n" +
            "iyr:2015 hgt:172cm eyr:2022\n" +
            "\n" +
            "pid:897642631 iyr:2015 byr:1941 hcl:#733820 ecl:brn eyr:2020 hgt:179cm\n" +
            "\n" +
            "hcl:#7d3b0c ecl:grn eyr:2029 pid:232785519 cid:258 iyr:2013 byr:1999\n" +
            "\n" +
            "hgt:152cm ecl:gry hcl:#18171d eyr:2020 byr:1971 iyr:2020 pid:211826434\n" +
            "\n" +
            "hcl:#866857\n" +
            "eyr:2022 pid:979633771 ecl:hzl iyr:2014 byr:1963\n" +
            "\n" +
            "cid:124\n" +
            "ecl:utc hgt:77 hcl:#866857\n" +
            "byr:1979 iyr:2013\n" +
            "pid:92518200 eyr:1968\n" +
            "\n" +
            "hcl:#888785 eyr:2022 pid:233642738 byr:1959 hgt:191cm\n" +
            "ecl:blu iyr:2010\n" +
            "\n" +
            "pid:#adbcd3 ecl:zzz eyr:2025 cid:129 byr:2028 hcl:z hgt:166cm iyr:2011\n" +
            "\n" +
            "cid:131 hgt:169cm\n" +
            "iyr:2020\n" +
            "byr:1994\n" +
            "eyr:2021\n" +
            "ecl:amb hcl:#c0946f\n" +
            "pid:243158461\n" +
            "\n" +
            "hcl:#18171d byr:1980 ecl:oth hgt:153cm eyr:2028 iyr:2020 pid:629055498\n" +
            "\n" +
            "hcl:#b6652a\n" +
            "hgt:152 ecl:blu pid:175cm iyr:2015 byr:1941 eyr:1961\n" +
            "\n" +
            "eyr:2025 hcl:#7d6ede byr:1988\n" +
            "hgt:150cm\n" +
            "ecl:hzl cid:267\n" +
            "pid:794369607\n" +
            "iyr:2012\n" +
            "\n" +
            "pid:538963835\n" +
            "ecl:oth byr:1958\n" +
            "hgt:173cm\n" +
            "eyr:2027 cid:63\n" +
            "iyr:2018 hcl:#602927\n" +
            "\n" +
            "hcl:#866857\n" +
            "hgt:163cm byr:1925 iyr:2011\n" +
            "ecl:oth\n" +
            "eyr:2023 cid:163\n" +
            "\n" +
            "ecl:grn pid:411555227 byr:1974 eyr:2020 hgt:153cm iyr:2015 hcl:#a97842\n" +
            "\n" +
            "cid:111 pid:473064654 byr:1948\n" +
            "ecl:brn iyr:2013\n" +
            "hcl:#16fa7a\n" +
            "eyr:2024 hgt:184cm\n" +
            "\n" +
            "iyr:2016 hgt:170cm byr:1993 pid:487807940 hcl:#efcc98 eyr:2024 ecl:gry\n" +
            "\n" +
            "hcl:#a97842 pid:891517350 iyr:2012\n" +
            "byr:1937\n" +
            "ecl:amb\n" +
            "eyr:2030\n" +
            "hgt:171cm\n" +
            "\n" +
            "cid:330 ecl:gry\n" +
            "hgt:163cm eyr:2021\n" +
            "hcl:#733820 byr:1991 pid:109734880\n" +
            "\n" +
            "ecl:brn iyr:1934 eyr:2021\n" +
            "hgt:62\n" +
            "hcl:z pid:720470429\n" +
            "\n" +
            "ecl:blu\n" +
            "pid:669045673 iyr:2015\n" +
            "hgt:164cm\n" +
            "hcl:#866857\n" +
            "\n" +
            "hgt:158cm hcl:#623a2f byr:1950\n" +
            "eyr:2020 ecl:gry pid:708073090\n" +
            "iyr:2018\n" +
            "\n" +
            "hgt:158cm iyr:2017 eyr:2027\n" +
            "ecl:brn pid:840573419 hcl:#18171d byr:1968\n" +
            "\n" +
            "ecl:oth cid:81 hcl:#ceb3a1 eyr:2021\n" +
            "iyr:2020 byr:1959\n" +
            "hgt:62in\n" +
            "pid:634019849\n" +
            "\n" +
            "hgt:180cm pid:651174767 iyr:2013 byr:1948 eyr:2022 hcl:#efcc98 ecl:grn\n" +
            "\n" +
            "eyr:2021 ecl:grn\n" +
            "cid:95 hcl:#733820 iyr:2016 hgt:174cm byr:1931\n" +
            "\n" +
            "hcl:90e96c eyr:1948 ecl:zzz\n" +
            "byr:1984 pid:8325286529\n" +
            "hgt:59in\n" +
            "cid:180\n" +
            "\n" +
            "cid:293 hgt:193cm ecl:oth hcl:#602927\n" +
            "eyr:2021 byr:1959 iyr:2016\n" +
            "\n" +
            "pid:425216058\n" +
            "hcl:#7d3b0c hgt:67in ecl:blu eyr:2022\n" +
            "iyr:2016 byr:1936 cid:182\n" +
            "\n" +
            "ecl:#c93c79 byr:2021 iyr:2021\n" +
            "hgt:69cm pid:#fa092e eyr:2040\n" +
            "\n" +
            "hcl:#733820 iyr:1964\n" +
            "hgt:190cm\n" +
            "pid:121828083 byr:2028 ecl:blu eyr:2030\n" +
            "\n" +
            "byr:1986\n" +
            "eyr:2023 ecl:hzl hcl:#c0946f hgt:152cm pid:750393977 cid:308 iyr:2015\n" +
            "\n" +
            "hgt:152cm byr:2004 hcl:z eyr:2038 ecl:#e92725 iyr:2023 pid:55783937\n" +
            "\n" +
            "ecl:grn eyr:2023 hcl:#7d3b0c byr:1940 iyr:2017 pid:312213917 hgt:166cm\n" +
            "\n" +
            "ecl:grn pid:293691668\n" +
            "byr:1949 hgt:60in\n" +
            "eyr:2021\n" +
            "hcl:#efcc98 iyr:2017\n" +
            "\n" +
            "iyr:2018 hgt:156cm ecl:oth\n" +
            "hcl:#ceb3a1\n" +
            "pid:622764582 eyr:2020 cid:124\n" +
            "\n" +
            "eyr:2021\n" +
            "pid:146888876 byr:1962 iyr:2010 cid:63 ecl:amb hgt:188cm hcl:#a97842\n" +
            "\n" +
            "pid:861542171 hcl:#866857\n" +
            "ecl:brn\n" +
            "iyr:2010 byr:1975\n" +
            "eyr:2020\n" +
            "\n" +
            "hgt:157cm hcl:#18171d eyr:2022 byr:1936 iyr:2014 pid:478341738 ecl:amb\n" +
            "\n" +
            "ecl:brn\n" +
            "eyr:2026\n" +
            "pid:553753060 hgt:186cm\n" +
            "iyr:2019\n" +
            "hcl:#623a2f\n" +
            "byr:1991\n" +
            "\n" +
            "iyr:2018 ecl:blu hcl:#cfa07d hgt:162cm byr:1924 pid:721804049 eyr:2023\n" +
            "\n" +
            "byr:1970 hgt:181cm eyr:2027 ecl:hzl pid:171cm iyr:2012 hcl:#5f4282\n" +
            "\n" +
            "cid:52\n" +
            "ecl:blu iyr:2011\n" +
            "pid:027908077 hcl:#b6652a hgt:158cm\n" +
            "byr:1986\n" +
            "\n" +
            "pid:160cm hcl:91324c eyr:2034 iyr:2015\n" +
            "byr:2021\n" +
            "hgt:175in ecl:brn\n" +
            "\n" +
            "cid:164 iyr:2014 byr:1948 hgt:163cm pid:701930596 ecl:gry\n" +
            "eyr:2020 hcl:#733820\n" +
            "\n" +
            "byr:1951 hcl:#fffffd pid:456803587 hgt:157cm ecl:blu iyr:2010 eyr:2020\n" +
            "\n" +
            "ecl:#663e48\n" +
            "pid:9157891148 hgt:66cm iyr:1989\n" +
            "byr:1932\n" +
            "\n" +
            "byr:1993\n" +
            "hgt:167cm\n" +
            "ecl:amb iyr:2010 hcl:#3da943 pid:340209998 eyr:2021\n" +
            "\n" +
            "byr:1968\n" +
            "eyr:2021 pid:915482982 hcl:#84a907 iyr:2020 hgt:176cm ecl:grn\n" +
            "\n" +
            "hgt:190 ecl:oth hcl:#6b5442\n" +
            "byr:2023\n" +
            "pid:5211866539\n" +
            "iyr:2028 cid:276\n" +
            "\n" +
            "hcl:#ceb3a1 hgt:177cm byr:1966\n" +
            "pid:#9f5b93\n" +
            "iyr:2002 eyr:1958\n" +
            "ecl:oth\n" +
            "\n" +
            "hcl:#888785 eyr:2025 iyr:2017\n" +
            "hgt:187cm pid:856993600 ecl:oth\n" +
            "\n" +
            "hgt:186\n" +
            "hcl:z\n" +
            "eyr:2025\n" +
            "byr:2013 pid:6869591443 ecl:oth\n" +
            "\n" +
            "iyr:2015 pid:317156655 cid:144\n" +
            "hgt:151cm hcl:#623a2f ecl:brn\n" +
            "byr:1966 eyr:2021\n" +
            "\n" +
            "ecl:hzl pid:161653223 eyr:2026 iyr:2017 byr:1980\n" +
            "hcl:#18171d\n" +
            "\n" +
            "iyr:2009\n" +
            "pid:618443261\n" +
            "byr:1989 hcl:#23ef8c eyr:2026 hgt:167cm ecl:grn\n" +
            "\n" +
            "ecl:oth\n" +
            "hcl:#fffffd iyr:2018 eyr:2022 pid:953490888\n" +
            "\n" +
            "eyr:2026 hcl:#c0946f hgt:165cm iyr:2016 byr:1921\n" +
            "ecl:blu pid:490419824\n" +
            "\n" +
            "hgt:150cm hcl:#b6652a ecl:brn byr:1937 iyr:2013 pid:824096447 eyr:2027\n" +
            "\n" +
            "ecl:amb\n" +
            "hcl:#733820 byr:1997 iyr:2015 cid:269 hgt:96 eyr:2022 pid:475968048\n" +
            "\n" +
            "byr:1985 hgt:186cm eyr:2022 ecl:gry\n" +
            "pid:050842095 iyr:2014\n" +
            "\n" +
            "ecl:hzl byr:1942 cid:294 hgt:191cm pid:768437232\n" +
            "eyr:2024 hcl:#623a2f\n" +
            "\n" +
            "byr:1974 eyr:2022 hcl:#afb1a8 ecl:oth\n" +
            "hgt:159cm\n" +
            "cid:252\n" +
            "pid:619988658 iyr:2018\n" +
            "\n" +
            "ecl:oth eyr:2029 hgt:175cm\n" +
            "pid:548668762 byr:1982 iyr:2020 hcl:#c0946f\n" +
            "\n" +
            "ecl:gry hcl:#18171d\n" +
            "hgt:166 pid:#3f6172 iyr:1978\n" +
            "eyr:2031 byr:2021\n" +
            "\n" +
            "byr:1933 hcl:#c0946f ecl:gry eyr:2028\n" +
            "pid:594772420\n" +
            "hgt:167cm\n" +
            "iyr:2020\n" +
            "\n" +
            "cid:332 hcl:#623a2f iyr:2018 pid:706055429 byr:1971 eyr:2022 ecl:gry\n" +
            "\n" +
            "hgt:187cm hcl:#888785\n" +
            "pid:224041851 eyr:2029\n" +
            "ecl:blu iyr:2012 byr:1991\n" +
            "\n" +
            "ecl:#9c38d0\n" +
            "hgt:161in\n" +
            "hcl:099d45 byr:2015 eyr:1994\n" +
            "pid:2730108307\n" +
            "iyr:2024 cid:229\n" +
            "\n" +
            "hgt:184cm ecl:grn byr:1938 pid:996091727\n" +
            "cid:115\n" +
            "hcl:#866857 iyr:2020 eyr:2020\n" +
            "\n" +
            "pid:883396674 iyr:2019\n" +
            "eyr:2023 ecl:blu\n" +
            "byr:1979 hcl:#733820 cid:125\n" +
            "hgt:181cm\n" +
            "\n" +
            "hgt:190cm cid:325 hcl:#866857 eyr:2027 ecl:gry\n" +
            "iyr:2013 pid:317703100 byr:1968\n" +
            "\n" +
            "hcl:#866857\n" +
            "ecl:gry pid:652638412\n" +
            "eyr:2025 iyr:2015 hgt:158cm byr:1953\n" +
            "\n" +
            "byr:1956\n" +
            "hcl:#cfa07d eyr:2025\n" +
            "pid:728272575 hgt:162cm\n" +
            "cid:291 ecl:blu iyr:2020\n" +
            "\n" +
            "hgt:189cm byr:1980 hcl:#97fd64 ecl:grn iyr:2013\n" +
            "pid:181599378 eyr:2029\n" +
            "\n" +
            "iyr:2018\n" +
            "hcl:#007101 ecl:brn byr:1947 cid:265 hgt:159cm pid:288707610 eyr:2024\n" +
            "\n" +
            "hgt:62cm pid:2407695078\n" +
            "eyr:2039 byr:2014\n" +
            "iyr:1930 hcl:z\n" +
            "ecl:grt\n" +
            "\n" +
            "hgt:65cm\n" +
            "ecl:hzl\n" +
            "byr:1994 eyr:2004 hcl:z cid:130 pid:863191800\n" +
            "\n" +
            "pid:125685599 byr:1995\n" +
            "ecl:blu cid:57 hgt:172cm\n" +
            "iyr:2020\n" +
            "hcl:#b6652a\n" +
            "eyr:2024\n" +
            "\n" +
            "ecl:gry byr:1961\n" +
            "iyr:2010 eyr:2022 pid:591409441\n" +
            "cid:314\n" +
            "hcl:#341e13\n" +
            "\n" +
            "iyr:2020\n" +
            "ecl:hzl hcl:#efcc98 byr:1983 hgt:174cm\n" +
            "eyr:2028\n" +
            "\n" +
            "eyr:2029 byr:1924 iyr:2013 pid:662719101\n" +
            "ecl:amb cid:77\n" +
            "\n" +
            "ecl:oth\n" +
            "iyr:2013 byr:1947 pid:532607157 hcl:#7d3b0c eyr:2030 hgt:191cm\n" +
            "\n" +
            "pid:528940525 hcl:#18171d\n" +
            "iyr:2014 eyr:2029 cid:181\n" +
            "byr:1967\n" +
            "ecl:gry hgt:64in\n" +
            "\n" +
            "hgt:71in iyr:2019 hcl:#cfa07d eyr:2029\n" +
            "pid:785691813\n" +
            "byr:1996 ecl:hzl cid:335\n" +
            "\n" +
            "byr:2015\n" +
            "pid:174cm hgt:79 hcl:z iyr:1970 cid:66 eyr:1993 ecl:lzr\n" +
            "\n" +
            "hgt:188cm\n" +
            "eyr:2025 cid:107 ecl:grn\n" +
            "pid:286480470 hcl:#623a2f byr:1967\n" +
            "iyr:2015\n" +
            "\n" +
            "eyr:2027 hcl:#7d3b0c cid:287\n" +
            "pid:319840760 iyr:2017 hgt:179cm ecl:gry\n" +
            "\n" +
            "byr:1976 ecl:brn iyr:2020 eyr:2023 hgt:154cm pid:964286153\n" +
            "\n" +
            "iyr:2015 eyr:2027 hgt:173cm byr:1983 pid:500176757 ecl:amb hcl:#7d3b0c\n" +
            "\n" +
            "cid:282 pid:697942299 hgt:185cm\n" +
            "eyr:2026 hcl:#7d3b0c iyr:2017 byr:2002 ecl:amb\n" +
            "\n" +
            "iyr:2014 hcl:#18171d pid:044482202\n" +
            "ecl:oth\n" +
            "hgt:163cm eyr:2021 byr:1982\n" +
            "\n" +
            "ecl:gry hcl:#7d3b0c\n" +
            "iyr:2019 eyr:2020 hgt:187cm\n" +
            "pid:617117265\n" +
            "\n" +
            "eyr:2035\n" +
            "ecl:#5525a9 cid:123 byr:2009 pid:15381071 iyr:2028\n" +
            "hcl:#b6652a\n" +
            "\n" +
            "eyr:2021 hgt:165cm cid:207\n" +
            "iyr:2010 ecl:gry\n" +
            "byr:1929 hcl:#733820 pid:442632632\n" +
            "\n" +
            "pid:69132960 cid:84 hgt:107 eyr:2023\n" +
            "ecl:gmt iyr:2016\n" +
            "hcl:z\n" +
            "byr:2020\n" +
            "\n" +
            "eyr:2027 pid:281765118 hcl:#ceb3a1 hgt:193cm\n" +
            "byr:1955 ecl:gry cid:321 iyr:2010\n" +
            "\n" +
            "ecl:brn hgt:71in\n" +
            "cid:189 byr:1962 eyr:2023 iyr:2018 pid:780797141 hcl:#866857\n" +
            "\n" +
            "pid:984503466 ecl:amb hgt:192cm byr:1942 hcl:#dcc50d iyr:2020 eyr:2030 cid:250\n" +
            "\n" +
            "hcl:#7d3b0c eyr:2028\n" +
            "hgt:178cm\n" +
            "ecl:gry\n" +
            "iyr:2011\n" +
            "byr:1923\n" +
            "pid:960277768\n" +
            "\n" +
            "byr:2000 ecl:amb cid:199 eyr:2027 iyr:2020 pid:785585164 hcl:#888785\n" +
            "hgt:164cm\n" +
            "\n" +
            "iyr:2015 pid:619005249\n" +
            "ecl:brn byr:1955 eyr:2028\n" +
            "hgt:183cm\n" +
            "hcl:#a97842\n" +
            "\n" +
            "ecl:grn\n" +
            "byr:1970 cid:339\n" +
            "iyr:2011 hcl:#a97842 pid:952307953 eyr:2027 hgt:159cm\n" +
            "\n" +
            "hcl:ff4451 iyr:2022\n" +
            "byr:1972 ecl:#86cbc5 pid:29044223 eyr:1985\n" +
            "hgt:62cm\n" +
            "\n" +
            "hcl:#623a2f iyr:2013 eyr:2023 hgt:164cm byr:1956\n" +
            "ecl:oth\n" +
            "\n" +
            "eyr:2028 hcl:#733820 pid:767003752 byr:1935 hgt:167cm iyr:2016\n" +
            "ecl:oth\n" +
            "cid:215\n" +
            "\n" +
            "cid:125 ecl:amb\n" +
            "iyr:2019 hcl:#18171d eyr:2022 hgt:163cm\n" +
            "pid:239764055\n" +
            "byr:1954\n" +
            "\n" +
            "ecl:gry\n" +
            "iyr:2019 hcl:#cfa07d byr:1929 pid:221011852\n" +
            "cid:274 eyr:2026 hgt:158cm\n" +
            "\n" +
            "hcl:#a97842 iyr:2016 hgt:159cm\n" +
            "byr:1998 ecl:hzl eyr:2020 cid:207\n" +
            "\n" +
            "pid:051242790\n" +
            "iyr:2024\n" +
            "byr:1975 hcl:#602927\n" +
            "ecl:grn hgt:160cm eyr:2014\n" +
            "\n" +
            "ecl:#0b3ea5 hcl:z pid:#122ff0\n" +
            "byr:2007\n" +
            "hgt:178 iyr:2013\n" +
            "eyr:1950\n" +
            "\n" +
            "hgt:171cm hcl:#cfa07d pid:674448249\n" +
            "ecl:hzl eyr:2026\n" +
            "cid:297 byr:1928\n" +
            "\n" +
            "ecl:hzl eyr:2021 hcl:#b6652a pid:856617617\n" +
            "byr:1949\n" +
            "hgt:153cm iyr:2015\n" +
            "\n" +
            "hgt:164cm ecl:gry\n" +
            "eyr:2025\n" +
            "pid:147932207 iyr:2011 byr:1984 hcl:#fffffd\n" +
            "\n" +
            "eyr:2027 hcl:#7d3b0c\n" +
            "pid:377701492 ecl:gry byr:1971 hgt:174cm\n" +
            "iyr:2023\n" +
            "\n" +
            "byr:2001 hcl:#4784a2 hgt:161cm iyr:2014 eyr:2025 pid:955262336\n" +
            "ecl:amb\n"  
        ;
        
        System.out.println(countValidPassports(passports));
        System.out.println(countValidPassports2(passports));
    }
    
    public static int countValidPassports (String passports) {
        int validCount = 0;
        
        for (String passport : passports.split("\n\n")) {
            int tagCount = 0;
            
            for (String line : passport.split("\n")) {
                for (String entry : line.split(" ")) {
                    String tag = entry.split(":")[0];
                    
                    if (
                        tag.equals("byr") || tag.equals("iyr") || tag.equals("eyr") || 
                        tag.equals("hgt") || tag.equals("hcl") || tag.equals("ecl") || 
                        tag.equals("pid")
                    ) {
                        tagCount++;
                    } 
                }
            }
            
            
            if (tagCount == 7) {
                validCount++;
            }
        }
        
        return validCount;
    }
    
    public static int countValidPassports2 (String passports) {
        int validCount = 0;
        
        for (String passport : passports.split("\n\n")) {
            boolean isValidPassport = true;
            int tagCount = 0;
            
            for (String line : passport.split("\n")) {
                for (String entry : line.split(" ")) {
                    String tag = entry.split(":")[0];
                    String data = entry.split(":")[1];
                    int aux = 0;
                    
                    switch (tag) {
                        case "byr":
                            tagCount++;
                            aux = Integer.parseInt(data);
                            if (aux < 1920 || aux > 2002) {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "iyr":
                            tagCount++;
                            aux = Integer.parseInt(data);
                            if (aux < 2010 || aux > 2020) {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "eyr":
                            tagCount++;
                            aux = Integer.parseInt(data);
                            if (aux < 2020 || aux > 2030) {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "hgt":
                            tagCount++;
                            if (data.matches("[0-9]+cm")) {
                                aux = Integer.parseInt(data.substring(0, data.length() - 2));
                                if (aux < 150 || aux > 193) {
                                    isValidPassport = false;
                                }
                            } else if (data.matches("[0-9]+in")) {
                                aux = Integer.parseInt(data.substring(0, data.length() - 2));
                                if (aux < 59 || aux > 76) {
                                    isValidPassport = false;
                                }
                            } else {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "hcl":
                            tagCount++;
                            if (!data.matches("#([0-9]|[a-f]){6}")) {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "ecl":
                            tagCount++;
                            if (
                                !data.equals("amb") && !data.equals("blu") && !data.equals("brn") && 
                                !data.equals("gry") && !data.equals("grn") && !data.equals("hzl") &&
                                !data.equals("oth")
                            ) {
                                isValidPassport = false;
                            }
                            break;
                            
                        case "pid":
                            tagCount++;
                            if (!data.matches("[0-9]{9}")) {
                                isValidPassport = false;
                            }
                            break;
                    }
                }
            }
            
            if (isValidPassport && tagCount == 7) {
                validCount++;
            }
        }
        
        return validCount;
    }
    
    public static void test () {
        System.out.println("-------");
        System.out.println(" TESTS ");
        System.out.println("-------");
        
        // countValidPassports() test.
        String passports =  
            "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" + 
            "byr:1937 iyr:2017 cid:147 hgt:183cm\n" + 
            "\n" + 
            "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" + 
            "hcl:#cfa07d byr:1929\n" + 
            "\n" + 
            "hcl:#ae17e1 iyr:2013\n" + 
            "eyr:2024\n" + 
            "ecl:brn pid:760753108 byr:1931\n" + 
            "hgt:179cm\n" + 
            "\n" + 
            "hcl:#cfa07d eyr:2025 pid:166559648\n" + 
            "iyr:2011 ecl:brn hgt:59in\n"
        ;
        
        int validPassportCount = countValidPassports(passports);
        System.out.println(validPassportCount + " == 2 ? => " + (validPassportCount == 2));
        
        
        // countValidPassports2() test.
        String validPassports =  
            "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n" +
            "hcl:#623a2f\n" +
            "\n" +
            "eyr:2029 ecl:blu cid:129 byr:1989\n" +
            "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\n" +
            "\n" +
            "hcl:#888785\n" +
            "hgt:164cm byr:2001 iyr:2015 cid:88\n" +
            "pid:545766238 ecl:hzl\n" +
            "eyr:2022\n" +
            "\n" + 
            "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719\n"
        ;
        
        validPassportCount = countValidPassports2(validPassports);
        System.out.println(validPassportCount + " == 4 ? => " + (validPassportCount == 4));
        
        
        String invalidPassports =  
            "eyr:1972 cid:100\n" +
            "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\n" +
            "\n" +
            "iyr:2019\n" +
            "hcl:#602927 eyr:1967 hgt:170cm\n" +
            "ecl:grn pid:012533040 byr:1946\n" +
            "\n" +
            "hcl:dab227 iyr:2012\n" +
            "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\n" + 
            "\n" +
            "hgt:59cm ecl:zzz\n" + 
            "eyr:2038 hcl:74454a iyr:2023\n" +
            "pid:3556412378 byr:2007\n"
        ;
        
        validPassportCount = countValidPassports2(invalidPassports);
        System.out.println(validPassportCount + " == 0 ? => " + (validPassportCount == 0));
        
        System.out.println();
        System.out.println();
    }
    
    
}
