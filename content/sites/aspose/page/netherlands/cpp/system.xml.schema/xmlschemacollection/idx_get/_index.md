---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get method"
linktitle: "idx_get"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get method. Retourneert de XmlSchema die is gekoppeld aan de opgegeven namespace-URI in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Retourneert de [XmlSchema](../../xmlschema/) die is gekoppeld aan de opgegeven namespace-URI.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ns | const String\& | De namespace-URI die is gekoppeld aan het schema dat u wilt retourneren. Dit is meestal de **targetNamespace** van het schema. |

### ReturnValue

De [XmlSchema](../../xmlschema/) die is gekoppeld aan de namespace-URI; **nullptr** als er geen geladen schema is gekoppeld aan de opgegeven namespace of als de namespace is gekoppeld aan een XDR-schema.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
