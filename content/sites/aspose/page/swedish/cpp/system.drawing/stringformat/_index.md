---
title: "System::Drawing::StringFormat-klass"
linktitle: "StringFormat"
second_title: "Aspose.Page för C++"
description: "System::Drawing::StringFormat-klass. Inkapslar information om textlayout, visningsmanipulationer och OpenType-funktioner. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 2500
url: /sv/cpp/system.drawing/stringformat/
---
## StringFormat class


Inkapslar information om textlayout, visningsmanipulationer och OpenType-funktioner. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class StringFormat : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Returnerar en exakt kopia av det aktuella objektet. |
| [get_Alignment](./get_alignment/)() const | Returnerar ett värde som indikerar horisontell justering av strängen. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Returnerar ett värde som indikerar språket som används när lokala siffror ersätts med västerländska siffror. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Returnerar metod för siffersubstitution. |
| [get_FormatFlags](./get_formatflags/)() const | Returnerar en bitvis kombination av [StringFormatFlags](../stringformatflags/) som specificerar strängformatet som representeras av det aktuella objektet. |
| static [get_GenericDefault](./get_genericdefault/)() | Returnerar ett [StringFormat](./)-objekt som representerar ett generiskt standardformat. |
| static [get_GenericTypographic](./get_generictypographic/)() | Returnerar ett [StringFormat](./)-objekt som representerar ett generiskt typografiskt format. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Returnerar värdet som indikerar hur snabbtangentprefixet visas. |
| [get_LineAlignment](./get_linealignment/)() const | Returnerar ett värde som indikerar vertikal justering av strängen. |
| [get_Trimming](./get_trimming/)() const | Returnerar ett värde som indikerar hur strängen trunkeras. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Hämtar storleken på [CharacterRange](../characterrange/)-arrayen. |
| [GetTabStops](./gettabstops/)(float\&) const | Returnerar tabbstopp för det aktuella [StringFormat](./)-objektet. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Ställer in horisontell justering av strängen. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Ställer in flaggorna för strängformatet. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Ställer in värdet som specificerar hur snabbtangentprefixet ska visas. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Ställer in vertikal justering av strängen. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Ställer in ett värde som specificerar hur strängen trunkeras. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Ställer in språk och metod för siffersubstitution. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Ställer in en array av [CharacterRange](../characterrange/)-objekt som representerar teckenintervallen som mäts genom ett anrop till MeasureCharacterRanges()-metoden. |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Ställer in tabbstopp för det aktuella [StringFormat](./)-objektet. |
| [StringFormat](./stringformat/)() | Skapar en ny instans av [StringFormat](./)-klassen. |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Skapar en ny instans av [StringFormat](./)-klassen med de angivna formatflaggorna och språket. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Kopieringskonstruktor. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
