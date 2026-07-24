---
title: "System::Buffer::ByteLength method"
linktitle: "ByteLength"
second_title: "Aspose.Page 适用于 C++"
description: "System::Buffer::ByteLength method. 确定指定数组中所有元素占用的字节数（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/system/buffer/bytelength/
---
## Buffer::ByteLength(const SharedPtr\<Array\<T\>\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T> static int System::Buffer::ByteLength(const SharedPtr<Array<T>> &array)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | 数组 |

### ReturnValue

指定数组中所有元素占用的字节数

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::ByteLength(const System::Details::ArrayView\<T\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T> static int System::Buffer::ByteLength(const System::Details::ArrayView<T> &array)
```


| Parameter | 描述 |
| --- | --- |
| T | 数组视图中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | 数组视图 |

### ReturnValue

指定数组视图中所有元素占用的字节数

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::ByteLength(const System::Details::StackArray\<T, N\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T,std::size_t> static int System::Buffer::ByteLength(const System::Details::StackArray<T, N> &array)
```


| Parameter | 描述 |
| --- | --- |
| T | 栈数组中元素的类型 |
| N | 堆栈数组的大小 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | 栈数组 |

### ReturnValue

指定栈数组中所有元素占用的字节数

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
