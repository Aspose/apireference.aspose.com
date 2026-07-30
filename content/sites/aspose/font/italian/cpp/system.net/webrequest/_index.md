---
title: "classe System::Net::WebRequest"
linktitle: "WebRequest"
second_title: "Aspose.Font per C++"
description: "System::Net::WebRequest class. Rappresenta una richiesta web. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3800
url: /it/cpp/system.net/webrequest/
---
## WebRequest class


Rappresenta una richiesta web. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Abort](./abort/)() | Interrompe la richiesta corrente. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Avvia un'operazione asincrona per ottenere un flusso per scrivere dati nella risorsa. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Avvia una richiesta asincrona per la risorsa. |
| static [Create](./create/)(String) | Crea una nuova istanza della classe [WebRequest](./) usando l'URI specificato. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza della classe [WebRequest](./) usando l'URI specificato. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Crea un discendente [WebRequest](./) per lo schema URI specificato. |
| static [CreateHttp](./createhttp/)(String) | Crea una nuova istanza della classe [WebRequest](./) usando l'URI specificato. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Crea una nuova istanza della classe [WebRequest](./) usando l'URI specificato. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Attende finché l'operazione asincrona specificata per ottenere un flusso non termina. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Attende finché la richiesta asincrona specificata per la risorsa non termina. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Ottiene la politica della cache. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Ottiene il nome del gruppo di connessione. |
| virtual [get_ContentLength](./get_contentlength/)() | Ottiene il numero di byte dei dati della richiesta da inviare. |
| virtual [get_ContentType](./get_contenttype/)() | Ottiene il tipo MIME della richiesta. |
| virtual [get_Credentials](./get_credentials/)() | Ottiene le informazioni di autenticazione associate alla richiesta corrente. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Ottiene il proxy HTTP globale. |
| virtual [get_Headers](./get_headers/)() | Ottiene la raccolta delle intestazioni HTTP. |
| virtual [get_Method](./get_method/)() | Ottiene il metodo HTTP. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | Ottiene un valore che indica se la richiesta deve essere pre‑autenticata. |
| static [get_PrefixList](./get_prefixlist/)() | Ottiene l'elenco dei prefissi. |
| virtual [get_Proxy](./get_proxy/)() | Ottiene il proxy HTTP. |
| virtual [get_RequestUri](./get_requesturi/)() | Restituisce l'URI della richiesta. |
| virtual [get_Timeout](./get_timeout/)() | Ottiene un intervallo di tempo in millisecondi dopo il quale la richiesta scadrà. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Ottiene un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | Restituisce lo stream per scrivere dati sulla risorsa. |
| virtual [GetResponse](./getresponse/)() | Restituisce la risposta web associata alla richiesta web corrente. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Registra il discendente [WebRequest](./) per l'URI specificato. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Imposta la politica della cache. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Imposta il nome del gruppo di connessione. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Imposta il numero di byte dei dati della richiesta da inviare. |
| virtual [set_ContentType](./set_contenttype/)(String) | Imposta il tipo MIME della richiesta. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Imposta le informazioni di autenticazione associate alla richiesta corrente. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Imposta il proxy HTTP globale. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | Imposta la raccolta delle intestazioni HTTP. |
| virtual [set_Method](./set_method/)(String) | Imposta il metodo HTTP. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | Imposta un valore che indica se la richiesta deve essere pre-autenticata. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Imposta l'elenco dei prefissi. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Imposta il proxy HTTP. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | Imposta una quantità di tempo in millisecondi dopo la quale la richiesta scadrà. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Imposta un valore che indica se la proprietà 'Credential' è uguale alla proprietà 'DefaultCredentials'. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
