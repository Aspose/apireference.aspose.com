---
title: "System::Xml::XmlDocument::GetElementsByTagName metodo"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlDocument::GetElementsByTagName metodo. Restituisce un XmlNodeList contenente un elenco di tutti gli elementi discendenti che corrispondono a XmlDocument::get_LocalName e XmlNode::get_NamespaceURI specificati in C++."
type: docs
weight: 3200
url: /it/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Restituisce un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono a [XmlDocument::get_LocalName](../get_localname/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) specificati.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | String | Il LocalName da corrispondere. Il valore speciale **\"*\"** corrisponde a tutti i tag. |
| namespaceURI | String | NamespaceURI da corrispondere. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. Se nessun nodo corrisponde al **localName** e **namespaceURI** specificati, la collezione restituita sarà vuota.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Restituisce un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al nome specificato.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome qualificato da corrispondere. Viene confrontato con il valore **get_Name** del nodo corrispondente. Il valore speciale **\"*\"** corrisponde a tutti i tag. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) contenente un elenco di tutti i nodi corrispondenti. Se nessun nodo corrisponde a **name**, la collezione restituita sarà vuota.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
