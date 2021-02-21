package tools;

public class MaxHeap {
    private int[] data;
    private final int maxSize = 128;  //预设大小，足够就行
    private int heapSize; //实际大小

    public MaxHeap(int[] input) {
        data = new int[maxSize];
        heapSize = input.length;
        for (int i = 0; i < heapSize; i++) {//这个地方其实并不好，只是将传入的数组读入我的数组中，一方有不断插入操作，如果没有插入操作则不必要；
            data[i] = input[i];
        }
    }


    public void build_1() {
        /**
         * 建树方法1：
         *      每次插入一个节点
         */
        int a = heapSize;
        heapSize = 0;
        for (int i = 0; i < a; i++) {
            insert(data[i]);
        }
    }

    public void build_2() {
        /**
         * 建树方法2：
         *      以原来的乱序进行调整：siftDown
         */
        if (heapSize <= 1) return;
        for (int i = getParent(heapSize - 1); i >= 0; i--) {  // 从末元素的父节点开始，一次一次进行siftDown
            siftDown(i);
        }
    }

    /**
     * 由上而下调整， sift——筛
     * @param start
     */
    public void siftDown(int start) {
        //start至少1子，不用担心溢出问题
        while (getLeft(start) < heapSize) {  //注意，这里必须是小于，不能等于，如果该节点的左节点是末尾节点则结束，条件是getLeft(start)==heapSize-1
            int min = 0;//判别有没有发生交换的条件
            //无右子
            if (getRight(start) >= heapSize) {
                if (data[start] > data[getLeft(start)]) {
                    min = getLeft(start);
                    swap(start, min);
                }
            }
            //2子
            else {
                min = data[getLeft(start)] > data[getRight(start)] ? getRight(start) : getLeft(start);
                if (data[start] > data[min]) {
                    swap(start, min);
                }
            }
            if (min == 0) break;//满足堆条件，退出
            start = min; //不满足堆条件，还可以调整，继续循环
        }
    }

    /**
     * 由下而上调整
     * @param start 开始的下标
     */
    public void siftUp(int start) {
        if (start <= 0) return;
        while (data[start] < data[getParent(start)]) {  //一直发生交换，直到满足条件
            swap(start, getParent(start));
            start = getParent(start);
            if (start <= 0) break;// root
        }
    }

    public void insert(int a) {
        /**
         * 插入的话会使数组长度加一，比较麻烦，于是我建立一个比较大的树，用一个较大的量maxSize来限定堆的最大容量，用heapSize来声明实际的容量
         */
        data[heapSize] = a;
        siftUp(heapSize);
        heapSize++;
    }

    public int getLeft(int i) {
        return 2 * i + 1;
    }

    public int getRight(int i) {
        return 2 * i + 2;
    }

    public int getParent(int i) {
        if (i == 0) return -1;
        return (i - 1) >> 1;  //除以2
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void display() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] a = new int[]{8, 12, 2, 5, 3, 7, -1, 44, 23};
    }
}