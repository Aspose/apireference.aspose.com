---
title: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 메서드"
linktitle: "WriteSurrogateCharEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity 메서드. C++에서 서러게이트 문자 쌍에 대한 서러게이트 문자 엔터티를 생성하고 기록합니다."
type: docs
weight: 4000
url: /ko/cpp/system.xml/xmltextwriter/writesurrogatecharentity/
---
## XmlTextWriter::WriteSurrogateCharEntity method


서러게이트 문자 쌍에 대한 서러게이트 문자 엔터티를 생성하고 기록합니다.

```cpp
void System::Xml::XmlTextWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| lowChar | char16_t | 낮은 서러게이트입니다. 이는 **0xDC00**와 **0xDFFF** 사이의 값이어야 합니다. |
| highChar | char16_t | 높은 서러게이트입니다. 이는 **0xD800**와 **0xDBFF** 사이의 값이어야 합니다. |

## 또 보기

* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
