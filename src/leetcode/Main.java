package leetcode;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    private static final String[] ADDRESS={
            "广东省广州市海珠区滨江西路","广东省广州市海珠区滨江东路","广东省广州市海珠区滨江中路",
            "广东省广州市海珠区滨江南路","广东省广州市海珠区滨江北路","广东省广州市海珠区滨江路",
            "广东省广州市天河区天河北路","广东省广州市天河区天河南路","广东省广州市天河区天河东路",
            "广东省广州市天河区天河西路","广东省广州市天河区天河中路","广东省广州市天河区天河路",
    };

    private static final String[] FIRST_NAMES = {
            "张", "王", "李", "赵", "陈", "刘", "杨", "黄", "吴", "周",
            "徐", "孙", "马", "朱", "胡", "林", "郭", "何", "高", "罗"
            // 添加更多中文姓氏
    };

    private static final String[] PHONE_NUMBER={
            "1","2","3","4","5","6","7","8","9","0"
    };

    private static final String[] LAST_NAMES = {
            "伟", "芳", "娜", "秀英", "敏", "静", "丽", "强", "磊", "艳",
            "勇", "军", "杰", "娟", "涛", "明", "超", "霞", "平", "刚"
            // 添加更多中文名字
    };

    private static final String[] LAST_NAMES2={
    		"伟", "芳", "娜", "秀英", "敏", "静", "丽", "强", "磊", "艳",
            "勇", "军", "杰", "娟", "涛", "明", "超", "霞", "平", "刚"
    };

    private static final String[] SEX= {
            "男", "女"
    };

    private static final String[] BODYSTYLE={
            "两厢车",
           "三厢车",
           "掀背车",
            "旅行车",
           "硬顶敞篷车",
           "软顶敞篷车",
           "跑车",
            "MPV",
    };
    private static final String[] MID={
            "昂科威",
            "君越",
            "卢塞恩",
            "水手",
            "米兰",
            "Sable",
            "Grand Marquis"
    };
    private static final String[] COLOR={
            "白色",
            "黑色",
            "红色",
            "蓝色",
            "黄色",
            "绿色",
            "紫色",
            "橙色",
            "灰色",
            "棕色",
            "粉色",
            "青色",
            "银色",
            "金色",
    };
    public static String generateRandomChineseName(Set<String> usedNames) {
        Random random = new Random();

        while (true) {
            String fullName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)]
                    + LAST_NAMES[random.nextInt(LAST_NAMES.length)]+LAST_NAMES2[random.nextInt(LAST_NAMES2.length)];

            // 检查名字是否已经被使用
            if (!usedNames.contains(fullName)) {
                // 将名字加入已使用名字的集合
                usedNames.add(fullName);
                return fullName;
            }
        }
    }

    public static String generateRandomAddress() {
        Random random = new Random();
        return ADDRESS[random.nextInt(ADDRESS.length)];
    }

    public static void generateRandomPhoneNumber() {
        Random random = new Random();
        for (int j = 0; j < 50; j++) {
            System.out.print("1");
            for (int i = 0; i < 10; i++) {
                String num = PHONE_NUMBER[random.nextInt(PHONE_NUMBER.length)];
                System.out.print(num);
            }
            System.out.println();
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // 用于存储已使用的名字的集合
        Set<String> usedNames = new HashSet<>();

        // 生成随机中文名
        String randomChineseName = generateRandomChineseName(usedNames);

        // 输出随机中文名
        for(int i=0;i<50;i++)
        //System.out.println(generateRandomPhoneNumber());
        System.out.println(MID[new Random().nextInt(MID.length)]);
    }
}
