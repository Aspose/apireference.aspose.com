---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem metodo"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. Rimuove un nodo con i valori corrispondenti di XmlNode::get_LocalName e XmlNode::get_NamespaceURI in C++."
type: docs
weight: 900
url: /it/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Rimuove un nodo con i valori corrispondenti di [XmlNode::get_LocalName](../../xmlnode/get_localname/) e [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale del nodo da rimuovere. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi del nodo da rimuovere. |

### ReturnValue

Il [XmlNode](../../xmlnode/) rimosso o **nullptr** se non è stato trovato un nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Rimuove il nodo dalla [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome qualificato del nodo da rimuovere. Il nome è confrontato con il valore [XmlNode::get_Name](../../xmlnode/get_name/) del nodo corrispondente. |

### ReturnValue

Il [XmlNode](../../xmlnode/) rimosso da questa [XmlNamedNodeMap](../) o **nullptr** se non è stato trovato un nodo corrispondente.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
