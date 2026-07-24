---
title: "System::IO::BasicSTDIOStreamWrapper klasse"
linktitle: "BasicSTDIOStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDIOStreamWrapper klasse. Vertegenwoordigt een System.IO.Stream‑achtige wrapper voor std::basic_iostream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/basicstdiostreamwrapper/
---
## BasicSTDIOStreamWrapper class


Vertegenwoordigt een [System.IO.Stream](../stream/)-achtige wrapper voor std::basic_iostream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T,typename>class BasicSTDIOStreamWrapper : public System::IO::BasicSTDIStreamWrapper<T>,
                                                             public System::IO::BasicSTDOStreamWrapper<T>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) | Construeert een nieuwe instantie van de [BasicSTDIOStreamWrapper](./). |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(const BasicSTDIOStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [Flush](./flush/)() override | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar de onderliggende opslag. |
| [operator=](./operator=/)(const BasicSTDIOStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Als de wraapmodus binair is, leest het het opgegeven aantal bytes van de stream, anders leest het het opgegeven aantal tekens en converteert deze naar het type uint8_t. Schrijft het resultaat van het lezen naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadByte](./readbyte/)() override | Als de wraapmodus binair is, leest het een enkel byte uit de laatst gedecodeerde tekenopslag, anders leest het een enkel teken uit de stream en converteert dit naar het type uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Als de wrappermodus binair is, schrijft het naar de stream het opgegeven deelbereik van bytes uit de opgegeven byte‑array, anders converteert het het opgegeven deelbereik van bytes uit de opgegeven byte‑array naar het type [char_type](./char_type/) en schrijft vervolgens het resultaat naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Als de wraapmodus binair is, schrijft het de opgegeven onondertekende 8‑bit gehele getalwaarde naar de stream, anders wordt deze geconverteerd naar het type [char_type](./char_type/) en vervolgens wordt het resultaat naar de stream geschreven. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseIType](./baseitype/) |  |
| [BaseOType](./baseotype/) |  |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-informatie. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Zie ook

* Class [BasicSTDIStreamWrapper](../basicstdistreamwrapper/)
* Class [BasicSTDOStreamWrapper](../basicstdostreamwrapper/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
