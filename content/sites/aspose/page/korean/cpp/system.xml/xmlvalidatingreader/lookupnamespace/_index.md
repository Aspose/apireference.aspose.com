---
title: "System::Xml::XmlValidatingReader::LookupNamespace 메서드"
linktitle: "LookupNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::LookupNamespace 메서드. 현재 요소의 범위에서 네임스페이스 접두사를 해결합니다 C++에서."
type: docs
weight: 3400
url: /ko/cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


현재 요소의 범위에서 네임스페이스 접두사를 해석합니다.

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | const String\& | 해결하려는 네임스페이스 Uniform Resource Identifier(URI)를 가진 접두사입니다. 기본 네임스페이스와 일치시키려면 빈 문자열을 전달하십시오. |

### ReturnValue

접두사가 매핑되는 네임스페이스 URI 또는 일치하는 접두사가 없을 경우 **nullptr**를 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
