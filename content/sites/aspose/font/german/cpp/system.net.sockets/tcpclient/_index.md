---
title: "System::Net::Sockets::TcpClient Klasse"
linktitle: "TcpClient"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::TcpClient Klasse. Stellt einen Client für die TCP-Netzwerkdienste dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Stellt einen Client für die TCP-Netzwerkdienste dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TcpClient : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [Close](./close/)() | Schließt die Verbindung und gibt die aktuelle Instanz frei. |
| [Connect](./connect/)(String, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Host her. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Host her. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Stellt eine Verbindung zum angegebenen Remote-Host her. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Host her. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis der angegebene asynchrone Verbindungsaufbau abgeschlossen ist. |
| [get_Available](./get_available/)() | Gibt die Anzahl der empfangenen und zum Lesen bereitstehenden Bytes zurück. |
| [get_Client](./get_client/)() | RTTI-Informationen. |
| [get_Connected](./get_connected/)() | Gibt einen Wert zurück, der angibt, ob der Socket mit dem Remote-Host verbunden ist. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ruft einen Wert ab, der angibt, ob die aktuelle Instanz nur einem Client die Verwendung eines Ports erlaubt. |
| [get_LingerState](./get_lingerstate/)() | Ermittelt einen Wert, der angibt, ob der Socket das Schließen verzögert, um alle ausstehenden Daten zu senden. |
| [get_NoDelay](./get_nodelay/)() | Ermittelt einen Wert, der angibt, ob die aktuelle Instanz den Nagle-Algorithmus verwendet. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Ermittelt die Größe des Puffers, der zum Empfangen von Daten verwendet wird. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Ermittelt einen Wert, der eine Zeitdauer angibt, nach der das Empfangen von Daten zeitlich abläuft. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Ermittelt die Größe des Puffers, der zum Senden von Daten verwendet wird. |
| [get_SendTimeout](./get_sendtimeout/)() | Gibt einen Wert zurück, der eine Zeitdauer angibt, nach der das Senden von Daten abläuft. |
| [GetStream](./getstream/)() | Gibt den Stream zurück, der zum Senden und Empfangen von Daten verwendet wird. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Setzt den Socket. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Setzt einen Wert, der angibt, ob die aktuelle Instanz nur einem Client die Verwendung eines Ports erlaubt. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Legt einen Wert fest, der angibt, ob der Socket das Schließen verzögert, um zu versuchen, alle ausstehenden Daten zu senden. |
| [set_NoDelay](./set_nodelay/)(bool) | Setzt einen Wert, der angibt, ob die aktuelle Instanz den Nagle-Algorithmus verwendet. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Setzt die Größe des Puffers, der zum Empfangen von Daten verwendet wird. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Setzt einen Wert, der eine Zeitdauer angibt, nach der das Empfangen von Daten abläuft. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Setzt die Größe des Puffers, der zum Senden von Daten verwendet wird. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Setzt einen Wert, der eine Zeitdauer angibt, nach der das Senden von Daten abläuft. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Erstellt eine neue Instanz. |
| [TcpClient](./tcpclient/)() | Erstellt eine neue Instanz. |
| [TcpClient](./tcpclient/)(AddressFamily) | Erstellt eine neue Instanz. |
| [TcpClient](./tcpclient/)(String, int32_t) | Erstellt eine neue Instanz. |
| virtual [~TcpClient](./~tcpclient/)() | Zerstört die aktuelle Instanz. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
