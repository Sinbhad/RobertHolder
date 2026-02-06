package src;

public class RobertHolder {
    private String[] bucket;
    private int size;

    public RobertHolder(){
        bucket = new String[10];
        size = 0;
    }

    public void addToBucket(String thing){
        if(size == bucket.length){
           doubleBucketSize();
        }
        bucket[size] = thing;
        size++;
    }

    public int size(){
        return size;
    }

    public void getStringAtIndex(int index){
        System.out.println(bucket[index]);
    }

    public void clearBucket(){
        bucket = new String[10];
        size = 0;
    }

    public void printAll(){
        for(int i = 0; i < bucket.length; i++){
            System.out.print("[" + bucket[i] + "]");
        }
    }

    public void addAtIndex(int index, String thing) {
        if (size == bucket.length){
            doubleBucketSize();
        }
        for (int i = size; i > index; i--) {
            bucket[i] = bucket[i - 1];
        }
        bucket[index] = thing;
        size++;
    }

    public void replaceAtIndex(int index, String thing){
        if (size == bucket.length){
            doubleBucketSize();
        }
        bucket[index] = thing;
    }

    public void find(String thing){
        for(int i = 0; i < size; i++){
            if(bucket[i].equalsIgnoreCase(thing)){
                System.out.println(thing + " is in the array!");
            }
        }
    }

    public void findCount(String thing ){
        int count = 0;
        for(int i = 0; i < size - 1; i++){
            if(bucket[i].equalsIgnoreCase(thing)){
                count++;
            }
        }
        System.out.println(thing + " was found in the array " + count + " times!");
    }

    public void removeAtIndex(int index){
        bucket[index] = null;
        for(int i = index; i < size - 1; i++){
            bucket[i] = bucket[i + 1];
        }
        bucket[size - 1] = null;
        size--;
    }

    public void doubleBucketSize(){
        String[] bucket2 = new String[bucket.length * 2];
        for(int i = 0; i < bucket.length; i++){
            bucket2[i] =  bucket[i];
        }
        bucket = bucket2;
    }

    public void addToEnd(String thing){
        if (size == bucket.length){
            doubleBucketSize();
        }
        bucket[size] = thing;
        size++;
    }

    public RobertHolder cloneClass(){
        RobertHolder robertCopy = new RobertHolder();
        robertCopy.bucket = new String[this.bucket.length];
        for(int i = 0; i < size; i++){
            robertCopy.bucket[i] = this.bucket[i];
        }
        robertCopy.size = this.size;
        return robertCopy;
    }

    public String[] getBucket(){
        String[] arrayValues = new String[size];
        for(int i = 0; i < size; i++){
            arrayValues[i] = bucket[i];
        }
        return arrayValues;
    }
}
