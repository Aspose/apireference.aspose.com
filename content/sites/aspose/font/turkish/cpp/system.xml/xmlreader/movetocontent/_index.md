---
title: "System::Xml::XmlReader::MoveToContent yöntemi"
linktitle: "MoveToContent"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::MoveToContent yöntemi. Geçerli düğümün içerik (beyaz boşluk olmayan metin, CDATA, Element, EndElement, EntityReference veya EndEntity) düğümü olup olmadığını kontrol eder. Düğüm bir içerik düğümü değilse, okuyucu bir sonraki içerik düğümüne ya da dosyanın sonuna atlar. Aşağıdaki türdeki düğümleri atlar: ProcessingInstruction, DocumentType, Comment, Whitespace veya SignificantWhitespace C++'ta."
type: docs
weight: 3300
url: /tr/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Geçerli düğümün bir içerik (boşluk olmayan metin, **CDATA**, **Element**, **EndElement**, **EntityReference** veya **EndEntity**) düğümü olup olmadığını denetler. Düğüm bir içerik düğümü değilse, okuyucu bir sonraki içerik düğümüne ya da dosyanın sonuna atlar. Aşağıdaki türdeki düğümleri atlar: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** veya **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Metodun bulduğu geçerli düğümün [XmlReader::get_NodeType](../get_nodetype/) değeri veya okuyucu giriş akışının sonuna ulaşmışsa [XmlNodeType::None](../../xmlnodetype/).

## Ayrıca Bakınız

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
