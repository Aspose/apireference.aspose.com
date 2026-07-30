---
title: "classe System::Net::Http::HttpClientHandler"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font per C++"
description: "classe System::Net::Http::HttpClientHandler. Rappresenta il gestore di messaggi predefinito utilizzato dalla classe HttpClient. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Rappresenta il gestore di messaggi predefinito utilizzato dalla classe [HttpClient](../httpclient/). Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [get_CookieContainer](./get_cookiecontainer/)() | Ottiene il contenitore dei cookie utilizzato per memorizzare i cookie del server. |
| [get_Credentials](./get_credentials/)() | Ottiene le informazioni di autenticazione. |
| [HttpClientHandler](./httpclienthandler/)() | Informazioni RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | Informazioni RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Imposta il contenitore dei cookie utilizzato per memorizzare i cookie del server. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Imposta le informazioni di autenticazione. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Imposta le informazioni del proxy. |
| [set_Timeout](./set_timeout/)(int32_t) | Ottiene un intervallo di tempo in millisecondi dopo il quale la richiesta scadrà. |
| [set_UseCookies](./set_usecookies/)(bool) | Imposta il valore che indica se l'istanza corrente utilizza il contenitore dei cookie per memorizzare i cookie del server e se l'istanza utilizza i cookie del server durante l'invio delle richieste. |
| [set_UseProxy](./set_useproxy/)(bool) | Imposta il valore che indica se l'istanza corrente utilizza il proxy per l'invio delle richieste. |
## Vedi anche

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
