---
title: "System::Drawing::Imaging::EncoderParameter class"
linktitle: "EncoderParameter"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::EncoderParameter class. Dient als een container die wordt gebruikt om waarden door te geven aan een afbeeldingencoder. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Dient als een container die wordt gebruikt om waarden door te geven aan een afbeeldingencoder. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EncoderParameter : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse die een breuk vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse die een bereik van gehele getallen vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een bereik van breuken vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Construeert een nieuwe instantie van de [EncoderParameter](./) klasse. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van waarden vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van waarden vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van waarden vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van breuken vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van bereiken van gehele getallen vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat een array van bereiken van breuken vertegenwoordigt. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Construeert een nieuw exemplaar van de klasse [EncoderParameter](./) dat het opgegeven aantal waarden van het opgegeven type vertegenwoordigt die uit de opgegeven buffer worden gelezen. |
| [get_Encoder](./get_encoder/)() const | Retourneert het [Encoder](../encoder/) object dat is gekoppeld aan het huidige [EncoderParameter](./) object. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Retourneert het aantal waarden dat door het huidige object wordt vertegenwoordigd. |
| [get_Type](./get_type/)() const | Retourneert het type van de waarden die door het huidige object worden vertegenwoordigd. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Koppelt het opgegeven [Encoder](../encoder/) object aan het huidige [EncoderParameter](./) object. |
| [~EncoderParameter](./~encoderparameter/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
