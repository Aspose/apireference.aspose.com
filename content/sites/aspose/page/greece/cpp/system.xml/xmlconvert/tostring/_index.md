---
title: "System::Xml::XmlConvert::ToString method"
linktitle: "ToString"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlConvert::ToString method. Μετατρέπει το Boolean σε ένα String σε C++."
type: docs
weight: 2400
url: /el/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


Μετατρέπει το [Boolean](../../../system/boolean/) σε ένα [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | bool | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Boolean](../../../system/boolean/), δηλαδή "true" ή "false".

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


Μετατρέπει το [Char](../../../system/char/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | char16_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Char](../../../system/char/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


Μετατρέπει το [DateTime](../../../system/datetime/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | DateTime | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [DateTime](../../../system/datetime/) στη μορφή yyyy-MM-ddTHH:mm:ss όπου το 'T' είναι μια σταθερή αλφαριθμητική τιμή.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


Μετατρέπει το [DateTime](../../../system/datetime/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | DateTime | Η τιμή προς μετατροπή. |
| μορφή | const String\& | Η δομή μορφής που ορίζει πώς να εμφανίζεται η μετατρεπόμενη συμβολοσειρά. Έγκυρες μορφές περιλαμβάνουν "yyyy-MM-ddTHH:mm:sszzzzzz" και τα υποσύνολά της. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [DateTime](../../../system/datetime/) στην καθορισμένη μορφή.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


Μετατρέπει το [DateTime](../../../system/datetime/) σε μια [String](../../../system/string/) χρησιμοποιώντας το καθορισμένο [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | DateTime | Η τιμή [DateTime](../../../system/datetime/) προς μετατροπή. |
| dateTimeOption | XmlDateTimeSerializationMode | Μία από τις τιμές του [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) που καθορίζουν πώς να αντιμετωπιστεί η τιμή [DateTime](../../../system/datetime/). |

### ReturnValue

Μία [String](../../../system/string/) ισοδυναμία του [DateTime](../../../system/datetime/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


Μετατρέπει το παρεχόμενο [DateTimeOffset](../../../system/datetimeoffset/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | DateTimeOffset | Το [DateTimeOffset](../../../system/datetimeoffset/) που θα μετατραπεί. |

### ReturnValue

Μια αναπαράσταση [String](../../../system/string/) του παρεχόμενου [DateTimeOffset](../../../system/datetimeoffset/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


Μετατρέπει το παρεχόμενο [DateTimeOffset](../../../system/datetimeoffset/) σε μια [String](../../../system/string/) στην καθορισμένη μορφή.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | DateTimeOffset | Το [DateTimeOffset](../../../system/datetimeoffset/) που θα μετατραπεί. |
| format | const String\& | Η μορφή στην οποία μετατρέπεται το **s**. Η παράμετρος μορφής μπορεί να είναι οποιοδήποτε υποσύνολο της σύστασης W3C για τον τύπο XML dateTime. Για περισσότερες πληροφορίες, δείτε την ενότητα [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) του προτύπου XML [Schema](../../../system.xml.schema/). |

### ReturnValue

Μια αναπαράσταση [String](../../../system/string/) στην καθορισμένη μορφή του παρεχόμενου [DateTimeOffset](../../../system/datetimeoffset/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


Μετατρέπει το [Decimal](../../../system/decimal/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | Decimal | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Decimal](../../../system/decimal/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


Μετατρέπει το [Double](../../../system/double/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | double | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Double](../../../system/double/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


Μετατρέπει το [Single](../../../system/single/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Single](../../../system/single/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


Μετατρέπει το [Guid](../../../system/guid/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | Guid | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Guid](../../../system/guid/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


Μετατρέπει το [Int16](../../../system/int16/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int16_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Int16](../../../system/int16/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


Μετατρέπει το [Int32](../../../system/int32/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int32_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Int32](../../../system/int32/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


Μετατρέπει το [Int64](../../../system/int64/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int64_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Int64](../../../system/int64/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


Μετατρέπει το [SByte](../../../system/sbyte/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | int8_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [SByte](../../../system/sbyte/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


Μετατρέπει το [TimeSpan](../../../system/timespan/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | TimeSpan | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [TimeSpan](../../../system/timespan/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


Μετατρέπει το [UInt16](../../../system/uint16/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint16_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [UInt16](../../../system/uint16/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


Μετατρέπει το [UInt32](../../../system/uint32/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint32_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [UInt32](../../../system/uint32/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


Μετατρέπει το [UInt64](../../../system/uint64/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint64_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [UInt64](../../../system/uint64/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


Μετατρέπει το [Byte](../../../system/byte/) σε μια [String](../../../system/string/).

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | uint8_t | Η τιμή προς μετατροπή. |

### ReturnValue

Μια αναπαράσταση συμβολοσειράς του [Byte](../../../system/byte/).

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
