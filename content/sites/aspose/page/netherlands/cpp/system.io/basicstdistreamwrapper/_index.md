---
title: "System::IO::BasicSTDIStreamWrapper class"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDIStreamWrapper class. Vertegenwoordigt een System.IO.Stream-achtige wrapper voor std::basic_istream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Vertegenwoordigt een [System.IO.Stream](../stream/)-achtige wrapper voor std::basic_istream en afgeleide objecten. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Construeert een nieuwe instantie van de [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Copy‑constructor. Verwijderd. |
| [Flush](./flush/)() override | Leegt de buffers van deze stream en schrijft alle gebufferde gegevens naar de onderliggende opslag. Niet ondersteund! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Als de wraapmodus binair is, leest het het opgegeven aantal bytes van de stream, anders leest het het opgegeven aantal tekens en converteert deze naar het type uint8_t. Schrijft het resultaat van het lezen naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadByte](./readbyte/)() override | Als de wraapmodus binair is, leest het een enkel byte uit de laatst gedecodeerde tekenopslag, anders leest het een enkel teken uit de stream en converteert dit naar het type uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. Niet ondersteund! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Als de wraapmodus binair is, schrijft het de opgegeven subreeks van bytes uit de opgegeven byte‑array naar de stream; anders wordt de opgegeven subreeks van bytes uit de opgegeven byte‑array geconverteerd naar het [char_type](./char_type/) type en vervolgens wordt het resultaat naar de stream geschreven. Niet ondersteund! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Als de wraapmodus binair is, schrijft het de opgegeven onondertekende 8‑bit integerwaarde naar de stream; anders wordt deze geconverteerd naar het [char_type](./char_type/) type en vervolgens wordt het resultaat naar de stream geschreven. Niet ondersteund! |
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
