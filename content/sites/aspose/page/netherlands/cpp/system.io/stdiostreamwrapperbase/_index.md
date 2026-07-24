---
title: "System::IO::STDIOStreamWrapperBase class"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Page voor C++"
description: "System::IO::STDIOStreamWrapperBase class. Vertegenwoordigt een basisklasse voor System.IO.Stream-achtige wrappers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 2000
url: /nl/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Vertegenwoordigt een basisklasse voor [System.IO.Stream](../stream/)-achtige wrappers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een exemplaar van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stroom lezen ondersteunt. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom schrijven ondersteunt. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Copy‑toewijzingsoperator. Verwijderd. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Stelt de positie van de stream in. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Copy‑constructor. Verwijderd. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-informatie. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Zie ook

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
