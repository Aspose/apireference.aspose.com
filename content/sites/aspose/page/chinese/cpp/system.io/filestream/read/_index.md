---
title: "System::IO::FileStream::Read method"
linktitle: "读取"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::FileStream::Read 方法。读取流中指定数量的字节并将其写入 C++ 中的指定字节数组。"
type: docs
weight: 1300
url: /zh/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将它们写入指定的字节数组。

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组。 |
| offset | int32_t | 在 **buffer** 中的基于 0 的起始写入位置。 |
| count | int32_t | 要读取的字节数。 |

### ReturnValue

读取的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将它们写入指定的字节数组。

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组视图。 |
| offset | int32_t | 在 **buffer** 中的基于 0 的起始写入位置。 |
| count | int32_t | 要读取的字节数。 |

### ReturnValue

读取的字节数。

## 另见

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
