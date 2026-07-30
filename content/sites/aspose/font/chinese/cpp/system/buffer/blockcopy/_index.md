---
title: "System::Buffer::BlockCopy 方法"
linktitle: "BlockCopy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Buffer::BlockCopy 方法。将两个指定的已类型化数组解释为原始字节数组，并在 C++ 中将数据从其中一个复制到另一个。"
type: docs
weight: 100
url: /zh/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源数组的元素类型 |
| TDst | 目标数组的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 源数组 |
| srcOffset | int | 源数组中的字节偏移量，复制从此处开始 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 目标数组 |
| dstOffset | int | 在目标数组中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源数组的元素类型 |
| TDst | 目标数组视图的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 源数组 |
| srcOffset | int | 源数组中的字节偏移量，复制从此处开始 |
| dst | const System::Details::ArrayView\<TDst\>\& | 目标数组视图 |
| dstOffset | int | 在目标数组视图中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源数组的元素类型 |
| TDst | 目标堆栈数组的元素类型 |
| ND | 目标堆栈数组的大小 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | 源数组 |
| srcOffset | int | 源数组中的字节偏移量，复制从此处开始 |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 目标堆栈数组 |
| dstOffset | int | 在目标堆栈数组中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源数组视图的元素类型 |
| TDst | 目标数组的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | 源数组视图 |
| srcOffset | int | 在源数组视图中开始复制的字节偏移量 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 目标数组 |
| dstOffset | int | 在目标数组中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源数组视图的元素类型 |
| TDst | 目标数组视图的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | 源数组视图 |
| srcOffset | int | 在源数组视图中开始复制的字节偏移量 |
| dst | const System::Details::ArrayView\<TDst\>\& | 目标数组视图 |
| dstOffset | int | 在目标数组视图中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源堆栈数组的元素类型 |
| NS | 源堆栈数组的大小 |
| TDst | 目标数组的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | 源堆栈数组 |
| srcOffset | int | 在源堆栈数组中开始复制的字节偏移量 |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 目标数组 |
| dstOffset | int | 在目标数组中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


将两个指定的类型化数组解释为原始字节数组，并将其中一个的数据复制到另一个。

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| 参数 | 描述 |
| --- | --- |
| TSrc | 源堆栈数组的元素类型 |
| NS | 源堆栈数组的大小 |
| TDst | 目标堆栈数组的元素类型 |
| ND | 目标堆栈数组的大小 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | 源堆栈数组 |
| srcOffset | int | 在源堆栈数组中开始复制的字节偏移量 |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 目标堆栈数组 |
| dstOffset | int | 在目标堆栈数组中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


将指定数量的字节从源缓冲区复制到目标缓冲区。

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| src | const uint8_t * | 指向源缓冲区的指针 |
| srcOffset | int | 在源缓冲区中开始复制的字节偏移量 |
| dst | uint8_t * | 指向目标缓冲区的指针 |
| dstOffset | int | 在目标缓冲区中开始插入数据的字节偏移量 |
| count | int | 要复制的字节数 |

## 另见

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
