---
title: "System::IO::BasicSTDIStreamWrapper::Read 方法"
linktitle: "读取"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::BasicSTDIStreamWrapper::Read 方法。若包装模式为二进制，则从流中读取指定字节数；否则读取指定字符数并将其转换为 uint8_t 类型。将读取结果写入 C++ 中指定的字节数组。"
type: docs
weight: 400
url: /zh/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


如果包装模式为二进制，则从流中读取指定字节数；否则读取指定字符数并将其转换为 uint8_t 类型。将读取结果写入指定的字节数组。

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数或字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将它们写入指定的字节数组。

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组视图 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

已读取的字节数

## 另见

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
