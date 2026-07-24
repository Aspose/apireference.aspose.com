---
title: "System::Net::Dns klasse"
linktitle: "Dns"
second_title: "Aspose.Page voor C++"
description: "System::Net::Dns klasse. Biedt methoden om met DNS te werken in C++."
type: docs
weight: 700
url: /nl/cpp/system.net/dns/
---
## Dns class


Biedt methoden om met DNS te werken.

```cpp
class Dns : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven tekenreeks die een hostnaam of IP-adres bevat. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven hostnaam. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven tekenreeks die een hostnaam of IP-adres bevat. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met het opgegeven IP-adres. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken met de opgegeven hostnaam. |
| [Dns](./dns/)() | De verwijderde standaardconstructor. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken voltooid is. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken voltooid is. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken voltooid is. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone bewerking om een nieuw IPHostEntry-class‑instance te maken voltooid is. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Retourneert een verzameling IP-adressen van de opgegeven hostnaam of IP-adres. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Maakt een nieuw IPHostEntry-class‑instance aan met de opgegeven tekenreeksrepresentatie van een IP-adres. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Maakt een nieuw IPHostEntry-class‑instance aan met het opgegeven IP-adres. |
| static [GetHostByName](./gethostbyname/)(String) | RTTI-informatie. |
| static [GetHostEntry](./gethostentry/)(String) | Maakt een nieuw IPHostEntry-klasse‑instance aan met de opgegeven tekenreeks die een hostnaam of IP‑adres bevat. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Maakt een nieuw IPHostEntry-class‑instance aan met het opgegeven IP-adres. |
| static [GetHostName](./gethostname/)() | Retourneert de hostnaam van de lokale machine. |
| static [Resolve](./resolve/)(String) | Maakt een nieuw IPHostEntry-klasse‑instance aan met de opgegeven hostnaam. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
