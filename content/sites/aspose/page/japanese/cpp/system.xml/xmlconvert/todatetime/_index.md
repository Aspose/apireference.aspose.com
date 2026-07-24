---
title: "System::Xml::XmlConvert::ToDateTime メソッド"
linktitle: "ToDateTime"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlConvert::ToDateTime メソッド。C++ で String を DateTime に相当する形式に変換します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


[String](../../../system/string/) を [DateTime](../../../system/datetime/) に変換します。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する文字列。 |

### ReturnValue

文字列の [DateTime](../../../system/datetime/) に相当するものです。

## 参照

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


[String](../../../system/string/) を [DateTime](../../../system/datetime/) に変換します。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する文字列。 |
| formats | const ArrayPtr\<String\>\& | 変換された [DateTime](../../../system/datetime/) に適用するフォーマット構造を含む配列です。有効なフォーマットには "yyyy-MM-ddTHH:mm:sszzzzzz" およびそのサブセットが含まれます。 |

### ReturnValue

文字列の [DateTime](../../../system/datetime/) に相当するものです。

## 参照

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


[String](../../../system/string/) を [DateTime](../../../system/datetime/) に変換します。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する文字列。 |
| format | const String\& | 変換された [DateTime](../../../system/datetime/) に適用するフォーマット構造です。有効なフォーマットには "yyyy-MM-ddTHH:mm:sszzzzzz" およびそのサブセットが含まれます。このフォーマットに対して文字列が検証されます。 |

### ReturnValue

文字列の [DateTime](../../../system/datetime/) に相当するものです。

## 参照

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


指定された [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) を使用して、[String](../../../system/string/) を [DateTime](../../../system/datetime/) に変換します。

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 変換する [String](../../../system/string/) の値です。 |
| dateTimeOption | XmlDateTimeSerializationMode | UTC 日付の場合に、日付をローカル時間に変換するか、協定世界時 (UTC) として保持するかを指定する列挙値の一つです。 |

### ReturnValue

[String](../../../system/string/) の [DateTime](../../../system/datetime/) に相当するものです。

## 参照

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
