import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        tests();
        
        long[] numbers = new long[] {
            8L, 
            11L, 
            27L, 
            48L, 
            5L, 
            19L, 
            18L, 
            36L, 
            3L, 
            45L, 
            22L, 
            37L, 
            46L, 
            4L, 
            31L, 
            42L, 
            39L, 
            30L, 
            41L, 
            14L, 
            40L, 
            29L, 
            43L, 
            25L, 
            6L, 
            7L, 
            28L, 
            8L, 
            52L, 
            9L, 
            49L, 
            13L, 
            20L, 
            34L, 
            10L, 
            11L, 
            12L, 
            17L, 
            15L, 
            18L, 
            53L, 
            21L, 
            16L, 
            26L, 
            19L, 
            14L, 
            54L, 
            39L, 
            22L, 
            23L, 
            24L, 
            25L, 
            27L, 
            28L, 
            29L, 
            80L, 
            33L, 
            35L, 
            30L, 
            31L, 
            72L, 
            32L, 
            34L, 
            36L, 
            37L, 
            38L, 
            48L, 
            60L, 
            47L, 
            51L, 
            41L, 
            45L, 
            49L, 
            67L, 
            50L, 
            64L, 
            62L, 
            77L, 
            57L, 
            65L, 
            66L, 
            68L, 
            71L, 
            107L, 
            108L, 
            69L, 
            70L, 
            119L, 
            73L, 
            94L, 
            79L, 
            117L, 
            86L, 
            88L, 
            90L, 
            133L, 
            202L, 
            99L, 
            116L, 
            141L, 
            122L, 
            148L, 
            218L, 
            223L, 
            131L, 
            134L, 
            137L, 
            139L, 
            258L, 
            142L, 
            155L, 
            143L, 
            152L, 
            161L, 
            263L, 
            259L, 
            219L, 
            174L, 
            178L, 
            189L, 
            420L, 
            215L, 
            221L, 
            238L, 
            261L, 
            253L, 
            393L, 
            265L, 
            440L, 
            270L, 
            271L, 
            311L, 
            482L, 
            285L, 
            294L, 
            443L, 
            295L, 
            313L, 
            335L, 
            389L, 
            367L, 
            352L, 
            363L, 
            663L, 
            810L, 
            491L, 
            526L, 
            459L, 
            572L, 
            712L, 
            629L, 
            535L, 
            565L, 
            541L, 
            660L, 
            556L, 
            832L, 
            580L, 
            579L, 
            589L, 
            648L, 
            702L, 
            1351L, 
            687L, 
            715L, 
            1000L, 
            811L, 
            952L, 
            1907L, 
            950L, 
            1239L, 
            1031L, 
            1145L, 
            1161L, 
            1076L, 
            1258L, 
            1204L, 
            1515L, 
            1121L, 
            1135L, 
            1530L, 
            1159L, 
            1168L, 
            1276L, 
            1237L, 
            1335L, 
            1389L, 
            1402L, 
            1498L, 
            1526L, 
            1761L, 
            1763L, 
            1902L, 
            1981L, 
            2026L, 
            2917L, 
            2363L, 
            2289L, 
            2197L, 
            2211L, 
            2833L, 
            2724L, 
            3546L, 
            2327L, 
            2294L, 
            2396L, 
            3448L, 
            2557L, 
            4275L, 
            3096L, 
            2737L, 
            2791L, 
            3024L, 
            3259L, 
            3960L, 
            3524L, 
            4159L, 
            3883L, 
            4007L, 
            5811L, 
            4408L, 
            4486L, 
            4500L, 
            4491L, 
            4505L, 
            8434L, 
            5118L, 
            4621L, 
            4690L, 
            4851L, 
            5844L, 
            5815L, 
            5348L, 
            6120L, 
            5528L, 
            7683L, 
            6283L, 
            7750L, 
            8697L, 
            7407L, 
            7531L, 
            7890L, 
            9029L, 
            10971L, 
            8894L, 
            10876L, 
            8991L, 
            9112L, 
            8996L, 
            10349L, 
            9472L, 
            9311L, 
            9541L, 
            10038L, 
            10199L, 
            11468L, 
            11163L, 
            11811L, 
            18423L, 
            14519L, 
            13690L, 
            18089L, 
            20474L, 
            17756L, 
            16919L, 
            15421L, 
            20057L, 
            17885L, 
            18435L, 
            17890L, 
            17987L, 
            18103L, 
            18653L, 
            18537L, 
            24557L, 
            29914L, 
            30609L, 
            19579L, 
            25459L, 
            21362L, 
            22631L, 
            45516L, 
            25501L, 
            31446L, 
            28209L, 
            29111L, 
            33856L, 
            32340L, 
            38116L, 
            33306L, 
            33311L, 
            35877L, 
            36325L, 
            66325L, 
            35993L, 
            36756L, 
            43562L, 
            43094L, 
            50877L, 
            53668L, 
            65302L, 
            40941L, 
            46821L, 
            43993L, 
            54673L, 
            86119L, 
            73725L, 
            69299L, 
            61451L, 
            57320L, 
            62417L, 
            69096L, 
            88993L, 
            71422L, 
            105176L, 
            69188L, 
            79087L, 
            72318L, 
            79555L, 
            80749L, 
            105550L, 
            131605L, 
            84035L, 
            126508L, 
            116120L, 
            119737L, 
            84934L, 
            106410L, 
            133839L, 
            205113L, 
            118771L, 
            123868L, 
            126416L, 
            141972L, 
            141504L, 
            143740L, 
            138284L, 
            140610L, 
            151873L, 
            159836L, 
            148275L, 
            151405L, 
            188438L, 
            164489L, 
            164784L, 
            224645L, 
            283704L, 
            283555L, 
            409971L, 
            191344L, 
            246153L, 
            203705L, 
            278607L, 
            311709L, 
            262511L, 
            242639L, 
            250284L, 
            264700L, 
            316189L, 
            500147L, 
            372920L, 
            278894L, 
            288885L, 
            342749L, 
            299680L, 
            453989L, 
            355833L, 
            329273L, 
            356128L, 
            368489L, 
            395049L, 
            433983L, 
            437497L, 
            618639L, 
            441628L, 
            446344L, 
            564380L, 
            579557L, 
            492923L, 
            539169L, 
            615869L, 
            711238L, 
            543594L, 
            762533L, 
            567779L, 
            578574L, 
            588565L, 
            642429L, 
            962828L, 
            628953L, 
            790111L, 
            685106L, 
            935685L, 
            1369668L, 
            763538L, 
            1122603L, 
            871480L, 
            930420L, 
            1372048L, 
            887972L, 
            1958233L, 
            1057303L, 
            1032092L, 
            1036517L, 
            1082763L, 
            1111373L, 
            1966937L, 
            2045591L, 
            1357890L, 
            1146353L, 
            2179906L, 
            1217518L, 
            1271382L, 
            1850800L, 
            1392491L, 
            1475217L, 
            2034920L, 
            1699223L, 
            2629272L, 
            1635018L, 
            2586590L, 
            2735740L, 
            3015536L, 
            3669938L, 
            1920064L, 
            2119280L, 
            2068609L, 
            3091714L, 
            2147890L, 
            2194136L, 
            2257726L, 
            2363871L, 
            2417735L, 
            5273262L, 
            2488900L, 
            3395281L, 
            3885720L, 
            2663873L, 
            4714759L, 
            2867708L, 
            3110235L, 
            6634823L, 
            3334241L, 
            3555082L, 
            4557509L, 
            5509449L, 
            5755587L, 
            5178844L, 
            4114200L, 
            3988673L, 
            4326335L, 
            5061844L, 
            4342026L, 
            4405616L, 
            6201949L, 
            5972817L, 
            4852771L, 
            4906635L, 
            5152773L, 
            6043982L, 
            8240876L, 
            6665317L, 
            5531581L, 
            6422790L, 
            9744260L, 
            6444476L, 
            8440535L, 
            7448441L, 
            9258387L, 
            8102873L, 
            8315008L, 
            11222826L, 
            8330699L, 
            12510285L, 
            9050517L, 
            8668361L, 
            8747642L, 
            9194797L, 
            9558389L, 
            10005544L, 
            9759406L, 
            10950617L, 
            10059408L, 
            10684354L, 
            18807050L, 
            11954371L, 
            11976057L, 
            15981179L, 
            16503884L, 
            14759484L, 
            14547349L, 
            15551314L, 
            15763449L, 
            17942439L, 
            16417881L, 
            16645707L, 
            16999060L, 
            24298956L, 
            19764950L, 
            17416003L, 
            18306031L, 
            18753186L, 
            18954203L, 
            20509006L, 
            29437540L, 
            21735463L, 
            20743762L, 
            26665533L, 
            25443838L, 
            40716837L, 
            23930428L, 
            26735541L, 
            29306833L, 
            48060019L, 
            30098663L, 
            34415063L, 
            39677902L, 
            33063588L, 
            33416941L, 
            37059217L, 
            33644767L, 
            35305091L, 
            46853543L, 
            35722034L, 
            36370206L, 
            37260234L, 
            37707389L, 
            39463209L, 
            42244469L, 
            54881378L, 
            42479225L, 
            44674190L, 
            60082474L, 
            49374266L, 
            50665969L, 
            53237261L, 
            56042374L, 
            68722032L, 
            63515604L, 
            63162251L, 
            66480529L, 
            76723443L, 
            70677175L, 
            69138975L, 
            68949858L, 
            69366801L, 
            71027125L, 
            86918659L, 
            72092240L, 
            82381579L, 
            74967623L, 
            77170598L, 
            107836441L, 
            98521599L, 
            102561699L, 
            95340159L, 
            123244725L, 
            114181573L, 
            100040235L, 
            103903230L, 
            123914436L, 
            126677855L, 
            139976983L, 
            197704980L, 
            164706960L, 
            139816150L, 
            167432399L, 
            141231215L, 
            213596514L, 
            143119365L, 
            140393926L, 
            145994748L, 
            147059863L, 
            152138221L, 
            172510757L, 
            238915525L, 
            216986748L, 
            193861758L, 
            195380394L, 
            268610190L, 
            199243389L, 
            246034983L, 
            230581085L, 
            226718090L, 
            227817666L, 
            250592291L, 
            346303252L, 
            279793133L, 
            291954371L, 
            280210076L, 
            465633615L, 
            281625141L, 
            315630122L, 
            283513291L, 
            409004116L, 
            345999979L, 
            341375142L, 
            299198084L, 
            367891151L, 
            485596938L, 
            477375049L, 
            514645173L, 
            422098484L, 
            394623783L, 
            425961479L, 
            458398751L, 
            454535756L, 
            992020222L, 
            477310381L, 
            591967433L, 
            530385424L, 
            560003209L, 
            923649289L, 
            573579512L, 
            565138432L, 
            580823225L, 
            774028873L, 
            760823672L, 
            582711375L, 
            721296568L, 
            640573226L, 
            667089235L, 
            693821867L, 
            907695422L, 
            1506360664L, 
            816722267L, 
            871934164L, 
            820585262L, 
            1008672854L, 
            880497235L, 
            1023537183L, 
            756008079L, 
            1334403184L, 
            1007695805L, 
            1090388633L, 
            1095523856L, 
            1125141641L, 
            1138717944L, 
            1145961657L, 
            1223284601L, 
            2108432057L, 
            1249800610L, 
            1276533242L, 
            1307662461L, 
            1334395093L, 
            2090411263L, 
            1360911102L, 
            1449829946L, 
            1572730346L, 
            2181496364L, 
            1828281067L, 
            1576593341L, 
            1966546919L, 
            1636505314L, 
            1763703884L, 
            1779545262L, 
            1846396712L, 
            2098084438L, 
            2132837446L, 
            2271103298L, 
            3404874408L, 
            2263859585L, 
            3401011413L, 
            2369246258L, 
            3540392827L, 
            4477678315L, 
            2849263588L, 
            2584195703L, 
            3274209380L, 
            2937504443L, 
            4977604754L, 
            3730157360L, 
            3022560292L, 
            3416050576L, 
            3213098655L, 
            3340297225L, 
            3356138603L, 
            3400209198L, 
            3482902026L, 
            3610100596L, 
            3912382708L, 
            4369187736L, 
            5638477265L, 
            5484201953L, 
            5113123173L, 
            7376982758L, 
            7769396934L, 
            6477897270L, 
            4953441961L, 
            5433459291L, 
            5606755995L, 
            5960064735L, 
            6740506423L, 
            6211713823L, 
            6150603098L, 
            7391748028L, 
            8824499178L, 
            6235658947L, 
            6966239199L, 
            7395284734L, 
            6696435828L, 
            6839040629L, 
            6883111224L, 
            9025505881L, 
            7522483304L, 
            8281570444L, 
            9322629697L, 
            11104045059L, 
            10066565134L, 
            10386901252L, 
            11040215286L, 
            15800526967L, 
            10560197956L, 
            13201898146L, 
            11393524026L, 
            15804053748L, 
            12110667833L, 
            12362316921L, 
            13033714322L, 
            25126683445L, 
            40930737193L, 
            12932094775L, 
            13074699576L, 
            13535476457L, 
            19916825546L, 
            14405594528L, 
            14361523933L, 
            27436223509L, 
            21483468590L, 
            22643094377L, 
            17604200141L, 
            19389194831L, 
            20453466386L, 
            20626763090L, 
            21953721982L, 
            21600413242L, 
            25564215067L, 
            22922514877L, 
            23504191859L, 
            31139676598L, 
            24472984754L, 
            26610176033L, 
            25294411696L, 
            26006794351L, 
            26467571232L, 
            27293618708L, 
            33988942843L, 
            27480294104L, 
            46682813539L, 
            28767118461L, 
            31965724074L, 
            33750718764L, 
            36993394972L, 
            40015957921L, 
            38230963231L, 
            38057666527L, 
            46190978157L, 
            41080229476L, 
            42227176332L, 
            43554135224L, 
            50479779105L, 
            61469236947L, 
            52474365583L, 
            47977176613L, 
            49767396450L, 
            51766603462L, 
            77773397813L, 
            51301206047L, 
            53300413059L, 
            111949016052L, 
            54773912812L, 
            68959119046L, 
            94701541915L, 
            60732842535L, 
            90495737026L, 
            65716442838L, 
            98790509062L, 
            75051061499L, 
            89783354371L, 
            76288629758L, 
            79137896003L, 
            84634364700L, 
            83307405808L, 
            85781311556L, 
            155503151276L, 
            112034048582L, 
            121433484629L, 
            133074802258L, 
            189286246088L, 
            101068602497L, 
            183424873762L, 
            126352267546L, 
            104601619106L, 
            120490355650L, 
            115506755347L, 
            123733031858L, 
            126449285373L, 
            144040248343L, 
            191795385105L, 
            241923840279L, 
            180206498500L, 
            159685426199L, 
            155426525761L, 
            344789397364L, 
            159596035566L, 
            162445301811L, 
            167941770508L, 
            169088717364L, 
            220108374453L, 
            205670221603L, 
            298931629109L, 
            216575357844L, 
            221558958147L, 
            235997110997L, 
            319281461765L, 
            225091974756L, 
            356487466647L, 
            228334650964L, 
            422245579447L, 
            239239787205L, 
            250182317231L, 
            270489533716L, 
            299466774104L, 
            315022561327L, 
            384004259958L, 
            315111951960L, 
            317871827572L, 
            322041337377L, 
            598398403213L, 
            569421162825L, 
            330387072319L, 
            535130935780L, 
            468020346473L, 
            425778596056L, 
            427229179750L, 
            441667332600L, 
            438134315991L, 
            464331761961L, 
            475236898202L, 
            742341131710L, 
            453426625720L, 
            498824184680L, 
            467574438169L, 
            580569389550L, 
            489422104436L, 
            811463441813L, 
            1002705373949L, 
            614489335431L, 
            645499024279L, 
            632983779532L, 
            757616252069L, 
            820865522057L, 
            652428409696L, 
            863912912047L, 
            890110358017L, 
            910956461869L, 
            865363495741L, 
            853007775806L, 
            1108220677734L, 
            952250810400L, 
            879801648591L, 
            1082063773600L, 
            917758387681L, 
            1105855035416L, 
            921001063889L, 
            1113313520111L, 
            1113073462448L, 
            1353335016483L, 
            1433577165356L, 
            1103911439867L, 
            1266917745127L, 
            1247473114963L, 
            1285412189228L, 
            1516341321743L, 
            1410044661765L, 
            1532230058287L, 
            1832052458991L, 
            1505436185502L, 
            2132281240868L, 
            1718371271547L, 
            1732809424397L, 
            1745165144332L, 
            1770766163487L, 
            2360786635074L, 
            1797560036272L, 
            1800802712480L, 
            2185975213467L, 
            2030831850129L, 
            2024912503756L, 
            2331045725654L, 
            2466408478931L, 
            2360546577411L, 
            2351384554830L, 
            3234379877836L, 
            2992638259295L, 
            2980282539360L, 
            2532885304191L, 
            2695456850993L, 
            3277395202619L, 
            2915480847267L, 
            3223807457049L, 
            3238245609899L, 
            3515931307819L, 
            3463536415879L, 
            3918784637864L, 
            3530369460669L, 
            3542725180604L, 
            3568326199759L, 
            3598362748752L, 
            3822472540028L, 
            7352842000697L, 
            5567637684360L, 
            4726288701122L, 
            4355958229410L, 
            5972920798655L, 
            7084257507578L, 
            4711931132241L, 
            5448366151458L, 
            5228342155184L, 
            5513167843551L, 
            5610937698260L, 
            5756692761240L, 
            7060718149927L, 
            7111051380363L, 
            6139288304316L, 
            8175467548120L, 
            9211166408554L, 
            14439508563738L, 
            10883190689955L, 
            9209300447012L, 
            7073094641273L, 
            7141087929356L, 
            8796668354943L, 
            7420835288780L, 
            8178430769438L, 
            10337226399382L, 
            11776793518190L, 
            12301436796457L, 
            9067889361651L, 
            10160297283699L, 
            10468623893481L, 
            9940273287425L, 
            10676708306642L, 
            13932160309360L, 
            11124105541811L, 
            11367630459500L, 
            11895981065556L, 
            13250339684679L, 
            15596302836900L, 
            15251525410711L, 
            14214182570629L, 
            19265292248424L, 
            25299790768860L, 
            15319518698794L, 
            18647054662919L, 
            14493929930053L, 
            14561923218136L, 
            15599266058218L, 
            20805850292863L, 
            23190612972104L, 
            20844682879841L, 
            19744597668293L, 
            26110163636185L, 
            30161189276354L, 
            20100570571124L, 
            20408897180906L, 
            28426090239413L, 
            22491736001311L, 
            23020086607367L, 
            24617970144179L, 
            26389910995609L, 
            25146320750235L, 
            29745455340764L, 
            34584810947218L, 
            29055853148189L, 
            28708112500682L, 
            29813448628847L, 
            50154352521670L, 
            34306520886429L, 
            49464750329095L, 
            60416684522614L, 
            35699836629342L, 
            35343863726511L, 
            39845168239417L, 
            40153494849199L, 
            51446176846780L, 
            70284647576560L, 
            64330266287982L, 
            59558903969611L, 
            45246891321359L, 
            46798808176515L, 
            45511822608678L, 
            47109706145490L, 
            65299815599434L, 
            85752697733209L, 
            95666175130348L, 
            94143714916829L, 
            57763965648871L, 
            114764565928529L, 
            70006357515771L
        };
        
        long number = getFirstNumberNotInPattern(numbers, 25);
        System.out.println(number);
        
        long[] minMax = getContiguousSetThatAdds(numbers, number);
        long sum = minMax[0] + minMax[1];
        System.out.println(sum);
    }
    
    
    public static long getFirstNumberNotInPattern (long[] numbers, int preambleSize) throws Exception {
        for (int i = preambleSize; i < numbers.length; i++) {
            boolean inPattern = false;
            
            for (int j = i - preambleSize; j < i - 1; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (numbers[j] + numbers[k] == numbers[i]) {
                        inPattern = true;
                        break;
                    }
                }
            }
            
            if (!inPattern) {
                return numbers[i];
            }
        }
        
        throw new Exception("Number not found.");
    }
    
    // FIXME.
    public static long[] getContiguousSetThatAdds (long[] numbers, long number) throws Exception {
        for (int i = 0; i < numbers.length - 1; i++) {
            long min = numbers[i];
            long max = numbers[i];
            
            long sum = numbers[i];
            int j = i + 1;
            
            while (j < numbers.length) {
                sum += numbers[j];
                
                min = Math.min(min, numbers[j]);
                max = Math.min(max, numbers[j]);
                
                if (sum > number) {
                    j = numbers.length;
                    break;
                } else if (sum == number) {
                    break;
                }
                
                j++;
            }
                
            if (j < numbers.length) {
                return new long[] { min, max };
            }
        }
        
        throw new Exception("Contiguous set not found.");
    }
    
    
    public static void tests () throws Exception {
        System.out.println("-------");
        System.out.println(" TESTS ");
        System.out.println("-------");
        
        long[] numbers = new long[] {
            35L,
            20L,
            15L,
            25L,
            47L,
            40L,
            62L,
            55L,
            65L,
            95L,
            102L,
            117L,
            150L,
            182L,
            127L,
            219L,
            299L,
            277L,
            309L,
            576L
        };
        
        long number = getFirstNumberNotInPattern(numbers, 5);
        System.out.println(number + " == 127 ? => " + (number == 127));
        
        long[] minMax = getContiguousSetThatAdds(numbers, number);
        long sum = minMax[0] + minMax[1];
        System.out.println(sum + " == 62 ? => " + (sum == 62));
        
        System.out.println();
        System.out.println();
    }
    
    
}
