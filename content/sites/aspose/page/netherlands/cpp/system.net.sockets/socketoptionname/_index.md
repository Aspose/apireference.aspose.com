---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::SocketOptionName enum. Definieert socketoptienamen voor de Socket‑klasse in C++."
type: docs
weight: 1600
url: /nl/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Definieert socketoptienamen voor de [Socket](../socket/) klasse.

```cpp
enum class SocketOptionName
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Debuggen | 1 | Registreer debuginformatie. |
| AccepteerVerbinding | 2 | Geeft aan of een socket luistert naar een inkomende verbinding. |
| AdresHergebruiken | 4 | Geeft aan of een socket kan worden gebonden aan een adres dat al in gebruik is. |
| KeepAlive | 8 | Schakelt de 'Keep-Alive'-pakketten in voor een socketverbinding. |
| DontRoute | 16 | Geeft aan of een pakket rechtstreeks naar de interface‑adressen wordt verzonden. |
| Broadcast | 32 | Geeft aan of een socket broadcast‑berichten kan verzenden. |
| UseLoopback | 64 | Omzeil hardware wanneer mogelijk. |
| Linger | 128 | Het systeem blokkeert het proces bij de sluitpoging totdat het de gegevens kan verzenden. |
| OutOfBandInline | 256 | Ontvangt out-of-band-gegevens in de normale gegevensstroom. |
| DontLinger | n/a | Geeft aan of een socket wordt gesloten zonder te lingeren. |
| ExclusiveAddressUse | n/a | Een socket zal het gekoppelde adres exclusief gebruiken. |
| SendBuffer | 4097 | Specificeert de grootte van de verzendbuffer. |
| ReceiveBuffer | 4098 | Specificeert de grootte van de ontvangstbuffer. |
| SendLowWater | 4099 | Specificeert de minimale hoeveelheid gegevens voor de verzendbewerkingen. |
| ReceiveLowWater | 4100 | Specificeert de minimale hoeveelheid gegevens voor de ontvangstbewerkingen. |
| SendTimeout | 4101 | Specificeert de time-out voor de synchrone verzendbewerkingen. |
| ReceiveTimeout | 4102 | Specificeert de time-out voor de synchrone ontvangstbewerkingen. |
| Error | 4103 | Retourneert de foutstatus en wist deze. |
| Type | 4104 | Retourneert een sockettype. |
| ReuseUnicastPort | 12295 | Geeft aan of het systeem de toewijzing van de tijdelijke poort voor uitgaande verbindingen moet uitstellen. |
| MaxConnections | 2147483647 | Deze optie wordt niet ondersteund. Hij werd gebruikt om de maximale wachtrijlengte voor luisteren op te geven. |
| IPOptions | 1 | Specificeert de IP-optie die in uitgaande datagrammen moet worden ingevoegd. |
| HeaderIncluded | 2 | De header wordt toegevoegd aan uitgaande datagrammen. |
| TypeOfService | 3 | Wijzigt het type van het serviceveld in de IP-header. |
| IpTimeToLive | 4 | De IP time-to-live. |
| MulticastInterface | 9 | Stel de interface in voor uitgaande multicast‑pakketten. |
| MulticastTimeToLive | 10 | De IP-multicast time-to-live. |
| MulticastLoopback | 11 | De IP-multicast loopback. |
| AddMembership | 12 | Voeg een IP-groepslidmaatschap toe. |
| DropMembership | 13 | Verwijder een IP-groepslidmaatschap. |
| DontFragment | 14 | Fragmentatie van de IP-datagrammen niet toestaan. |
| AddSourceMembership | 15 | Word lid van de IP-groep/bron. |
| DropSourceMembership | 16 | Verwijder de IP-groep/bron. |
| BlockSource | 17 | Blokkeer de IP-groep/bron. |
| UnblockSource | 18 | Deblokkeer de IP-groep/bron. |
| PacketInformation | 19 | Ontvang pakketinformatie voor IPv4. |
| HopLimit | 21 | Levert een geheel getal met het HOP-aantal van het pakket. |
| IPProtectionLevel | 23 | Stelt beperking van een IPv6-socket in op het opgegeven bereik. |
| IPv6Only | 27 | De socket is beperkt tot het alleen verzenden en ontvangen van IPv6-pakketten. |
| NoDelay | 1 | Schakelt het Nagle-algoritme uit voor het samenvoegen van de verzonden pakketten. |
| BsdUrgent | 2 | Gebruik de urgente data zoals gedefinieerd in RFC-1222. |
| Versneld | 2 | Gebruik de versnelde data zoals gedefinieerd in RFC-1222. |
| NoChecksum | 1 | Verzend de UDP-datagrammen met een checksum ingesteld op nul. |
| ChecksumCoverage | 20 | Stel de UDP-checksumdekking in of haal deze op. |
| UpdateAcceptContext | 28683 | Werk een client-socket bij met dezelfde eigenschappen als een luisterende socket. |
| UpdateConnectContext | 28688 | Werk een client-socket bij met dezelfde eigenschappen als een luisterende socket. |

## Zie ook

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
