---
title: "System::Net::HttpWebRequest classe"
linktitle: "HttpWebRequest"
second_title: "Aspose.Font per C++"
description: "classe System::Net::HttpWebRequest. Rappresenta la richiesta web HTTP. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


Rappresenta la richiesta web HTTP. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Abort](./abort/)() override | Interrompe la richiesta corrente. |
| virtual [AddRange](./addrange/)(int32_t) | Aggiunge l'intestazione 'Range' alla richiesta corrente. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Aggiunge l'intestazione 'Range' alla richiesta corrente. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione asincrona per ottenere un flusso per scrivere dati nella risorsa. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Avvia una richiesta asincrona per la risorsa. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Attende finché l'operazione asincrona specificata per ottenere un flusso non termina. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Attende finché la richiesta asincrona specificata per la risorsa non termina. |
| [get_Accept](./get_accept/)() | Ottiene il valore dell'intestazione HTTP 'Accept'. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | Ottiene un valore che indica se la richiesta deve seguire i reindirizzamenti. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Ottiene un valore che indica se i dati ricevuti dalla risorsa devono essere memorizzati in buffer. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Ottiene un valore che indica se il buffering è abilitato per l'invio dei dati. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Ottiene la raccolta dei certificati associati alla richiesta corrente. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Ottiene il nome del gruppo di connessione. |
| [get_ContentLength](./get_contentlength/)() override | Ottiene il numero di byte dei dati della richiesta da inviare. |
| [get_ContentType](./get_contenttype/)() override | Ottiene il tipo MIME della richiesta. |
| [get_ContinueTimeout](./get_continuetimeout/)() | Ottiene un timeout per attendere fino a quando non viene ricevuto il codice di stato 100-Continue. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Ottiene un contenitore di cookie associato alla richiesta web corrente. |
| [get_Credentials](./get_credentials/)() override | Ottiene le informazioni di autenticazione associate alla richiesta corrente. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Restituisce un valore che indica se è stata ricevuta una risposta. |
| [get_Headers](./get_headers/)() override | Ottiene la raccolta delle intestazioni HTTP. |
| virtual [get_KeepAlive](./get_keepalive/)() | Ottiene un valore che indica se la richiesta corrente deve contenere l'intestazione 'Keep-Alive'. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | Ottiene il numero massimo di reindirizzamenti consentiti. |
| [get_Method](./get_method/)() override | Ottiene il metodo HTTP. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | Ottiene un valore che indica se la richiesta deve essere pre‑autenticata. |
| [get_Proxy](./get_proxy/)() override | Ottiene il proxy HTTP. |
| virtual [get_Referer](./get_referer/)() | Ottiene un valore dell'intestazione 'Referer'. |
| [get_RequestUri](./get_requesturi/)() override | Restituisce l'URI della richiesta. |
| virtual [get_SendChunked](./get_sendchunked/)() | Ottiene un valore che indica se i dati devono essere inviati a segmenti. |
| [get_ServicePoint](./get_servicepoint/)() | Restituisce un punto di servizio che rappresenta la connessione di rete alla risorsa. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Restituisce un valore che indica se la richiesta corrente può utilizzare un contenitore di cookie. |
| [get_Timeout](./get_timeout/)() override | Ottiene un intervallo di tempo in millisecondi dopo il quale la richiesta scadrà. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | Ottiene un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | Ottiene un valore dell'intestazione 'User-Agent'. |
| [GetRequestStream](./getrequeststream/)() override | Restituisce lo stream per scrivere dati sulla risorsa. |
| [GetResponse](./getresponse/)() override | Restituisce la risposta web associata alla richiesta web corrente. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza. |
| [set_Accept](./set_accept/)(String) | Imposta il valore dell'intestazione HTTP 'Accept'. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Imposta un valore che indica se la richiesta deve seguire i reindirizzamenti. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Imposta un valore che indica se i dati ricevuti dalla risorsa devono essere memorizzati in buffer. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Imposta un valore che indica se il buffering è abilitato per l'invio dei dati. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Imposta la raccolta dei certificati associati alla richiesta corrente. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Imposta il nome del gruppo di connessione. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Imposta il numero di byte dei dati della richiesta da inviare. |
| [set_ContentType](./set_contenttype/)(String) override | Imposta il tipo MIME della richiesta. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | Imposta un timeout per attendere fino a quando viene ricevuto il codice di stato 100-Continue. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Imposta un contenitore di cookie associato alla richiesta web corrente. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Imposta le informazioni di autenticazione associate alla richiesta corrente. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Imposta la raccolta delle intestazioni HTTP. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Imposta un valore che indica se la richiesta corrente deve contenere l'intestazione 'Keep-Alive'. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | Imposta un numero massimo di reindirizzamenti consentiti. |
| [set_Method](./set_method/)(String) override | Imposta il metodo HTTP. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | Imposta un valore che indica se la richiesta deve essere pre-autenticata. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | Informazioni RTTI. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | Imposta il proxy HTTP. |
| virtual [set_Referer](./set_referer/)(System::String) | Imposta un valore dell'intestazione 'Referer'. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Imposta un valore che indica se i dati devono essere inviati a segmenti. |
| [set_Timeout](./set_timeout/)(int) override | Imposta una quantità di tempo in millisecondi dopo la quale la richiesta scadrà. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | Imposta un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | Imposta un valore dell'intestazione 'User-Agent'. |
## Vedi anche

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
