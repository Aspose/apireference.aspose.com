---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity 메서드. 파생 클래스에서 재정의될 경우, C++에서 대리 문자 쌍에 대한 대리 문자 엔터티를 생성하고 씁니다."
type: docs
weight: 3400
url: /ko/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


파생 클래스에서 재정의될 때, 서러게이트 문자 쌍에 대한 서러게이트 문자 엔터티를 생성하고 씁니다.

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| lowChar | char16_t | 낮은 대리 문자. 0xDC00와 0xDFFF 사이의 값이어야 합니다. |
| highChar | char16_t | 높은 대리 문자. 0xD800와 0xDBFF 사이의 값이어야 합니다. |

## 또 보기

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
