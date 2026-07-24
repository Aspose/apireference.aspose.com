---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::UdpClient class. Biedt netwerkservices voor het User Datagram Protocol (UDP). Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Biedt netwerkservices voor het User Datagram Protocol (UDP). Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class UdpClient : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() | Sluit de UDP‑verbinding. |
| [Connect](./connect/)(String, int32_t) | Stelt een verbinding tot stand met de opgegeven poort op de opgegeven host. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stelt een verbinding tot stand met de host op het opgegeven adres op de opgegeven poort. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Stelt een verbinding tot stand met een extern eindpunt. |
| [Dispose](./dispose/)() override | Vrijgeeft de beheerde en onbeheerde bronnen die door de [UdpClient](./) worden gebruikt. |
| [get_Client](./get_client/)() | RTTI-informatie. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Retourneert een datagram dat door een server is verzonden. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Verzendt een UDP‑datagram naar de host op het externe eindpunt. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Verzendt een UDP‑datagram naar de opgegeven poort op de opgegeven externe host. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Verzendt een UDP‑datagram naar een externe host. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Gebruikt om de onderliggende netwerksocket te leveren. |
| [UdpClient](./udpclient/)() | Initialiseert een nieuw exemplaar van de [UdpClient](./) klasse. |
| [UdpClient](./udpclient/)(AddressFamily) | Initialiseert een nieuw exemplaar van de [UdpClient](./) klasse. |
| [UdpClient](./udpclient/)(int32_t) | Initialiseert een nieuw exemplaar van de [UdpClient](./) klasse. |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Initialiseert een nieuw exemplaar van de [UdpClient](./) klasse. |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Initialiseert een nieuw exemplaar van de [UdpClient](./) klasse. param local EP het lokale eindpunt waaraan u de UDP-verbinding bind. |
| [UdpClient](./udpclient/)(String, int32_t) | Maakt een nieuw exemplaar van de [UdpClient](./) klasse en maakt verbinding met de opgegeven externe host op de opgegeven poort. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
