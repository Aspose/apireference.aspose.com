---
title: "Metodo System::Xml::Schema::XmlSchemaSet::Reprocess"
linktitle: "Riprocessa"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Schema::XmlSchemaSet::Reprocess. Riprocessa uno schema del linguaggio di definizione XML Schema (XSD) che esiste già nell'XmlSchemaSet in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Riprocessa uno schema del linguaggio di definizione XML [Schema](../../) (XSD) che esiste già nel [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | SharedPtr\<XmlSchema\> | Lo schema da riprocessare. |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un'eccezione [XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
