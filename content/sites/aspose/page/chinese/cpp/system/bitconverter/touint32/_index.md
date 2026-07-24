---
title: "System::BitConverter::ToUInt32 method"
linktitle: "ToUInt32"
second_title: "Aspose.Page 适用于 C++"
description: "System::BitConverter::ToUInt32 方法。将指定数组中从指定索引开始的四个字节转换为 C++ 中的无符号 32 位整数值。"
type: docs
weight: 1400
url: /zh/cpp/system/bitconverter/touint32/
---
## BitConverter::ToUInt32(const System::ArrayPtr\<uint8_t\>\&, int) method


将指定数组中从指定索引开始的四个字节转换为无符号 32 位整数值。

```cpp
static uint32_t System::BitConverter::ToUInt32(const System::ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const System::ArrayPtr\<uint8_t\>\& | 包含要转换的字节的 [Array](../../array/) |
| startIndex | int | 在数组中开始获取用于转换的字节的索引 |

### ReturnValue

转换后得到的无符号 32 位整数值

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToUInt32(const System::Details::ArrayView\<uint8_t\>\&, int) method


将指定数组中从指定索引开始的四个字节转换为无符号 32 位整数值。

```cpp
static uint32_t System::BitConverter::ToUInt32(const System::Details::ArrayView<uint8_t> &value, int startIndex)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const System::Details::ArrayView\<uint8_t\>\& | 包含待转换字节的 ArrayView |
| startIndex | int | 在数组中开始获取用于转换的字节的索引 |

### ReturnValue

转换后得到的无符号 32 位整数值

## 另见

* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
