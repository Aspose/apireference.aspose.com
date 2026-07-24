---
title: "Método System::Xml::Schema::XmlSchemaInference::InferSchema"
linktitle: "InferSchema"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::Schema::XmlSchemaInference::InferSchema. Infiere un esquema de Lenguaje de Definición de Esquema XML (XSD) a partir del documento XML contenido en el objeto XmlReader especificado en C++."
type: docs
weight: 400
url: /es/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Infiere un esquema de [Schema](../../) de Lenguaje de Definición de Esquema XML (XSD) a partir del documento XML contenido en el objeto [XmlReader](../../../system.xml/xmlreader/) especificado.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objeto [XmlReader](../../../system.xml/xmlreader/) que contiene el documento XML del cual inferir un esquema. |

### ReturnValue

Un objeto [XmlSchemaSet](../../xmlschemaset/) que contiene los esquemas inferidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Infiere un esquema de XML [Schema](../../) de Lenguaje de Definición (XSD) a partir del documento XML contenido en el objeto [XmlReader](../../../system.xml/xmlreader/) especificado, y refina el esquema inferido utilizando un esquema existente en el objeto [XmlSchemaSet](../../xmlschemaset/) especificado con el mismo espacio de nombres de destino.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Un objeto [XmlReader](../../../system.xml/xmlreader/) que contiene el documento XML del cual inferir un esquema. |
| schemas | SharedPtr\<XmlSchemaSet\> | Un objeto [XmlSchemaSet](../../xmlschemaset/) que contiene un esquema existente utilizado para refinar el esquema inferido. |

### ReturnValue

Un objeto [XmlSchemaSet](../../xmlschemaset/) que contiene los esquemas inferidos.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
