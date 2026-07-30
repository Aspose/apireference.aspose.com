---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get metodo"
linktitle: "idx_get"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get metodo. Restituisce lo XmlSchema associato all'URI dello spazio dei nomi fornito in C++."
type: docs
weight: 800
url: /it/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Restituisce lo [XmlSchema](../../xmlschema/) associato all'URI dello spazio dei nomi fornito.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | L'URI dello spazio dei nomi associato allo schema che si desidera restituire. Tipicamente sarà il **targetNamespace** dello schema. |

### ReturnValue

Lo [XmlSchema](../../xmlschema/) associato all'URI dello spazio dei nomi; **nullptr** se non esiste alcuno schema caricato associato allo spazio dei nomi fornito o se lo spazio dei nomi è associato a uno schema XDR.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
