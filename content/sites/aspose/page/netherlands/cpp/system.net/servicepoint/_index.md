---
title: "System::Net::ServicePoint klasse"
linktitle: "ServicePoint"
second_title: "Aspose.Page voor C++"
description: "System::Net::ServicePoint klasse. Biedt beheer van HTTP-verbindingen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3100
url: /nl/cpp/system.net/servicepoint/
---
## ServicePoint class


Biedt beheer van HTTP-verbindingen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ServicePoint : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Sluit en verwijdert verbindingen die behoren tot de opgegeven verbindingsgroep. |
| [get_Address](./get_address/)() | Retourneert de server-URI waarmee de huidige instantie verbinding maakt. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI-informatie. |
| [get_Certificate](./get_certificate/)() | Retourneert een certificaat dat wordt gebruikt door de huidige instantie. |
| [get_ClientCertificate](./get_clientcertificate/)() | Retourneert het laatste clientcertificaat. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Haalt een time-out op in milliseconden waarna de actieve [ServicePoint](./) wordt gesloten. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Haalt het maximale aantal verbindingen op dat is toegestaan door de huidige instantie. |
| [get_ConnectionName](./get_connectionname/)() | Retourneert de verbindingsnaam. |
| [get_CurrentConnections](./get_currentconnections/)() | Retourneert een aantal geopende verbindingen. |
| [get_Expect100Continue](./get_expect100continue/)() | Haalt een waarde op die aangeeft of het 100-Continue‑gedrag wordt gebruikt. |
| [get_IdleSince](./get_idlesince/)() | Retourneert een datum en tijd van de laatste verbinding met een host. |
| [get_MaxIdleTime](./get_maxidletime/)() | Haalt een tijdsduur op in milliseconden waarna een idle‑verbinding wordt gesloten. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Retourneert de HTTP‑versie. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Haalt de grootte van de ontvangbuffer op. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Retourneert een waarde die aangeeft of de huidige instantie pipeline‑verbindingen ondersteunt. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Haalt een waarde op die aangeeft of het Nagle‑algoritme wordt gebruikt door verbindingen die door de huidige instantie worden beheerd. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Stelt de delegate in die wordt gebruikt om het lokale [IPEndPoint](../ipendpoint/) te koppelen aan de huidige instantie. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Stelt een time-out in milliseconden in waarna de actieve [ServicePoint](./) wordt gesloten. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Stelt het maximale aantal verbindingen in dat is toegestaan door de huidige instantie. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Stelt een waarde in die aangeeft of het 100-Continue‑gedrag wordt gebruikt. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Stelt een tijdsduur in milliseconden in waarna een idle‑verbinding wordt gesloten. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Stelt de grootte van de ontvangbuffer in. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Stelt een waarde in die aangeeft of het Nagle‑algoritme wordt gebruikt door verbindingen die door de huidige instantie worden beheerd. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Stelt de waarde in die aangeeft of de 'Keep-Alive'-optie is ingeschakeld. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
