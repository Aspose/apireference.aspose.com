---
title: "System::IO::BufferedStream::Read 方法"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BufferedStream::Read 方法。从底层流读取指定数量的字节并写入指定的字节数组（C++）。"
type: docs
weight: 900
url: /zh/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从底层流读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从底层流读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
