
public Object removeNew(int indexToBeDeleted) {
    if (indexToBeDeleted < 0 || indexToBeDeleted >= index)
        return null;
    Object removedElement = this.obj[indexToBeDeleted];
    // By copized size we means number of iteration.
    int CopiedSize = this.obj.length - indexToBeDeleted - 1;

    /*
     * 1. Source array
     * 2. Starting position in the source array
     * 3. Destination array
     * 4. Starting position in the destination array
     * 5. Number of elements to copy
     */
    System.arraycopy(this.obj, indexToBeDeleted + 1, this.obj, indexToBeDeleted, CopiedSize);

    index--;
    // this.obj[index] = null;
    // System.out.println(Arrays.toString(this.obj));
    return removedElement;
}