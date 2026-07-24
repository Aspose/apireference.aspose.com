---
title: "System::Xml::XmlConvert::ToString yöntemi"
linktitle: "ToString"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlConvert::ToString yöntemi. Boolean'ı C++'ta bir String'e dönüştürür."
type: docs
weight: 2400
url: /tr/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


[Boolean](../../../system/boolean/) öğesini bir [String](../../../system/string/) öğesine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | bool | Dönüştürülecek değer. |

### ReturnValue

Bir [Boolean](../../../system/boolean/) dize temsili, yani "true" veya "false".

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


[Char](../../../system/char/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | char16_t | Dönüştürülecek değer. |

### ReturnValue

Bir [Char](../../../system/char/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


[DateTime](../../../system/datetime/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | DateTime | Dönüştürülecek değer. |

### ReturnValue

Bir [DateTime](../../../system/datetime/) dize temsili, yyyy-MM-ddTHH:mm:ss biçiminde, burada 'T' sabit bir karakterdir.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


[DateTime](../../../system/datetime/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | DateTime | Dönüştürülecek değer. |
| biçim | const String\& | Dönüştürülen dizeyi nasıl görüntüleyeceğini tanımlayan biçim yapısı. Geçerli biçimler "yyyy-MM-ddTHH:mm:sszzzzzz" ve alt kümelerini içerir. |

### ReturnValue

Belirtilen biçimde bir [DateTime](../../../system/datetime/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


Belirtilen [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) kullanarak [DateTime](../../../system/datetime/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | DateTime | Dönüştürülecek [DateTime](../../../system/datetime/) değeri. |
| dateTimeOption | XmlDateTimeSerializationMode | [DateTime](../../../system/datetime/) değerinin nasıl işleneceğini belirten [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) değerlerinden biri. |

### ReturnValue

[DateTime](../../../system/datetime/) için bir [String](../../../system/string/) eşdeğeri.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


Sağlanan [DateTimeOffset](../../../system/datetimeoffset/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | DateTimeOffset | Dönüştürülecek [DateTimeOffset](../../../system/datetimeoffset/). |

### ReturnValue

Sağlanan [DateTimeOffset](../../../system/datetimeoffset/) için bir [String](../../../system/string/) temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


Sağlanan [DateTimeOffset](../../../system/datetimeoffset/) öğesini belirtilen biçimde bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | DateTimeOffset | Dönüştürülecek [DateTimeOffset](../../../system/datetimeoffset/). |
| format | const String\& | **s**'nin dönüştürüldüğü biçim. Biçim parametresi, XML dateTime türü için W3C Önerisinin herhangi bir alt kümesi olabilir. Daha fazla bilgi için XML [Schema](../../../system.xml.schema/) spesifikasyonunun [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) bölümüne bakın. |

### ReturnValue

Sağlanan [DateTimeOffset](../../../system/datetimeoffset/) için belirtilen biçimde bir [String](../../../system/string/) temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


[Decimal](../../../system/decimal/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | Ondalık | Dönüştürülecek değer. |

### ReturnValue

[Decimal](../../../system/decimal/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


[Double](../../../system/double/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | double | Dönüştürülecek değer. |

### ReturnValue

[Double](../../../system/double/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


[Single](../../../system/single/) öğesini bir [String](../../../system/string/)’e dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | float | Dönüştürülecek değer. |

### ReturnValue

Bir [Single](../../../system/single/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


Bir [Guid](../../../system/guid/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | Guid | Dönüştürülecek değer. |

### ReturnValue

Bir [Guid](../../../system/guid/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


Bir [Int16](../../../system/int16/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | int16_t | Dönüştürülecek değer. |

### ReturnValue

Bir [Int16](../../../system/int16/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


Bir [Int32](../../../system/int32/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | int32_t | Dönüştürülecek değer. |

### ReturnValue

Bir [Int32](../../../system/int32/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


Bir [Int64](../../../system/int64/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | int64_t | Dönüştürülecek değer. |

### ReturnValue

Bir [Int64](../../../system/int64/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


Bir [SByte](../../../system/sbyte/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | int8_t | Dönüştürülecek değer. |

### ReturnValue

Bir [SByte](../../../system/sbyte/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


Bir [TimeSpan](../../../system/timespan/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | TimeSpan | Dönüştürülecek değer. |

### ReturnValue

Bir [TimeSpan](../../../system/timespan/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


Bir [UInt16](../../../system/uint16/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | uint16_t | Dönüştürülecek değer. |

### ReturnValue

Bir [UInt16](../../../system/uint16/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


Bir [UInt32](../../../system/uint32/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | uint32_t | Dönüştürülecek değer. |

### ReturnValue

Bir [UInt32](../../../system/uint32/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


Bir [UInt64](../../../system/uint64/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | uint64_t | Dönüştürülecek değer. |

### ReturnValue

Bir [UInt64](../../../system/uint64/) dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


Bir [Byte](../../../system/byte/) değerini bir [String](../../../system/string/) değerine dönüştürür.

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | uint8_t | Dönüştürülecek değer. |

### ReturnValue

[Byte](../../../system/byte/) öğesinin bir dize temsili.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
