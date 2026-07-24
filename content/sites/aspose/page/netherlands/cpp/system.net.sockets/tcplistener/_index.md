---
title: "System::Net::Sockets::TcpListener klasse"
linktitle: "TcpListener"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::TcpListener class. Vertegenwoordigt een luisteraar voor de TCP‑netwerkservices. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Vertegenwoordigt een luisteraar voor de TCP‑netwerkservices. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TcpListener : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Accepteert het wachtende verbindingsverzoek en retourneert de socket die wordt gebruikt om gegevens te verzenden en te ontvangen. |
| [AcceptTcpClient](./accepttcpclient/)() | Accepteert het wachtende verbindingsverzoek en retourneert de TcpClient‑klasse‑instantie die wordt gebruikt voor het verzenden en ontvangen van gegevens. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Schakelt de NAT‑traversal in of uit. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone accept‑operatie. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone accept‑operatie. |
| static [Create](./create/)(int32_t) | Maakt een nieuwe instantie aan met het opgegeven poortnummer. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone accept‑operatie voltooid is. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone accept‑operatie voltooid is. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Haalt een waarde op die aangeeft of de huidige instantie slechts één client toestaat een poort te gebruiken. |
| [get_LocalEndpoint](./get_localendpoint/)() | Retourneert het onderliggende eindpunt. |
| [get_Server](./get_server/)() | RTTI-informatie. |
| [Pending](./pending/)() | Retourneert een waarde die aangeeft of er wachtende verbindingsverzoeken zijn. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Stelt een waarde in die aangeeft of de huidige instantie slechts één client toestaat een poort te gebruiken. |
| [Start](./start/)() | Start met luisteren naar binnenkomende verbindingen. |
| [Start](./start/)(int32_t) | Start met luisteren naar binnenkomende verbindingen. |
| [Stop](./stop/)() | Stopt met luisteren naar binnenkomende verbindingen. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Construeert een nieuw exemplaar. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Construeert een nieuw exemplaar. |
| [TcpListener](./tcplistener/)(int32_t) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
