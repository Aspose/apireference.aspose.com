---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get método"
linktitle: "idx_get"
second_title: "Aspose.Page para C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get método. Devuelve el XmlSchema asociado al URI de espacio de nombres proporcionado en C++."
type: docs
weight: 800
url: /es/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Devuelve el [XmlSchema](../../xmlschema/) asociado al URI de espacio de nombres proporcionado.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ns | const String\& | El URI de espacio de nombres asociado al esquema que deseas devolver. Normalmente será el **targetNamespace** del esquema. |

### ReturnValue

El [XmlSchema](../../xmlschema/) asociado al URI de espacio de nombres; **nullptr** si no hay ningún esquema cargado asociado al espacio de nombres proporcionado o si el espacio de nombres está asociado a un esquema XDR.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
