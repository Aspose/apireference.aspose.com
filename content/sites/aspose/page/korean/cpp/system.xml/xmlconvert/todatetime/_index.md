---
title: "System::Xml::XmlConvert::ToDateTime 메서드"
linktitle: "ToDateTime"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlConvert::ToDateTime 메서드. 문자열을 C++에서 DateTime에 해당하는 형태로 변환합니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


[String](../../../system/string/)을 [DateTime](../../../system/datetime/)에 해당하는 형태로 변환합니다.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. |

### ReturnValue

문자열에 해당하는 [DateTime](../../../system/datetime/) 형태.

## 또 보기

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


[String](../../../system/string/)을 [DateTime](../../../system/datetime/)에 해당하는 형태로 변환합니다.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. |
| formats | const ArrayPtr\<String\>\& | 변환된 [DateTime](../../../system/datetime/)에 적용할 형식 구조를 포함하는 배열입니다. 유효한 형식에는 "yyyy-MM-ddTHH:mm:sszzzzzz" 및 그 하위 형식이 포함됩니다. |

### ReturnValue

문자열에 해당하는 [DateTime](../../../system/datetime/) 형태.

## 또 보기

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


[String](../../../system/string/)을 [DateTime](../../../system/datetime/)에 해당하는 형태로 변환합니다.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. |
| format | const String\& | 변환된 [DateTime](../../../system/datetime/)에 적용할 형식 구조입니다. 유효한 형식에는 "yyyy-MM-ddTHH:mm:sszzzzzz" 및 그 하위 형식이 포함됩니다. 문자열은 이 형식에 대해 검증됩니다. |

### ReturnValue

문자열에 해당하는 [DateTime](../../../system/datetime/) 형태.

## 또 보기

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


지정된 [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)을 사용하여 [String](../../../system/string/)을 [DateTime](../../../system/datetime/)으로 변환합니다.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 [String](../../../system/string/) 값. |
| dateTimeOption | XmlDateTimeSerializationMode | 날짜가 UTC 날짜인 경우, 로컬 시간으로 변환할지 또는 협정 세계시(UTC) 그대로 유지할지를 지정하는 열거형 값 중 하나입니다. |

### ReturnValue

[String](../../../system/string/)에 해당하는 [DateTime](../../../system/datetime/) 형태.

## 또 보기

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
