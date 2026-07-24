---
title: "System::BitConverter::ToString method"
linktitle: "ToString"
second_title: "Aspose.Page 适用于 C++"
description: "System::BitConverter::ToString 方法。将指定字节数组的所有值转换为十六进制字符串表示。十六进制表示中使用的字母大小写以及在相邻字节对之间插入的分隔符，可通过 C++ 中的相应参数指定。"
type: docs
weight: 1200
url: /zh/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


将指定字节数组的所有值转换为十六进制字符串表示。十六进制表示中使用的字母大小写以及在相邻字节对之间插入的分隔符通过相应参数指定。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 包含要转换的字节的 [Array](../../array/) |
| 大写 | bool | 指定在生成的十六进制表示中使用的字母大小写 |
| 分隔符 | const String\& | 用于在生成的字符串中在相邻字节对之间插入的分隔符字符串 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


将指定字节数组的值从指定索引开始转换为十六进制字符串表示。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 包含要转换的字节的 [Array](../../array/) |
| startIndex | int | 在指定数组中开始转换的索引 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


将指定字节数组的一段值转换为十六进制字符串表示。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | 包含要转换的字节的 [Array](../../array/) |
| startIndex | int | 在指定数组中待转换字节数组元素范围的起始索引 |
| length | int | 待转换字节数组元素范围的长度 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
