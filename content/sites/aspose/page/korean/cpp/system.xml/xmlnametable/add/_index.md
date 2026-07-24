---
title: "System::Xml::XmlNameTable::Add 메서드"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNameTable::Add 메서드. 파생 클래스에서 재정의될 경우, 지정된 문자열을 원자화하고 C++에서 XmlNameTable에 추가합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


파생 클래스에서 재정의될 경우, 지정된 문자열을 원자화하고 [XmlNameTable](../)에 추가합니다.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | 추가할 이름을 포함하는 문자 배열입니다. |
| offset | int32_t | 이름의 첫 번째 문자를 지정하는 배열의 0 기반 인덱스입니다. |
| 길이 | int32_t | 이름의 문자 수입니다. |

### ReturnValue

이미 존재하는 경우 새 원자화 문자열 또는 기존 문자열을 반환합니다. 길이가 0이면 [String::Empty](../../../system/string/empty/)이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


파생 클래스에서 재정의될 경우, 지정된 문자열을 원자화하고 [XmlNameTable](../)에 추가합니다.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const String\& | 추가할 이름입니다. |

### ReturnValue

이미 존재하는 경우 새 원자화 문자열 또는 기존 문자열입니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
