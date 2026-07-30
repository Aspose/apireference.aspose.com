---
title: "System::Xml::XmlElement::RemoveAttributeNode metodo"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlElement::RemoveAttributeNode metodo. Rimuove lo XmlAttribute specificato in C++."
type: docs
weight: 2100
url: /it/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Rimuove lo [XmlAttribute](../../xmlattribute/) specificato.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Il nodo [XmlAttribute](../../xmlattribute/) da rimuovere. Se l'attributo rimosso ha un valore predefinito, viene immediatamente sostituito. |

### ReturnValue

Lo [XmlAttribute](../../xmlattribute/) rimosso o **nullptr** se **oldAttr** non è un nodo attributo del [XmlElement](../).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Rimuove lo [XmlAttribute](../../xmlattribute/) specificato dal nome locale e dall'URI dello spazio dei nomi. (Se l'attributo rimosso ha un valore predefinito, viene immediatamente sostituito).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

L'elemento [XmlAttribute](../../xmlattribute/) rimosso o **nullptr** se il [XmlElement](../) non ha un nodo attributo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
