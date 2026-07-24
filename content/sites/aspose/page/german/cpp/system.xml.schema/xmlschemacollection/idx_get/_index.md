---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get Methode"
linktitle: "idx_get"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get Methode. Gibt das XmlSchema zurück, das mit dem angegebenen Namespace‑URI in C++ verknüpft ist."
type: docs
weight: 800
url: /de/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Gibt das [XmlSchema](../../xmlschema/) zurück, das mit dem angegebenen Namespace‑URI verknüpft ist.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ns | const String\& | Der Namespace‑URI, der dem Schema zugeordnet ist, das Sie zurückgeben möchten. Dies ist typischerweise das **targetNamespace** des Schemas. |

### ReturnValue

Das [XmlSchema](../../xmlschema/) ist dem Namespace‑URI zugeordnet; **nullptr**, wenn kein geladenes Schema dem angegebenen Namespace zugeordnet ist oder wenn der Namespace einem XDR‑Schema zugeordnet ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
