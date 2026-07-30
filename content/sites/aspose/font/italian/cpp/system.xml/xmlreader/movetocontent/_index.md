---
title: "System::Xml::XmlReader::MoveToContent metodo"
linktitle: "MoveToContent"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::MoveToContent metodo. Verifica se il nodo corrente è un nodo di contenuto (testo non bianco, CDATA, Element, EndElement, EntityReference o EndEntity). Se il nodo non è un nodo di contenuto, il lettore salta al nodo di contenuto successivo o alla fine del file. Salta i nodi del seguente tipo: ProcessingInstruction, DocumentType, Comment, Whitespace o SignificantWhitespace in C++."
type: docs
weight: 3300
url: /it/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Verifica se il nodo corrente è un nodo di contenuto (testo non bianco, **CDATA**, **Element**, **EndElement**, **EntityReference** o **EndEntity**). Se il nodo non è un nodo di contenuto, il lettore salta al nodo di contenuto successivo o alla fine del file. Salta i nodi dei seguenti tipi: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** o **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Il valore [XmlReader::get_NodeType](../get_nodetype/) del nodo corrente trovato dal metodo o [XmlNodeType::None](../../xmlnodetype/) se il lettore ha raggiunto la fine del flusso di input.

## Vedi anche

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
