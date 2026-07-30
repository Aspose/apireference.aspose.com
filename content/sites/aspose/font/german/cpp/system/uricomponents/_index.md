---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Font für C++"
description: "System::UriComponents enum. Stellt URI-Komponenten in C++ dar."
type: docs
weight: 8900
url: /de/cpp/system/uricomponents/
---
## UriComponents enum


Stellt URI‑Komponenten dar.

```cpp
enum class UriComponents
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Schema | 1 | Die Scheme-Daten. |
| UserInfo | 2 | Die UserInfo-Daten. |
| Host | 4 | Die Host-Daten. |
| Port | 8 | Die Port-Daten. |
| SchemeAndServer | n/a | Die Scheme-, Host- und Port-Daten. |
| Path | 16 | Die LocalPath-Daten. |
| Query | 32 | Die Query-Daten. |
| PathAndQuery | n/a | Die LocalPath- und Query-Daten. |
| HttpRequestUrl | n/a | Die Scheme-, Host-, Port-, Query- und LocalPath-Daten. |
| Fragment | 64 | Die Fragment-Daten. |
| AbsoluteUri | n/a | Die Scheme-, Host-, Port-, Quer-, LocalPath- und Fragment-Daten. |
| StrongPort | 128 | Die Port-Daten; wenn die Port-Daten nicht im [Uri](../uri/) vorhanden sind und dem Scheme ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben; wenn kein Standardport vorhanden ist, wird -1 zurückgegeben. |
| HostAndPort | n/a | Die Host- und Port-Daten; wenn die Port-Daten nicht im [Uri](../uri/) vorhanden sind und dem Schema ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben. Wenn kein Standardport vorhanden ist, wird -1 zurückgegeben. |
| StrongAuthority | n/a | Die UserInfo-, Host- und Port-Daten. Wenn keine Port-Daten im [Uri](../uri/) vorhanden sind und dem Schema ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben. Wenn kein Standardport vorhanden ist, wird -1 zurückgegeben. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Gibt an, dass das Trennzeichen eingeschlossen werden soll. |
| SerializationInfoString | n/a | Der vollständige [Uri](../uri/) Kontext, der für [Uri](../uri/) Serialisierer benötigt wird. Der Kontext beinhaltet den IPv6‑Scope. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
