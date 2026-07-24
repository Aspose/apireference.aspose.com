---
title: "System::Xml::XmlConvert::ToString メソッド"
linktitle: "ToString"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlConvert::ToString メソッド。Boolean を String に変換します（C++）。"
type: docs
weight: 2400
url: /ja/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


[Boolean](../../../system/boolean/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | bool | 変換する値です。 |

### ReturnValue

「true」または「false」を表す、[Boolean](../../../system/boolean/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


[Char](../../../system/char/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | char16_t | 変換する値です。 |

### ReturnValue

[Char](../../../system/char/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


[DateTime](../../../system/datetime/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | DateTime | 変換する値です。 |

### ReturnValue

[DateTime](../../../system/datetime/) を yyyy-MM-ddTHH:mm:ss 形式で表した文字列です（'T' は定数リテラルです）。

## 参照

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


[DateTime](../../../system/datetime/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | DateTime | 変換する値です。 |
| フォーマット | const String\& | 変換された文字列の表示方法を定義するフォーマット構造です。有効なフォーマットには \"yyyy-MM-ddTHH:mm:sszzzzzz\" およびそのサブセットが含まれます。 |

### ReturnValue

指定されたフォーマットでの [DateTime](../../../system/datetime/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


指定された [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) を使用して、[DateTime](../../../system/datetime/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | DateTime | 変換する [DateTime](../../../system/datetime/) の値です。 |
| dateTimeOption | XmlDateTimeSerializationMode | [DateTime](../../../system/datetime/) の値の取り扱い方法を指定する [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) のいずれかの値です。 |

### ReturnValue

[DateTime](../../../system/datetime/) に相当する [String](../../../system/string/) です。

## 参照

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


提供された [DateTimeOffset](../../../system/datetimeoffset/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | DateTimeOffset | 変換対象の [DateTimeOffset](../../../system/datetimeoffset/) です。 |

### ReturnValue

提供された [DateTimeOffset](../../../system/datetimeoffset/) の [String](../../../system/string/) 表現です。

## 参照

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


提供された [DateTimeOffset](../../../system/datetimeoffset/) を指定されたフォーマットで [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | DateTimeOffset | 変換対象の [DateTimeOffset](../../../system/datetimeoffset/) です。 |
| format | const String\& | **s** が変換されるフォーマットです。format パラメーターは XML dateTime 型に対する W3C 勧告の任意のサブセットを指定できます。詳細については、XML [Schema](../../../system.xml.schema/) 仕様の [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) セクションをご覧ください。 |

### ReturnValue

提供された [DateTimeOffset](../../../system/datetimeoffset/) を指定されたフォーマットで表した [String](../../../system/string/) 表現です。

## 参照

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


[Decimal](../../../system/decimal/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 十進数 | 変換する値です。 |

### ReturnValue

[Decimal](../../../system/decimal/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


[Double](../../../system/double/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | double | 変換する値です。 |

### ReturnValue

[Double](../../../system/double/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


[Single](../../../system/single/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | 単精度浮動小数点数 | 変換する値です。 |

### ReturnValue

[Single](../../../system/single/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


[Guid](../../../system/guid/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | Guid | 変換する値です。 |

### ReturnValue

[Guid](../../../system/guid/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


[Int16](../../../system/int16/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int16_t | 変換する値です。 |

### ReturnValue

[Int16](../../../system/int16/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


[Int32](../../../system/int32/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int32_t | 変換する値です。 |

### ReturnValue

[Int32](../../../system/int32/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


[Int64](../../../system/int64/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int64_t | 変換する値です。 |

### ReturnValue

[Int64](../../../system/int64/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


[SByte](../../../system/sbyte/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | int8_t | 変換する値です。 |

### ReturnValue

[SByte](../../../system/sbyte/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


[TimeSpan](../../../system/timespan/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | TimeSpan | 変換する値です。 |

### ReturnValue

[TimeSpan](../../../system/timespan/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


[UInt16](../../../system/uint16/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint16_t | 変換する値です。 |

### ReturnValue

[UInt16](../../../system/uint16/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


[UInt32](../../../system/uint32/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint32_t | 変換する値です。 |

### ReturnValue

[UInt32](../../../system/uint32/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


[UInt64](../../../system/uint64/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint64_t | 変換する値です。 |

### ReturnValue

[UInt64](../../../system/uint64/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


[Byte](../../../system/byte/) を [String](../../../system/string/) に変換します。

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | uint8_t | 変換する値です。 |

### ReturnValue

[Byte](../../../system/byte/) の文字列表現です。

## 参照

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
