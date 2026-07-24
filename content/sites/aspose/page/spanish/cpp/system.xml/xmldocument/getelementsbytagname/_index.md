---
title: "System::Xml::XmlDocument::GetElementsByTagName método"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlDocument::GetElementsByTagName método. Devuelve un XmlNodeList que contiene una lista de todos los elementos descendientes que coinciden con el XmlDocument::get_LocalName y XmlNode::get_NamespaceURI especificados en C++."
type: docs
weight: 3200
url: /es/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Devuelve un [XmlNodeList](../../xmlnodelist/) que contiene una lista de todos los elementos descendientes que coinciden con el [XmlDocument::get_LocalName](../get_localname/) y [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) especificados.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| localName | String | El LocalName a coincidir. El valor especial **"*"** coincide con todas las etiquetas. |
| namespaceURI | String | NamespaceURI a coincidir. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) que contiene una lista de todos los nodos coincidentes. Si ningún nodo coincide con el **localName** y **namespaceURI** especificados, la colección devuelta estará vacía.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Devuelve un [XmlNodeList](../../xmlnodelist/) que contiene una lista de todos los elementos descendientes que coinciden con el nombre especificado.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | String | El nombre calificado a coincidir. Se compara con el valor **get_Name** del nodo coincidente. El valor especial **"*"** coincide con todas las etiquetas. |

### ReturnValue

Un [XmlNodeList](../../xmlnodelist/) que contiene una lista de todos los nodos coincidentes. Si ningún nodo coincide con **name**, la colección devuelta estará vacía.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
