---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema method"
linktitle: "InferSchema"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema method. Leidt een XML Schema Definition Language (XSD)-schema af uit het XML‑document dat zich bevindt in het opgegeven XmlReader‑object in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Leidt een XML [Schema](../../) Definition Language (XSD)-schema af uit het XML‑document dat zich bevindt in het opgegeven [XmlReader](../../../system.xml/xmlreader/)‑object.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/)‑object dat het XML‑document bevat waaruit een schema moet worden afgeleid. |

### ReturnValue

Een [XmlSchemaSet](../../xmlschemaset/)‑object dat de afgeleide schema's bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Leidt een XML [Schema](../../) Definition Language (XSD)-schema af uit het XML‑document dat zich bevindt in het opgegeven [XmlReader](../../../system.xml/xmlreader/)‑object, en verfijnt het afgeleide schema met behulp van een bestaand schema in het opgegeven [XmlSchemaSet](../../xmlschemaset/)‑object met dezelfde doel‑namespace.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/)‑object dat het XML‑document bevat waaruit een schema moet worden afgeleid. |
| schemas | SharedPtr\<XmlSchemaSet\> | Een [XmlSchemaSet](../../xmlschemaset/)‑object dat een bestaand schema bevat dat wordt gebruikt om het afgeleide schema te verfijnen. |

### ReturnValue

Een [XmlSchemaSet](../../xmlschemaset/)‑object dat de afgeleide schema's bevat.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
