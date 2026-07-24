---
title: "System::Xml::XmlReader::MoveToContent method"
linktitle: "MoveToContent"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::MoveToContent method. Controleert of het huidige knooppunt een inhoudsknooppunt is (tekst zonder witruimte, CDATA, Element, EndElement, EntityReference of EndEntity). Als het knooppunt geen inhoudsknooppunt is, springt de lezer vooruit naar het volgende inhoudsknooppunt of het einde van het bestand. Het slaat knooppunten van de volgende types over: ProcessingInstruction, DocumentType, Comment, Whitespace of SignificantWhitespace in C++."
type: docs
weight: 3300
url: /nl/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Controleert of het huidige knooppunt een content‑knooppunt is (tekst die geen witruimte is, **CDATA**, **Element**, **EndElement**, **EntityReference**, of **EndEntity**). Als het knooppunt geen content‑knooppunt is, springt de lezer vooruit naar het volgende content‑knooppunt of het einde van het bestand. Het slaat knooppunten van de volgende types over: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, of **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

De [XmlReader::get_NodeType](../get_nodetype/) waarde van het huidige knooppunt gevonden door de methode of [XmlNodeType::None](../../xmlnodetype/) als de lezer het einde van de invoerstroom heeft bereikt.

## Zie ook

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
