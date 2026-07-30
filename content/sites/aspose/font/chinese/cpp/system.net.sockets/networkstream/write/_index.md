---
title: "System::Net::Sockets::NetworkStream::Write 方法"
linktitle: "Write"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::NetworkStream::Write 方法。将指定字节数组中的指定子范围字节写入 C++ 中的流。"
type: docs
weight: 2500
url: /zh/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要写入的子范围中元素的数量。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


将指定字节数组中的指定子范围字节写入流。

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | 包含要写入字节的数组视图 |
| offset | int32_t | 在 **buffer** 中子范围写入开始的 0 基索引 |
| size | int32_t | 要写入的子范围中元素的数量 |

## 另见

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
