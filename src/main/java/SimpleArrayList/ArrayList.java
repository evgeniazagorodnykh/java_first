package SimpleArrayList;

public class ArrayList<T> implements Simple<T>{
    private  int size;
    private Object[] array;

    ArrayList() {
        array = new Object[10];
        size = 0;
    }

    @Override
    public void add(T elem) {
        try {
            array[size] = elem;
            size++;
            if(size == array.length){
                Object[] newArray = new Object[array.length*2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void delete(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= 0 && index <= size ){
            for(int i=index;i<size-1;i++){
                array[i]=array[i+1];
            }
            array[size]=null;
            size--;
        }
        else throw new ArrayIndexOutOfBoundsException("The element index is specified incorrectly");
    }

    @Override
    public Object get(int index) {
        if (index >= 0 && index <= size )
            return array[index];
        throw new ArrayIndexOutOfBoundsException(index);
    }

    @Override
    public int size() {
        return size;
    }
}
