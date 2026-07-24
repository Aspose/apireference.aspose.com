---
title: "System::Security::Cryptography::CryptoStream klasse"
linktitle: "CryptoStream"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::CryptoStream klasse. Streamimplementatie die een bestaande stream omhult met een cryptografische functie. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


Streamimplementatie die een bestaande stream omhult met een cryptografische functie. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CryptoStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit verbinding. |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | Constructor. |
| [Flush](./flush/)() override | Leegt de buffer in de omhulde stream. Doet niets omdat het transformatie‑algoritme mogelijk nog op meer gegevens wacht. |
| [FlushFinalBlock](./flushfinalblock/)() | Schrijft de gegevens die nog in de buffer staan naar de stream. |
| [get_CanRead](./get_canread/)() const override | Controleert of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Controleert of de stream doorzoekbaar is. |
| [get_CanWrite](./get_canwrite/)() const override | Controleert of de stream beschrijfbaar is. |
| [get_Length](./get_length/)() const override | Haalt de lengte van de stream op. Niet ondersteund. |
| [get_Position](./get_position/)() const override | Haalt de huidige positie in de stream op. Niet ondersteund. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest gegevens uit de stream. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest gegevens uit de stream. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Zoekt positie in de stream. Niet ondersteund. |
| [set_Position](./set_position/)(int64_t) override | Zoekt positie in de stream. Niet ondersteund. |
| [SetLength](./setlength/)(int64_t) override | Zoekt grootte van de stream. Niet ondersteund. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft gegevens naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft gegevens naar de stream. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
