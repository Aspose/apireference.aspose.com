---
title: "System::IO::Stream::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream::Read 方法。从流中读取指定数量的字节并将其写入指定的字节数组，在 C++ 中实现。"
type: docs
weight: 1800
url: /zh/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组视图 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| 参数 | 描述 |
| --- | --- |
| N | 栈数组的大小 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | 用于写入读取字节的字节栈数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
