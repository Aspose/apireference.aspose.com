---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing metodo"
linktitle: "MoveToFollowing"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing metodo. Sposta lo XPathNavigator sull'elemento con il nome locale e l'URI dello spazio dei nomi specificati in ordine di documento in C++."
type: docs
weight: 5700
url: /it/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Sposta il [XPathNavigator](../) sull'elemento con il nome locale e l'URI dello spazio dei nomi specificati in ordine di documento.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'elemento. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'elemento. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Sposta il [XPathNavigator](../) sull'elemento con il nome locale e l'URI dello spazio dei nomi specificati, fino al limite specificato, in ordine di documento.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'elemento. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'elemento. |
| end | SharedPtr\<XPathNavigator\> | L'oggetto [XPathNavigator](../) posizionato sul confine dell'elemento che il [XPathNavigator](../) corrente non supererà durante la ricerca dell'elemento successivo. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Sposta il [XPathNavigator](../) sull'elemento successivo del [XPathNodeType](../../xpathnodetype/) specificato in ordine di documento.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XPathNodeType | Il [XPathNodeType](../../xpathnodetype/) dell'elemento. Il [XPathNodeType](../../xpathnodetype/) non può essere [XPathNodeType::Attribute](../../xpathnodetype/) o [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Vedi anche

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Sposta il [XPathNavigator](../) sull'elemento successivo del [XPathNodeType](../../xpathnodetype/) specificato, fino al limite specificato, in ordine di documento.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | XPathNodeType | Il [XPathNodeType](../../xpathnodetype/) dell'elemento. Il [XPathNodeType](../../xpathnodetype/) non può essere [XPathNodeType::Attribute](../../xpathnodetype/) o [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | L'oggetto [XPathNavigator](../) posizionato sul confine dell'elemento che il [XPathNavigator](../) corrente non supererà durante la ricerca dell'elemento successivo. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Vedi anche

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
