---
title: "System::IO::UnmanagedMemoryStream class"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Page voor C++"
description: "System::IO::UnmanagedMemoryStream class. Biedt toegang tot niet-beheerde geheugen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2800
url: /nl/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Biedt toegang tot niet-beheerde geheugen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Flush](./flush/)() override | Doet niets. |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| virtual [get_Capacity](./get_capacity/)() const | Retourneert de huidige capaciteit van de onderliggende geheugenbuffer. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom in bytes. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [get_PositionPointer](./get_positionpointer/)() | NOG NIET GEÏMPLENTEERD. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Stelt de positie van de stream in. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | NOG NIET GEÏMPLENTEERD. |
| [SetLength](./setlength/)(int64_t) override | NOG NIET GEÏMPLENTEERD. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Construeert een nieuwe instantie van [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Construeert een nieuwe instantie van [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | NOG NIET GEÏMPLENTEERD. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | NOG NIET GEÏMPLENTEERD. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
