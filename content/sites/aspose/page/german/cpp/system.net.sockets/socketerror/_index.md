---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Page für C++"
description: "System::Net::Sockets::SocketError-Enum. Enumeriert die Socket-Fehlertypen in C++."
type: docs
weight: 1300
url: /de/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Enumeriert die Socket‑Fehlertypen.

```cpp
enum class SocketError
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Erfolg | 0 | Ein Socket-Vorgang wurde erfolgreich abgeschlossen. |
| SocketError | -1 | Ein nicht spezifizierter Socket-Fehler ist aufgetreten. |
| Unterbrochen | 10004 | Ein blockierender Socket-Aufruf wurde abgebrochen. |
| AccessDenied | 10013 | Der Zugriff auf einen Socket wird verweigert. |
| Fehler | 10014 | Eine ungültige Zeigeradresse wurde erkannt. |
| InvalidArgument | 10022 | Ein ungültiges Argument wurde übergeben. |
| TooManyOpenSockets | 10024 | Es gibt zu viele offene Sockets im zugrunde liegenden Socket-Anbieter. |
| WouldBlock | 10035 | Ein Vorgang kann auf einem nicht blockierenden Socket nicht sofort abgeschlossen werden. |
| InProgress | 10036 | Ein blockierender Vorgang ist im Gange. |
| AlreadyInProgress | 10037 | Ein nicht blockierender Socket hat bereits einen laufenden Vorgang. |
| NotSocket | 10038 | Ein Versuch, eine Socket-Operation an einem Nicht-Socket aufzurufen. |
| DestinationAddressRequired | 10039 | Eine erforderliche Adresse wurde bei einer Socket-Operation weggelassen. |
| MessageSize | 10040 | Ein Datagramm ist zu lang. |
| ProtocolType | 10041 | Ein Protokolltyp wird von diesem Socket nicht unterstützt. |
| ProtocolOption | 10042 | Eine unbekannte, ungültige oder nicht unterstützte Option oder Ebene wird verwendet. |
| ProtocolNotSupported | 10043 | Ein Protokoll ist nicht implementiert oder nicht konfiguriert. |
| SocketNotSupported | 10044 | Eine Adressfamilie unterstützt den angegebenen Socket nicht. |
| OperationNotSupported | 10045 | Eine Protokollfamilie unterstützt keine Adressfamilie. |
| ProtocolFamilyNotSupported | 10046 | Eine Protokollfamilie ist nicht implementiert oder nicht konfiguriert. |
| AddressFamilyNotSupported | 10047 | Die angegebene Adressfamilie wird nicht unterstützt. |
| AddressAlreadyInUse | 10048 | Eine Adresse kann nur einmal verwendet werden. |
| AddressNotAvailable | 10049 | Die ausgewählte IP-Adresse ist in diesem Kontext nicht gültig. |
| NetworkDown | 10050 | Das Netzwerk ist nicht verfügbar. |
| NetworkUnreachable | 10051 | Keine Route zum entfernten Host vorhanden. |
| NetworkReset | 10052 | Eine Anwendung versuchte, 'Keep-Alive' für eine Verbindung zu setzen, die bereits abgelaufen ist. |
| ConnectionAborted | 10053 | Eine Verbindung wurde abgebrochen. |
| ConnectionReset | 10054 | Eine Verbindung wird von einem entfernten Peer zurückgesetzt. |
| NoBufferSpaceAvailable | 10055 | Kein freier Pufferplatz ist für einen Socket-Vorgang verfügbar. |
| IsConnected | 10056 | Ein Socket ist bereits verbunden. |
| NotConnected | 10057 | Eine Anwendung versuchte, Daten zu senden oder zu empfangen, und ein Socket ist nicht verbunden. |
| Shutdown | 10058 | Eine Anforderung zum Senden oder Empfangen von Daten ist verboten, weil der Socket bereits geschlossen wurde. |
| TimedOut | 10060 | Ein Verbindungsversuch ist abgelaufen, oder ein verbundener Host hat nicht geantwortet. |
| ConnectionRefused | 10061 | Ein entfernter Host verweigert aktiv eine Verbindung. |
| HostDown | 10064 | Ein Vorgang ist fehlgeschlagen, weil ein Remote-Host ausgefallen ist. |
| HostUnreachable | 10065 | Keine Netzwerkroute zum angegebenen Host existiert. |
| ProcessLimit | 10067 | Zu viele Prozesse verwenden den zugrunde liegenden Socket-Anbieter. |
| SystemNotReady | 10091 | Ein Netzwerk-Subsystem ist nicht verfügbar. |
| VersionNotSupported | 10092 | Eine Version des zugrunde liegenden Socket-Anbieters liegt außerhalb des zulässigen Bereichs. |
| NotInitialized | 10093 | Der zugrunde liegende Socket-Anbieter ist nicht initialisiert. |
| Disconnecting | 10101 | Ein geordneter Shutdown ist im Gange. |
| TypeNotFound | 10109 | Die angegebene Klasse wurde nicht gefunden. |
| HostNotFound | 11001 | Der angegebene Host ist unbekannt. |
| ErneutVersuchen | 11002 | Ein Hostname kann nicht aufgelöst werden. |
| KeineWiederherstellung | 11003 | Ein Fehler ist nicht wiederherstellbar oder die angeforderte Datenbank kann nicht gefunden werden. |
| KeineDaten | 11004 | Ein angeforderter Name oder eine IP-Adresse wurde auf dem Namensserver nicht gefunden. |

## Siehe auch

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
