---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator klasse"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator klasse. Ondersteunt een eenvoudige iteratie over een collectie. Deze klasse kan niet worden geërfd in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Ondersteunt een eenvoudige iteratie over een collectie. Deze klasse kan niet worden geërfd.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [Dispose](./dispose/)() override | Doet niets. |
| [get_Current](./get_current/)() const override | Retourneert de huidige [XmlSchema](../xmlschema/) in de collectie. |
| [MoveNext](./movenext/)() override | Verplaatst de enumerator naar het volgende schema in de collectie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
