---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class. Vertegenwoordigt het restriction‑element voor simple types van XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze class kan worden gebruikt om simpleType‑elementen te beperken in C++."
type: docs
weight: 6500
url: /nl/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Vertegenwoordigt het **restriction**‑element voor simple types van XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze class kan worden gebruikt om **simpleType**‑elementen te beperken.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Retourneert informatie over het basistype. |
| [get_BaseTypeName](./get_basetypename/)() | Retourneert de naam van het gekwalificeerde basistype. |
| [get_Facets](./get_facets/)() | Retourneert een [Xml](../../system.xml/)[Schema](../) facet. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Stelt informatie in over het basistype. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van het gekwalificeerde basistype. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaSimpleTypeRestriction](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
