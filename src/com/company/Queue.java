package com.company;

public class Queue
{
    private int size;
    private int startPointer = -1;
    private int endPointer = 0;
    private int dataSize = 0;
    private Object[] data;

    public Queue(int s)
    {
        size = s;
        data = new Object[s];
    }

    public Object Dequeue()
    {
        if (dataSize <= 0)
        {
            throw new IllegalArgumentException("There is no data to pop.");
        }

        startPointer++;
        dataSize--;

        return data[(startPointer % size)];
    }

    public void Enqueue(Object d)
    {
        if (dataSize > size - 1)
        {
            throw new IllegalArgumentException("There is no free space to push data.");
        }

        data[endPointer % size] = d;

        endPointer++;
        dataSize++;
    }
}
