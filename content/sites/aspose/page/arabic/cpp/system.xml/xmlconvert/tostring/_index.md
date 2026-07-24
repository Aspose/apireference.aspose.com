---
title: "طريقة System::Xml::XmlConvert::ToString"
linktitle: "ToString"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlConvert::ToString. يحول Boolean إلى String في C++."
type: docs
weight: 2400
url: /ar/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


يحول [Boolean](../../../system/boolean/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | bool | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Boolean](../../../system/boolean/)، أي "true" أو "false".

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


يقوم بتحويل الـ [Char](../../../system/char/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Char](../../../system/char/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


يقوم بتحويل الـ [DateTime](../../../system/datetime/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTime | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [DateTime](../../../system/datetime/) بالتنسيق yyyy-MM-ddTHH:mm:ss حيث أن 'T' هو حرف ثابت.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


يقوم بتحويل الـ [DateTime](../../../system/datetime/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTime | القيمة المراد تحويلها. |
| تنسيق | const String\& | هيكل التنسيق الذي يحدد كيفية عرض النص المحول. تشمل الصيغ الصالحة "yyyy-MM-ddTHH:mm:sszzzzzz" ومشتقاتها. |

### ReturnValue

تمثيل نصي للـ [DateTime](../../../system/datetime/) بالتنسيق المحدد.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


يقوم بتحويل الـ [DateTime](../../../system/datetime/) إلى [String](../../../system/string/) باستخدام الـ [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) المحدد.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTime | قيمة الـ [DateTime](../../../system/datetime/) المراد تحويلها. |
| dateTimeOption | XmlDateTimeSerializationMode | إحدى قيم الـ [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) التي تحدد كيفية معالجة قيمة الـ [DateTime](../../../system/datetime/). |

### ReturnValue

[String](../../../system/string/) مكافئ للـ [DateTime](../../../system/datetime/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


يقوم بتحويل الـ [DateTimeOffset](../../../system/datetimeoffset/) المقدم إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTimeOffset | الـ [DateTimeOffset](../../../system/datetimeoffset/) الذي سيتم تحويله. |

### ReturnValue

تمثيل [String](../../../system/string/) للـ [DateTimeOffset](../../../system/datetimeoffset/) المقدم.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


يقوم بتحويل الـ [DateTimeOffset](../../../system/datetimeoffset/) المقدم إلى [String](../../../system/string/) بالتنسيق المحدد.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | DateTimeOffset | الـ [DateTimeOffset](../../../system/datetimeoffset/) الذي سيتم تحويله. |
| format | const String\& | التنسيق الذي يتم تحويل **s** إليه. يمكن أن يكون معامل التنسيق أي مجموعة فرعية من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) في مواصفة XML [Schema](../../../system.xml.schema/). |

### ReturnValue

تمثيل [String](../../../system/string/) بالتنسيق المحدد للـ [DateTimeOffset](../../../system/datetimeoffset/) المقدم.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


يقوم بتحويل الـ [Decimal](../../../system/decimal/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عشري | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Decimal](../../../system/decimal/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


يقوم بتحويل الـ [Double](../../../system/double/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | double | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Double](../../../system/double/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


يقوم بتحويل الـ [Single](../../../system/single/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عائم | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Single](../../../system/single/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


يقوم بتحويل الـ [Guid](../../../system/guid/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | Guid | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Guid](../../../system/guid/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


يقوم بتحويل الـ [Int16](../../../system/int16/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int16](../../../system/int16/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


يقوم بتحويل الـ [Int32](../../../system/int32/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int32_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int32](../../../system/int32/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


يقوم بتحويل الـ [Int64](../../../system/int64/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int64_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int64](../../../system/int64/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


يقوم بتحويل الـ [SByte](../../../system/sbyte/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int8_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [SByte](../../../system/sbyte/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


يقوم بتحويل الـ [TimeSpan](../../../system/timespan/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | TimeSpan | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [TimeSpan](../../../system/timespan/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


يقوم بتحويل الـ [UInt16](../../../system/uint16/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt16](../../../system/uint16/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


يقوم بتحويل الـ [UInt32](../../../system/uint32/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint32_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt32](../../../system/uint32/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


يقوم بتحويل الـ [UInt64](../../../system/uint64/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint64_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt64](../../../system/uint64/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


يقوم بتحويل الـ [Byte](../../../system/byte/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint8_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي لـ [Byte](../../../system/byte/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
