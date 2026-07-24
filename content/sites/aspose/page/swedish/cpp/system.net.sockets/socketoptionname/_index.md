---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::SocketOptionName enum. Definierar socketalternativnamn för Socket-klassen i C++."
type: docs
weight: 1600
url: /sv/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Definierar socketalternativnamn för [Socket](../socket/) klassen.

```cpp
enum class SocketOptionName
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Felsök | 1 | Spela in felsökningsinformation. |
| AccepteraAnslutning | 2 | Indikerar om en socket lyssnar på en inkommande anslutning. |
| ÅteranvändAdress | 4 | Indikerar om en socket kan bindas till en adress som redan är i bruk. |
| HållVaken | 8 | Aktiverar 'Keep-Alive'-paket för en socketanslutning. |
| IngenRutt | 16 | Indikerar om ett paket skickas direkt till gränssnittsadresserna. |
| Utsändning | 32 | Indikerar om en socket kan skicka broadcast-meddelanden. |
| UseLoopback | 64 | Kringgå hårdvara när det är möjligt. |
| Linger | 128 | Systemet kommer att blockera processen vid stängningsförsöket tills den kan överföra data. |
| OutOfBandInline | 256 | Tar emot out-of-band-data i den normala dataströmmen. |
| DontLinger | n/a | Anger om en socket kommer att stängas utan fördröjning. |
| ExclusiveAddressUse | n/a | En socket kommer att använda den bundna adressen uteslutande. |
| SendBuffer | 4097 | Anger storleken på sändningsbufferten. |
| ReceiveBuffer | 4098 | Anger storleken på mottagningsbufferten. |
| SendLowWater | 4099 | Anger den minsta mängden data för sändningsoperationerna. |
| ReceiveLowWater | 4100 | Anger den minsta mängden data för mottagningsoperationerna. |
| SendTimeout | 4101 | Anger tidsgränsen för de synkrona sändningsoperationerna. |
| ReceiveTimeout | 4102 | Anger tidsgränsen för de synkrona mottagningsoperationerna. |
| Fel | 4103 | Returnerar felstatusen och rensar. |
| Type | 4104 | Returnerar en socket-typ. |
| ReuseUnicastPort | 12295 | Indikerar om systemet ska skjuta upp den tillfälliga portallokeringen för utgående anslutningar. |
| MaxConnections | 2147483647 | Detta alternativ stöds inte. Det användes för att ange den maximala kölängden för lyssning. |
| IPOptions | 1 | Anger IP-alternativet som måste infogas i utgående datagram. |
| HeaderIncluded | 2 | Headern inkluderas i utgående datagram. |
| TypeOfService | 3 | Ändra IP-headerns typ för servicefältet. |
| IpTimeToLive | 4 | IP:s tids-till-levnad. |
| MulticastInterface | 9 | Ställ in gränssnittet för de utgående multicast-paketen. |
| MulticastTimeToLive | 10 | IP-multicastens tids-till-levnad. |
| MulticastLoopback | 11 | Den IP-multicast-loopbacken. |
| AddMembership | 12 | Lägg till ett IP-gruppmedlemskap. |
| DropMembership | 13 | Ta bort ett IP-gruppmedlemskap. |
| DontFragment | 14 | Fragmentera inte IP-datagrammen. |
| AddSourceMembership | 15 | Gå med i IP-grupp/källa. |
| DropSourceMembership | 16 | Ta bort IP-grupp/källa. |
| BlockSource | 17 | Blockera IP-grupp/källa. |
| UnblockSource | 18 | Avblockera IP-grupp/källa. |
| PacketInformation | 19 | Ta emot paketinformation för IPv4. |
| HopLimit | 21 | Levererar ett heltal som innehåller HOP-antalet för paketet. |
| IPProtectionLevel | 23 | Aktiverar begränsning av en IPv6-socket till den angivna omfattningen. |
| IPv6Only | 27 | Socketen är begränsad till att endast skicka och ta emot IPv6-paket. |
| NoDelay | 1 | Inaktiverar Nagle-algoritmen för att sammanslå sändningspaketen. |
| BsdUrgent | 2 | Använd den brådskande datan enligt definitionen i RFC-1222. |
| Expederad | 2 | Använd den expederade datan enligt definitionen i RFC-1222. |
| NoChecksum | 1 | Skicka UDP-datagrammen med en kontrollsumma satt till noll. |
| ChecksumCoverage | 20 | Ställ in eller hämta UDP-kontrollsumme-täckning. |
| UpdateAcceptContext | 28683 | Uppdaterar en klient-socket med samma egenskaper som en lyssnande socket. |
| UpdateConnectContext | 28688 | Uppdaterar en klient-socket med samma egenskaper som en lyssnande socket. |

## Se även

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
