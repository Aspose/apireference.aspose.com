---
title: "System::Xml::XmlConvert::ToString 方法"
linktitle: "ToString"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlConvert::ToString 方法。将 Boolean 转换为 C++ 中的 String。"
type: docs
weight: 2400
url: /zh/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


将 [Boolean](../../../system/boolean/) 转换为 [String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | bool | 要转换的值。 |

### ReturnValue

对[Boolean](../../../system/boolean/)的字符串表示，即 "true" 或 "false"。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


将[Char](../../../system/char/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char16_t | 要转换的值。 |

### ReturnValue

对[Char](../../../system/char/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


将[DateTime](../../../system/datetime/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTime | 要转换的值。 |

### ReturnValue

以 yyyy-MM-ddTHH:mm:ss 格式（其中 'T' 为常量字面量）对[DateTime](../../../system/datetime/)进行字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


将[DateTime](../../../system/datetime/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTime | 要转换的值。 |
| 格式 | const String\& | 定义如何显示转换后字符串的格式结构。有效的格式包括 "yyyy-MM-ddTHH:mm:sszzzzzz" 及其子集。 |

### ReturnValue

以指定格式对[DateTime](../../../system/datetime/)进行字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


使用指定的[XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)将[DateTime](../../../system/datetime/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTime | 要转换的[DateTime](../../../system/datetime/)值。 |
| dateTimeOption | XmlDateTimeSerializationMode | 用于指定如何处理[DateTime](../../../system/datetime/)值的[XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)之一。 |

### ReturnValue

[DateTime](../../../system/datetime/)的等价[String](../../../system/string/)。

## 另见

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


将提供的[DateTimeOffset](../../../system/datetimeoffset/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTimeOffset | 待转换的[DateTimeOffset](../../../system/datetimeoffset/)。 |

### ReturnValue

提供的[DateTimeOffset](../../../system/datetimeoffset/)的[String](../../../system/string/)表示。

## 另见

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


将提供的[DateTimeOffset](../../../system/datetimeoffset/)按指定格式转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTimeOffset | 待转换的[DateTimeOffset](../../../system/datetimeoffset/)。 |
| format | const String\& | **s** 被转换的格式。format 参数可以是 W3C 对 XML dateTime 类型的推荐规范的任意子集。更多信息请参阅 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 部分以及 XML [Schema](../../../system.xml.schema/) 规范。 |

### ReturnValue

提供的[DateTimeOffset](../../../system/datetimeoffset/)在指定格式下的[String](../../../system/string/)表示。

## 另见

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


将[Decimal](../../../system/decimal/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | 十进制 | 要转换的值。 |

### ReturnValue

对[Decimal](../../../system/decimal/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


将[Double](../../../system/double/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | double | 要转换的值。 |

### ReturnValue

对[Double](../../../system/double/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


将[Single](../../../system/single/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | 单精度浮点数 | 要转换的值。 |

### ReturnValue

对[Single](../../../system/single/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


将[Guid](../../../system/guid/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | Guid | 要转换的值。 |

### ReturnValue

对[Guid](../../../system/guid/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


将[Int16](../../../system/int16/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int16_t | 要转换的值。 |

### ReturnValue

对[Int16](../../../system/int16/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


将[Int32](../../../system/int32/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int32_t | 要转换的值。 |

### ReturnValue

对[Int32](../../../system/int32/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


将[Int64](../../../system/int64/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int64_t | 要转换的值。 |

### ReturnValue

对[Int64](../../../system/int64/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


将[SByte](../../../system/sbyte/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | int8_t | 要转换的值。 |

### ReturnValue

对[SByte](../../../system/sbyte/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


将[TimeSpan](../../../system/timespan/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | TimeSpan | 要转换的值。 |

### ReturnValue

对[TimeSpan](../../../system/timespan/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


将[UInt16](../../../system/uint16/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint16_t | 要转换的值。 |

### ReturnValue

对[UInt16](../../../system/uint16/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


将[UInt32](../../../system/uint32/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint32_t | 要转换的值。 |

### ReturnValue

对[UInt32](../../../system/uint32/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


将[UInt64](../../../system/uint64/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint64_t | 要转换的值。 |

### ReturnValue

对[UInt64](../../../system/uint64/)的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


将[Byte](../../../system/byte/)转换为[String](../../../system/string/)。

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | uint8_t | 要转换的值。 |

### ReturnValue

对 [Byte](../../../system/byte/) 的字符串表示。

## 另见

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
