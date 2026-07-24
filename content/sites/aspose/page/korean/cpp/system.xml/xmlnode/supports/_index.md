---
title: "System::Xml::XmlNode::Supports 메서드"
linktitle: "Supports"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::Supports 메서드. DOM 구현이 특정 기능을 지원하는지 테스트합니다 (C++)."
type: docs
weight: 4400
url: /ko/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


DOM 구현이 특정 기능을 구현하는지 테스트합니다.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기능 | String | 테스트할 기능의 패키지 이름입니다. 이 이름은 대소문자를 구분하지 않습니다. |
| 버전 | String | 테스트할 패키지 이름의 버전 번호입니다. 버전이 지정되지 않은 경우(null), 해당 기능의 모든 버전을 지원하면 메서드는 true를 반환합니다. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## 비고



다음 표는 **true**를 반환하는 조합을 설명합니다. |||
|-|-|
| 기능 | 버전 |
| XML | 1.0 |
| XML | 2.0 |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
