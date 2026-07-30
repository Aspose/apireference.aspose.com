---
title: "System::IO::MemoryStream::Write 方法"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::MemoryStream::Write 方法。将指定字节数组中指定的子范围字节写入流（C++）。"
type: docs
weight: 1900
url: /zh/cpp/system.io/memorystream/write/
---
## MemoryStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::IO::MemoryStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的基于 0 的索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::IO::MemoryStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 包含要写入字节的数组视图 |
| offset | int32_t | 在 **buffer** 中子范围写入开始位置的基于 0 的索引 |
| count | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
