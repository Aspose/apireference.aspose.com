---
title: "System::Xml::XmlConvert::ToDateTimeOffset 메서드"
linktitle: "ToDateTimeOffset"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlConvert::ToDateTimeOffset 메서드. 제공된 String을 C++에서 DateTimeOffset와 동등한 형태로 변환합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


제공된 [String](../../../system/string/)을 [DateTimeOffset](../../../system/datetimeoffset/)와 동등한 형태로 변환합니다.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. 이 문자열은 XML dateTime 유형에 대한 W3C 권고의 일부 하위 집합을 따라야 합니다. 자세한 내용은 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 섹션 및 XML [Schema](../../../system.xml.schema/) 사양을 참조하십시오. |

### ReturnValue

제공된 문자열에 대한 [DateTimeOffset](../../../system/datetimeoffset/) 동등값.

## 또 보기

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


제공된 [String](../../../system/string/)을 [DateTimeOffset](../../../system/datetimeoffset/)와 동등한 형태로 변환합니다.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. |
| formats | const ArrayPtr\<String\>\& | **s**를 변환할 수 있는 형식 배열입니다. **formats**의 각 형식은 XML dateTime 유형에 대한 W3C 권고의 일부 하위 집합일 수 있습니다. 자세한 내용은 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 섹션 및 XML [Schema](../../../system.xml.schema/) 사양을 참조하십시오. 문자열 **s**는 이러한 형식 중 하나에 대해 검증됩니다. |

### ReturnValue

제공된 문자열에 대한 [DateTimeOffset](../../../system/datetimeoffset/) 동등값.

## 또 보기

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


제공된 [String](../../../system/string/)을 [DateTimeOffset](../../../system/datetimeoffset/)와 동등한 형태로 변환합니다.

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 문자열. |
| format | const String\& | **s**가 변환되는 형식입니다. 형식 매개변수는 XML dateTime 유형에 대한 W3C 권고의 일부 하위 집합일 수 있습니다. 자세한 내용은 [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) 섹션 및 XML [Schema](../../../system.xml.schema/) 사양을 참조하십시오. 문자열 **s**는 이 형식에 대해 검증됩니다. |

### ReturnValue

제공된 문자열에 대한 [DateTimeOffset](../../../system/datetimeoffset/) 동등값.

## 또 보기

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
