---
title: "System::IO::BasicSTDIOStreamWrapper::Read method"
linktitle: "Read"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read method. 如果包装模式为二进制，则从流中读取指定数量的字节；否则，读取指定数量的字符并将其转换为 uint8_t 类型。将读取的结果写入指定的字节数组（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


如果包装模式是二进制，则从流中读取指定数量的字节；否则读取指定数量的字符并将其转换为 uint8_t 类型。将读取的结果写入指定的字节数组。

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数或字符数

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


从流中读取指定数量的字节并将其写入指定的字节数组。

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 用于写入读取字节的字节数组视图 |
| offset | int32_t | 在 **buffer** 中开始写入的 0 基位置 |
| count | int32_t | 要读取的字节数 |

### ReturnValue

读取的字节数

## 另见

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
