---
title: "طريقة System::Xml::XmlConvert::ToString"
linktitle: "ToString"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlConvert::ToString. تقوم بتحويل القيمة Boolean إلى String في C++."
type: docs
weight: 2400
url: /ar/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


يقوم بتحويل الـ[Boolean](../../../system/boolean/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | bool | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ[Boolean](../../../system/boolean/)، أي \"true\" أو \"false\".

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(char16_t) method


يقوم بتحويل الـ[Char](../../../system/char/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ[Char](../../../system/char/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(DateTime) method


يقوم بتحويل الـ[DateTime](../../../system/datetime/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | DateTime | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ[DateTime](../../../system/datetime/) بالتنسيق yyyy-MM-ddTHH:mm:ss حيث 'T' هو حرف ثابت.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


يقوم بتحويل الـ[DateTime](../../../system/datetime/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | DateTime | القيمة المراد تحويلها. |
| صيغة | const String\& | هيكل الصيغة الذي يحدد كيفية عرض السلسلة المحوَّلة. تشمل الصيغ الصالحة \"yyyy-MM-ddTHH:mm:sszzzzzz\" ومجموعاتها الفرعية. |

### ReturnValue

تمثيل نصي للـ[DateTime](../../../system/datetime/) بالتنسيق المحدد.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


يقوم بتحويل الـ[DateTime](../../../system/datetime/) إلى [String](../../../system/string/) باستخدام [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) المحدد.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | DateTime | قيمة الـ[DateTime](../../../system/datetime/) المراد تحويلها. |
| dateTimeOption | XmlDateTimeSerializationMode | إحدى قيم [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) التي تحدد كيفية معالجة قيمة الـ[DateTime](../../../system/datetime/). |

### ReturnValue

مكافئ [String](../../../system/string/) للـ[DateTime](../../../system/datetime/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


يقوم بتحويل الـ[DateTimeOffset](../../../system/datetimeoffset/) المزوَّد إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | DateTimeOffset | الـ[DateTimeOffset](../../../system/datetimeoffset/) المراد تحويله. |

### ReturnValue

تمثيل [String](../../../system/string/) للـ[DateTimeOffset](../../../system/datetimeoffset/) المزوَّد.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


يقوم بتحويل الـ[DateTimeOffset](../../../system/datetimeoffset/) المزوَّد إلى [String](../../../system/string/) بالتنسيق المحدد.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| value | DateTimeOffset | الـ[DateTimeOffset](../../../system/datetimeoffset/) المراد تحويله. |
| format | const String\& | الصيغة التي يتم تحويل **s** إليها. يمكن أن يكون معامل الصيغة أي مجموعة فرعية من توصية W3C لنوع XML dateTime. لمزيد من المعلومات، راجع قسم [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) من مواصفة XML [Schema](../../../system.xml.schema/). |

### ReturnValue

تمثيل [String](../../../system/string/) في الصيغة المحددة للـ [DateTimeOffset](../../../system/datetimeoffset/) المزوَّد.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(Decimal) method


يحوِّل الـ [Decimal](../../../system/decimal/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | Decimal | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Decimal](../../../system/decimal/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(double) method


يحوِّل الـ [Double](../../../system/double/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | double | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Double](../../../system/double/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(float) method


يحوِّل الـ [Single](../../../system/single/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | float | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Single](../../../system/single/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(Guid) method


يحوِّل الـ [Guid](../../../system/guid/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | Guid | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Guid](../../../system/guid/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(int16_t) method


يحوِّل الـ [Int16](../../../system/int16/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int16](../../../system/int16/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(int32_t) method


يحوِّل الـ [Int32](../../../system/int32/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int32_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int32](../../../system/int32/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(int64_t) method


يحوِّل الـ [Int64](../../../system/int64/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int64_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Int64](../../../system/int64/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(int8_t) method


يحوِّل الـ [SByte](../../../system/sbyte/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | int8_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [SByte](../../../system/sbyte/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


يحوِّل الـ [TimeSpan](../../../system/timespan/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | TimeSpan | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [TimeSpan](../../../system/timespan/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(uint16_t) method


يحوِّل الـ [UInt16](../../../system/uint16/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint16_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt16](../../../system/uint16/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(uint32_t) method


يحوِّل الـ [UInt32](../../../system/uint32/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint32_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt32](../../../system/uint32/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(uint64_t) method


يحوّل [UInt64](../../../system/uint64/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint64_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [UInt64](../../../system/uint64/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToString(uint8_t) method


يحوّل [Byte](../../../system/byte/) إلى [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | uint8_t | القيمة المراد تحويلها. |

### ReturnValue

تمثيل نصي للـ [Byte](../../../system/byte/).

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
