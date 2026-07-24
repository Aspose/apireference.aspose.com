---
title: "System::Xml::XmlNode::get_ParentNode methode"
linktitle: "get_ParentNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::get_ParentNode methode. Retourneert de ouder van dit knooppunt (voor knooppunten die een ouder kunnen hebben) in C++."
type: docs
weight: 2100
url: /nl/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


Retourneert de ouder van dit knooppunt (voor knooppunten die een ouder kunnen hebben).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

De [XmlNode](../) die de ouder is van het huidige knooppunt.
## Opmerkingen



Als een knooppunt net is aangemaakt en nog niet aan de boom is toegevoegd, of als het uit de boom is verwijderd, is de ouder **nullptr**. Voor alle andere knooppunten hangt de geretourneerde waarde af van de [XmlNode::get_NodeType](../get_nodetype/) van het knooppunt. De volgende tabel beschrijft de mogelijke retourwaarden voor de **get_NodeType** methode. |||
|-|-|
| NodeType | Retourwaarde van ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | Retourneert **nullptr**; deze knooppunten hebben geen ouder. |
| CDATA | Retourneert het element of de entiteitsreferentie die de CDATA-sectie bevat. |
| Comment | Retourneert het element, de entiteitsreferentie, het documenttype of het document dat de opmerking bevat. |
| DocumentType | Retourneert het documentknooppunt. |
| Element | Retourneert het ouderknooppunt van het element. Als het element het wortelknooppunt in de boom is, is de ouder het documentknooppunt. |
| EntityReference | Retourneert het element, attribuut of de entiteitsreferentie die de entiteitsreferentie bevat. |
| ProcessingInstruction | Retourneert het document, element, documenttype of de entiteitsreferentie die de verwerkingsinstructie bevat. |
| Text | Retourneert het ouder-element, attribuut of de entiteitsreferentie die het tekstknooppunt bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
