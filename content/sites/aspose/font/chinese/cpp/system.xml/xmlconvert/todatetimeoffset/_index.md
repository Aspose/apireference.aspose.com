---
title: "System::Xml::XmlConvert::ToDateTimeOffset 方法"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset 方法。将提供的 String 转换为 C++ 中的 DateTimeOffset 等价类型。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


将提供的 [String](../../../system/string/) 转换为 [DateTimeOffset](../../../system/datetimeoffset/) 等价类型。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 要转换的字符串。该字符串必须符合 W3C 推荐的 XML dateTime 类型的子集。欲了解更多信息，请参阅 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 部分的 XML [Schema](../../../system.xml.schema/) 规范。 |

### ReturnValue

提供的字符串对应的 [DateTimeOffset](../../../system/datetimeoffset/) 等价形式。

## 另见

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


将提供的 [String](../../../system/string/) 转换为 [DateTimeOffset](../../../system/datetimeoffset/) 等价类型。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 待转换的字符串。 |
| formats | const ArrayPtr\<String\>\& | 一个可用于转换 **s** 的格式数组。**formats** 中的每个格式都可以是 W3C 推荐的 XML dateTime 类型的任意子集。欲了解更多信息，请参阅 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 部分的 XML [Schema](../../../system.xml.schema/) 规范。字符串 **s** 将根据这些格式之一进行验证。 |

### ReturnValue

提供的字符串对应的 [DateTimeOffset](../../../system/datetimeoffset/) 等价形式。

## 另见

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


将提供的 [String](../../../system/string/) 转换为 [DateTimeOffset](../../../system/datetimeoffset/) 等价类型。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | const String\& | 待转换的字符串。 |
| format | const String\& | 用于转换 **s** 的格式。format 参数可以是 W3C 推荐的 XML dateTime 类型的任意子集。欲了解更多信息，请参阅 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 部分的 XML [Schema](../../../system.xml.schema/) 规范。字符串 **s** 将根据此格式进行验证。 |

### ReturnValue

提供的字符串对应的 [DateTimeOffset](../../../system/datetimeoffset/) 等价形式。

## 另见

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
