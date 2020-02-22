public class Candy implements Comparable<Candy> {
    private int sugarContent;
    private int index;

    public Candy(int index, int value) {
        this.sugarContent = value;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    @Override
    public int compareTo(Candy o) {
        if (this.sugarContent == o.sugarContent) {
            return this.index - o.index;
        }
        return this.sugarContent - o.sugarContent;
    }
}
