---
title: "System::Xml::XmlReader::MoveToContent Methode"
linktitle: "MoveToContent"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlReader::MoveToContent Methode. Prüft, ob der aktuelle Knoten ein Inhaltsknoten (Text ohne Leerzeichen, CDATA, Element, EndElement, EntityReference oder EndEntity) ist. Wenn der Knoten kein Inhaltsknoten ist, springt der Reader zum nächsten Inhaltsknoten oder zum Dateiende. Er überspringt Knoten der folgenden Typen: ProcessingInstruction, DocumentType, Comment, Whitespace oder SignificantWhitespace in C++."
type: docs
weight: 3300
url: /de/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Prüft, ob der aktuelle Knoten ein Inhaltsknoten (nicht‑Leerzeichen‑Text, **CDATA**, **Element**, **EndElement**, **EntityReference** oder **EndEntity**) ist. Ist der Knoten kein Inhaltsknoten, springt der Reader zum nächsten Inhaltsknoten oder zum Dateiende. Er überspringt Knoten der folgenden Typen: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** oder **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Der [XmlReader::get_NodeType](../get_nodetype/)-Wert des vom Verfahren gefundenen aktuellen Knotens oder [XmlNodeType::None](../../xmlnodetype/), falls der Reader das Ende des Eingabestreams erreicht hat.

## Siehe auch

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
