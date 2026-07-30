---
title: "System::Xml::XmlReader::get_SchemaInfo metodo"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::get_SchemaInfo metodo. Restituisce le informazioni sullo schema assegnate al nodo corrente come risultato della convalida dello schema in C++."
type: docs
weight: 2200
url: /it/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Restituisce le informazioni dello schema che sono state assegnate al nodo corrente a seguito della convalida dello schema.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Un oggetto IXmlSchemaInfo contenente le informazioni sullo schema per il nodo corrente. Le informazioni [Schema](../../../system.xml.schema/) possono essere impostate su elementi, attributi o su nodi di testo con un valore non nullo di [XmlReader::get_ValueType](../get_valuetype/). Se il nodo corrente non è uno dei tipi di nodo sopra elencati, o se l'istanza di [XmlReader](../) non fornisce informazioni sullo schema, questo metodo restituisce **nullptr**. Se questo metodo viene chiamato da un oggetto [XmlTextReader](../../xmltextreader/) o [XmlValidatingReader](../../xmlvalidatingreader/), restituisce sempre **nullptr**. Queste implementazioni di [XmlReader](../) non espongono le informazioni sullo schema tramite il metodo get_SchemaInfo.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
