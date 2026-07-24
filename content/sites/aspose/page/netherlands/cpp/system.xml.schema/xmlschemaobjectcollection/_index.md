---
title: "System::Xml::Schema::XmlSchemaObjectCollection klasse"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection klasse. Een verzameling van XmlSchemaObjects in C++."
type: docs
weight: 5100
url: /nl/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Een verzameling van XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Voegt een [XmlSchemaObject](../xmlschemaobject/) toe aan de [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Geeft aan of het opgegeven [XmlSchemaObject](../xmlschemaobject/) zich in de [XmlSchemaObjectCollection](./) bevindt. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Kopieert alle XmlSchemaObjects uit de collectie naar de opgegeven array, beginnend bij de opgegeven index. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een enumerator om door de XmlSchemaObjects te itereren die zich in de [XmlSchemaObjectCollection](./) bevinden. |
| virtual [idx_get](./idx_get/)(int32_t) | Retourneert het [XmlSchemaObject](../xmlschemaobject/) op de opgegeven index. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Stelt het [XmlSchemaObject](../xmlschemaobject/) in op de opgegeven index. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Retourneert de collectie-index die overeenkomt met het opgegeven [XmlSchemaObject](../xmlschemaobject/). |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Voegt een [XmlSchemaObject](../xmlschemaobject/) in de [XmlSchemaObjectCollection](./) in. |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Verwijdert een [XmlSchemaObject](../xmlschemaobject/) uit de [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialiseert een nieuw exemplaar van de klasse [XmlSchemaObjectCollection](./) die een [XmlSchemaObject](../xmlschemaobject/) accepteert. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
