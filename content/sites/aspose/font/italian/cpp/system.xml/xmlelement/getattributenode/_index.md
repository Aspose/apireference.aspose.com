---
title: "System::Xml::XmlElement::GetAttributeNode metodo"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlElement::GetAttributeNode metodo. Restituisce l'XmlAttribute con il nome locale e l'URI dello spazio dei nomi specificati in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Restituisce l'[XmlAttribute](../../xmlattribute/) con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

L'[XmlAttribute](../../xmlattribute/) specificato o **nullptr** se non è stato trovato alcun attributo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Restituisce l'[XmlAttribute](../../xmlattribute/) con il nome specificato.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome dell'attributo da recuperare. Questo è un nome qualificato. Viene confrontato con il valore **get_Name** del nodo corrispondente. |

### ReturnValue

L'[XmlAttribute](../../xmlattribute/) specificato o **nullptr** se non è stato trovato alcun attributo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
