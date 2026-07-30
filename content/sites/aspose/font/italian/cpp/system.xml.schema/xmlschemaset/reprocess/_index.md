---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess metodo"
linktitle: "Riprocessa"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess metodo. Riprocessa uno schema XML Schema definition language (XSD) che esiste già nel XmlSchemaSet in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Riprocessa uno schema XML [Schema](../../) definition language (XSD) che esiste già nel [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | SharedPtr\<XmlSchema\> | Lo schema da riprocessare. |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene lanciata un' [XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
