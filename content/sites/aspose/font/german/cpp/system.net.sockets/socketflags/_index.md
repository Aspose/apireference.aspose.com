---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::SocketFlags enum. Stellt konstante Werte für die Socket-Nachrichten in C++ bereit."
type: docs
weight: 1400
url: /de/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


Stellt konstante Werte für die Socket-Nachrichten bereit.

```cpp
enum class SocketFlags
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Für diesen Aufruf werden keine Flags verwendet. |
| OutOfBand | 1 | Die Out-of-Band-Daten werden verarbeitet. |
| Peek | 2 | Vorschau auf eine eingehende Nachricht. |
| DontRoute | 4 | Sende eine Nachricht, ohne Routing-Tabellen zu verwenden. |
| Truncated | 256 | Eine Nachricht ist zu groß, um in den angegebenen Puffer zu passen. Sie wurde abgeschnitten. |
| ControlDataTruncated | 512 | Die Steuerdaten sind größer als 64 KB und passen nicht in den internen Puffer. Sie wurden abgeschnitten. |
| Broadcast | 1024 | Ein Broadcast-Paket. |
| Multicast | 2048 | Ein Multicast-Paket. |
| Teilweise | 32768 | Eine Nachricht, die teilweise gesendet oder empfangen wurde. |

## Siehe auch

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
