---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page für C++"
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
| Debug | 1 | Erfasst Debug-Informationen. |
| VerbindungAkzeptieren | 2 | Gibt an, ob ein Socket auf eingehende Verbindungen lauscht. |
| AdresseWiederverwenden | 4 | Gibt an, ob ein Socket an eine bereits verwendete Adresse gebunden werden kann. |
| KeepAlive | 8 | Aktiviert die 'Keep-Alive'-Pakete für eine Socket-Verbindung. |
| NichtWeiterleiten | 16 | Gibt an, ob ein Paket direkt an die Schnittstellenadressen gesendet wird. |
| Broadcast | 32 | Gibt an, ob ein Socket Broadcast-Nachrichten senden kann. |
| UseLoopback | 64 | Hardware nach Möglichkeit umgehen. |
| Linger | 128 | Das System blockiert den Vorgang beim Schließen, bis es die Daten übertragen kann. |
| OutOfBandInline | 256 | Empfängt Out-of-Band-Daten im normalen Datenstrom. |
| DontLinger | n/a | Gibt an, ob ein Socket ohne Verzögerung geschlossen wird. |
| ExclusiveAddressUse | n/a | Ein Socket verwendet die gebundene Adresse ausschließlich. |
| SendBuffer | 4097 | Gibt die Größe des Sendepuffers an. |
| ReceiveBuffer | 4098 | Gibt die Größe des Empfangspuffers an. |
| SendLowWater | 4099 | Gibt die minimale Datenmenge für Sendvorgänge an. |
| ReceiveLowWater | 4100 | Gibt die minimale Datenmenge für Empfangsvorgänge an. |
| SendTimeout | 4101 | Gibt den Timeout für synchrone Sendvorgänge an. |
| ReceiveTimeout | 4102 | Gibt die Zeitüberschreitung für die synchronen Empfangsvorgänge an. |
| Error | 4103 | Gibt den Fehlstatus zurück und löscht ihn. |
| Typ | 4104 | Gibt einen Socket‑Typ zurück. |
| ReuseUnicastPort | 12295 | Gibt an, ob das System die Zuweisung des temporären Ports für ausgehende Verbindungen verzögern soll. |
| MaxConnections | 2147483647 | Diese Option wird nicht unterstützt. Sie wurde verwendet, um die maximale Warteschlangenlänge für das Lauschen festzulegen. |
| IPOptions | 1 | Gibt die IP‑Option an, die in ausgehende Datagramme eingefügt werden muss. |
| HeaderIncluded | 2 | Der Header wird in ausgehende Datagramme eingefügt. |
| TypeOfService | 3 | Ändert den IP‑Header‑Typ des Service‑Feldes. |
| IpTimeToLive | 4 | Die IP‑Zeitüberschreitung. |
| MulticastInterface | 9 | Set the interface for the outgoing multicast packets. |
| MulticastTimeToLive | 10 | Die IP‑Multicast‑Zeitüberschreitung. |
| MulticastLoopback | 11 | Der IP-Multicast-Loopback. |
| AddMembership | 12 | Füge eine IP-Gruppenmitgliedschaft hinzu. |
| DropMembership | 13 | Entferne eine IP-Gruppenmitgliedschaft. |
| DontFragment | 14 | Fragmentiere die IP-Datagramme nicht. |
| AddSourceMembership | 15 | Tritt der IP-Gruppe/Quelle bei. |
| DropSourceMembership | 16 | Entferne die IP-Gruppe/Quelle. |
| BlockSource | 17 | Blockiere die IP-Gruppe/Quelle. |
| UnblockSource | 18 | Entsperre die IP-Gruppe/Quelle. |
| PacketInformation | 19 | Empfange Paketinformationen für IPv4. |
| HopLimit | 21 | Gibt eine Ganzzahl zurück, die die HOP-Anzahl des Pakets enthält. |
| IPProtectionLevel | 23 | Ermöglicht die Einschränkung eines IPv6-Sockets auf den angegebenen Geltungsbereich. |
| IPv6Only | 27 | Der Socket ist darauf beschränkt, nur IPv6-Pakete zu senden und zu empfangen. |
| NoDelay | 1 | Deaktiviert den Nagle-Algorithmus zum Zusammenfassen der Sendepakete. |
| BsdUrgent | 2 | Verwende die dringenden Daten, wie in RFC-1222 definiert. |
| Expedited | 2 | Verwende die beschleunigten Daten, wie in RFC-1222 definiert. |
| NoChecksum | 1 | Sende die UDP-Datagramme mit einer Prüfsumme von null. |
| ChecksumCoverage | 20 | Setze oder erhalte die UDP-Prüfsummenabdeckung. |
| UpdateAcceptContext | 28683 | Aktualisiert einen Client‑Socket mit denselben Eigenschaften eines lauschen‑Sockets. |
| UpdateConnectContext | 28688 | Aktualisiert einen Client‑Socket mit denselben Eigenschaften eines lauschen‑Sockets. |

## Siehe auch

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
