---
title: "System::Net::Dns Klasse"
linktitle: "Dns"
second_title: "Aspose.Page für C++"
description: "System::Net::Dns Klasse. Stellt Methoden zur Arbeit mit DNS in C++ bereit."
type: docs
weight: 700
url: /de/cpp/system.net/dns/
---
## Dns class


Stellt Methoden zur Arbeit mit DNS bereit.

```cpp
class Dns : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit der angegebenen Zeichenkette zu erstellen, die einen Hostnamen oder eine IP-Adresse enthält. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit dem angegebenen Hostnamen zu erstellen. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit der angegebenen Zeichenkette zu erstellen, die einen Hostnamen oder eine IP-Adresse enthält. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit der angegebenen IP-Adresse zu erstellen. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit dem angegebenen Hostnamen zu erstellen. |
| [Dns](./dns/)() | Der gelöschte Standardkonstruktor. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Operation zum Erzeugen einer neuen IPHostEntry-class-Instanz abgeschlossen ist. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Operation zum Erzeugen einer neuen IPHostEntry-class-Instanz abgeschlossen ist. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Operation zum Erzeugen einer neuen IPHostEntry-class-Instanz abgeschlossen ist. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Operation zum Erzeugen einer neuen IPHostEntry-class-Instanz abgeschlossen ist. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Gibt eine Sammlung von IP-Adressen des angegebenen Hostnamens oder der angegebenen IP-Adresse zurück. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Erstellt eine neue IPHostEntry-class-Instanz mit der angegebenen Zeichenkettenrepräsentation einer IP-Adresse. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Erstellt eine neue IPHostEntry-class-Instanz mit der angegebenen IP-Adresse. |
| static [GetHostByName](./gethostbyname/)(String) | RTTI-Informationen. |
| static [GetHostEntry](./gethostentry/)(String) | Erstellt eine neue IPHostEntry-class-Instanz mit der angegebenen Zeichenkette, die einen Hostnamen oder eine IP-Adresse enthält. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Erstellt eine neue IPHostEntry-class-Instanz mit der angegebenen IP-Adresse. |
| static [GetHostName](./gethostname/)() | Gibt den Hostnamen des lokalen Rechners zurück. |
| static [Resolve](./resolve/)(String) | Erstellt eine neue IPHostEntry-class-Instanz mit dem angegebenen Hostnamen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
