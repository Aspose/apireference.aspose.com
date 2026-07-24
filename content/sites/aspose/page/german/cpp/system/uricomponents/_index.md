---
title: "System::UriComponents Aufzählung"
linktitle: "UriComponents"
second_title: "Aspose.Page für C++"
description: "System::UriComponents Aufzählung. Stellt URI-Komponenten in C++ dar."
type: docs
weight: 8900
url: /de/cpp/system/uricomponents/
---
## UriComponents enum


Stellt URI-Komponenten dar.

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
| Pfad | 16 | Die LocalPath-Daten. |
| Abfrage | 32 | Die Query-Daten. |
| PathAndQuery | n/a | Die LocalPath- und Query-Daten. |
| HttpRequestUrl | n/a | Die Scheme-, Host-, Port-, Query- und LocalPath-Daten. |
| Fragment | 64 | Die Fragment-Daten. |
| AbsoluteUri | n/a | Die Scheme, Host, Port, Quer, LocalPath und Fragment Daten. |
| StrongPort | 128 | Die Portdaten; wenn die Portdaten nicht im [Uri](../uri/) vorhanden sind und dem Scheme ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben; gibt es keinen Standardport, wird -1 zurückgegeben. |
| HostAndPort | n/a | Die Host- und Portdaten; wenn die Portdaten nicht im [Uri](../uri/) vorhanden sind und dem Scheme ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben. Gibt es keinen Standardport, wird -1 zurückgegeben. |
| StrongAuthority | n/a | Die UserInfo-, Host- und Portdaten. Wenn keine Portdaten im [Uri](../uri/) vorhanden sind und dem Scheme ein Standardport zugewiesen wurde, wird der Standardport zurückgegeben. Gibt es keinen Standardport, wird -1 zurückgegeben. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Gibt an, dass das Trennzeichen eingeschlossen werden soll. |
| SerializationInfoString | n/a | Der vollständige [Uri](../uri/)-Kontext, der für [Uri](../uri/)-Serialisierer benötigt wird. Der Kontext beinhaltet den IPv6‑Bereich. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
