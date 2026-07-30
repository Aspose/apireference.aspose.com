---
title: "System::Xml::XmlAttributeCollection::SetNamedItem metodo"
linktitle: "SetNamedItem"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem metodo. Aggiunge un XmlNode usando il risultato di XmlNode::get_Name in C++."
type: docs
weight: 1000
url: /it/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Aggiunge un [XmlNode](../../xmlnode/) usando il risultato del suo [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nodo | SharedPtr\<XmlNode\> | Un nodo attributo da memorizzare in questa collezione. Il nodo sarà successivamente accessibile usando il nome del nodo. Se un nodo con quel nome è già presente nella collezione, viene sostituito da quello nuovo; altrimenti, il nodo viene aggiunto alla fine della collezione. |

### ReturnValue

Se il **node** sostituisce un nodo esistente con lo stesso nome, viene restituito il nodo vecchio; altrimenti, viene restituito il nodo aggiunto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
