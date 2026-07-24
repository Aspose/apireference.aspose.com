---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::SocketFlags enum. Biedt constante waarden voor de socketberichten in C++."
type: docs
weight: 1400
url: /nl/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Biedt constante waarden voor de socketberichten.

```cpp
enum class SocketFlags
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Er worden geen vlaggen gebruikt voor deze oproep. |
| OutOfBand | 1 | De out-of-band gegevens worden verwerkt. |
| Peek | 2 | Kijk naar een binnenkomend bericht. |
| DontRoute | 4 | Verzend een bericht zonder gebruik te maken van routeringstabellen. |
| Truncated | 256 | Een bericht is te groot om in de opgegeven buffer te passen. Het is afgekapt. |
| ControlDataTruncated | 512 | De controlegegevens zijn groter dan 64 KB en passen niet in de interne buffer. Ze zijn afgekapt. |
| Broadcast | 1024 | Een broadcastpakket. |
| Multicast | 2048 | Een multicastpakket. |
| Partial | 32768 | Een bericht dat gedeeltelijk is verzonden of ontvangen. |

## Zie ook

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
