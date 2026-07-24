---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator klasse"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator klasse. Vertegenwoordigt de enumerator voor de XmlSchemaObjectCollection in C++."
type: docs
weight: 5200
url: /nl/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Stelt de enumerator voor de [XmlSchemaObjectCollection](../xmlschemaobjectcollection/) voor.

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [Dispose](./dispose/)() override | Doet niets. |
| [get_Current](./get_current/)() const override | Retourneert het huidige [XmlSchemaObject](../xmlschemaobject/) in de collectie. |
| [MoveNext](./movenext/)() override | Verplaatst zich naar het volgende item in de collectie. |
| [Reset](./reset/)() override | Stelt de enumerator opnieuw in op het begin van de collectie. |
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
