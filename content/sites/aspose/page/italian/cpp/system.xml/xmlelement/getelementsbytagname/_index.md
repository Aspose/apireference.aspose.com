---
title: "Metodo System::Xml::XmlElement::GetElementsByTagName"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlElement::GetElementsByTagName. Restituisce un XmlNodeList contenente un elenco di tutti gli elementi discendenti che corrispondono ai valori specificati XmlElement::get_LocalName e XmlElement::get_NamespaceURI in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Restituisce un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono ai valori specificati [XmlElement::get_LocalName](../get_localname/) e [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | String | Il nome locale da confrontare. L'asterisco (*) è un valore speciale che corrisponde a tutti i tag. |
| namespaceURI | String | L'URI dello spazio dei nomi da confrontare. |

### ReturnValue

Una [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. L'elenco è vuoto se non ci sono nodi corrispondenti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Restituisce una [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al [XmlElement::get_Name](../get_name/) specificato.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il tag nome da confrontare. Questo è un nome qualificato. Viene confrontato con il valore **get_Name** del nodo corrispondente. L'asterisco (*) è un valore speciale che corrisponde a tutti i tag. |

### ReturnValue

Una [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. L'elenco è vuoto se non ci sono nodi corrispondenti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
