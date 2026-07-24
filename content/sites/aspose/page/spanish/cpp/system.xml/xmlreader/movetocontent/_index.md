---
title: "Método System::Xml::XmlReader::MoveToContent"
linktitle: "MoveToContent"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlReader::MoveToContent. Comprueba si el nodo actual es un nodo de contenido (texto que no sea espacio en blanco, CDATA, Element, EndElement, EntityReference o EndEntity). Si el nodo no es un nodo de contenido, el lector avanza hasta el siguiente nodo de contenido o el final del archivo. Omite los nodos de los siguientes tipos: ProcessingInstruction, DocumentType, Comment, Whitespace o SignificantWhitespace en C++."
type: docs
weight: 3300
url: /es/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Comprueba si el nodo actual es un nodo de contenido (texto que no es espacio en blanco, **CDATA**, **Element**, **EndElement**, **EntityReference** o **EndEntity**). Si el nodo no es un nodo de contenido, el lector avanza hasta el siguiente nodo de contenido o el final del archivo. Omite los nodos del siguiente tipo: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** o **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

El valor [XmlReader::get_NodeType](../get_nodetype/) del nodo actual encontrado por el método o [XmlNodeType::None](../../xmlnodetype/) si el lector ha alcanzado el final del flujo de entrada.

## Ver también

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
