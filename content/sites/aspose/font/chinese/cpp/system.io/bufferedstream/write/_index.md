---
title: "System::IO::BufferedStream::Write 方法"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BufferedStream::Write 方法。将指定字节数组中指定的字节子范围写入底层流（C++）。"
type: docs
weight: 1400
url: /zh/cpp/system.io/bufferedstream/write/
---
## BufferedStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中指定子范围的字节写入底层流。

```cpp
virtual void System::IO::BufferedStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组 |
| offset | int32_t | 在 **buffer** 中写入子范围开始的 0 基索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中指定子范围的字节写入底层流。

```cpp
virtual void System::IO::BufferedStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 包含要写入字节的数组 |
| offset | int32_t | 在 **buffer** 中写入子范围开始的 0 基索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
