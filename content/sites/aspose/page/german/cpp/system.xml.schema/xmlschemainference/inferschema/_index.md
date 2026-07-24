---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema Methode"
linktitle: "InferSchema"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema Methode. Leitet ein XML Schema Definition Language (XSD)-Schema aus dem XML-Dokument ab, das im angegebenen XmlReader-Objekt in C++ enthalten ist."
type: docs
weight: 400
url: /de/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Leitet ein XML [Schema](../../) Definition Language (XSD)-Schema aus dem XML-Dokument ab, das im angegebenen [XmlReader](../../../system.xml/xmlreader/) Objekt enthalten ist.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/) Objekt, das das XML-Dokument enthält, aus dem ein Schema abgeleitet werden soll. |

### ReturnValue

Ein [XmlSchemaSet](../../xmlschemaset/) Objekt, das die abgeleiteten Schemata enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Leitet ein XML [Schema](../../) Definition Language (XSD)-Schema aus dem im angegebenen [XmlReader](../../../system.xml/xmlreader/) Objekt enthaltenen XML-Dokument ab und verfeinert das abgeleitete Schema mithilfe eines vorhandenen Schemas im angegebenen [XmlSchemaSet](../../xmlschemaset/) Objekt mit demselben Ziel‑Namespace.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/) Objekt, das das XML-Dokument enthält, aus dem ein Schema abgeleitet werden soll. |
| schemas | SharedPtr\<XmlSchemaSet\> | Ein [XmlSchemaSet](../../xmlschemaset/) Objekt, das ein vorhandenes Schema enthält, das zum Verfeinern des abgeleiteten Schemas verwendet wird. |

### ReturnValue

Ein [XmlSchemaSet](../../xmlschemaset/) Objekt, das die abgeleiteten Schemata enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
