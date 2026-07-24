---
title: "System::Net::Sockets Namespace"
linktitle: "System::Net::Sockets"
second_title: "Aspose.Page für C++"
description: "Wie man das System::Net::Sockets Namespace in C++ verwendet."
type: docs
weight: 4800
url: /de/cpp/system.net.sockets/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [IPPacketInformation](./ippacketinformation/) | Stellt Informationen über das Paket dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [LingerOption](./lingeroption/) | Gibt an, ob ein Socket nach einem Aufruf der Close()- oder Close()-Methoden verbunden bleibt. Außerdem wird der Zeitraum angegeben, während dem der Socket verbunden bleibt, wenn das Senden der Daten fortgesetzt wird. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [NetworkStream](./networkstream/) | Stellt den zugrunde liegenden Datenstrom für den Netzwerkzugriff bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Socket](./socket/) | Die [Socket](./socket/) Klasse implementiert die Berkeley‑Sockets‑Schnittstelle. |
| [TcpClient](./tcpclient/) | Stellt einen Client für die TCP‑Netzwerkdienste dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [TcpListener](./tcplistener/) | Stellt einen Listener für die TCP‑Netzwerkdienste dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [UdpClient](./udpclient/) | Stellt User Datagram Protocol (UDP)-Netzwerkdienste bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [AddressFamily](./addressfamily/) | Enumeriert die Adressfamilien. |
| [IOControlCode](./iocontrolcode/) | Enumeriert die [IO](../system.io/) Steuercodes. |
| [ProtocolFamily](./protocolfamily/) | Enumeriert die Protokollfamilien. |
| [ProtocolType](./protocoltype/) | Enumeriert die Protokolltypen. |
| [SelectMode](./selectmode/) | Gibt den Modus zum Abfragen des Socket‑Status an. |
| [SocketError](./socketerror/) | Enumeriert die Socket‑Fehlertypen. |
| [SocketFlags](./socketflags/) | Stellt konstante Werte für die Socket‑Nachrichten bereit. |
| [SocketOptionLevel](./socketoptionlevel/) | Definiert Socket‑Optionsebenen für die '[Socket](./socket/)' Klasse. |
| [SocketOptionName](./socketoptionname/) | Definiert Socket‑Optionnamen für die [Socket](./socket/) Klasse. |
| [SocketShutdown](./socketshutdown/) | Definiert Konstanten, die von der Methode [Socket.Shutdown](./socket/shutdown/) verwendet werden. |
| [SocketType](./sockettype/) | Enumeriert die Socket‑Typen. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [SocketException](./socketexception/) |  |
## Functions

| Funktion | Beschreibung |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
