---
title: "System::Net::Sockets::IOControlCode enum"
linktitle: "IOControlCode"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::IOControlCode enum. Enumererar IO‑kontrollkoderna i C++."
type: docs
weight: 900
url: /sv/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


Enumererar [IO](../../system.io/)‑kontrollkoderna.

```cpp
enum class IOControlCode : int64_t
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| AsyncIO | -2147195267 | Aktivera eller inaktivera det asynkrona I/O‑läget för socketen. |
| NonBlockingIO | -2147195266 | Markera socketen som icke‑blockerande. |
| DataToRead | 1074030207 | Returnera antalet byte som är tillgängliga för läsning. |
| OobDataRead | 1074033415 | Returnera information om out-of-band‑data som väntar på att tas emot. |
| AssociateHandle | -2013265919 | Associera denna socket med den angivna handtaget för ett komplementärt gränssnitt. |
| EnableCircularQueuing | 671088642 | Ersätt den äldsta köade datagrammen med en inkommande när de inkommande meddelandeköerna är fulla. |
| Flush | 671088644 | Kastar bort det aktuella innehållet i sändningskön som är associerad med denna socket. |
| GetBroadcastAddress | 1207959557 | Returnera en SOCKADDR‑struktur som innehåller broadcast‑adressen för adressfamiljen för den aktuella socketen. |
| GetExtensionFunctionPointer | -939524090 | Hämta en pekare till den angivna extensionsfunktionen som stöds av den associerade tjänsteleverantören. |
| GetQos | -939524089 | Hämta QOS‑strukturen som är associerad med socketen. |
| GetGroupQos | -939524088 | Returnera QOS‑attributen för socketgruppen. |
| MultipointLoopback | -2013265911 | Styr om data som skickas av en applikation på den lokala datorn (inte nödvändigtvis av samma socket) i en multicast‑session kommer att tas emot av en socket som gått med i multicast‑målgruppen på loopback‑gränssnittet. |
| MulticastScope | -2013265910 | Styr hur många gånger ett multicast‑paket kan vidarebefordras av en router, även känt som TTL eller hoppantal. |
| SetQos | -2013265909 | Ställ in QOS‑attributen för socketen. |
| SetGroupQos | -2013265908 | Ställ in QOS‑attributen för socketgruppen. |
| TranslateHandle | -939524083 | Returnera ett handtag för socketen som är giltigt i sammanhanget för ett medföljande gränssnitt. |
| RoutingInterfaceQuery | -939524076 | Returnera gränssnittsadresserna som kan användas för att ansluta till den angivna fjärradressen. |
| RoutingInterfaceChange | -2013265899 | Aktivera mottagning av en avisering när det lokala gränssnittet som används för att nå en fjärrändpunkt förändras. |
| AddressListQuery | 1207959574 | Returnera listan över de lokala gränssnitten som socketen kan binda till. |
| AddressListChange | 671088663 | Aktivera mottagning av en avisering när listan över de lokala gränssnitten för socketens protokollfamilj ändras. |
| QueryTargetPnpHandle | 1207959576 | Hämta den underliggande leverantörens SOCKET-handtag. |
| NamespaceChange | -2013265895 | Styr om socketen får avisering när en namnrymdsfråga blir ogiltig. |
| AddressListSort | -939524071 | Sortera en lista med IPv6- och IPv4-destinationadresser för att bestämma den bästa tillgängliga adressen för att upprätta en anslutning. |
| ReceiveAll | -1744830463 | Aktivera mottagning av alla IPv4-paket på nätverket. |
| ReceiveAllMulticast | -1744830462 | Aktivera mottagning av alla multicast IPv4-paket på nätverket. |
| ReceiveAllIgmpMulticast | -1744830461 | Aktivera mottagning av alla IGMP-paket på nätverket. |
| KeepAliveValues | -1744830460 | Styr sändning av TCP keep-alive-paket och intervallet då de skickas. |
| AbsorbRouterAlert | -1744830459 | Detta värde är lika med Winsock 2 'SIO_ABSORB_RTRALERT'-konstanten. |
| UnicastInterface | -1744830458 | Ange gränssnittet som används för utgående unicast-paket. |
| LimitBroadcasts | -1744830457 | Detta värde är lika med Winsock 2 'SIO_LIMIT_BROADCASTS'-konstanten. |
| BindToInterface | -1744830456 | Binda socketen till ett specificerat gränssnittsindex. |
| MulticastInterface | -1744830455 | Ange gränssnittet som används för utgående multicast-paket. |
| AddMulticastGroupOnInterface | -1744830454 | Gå med i en multicast-grupp med ett gränssnitt identifierat av dess index. |
| DeleteMulticastGroupFromInterface | -1744830453 | Ta bort socketen från en multicast-grupp. |

## Se även

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
