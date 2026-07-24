---
title: "System::Xml::Schema::XmlSchemaImport klasse"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaImport klasse. Vertegenwoordigt het import‑element van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse wordt gebruikt om schema‑componenten uit andere schema's te importeren in C++."
type: docs
weight: 3500
url: /nl/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Vertegenwoordigt het **import**‑element van XML [Schema](../) zoals gespecificeerd door de World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse wordt gebruikt om schema‑componenten uit andere schema's te importeren.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Retourneert de **annotation**‑waarde. |
| [get_Namespace](./get_namespace/)() | Retourneert de doel‑namespace voor het geïmporteerde schema als een Uniform Resource Identifier (URI) referentie. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Stelt de **annotation**‑waarde in. |
| [set_Namespace](./set_namespace/)(const String\&) | Stelt de doel‑namespace voor het geïmporteerde schema in als een Uniform Resource Identifier (URI) referentie. |
| [XmlSchemaImport](./xmlschemaimport/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaImport](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
