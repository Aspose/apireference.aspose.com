---
title: "Metodo System::Xml::XPath::XPathNavigator::MoveToNext"
linktitle: "MoveToNext"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::MoveToNext. Quando sovrascritto in una classe derivata, sposta l'XPathNavigator al nodo fratello successivo del nodo corrente in C++."
type: docs
weight: 6000
url: /it/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](../) al nodo fratello successivo del nodo corrente.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Vedi anche

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Sposta il [XPathNavigator](../) al nodo fratello successivo con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale del nodo fratello successivo a cui spostarsi. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi del nodo fratello successivo a cui spostarsi. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Sposta il [XPathNavigator](../) al nodo fratello successivo del nodo corrente che corrisponde al [XPathNodeType](../../xpathnodetype/) specificato.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XPathNodeType | Il [XPathNodeType](../../xpathnodetype/) del nodo fratello a cui spostarsi. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Vedi anche

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
