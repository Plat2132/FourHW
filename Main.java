package HomeWork;

public class Main {

    public static void main(String[] args) {
	Ford ford = new Ford(4, 2, 70);
	Toyota toyota = new Toyota();
	String aa = "0";
    String b =toyota.get(aa);

    Car[] array = new Car[10];

    array[0] = new Toyota();
    array[1] = new Taxi();
    array[2] = new Ford(5,1,65);
    array[3] = new Toyota();
    array[4] = new Toyota();
    array[5] = new Taxi();
    array[6] = new Toyota();
    array[7] = new Ford(7,4,75);
    array[8] = new Taxi();
    array[9] = new Toyota();

        for (Car a: array) {
            a.setBabySeat((int)(Math.random()*3));
        }
        int k = 0;
        for (Car a: array) {
            k += a.getBabySeat();
        }
        System.out.println(k);

        quickSort(array);
        for (int i=0; i<array.length-1; i++) {
            System.out.println(array[i].getBabySeat());
        }
    
    }

    public static void quickSort(Car array[]) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex, array);
    }

    private static void doSort(int start, int end, Car array[]) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i].getBabySeat() <= array[cur].getBabySeat())) {
                i++;
            }
            while (j > cur && (array[cur].getBabySeat() <= array[j].getBabySeat())) {
                j--;
            }
            if (i < j) {
                Car temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, array);
        doSort(cur+1, end, array);
    }


}
