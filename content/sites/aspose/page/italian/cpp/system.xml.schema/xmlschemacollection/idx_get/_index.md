---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get metodo"
linktitle: "idx_get"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get metodo. Restituisce l'XmlSchema associato al namespace URI fornito in C++."
type: docs
weight: 800
url: /it/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Restituisce l'[XmlSchema](../../xmlschema/) associato al namespace URI fornito.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | Il namespace URI associato allo schema che si desidera restituire. Questo sarà tipicamente il **targetNamespace** dello schema. |

### ReturnValue

L'[XmlSchema](../../xmlschema/) associato al namespace URI; **nullptr** se non esiste uno schema caricato associato al namespace fornito o se il namespace è associato a uno schema XDR.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
