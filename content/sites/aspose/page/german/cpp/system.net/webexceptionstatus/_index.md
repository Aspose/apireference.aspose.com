---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page für C++"
description: "System::Net::WebExceptionStatus-Enum. Enumeriert die Statuscodes der WebException-Klasse in C++."
type: docs
weight: 4900
url: /de/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Enumeriert die Statuscodes der [WebException](../webexception/)-Klasse.

```cpp
enum class WebExceptionStatus
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Erfolg | 0 | Keine Fehler aufgetreten. |
| NameResolutionFailure | 1 | Der Namensauflösungsdienst konnte den Hostnamen nicht auflösen. |
| ConnectFailure | 2 | Der entfernte Dienstpunkt konnte auf der Transportebene nicht kontaktiert werden. |
| ReceiveFailure | 3 | Eine vollständige Antwort wurde vom entfernten Server nicht empfangen. |
| SendFailure | 4 | Eine vollständige Anforderung konnte nicht an den entfernten Server gesendet werden. |
| PipelineFailure | 5 | Die Anforderung war eine pipelined-Anforderung und die Verbindung wurde geschlossen, bevor die Antwort empfangen wurde. |
| RequestCanceled | 6 | Die Anforderung wurde abgebrochen oder ein nicht klassifizierbarer Fehler ist aufgetreten. |
| ProtocolError | 7 | Die vom Server empfangene Antwort war vollständig, zeigte jedoch einen protokollbezogenen Fehler an. |
| ConnectionClosed | 8 | Die Verbindung wurde vorzeitig geschlossen. |
| TrustFailure | 9 | Ein Serverzertifikat konnte nicht validiert werden. |
| SecureChannelFailure | 10 | Beim Aufbau einer Verbindung mit SSL ist ein Fehler aufgetreten. |
| ServerProtocolViolation | 11 | Die Serverantwort war keine gültige HTTP-Antwort. |
| KeepAliveFailure | 12 | Die Verbindung für eine Anfrage, die den 'Keep-Alive'-Header angibt, wurde unerwartet geschlossen. |
| Pending | 13 | Eine interne asynchrone Anfrage steht aus. |
| Zeitüberschreitung | 14 | Während des Zeitüberschreitungszeitraums für eine Anfrage wurde keine Antwort empfangen. |
| ProxyNameResolutionFailure | 15 | Der Namensauflösungsdienst konnte den Proxy-Hostnamen nicht auflösen. |
| UnknownError | 16 | Eine Ausnahme unbekannten Typs ist aufgetreten. |
| MessageLengthLimitExceeded | 17 | Eine Nachricht, die das angegebene Limit überschritten hat, wurde empfangen. |
| CacheEntryNotFound | 18 | Der angegebene Cache-Eintrag wurde nicht gefunden. |
| RequestProhibitedByCachePolicy | 19 | Die Anfrage war durch die Cache-Richtlinie nicht zulässig. |
| RequestProhibitedByProxy | 20 | Diese Anfrage war durch den Proxy nicht zulässig. |

## Siehe auch

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
