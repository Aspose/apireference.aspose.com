---
title: "System::Xml::XmlConvert::ToDateTimeOffset メソッド"
linktitle: "ToDateTimeOffset"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlConvert::ToDateTimeOffset メソッド。提供された String を DateTimeOffset に相当する値に変換します（C++）。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


提供された [String](../../../system/string/) を [DateTimeOffset](../../../system/datetimeoffset/) に相当する値に変換します。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換対象の文字列です。文字列は XML dateTime 型に関する W3C 勧告のサブセットに準拠している必要があります。詳細については、XML [Schema](../../../system.xml.schema/) 仕様の [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) セクションをご覧ください。 |

### ReturnValue

提供された文字列の [DateTimeOffset](../../../system/datetimeoffset/) 相当です。

## 参照

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


提供された [String](../../../system/string/) を [DateTimeOffset](../../../system/datetimeoffset/) に相当する値に変換します。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する文字列。 |
| formats | const ArrayPtr\<String\>\& | **s** を変換できる形式の配列です。**formats** の各形式は、XML dateTime 型に関する W3C 勧告のサブセットのいずれかにすることができます。詳細については、XML [Schema](../../../system.xml.schema/) 仕様の [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) セクションをご覧ください。文字列 **s** はこれらの形式のいずれかに対して検証されます。 |

### ReturnValue

提供された文字列の [DateTimeOffset](../../../system/datetimeoffset/) 相当です。

## 参照

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


提供された [String](../../../system/string/) を [DateTimeOffset](../../../system/datetimeoffset/) に相当する値に変換します。

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する文字列。 |
| format | const String\& | **s** が変換される形式です。format パラメータは、XML dateTime 型に関する W3C 勧告のサブセットのいずれかにすることができます。詳細については、XML [Schema](../../../system.xml.schema/) 仕様の [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) セクションをご覧ください。文字列 **s** はこの形式に対して検証されます。 |

### ReturnValue

提供された文字列の [DateTimeOffset](../../../system/datetimeoffset/) 相当です。

## 参照

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
