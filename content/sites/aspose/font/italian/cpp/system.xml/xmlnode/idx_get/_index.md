---
title: "System::Xml::XmlNode::idx_get metodo"
linktitle: "idx_get"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::idx_get metodo. Restituisce il primo elemento figlio con i valori specificati di XmlNode::get_LocalName e XmlNode::get_NamespaceURI in C++."
type: docs
weight: 3000
url: /it/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Restituisce il primo elemento figlio con i valori specificati di [XmlNode::get_LocalName](../get_localname/) e [XmlNode::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localname | Stringa | Il nome locale dell'elemento. |
| ns | Stringa | L'URI dello spazio dei nomi dell'elemento. |

### ReturnValue

Il primo [XmlElement](../../xmlelement/) con **localname** e **ns** corrispondenti. Restituisce **nullptr** se non c'è corrispondenza.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::idx_get(String) method


Restituisce il primo elemento figlio con il valore specificato di [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'elemento da recuperare. |

### ReturnValue

Il primo [XmlElement](../../xmlelement/) che corrisponde al nome specificato. Restituisce **nullptr** se non c'è corrispondenza.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
