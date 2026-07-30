---
title: "System::Xml::XmlNode::SelectSingleNode metodo"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::SelectSingleNode metodo. Seleziona il primo XmlNode che corrisponde all'espressione XPath in C++."
type: docs
weight: 3900
url: /it/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


Seleziona il primo [XmlNode](../) che corrisponde all'espressione [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | const String\& | L'espressione [XPath](../../../system.xml.xpath/). |

### ReturnValue

Il primo [XmlNode](../) che corrisponde alla query [XPath](../../../system.xml.xpath/) o **nullptr** se non viene trovato alcun nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Seleziona il primo [XmlNode](../) che corrisponde all'espressione [XPath](../../../system.xml.xpath/). Qualsiasi prefisso trovato nell'espressione [XPath](../../../system.xml.xpath/) viene risolto utilizzando il [XmlNamespaceManager](../../xmlnamespacemanager/) fornito.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | const String\& | L'espressione [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Un [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per risolvere gli spazi dei nomi dei prefissi nell'espressione [XPath](../../../system.xml.xpath/). |

### ReturnValue

Il primo [XmlNode](../) che corrisponde alla query [XPath](../../../system.xml.xpath/) o **nullptr** se non viene trovato alcun nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
