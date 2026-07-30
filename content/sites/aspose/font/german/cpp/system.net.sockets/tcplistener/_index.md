---
title: "System::Net::Sockets::TcpListener Klasse"
linktitle: "TcpListener"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::TcpListener Klasse. Stellt einen Listener für die TCP-Netzwerkdienste dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Stellt einen Listener für die TCP-Netzwerkdienste dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TcpListener : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Akzeptiert die ausstehende Verbindungsanfrage und gibt den Socket zurück, der zum Senden und Empfangen von Daten verwendet wird. |
| [AcceptTcpClient](./accepttcpclient/)() | Akzeptiert die ausstehende Verbindungsanfrage und gibt die TcpClient‑Klasseninstanz zurück, die zum Senden und Empfangen von Daten verwendet wird. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Aktiviert oder deaktiviert die NAT‑Durchquerung. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Accept‑Vorgang. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Accept‑Vorgang. |
| static [Create](./create/)(int32_t) | Erstellt eine neue Instanz mit der angegebenen Portnummer. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Akzeptieroperation abgeschlossen ist. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis die angegebene asynchrone Akzeptieroperation abgeschlossen ist. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ruft einen Wert ab, der angibt, ob die aktuelle Instanz nur einem Client die Verwendung eines Ports erlaubt. |
| [get_LocalEndpoint](./get_localendpoint/)() | Gibt den zugrunde liegenden Endpunkt zurück. |
| [get_Server](./get_server/)() | RTTI-Informationen. |
| [Pending](./pending/)() | Gibt einen Wert zurück, der angibt, ob ausstehende Verbindungsanfragen vorhanden sind. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Setzt einen Wert, der angibt, ob die aktuelle Instanz nur einem Client die Verwendung eines Ports erlaubt. |
| [Start](./start/)() | Beginnt mit dem Lauschen auf eingehende Verbindungen. |
| [Start](./start/)(int32_t) | Beginnt mit dem Lauschen auf eingehende Verbindungen. |
| [Stop](./stop/)() | Beendet das Lauschen auf eingehende Verbindungen. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Erstellt eine neue Instanz. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Erstellt eine neue Instanz. |
| [TcpListener](./tcplistener/)(int32_t) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
