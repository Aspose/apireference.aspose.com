---
title: "System::Xml::Schema::XmlSchemaRedefine klasse"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaRedefine klasse. Vertegenwoordigt het redefine‑element uit XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige en complexe typen, groepen en attribuutgroepen uit externe schemabestanden te herdefiniëren in het huidige schema. Deze klasse kan ook worden gebruikt om versiebeheer voor de schema‑elementen in C++ te bieden."
type: docs
weight: 5600
url: /nl/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Stelt het **redefine**-element uit XML [Schema](../) voor, zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse kan worden gebruikt om eenvoudige en complexe types, groepen en attribuutgroepen uit externe schemabestanden te herdefiniëren in het huidige schema. Deze klasse kan ook worden gebruikt om versiebeheer voor de schema‑elementen te bieden.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Retourneert de [XmlSchemaObjectTable](../xmlschemaobjecttable/) , voor alle attributen in het schema, die de post‑compilatie‑interpretatie van de **AttributeGroups**‑waarde bevat. |
| [get_Groups](./get_groups/)() | Retourneert de [XmlSchemaObjectTable](../xmlschemaobjecttable/), voor alle groepen in het schema, die de post‑compilatie‑interpretatie van de **Groups**‑waarde bevat. |
| [get_Items](./get_items/)() | Retourneert de verzameling van de volgende klassen: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), en [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Retourneert de [XmlSchemaObjectTable](../xmlschemaobjecttable/), voor alle eenvoudige en complexe types in het schema, die de post‑compilatie‑interpretatie van de **SchemaTypes**‑waarde bevat. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaRedefine](./)‑klasse. |
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
