package org.prototype.prototype;

public interface Prototype<T extends Prototype> extends Cloneable{
    public T clone();
    public T deepClone();
}
