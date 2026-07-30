---
title: "System::Xml::XmlNode::SelectNodes metodo"
linktitle: "SelectNodes"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::SelectNodes metodo. Seleziona un elenco di nodi che corrispondono all'espressione XPath in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Seleziona un elenco di nodi che corrispondono all'espressione [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | const String\& | L'espressione [XPath](../../../system.xml.xpath/). |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente una raccolta di nodi che corrispondono alla query [XPath](../../../system.xml.xpath/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Seleziona un elenco di nodi che corrispondono all'espressione [XPath](../../../system.xml.xpath/). Qualsiasi prefisso trovato nell'espressione [XPath](../../../system.xml.xpath/) viene risolto utilizzando il [XmlNamespaceManager](../../xmlnamespacemanager/) fornito.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | const String\& | L'espressione [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Un [XmlNamespaceManager](../../xmlnamespacemanager/) da utilizzare per risolvere gli spazi dei nomi dei prefissi nell'espressione [XPath](../../../system.xml.xpath/). |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente una raccolta di nodi che corrispondono alla query [XPath](../../../system.xml.xpath/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
