---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::SocketFlags enum. Tillhandahåller konstanta värden för socket-meddelanden i C++."
type: docs
weight: 1400
url: /sv/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Tillhandahåller konstanta värden för socketmeddelanden.

```cpp
enum class SocketFlags
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| None | 0 | Det finns inga flaggor som används för detta anrop. |
| OutOfBand | 1 | Out-of-band-data bearbetas. |
| Peek | 2 | Titta på ett inkommande meddelande. |
| IngenRutt | 4 | Skicka ett meddelande utan att använda routningstabeller. |
| Truncated | 256 | Ett meddelande är för stort för att få plats i den angivna bufferten. Det har trunkerats. |
| ControlDataTruncated | 512 | Kontrolldata är större än 64 KB och får inte plats i den interna bufferten. Den har trunkerats. |
| Utsändning | 1024 | Ett broadcast-paket. |
| Multicast | 2048 | Ett multicast-paket. |
| Partial | 32768 | Ett meddelande som skickats eller mottagits delvis. |

## Se även

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
