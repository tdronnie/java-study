package mission;

public class Mission2 {

    public static class ItemCounter {
        private static int totalCount;

        static void addItem(){
            totalCount++;
        }

        public int getTotalCount(){
            return this.totalCount;
        }
    }

    public static void main(String[] args) {
        ItemCounter counter1 = new ItemCounter();
        ItemCounter counter2 = new ItemCounter();

        System.out.println(ItemCounter.totalCount); //ItemCounter의 static 변수 totalCount 확인

        counter1.addItem(); //counter1 totalCount 증가
        counter1.addItem(); //counter1 totalCount 증가
        System.out.println(counter1.getTotalCount()); // counter1 인스턴스의 TotalCount 확인

        System.out.println(counter2.getTotalCount()); //counter1 변수 처리 후 counter2 인스턴스의 TotalCount 확인
        counter2.addItem(); //counter2 totalCount 증가
        System.out.println(counter2.getTotalCount()); //counter2 변수 처리 후 counter2 인스턴스의 TotalCount 확인


    }

}


