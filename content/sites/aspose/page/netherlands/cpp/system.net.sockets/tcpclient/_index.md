---
title: "System::Net::Sockets::TcpClient klasse"
linktitle: "TcpClient"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::TcpClient klasse. Vertegenwoordigt een client voor de TCP-netwerkservices. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Vertegenwoordigt een client voor de TCP‑netwerkservices. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TcpClient : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [Close](./close/)() | Sluit de verbinding en maakt de huidige instantie vrij. |
| [Connect](./connect/)(String, int32_t) | Stelt een verbinding tot stand met de opgegeven externe host. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stelt een verbinding tot stand met de opgegeven externe host. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Stelt een verbinding tot stand met de opgegeven externe host. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stelt een verbinding tot stand met de opgegeven externe host. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone verbindingsbewerking is voltooid. |
| [get_Available](./get_available/)() | Retourneert het aantal bytes dat is ontvangen en klaar is om te lezen. |
| [get_Client](./get_client/)() | RTTI-informatie. |
| [get_Connected](./get_connected/)() | Retourneert een waarde die aangeeft of de socket verbonden is met de externe host. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Haalt een waarde op die aangeeft of de huidige instantie slechts één client toestaat een poort te gebruiken. |
| [get_LingerState](./get_lingerstate/)() | Haalt een waarde op die aangeeft of de socket het sluiten vertraagt in een poging alle wachtende gegevens te verzenden. |
| [get_NoDelay](./get_nodelay/)() | Haalt een waarde op die aangeeft of de huidige instantie het Nagle-algoritme gebruikt. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Haalt de grootte van de buffer op die wordt gebruikt voor het ontvangen van gegevens. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Haalt een waarde op die een tijdsduur aangeeft waarna het ontvangen van gegevens zal verlopen. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Haalt de grootte van de buffer op die wordt gebruikt voor het verzenden van gegevens. |
| [get_SendTimeout](./get_sendtimeout/)() | Haalt een waarde op die een tijdsduur aangeeft waarna het verzenden van gegevens zal verlopen. |
| [GetStream](./getstream/)() | Retourneert de stream die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Stelt de socket in. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Stelt een waarde in die aangeeft of de huidige instantie slechts één client toestaat een poort te gebruiken. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Stelt een waarde in die aangeeft of de socket het sluiten vertraagt in een poging alle wachtende gegevens te verzenden. |
| [set_NoDelay](./set_nodelay/)(bool) | Stelt een waarde in die aangeeft of de huidige instantie het Nagle-algoritme gebruikt. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Stelt de grootte van de buffer in die wordt gebruikt voor het ontvangen van gegevens. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Stelt een waarde in die een tijdsduur aangeeft waarna het ontvangen van gegevens zal verlopen. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Stelt de grootte van de buffer in die wordt gebruikt voor het verzenden van gegevens. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Stelt een waarde in die een tijdsduur aangeeft waarna het verzenden van gegevens zal verlopen. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Construeert een nieuw exemplaar. |
| [TcpClient](./tcpclient/)() | Construeert een nieuw exemplaar. |
| [TcpClient](./tcpclient/)(AddressFamily) | Construeert een nieuw exemplaar. |
| [TcpClient](./tcpclient/)(String, int32_t) | Construeert een nieuw exemplaar. |
| virtual [~TcpClient](./~tcpclient/)() | Vernietigt de huidige instantie. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
