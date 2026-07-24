---
title: "System::Xml::XmlNameTable::Get 메서드"
linktitle: "가져오기"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNameTable::Get 메서드. 파생 클래스에서 재정의될 경우, 주어진 배열에서 지정된 문자 범위와 동일한 문자를 포함하는 원자화 문자열을 C++에서 가져옵니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


파생 클래스에서 재정의될 경우, 주어진 배열에서 지정된 문자 범위와 동일한 문자를 포함하는 원자화된 문자열을 반환합니다.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | 조회할 이름을 포함하는 문자 배열입니다. |
| offset | int32_t | 이름의 첫 번째 문자를 지정하는 배열의 0 기반 인덱스입니다. |
| 길이 | int32_t | 이름의 문자 수입니다. |

### ReturnValue

이미 원자화되지 않은 경우 원자화 문자열 또는 **nullptr**을 반환합니다. **length**가 0이면 [String::Empty](../../../system/string/empty/)이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


파생 클래스에서 재정의될 경우, 지정된 문자열과 동일한 값을 갖는 원자화된 문자열을 반환합니다.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| array | const String\& | 조회할 이름. |

### ReturnValue

문자열이 아직 원자화되지 않은 경우 **nullptr**가 반환되는 원자화된 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
