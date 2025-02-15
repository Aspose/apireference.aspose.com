---
title: Buffer
second_title: Aspose.Slides for C++ API Reference
description: Contains methods that manipulate raw byte arrays. This is a static type with no instance services. You should never create instances of it by any means.
type: docs
weight: 105
url: /cpp/system/buffer/
---
## Buffer class


Contains methods that manipulate raw byte arrays. This is a static type with no instance services. You should never create instances of it by any means.

```cpp
class Buffer
```

## Methods

| Method | Description |
| --- | --- |
| static void [BlockCopy](./blockcopy/)(const **uint8_t** *, int, **uint8_t** *, int, int) | Copies a specified number of bytes from source buffer to destination buffer. |
| static void [BlockCopy](./blockcopy/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TSrc\>\>\&, int, const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TDst\>\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TDst\>\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static void [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const [SharedPtr](../sharedptr/)\<[Array](../array/)\<TDst\>\>\&, int, int) | Interprets two specified typed arrays as raw arrays of bytes and copies data from one of them to another. |
| static int [ByteLength](./bytelength/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<T\>\>\&) | Determines the number of bytes occupied by all elements of the specified array. |
| static int [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Determines the number of bytes occupied by all elements of the specified array. |
| static int [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Determines the number of bytes occupied by all elements of the specified array. |
| static **uint8_t** [GetByte](./getbyte/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<T\>\>\&, int) | Interprets the specified typed array as a raw byte array and retrieves the byte value at specified byte offset. |
| static **uint8_t** [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Interprets the specified typed array as a raw byte array and retrieves the byte value at specified byte offset. |
| static **uint8_t** [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Interprets the specified typed array as a raw byte array and retrieves the byte value at specified byte offset. |
| static void [SetByte](./setbyte/)(const [SharedPtr](../sharedptr/)\<[Array](../array/)\<T\>\>\&, int, **uint8_t**) | Interprets the specified typed array as a raw byte array and sets the specified byte value at specified byte offset. |
| static void [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, **uint8_t**) | Interprets the specified typed array as a raw byte array and sets the specified byte value at specified byte offset. |
| static void [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, **uint8_t**) | Interprets the specified typed array as a raw byte array and sets the specified byte value at specified byte offset. |
## Remarks



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Create and fill the array.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Print the array items.
  Print(first, SIZE);

  // Create an array that contains a part of the first one.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Print the items of the second array.
  Print(second, SIZE / 2);

  // Set the value of the item at index 0 and print the array items.
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## See Also

* Namespace [System](../)
* Library [Aspose.Slides](../../)