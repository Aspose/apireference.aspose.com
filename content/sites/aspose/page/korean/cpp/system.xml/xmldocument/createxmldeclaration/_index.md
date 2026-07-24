---
title: "System::Xml::XmlDocument::CreateXmlDeclaration 메서드"
linktitle: "CreateXmlDeclaration"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::CreateXmlDeclaration 메서드. 지정된 값을 사용하여 C++에서 XmlDeclaration 노드를 생성합니다."
type: docs
weight: 1600
url: /ko/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


지정된 값을 가진 [XmlDeclaration](../../xmldeclaration/) 노드를 생성합니다.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버전 | const String\& | 버전은 "1.0"이어야 합니다. |
| encoding | const String\& | 인코딩 속성의 값. 이는 [XmlDocument](../)을 파일이나 스트림에 저장할 때 사용되는 인코딩이며, 따라서 [Text::Encoding](../../../system.text/encoding/) 클래스에서 지원하는 문자열로 설정해야 하며, 그렇지 않으면 "XmlDocument::Save(String)"이 실패합니다. 이 값이 **nullptr**이거나 [String::Empty](../../../system/string/empty/)인 경우, [XmlDocument::Save](../save/) 메서드는 XML 선언에 인코딩 속성을 기록하지 않으며 기본 인코딩인 UTF-8이 사용됩니다. |
| standalone | const String\& | 값은 "yes" 또는 "no"여야 합니다. 이 값이 **nullptr**이거나 [String::Empty](../../../system/string/empty/)인 경우, [XmlDocument::Save](../save/) 메서드는 XML 선언에 standalone 속성을 기록하지 않습니다. |

### ReturnValue

새로운 [XmlDeclaration](../../xmldeclaration/) 노드.
## 비고



참고: [XmlDocument](../)이 TextWriter 또는 [XmlTextWriter](../../xmltextwriter/)에 저장되는 경우, 이 인코딩 값은 무시됩니다. 대신 TextWriter 또는 [XmlTextWriter](../../xmltextwriter/)의 인코딩이 사용됩니다. 이렇게 하면 출력된 XML을 올바른 인코딩으로 다시 읽을 수 있습니다.
## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
