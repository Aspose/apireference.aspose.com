---
title: "System::Xml::Schema::XmlSchemaAnnotated klasse"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaAnnotated klasse. De basisklasse voor elk element dat annotatie‑elementen kan bevatten in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


De basisklasse voor elk element dat annotatie‑elementen kan bevatten.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Retourneert de **annotation** eigenschap. |
| [get_Id](./get_id/)() | Retourneert de tekenreeks‑id. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Retourneert de gekwalificeerde attributen die niet behoren tot de doel‑namespace van het huidige schema. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Stelt de **annotation** eigenschap in. |
| [set_Id](./set_id/)(const String\&) | Stelt de string id in. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Stelt de gekwalificeerde attributen in die niet behoren tot de doel‑namespace van het huidige schema. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
