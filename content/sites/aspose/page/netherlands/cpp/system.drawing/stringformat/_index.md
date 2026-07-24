---
title: "System::Drawing::StringFormat klasse"
linktitle: "StringFormat"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::StringFormat klasse. Omvat informatie over tekstopmaak, weergavebewerkingen en OpenType-functies. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2500
url: /nl/cpp/system.drawing/stringformat/
---
## StringFormat class


Omvat informatie over tekstopmaak, weergavebewerkingen en OpenType-functies. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StringFormat : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Retourneert een exacte kopie van het huidige object. |
| [get_Alignment](./get_alignment/)() const | Retourneert een waarde die de horizontale uitlijning van de tekenreeks aangeeft. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Retourneert een waarde die de taal aangeeft die wordt gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Retourneert de cijfervervangingsmethode. |
| [get_FormatFlags](./get_formatflags/)() const | Retourneert een bitwise‑combinatie van [StringFormatFlags](../stringformatflags/) die het tekenreeksformaat specificeert dat wordt weergegeven door het huidige object. |
| static [get_GenericDefault](./get_genericdefault/)() | Retourneert een [StringFormat](./) object dat een generiek standaardformaat vertegenwoordigt. |
| static [get_GenericTypographic](./get_generictypographic/)() | Retourneert een [StringFormat](./) object dat een generiek typografisch formaat vertegenwoordigt. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Retourneert de waarde die aangeeft hoe het sneltoets‑voorvoegsel wordt weergegeven. |
| [get_LineAlignment](./get_linealignment/)() const | Retourneert een waarde die de verticale uitlijning van de tekenreeks aangeeft. |
| [get_Trimming](./get_trimming/)() const | Retourneert een waarde die aangeeft hoe de tekenreeks wordt bijgesneden. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Haalt de grootte op van de [CharacterRange](../characterrange/) array. |
| [GetTabStops](./gettabstops/)(float\&) const | Retourneert de tab‑stops voor het huidige [StringFormat](./) object. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Stelt de horizontale uitlijning van de tekenreeks in. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Stelt de tekenreeksformaat‑vlaggen in. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Stelt de waarde in die aangeeft hoe het sneltoets‑voorvoegsel moet worden weergegeven. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Stelt de verticale uitlijning van de tekenreeks in. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Stelt een waarde in die aangeeft hoe de tekenreeks wordt bijgesneden. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Stelt de taal en methode voor cijfervervanging in. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Stelt een array in van [CharacterRange](../characterrange/) objecten die de tekenreeksbereiken vertegenwoordigen die gemeten worden door een oproep naar de MeasureCharacterRanges() methode. |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Stelt de tab‑stops in voor het huidige [StringFormat](./) object. |
| [StringFormat](./stringformat/)() | Construeert een nieuwe instantie van de [StringFormat](./) klasse. |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Construeert een nieuw exemplaar van de [StringFormat](./) klasse met de opgegeven opmaakvlaggen en taal. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Copy-constructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
