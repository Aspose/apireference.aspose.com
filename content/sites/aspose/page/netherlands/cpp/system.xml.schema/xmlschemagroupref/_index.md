---
title: "System::Xml::Schema::XmlSchemaGroupRef class"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaGroupRef class. Vertegenwoordigt het groep‑element met ref‑attribuut uit het XML‑Schema zoals gespecificeerd door het World Wide Web Consortium (W3C). Deze klasse wordt gebruikt binnen complexe types die een groep refereren die op schematisch niveau is gedefinieerd in C++."
type: docs
weight: 3300
url: /nl/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Vertegenwoordigt het **group**‑element met **ref**‑attribuut uit het XML [Schema](../) zoals gespecificeerd door het World Wide [Web](../../system.web/) Consortium (W3C). Deze klasse wordt gebruikt binnen complexe types die een **group** refereren die op **schema**‑niveau is gedefinieerd.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Particle](./get_particle/)() | Retourneert een van de [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), of [XmlSchemaSequence](../xmlschemasequence/) klassen, die de post‑compilatie‑interpretatie van de **Particle**‑waarde bevat. |
| [get_RefName](./get_refname/)() | Retourneert de naam van een groep die in dit schema is gedefinieerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Stelt de naam in van een groep die in dit schema is gedefinieerd (of een ander schema dat wordt aangegeven door de opgegeven namespace). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Initialiseert een nieuw exemplaar van de [XmlSchemaGroupRef](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
