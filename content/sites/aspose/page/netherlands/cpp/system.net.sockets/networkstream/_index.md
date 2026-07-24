---
title: "System::Net::Sockets::NetworkStream klasse"
linktitle: "NetworkStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::NetworkStream klasse. Biedt de onderliggende stroom van de gegevens voor netwerktoegang. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


Biedt de onderliggende stroom van de gegevens voor netwerktoegang. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class NetworkStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone leesbewerking. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone schrijfbewerking. |
| [Close](./close/)(int) | Sluit de huidige instantie nadat de opgegeven tijd is verstreken. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone leesbewerking is voltooid. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Beëindigt een asynchrone schrijfbewerking. Wacht tot de opgegeven asynchrone schrijfbewerking is voltooid. |
| [Flush](./flush/)() override | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar de onderliggende opslag. |
| [get_CanRead](./get_canread/)() const override | RTTI-informatie. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanTimeout](./get_cantimeout/)() const override | Haalt een waarde op die bepaalt of de huidige stroom kan time-out gaan. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| [get_DataAvailable](./get_dataavailable/)() const | Retourneert een waarde die aangeeft of er beschikbare gegevens om te lezen zijn. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom in bytes. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stroom zal proberen te lezen voordat er een time-out optreedt. |
| [get_Socket](./get_socket/)() | Haalt de onderliggende [Socket](../socket/) op. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stream zal proberen te schrijven voordat er een time‑out optreedt. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | Construeert een nieuw exemplaar. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | Construeert een nieuw exemplaar. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | Construeert een nieuw exemplaar. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Stelt de positie van de stream in. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Stelt een waarde in die bepaalt of de huidige stream kan time‑out gaan. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Stelt een waarde in, in milliseconden, die bepaalt hoe lang de stream zal proberen te lezen voordat er een time‑out optreedt. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| virtual [~NetworkStream](./~networkstream/)() | Vernietigt de huidige instantie. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
