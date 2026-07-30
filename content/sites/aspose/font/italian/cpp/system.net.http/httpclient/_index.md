---
title: "System::Net::Http::HttpClient classe"
linktitle: "HttpClient"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::HttpClient classe. Rappresenta una classe base di un client HTTP per l'invio di richieste e la ricezione di risposte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.net.http/httpclient/
---
## HttpClient class


Rappresenta una classe base di un client HTTP per l'invio di richieste e la ricezione di risposte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Annulla tutte le richieste in sospeso. |
| [get_BaseAddress](./get_baseaddress/)() | Ottiene l'indirizzo base della risorsa utilizzata per l'invio delle richieste. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | Informazioni RTTI. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Ottiene il numero massimo di byte del contenuto della risposta. |
| [get_Timeout](./get_timeout/)() | Ottiene l'intervallo di tempo da attendere prima che la richiesta scada. |
| [HttpClient](./httpclient/)() | Crea una nuova istanza. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Crea una nuova istanza. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Crea una nuova istanza. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Invia la richiesta HTTP specificata. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Imposta l'indirizzo base della risorsa utilizzata per l'invio delle richieste. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Imposta il numero massimo di byte del contenuto della risposta. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Imposta l'intervallo di tempo da attendere prima che la richiesta scada. |
## Vedi anche

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
