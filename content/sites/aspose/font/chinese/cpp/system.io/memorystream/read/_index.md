---
title: "System::IO::MemoryStream::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::MemoryStream::Read 方法。从流中读取指定数量的字节并写入指定的字节数组（C++）。"
type: docs
weight: 1100
url: /zh/cpp/system.io/memorystream/read/
---
## MemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
int32_t System::IO::MemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
int32_t System::IO::MemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组视图 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
