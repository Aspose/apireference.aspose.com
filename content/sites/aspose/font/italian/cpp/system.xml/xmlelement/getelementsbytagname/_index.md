---
title: "System::Xml::XmlElement::GetElementsByTagName metodo"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlElement::GetElementsByTagName metodo. Restituisce un XmlNodeList contenente un elenco di tutti gli elementi discendenti che corrispondono ai valori specificati di XmlElement::get_LocalName e XmlElement::get_NamespaceURI in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Restituisce un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono ai valori specificati di [XmlElement::get_LocalName](../get_localname/) e [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale da confrontare. L'asterisco (*) è un valore speciale che corrisponde a tutti i tag. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi da confrontare. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. L'elenco è vuoto se non ci sono nodi corrispondenti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Restituisce un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al valore specificato di [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il tag nome da confrontare. Questo è un nome qualificato. Viene confrontato con il valore **get_Name** del nodo corrispondente. L'asterisco (*) è un valore speciale che corrisponde a tutti i tag. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. L'elenco è vuoto se non ci sono nodi corrispondenti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
