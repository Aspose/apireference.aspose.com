---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants metodo"
linktitle: "SelectDescendants"
second_title: "Aspose.Page per C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants metodo. Seleziona tutti i nodi discendenti del nodo corrente con il nome locale e l'URI di namespace specificati in C++."
type: docs
weight: 7400
url: /it/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Seleziona tutti i nodi discendenti del nodo corrente con il nome locale e l'URI di namespace specificati.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome locale dei nodi discendenti. |
| namespaceURI | String | L'URI di namespace dei nodi discendenti. |
| matchSelf | bool | **true** per includere il nodo di contesto nella selezione; altrimenti, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Seleziona tutti i nodi discendenti del nodo corrente che hanno un [XPathNodeType](../../xpathnodetype/) corrispondente.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XPathNodeType | Il [XPathNodeType](../../xpathnodetype/) dei nodi discendenti. |
| matchSelf | bool | **true** per includere il nodo di contesto nella selezione; altrimenti, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
