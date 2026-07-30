---
title: "System::Xml::XmlConvert::ToDateTime 方法"
linktitle: "ToDateTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlConvert::ToDateTime 方法。将 String 转换为 C++ 中的 DateTime 等价类型。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


将 [String](../../../system/string/) 转换为 [DateTime](../../../system/datetime/) 等价类型。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 待转换的字符串。 |

### ReturnValue

字符串的 [DateTime](../../../system/datetime/) 等价类型。

## 另见

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


将 [String](../../../system/string/) 转换为 [DateTime](../../../system/datetime/) 等价类型。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 待转换的字符串。 |
| formats | const ArrayPtr\<String\>\& | 一个数组，包含要应用于已转换的 [DateTime](../../../system/datetime/) 的格式结构。有效格式包括 "yyyy-MM-ddTHH:mm:sszzzzzz" 及其子集。 |

### ReturnValue

字符串的 [DateTime](../../../system/datetime/) 等价类型。

## 另见

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


将 [String](../../../system/string/) 转换为 [DateTime](../../../system/datetime/) 等价类型。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 待转换的字符串。 |
| format | const String\& | 要应用于已转换的 [DateTime](../../../system/datetime/) 的格式结构。有效格式包括 "yyyy-MM-ddTHH:mm:sszzzzzz" 及其子集。字符串将根据此格式进行验证。 |

### ReturnValue

字符串的 [DateTime](../../../system/datetime/) 等价类型。

## 另见

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


使用指定的 [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) 将 [String](../../../system/string/) 转换为 [DateTime](../../../system/datetime/)。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的 [String](../../../system/string/) 值。 |
| dateTimeOption | XmlDateTimeSerializationMode | 枚举值之一，用于指定日期是否应转换为本地时间，或在它是 UTC 日期时保持为协调世界时 (UTC)。 |

### ReturnValue

一个 [DateTime](../../../system/datetime/) 等价于 [String](../../../system/string/) 的值。

## 另见

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
