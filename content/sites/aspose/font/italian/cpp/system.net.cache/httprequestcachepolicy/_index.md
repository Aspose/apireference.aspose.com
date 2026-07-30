---
title: "System::Net::Cache::HttpRequestCachePolicy classe"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Font per C++"
description: "System::Net::Cache::HttpRequestCachePolicy classe. Politica di cache HTTP che esprime la semantica di caching HTTP RFC2616. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Politica di cache HTTP che esprime la semantica di caching HTTP RFC2616. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Ottiene l'ora in cui le risorse memorizzate nella cache devono essere rivalutate. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Ottiene l'ora in formato UTC in cui le risorse memorizzate nella cache devono essere rivalutate. Solo per uso interno. |
| [get_Level](./get_level/)() const | Informazioni RTTI. |
| [get_MaxAge](./get_maxage/)() const | Ottiene l'età massima consentita per una risorsa. |
| [get_MaxStale](./get_maxstale/)() const | Ottiene il valore massimo di obsolescenza consentito per una risorsa. |
| [get_MinFresh](./get_minfresh/)() const | Ottiene l'età minima consentita per una risorsa. |
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
* Library [Aspose.Font for C++](../../)
