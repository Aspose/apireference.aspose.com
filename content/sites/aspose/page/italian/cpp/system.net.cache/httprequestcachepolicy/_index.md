---
title: "classe System::Net::Cache::HttpRequestCachePolicy"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page per C++"
description: "classe System::Net::Cache::HttpRequestCachePolicy. Politica di cache HTTP che esprime la semantica di caching HTTP RFC2616. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Politica di cache HTTP che esprime la semantica di caching HTTP RFC2616. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarla alle funzioni come argomento.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Restituisce l'ora in cui le risorse memorizzate nella cache devono essere rivaldate. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Restituisce l'ora in formato UTC in cui le risorse memorizzate nella cache devono essere rivaldate. Solo per uso interno. |
| [get_Level](./get_level/)() const | Informazioni RTTI. |
| [get_MaxAge](./get_maxage/)() const | Restituisce l'età massima consentita per una risorsa. |
| [get_MaxStale](./get_maxstale/)() const | Restituisce il valore massimo di obsolescenza consentito per una risorsa. |
| [get_MinFresh](./get_minfresh/)() const | Restituisce l'età minima consentita per una risorsa. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Crea una nuova istanza. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Crea una nuova istanza. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Crea una nuova istanza. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Crea una nuova istanza. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Crea una nuova istanza. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
