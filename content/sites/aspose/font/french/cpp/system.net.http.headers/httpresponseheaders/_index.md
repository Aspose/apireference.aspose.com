---
title: "Classe System::Net::Http::Headers::HttpResponseHeaders"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::HttpResponseHeaders. Représente la collection des en‑têtes ''Response''. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Représente la collection des en‑têtes 'Response'. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Concatène l'instance HttpHeaders-class spécifiée avec celle actuelle. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Ajoute les en-têtes connus à la collection spécifiée. |
| [get_AcceptRanges](./get_acceptranges/)() | Informations RTTI. |
| [get_Age](./get_age/)() | Obtient la valeur de l’en‑tête 'Age'. |
| [get_CacheControl](./get_cachecontrol/)() | Obtient une valeur de l'en-tête 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Renvoie une valeur de l'en-tête 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Obtient une valeur qui indique si la valeur de l'en-tête 'Connection' contient 'Close'. |
| [get_Date](./get_date/)() | Obtient une valeur de l'en-tête 'Date'. |
| [get_ETag](./get_etag/)() | Obtient une valeur de l’en-tête 'ETag'. |
| [get_Location](./get_location/)() | Obtient la valeur de l’en‑tête 'Location'. |
| [get_Pragma](./get_pragma/)() | Renvoie une valeur de l'en-tête 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Renvoie la valeur de l’en‑tête 'Proxy-Authenticate'. |
| [get_RetryAfter](./get_retryafter/)() | Obtient la valeur de l’en‑tête 'Retry-After'. |
| [get_Server](./get_server/)() | Renvoie la valeur de l’en‑tête 'Server'. |
| [get_Trailer](./get_trailer/)() | Renvoie une valeur de l'en-tête 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Renvoie une valeur de l'en-tête 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Obtient une valeur qui indique si la valeur de l'en-tête 'Transfer-Encoding' contient 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Renvoie une valeur de l'en-tête 'Upgrade'. |
| [get_Vary](./get_vary/)() | Renvoie la valeur de l’en‑tête 'Vary'. |
| [get_Via](./get_via/)() | Renvoie une valeur de l'en-tête 'Via'. |
| [get_Warning](./get_warning/)() | Renvoie une valeur de l'en-tête 'Warning'. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Renvoie la valeur de l’en‑tête 'WWW-Authenticate'. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Construit une nouvelle instance. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Définit la valeur de l’en‑tête 'Age'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Définit une valeur de l'en-tête 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Définit une valeur qui indique si la valeur de l'en-tête 'Connection' contient 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'Date'. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Définit la valeur de l’en‑tête 'ETag'. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Définit la valeur de l’en‑tête 'Location'. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Définit la valeur de l’en‑tête 'Retry-After'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Définit une valeur qui indique si la valeur de l'en-tête 'Transfer-Encoding' contient 'Chunked'. |
## Voir aussi

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
