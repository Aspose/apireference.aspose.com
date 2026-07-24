---
title: "System::Xml::XmlReader::MoveToContent method"
linktitle: "MoveToContent"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::MoveToContent 메서드. 현재 노드가 콘텐츠(공백이 아닌 텍스트, CDATA, Element, EndElement, EntityReference 또는 EndEntity) 노드인지 확인합니다. 노드가 콘텐츠 노드가 아니면, 리더는 다음 콘텐츠 노드 또는 파일 끝까지 건너뜁니다. 다음 유형의 노드를 건너뜁니다: ProcessingInstruction, DocumentType, Comment, Whitespace 또는 SignificantWhitespace. C++에서."
type: docs
weight: 3300
url: /ko/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


현재 노드가 콘텐츠(공백이 아닌 텍스트, **CDATA**, **Element**, **EndElement**, **EntityReference**, 또는 **EndEntity**) 노드인지 확인합니다. 노드가 콘텐츠 노드가 아니면, 리더는 다음 콘텐츠 노드나 파일 끝까지 건너뜁니다. 다음 유형의 노드를 건너뜁니다: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, 또는 **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

메서드가 찾은 현재 노드의 [XmlReader::get_NodeType](../get_nodetype/) 값 또는 리더가 입력 스트림의 끝에 도달한 경우 [XmlNodeType::None](../../xmlnodetype/) 값입니다.

## 또 보기

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
