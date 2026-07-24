---
title: "System::Buffer::SetByte method"
linktitle: "SetByte"
second_title: "Aspose.Page 适用于 C++"
description: "System::Buffer::SetByte method. 将指定的类型化数组解释为原始字节数组，并在指定的字节偏移处设置指定的字节值（在 C++ 中）。"
type: docs
weight: 400
url: /zh/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定字节偏移处设置指定的字节值。

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | 目标数组 |
| 索引 | int | 要设置的字节的零基偏移量 |
| value | uint8_t | 要设置的字节值 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定字节偏移处设置指定的字节值。

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | 目标数组视图 |
| 索引 | int | 要设置的字节的零基偏移量 |
| value | uint8_t | 要设置的字节值 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定字节偏移处设置指定的字节值。

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组中元素的类型 |
| N | 堆栈数组的大小 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | 目标堆栈数组 |
| 索引 | int | 要设置的字节的零基偏移量 |
| value | uint8_t | 要设置的字节值 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
