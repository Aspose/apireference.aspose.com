---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::SocketOptionName enum. Definiert Socket-Optionnamen für die Socket-Klasse in C++."
type: docs
weight: 1600
url: /de/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Definiert Socket-Optionnamen für die [Socket](../socket/) Klasse.

```cpp
enum class SocketOptionName
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Debuggen | 1 | Debug-Informationen aufzeichnen. |
| AcceptConnection | 2 | Gibt an, ob ein Socket auf eine eingehende Verbindung wartet. |
| ReuseAddress | 4 | Gibt an, ob ein Socket an eine bereits verwendete Adresse gebunden werden kann. |
| KeepAlive | 8 | Aktiviert die 'Keep-Alive'-Pakete für eine Socket-Verbindung. |
| DontRoute | 16 | Gibt an, ob ein Paket direkt an die Schnittstellenadressen gesendet wird. |
| Broadcast | 32 | Gibt an, ob ein Socket Broadcast-Nachrichten senden kann. |
| UseLoopback | 64 | Hardware nach Möglichkeit umgehen. |
| Linger | 128 | Das System blockiert den Prozess beim Schließen, bis es die Daten übertragen kann. |
| OutOfBandInline | 256 | Empfängt Out-of-Band-Daten im normalen Datenstrom. |
| DontLinger | n/a | Gibt an, ob ein Socket ohne Verzögerung geschlossen wird. |
| ExclusiveAddressUse | n/a | Ein Socket verwendet die gebundene Adresse ausschließlich. |
| SendBuffer | 4097 | Gibt die Größe des Sendepuffers an. |
| ReceiveBuffer | 4098 | Gibt die Größe des Empfangspuffers an. |
| SendLowWater | 4099 | Gibt die minimale Datenmenge für die Sendevorgänge an. |
| ReceiveLowWater | 4100 | Gibt die minimale Datenmenge für die Empfangsvorgänge an. |
| SendTimeout | 4101 | Gibt den Timeout für die synchronen Sendevorgänge an. |
| ReceiveTimeout | 4102 | Gibt den Timeout für die synchronen Empfangsvorgänge an. |
| Fehler | 4103 | Gibt den Fehlstatus zurück und löscht ihn. |
| Typ | 4104 | Gibt einen Socket-Typ zurück. |
| ReuseUnicastPort | 12295 | Gibt an, ob das System die Zuweisung des ephemeren Ports für ausgehende Verbindungen verzögern soll. |
| MaxConnections | 2147483647 | Diese Option wird nicht unterstützt. Sie wurde verwendet, um die maximale Warteschlangenlänge für das Lauschen anzugeben. |
| IPOptions | 1 | Gibt die IP-Option an, die in ausgehende Datagramme eingefügt werden muss. |
| HeaderIncluded | 2 | Der Header wird in ausgehende Datagramme eingefügt. |
| TypeOfService | 3 | Ändern Sie den IP-Header-Typ des Service-Feldes. |
| IpTimeToLive | 4 | Die IP Time-to-Live. |
| MulticastInterface | 9 | Legen Sie die Schnittstelle für ausgehende Multicast-Pakete fest. |
| MulticastTimeToLive | 10 | Die IP-Multicast-Time-to-Live. |
| MulticastLoopback | 11 | Der IP-Multicast-Loopback. |
| AddMembership | 12 | Fügen Sie eine IP-Gruppenmitgliedschaft hinzu. |
| DropMembership | 13 | Entfernen Sie eine IP-Gruppenmitgliedschaft. |
| DontFragment | 14 | Fragmentieren Sie die IP-Datagramme nicht. |
| AddSourceMembership | 15 | Treten Sie der IP-Gruppe/Quelle bei. |
| DropSourceMembership | 16 | Entfernen Sie die IP-Gruppe/Quelle. |
| BlockSource | 17 | Blockieren Sie die IP-Gruppe/Quelle. |
| UnblockSource | 18 | Entsperren Sie die IP-Gruppe/Quelle. |
| PacketInformation | 19 | Paketinformationen für IPv4 empfangen. |
| HopLimit | 21 | Gibt eine Ganzzahl zurück, die die HOP-Anzahl des Pakets enthält. |
| IPProtectionLevel | 23 | Ermöglicht die Einschränkung eines IPv6-Sockets auf den angegebenen Geltungsbereich. |
| IPv6Only | 27 | Der Socket ist darauf beschränkt, nur IPv6-Pakete zu senden und zu empfangen. |
| NoDelay | 1 | Deaktiviert den Nagle-Algorithmus zum Zusammenfassen der zu sendenden Pakete. |
| BsdUrgent | 2 | Verwenden Sie die dringenden Daten gemäß RFC-1222. |
| Expedited | 2 | Verwenden Sie die beschleunigten Daten gemäß RFC-1222. |
| NoChecksum | 1 | Senden Sie die UDP-Datagramme mit einer Prüfsumme von null. |
| ChecksumCoverage | 20 | Setzen oder abrufen der UDP-Prüfsummenabdeckung. |
| UpdateAcceptContext | 28683 | Aktualisiert einen Client-Socket mit denselben Eigenschaften wie ein hörender Socket. |
| UpdateConnectContext | 28688 | Aktualisiert einen Client-Socket mit denselben Eigenschaften wie ein hörender Socket. |

## Siehe auch

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
