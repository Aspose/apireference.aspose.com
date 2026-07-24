---
title: "Método System::Xml::Schema::XmlSchemaSet::Contains"
linktitle: "Contains"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::Schema::XmlSchemaSet::Contains. Indica si el objeto XmlSchema del lenguaje de definición de XML Schema (XSD) especificado está en el XmlSchemaSet en C++."
type: docs
weight: 400
url: /es/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Indica si el objeto [XmlSchema](../../xmlschema/) del lenguaje de definición de XML [Schema](../../) (XSD) especificado está en el [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | El objeto [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


Indica si un esquema del lenguaje de definición de XML [Schema](../../) (XSD) con el URI del espacio de nombres objetivo especificado está en el [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| targetNamespace | String | La propiedad **targetNamespace** del esquema. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
