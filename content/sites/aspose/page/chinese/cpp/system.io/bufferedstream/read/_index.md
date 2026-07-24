---
title: "System::IO::BufferedStream::Read 方法"
linktitle: "读取"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BufferedStream::Read 方法。读取底层流中指定数量的字节，并将它们写入指定的字节数组（C++）。"
type: docs
weight: 900
url: /zh/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从底层流读取指定数量的字节并将它们写入指定的字节数组。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

已读取的字节数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从底层流读取指定数量的字节并将它们写入指定的字节数组。

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

已读取的字节数

## 另见

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
