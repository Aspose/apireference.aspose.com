---
title: "System::Buffer::GetByte 方法"
linktitle: "GetByte"
second_title: "Aspose.Page 适用于 C++"
description: "System::Buffer::GetByte 方法。解释指定的类型化数组为原始字节数组，并在 C++ 中检索指定字节偏移处的字节值。"
type: docs
weight: 300
url: /zh/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


将指定的类型化数组解释为原始字节数组，并检索在指定字节偏移处的字节值。

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | 目标数组 |
| 索引 | int | 要检索的字节的零基偏移量 |

### ReturnValue

指定索引处的字节值

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


将指定的类型化数组解释为原始字节数组，并检索在指定字节偏移处的字节值。

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组视图中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | 目标数组视图 |
| 索引 | int | 要检索的字节的零基偏移量 |

### ReturnValue

指定索引处的字节值

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


将指定的类型化数组解释为原始字节数组，并检索在指定字节偏移处的字节值。

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | 描述 |
| --- | --- |
| T | 栈数组中元素的类型 |
| N | 堆栈数组的大小 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | 目标堆栈数组 |
| 索引 | int | 要检索的字节的零基偏移量 |

### ReturnValue

指定索引处的字节值

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
