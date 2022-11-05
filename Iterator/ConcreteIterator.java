package Iterator;

public class ConcreteIterator extends Iterator{

    private int current = -1;

    @Override
    public char First() {
        current = 0;
        return str.charAt(current);
    }

    @Override
    public char Last() {
        current = str.length()-1;
        return str.charAt(current);
    }

    @Override
    public char next() {
        current += 1;
        if(current < str.length()) return str.charAt(current);
        return ' ';
    }

    @Override
    public char prior() {
        current -= 1;
        if(current >= 0) return str.charAt(current);
        return ' ';
    }

    @Override
    public int currentIndex() {
        return current;
    }

    @Override
    public Boolean isDone() {
        if(current>=0 && current<str.length()) return false;
        return true;
    }
}
