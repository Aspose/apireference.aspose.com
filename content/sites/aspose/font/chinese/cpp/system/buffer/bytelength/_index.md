---
title: "System::Buffer::ByteLength 方法"
linktitle: "ByteLength"
second_title: "Aspose.Font 适用于 C++"
description: "System::Buffer::ByteLength 方法。确定在 C++ 中指定数组的所有元素所占用的字节数。"
type: docs
weight: 200
url: /zh/cpp/system/buffer/bytelength/
---
## Buffer::ByteLength(const SharedPtr\<Array\<T\>\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T> static int System::Buffer::ByteLength(const SharedPtr<Array<T>> &array)
```


| 参数 | 描述 |
| --- | --- |
| T | 数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const SharedPtr\<Array\<T\>\>\& | 一个数组 |

### ReturnValue

指定数组的所有元素所占用的字节数

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::ByteLength(const System::Details::ArrayView\<T\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T> static int System::Buffer::ByteLength(const System::Details::ArrayView<T> &array)
```


| 参数 | 描述 |
| --- | --- |
| T | 数组视图的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const System::Details::ArrayView\<T\>\& | 一个数组视图 |

### ReturnValue

指定数组视图的所有元素所占用的字节数

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::ByteLength(const System::Details::StackArray\<T, N\>\&) method


确定指定数组中所有元素占用的字节数。

```cpp
template<class T,std::size_t> static int System::Buffer::ByteLength(const System::Details::StackArray<T, N> &array)
```


| 参数 | 描述 |
| --- | --- |
| T | 栈数组的元素类型 |
| N | 栈数组的大小 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数组 | const System::Details::StackArray\<T, N\>\& | 一个栈数组 |

### ReturnValue

指定栈数组的所有元素所占用的字节数

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
