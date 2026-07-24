---
title: "System::IO::Stream::Write 方法"
linktitle: "Write"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Stream::Write 方法。将指定字节数组中的指定子范围字节写入流中，使用 C++。"
type: docs
weight: 2600
url: /zh/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的 0 基索引 |
| count | int32_t | 要写入的子范围中的元素数量 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const System::Details::ArrayView\<uint8_t\>\& | 包含要写入的字节的数组视图 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的 0 基索引 |
| count | int32_t | 要写入的子范围中的元素数量 |

## 另见

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | 描述 |
| --- | --- |
| N | 堆栈数组的大小 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const System::Details::StackArray\<uint8_t, N\>\& | 包含待写入字节的栈数组 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的 0 基索引 |
| count | int32_t | 要写入的子范围中的元素数量 |

## 另见

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
