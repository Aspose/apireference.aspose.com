---
title: "System::Xml::XmlConvert::ToString 메서드"
linktitle: "ToString"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlConvert::ToString 메서드. Boolean을 C++에서 String으로 변환합니다."
type: docs
weight: 2400
url: /ko/cpp/system.xml/xmlconvert/tostring/
---
## XmlConvert::ToString(bool) method


[Boolean](../../../system/boolean/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(bool value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | bool | 변환할 값. |

### ReturnValue

[Boolean](../../../system/boolean/)의 문자열 표현, 즉 "true" 또는 "false".

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(char16_t) method


[Char](../../../system/char/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(char16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char16_t | 변환할 값. |

### ReturnValue

[Char](../../../system/char/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime) method


[DateTime](../../../system/datetime/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTime | 변환할 값. |

### ReturnValue

[DateTime](../../../system/datetime/)을 yyyy-MM-ddTHH:mm:ss 형식으로 문자열로 표현합니다. 여기서 'T'는 상수 리터럴입니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, const String\&) method


[DateTime](../../../system/datetime/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, const String &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTime | 변환할 값. |
| 형식 | const String\& | 변환된 문자열을 표시하는 방법을 정의하는 형식 구조입니다. 유효한 형식에는 "yyyy-MM-ddTHH:mm:sszzzzzz" 및 그 하위 집합이 포함됩니다. |

### ReturnValue

[DateTime](../../../system/datetime/)을 지정된 형식으로 문자열로 표현합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTime, XmlDateTimeSerializationMode) method


[DateTime](../../../system/datetime/)을 지정된 [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)을 사용하여 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(DateTime value, XmlDateTimeSerializationMode dateTimeOption)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTime | 변환할 [DateTime](../../../system/datetime/) 값. |
| dateTimeOption | XmlDateTimeSerializationMode | [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) 값 중 하나로, [DateTime](../../../system/datetime/) 값을 어떻게 처리할지 지정합니다. |

### ReturnValue

[DateTime](../../../system/datetime/)에 해당하는 [String](../../../system/string/).

## 또 보기

* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset) method


제공된 [DateTimeOffset](../../../system/datetimeoffset/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTimeOffset | 변환할 [DateTimeOffset](../../../system/datetimeoffset/)입니다. |

### ReturnValue

제공된 [DateTimeOffset](../../../system/datetimeoffset/)의 [String](../../../system/string/) 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(DateTimeOffset, const String\&) method


제공된 [DateTimeOffset](../../../system/datetimeoffset/)을 지정된 형식으로 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(DateTimeOffset value, const String &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTimeOffset | 변환할 [DateTimeOffset](../../../system/datetimeoffset/)입니다. |
| format | const String\& | **s**가 변환되는 형식. format 매개변수는 XML dateTime 유형에 대한 W3C 권고안의 하위 집합일 수 있습니다. 자세한 내용은 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 섹션 및 XML [Schema](../../../system.xml.schema/) 사양을 참조하십시오. |

### ReturnValue

제공된 [DateTimeOffset](../../../system/datetimeoffset/)을 지정된 형식으로 표현한 [String](../../../system/string/).

## 또 보기

* Class [String](../../../system/string/)
* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Decimal) method


[Decimal](../../../system/decimal/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(Decimal value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | Decimal | 변환할 값. |

### ReturnValue

[Decimal](../../../system/decimal/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(double) method


[Double](../../../system/double/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(double value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | double | 변환할 값. |

### ReturnValue

[Double](../../../system/double/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(float) method


[Single](../../../system/single/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(float value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | float | 변환할 값. |

### ReturnValue

단일([Single](../../../system/single/))의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(Guid) method


[Guid](../../../system/guid/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(Guid value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | Guid | 변환할 값. |

### ReturnValue

[Guid](../../../system/guid/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [Guid](../../../system/guid/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int16_t) method


[Int16](../../../system/int16/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(int16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int16_t | 변환할 값. |

### ReturnValue

[Int16](../../../system/int16/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int32_t) method


[Int32](../../../system/int32/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(int32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int32_t | 변환할 값. |

### ReturnValue

[Int32](../../../system/int32/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int64_t) method


[Int64](../../../system/int64/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(int64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int64_t | 변환할 값. |

### ReturnValue

[Int64](../../../system/int64/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(int8_t) method


[SByte](../../../system/sbyte/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(int8_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int8_t | 변환할 값. |

### ReturnValue

[SByte](../../../system/sbyte/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(TimeSpan) method


[TimeSpan](../../../system/timespan/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(TimeSpan value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | TimeSpan | 변환할 값. |

### ReturnValue

[TimeSpan](../../../system/timespan/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [TimeSpan](../../../system/timespan/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint16_t) method


[UInt16](../../../system/uint16/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(uint16_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint16_t | 변환할 값. |

### ReturnValue

[UInt16](../../../system/uint16/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint32_t) method


[UInt32](../../../system/uint32/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(uint32_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint32_t | 변환할 값. |

### ReturnValue

[UInt32](../../../system/uint32/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint64_t) method


[UInt64](../../../system/uint64/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(uint64_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint64_t | 변환할 값. |

### ReturnValue

[UInt64](../../../system/uint64/)의 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToString(uint8_t) method


[Byte](../../../system/byte/)을 [String](../../../system/string/)으로 변환합니다.

```cpp
static String System::Xml::XmlConvert::ToString(uint8_t value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | uint8_t | 변환할 값. |

### ReturnValue

바이트([Byte](../../../system/byte/))에 대한 문자열 표현.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
