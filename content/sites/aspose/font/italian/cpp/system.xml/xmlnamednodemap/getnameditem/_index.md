---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem metodo"
linktitle: "GetNamedItem"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem metodo. Recupera un nodo con i valori corrispondenti di XmlNode::get_LocalName e XmlNode::get_NamespaceURI in C++."
type: docs
weight: 700
url: /it/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Recupera un nodo con i valori corrispondenti di [XmlNode::get_LocalName](../../xmlnode/get_localname/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale del nodo da recuperare. |
| namespaceURI | Stringa | L'Uniform Resource Identifier (URI) dello spazio dei nomi del nodo da recuperare. |

### ReturnValue

Un [XmlNode](../../xmlnode/) con il nome locale e l'URI dello spazio dei nomi corrispondenti o **nullptr** se non è stato trovato alcun nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Recupera un [XmlNode](../../xmlnode/) specificato per nome.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome qualificato del nodo da recuperare. Viene confrontato con il valore [XmlNode::get_Name](../../xmlnode/get_name/) del nodo corrispondente. |

### ReturnValue

Un [XmlNode](../../xmlnode/) con il nome specificato o **nullptr** se non viene trovato alcun nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
