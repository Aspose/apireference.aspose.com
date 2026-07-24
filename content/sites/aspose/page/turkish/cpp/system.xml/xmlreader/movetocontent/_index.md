---
title: "System::Xml::XmlReader::MoveToContent yöntemi"
linktitle: "MoveToContent"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::MoveToContent yöntemi. Geçerli düğümün bir içerik (beyaz boşluk olmayan metin, CDATA, Element, EndElement, EntityReference veya EndEntity) düğümü olup olmadığını denetler. Düğüm bir içerik düğümü değilse, okuyucu bir sonraki içerik düğümüne ya da dosya sonuna atlar. Aşağıdaki türdeki düğümleri atlar: ProcessingInstruction, DocumentType, Comment, Whitespace veya SignificantWhitespace C++'ta."
type: docs
weight: 3300
url: /tr/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Geçerli düğümün bir içerik (boşluk olmayan metin, **CDATA**, **Element**, **EndElement**, **EntityReference** veya **EndEntity**) düğümü olup olmadığını kontrol eder. Düğüm bir içerik düğümü değilse, okuyucu bir sonraki içerik düğümüne veya dosya sonuna atlar. Aşağıdaki türdeki düğümleri atlar: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** veya **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Yöntem tarafından bulunan geçerli düğümün [XmlReader::get_NodeType](../get_nodetype/) değeri veya okuyucu giriş akışının sonuna ulaşmışsa [XmlNodeType::None](../../xmlnodetype/) değeri.

## Ayrıca Bakınız

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
