---
title: "System::Drawing::Imaging::PropertyItem klasse"
linktitle: "PropertyItem"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::PropertyItem klasse. Stelt een metagegevens‑eigenschap voor die moet worden opgenomen in een afbeeldingsbestand. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1400
url: /nl/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


Stelt een metagegevens‑eigenschap voor die moet worden opgenomen in een afbeeldingsbestand. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PropertyItem : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Id](./get_id/)() const | Retourneert de ID van de eigenschap die door het huidige object wordt vertegenwoordigd. |
| [get_Len](./get_len/)() const | Retourneert de lengte van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes. |
| [get_Type](./get_type/)() const | Retourneert het type van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes. |
| [get_Value](./get_value/)() const | Retourneert de waarde van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes. |
| [PropertyItem](./propertyitem/)() | Construeert een nieuwe instantie van de [PropertyItem](./)‑klasse. |
| [set_Id](./set_id/)(int32_t) | Stelt de ID van de eigenschap die door het huidige object wordt vertegenwoordigd in. |
| [set_Len](./set_len/)(int32_t) | Stelt de lengte van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes in. |
| [set_Type](./set_type/)(int16_t) | Stelt het type van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes in. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | Stelt het type van de eigenschap die door het huidige object wordt vertegenwoordigd in bytes in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
