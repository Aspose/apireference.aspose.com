---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem metodo"
linktitle: "SetNamedItem"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem metodo. Aggiunge un XmlNode usando il suo valore XmlNode::get_Name in C++."
type: docs
weight: 1000
url: /it/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Aggiunge un [XmlNode](../../xmlnode/) utilizzando il valore del suo [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Un [XmlNode](../../xmlnode/) da memorizzare nella [XmlNamedNodeMap](../). Se un nodo con quel nome è già presente nella mappa, viene sostituito da quello nuovo. |

### ReturnValue

Se il **node** sostituisce un nodo esistente con lo stesso nome, viene restituito il nodo vecchio; altrimenti, viene restituito **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
