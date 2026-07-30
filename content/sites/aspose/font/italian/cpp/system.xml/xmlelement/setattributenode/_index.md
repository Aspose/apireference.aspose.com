---
title: "System::Xml::XmlElement::SetAttributeNode metodo"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlElement::SetAttributeNode metodo. Aggiunge l'XmlAttribute specificato in C++."
type: docs
weight: 2700
url: /it/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Aggiunge l'[XmlAttribute](../../xmlattribute/) specificato.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Il nodo [XmlAttribute](../../xmlattribute/) da aggiungere alla raccolta di attributi per questo elemento. |

### ReturnValue

Se l'attributo sostituisce un attributo esistente con lo stesso nome, viene restituito il vecchio [XmlAttribute](../../xmlattribute/); altrimenti, viene restituito **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Aggiunge l'[XmlAttribute](../../xmlattribute/) specificato.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

L'[XmlAttribute](../../xmlattribute/) da aggiungere.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
