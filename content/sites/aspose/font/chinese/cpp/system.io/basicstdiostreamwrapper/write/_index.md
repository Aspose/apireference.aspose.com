---
title: "System::IO::BasicSTDIOStreamWrapper::Write method"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BasicSTDIOStreamWrapper::Write method. 如果包装模式为二进制，则将指定字节数组中指定的子范围字节写入流；否则，将指定字节数组中指定的子范围字节转换为 char_type 类型，然后将结果写入流（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.io/basicstdiostreamwrapper/write/
---
## BasicSTDIOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


如果包装模式为二进制，则将指定字节数组中指定的子范围字节写入流；否则将指定字节数组中指定的子范围字节转换为 [char_type](../char_type/) 类型，然后将结果写入流。

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的基于 0 的索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 包含要写入字节的数组视图 |
| offset | int32_t | 在 **buffer** 中子范围写入开始的 0 基索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
