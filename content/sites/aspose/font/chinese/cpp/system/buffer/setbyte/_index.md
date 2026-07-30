---
title: "System::Buffer::SetByte 方法"
linktitle: "SetByte"
second_title: "Aspose.Font 适用于 C++"
description: "System::Buffer::SetByte 方法。将指定的类型化数组解释为原始字节数组，并在 C++ 中的指定字节偏移处设置指定的字节值。"
type: docs
weight: 400
url: /zh/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定的字节偏移处设置指定的字节值。

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| 参数 | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const SharedPtr\<Array\<T\>\>\& | 目标数组 |
| 索引 | int | 要设置的字节的零基偏移量 |
| 值 | uint8_t | 要设置的字节值 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定的字节偏移处设置指定的字节值。

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| 参数 | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const System::Details::ArrayView\<T\>\& | 目标数组视图 |
| 索引 | int | 要设置的字节的零基偏移量 |
| 值 | uint8_t | 要设置的字节值 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


将指定的类型化数组解释为原始字节数组，并在指定的字节偏移处设置指定的字节值。

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| 参数 | 描述 |
| --- | --- |
| T | 数组中元素的类型 |
| N | 栈数组的大小 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const System::Details::StackArray\<T, N\>\& | 目标栈数组 |
| 索引 | int | 要设置的字节的零基偏移量 |
| 值 | uint8_t | 要设置的字节值 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
