---
title: "System::BitConverter::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Font 适用于 C++"
description: "System::BitConverter::ToString 方法。将指定字节数组的所有值转换为其十六进制字符串表示形式。十六进制表示中使用的字母大小写以及在相邻字节对之间插入的分隔符通过 C++ 中的相应参数指定。"
type: docs
weight: 1200
url: /zh/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


将指定字节数组的所有值转换为其十六进制字符串表示形式。十六进制表示中使用的字母大小写以及在相邻字节对之间插入的分隔符通过相应参数指定。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) 包含要转换的字节 |
| 大写 | bool | 指定在生成的十六进制表示中使用的字母大小写 |
| 分隔符 | const String\& | 用于在生成的字符串中插入在相邻字节对之间的分隔符的字符串 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


从指定索引开始，将指定字节数组的值转换为其十六进制字符串表示形式。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) 包含要转换的字节 |
| startIndex | int | 在指定数组中开始转换的索引 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


将指定字节数组的一段值转换为其十六进制字符串表示形式。

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) 包含要转换的字节 |
| startIndex | int | 在指定数组中要转换的字节数组元素范围开始的索引 |
| 长度 | int | 要转换的字节数组元素范围的长度 |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## 另见

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
