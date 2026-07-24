---
title: "System::Xml::Schema::XmlSchemaComplexType klasse"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaComplexType klasse. Vertegenwoordigt het complexType element uit XML Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse definieert een complex type dat de set van attributen en de inhoud van een element in C++ bepaalt."
type: docs
weight: 2100
url: /nl/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Vertegenwoordigt het **complexType** element uit XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse definieert een complex type dat de set van attributen en de inhoud van een element bepaalt.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Retourneert de waarde voor de [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe type. |
| [get_Attributes](./get_attributes/)() | Retourneert de verzameling attributen voor het complexe type. |
| [get_AttributeUses](./get_attributeuses/)() | Retourneert de verzameling van alle gecompileerde attributen van dit complexe type en zijn basistypen. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Retourneert de post-compilatiewaarde voor **anyAttribute** voor dit complexe type en zijn basistype(s). |
| [get_Block](./get_block/)() | Retourneert het **block** attribuut. |
| [get_BlockResolved](./get_blockresolved/)() | Retourneert de waarde nadat het type is gecompileerd naar de post-schema-validatie-informatieset (infoset). Deze waarde geeft aan hoe het type wordt afgedwongen wanneer **xsi:type** wordt gebruikt in het instantiedocument. |
| [get_ContentModel](./get_contentmodel/)() | Retourneert het post-compilatie [XmlSchemaContentModel](../xmlschemacontentmodel/) van dit complexe type. |
| [get_ContentType](./get_contenttype/)() | Retourneert het inhoudsmodel van het complexe type dat de post-compilatiewaarde bevat. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Retourneert het partikel dat de post-compilatiewaarde van het [XmlSchemaComplexType::get_ContentType](./get_contenttype/) partikel bevat. |
| [get_IsAbstract](./get_isabstract/)() | Retourneert de informatie die bepaalt of het **complexType** element kan worden gebruikt in het instantiedocument. |
| [get_IsMixed](./get_ismixed/)() override | Retourneert informatie die bepaalt of het complexe type een gemengd inhoudsmodel heeft (opmaak binnen de inhoud). |
| [get_Particle](./get_particle/)() | Retourneert het compositor-type als een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Stelt de waarde in voor de [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) component van het complexe type. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Stelt het **block** attribuut in. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Stelt het post-compilatie [XmlSchemaContentModel](../xmlschemacontentmodel/) van dit complexe type in. |
| [set_IsAbstract](./set_isabstract/)(bool) | Stelt de informatie in die bepaalt of het **complexType** element kan worden gebruikt in het instantiedocument. |
| [set_IsMixed](./set_ismixed/)(bool) override | Stelt informatie in die bepaalt of het complexe type een gemengd inhoudsmodel heeft (opmaak binnen de inhoud). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Stelt het compositor-type in als een van de [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen. |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaComplexType](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
