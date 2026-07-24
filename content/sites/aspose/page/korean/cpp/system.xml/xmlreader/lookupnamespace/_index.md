---
title: "System::Xml::XmlReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::LookupNamespace 메서드. 파생 클래스에서 재정의될 경우 C++에서 현재 요소의 범위 내 네임스페이스 접두사를 해결합니다."
type: docs
weight: 3100
url: /ko/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


파생 클래스에서 재정의될 때, 현재 요소 범위에서 네임스페이스 접두사를 해석합니다.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | const String\& | 해결하려는 네임스페이스 URI의 접두사입니다. 기본 네임스페이스와 일치시키려면 빈 문자열을 전달하십시오. |

### ReturnValue

접두사가 매핑되는 네임스페이스 URI 또는 일치하는 접두사가 없을 경우 **nullptr**를 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
