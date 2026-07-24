---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page voor C++"
description: "System::Net::WebExceptionStatus enum. Somt de statuscodes van de WebException‑klasse in C++ op."
type: docs
weight: 4900
url: /nl/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Somt de statuscodes van de [WebException](../webexception/) klasse op.

```cpp
enum class WebExceptionStatus
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Success | 0 | Er zijn geen fouten opgetreden. |
| NameResolutionFailure | 1 | De naamresolutiedienst kon de hostnaam niet oplossen. |
| ConnectFailure | 2 | Het externe servicepunt kon op transportniveau niet worden bereikt. |
| ReceiveFailure | 3 | Er wordt geen volledige respons ontvangen van de externe server. |
| SendFailure | 4 | Er kon geen volledig verzoek naar de externe server worden verzonden. |
| PipelineFailure | 5 | Het verzoek was een pipelined request en de verbinding werd gesloten voordat de respons werd ontvangen. |
| RequestCanceled | 6 | Het verzoek werd geannuleerd of er trad een niet‑classificeerbare fout op. |
| ProtocolError | 7 | De van de server ontvangen respons was volledig maar gaf een protocol‑fout aan. |
| ConnectionClosed | 8 | De verbinding werd voortijdig gesloten. |
| TrustFailure | 9 | Een servercertificaat kon niet worden gevalideerd. |
| SecureChannelFailure | 10 | Er is een fout opgetreden tijdens het tot stand brengen van een verbinding met SSL. |
| ServerProtocolViolation | 11 | De serverrespons was geen geldige HTTP-respons. |
| KeepAliveFailure | 12 | De verbinding voor een verzoek dat de 'Keep-Alive' header specificeert, werd onverwacht gesloten. |
| Pending | 13 | Er staat een interne asynchrone aanvraag in de wacht. |
| Timeout | 14 | Er werd geen respons ontvangen gedurende de time-outperiode voor een verzoek. |
| ProxyNameResolutionFailure | 15 | De naamresolutiedienst kon de hostnaam van de proxy niet oplossen. |
| UnknownError | 16 | Er is een uitzondering van onbekend type opgetreden. |
| MessageLengthLimitExceeded | 17 | Er is een bericht ontvangen dat de opgegeven limiet overschreed. |
| CacheEntryNotFound | 18 | De opgegeven cache‑invoer werd niet gevonden. |
| RequestProhibitedByCachePolicy | 19 | Het verzoek was niet toegestaan door het cache‑beleid. |
| RequestProhibitedByProxy | 20 | Dit verzoek was niet toegestaan door de proxy. |

## Zie ook

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
