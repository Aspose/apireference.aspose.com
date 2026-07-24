---
title: "System::IO::BasicSTDOStreamWrapper klasse"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDOStreamWrapper klasse. Vertegenwoordigt een System.IO.Stream‑achtige wrapper voor std::basic_ostream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 300
url: /nl/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


Vertegenwoordigt een [System.IO.Stream](../stream/)-achtige wrapper voor std::basic_ostream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Construeert een nieuwe instantie van de [BasicSTDOStreamWrapper](./). |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [Flush](./flush/)() override | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar de onderliggende opslag. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Als de wrappermodus binair is, leest het opgegeven aantal bytes van de stream, anders leest het het opgegeven aantal tekens en converteert deze naar het type uint8_t. Schrijft het resultaat van het lezen naar de opgegeven byte‑array. Niet ondersteund! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadByte](./readbyte/)() override | Als de wrappermodus binair is, leest het een enkele byte uit de laatst gedecodeerde tekenopslag, anders leest het een enkel teken van de stream en converteert dit naar het type uint8_t. Niet ondersteund! |
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
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-informatie. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Zie ook

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
