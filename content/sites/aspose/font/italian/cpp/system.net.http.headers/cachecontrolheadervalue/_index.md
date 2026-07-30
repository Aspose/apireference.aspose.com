---
title: "System::Net::Http::Headers::CacheControlHeaderValue class"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue class. Rappresenta un valore dell'intestazione ''Cache-Control''. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Rappresenta un valore dell'intestazione 'Cache-Control'. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Crea una nuova istanza. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Extensions](./get_extensions/)() | Restituisce la collezione dei token cache-extension. |
| [get_MaxAge](./get_maxage/)() | Restituisce il valore di max‑age in secondi che determina il periodo durante il quale il client accetterà una risposta. |
| [get_MaxStale](./get_maxstale/)() | Restituisce il valore che determina se il client accetterà le risposte scadute. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Restituisce il valore in secondi che determina il periodo durante il quale il client accetterà le risposte scadute. |
| [get_MinFresh](./get_minfresh/)() | Restituisce il valore che determina la durata della freschezza. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Ottiene il valore che determina se il server richiede la rivalutazione di una voce della cache quando diventa obsoleta. |
| [get_NoCache](./get_nocache/)() | Informazioni RTTI. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Ottiene la raccolta dei nomi dei campi nella direttiva 'no-cache' nell'intestazione 'Cache-Control'. |
| [get_NoStore](./get_nostore/)() | Ottiene il valore che determina se una cache non deve memorizzare alcuna parte di una richiesta o risposta HTTP. |
| [get_NoTransform](./get_notransform/)() | Ottiene il valore che determina se una cache o un proxy non devono modificare alcuna parte del corpo dell'entità. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Ottiene il valore che determina se il client deve utilizzare solo voci memorizzate nella cache. |
| [get_Private](./get_private/)() | Ottiene il valore che determina se il messaggio di risposta HTTP o una sua parte è destinato a un singolo utente e non deve essere memorizzato da una cache condivisa. |
| [get_PrivateHeaders](./get_privateheaders/)() | Ottiene la raccolta dei nomi dei campi nella direttiva 'private' nell'intestazione 'Cache-Control'. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Ottiene il valore che determina se il server richiede la rivalutazione di una voce della cache quando diventa obsoleta per le cache condivise degli agenti utente. |
| [get_Public](./get_public/)() | Ottiene il valore che determina se una risposta HTTP può essere memorizzata da qualsiasi cache. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Ottiene il valore di età massima condivisa in secondi che sovrascrive la direttiva 'max-age' nell'intestazione 'Cache-Control' o l'intestazione 'Expires' per una cache condivisa. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Imposta il valore di età massima in secondi che determina il periodo durante il quale il client accetterà una risposta. |
| [set_MaxStale](./set_maxstale/)(bool) | Imposta il valore che determina se il client accetterà le risposte scadute. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Imposta il valore in secondi che determina il periodo durante il quale il client accetterà le risposte scadute. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Imposta il valore che determina la durata della freschezza. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Imposta il valore che determina se il server richiede la rivalutazione di una voce della cache quando diventa obsoleta. |
| [set_NoCache](./set_nocache/)(bool) | Imposta il valore che determina se il client accetterà una risposta memorizzata nella cache. |
| [set_NoStore](./set_nostore/)(bool) | Imposta il valore che determina se una cache non deve memorizzare alcuna parte di una richiesta o risposta HTTP. |
| [set_NoTransform](./set_notransform/)(bool) | Imposta il valore che determina se una cache o un proxy non devono modificare alcuna parte del corpo dell'entità. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Imposta il valore che determina se il client deve utilizzare solo voci memorizzate nella cache. |
| [set_Private](./set_private/)(bool) | Imposta il valore che determina se il messaggio di risposta HTTP o una sua parte è destinato a un singolo utente e non deve essere memorizzato da una cache condivisa. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Imposta il valore che determina se il server richiede la rivalutazione di una voce della cache quando diventa obsoleta per le cache condivise degli agenti utente. |
| [set_Public](./set_public/)(bool) | Imposta il valore che determina se una risposta HTTP può essere memorizzata da qualsiasi cache. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Imposta il valore di età massima condivisa in secondi che sovrascrive la direttiva 'max-age' nell'intestazione 'Cache-Control' o l'intestazione 'Expires' per una cache condivisa. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Tenta di convertire una stringa fornita in un'istanza della classe [CacheControlHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
