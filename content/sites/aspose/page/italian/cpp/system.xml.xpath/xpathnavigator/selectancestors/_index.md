---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors metodo"
linktitle: "SelectAncestors"
second_title: "Aspose.Page per C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors metodo. Seleziona tutti i nodi antenati del nodo corrente che hanno il nome locale e l'URI di namespace specificati in C++."
type: docs
weight: 7200
url: /it/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Seleziona tutti i nodi antenati del nodo corrente che hanno il nome locale e l'URI di namespace specificati.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome locale dei nodi antenati. |
| namespaceURI | String | L'URI di namespace dei nodi antenati. |
| matchSelf | bool | Per includere il nodo di contesto nella selezione, **true**; altrimenti, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati. I nodi restituiti sono in ordine inverso del documento.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Seleziona tutti i nodi antenati del nodo corrente che hanno un [XPathNodeType](../../xpathnodetype/) corrispondente.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XPathNodeType | Il [XPathNodeType](../../xpathnodetype/) dei nodi antenati. |
| matchSelf | bool | Per includere il nodo di contesto nella selezione, **true**; altrimenti, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati. I nodi restituiti sono in ordine inverso del documento.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
