---
title: "System::Xml::XmlNode::get_ParentNode method"
linktitle: "get_ParentNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::get_ParentNode method. Restituisce il genitore di questo nodo (per i nodi che possono avere genitori) in C++."
type: docs
weight: 2100
url: /it/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


Restituisce il genitore di questo nodo (per i nodi che possono avere genitori).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

Il [XmlNode](../) che è il genitore del nodo corrente.
## Osservazioni



Se un nodo è appena stato creato e non è ancora stato aggiunto all'albero, o se è stato rimosso dall'albero, il genitore è **nullptr**. Per tutti gli altri nodi, il valore restituito dipende da [XmlNode::get_NodeType](../get_nodetype/) del nodo. La tabella seguente descrive i possibili valori di ritorno per il metodo **get_NodeType**. |||
|-|-|
| NodeType | Valore di ritorno di ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | Restituisce nullptr; questi nodi non hanno genitori. |
| CDATA | Restituisce l'elemento o il riferimento all'entità che contiene la sezione CDATA. |
| Comment | Restituisce l'elemento, il riferimento all'entità, il tipo di documento o il documento che contiene il commento. |
| DocumentType | Restituisce il nodo documento. |
| Element | Restituisce il nodo genitore dell'elemento. Se l'elemento è il nodo radice nell'albero, il genitore è il nodo documento. |
| EntityReference | Restituisce l'elemento, l'attributo o il riferimento all'entità che contiene il riferimento all'entità. |
| ProcessingInstruction | Restituisce il documento, l'elemento, il tipo di documento o il riferimento all'entità che contiene l'istruzione di elaborazione. |
| Text | Restituisce l'elemento genitore, l'attributo o il riferimento all'entità che contiene il nodo di testo. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
