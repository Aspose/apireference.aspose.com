---
title: "System::Xml::XmlImplementation::HasFeature 메서드"
linktitle: "HasFeature"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlImplementation::HasFeature 메서드. C++에서 Document Object Model (DOM) 구현이 특정 기능을 지원하는지 테스트합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Document [Object](../../../system/object/) Model (DOM) 구현이 특정 기능을 지원하는지 테스트합니다.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strFeature | const String\& | 테스트할 기능의 패키지 이름입니다. 이 이름은 대소문자를 구분하지 않습니다. |
| strVersion | const String\& | 이것은 테스트용 패키지 이름의 버전 번호입니다. 버전이 지정되지 않은 경우 (**nullptr**), 기능의 모든 버전을 지원하면 메서드가 **true**를 반환합니다. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 비고



다음 표는 **HasFeature**가 **true**를 반환하게 하는 조합을 보여줍니다. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
