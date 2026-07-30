---
title: "System::IO::FileStream::Write 方法"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileStream::Write 方法。将指定字节数组中的指定子范围字节写入 C++ 中的流。"
type: docs
weight: 1900
url: /zh/cpp/system.io/filestream/write/
---
## FileStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::IO::FileStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组。 |
| offset | int32_t | 在 **buffer** 中子范围写入开始处的 0 基索引。 |
| count | int32_t | 要写入的子范围中元素的数量。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::IO::FileStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 包含待写入字节的数组视图。 |
| offset | int32_t | 在 **buffer** 中子范围写入开始处的 0 基索引。 |
| count | int32_t | 要写入的子范围中元素的数量。 |

## 另见

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
