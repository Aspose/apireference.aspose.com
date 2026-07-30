---
title: "System::Xml::XmlAttribute::PrependChild metodo"
linktitle: "PrependChild"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlAttribute::PrependChild metodo. Aggiunge il nodo specificato all'inizio dell'elenco dei nodi figlio per questo nodo in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Aggiunge il nodo specificato all'inizio dell'elenco dei nodi figlio per questo nodo.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Il [XmlNode](../../xmlnode/) da aggiungere. Se è un [XmlDocumentFragment](../../xmldocumentfragment/), l'intero contenuto del frammento di documento viene spostato nell'elenco dei figli di questo nodo. |

### ReturnValue

Il [XmlNode](../../xmlnode/) aggiunto.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
