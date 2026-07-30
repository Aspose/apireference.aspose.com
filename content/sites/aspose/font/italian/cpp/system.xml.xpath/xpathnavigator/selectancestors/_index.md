---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors metodo"
linktitle: "SelectAncestors"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors metodo. Seleziona tutti i nodi antenati del nodo corrente che hanno il nome locale e l'URI namespace specificati in C++."
type: docs
weight: 7200
url: /it/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Seleziona tutti i nodi antenati del nodo corrente che hanno il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome locale dei nodi antenati. |
| namespaceURI | Stringa | L'URI namespace dei nodi antenati. |
| matchSelf | bool | Per includere il nodo di contesto nella selezione, **true**; altrimenti, **false**. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati. I nodi restituiti sono in ordine di documento inverso.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
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

Un [XPathNodeIterator](../../xpathnodeiterator/) che contiene i nodi selezionati. I nodi restituiti sono in ordine di documento inverso.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
