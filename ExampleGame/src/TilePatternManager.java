import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TilePatternManager {//타일 패턴 입력하는 곳
    private HashMap<String, List<TileBeat>> patterns;

    public TilePatternManager() {
        patterns = new HashMap<>();
        initializePatterns();
    }

    private void initializePatterns() {
        //패턴 추가
    	// 1. Firefly
        List<TileBeat> song1Pattern = new ArrayList<>();
        song1Pattern.add(new TileBeat(500, 3));
        song1Pattern.add(new TileBeat(3000, 1));
        /*
        song1Pattern.add(new TileBeat(5800, 0));
        song1Pattern.add(new TileBeat(80000, 3));
        song1Pattern.add(new TileBeat(10500, 3));
        song1Pattern.add(new TileBeat(13000, 1));
        song1Pattern.add(new TileBeat(15000, 0));
        song1Pattern.add(new TileBeat(18000, 2));
        song1Pattern.add(new TileBeat(20500, 0));
        song1Pattern.add(new TileBeat(22500, 3));
        song1Pattern.add(new TileBeat(24000, 2));
        song1Pattern.add(new TileBeat(25000, 1));
        song1Pattern.add(new TileBeat(28000, 0));
        song1Pattern.add(new TileBeat(30000, 2));
        song1Pattern.add(new TileBeat(34000, 2));
        song1Pattern.add(new TileBeat(40000, 0));
        song1Pattern.add(new TileBeat(41000, 0));
        song1Pattern.add(new TileBeat(45000, 3));
        song1Pattern.add(new TileBeat(47000, 3));
        song1Pattern.add(new TileBeat(50000, 1));
        song1Pattern.add(new TileBeat(52000, 1));
        song1Pattern.add(new TileBeat(54000, 0));
        song1Pattern.add(new TileBeat(55500, 1));
        song1Pattern.add(new TileBeat(56000, 2));
        song1Pattern.add(new TileBeat(57000, 3));
        song1Pattern.add(new TileBeat(60000, 0));
        song1Pattern.add(new TileBeat(60000, 1));
        song1Pattern.add(new TileBeat(60000, 2));
        song1Pattern.add(new TileBeat(60000, 3));
        song1Pattern.add(new TileBeat(61500, 0));
        song1Pattern.add(new TileBeat(61500, 3));
        song1Pattern.add(new TileBeat(65000, 1));
        song1Pattern.add(new TileBeat(65000, 2));
        song1Pattern.add(new TileBeat(66800, 2));
        song1Pattern.add(new TileBeat(66800, 3));
        song1Pattern.add(new TileBeat(69800, 0));
        song1Pattern.add(new TileBeat(69800, 1));
        song1Pattern.add(new TileBeat(72000, 1));
        song1Pattern.add(new TileBeat(72000, 2));
        song1Pattern.add(new TileBeat(74500, 2));
        song1Pattern.add(new TileBeat(74500, 3));
        song1Pattern.add(new TileBeat(82000, 0));
        song1Pattern.add(new TileBeat(84800, 1));
        song1Pattern.add(new TileBeat(90000, 2));
        song1Pattern.add(new TileBeat(95300, 3));
        song1Pattern.add(new TileBeat(99800, 3));
        song1Pattern.add(new TileBeat(99800, 2));
        song1Pattern.add(new TileBeat(99800, 1));
        song1Pattern.add(new TileBeat(101500, 0));
        song1Pattern.add(new TileBeat(101500, 1));
        song1Pattern.add(new TileBeat(101500, 2));
        song1Pattern.add(new TileBeat(104500, 0));
        song1Pattern.add(new TileBeat(104500, 1));
        song1Pattern.add(new TileBeat(104500, 3));
        song1Pattern.add(new TileBeat(106800, 0));
        song1Pattern.add(new TileBeat(106800, 1));
        song1Pattern.add(new TileBeat(106800, 3));
        song1Pattern.add(new TileBeat(109000, 0));
        song1Pattern.add(new TileBeat(109000, 1));
        song1Pattern.add(new TileBeat(111800, 2));
        song1Pattern.add(new TileBeat(111800, 3));
        song1Pattern.add(new TileBeat(114000, 1));
        song1Pattern.add(new TileBeat(114000, 2));
        song1Pattern.add(new TileBeat(116000, 0));
        song1Pattern.add(new TileBeat(116000, 3));
        song1Pattern.add(new TileBeat(118000, 0));
        song1Pattern.add(new TileBeat(118000, 1));
        song1Pattern.add(new TileBeat(118000, 2));
        song1Pattern.add(new TileBeat(118000, 3));
        song1Pattern.add(new TileBeat(120700, 0));
        song1Pattern.add(new TileBeat(120700, 1));
        song1Pattern.add(new TileBeat(120700, 2));
        song1Pattern.add(new TileBeat(120700, 3));
        song1Pattern.add(new TileBeat(124000, 0));
        song1Pattern.add(new TileBeat(124000, 2));
        song1Pattern.add(new TileBeat(125700, 1));
        song1Pattern.add(new TileBeat(125700, 3));
        song1Pattern.add(new TileBeat(129000, 0));
        song1Pattern.add(new TileBeat(129000, 3));
        song1Pattern.add(new TileBeat(132000, 1));
        song1Pattern.add(new TileBeat(132000, 2));
        song1Pattern.add(new TileBeat(140000, 0));
        song1Pattern.add(new TileBeat(140000, 1));
        song1Pattern.add(new TileBeat(140000, 2));
        song1Pattern.add(new TileBeat(140000, 3));
        song1Pattern.add(new TileBeat(144000, 0));
        song1Pattern.add(new TileBeat(144000, 1));
        song1Pattern.add(new TileBeat(144000, 2));
        song1Pattern.add(new TileBeat(144000, 3));
        song1Pattern.add(new TileBeat(145000, 0));
        song1Pattern.add(new TileBeat(145000, 1));
        song1Pattern.add(new TileBeat(145000, 2));
        song1Pattern.add(new TileBeat(145000, 3));
        song1Pattern.add(new TileBeat(149000, 0));
        song1Pattern.add(new TileBeat(149000, 1));
        song1Pattern.add(new TileBeat(149500, 2));
        song1Pattern.add(new TileBeat(149500, 3));
        song1Pattern.add(new TileBeat(150700, 0));
        song1Pattern.add(new TileBeat(150700, 1));
        song1Pattern.add(new TileBeat(151200, 2));
        song1Pattern.add(new TileBeat(151200, 3));
        song1Pattern.add(new TileBeat(155000, 0));
        song1Pattern.add(new TileBeat(155000, 3));
        song1Pattern.add(new TileBeat(156000, 1));
        song1Pattern.add(new TileBeat(156000, 2));
        song1Pattern.add(new TileBeat(157000, 1));
        song1Pattern.add(new TileBeat(157000, 2));
        song1Pattern.add(new TileBeat(158000, 0));
        song1Pattern.add(new TileBeat(158000, 3));
        song1Pattern.add(new TileBeat(159000, 0));
        song1Pattern.add(new TileBeat(159000, 1));
        song1Pattern.add(new TileBeat(159000, 2));
        song1Pattern.add(new TileBeat(159000, 3));
        song1Pattern.add(new TileBeat(160700, 0));
        song1Pattern.add(new TileBeat(160700, 1));
        song1Pattern.add(new TileBeat(160700, 2));
        song1Pattern.add(new TileBeat(163700, 1));
        song1Pattern.add(new TileBeat(163700, 2));
        song1Pattern.add(new TileBeat(163700, 3));
        song1Pattern.add(new TileBeat(166700, 0));
        song1Pattern.add(new TileBeat(166700, 2));
        song1Pattern.add(new TileBeat(166700, 3));
        song1Pattern.add(new TileBeat(168700, 0));
        song1Pattern.add(new TileBeat(168700, 1));
        song1Pattern.add(new TileBeat(168700, 3));
        song1Pattern.add(new TileBeat(171000, 0));
        song1Pattern.add(new TileBeat(173700, 3));
        song1Pattern.add(new TileBeat(175700, 1));
        song1Pattern.add(new TileBeat(176700, 2));
        song1Pattern.add(new TileBeat(179000, 0));
        song1Pattern.add(new TileBeat(179000, 1));
        song1Pattern.add(new TileBeat(179000, 2));
        song1Pattern.add(new TileBeat(179000, 3));
        song1Pattern.add(new TileBeat(179500, 0));
        song1Pattern.add(new TileBeat(179500, 1));
        song1Pattern.add(new TileBeat(179500, 2));
        song1Pattern.add(new TileBeat(179500, 3));
        */
        // 추가 타일 비트
        patterns.put("src/resources/Firefly.wav", song1Pattern);
        
        // 2. Lemon
        List<TileBeat> song2Pattern = new ArrayList<>();
        song2Pattern.add(new TileBeat(500, 2));
        song2Pattern.add(new TileBeat(1000, 0));
        song2Pattern.add(new TileBeat(1500, 3));
        song2Pattern.add(new TileBeat(2000, 1));
        song2Pattern.add(new TileBeat(2500, 2));
        song2Pattern.add(new TileBeat(3000, 2));
        song2Pattern.add(new TileBeat(3500, 0));
        song2Pattern.add(new TileBeat(4000, 0));
        song2Pattern.add(new TileBeat(4500, 3));
        song2Pattern.add(new TileBeat(5000, 1));
        song2Pattern.add(new TileBeat(5500, 1));
        song2Pattern.add(new TileBeat(6000, 2));
        song2Pattern.add(new TileBeat(6500, 3));
        song2Pattern.add(new TileBeat(7000, 3));
        song2Pattern.add(new TileBeat(7500, 0));
        song2Pattern.add(new TileBeat(8000, 1));
        song2Pattern.add(new TileBeat(8500, 1));
        song2Pattern.add(new TileBeat(9000, 2));
        song2Pattern.add(new TileBeat(9500, 3));
        song2Pattern.add(new TileBeat(10000, 0));
        song2Pattern.add(new TileBeat(10500, 0));
        song2Pattern.add(new TileBeat(11000, 2));
        song2Pattern.add(new TileBeat(11500, 2));
        song2Pattern.add(new TileBeat(12000, 3));
        song2Pattern.add(new TileBeat(12500, 1));
        song2Pattern.add(new TileBeat(13000, 3));
        song2Pattern.add(new TileBeat(13500, 0));
        song2Pattern.add(new TileBeat(14000, 1));
        song2Pattern.add(new TileBeat(14500, 3));
        song2Pattern.add(new TileBeat(15000, 2));
        song2Pattern.add(new TileBeat(15500, 2));
        song2Pattern.add(new TileBeat(16000, 1));
        song2Pattern.add(new TileBeat(16500, 0));
        song2Pattern.add(new TileBeat(17000, 3));
        song2Pattern.add(new TileBeat(17500, 3));
        song2Pattern.add(new TileBeat(18000, 1));
        song2Pattern.add(new TileBeat(18500, 0));
        song2Pattern.add(new TileBeat(19000, 2));
        song2Pattern.add(new TileBeat(19500, 2));
        song2Pattern.add(new TileBeat(20000, 1));
        song2Pattern.add(new TileBeat(20500, 3));
        song2Pattern.add(new TileBeat(21000, 0));
        song2Pattern.add(new TileBeat(21500, 1));
        song2Pattern.add(new TileBeat(22000, 2));
        song2Pattern.add(new TileBeat(22500, 0));
        song2Pattern.add(new TileBeat(23000, 3));
        song2Pattern.add(new TileBeat(23500, 0));
        song2Pattern.add(new TileBeat(24000, 1));
        song2Pattern.add(new TileBeat(24500, 3));
        song2Pattern.add(new TileBeat(25000, 1));
        song2Pattern.add(new TileBeat(25500, 2));
        song2Pattern.add(new TileBeat(26000, 2));
        song2Pattern.add(new TileBeat(26500, 0));
        song2Pattern.add(new TileBeat(27000, 0));
        song2Pattern.add(new TileBeat(27500, 3));
        song2Pattern.add(new TileBeat(28000, 1));
        song2Pattern.add(new TileBeat(28500, 2));
        song2Pattern.add(new TileBeat(29000, 3));
        song2Pattern.add(new TileBeat(29500, 1));
        song2Pattern.add(new TileBeat(30000, 0));
        song2Pattern.add(new TileBeat(30500, 3));
        song2Pattern.add(new TileBeat(31000, 2));
        song2Pattern.add(new TileBeat(31500, 3));
        song2Pattern.add(new TileBeat(32000, 1));
        song2Pattern.add(new TileBeat(32500, 2));
        song2Pattern.add(new TileBeat(33000, 0));
        song2Pattern.add(new TileBeat(33500, 1));
        song2Pattern.add(new TileBeat(34000, 3));
        song2Pattern.add(new TileBeat(34500, 0));
        song2Pattern.add(new TileBeat(35000, 3));
        song2Pattern.add(new TileBeat(35500, 2));
        song2Pattern.add(new TileBeat(36000, 1));
        song2Pattern.add(new TileBeat(36500, 0));
        song2Pattern.add(new TileBeat(37000, 2));
        song2Pattern.add(new TileBeat(37500, 1));
        song2Pattern.add(new TileBeat(38000, 0));
        song2Pattern.add(new TileBeat(38500, 3));
        song2Pattern.add(new TileBeat(39000, 2));
        song2Pattern.add(new TileBeat(39500, 1));
        song2Pattern.add(new TileBeat(40000, 3));
        song2Pattern.add(new TileBeat(40500, 2));
        song2Pattern.add(new TileBeat(41000, 3));
        song2Pattern.add(new TileBeat(41500, 1));
        song2Pattern.add(new TileBeat(42000, 3));
        song2Pattern.add(new TileBeat(42500, 2));
        song2Pattern.add(new TileBeat(43000, 1));
        song2Pattern.add(new TileBeat(43500, 0));
        song2Pattern.add(new TileBeat(44000, 2));
        song2Pattern.add(new TileBeat(44500, 3));
        song2Pattern.add(new TileBeat(45000, 1));
        song2Pattern.add(new TileBeat(45500, 0));
        song2Pattern.add(new TileBeat(46000, 3));
        song2Pattern.add(new TileBeat(46500, 1));
        song2Pattern.add(new TileBeat(47000, 2));
        song2Pattern.add(new TileBeat(47500, 0));
        song2Pattern.add(new TileBeat(48000, 3));
        song2Pattern.add(new TileBeat(48500, 1));
        song2Pattern.add(new TileBeat(49000, 2));
        song2Pattern.add(new TileBeat(49500, 0));
        song2Pattern.add(new TileBeat(50000, 1));
        song2Pattern.add(new TileBeat(50500, 3));
        song2Pattern.add(new TileBeat(51000, 2));
        song2Pattern.add(new TileBeat(51500, 0));
        song2Pattern.add(new TileBeat(52000, 1));
        song2Pattern.add(new TileBeat(52500, 3));
        song2Pattern.add(new TileBeat(53000, 2));
        song2Pattern.add(new TileBeat(53500, 0));
        song2Pattern.add(new TileBeat(54000, 3));
        song2Pattern.add(new TileBeat(54500, 1));
        song2Pattern.add(new TileBeat(55000, 2));
        song2Pattern.add(new TileBeat(55500, 0));
        song2Pattern.add(new TileBeat(56000, 3));
        song2Pattern.add(new TileBeat(56500, 2));
        song2Pattern.add(new TileBeat(57000, 1));
        song2Pattern.add(new TileBeat(57500, 0));
        song2Pattern.add(new TileBeat(58000, 2));
        song2Pattern.add(new TileBeat(58500, 3));
        song2Pattern.add(new TileBeat(59000, 1));
        song2Pattern.add(new TileBeat(59500, 0));
        song2Pattern.add(new TileBeat(60000, 3));
        song2Pattern.add(new TileBeat(60500, 2));
        song2Pattern.add(new TileBeat(61000, 1));
        song2Pattern.add(new TileBeat(61500, 0));
        song2Pattern.add(new TileBeat(62000, 3));
        song2Pattern.add(new TileBeat(62500, 1));
        song2Pattern.add(new TileBeat(63000, 2));
        song2Pattern.add(new TileBeat(63500, 0));
        song2Pattern.add(new TileBeat(64000, 3));
        song2Pattern.add(new TileBeat(64500, 1));
        song2Pattern.add(new TileBeat(65000, 2));
        song2Pattern.add(new TileBeat(65500, 0));
        song2Pattern.add(new TileBeat(66000, 3));
        song2Pattern.add(new TileBeat(66500, 2));
        song2Pattern.add(new TileBeat(67000, 1));
        song2Pattern.add(new TileBeat(67500, 0));
        song2Pattern.add(new TileBeat(68000, 2));
        song2Pattern.add(new TileBeat(68500, 3));
        song2Pattern.add(new TileBeat(69000, 1));
        song2Pattern.add(new TileBeat(69500, 0));
        song2Pattern.add(new TileBeat(70000, 3));
        song2Pattern.add(new TileBeat(70500, 2));
        song2Pattern.add(new TileBeat(71000, 1));
        song2Pattern.add(new TileBeat(71500, 0));
        song2Pattern.add(new TileBeat(72000, 3));
        song2Pattern.add(new TileBeat(72500, 1));
        song2Pattern.add(new TileBeat(73000, 2));
        song2Pattern.add(new TileBeat(73500, 0));
        song2Pattern.add(new TileBeat(74000, 3));
        song2Pattern.add(new TileBeat(74500, 1));
        song2Pattern.add(new TileBeat(75000, 2));
        song2Pattern.add(new TileBeat(75500, 0));
        song2Pattern.add(new TileBeat(76000, 3));
        song2Pattern.add(new TileBeat(76500, 2));
        song2Pattern.add(new TileBeat(77000, 1));
        song2Pattern.add(new TileBeat(77500, 0));
        song2Pattern.add(new TileBeat(78000, 2));
        song2Pattern.add(new TileBeat(78500, 3));
        song2Pattern.add(new TileBeat(79000, 1));
        song2Pattern.add(new TileBeat(79500, 0));
        song2Pattern.add(new TileBeat(80000, 3));
        song2Pattern.add(new TileBeat(80500, 2));
        song2Pattern.add(new TileBeat(81000, 1));
        song2Pattern.add(new TileBeat(81500, 0));
        song2Pattern.add(new TileBeat(82000, 3));
        song2Pattern.add(new TileBeat(82500, 1));
        song2Pattern.add(new TileBeat(83000, 2));
        song2Pattern.add(new TileBeat(83500, 0));
        song2Pattern.add(new TileBeat(84000, 3));
        song2Pattern.add(new TileBeat(84500, 2));
        song2Pattern.add(new TileBeat(85000, 1));
        song2Pattern.add(new TileBeat(85500, 0));
        song2Pattern.add(new TileBeat(86000, 3));
        song2Pattern.add(new TileBeat(86500, 1));
        song2Pattern.add(new TileBeat(87000, 2));
        song2Pattern.add(new TileBeat(87500, 0));
        song2Pattern.add(new TileBeat(88000, 3));
        song2Pattern.add(new TileBeat(88500, 2));
        song2Pattern.add(new TileBeat(89000, 1));
        song2Pattern.add(new TileBeat(89500, 0));
        song2Pattern.add(new TileBeat(90000, 3));
        song2Pattern.add(new TileBeat(90500, 2));
        song2Pattern.add(new TileBeat(91000, 1));
        song2Pattern.add(new TileBeat(91500, 0));
        song2Pattern.add(new TileBeat(92000, 3));
        song2Pattern.add(new TileBeat(92500, 1));
        song2Pattern.add(new TileBeat(93000, 2));
        song2Pattern.add(new TileBeat(93500, 0));
        song2Pattern.add(new TileBeat(94000, 3));
        song2Pattern.add(new TileBeat(94500, 1));
        song2Pattern.add(new TileBeat(95000, 2));
        song2Pattern.add(new TileBeat(95500, 0));
        song2Pattern.add(new TileBeat(96000, 3));
        song2Pattern.add(new TileBeat(96500, 2));
        song2Pattern.add(new TileBeat(97000, 1));
        song2Pattern.add(new TileBeat(97500, 0));
        song2Pattern.add(new TileBeat(98000, 2));
        song2Pattern.add(new TileBeat(98500, 3));
        song2Pattern.add(new TileBeat(99000, 1));
        song2Pattern.add(new TileBeat(99500, 0));
        song2Pattern.add(new TileBeat(100000, 3));
        song2Pattern.add(new TileBeat(100500, 2));
        song2Pattern.add(new TileBeat(101000, 1));
        song2Pattern.add(new TileBeat(101500, 0));
        song2Pattern.add(new TileBeat(102000, 3));
        song2Pattern.add(new TileBeat(102500, 1));
        song2Pattern.add(new TileBeat(103000, 2));
        song2Pattern.add(new TileBeat(103500, 0));
        song2Pattern.add(new TileBeat(104000, 3));
        song2Pattern.add(new TileBeat(104500, 1));
        song2Pattern.add(new TileBeat(105000, 2));
        song2Pattern.add(new TileBeat(105500, 0));
        song2Pattern.add(new TileBeat(106000, 3));
        song2Pattern.add(new TileBeat(106500, 2));
        song2Pattern.add(new TileBeat(107000, 1));
        song2Pattern.add(new TileBeat(107500, 0));
        song2Pattern.add(new TileBeat(108000, 3));
        song2Pattern.add(new TileBeat(108500, 1));
        song2Pattern.add(new TileBeat(109000, 2));
        song2Pattern.add(new TileBeat(109500, 0));
        song2Pattern.add(new TileBeat(110000, 3));
        song2Pattern.add(new TileBeat(110500, 1));
        song2Pattern.add(new TileBeat(111000, 2));
        song2Pattern.add(new TileBeat(111500, 0));
        song2Pattern.add(new TileBeat(112000, 3));
        song2Pattern.add(new TileBeat(112500, 1));
        song2Pattern.add(new TileBeat(113000, 2));
        song2Pattern.add(new TileBeat(113500, 0));
        song2Pattern.add(new TileBeat(114000, 3));
        song2Pattern.add(new TileBeat(114500, 1));
        song2Pattern.add(new TileBeat(115000, 2));
        song2Pattern.add(new TileBeat(115500, 0));
        song2Pattern.add(new TileBeat(116000, 3));
        song2Pattern.add(new TileBeat(116500, 1));
        song2Pattern.add(new TileBeat(117000, 2));
        song2Pattern.add(new TileBeat(117500, 0));
        song2Pattern.add(new TileBeat(118000, 3));
        song2Pattern.add(new TileBeat(118500, 2));
        song2Pattern.add(new TileBeat(119000, 1));
        song2Pattern.add(new TileBeat(119500, 0));
        song2Pattern.add(new TileBeat(120000, 3));
        song2Pattern.add(new TileBeat(120500, 2));
        song2Pattern.add(new TileBeat(121000, 1));
        song2Pattern.add(new TileBeat(121500, 0));
        song2Pattern.add(new TileBeat(122000, 3));
        song2Pattern.add(new TileBeat(122500, 1));
        song2Pattern.add(new TileBeat(123000, 2));
        song2Pattern.add(new TileBeat(123500, 0));
        song2Pattern.add(new TileBeat(124000, 3));
        song2Pattern.add(new TileBeat(124500, 1));
        song2Pattern.add(new TileBeat(125000, 2));
        song2Pattern.add(new TileBeat(125500, 0));
        song2Pattern.add(new TileBeat(126000, 3));
        song2Pattern.add(new TileBeat(126500, 1));
        song2Pattern.add(new TileBeat(127000, 2));
        song2Pattern.add(new TileBeat(127500, 0));
        song2Pattern.add(new TileBeat(128000, 3));
        song2Pattern.add(new TileBeat(128500, 1));
        song2Pattern.add(new TileBeat(129000, 2));
        song2Pattern.add(new TileBeat(129500, 0));
        song2Pattern.add(new TileBeat(130000, 3));
        song2Pattern.add(new TileBeat(130500, 2));
        song2Pattern.add(new TileBeat(131000, 1));
        song2Pattern.add(new TileBeat(131500, 0));
        song2Pattern.add(new TileBeat(132000, 3));
        song2Pattern.add(new TileBeat(132500, 1));
        song2Pattern.add(new TileBeat(133000, 2));
        song2Pattern.add(new TileBeat(133500, 0));
        song2Pattern.add(new TileBeat(134000, 3));
        song2Pattern.add(new TileBeat(134500, 1));
        song2Pattern.add(new TileBeat(135000, 2));
        song2Pattern.add(new TileBeat(135500, 0));
        song2Pattern.add(new TileBeat(136000, 3));
        song2Pattern.add(new TileBeat(136500, 2));
        song2Pattern.add(new TileBeat(137000, 1));
        song2Pattern.add(new TileBeat(137500, 0));
        song2Pattern.add(new TileBeat(138000, 3));
        song2Pattern.add(new TileBeat(138500, 1));
        song2Pattern.add(new TileBeat(139000, 2));
        song2Pattern.add(new TileBeat(139500, 0));
        song2Pattern.add(new TileBeat(140000, 3));
        song2Pattern.add(new TileBeat(140500, 2));
        song2Pattern.add(new TileBeat(141000, 1));
        song2Pattern.add(new TileBeat(141500, 0));
        song2Pattern.add(new TileBeat(142000, 2));
        song2Pattern.add(new TileBeat(142500, 0));
        song2Pattern.add(new TileBeat(143000, 3));
        song2Pattern.add(new TileBeat(143500, 1));
        song2Pattern.add(new TileBeat(144000, 2));
        song2Pattern.add(new TileBeat(144500, 3));
        song2Pattern.add(new TileBeat(145000, 0));
        song2Pattern.add(new TileBeat(145500, 1));
        song2Pattern.add(new TileBeat(146000, 2));
        song2Pattern.add(new TileBeat(146500, 3));
        song2Pattern.add(new TileBeat(147000, 1));
        song2Pattern.add(new TileBeat(147500, 0));
        song2Pattern.add(new TileBeat(148000, 2));
        song2Pattern.add(new TileBeat(148500, 3));
        song2Pattern.add(new TileBeat(149000, 1));
        song2Pattern.add(new TileBeat(149500, 0));
        song2Pattern.add(new TileBeat(150000, 3));
        song2Pattern.add(new TileBeat(150500, 2));
        song2Pattern.add(new TileBeat(151000, 1));
        song2Pattern.add(new TileBeat(151500, 0));
        song2Pattern.add(new TileBeat(152000, 3));
        song2Pattern.add(new TileBeat(152500, 2));
        song2Pattern.add(new TileBeat(153000, 1));
        song2Pattern.add(new TileBeat(153500, 0));
        song2Pattern.add(new TileBeat(154000, 3));
        song2Pattern.add(new TileBeat(154500, 2));
        song2Pattern.add(new TileBeat(155000, 1));
        song2Pattern.add(new TileBeat(155500, 0));
        song2Pattern.add(new TileBeat(156000, 3));
        song2Pattern.add(new TileBeat(156500, 2));
        song2Pattern.add(new TileBeat(157000, 1));
        song2Pattern.add(new TileBeat(157500, 0));
        song2Pattern.add(new TileBeat(158000, 2));
        song2Pattern.add(new TileBeat(158500, 3));
        song2Pattern.add(new TileBeat(159000, 1));
        song2Pattern.add(new TileBeat(159500, 0));
        song2Pattern.add(new TileBeat(160000, 3));
        song2Pattern.add(new TileBeat(160500, 2));
        song2Pattern.add(new TileBeat(161000, 1));
        song2Pattern.add(new TileBeat(161500, 0));
        song2Pattern.add(new TileBeat(162000, 3));
        song2Pattern.add(new TileBeat(162500, 2));
        song2Pattern.add(new TileBeat(163000, 1));
        song2Pattern.add(new TileBeat(163500, 0));
        song2Pattern.add(new TileBeat(164000, 2));
        song2Pattern.add(new TileBeat(164500, 3));
        song2Pattern.add(new TileBeat(165000, 1));
        song2Pattern.add(new TileBeat(165500, 0));
        song2Pattern.add(new TileBeat(166000, 3));
        song2Pattern.add(new TileBeat(166500, 2));
        song2Pattern.add(new TileBeat(167000, 1));
        song2Pattern.add(new TileBeat(167500, 0));
        song2Pattern.add(new TileBeat(168000, 3));
        song2Pattern.add(new TileBeat(168500, 2));
        song2Pattern.add(new TileBeat(169000, 1));
        song2Pattern.add(new TileBeat(169500, 0));
        song2Pattern.add(new TileBeat(170000, 2));
        song2Pattern.add(new TileBeat(170500, 3));
        song2Pattern.add(new TileBeat(171000, 1));
        song2Pattern.add(new TileBeat(171500, 0));
        song2Pattern.add(new TileBeat(172000, 3));
        song2Pattern.add(new TileBeat(172500, 2));
        song2Pattern.add(new TileBeat(173000, 1));
        song2Pattern.add(new TileBeat(173500, 0));
        song2Pattern.add(new TileBeat(174000, 2));
        song2Pattern.add(new TileBeat(174500, 3));
        song2Pattern.add(new TileBeat(175000, 1));
        song2Pattern.add(new TileBeat(175500, 0));
        song2Pattern.add(new TileBeat(176000, 3));
        song2Pattern.add(new TileBeat(176500, 2));
        song2Pattern.add(new TileBeat(177000, 1));
        song2Pattern.add(new TileBeat(177500, 0));
        song2Pattern.add(new TileBeat(178000, 3));
        song2Pattern.add(new TileBeat(178500, 2));
        song2Pattern.add(new TileBeat(179000, 1));
        song2Pattern.add(new TileBeat(179500, 0));
        song2Pattern.add(new TileBeat(180000, 2));
        song2Pattern.add(new TileBeat(180500, 3));
        song2Pattern.add(new TileBeat(181000, 1));
        song2Pattern.add(new TileBeat(181500, 0));
        song2Pattern.add(new TileBeat(182000, 3));
        song2Pattern.add(new TileBeat(182500, 2));
        song2Pattern.add(new TileBeat(183000, 1));
        song2Pattern.add(new TileBeat(183500, 0));
        song2Pattern.add(new TileBeat(184000, 2));
        song2Pattern.add(new TileBeat(184500, 3));
        song2Pattern.add(new TileBeat(185000, 1));
        song2Pattern.add(new TileBeat(185500, 0));
        song2Pattern.add(new TileBeat(186000, 3));
        song2Pattern.add(new TileBeat(186500, 2));
        song2Pattern.add(new TileBeat(187000, 1));
        song2Pattern.add(new TileBeat(187500, 0));
        song2Pattern.add(new TileBeat(188000, 3));
        song2Pattern.add(new TileBeat(188500, 2));
        song2Pattern.add(new TileBeat(189000, 1));
        song2Pattern.add(new TileBeat(189500, 0));
        song2Pattern.add(new TileBeat(190000, 2));
        song2Pattern.add(new TileBeat(190500, 3));
        song2Pattern.add(new TileBeat(191000, 1));
        song2Pattern.add(new TileBeat(191500, 0));
        song2Pattern.add(new TileBeat(192000, 3));
        song2Pattern.add(new TileBeat(192500, 2));
        song2Pattern.add(new TileBeat(193000, 1));
        song2Pattern.add(new TileBeat(193500, 0));
        song2Pattern.add(new TileBeat(194000, 2));
        song2Pattern.add(new TileBeat(194500, 3));
        song2Pattern.add(new TileBeat(195000, 1));
        song2Pattern.add(new TileBeat(195500, 0));
        song2Pattern.add(new TileBeat(196000, 3));
        song2Pattern.add(new TileBeat(196500, 2));
        song2Pattern.add(new TileBeat(197000, 1));
        song2Pattern.add(new TileBeat(197500, 0));
        song2Pattern.add(new TileBeat(198000, 3));
        song2Pattern.add(new TileBeat(198500, 2));
        song2Pattern.add(new TileBeat(199000, 1));
        song2Pattern.add(new TileBeat(199500, 0));
        song2Pattern.add(new TileBeat(200000, 2));
        song2Pattern.add(new TileBeat(200500, 3));
        song2Pattern.add(new TileBeat(201000, 1));
        song2Pattern.add(new TileBeat(201500, 0));
        song2Pattern.add(new TileBeat(202000, 3));
        song2Pattern.add(new TileBeat(202500, 2));
        song2Pattern.add(new TileBeat(203000, 1));
        song2Pattern.add(new TileBeat(203500, 0));
        song2Pattern.add(new TileBeat(204000, 2));
        song2Pattern.add(new TileBeat(204500, 3));
        song2Pattern.add(new TileBeat(205000, 1));
        song2Pattern.add(new TileBeat(205500, 0));
        song2Pattern.add(new TileBeat(206000, 3));
        song2Pattern.add(new TileBeat(206500, 2));
        song2Pattern.add(new TileBeat(207000, 1));
        song2Pattern.add(new TileBeat(207500, 0));
        song2Pattern.add(new TileBeat(208000, 3));
        song2Pattern.add(new TileBeat(208500, 2));
        song2Pattern.add(new TileBeat(209000, 1));
        song2Pattern.add(new TileBeat(209500, 0));
        song2Pattern.add(new TileBeat(210000, 2));
        song2Pattern.add(new TileBeat(210500, 3));
        song2Pattern.add(new TileBeat(211000, 1));
        song2Pattern.add(new TileBeat(211500, 0));
        song2Pattern.add(new TileBeat(212000, 3));
        song2Pattern.add(new TileBeat(212500, 2));
        song2Pattern.add(new TileBeat(213000, 1));
        song2Pattern.add(new TileBeat(213500, 0));
        song2Pattern.add(new TileBeat(214000, 2));
        song2Pattern.add(new TileBeat(214500, 3));
        song2Pattern.add(new TileBeat(215000, 1));
        song2Pattern.add(new TileBeat(215500, 0));
        song2Pattern.add(new TileBeat(216000, 3));
        song2Pattern.add(new TileBeat(216500, 2));
        song2Pattern.add(new TileBeat(217000, 1));
        song2Pattern.add(new TileBeat(217500, 0));
        song2Pattern.add(new TileBeat(218000, 3));
        song2Pattern.add(new TileBeat(218500, 2));
        song2Pattern.add(new TileBeat(219000, 1));
        song2Pattern.add(new TileBeat(219500, 0));
        song2Pattern.add(new TileBeat(220000, 2));
        song2Pattern.add(new TileBeat(220500, 3));
        song2Pattern.add(new TileBeat(221000, 1));
        song2Pattern.add(new TileBeat(221500, 0));
        song2Pattern.add(new TileBeat(222000, 3));
        song2Pattern.add(new TileBeat(222500, 2));
        song2Pattern.add(new TileBeat(223000, 1));
        song2Pattern.add(new TileBeat(223500, 0));
        song2Pattern.add(new TileBeat(224000, 2));
        song2Pattern.add(new TileBeat(224500, 3));
        song2Pattern.add(new TileBeat(225000, 1));
        song2Pattern.add(new TileBeat(225500, 0));
        song2Pattern.add(new TileBeat(226000, 3));
        song2Pattern.add(new TileBeat(226500, 2));
        song2Pattern.add(new TileBeat(227000, 1));
        song2Pattern.add(new TileBeat(227500, 0));
        song2Pattern.add(new TileBeat(228000, 3));
        song2Pattern.add(new TileBeat(228500, 2));
        song2Pattern.add(new TileBeat(229000, 1));
        song2Pattern.add(new TileBeat(229500, 0));
        song2Pattern.add(new TileBeat(230000, 2));
        song2Pattern.add(new TileBeat(230500, 3));
        song2Pattern.add(new TileBeat(231000, 1));
        song2Pattern.add(new TileBeat(231500, 0));
        song2Pattern.add(new TileBeat(232000, 3));
        song2Pattern.add(new TileBeat(232500, 2));
        song2Pattern.add(new TileBeat(233000, 1));
        song2Pattern.add(new TileBeat(233500, 0));
        song2Pattern.add(new TileBeat(234000, 2));
        song2Pattern.add(new TileBeat(234500, 3));
        song2Pattern.add(new TileBeat(235000, 1));
        song2Pattern.add(new TileBeat(235500, 0));
        song2Pattern.add(new TileBeat(236000, 3));
        song2Pattern.add(new TileBeat(236500, 2));
        song2Pattern.add(new TileBeat(237000, 1));
        song2Pattern.add(new TileBeat(237500, 0));
        song2Pattern.add(new TileBeat(238000, 3));
        song2Pattern.add(new TileBeat(238500, 2));
        song2Pattern.add(new TileBeat(239000, 1));
        song2Pattern.add(new TileBeat(239500, 0));
        song2Pattern.add(new TileBeat(240000, 2));
        song2Pattern.add(new TileBeat(240500, 3));
        song2Pattern.add(new TileBeat(241000, 1));
        song2Pattern.add(new TileBeat(241500, 0));
        song2Pattern.add(new TileBeat(242000, 3));
        song2Pattern.add(new TileBeat(242500, 2));
        song2Pattern.add(new TileBeat(243000, 1));
        song2Pattern.add(new TileBeat(243500, 0));
        song2Pattern.add(new TileBeat(244000, 2));
        song2Pattern.add(new TileBeat(244500, 3));
        song2Pattern.add(new TileBeat(245000, 1));
        song2Pattern.add(new TileBeat(245500, 0));
        song2Pattern.add(new TileBeat(246000, 3));
        song2Pattern.add(new TileBeat(246500, 2));
        song2Pattern.add(new TileBeat(247000, 1));
        song2Pattern.add(new TileBeat(247500, 0));
        song2Pattern.add(new TileBeat(248000, 3));
        song2Pattern.add(new TileBeat(248500, 2));
        song2Pattern.add(new TileBeat(249000, 1));
        song2Pattern.add(new TileBeat(249500, 0));
        song2Pattern.add(new TileBeat(250000, 2));
        song2Pattern.add(new TileBeat(250500, 3));
        song2Pattern.add(new TileBeat(251000, 1));
        song2Pattern.add(new TileBeat(251500, 0));
        song2Pattern.add(new TileBeat(252000, 3));
        song2Pattern.add(new TileBeat(252500, 2));
        song2Pattern.add(new TileBeat(253000, 1));
        song2Pattern.add(new TileBeat(253500, 0));
        song2Pattern.add(new TileBeat(254000, 3));
        //  추가 타일 비트
        patterns.put("src/resources/Lemon.wav", song2Pattern);
        
        // 3. Welcome to the Show
        List<TileBeat> song3Pattern = new ArrayList<>();
        song3Pattern.add(new TileBeat(500, 2));
        song3Pattern.add(new TileBeat(1000, 1));
        song3Pattern.add(new TileBeat(1500, 3));
        song3Pattern.add(new TileBeat(2000, 0));
        song3Pattern.add(new TileBeat(2500, 2));
        song3Pattern.add(new TileBeat(3000, 1));
        song3Pattern.add(new TileBeat(3500, 3));
        song3Pattern.add(new TileBeat(4000, 0));
        song3Pattern.add(new TileBeat(4500, 1));
        song3Pattern.add(new TileBeat(5000, 3));
        song3Pattern.add(new TileBeat(5500, 2));
        song3Pattern.add(new TileBeat(6000, 0));
        song3Pattern.add(new TileBeat(6500, 1));
        song3Pattern.add(new TileBeat(7000, 3));
        song3Pattern.add(new TileBeat(7500, 2));
        song3Pattern.add(new TileBeat(8000, 0));
        song3Pattern.add(new TileBeat(8500, 1));
        song3Pattern.add(new TileBeat(9000, 3));
        song3Pattern.add(new TileBeat(9500, 2));
        song3Pattern.add(new TileBeat(10000, 0));
        song3Pattern.add(new TileBeat(10500, 3));
        song3Pattern.add(new TileBeat(11000, 1));
        song3Pattern.add(new TileBeat(11500, 2));
        song3Pattern.add(new TileBeat(12000, 0));
        song3Pattern.add(new TileBeat(12500, 3));
        song3Pattern.add(new TileBeat(13000, 1));
        song3Pattern.add(new TileBeat(13500, 2));
        song3Pattern.add(new TileBeat(14000, 0));
        song3Pattern.add(new TileBeat(14500, 3));
        song3Pattern.add(new TileBeat(15000, 2));
        song3Pattern.add(new TileBeat(15500, 1));
        song3Pattern.add(new TileBeat(16000, 0));
        song3Pattern.add(new TileBeat(16500, 3));
        song3Pattern.add(new TileBeat(17000, 1));
        song3Pattern.add(new TileBeat(17500, 2));
        song3Pattern.add(new TileBeat(18000, 0));
        song3Pattern.add(new TileBeat(18500, 3));
        song3Pattern.add(new TileBeat(19000, 1));
        song3Pattern.add(new TileBeat(19500, 2));
        song3Pattern.add(new TileBeat(20000, 0));
        song3Pattern.add(new TileBeat(20500, 3));
        song3Pattern.add(new TileBeat(21000, 1));
        song3Pattern.add(new TileBeat(21500, 2));
        song3Pattern.add(new TileBeat(22000, 0));
        song3Pattern.add(new TileBeat(22500, 3));
        song3Pattern.add(new TileBeat(23000, 1));
        song3Pattern.add(new TileBeat(23500, 2));
        song3Pattern.add(new TileBeat(24000, 0));
        song3Pattern.add(new TileBeat(24500, 3));
        song3Pattern.add(new TileBeat(25000, 2));
        song3Pattern.add(new TileBeat(25500, 1));
        song3Pattern.add(new TileBeat(26000, 0));
        song3Pattern.add(new TileBeat(26500, 3));
        song3Pattern.add(new TileBeat(27000, 1));
        song3Pattern.add(new TileBeat(27500, 2));
        song3Pattern.add(new TileBeat(28000, 0));
        song3Pattern.add(new TileBeat(28500, 3));
        song3Pattern.add(new TileBeat(29000, 1));
        song3Pattern.add(new TileBeat(29500, 2));
        song3Pattern.add(new TileBeat(30000, 0));
        song3Pattern.add(new TileBeat(30500, 3));
        song3Pattern.add(new TileBeat(31000, 1));
        song3Pattern.add(new TileBeat(31500, 2));
        song3Pattern.add(new TileBeat(32000, 0));
        song3Pattern.add(new TileBeat(32500, 3));
        song3Pattern.add(new TileBeat(33000, 2));
        song3Pattern.add(new TileBeat(33500, 1));
        song3Pattern.add(new TileBeat(34000, 0));
        song3Pattern.add(new TileBeat(34500, 3));
        song3Pattern.add(new TileBeat(35000, 1));
        song3Pattern.add(new TileBeat(35500, 2));
        song3Pattern.add(new TileBeat(36000, 0));
        song3Pattern.add(new TileBeat(36500, 3));
        song3Pattern.add(new TileBeat(37000, 1));
        song3Pattern.add(new TileBeat(37500, 2));
        song3Pattern.add(new TileBeat(38000, 0));
        song3Pattern.add(new TileBeat(38500, 3));
        song3Pattern.add(new TileBeat(39000, 1));
        song3Pattern.add(new TileBeat(39500, 2));
        song3Pattern.add(new TileBeat(40000, 0));
        song3Pattern.add(new TileBeat(40500, 3));
        song3Pattern.add(new TileBeat(41000, 1));
        song3Pattern.add(new TileBeat(41500, 2));
        song3Pattern.add(new TileBeat(42000, 0));
        song3Pattern.add(new TileBeat(42500, 3));
        song3Pattern.add(new TileBeat(43000, 1));
        song3Pattern.add(new TileBeat(43500, 2));
        song3Pattern.add(new TileBeat(44000, 0));
        song3Pattern.add(new TileBeat(44500, 3));
        song3Pattern.add(new TileBeat(45000, 1));
        song3Pattern.add(new TileBeat(45500, 2));
        song3Pattern.add(new TileBeat(46000, 0));
        song3Pattern.add(new TileBeat(46500, 3));
        song3Pattern.add(new TileBeat(47000, 1));
        song3Pattern.add(new TileBeat(47500, 2));
        song3Pattern.add(new TileBeat(48000, 0));
        song3Pattern.add(new TileBeat(48500, 3));
        song3Pattern.add(new TileBeat(49000, 1));
        song3Pattern.add(new TileBeat(49500, 2));
        song3Pattern.add(new TileBeat(50000, 0));
        song3Pattern.add(new TileBeat(50500, 3));
        song3Pattern.add(new TileBeat(51000, 1));
        song3Pattern.add(new TileBeat(51500, 2));
        song3Pattern.add(new TileBeat(52000, 0));
        song3Pattern.add(new TileBeat(52500, 3));
        song3Pattern.add(new TileBeat(53000, 1));
        song3Pattern.add(new TileBeat(53500, 2));
        song3Pattern.add(new TileBeat(54000, 0));
        song3Pattern.add(new TileBeat(54500, 3));
        song3Pattern.add(new TileBeat(55000, 1));
        song3Pattern.add(new TileBeat(55500, 2));
        song3Pattern.add(new TileBeat(56000, 0));
        song3Pattern.add(new TileBeat(56500, 3));
        song3Pattern.add(new TileBeat(57000, 1));
        song3Pattern.add(new TileBeat(57500, 2));
        song3Pattern.add(new TileBeat(58000, 0));
        song3Pattern.add(new TileBeat(58500, 3));
        song3Pattern.add(new TileBeat(59000, 1));
        song3Pattern.add(new TileBeat(59500, 2));
        song3Pattern.add(new TileBeat(60000, 0));
        song3Pattern.add(new TileBeat(60500, 3));
        song3Pattern.add(new TileBeat(61000, 1));
        song3Pattern.add(new TileBeat(61500, 2));
        song3Pattern.add(new TileBeat(62000, 0));
        song3Pattern.add(new TileBeat(62500, 3));
        song3Pattern.add(new TileBeat(63000, 1));
        song3Pattern.add(new TileBeat(63500, 2));
        song3Pattern.add(new TileBeat(64000, 0));
        song3Pattern.add(new TileBeat(64500, 3));
        song3Pattern.add(new TileBeat(65000, 1));
        song3Pattern.add(new TileBeat(65500, 2));
        song3Pattern.add(new TileBeat(66000, 0));
        song3Pattern.add(new TileBeat(66500, 3));
        song3Pattern.add(new TileBeat(67000, 1));
        song3Pattern.add(new TileBeat(67500, 2));
        song3Pattern.add(new TileBeat(68000, 0));
        song3Pattern.add(new TileBeat(68500, 3));
        song3Pattern.add(new TileBeat(69000, 1));
        song3Pattern.add(new TileBeat(69500, 2));
        song3Pattern.add(new TileBeat(70000, 0));
        song3Pattern.add(new TileBeat(70500, 3));
        song3Pattern.add(new TileBeat(71000, 1));
        song3Pattern.add(new TileBeat(71500, 2));
        song3Pattern.add(new TileBeat(72000, 0));
        song3Pattern.add(new TileBeat(72500, 3));
        song3Pattern.add(new TileBeat(73000, 1));
        song3Pattern.add(new TileBeat(73500, 2));
        song3Pattern.add(new TileBeat(74000, 0));
        song3Pattern.add(new TileBeat(74500, 3));
        song3Pattern.add(new TileBeat(75000, 1));
        song3Pattern.add(new TileBeat(75500, 2));
        song3Pattern.add(new TileBeat(76000, 0));
        song3Pattern.add(new TileBeat(76500, 3));
        song3Pattern.add(new TileBeat(77000, 1));
        song3Pattern.add(new TileBeat(77500, 2));
        song3Pattern.add(new TileBeat(78000, 0));
        song3Pattern.add(new TileBeat(78500, 3));
        song3Pattern.add(new TileBeat(79000, 1));
        song3Pattern.add(new TileBeat(79500, 2));
        song3Pattern.add(new TileBeat(80000, 0));
        song3Pattern.add(new TileBeat(80500, 3));
        song3Pattern.add(new TileBeat(81000, 1));
        song3Pattern.add(new TileBeat(81500, 2));
        song3Pattern.add(new TileBeat(82000, 0));
        song3Pattern.add(new TileBeat(82500, 3));
        song3Pattern.add(new TileBeat(83000, 1));
        song3Pattern.add(new TileBeat(83500, 2));
        song3Pattern.add(new TileBeat(84000, 0));
        song3Pattern.add(new TileBeat(84500, 3));
        song3Pattern.add(new TileBeat(85000, 2));
        song3Pattern.add(new TileBeat(85500, 1));
        song3Pattern.add(new TileBeat(86000, 0));
        song3Pattern.add(new TileBeat(86500, 3));
        song3Pattern.add(new TileBeat(87000, 2));
        song3Pattern.add(new TileBeat(87500, 1));
        song3Pattern.add(new TileBeat(88000, 0));
        song3Pattern.add(new TileBeat(88500, 3));
        song3Pattern.add(new TileBeat(89000, 1));
        song3Pattern.add(new TileBeat(89500, 2));
        song3Pattern.add(new TileBeat(90000, 0));
        song3Pattern.add(new TileBeat(90500, 3));
        song3Pattern.add(new TileBeat(91000, 2));
        song3Pattern.add(new TileBeat(91500, 1));
        song3Pattern.add(new TileBeat(92000, 0));
        song3Pattern.add(new TileBeat(92500, 3));
        song3Pattern.add(new TileBeat(93000, 2));
        song3Pattern.add(new TileBeat(93500, 1));
        song3Pattern.add(new TileBeat(94000, 0));
        song3Pattern.add(new TileBeat(94500, 3));
        song3Pattern.add(new TileBeat(95000, 1));
        song3Pattern.add(new TileBeat(95500, 2));
        song3Pattern.add(new TileBeat(96000, 0));
        song3Pattern.add(new TileBeat(96500, 3));
        song3Pattern.add(new TileBeat(97000, 1));
        song3Pattern.add(new TileBeat(97500, 2));
        song3Pattern.add(new TileBeat(98000, 0));
        song3Pattern.add(new TileBeat(98500, 3));
        song3Pattern.add(new TileBeat(99000, 1));
        song3Pattern.add(new TileBeat(99500, 2));
        song3Pattern.add(new TileBeat(100000, 0));
        song3Pattern.add(new TileBeat(100500, 3));
        song3Pattern.add(new TileBeat(101000, 1));
        song3Pattern.add(new TileBeat(101500, 2));
        song3Pattern.add(new TileBeat(102000, 0));
        song3Pattern.add(new TileBeat(102500, 3));
        song3Pattern.add(new TileBeat(103000, 1));
        song3Pattern.add(new TileBeat(103500, 2));
        song3Pattern.add(new TileBeat(104000, 0));
        song3Pattern.add(new TileBeat(104500, 3));
        song3Pattern.add(new TileBeat(105000, 2));
        song3Pattern.add(new TileBeat(105500, 1));
        song3Pattern.add(new TileBeat(106000, 0));
        song3Pattern.add(new TileBeat(106500, 3));
        song3Pattern.add(new TileBeat(107000, 1));
        song3Pattern.add(new TileBeat(107500, 2));
        song3Pattern.add(new TileBeat(108000, 0));
        song3Pattern.add(new TileBeat(108500, 3));
        song3Pattern.add(new TileBeat(109000, 2));
        song3Pattern.add(new TileBeat(109500, 1));
        song3Pattern.add(new TileBeat(110000, 0));
        song3Pattern.add(new TileBeat(110500, 3));
        song3Pattern.add(new TileBeat(111000, 2));
        song3Pattern.add(new TileBeat(111500, 1));
        song3Pattern.add(new TileBeat(112000, 0));
        song3Pattern.add(new TileBeat(112500, 3));
        song3Pattern.add(new TileBeat(113000, 2));
        song3Pattern.add(new TileBeat(113500, 1));
        song3Pattern.add(new TileBeat(114000, 0));
        song3Pattern.add(new TileBeat(114500, 3));
        song3Pattern.add(new TileBeat(115000, 1));
        song3Pattern.add(new TileBeat(115500, 2));
        song3Pattern.add(new TileBeat(116000, 0));
        song3Pattern.add(new TileBeat(116500, 3));
        song3Pattern.add(new TileBeat(117000, 2));
        song3Pattern.add(new TileBeat(117500, 1));
        song3Pattern.add(new TileBeat(118000, 0));
        song3Pattern.add(new TileBeat(118500, 3));
        song3Pattern.add(new TileBeat(119000, 1));
        song3Pattern.add(new TileBeat(119500, 2));
        song3Pattern.add(new TileBeat(120000, 0));
        song3Pattern.add(new TileBeat(120500, 3));
        song3Pattern.add(new TileBeat(121000, 1));
        song3Pattern.add(new TileBeat(121500, 2));
        song3Pattern.add(new TileBeat(122000, 0));
        song3Pattern.add(new TileBeat(122500, 3));
        song3Pattern.add(new TileBeat(123000, 1));
        song3Pattern.add(new TileBeat(123500, 2));
        song3Pattern.add(new TileBeat(124000, 0));
        song3Pattern.add(new TileBeat(124500, 3));
        song3Pattern.add(new TileBeat(125000, 1));
        song3Pattern.add(new TileBeat(125500, 2));
        song3Pattern.add(new TileBeat(126000, 0));
        song3Pattern.add(new TileBeat(126500, 3));
        song3Pattern.add(new TileBeat(127000, 1));
        song3Pattern.add(new TileBeat(127500, 2));
        song3Pattern.add(new TileBeat(128000, 0));
        song3Pattern.add(new TileBeat(128500, 3));
        song3Pattern.add(new TileBeat(129000, 2));
        song3Pattern.add(new TileBeat(129500, 1));
        song3Pattern.add(new TileBeat(130000, 0));
        song3Pattern.add(new TileBeat(130500, 3));
        song3Pattern.add(new TileBeat(131000, 1));
        song3Pattern.add(new TileBeat(131500, 2));
        song3Pattern.add(new TileBeat(132000, 0));
        song3Pattern.add(new TileBeat(132500, 3));
        song3Pattern.add(new TileBeat(133000, 2));
        song3Pattern.add(new TileBeat(133500, 1));
        song3Pattern.add(new TileBeat(134000, 0));
        song3Pattern.add(new TileBeat(134500, 3));
        song3Pattern.add(new TileBeat(135000, 1));
        song3Pattern.add(new TileBeat(135500, 2));
        song3Pattern.add(new TileBeat(136000, 0));
        song3Pattern.add(new TileBeat(136500, 2));
        song3Pattern.add(new TileBeat(137000, 0));
        song3Pattern.add(new TileBeat(137500, 3));
        song3Pattern.add(new TileBeat(138000, 1));
        song3Pattern.add(new TileBeat(138500, 2));
        song3Pattern.add(new TileBeat(139000, 3));
        song3Pattern.add(new TileBeat(139500, 1));
        song3Pattern.add(new TileBeat(140000, 2));
        song3Pattern.add(new TileBeat(140500, 0));
        song3Pattern.add(new TileBeat(141000, 3));
        song3Pattern.add(new TileBeat(141500, 2));
        song3Pattern.add(new TileBeat(142000, 0));
        song3Pattern.add(new TileBeat(142500, 3));
        song3Pattern.add(new TileBeat(143000, 1));
        song3Pattern.add(new TileBeat(143500, 3));
        song3Pattern.add(new TileBeat(144000, 2));
        song3Pattern.add(new TileBeat(144500, 0));
        song3Pattern.add(new TileBeat(145000, 1));
        song3Pattern.add(new TileBeat(145500, 3));
        song3Pattern.add(new TileBeat(146000, 2));
        song3Pattern.add(new TileBeat(146500, 1));
        song3Pattern.add(new TileBeat(147000, 0));
        song3Pattern.add(new TileBeat(147500, 3));
        song3Pattern.add(new TileBeat(148000, 2));
        song3Pattern.add(new TileBeat(148500, 1));
        song3Pattern.add(new TileBeat(149000, 3));
        song3Pattern.add(new TileBeat(149500, 0));
        song3Pattern.add(new TileBeat(150000, 2));
        song3Pattern.add(new TileBeat(150500, 3));
        song3Pattern.add(new TileBeat(151000, 1));
        song3Pattern.add(new TileBeat(151500, 0));
        song3Pattern.add(new TileBeat(152000, 2));
        song3Pattern.add(new TileBeat(152500, 3));
        song3Pattern.add(new TileBeat(153000, 1));
        song3Pattern.add(new TileBeat(153500, 0));
        song3Pattern.add(new TileBeat(154000, 3));
        song3Pattern.add(new TileBeat(154500, 2));
        song3Pattern.add(new TileBeat(155000, 1));
        song3Pattern.add(new TileBeat(155500, 0));
        song3Pattern.add(new TileBeat(156000, 2));
        song3Pattern.add(new TileBeat(156500, 3));
        song3Pattern.add(new TileBeat(157000, 1));
        song3Pattern.add(new TileBeat(157500, 0));
        song3Pattern.add(new TileBeat(158000, 2));
        song3Pattern.add(new TileBeat(158500, 3));
        song3Pattern.add(new TileBeat(159000, 1));
        song3Pattern.add(new TileBeat(159500, 0));
        song3Pattern.add(new TileBeat(160000, 3));
        song3Pattern.add(new TileBeat(160500, 2));
        song3Pattern.add(new TileBeat(161000, 1));
        song3Pattern.add(new TileBeat(161500, 0));
        song3Pattern.add(new TileBeat(162000, 3));
        song3Pattern.add(new TileBeat(162500, 2));
        song3Pattern.add(new TileBeat(163000, 1));
        song3Pattern.add(new TileBeat(163500, 0));
        song3Pattern.add(new TileBeat(164000, 3));
        song3Pattern.add(new TileBeat(164500, 2));
        song3Pattern.add(new TileBeat(165000, 1));
        song3Pattern.add(new TileBeat(165500, 0));
        song3Pattern.add(new TileBeat(166000, 2));
        song3Pattern.add(new TileBeat(166500, 3));
        song3Pattern.add(new TileBeat(167000, 1));
        song3Pattern.add(new TileBeat(167500, 0));
        song3Pattern.add(new TileBeat(168000, 2));
        song3Pattern.add(new TileBeat(168500, 3));
        song3Pattern.add(new TileBeat(169000, 1));
        song3Pattern.add(new TileBeat(169500, 0));
        song3Pattern.add(new TileBeat(170000, 2));
        song3Pattern.add(new TileBeat(170500, 3));
        song3Pattern.add(new TileBeat(171000, 1));
        song3Pattern.add(new TileBeat(171500, 0));
        song3Pattern.add(new TileBeat(172000, 3));
        song3Pattern.add(new TileBeat(172500, 2));
        song3Pattern.add(new TileBeat(173000, 1));
        song3Pattern.add(new TileBeat(173500, 0));
        song3Pattern.add(new TileBeat(174000, 2));
        song3Pattern.add(new TileBeat(174500, 3));
        song3Pattern.add(new TileBeat(175000, 1));
        song3Pattern.add(new TileBeat(175500, 0));
        song3Pattern.add(new TileBeat(176000, 2));
        song3Pattern.add(new TileBeat(176500, 3));
        song3Pattern.add(new TileBeat(177000, 1));
        song3Pattern.add(new TileBeat(177500, 0));
        song3Pattern.add(new TileBeat(178000, 3));
        song3Pattern.add(new TileBeat(178500, 2));
        song3Pattern.add(new TileBeat(179000, 1));
        song3Pattern.add(new TileBeat(179500, 0));
        song3Pattern.add(new TileBeat(180000, 2));
        song3Pattern.add(new TileBeat(180500, 3));
        song3Pattern.add(new TileBeat(181000, 1));
        song3Pattern.add(new TileBeat(181500, 0));
        song3Pattern.add(new TileBeat(182000, 3));
        song3Pattern.add(new TileBeat(182500, 2));
        song3Pattern.add(new TileBeat(183000, 1));
        song3Pattern.add(new TileBeat(183500, 0));
        song3Pattern.add(new TileBeat(184000, 2));
        song3Pattern.add(new TileBeat(184500, 3));
        song3Pattern.add(new TileBeat(185000, 1));
        song3Pattern.add(new TileBeat(185500, 0));
        song3Pattern.add(new TileBeat(186000, 2));
        song3Pattern.add(new TileBeat(186500, 3));
        song3Pattern.add(new TileBeat(187000, 1));
        song3Pattern.add(new TileBeat(187500, 0));
        song3Pattern.add(new TileBeat(188000, 2));
        song3Pattern.add(new TileBeat(188500, 3));
        song3Pattern.add(new TileBeat(189000, 1));
        song3Pattern.add(new TileBeat(189500, 0));
        song3Pattern.add(new TileBeat(190000, 3));
        song3Pattern.add(new TileBeat(190500, 2));
        song3Pattern.add(new TileBeat(191000, 1));
        song3Pattern.add(new TileBeat(191500, 0));
        song3Pattern.add(new TileBeat(192000, 2));
        song3Pattern.add(new TileBeat(192500, 3));
        song3Pattern.add(new TileBeat(193000, 1));
        song3Pattern.add(new TileBeat(193500, 0));
        song3Pattern.add(new TileBeat(194000, 2));
        song3Pattern.add(new TileBeat(194500, 3));
        song3Pattern.add(new TileBeat(195000, 1));
        song3Pattern.add(new TileBeat(195500, 0));
        song3Pattern.add(new TileBeat(196000, 2));
        song3Pattern.add(new TileBeat(196500, 3));
        song3Pattern.add(new TileBeat(197000, 1));
        song3Pattern.add(new TileBeat(197500, 0));
        song3Pattern.add(new TileBeat(198000, 2));
        song3Pattern.add(new TileBeat(198500, 3));
        song3Pattern.add(new TileBeat(199000, 1));
        song3Pattern.add(new TileBeat(199500, 0));
        song3Pattern.add(new TileBeat(200000, 3));
        song3Pattern.add(new TileBeat(200500, 2));
        song3Pattern.add(new TileBeat(201000, 1));
        song3Pattern.add(new TileBeat(201500, 0));
        song3Pattern.add(new TileBeat(202000, 3));
        song3Pattern.add(new TileBeat(202500, 2));
        song3Pattern.add(new TileBeat(203000, 1));
        song3Pattern.add(new TileBeat(203500, 0));
        song3Pattern.add(new TileBeat(204000, 2));
        song3Pattern.add(new TileBeat(204500, 3));
        song3Pattern.add(new TileBeat(205000, 1));
        song3Pattern.add(new TileBeat(205500, 0));
        song3Pattern.add(new TileBeat(206000, 2));
        song3Pattern.add(new TileBeat(206500, 3));
        song3Pattern.add(new TileBeat(207000, 1));
        song3Pattern.add(new TileBeat(207500, 0));
        song3Pattern.add(new TileBeat(208000, 3));
        song3Pattern.add(new TileBeat(208500, 2));
        song3Pattern.add(new TileBeat(209000, 1));
        song3Pattern.add(new TileBeat(209500, 0));
        song3Pattern.add(new TileBeat(210000, 2));
        song3Pattern.add(new TileBeat(210500, 3));
        song3Pattern.add(new TileBeat(211000, 1));
        song3Pattern.add(new TileBeat(211500, 0));
        song3Pattern.add(new TileBeat(212000, 3));
        song3Pattern.add(new TileBeat(212500, 2));
        song3Pattern.add(new TileBeat(213000, 1));
        song3Pattern.add(new TileBeat(213500, 0));
        song3Pattern.add(new TileBeat(214000, 2));
        song3Pattern.add(new TileBeat(214500, 3));
        song3Pattern.add(new TileBeat(215000, 1));
        song3Pattern.add(new TileBeat(215500, 0));
        song3Pattern.add(new TileBeat(216000, 2));
        song3Pattern.add(new TileBeat(216500, 3));
        song3Pattern.add(new TileBeat(217000, 1));
        //  추가 타일 비트
        patterns.put("src/resources/Welcome to the Show.wav", song3Pattern);
        
        // 4. 베텔기우스
        List<TileBeat> song4Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/BETELGEUSE.wav", song4Pattern);
        
        // 5. 교가
        List<TileBeat> song5Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/MNUSS.wav", song5Pattern);
        
        // 6. 포켓몬
        List<TileBeat> song6Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/pocketmon.wav", song6Pattern);
        
        // 7. 카드캡터 체리
        List<TileBeat> song7Pattern = new ArrayList<>();
     // 브금 1~14초
        song7Pattern.add(new TileBeat(1000, 0)); 
        song7Pattern.add(new TileBeat(3000, 1)); 
        song7Pattern.add(new TileBeat(4000, 0)); 
        song7Pattern.add(new TileBeat(4200, 1));
        song7Pattern.add(new TileBeat(4600, 3)); 
        
        song7Pattern.add(new TileBeat(5600, 0)); 
        song7Pattern.add(new TileBeat(6000, 1)); 
        song7Pattern.add(new TileBeat(6500, 3)); 
        song7Pattern.add(new TileBeat(7000, 2)); 
        song7Pattern.add(new TileBeat(7100, 1)); 

        song7Pattern.add(new TileBeat(7200, 2)); 
        song7Pattern.add(new TileBeat(7300, 0)); 
        song7Pattern.add(new TileBeat(7500, 1)); 
        song7Pattern.add(new TileBeat(7800, 3)); 
        song7Pattern.add(new TileBeat(8100, 0)); 

        song7Pattern.add(new TileBeat(8400, 1)); 
        song7Pattern.add(new TileBeat(8700, 3)); 
        song7Pattern.add(new TileBeat(8800, 2)); 
        song7Pattern.add(new TileBeat(9100, 0)); 
        song7Pattern.add(new TileBeat(9400, 1)); 
        
        song7Pattern.add(new TileBeat(9700, 3)); 
        song7Pattern.add(new TileBeat(10000, 0)); 
        song7Pattern.add(new TileBeat(10300, 1)); 
        song7Pattern.add(new TileBeat(10400, 2)); 
        song7Pattern.add(new TileBeat(11400, 0)); 

        song7Pattern.add(new TileBeat(11700, 1)); 
        song7Pattern.add(new TileBeat(12400, 3)); 
        song7Pattern.add(new TileBeat(12600, 2)); 
        song7Pattern.add(new TileBeat(12700, 1)); 
        song7Pattern.add(new TileBeat(13100, 2)); 
        
        // 노래 시작
        // 만날 수 없어 14~16초
        song7Pattern.add(new TileBeat(14000, 0)); 
        song7Pattern.add(new TileBeat(14200, 1)); 
        song7Pattern.add(new TileBeat(14400, 2)); 
        song7Pattern.add(new TileBeat(14600, 3)); 
        song7Pattern.add(new TileBeat(14800, 2));

        song7Pattern.add(new TileBeat(15000, 1)); 

        // 만나고 싶은데 16~18초
        song7Pattern.add(new TileBeat(16000, 0)); 
        song7Pattern.add(new TileBeat(16200, 1)); 
        song7Pattern.add(new TileBeat(16400, 2)); 
        song7Pattern.add(new TileBeat(16800, 3)); 

        song7Pattern.add(new TileBeat(17000, 2)); 
        song7Pattern.add(new TileBeat(17200, 1)); 

        // 그런 슬픈 기분인걸 18~21초
        song7Pattern.add(new TileBeat(18000, 0));
        song7Pattern.add(new TileBeat(18200, 1)); 
        song7Pattern.add(new TileBeat(18400, 2)); 
        
        song7Pattern.add(new TileBeat(18600, 3)); 
        song7Pattern.add(new TileBeat(18800, 2)); 
        song7Pattern.add(new TileBeat(19000, 3)); 
        song7Pattern.add(new TileBeat(19200, 0)); 
        song7Pattern.add(new TileBeat(19400, 1)); 

        song7Pattern.add(new TileBeat(19600, 0)); 
        song7Pattern.add(new TileBeat(19800, 2)); 
        song7Pattern.add(new TileBeat(20000, 0)); 
        song7Pattern.add(new TileBeat(20200, 1)); 
        song7Pattern.add(new TileBeat(20400, 3)); 
        
        // 말할 수 없어 21~23초
        song7Pattern.add(new TileBeat(21000, 1)); 
        song7Pattern.add(new TileBeat(21200, 2)); 
        song7Pattern.add(new TileBeat(21400, 1)); 
        song7Pattern.add(new TileBeat(21600, 2)); 
        song7Pattern.add(new TileBeat(21800, 1));

        // 말하고 싶은데 23~25초
        song7Pattern.add(new TileBeat(23000, 0)); 
        song7Pattern.add(new TileBeat(23200, 1)); 
        song7Pattern.add(new TileBeat(23400, 0)); 
        song7Pattern.add(new TileBeat(23600, 1)); 
        song7Pattern.add(new TileBeat(23800, 0)); 

        song7Pattern.add(new TileBeat(24000, 1)); 
        
        // 속마음만 들키는걸 25~27초
        song7Pattern.add(new TileBeat(25000, 2)); 
        song7Pattern.add(new TileBeat(25300, 3)); 
        song7Pattern.add(new TileBeat(25500, 2)); 
        song7Pattern.add(new TileBeat(25700, 3)); 

        song7Pattern.add(new TileBeat(25900, 2)); 
        song7Pattern.add(new TileBeat(26100, 3)); 
        song7Pattern.add(new TileBeat(26300, 2)); 
        song7Pattern.add(new TileBeat(26500, 1)); 
        song7Pattern.add(new TileBeat(26500, 2)); 
        
        // 내 사랑에 27.5~31초 
        song7Pattern.add(new TileBeat(27500, 0)); 
        song7Pattern.add(new TileBeat(27700, 1)); 
        song7Pattern.add(new TileBeat(27900, 2));  
        song7Pattern.add(new TileBeat(28100, 3)); 
        song7Pattern.add(new TileBeat(28300, 2)); 
        song7Pattern.add(new TileBeat(28600, 1));  
        song7Pattern.add(new TileBeat(28800, 2));  
        song7Pattern.add(new TileBeat(29000, 0)); 
        song7Pattern.add(new TileBeat(29200, 1)); 
        song7Pattern.add(new TileBeat(29500, 3)); 
        
        // 마법의 열쇠가 있다면 31~33초 
        song7Pattern.add(new TileBeat(31000, 2));  
        song7Pattern.add(new TileBeat(31200, 1)); 
        song7Pattern.add(new TileBeat(31500, 0)); 
        song7Pattern.add(new TileBeat(31700, 1)); 
        song7Pattern.add(new TileBeat(32000, 2));  
        song7Pattern.add(new TileBeat(32200, 1)); 
        song7Pattern.add(new TileBeat(32400, 2)); 
        song7Pattern.add(new TileBeat(32600, 0)); 
        song7Pattern.add(new TileBeat(32800, 1)); 

        // 그건 바로 33~35초
        song7Pattern.add(new TileBeat(33000, 3)); 
        song7Pattern.add(new TileBeat(33200, 2)); 
        song7Pattern.add(new TileBeat(33400, 1)); 
        song7Pattern.add(new TileBeat(33600, 0)); 

        song7Pattern.add(new TileBeat(33800, 1)); 
        
        // 이 세상이 아름다운 이유 35~38초
        song7Pattern.add(new TileBeat(35000, 0)); 
        song7Pattern.add(new TileBeat(35200, 1)); 
        song7Pattern.add(new TileBeat(35400, 2)); 
        song7Pattern.add(new TileBeat(35600, 3)); 
        song7Pattern.add(new TileBeat(35800, 2)); 

        song7Pattern.add(new TileBeat(36000, 1)); 
        song7Pattern.add(new TileBeat(36200, 0)); 
        song7Pattern.add(new TileBeat(36400, 1)); 
        song7Pattern.add(new TileBeat(36600, 2)); 
        song7Pattern.add(new TileBeat(36800, 3)); 
        
        song7Pattern.add(new TileBeat(37000, 2)); 
        song7Pattern.add(new TileBeat(37200, 1)); 
        song7Pattern.add(new TileBeat(37400, 0)); 

        // catch you 38~40초
        song7Pattern.add(new TileBeat(38100, 1)); 
        song7Pattern.add(new TileBeat(38400, 2)); 
        song7Pattern.add(new TileBeat(38600, 1)); 
        song7Pattern.add(new TileBeat(39100, 2)); 
        song7Pattern.add(new TileBeat(39300, 1)); 

        song7Pattern.add(new TileBeat(39500, 2)); 
        song7Pattern.add(new TileBeat(39700, 1)); 

        // catch you 40~41초
        song7Pattern.add(new TileBeat(40100, 0)); 
        song7Pattern.add(new TileBeat(40300, 1)); 
        song7Pattern.add(new TileBeat(40500, 2)); 

        song7Pattern.add(new TileBeat(40700, 3)); 
        song7Pattern.add(new TileBeat(40900, 1)); 

        // catch me 41~44초
        song7Pattern.add(new TileBeat(41100, 0)); 
        song7Pattern.add(new TileBeat(41300, 1)); 
        song7Pattern.add(new TileBeat(41500, 2));

        song7Pattern.add(new TileBeat(41700, 3)); 
        song7Pattern.add(new TileBeat(41900, 2)); 
        song7Pattern.add(new TileBeat(42100, 1)); 

        // catch me 44~45초
        song7Pattern.add(new TileBeat(44100, 0)); 
        song7Pattern.add(new TileBeat(44300, 1)); 

        song7Pattern.add(new TileBeat(44500, 2)); 
        song7Pattern.add(new TileBeat(44700, 3)); 
        song7Pattern.add(new TileBeat(44900, 1)); 

        // 이제 숨바꼭질은 그만(그만) 45~46초
        song7Pattern.add(new TileBeat(45100, 2)); 
        song7Pattern.add(new TileBeat(45300, 1)); 

        // 숨바꼭질은 46~47초
        song7Pattern.add(new TileBeat(46100, 0)); 
        song7Pattern.add(new TileBeat(46300, 1)); 
        song7Pattern.add(new TileBeat(46500, 2)); 
        song7Pattern.add(new TileBeat(46700, 3)); 
        song7Pattern.add(new TileBeat(46900, 2)); 

        song7Pattern.add(new TileBeat(47100, 1)); 

        // 그만(그만) 47~49초
        song7Pattern.add(new TileBeat(47300, 0)); 
        song7Pattern.add(new TileBeat(47500, 1));
        song7Pattern.add(new TileBeat(47700, 2)); 
        song7Pattern.add(new TileBeat(47900, 1)); 

        song7Pattern.add(new TileBeat(48100, 2)); 

        // 우울한 건 49~51초
        song7Pattern.add(new TileBeat(49100, 0)); 
        song7Pattern.add(new TileBeat(49300, 1)); 
        song7Pattern.add(new TileBeat(49500, 3));

        // 모두 파란하늘에 51~53초
        song7Pattern.add(new TileBeat(51100, 2)); 
        song7Pattern.add(new TileBeat(51300, 1)); 
        song7Pattern.add(new TileBeat(51500, 2)); 
        song7Pattern.add(new TileBeat(51700, 1)); 
        song7Pattern.add(new TileBeat(51900, 2)); 
        song7Pattern.add(new TileBeat(52100, 1)); 

        // 묻어버려 53~56초
        song7Pattern.add(new TileBeat(53100, 0)); 
        song7Pattern.add(new TileBeat(53300, 1)); 
        song7Pattern.add(new TileBeat(53500, 2)); 
        song7Pattern.add(new TileBeat(53700, 3)); 

        // 오늘도 56~57초
        song7Pattern.add(new TileBeat(56100, 1)); 
        song7Pattern.add(new TileBeat(56300, 2)); 
        song7Pattern.add(new TileBeat(56500, 1)); 
        song7Pattern.add(new TileBeat(56700, 2)); 

        // 너에게 57~58초
        song7Pattern.add(new TileBeat(57100, 0)); 

        song7Pattern.add(new TileBeat(57300, 1)); 
        song7Pattern.add(new TileBeat(57500, 0)); 

        // 달려가는 58~61초
        song7Pattern.add(new TileBeat(58100, 2)); 
        song7Pattern.add(new TileBeat(58300, 3)); 
        song7Pattern.add(new TileBeat(58500, 2));

        song7Pattern.add(new TileBeat(58700, 3)); 

        // 이 마음 61~63초
        song7Pattern.add(new TileBeat(61100, 0)); 
        song7Pattern.add(new TileBeat(61300, 1)); 
        song7Pattern.add(new TileBeat(61500, 2)); 
        song7Pattern.add(new TileBeat(61700, 3)); 

        // 나는 63~64초
        song7Pattern.add(new TileBeat(63100, 0)); 
        song7Pattern.add(new TileBeat(63200, 1)); 

        // 정말 정말 64~65초
        song7Pattern.add(new TileBeat(64100, 3)); 
        song7Pattern.add(new TileBeat(64200, 2)); 
        song7Pattern.add(new TileBeat(64300, 3)); 

        // 너를 좋아해 65~69초 (800ms 간격)
        song7Pattern.add(new TileBeat(65100, 1)); 
        song7Pattern.add(new TileBeat(65900, 0)); 
        song7Pattern.add(new TileBeat(66700, 1)); 
        song7Pattern.add(new TileBeat(67500, 2)); 
        song7Pattern.add(new TileBeat(68300, 3)); 
        
        //브금 69~71 이 시간 공평하게 나눠 같도록 
        song7Pattern.add(new TileBeat(69000, 2)); 
        song7Pattern.add(new TileBeat(69200, 1)); 
        song7Pattern.add(new TileBeat(69400, 2)); 
        song7Pattern.add(new TileBeat(69600, 1)); 
        song7Pattern.add(new TileBeat(69800, 2));
        
        // 눈을 감으면 71~72
        song7Pattern.add(new TileBeat(71000, 0));
        song7Pattern.add(new TileBeat(71100, 1));
        song7Pattern.add(new TileBeat(71200, 2));
        song7Pattern.add(new TileBeat(71300, 3));
        song7Pattern.add(new TileBeat(71400, 2));

        // 누군가 내곁을 71~74
        song7Pattern.add(new TileBeat(72000, 1));
        song7Pattern.add(new TileBeat(72200, 0));
        song7Pattern.add(new TileBeat(72400, 1));
        song7Pattern.add(new TileBeat(72600, 0));
        song7Pattern.add(new TileBeat(72800, 1));

        song7Pattern.add(new TileBeat(73000, 0));

        // 스쳐가는 74~75
        song7Pattern.add(new TileBeat(74000, 2));
        song7Pattern.add(new TileBeat(74200, 3));
        song7Pattern.add(new TileBeat(74400, 2));
        song7Pattern.add(new TileBeat(74600, 3));

        // 느낌인걸 75~77
        song7Pattern.add(new TileBeat(75000, 0));
        song7Pattern.add(new TileBeat(75200, 1));
        song7Pattern.add(new TileBeat(75400, 0));
        song7Pattern.add(new TileBeat(75600, 1));
        song7Pattern.add(new TileBeat(75800, 3));

        song7Pattern.add(new TileBeat(76000, 2));
        song7Pattern.add(new TileBeat(76200, 1));
        
        // 눈을 떠보면 77~79
        song7Pattern.add(new TileBeat(77000, 0)); 
        song7Pattern.add(new TileBeat(77200, 1)); 
        song7Pattern.add(new TileBeat(77400, 2)); 
        song7Pattern.add(new TileBeat(77600, 3)); 
        song7Pattern.add(new TileBeat(77800, 1)); 

        // 바람 같은 너의 79~81
        song7Pattern.add(new TileBeat(79000, 0)); 
        song7Pattern.add(new TileBeat(79200, 1)); 
        song7Pattern.add(new TileBeat(79400, 2)); 
        song7Pattern.add(new TileBeat(79600, 1)); 
        song7Pattern.add(new TileBeat(79800, 2)); 
        song7Pattern.add(new TileBeat(80000, 1)); 

        // 향기만이 가득한걸 81~84
        song7Pattern.add(new TileBeat(81000, 0)); 
        song7Pattern.add(new TileBeat(81300, 1)); 
        song7Pattern.add(new TileBeat(81500, 3)); 
        song7Pattern.add(new TileBeat(81700, 2)); 
        song7Pattern.add(new TileBeat(81900, 1)); 
        song7Pattern.add(new TileBeat(82100, 0)); 
        song7Pattern.add(new TileBeat(82300, 1));
        song7Pattern.add(new TileBeat(82500, 2)); 
        
        // 내 순수한 84~87
        song7Pattern.add(new TileBeat(84500, 0)); 
        song7Pattern.add(new TileBeat(84700, 1)); 
        song7Pattern.add(new TileBeat(84900, 2)); 
        song7Pattern.add(new TileBeat(85100, 3)); 
        song7Pattern.add(new TileBeat(85300, 3));
        song7Pattern.add(new TileBeat(85500, 2)); 
        song7Pattern.add(new TileBeat(85700, 1)); 
        song7Pattern.add(new TileBeat(85900, 2)); 
        song7Pattern.add(new TileBeat(86100, 1)); 
        song7Pattern.add(new TileBeat(86300, 2));

        // 마음을 느낄 수 있다면 87~88
        song7Pattern.add(new TileBeat(87000, 0)); 
        song7Pattern.add(new TileBeat(87300, 1));
        song7Pattern.add(new TileBeat(87600, 2));
        song7Pattern.add(new TileBeat(87900, 3));
        
        // 느낄 수 있다면 88~90
        song7Pattern.add(new TileBeat(88200, 1)); 
        song7Pattern.add(new TileBeat(88500, 2)); 
        song7Pattern.add(new TileBeat(88800, 1)); 
        song7Pattern.add(new TileBeat(89100, 2)); 
        song7Pattern.add(new TileBeat(89400, 1)); 

        // 어디서든 90~92
        song7Pattern.add(new TileBeat(90000, 0));
        song7Pattern.add(new TileBeat(90200, 1)); 
        song7Pattern.add(new TileBeat(90400, 0)); 
        song7Pattern.add(new TileBeat(90600, 1)); 

        // 한눈에 널 알아볼 수 있어 92~94
        song7Pattern.add(new TileBeat(92000, 0));
        song7Pattern.add(new TileBeat(92300, 1)); 
        song7Pattern.add(new TileBeat(92600, 2)); 
        song7Pattern.add(new TileBeat(92900, 3)); 
        song7Pattern.add(new TileBeat(93200, 2)); 
        song7Pattern.add(new TileBeat(93500, 1)); 
        song7Pattern.add(new TileBeat(93800, 0)); 
        song7Pattern.add(new TileBeat(94100, 2)); 
        song7Pattern.add(new TileBeat(94400, 3));
        song7Pattern.add(new TileBeat(94700, 2)); 
        song7Pattern.add(new TileBeat(95000, 1)); 
        
        // catch you catch you 94~96
        song7Pattern.add(new TileBeat(94000, 0)); 
        song7Pattern.add(new TileBeat(94800, 1)); 
        song7Pattern.add(new TileBeat(95600, 2)); 

        // catch you 96~98
        song7Pattern.add(new TileBeat(96000, 1)); 
        song7Pattern.add(new TileBeat(96800, 2)); 
        song7Pattern.add(new TileBeat(97600, 1)); 

        // catch me  98~99
        song7Pattern.add(new TileBeat(98000, 0)); 
        song7Pattern.add(new TileBeat(98200, 1)); 
        song7Pattern.add(new TileBeat(98400, 2)); 
        song7Pattern.add(new TileBeat(98600, 3)); 

        // catch me 99~102
        song7Pattern.add(new TileBeat(99000, 3)); 
        song7Pattern.add(new TileBeat(99400, 2));
        song7Pattern.add(new TileBeat(99800, 1)); 
        song7Pattern.add(new TileBeat(100200, 0)); 
        song7Pattern.add(new TileBeat(100600, 2));
        song7Pattern.add(new TileBeat(101000, 1)); 
        song7Pattern.add(new TileBeat(101400, 2)); 
        song7Pattern.add(new TileBeat(101800, 1)); 

        // 이제 숨바꼭질은 102~103
        song7Pattern.add(new TileBeat(102000, 0)); 
        song7Pattern.add(new TileBeat(102140, 1)); 
        song7Pattern.add(new TileBeat(102280, 2)); 
        song7Pattern.add(new TileBeat(102420, 3)); 
        song7Pattern.add(new TileBeat(102560, 2)); 
        song7Pattern.add(new TileBeat(102700, 1)); 
        song7Pattern.add(new TileBeat(102840, 0)); 
        
        // 그만(그만) 103~106 해당시간 공평하게 시간 분배
        song7Pattern.add(new TileBeat(103000, 2)); 
        song7Pattern.add(new TileBeat(103600, 3)); 
        song7Pattern.add(new TileBeat(104200, 1)); 
        song7Pattern.add(new TileBeat(104800, 2)); 
        song7Pattern.add(new TileBeat(105400, 1)); 
        song7Pattern.add(new TileBeat(106000, 2)); 
         
        // 우울한 것 106~112
        song7Pattern.add(new TileBeat(106000, 0)); 
        song7Pattern.add(new TileBeat(106400, 1)); 
        song7Pattern.add(new TileBeat(106800, 3)); 
        song7Pattern.add(new TileBeat(107200, 2)); 

        // 모두 107~108
        song7Pattern.add(new TileBeat(107600, 1)); 
        song7Pattern.add(new TileBeat(108000, 2)); 

        // 파란하늘에 108~110
        song7Pattern.add(new TileBeat(108400, 1)); 
        song7Pattern.add(new TileBeat(108800, 0)); 
        song7Pattern.add(new TileBeat(109200, 1)); 
        song7Pattern.add(new TileBeat(109600, 2)); 

        // 묻어버려 110~112
        song7Pattern.add(new TileBeat(110000, 3)); 
        song7Pattern.add(new TileBeat(110400, 2));
        song7Pattern.add(new TileBeat(110800, 1)); 
        song7Pattern.add(new TileBeat(111200, 0)); 
       
        // 오늘도 112~113
        song7Pattern.add(new TileBeat(112000, 0)); 
        song7Pattern.add(new TileBeat(112250, 1)); 
        song7Pattern.add(new TileBeat(112500, 2)); 
        song7Pattern.add(new TileBeat(112750, 3)); 

        // 너에게 113~115
        song7Pattern.add(new TileBeat(113000, 1)); 
        song7Pattern.add(new TileBeat(113400, 2)); 
        song7Pattern.add(new TileBeat(113800, 1)); 
        song7Pattern.add(new TileBeat(114200, 2)); 
        song7Pattern.add(new TileBeat(114600, 1)); 
        
        // 달려가는 이 마음 115~117
        song7Pattern.add(new TileBeat(115000, 0)); 
        song7Pattern.add(new TileBeat(115400, 1)); 
        song7Pattern.add(new TileBeat(115800, 2));
        song7Pattern.add(new TileBeat(116200, 3)); 

        // 이 마음 117~119
        song7Pattern.add(new TileBeat(117000, 0)); 
        song7Pattern.add(new TileBeat(117400, 1)); 
        song7Pattern.add(new TileBeat(117800, 2)); 
        song7Pattern.add(new TileBeat(118200, 3)); 
        
        // 나는 119~120
        song7Pattern.add(new TileBeat(119000, 0)); 
        song7Pattern.add(new TileBeat(119500, 1)); 

        // 정말 정말 120~122
        song7Pattern.add(new TileBeat(120000, 2));
        song7Pattern.add(new TileBeat(120500, 3)); 
        song7Pattern.add(new TileBeat(121000, 1));
        song7Pattern.add(new TileBeat(121500, 0)); 

        // 너를 좋아해 122~125 가능하면 800씩 분배
        song7Pattern.add(new TileBeat(122000, 3)); 
        song7Pattern.add(new TileBeat(122800, 2)); 
        song7Pattern.add(new TileBeat(123600, 1)); 
        song7Pattern.add(new TileBeat(124400, 0)); 
        song7Pattern.add(new TileBeat(125200, 2));

        // 브금 125~132
        song7Pattern.add(new TileBeat(125000, 1)); 
        song7Pattern.add(new TileBeat(126000, 2)); 
        song7Pattern.add(new TileBeat(127000, 1)); 
        song7Pattern.add(new TileBeat(128000, 2)); 
        song7Pattern.add(new TileBeat(129000, 1)); 
        song7Pattern.add(new TileBeat(130000, 2)); 
        song7Pattern.add(new TileBeat(131000, 2)); 
        song7Pattern.add(new TileBeat(132000, 1)); 
        song7Pattern.add(new TileBeat(133000, 2)); 
        // 추가 타일 비트
        patterns.put("src/resources/Card Captor Cherry.wav", song7Pattern);
        
        // 8. 다시 만난 세계
        List<TileBeat> song8Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Again meet world.wav", song8Pattern);
        
        // 8. 애상
        List<TileBeat> song9Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/sorrow.wav", song9Pattern);
        
        // 9. 개화
        List<TileBeat> song10Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Flowering.wav", song10Pattern);

        // 10. 캐롤
        List<TileBeat> song11Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Last Christmas.wav", song11Pattern);
        
        // 11. The Drum
        List<TileBeat> song12Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/The Drum.wav", song12Pattern);
        
        // 필요한 만큼 더 추가
    }

    public List<TileBeat> getPattern(String songName) {
        return patterns.getOrDefault(songName, new ArrayList<>());
    }
}

