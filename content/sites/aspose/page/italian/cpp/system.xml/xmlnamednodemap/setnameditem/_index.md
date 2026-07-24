---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem metodo"
linktitle: "SetNamedItem"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem metodo. Aggiunge un XmlNode usando il valore di XmlNode::get_Name in C++."
type: docs
weight: 1000
url: /it/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Aggiunge un [XmlNode](../../xmlnode/) usando il valore di [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Un [XmlNode](../../xmlnode/) da memorizzare nella [XmlNamedNodeMap](../). Se un nodo con quel nome è già presente nella mappa, viene sostituito da quello nuovo. |

### ReturnValue

Se il **node** sostituisce un nodo esistente con lo stesso nome, il nodo vecchio viene restituito; altrimenti, viene restituito **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
