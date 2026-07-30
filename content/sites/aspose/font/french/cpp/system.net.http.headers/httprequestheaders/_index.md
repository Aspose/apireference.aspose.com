---
title: "System::Net::Http::Headers::HttpRequestHeaders classe"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::HttpRequestHeaders classe. Représente la collection des en-têtes ''Request''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Représente la collection des en-têtes 'Request'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Concatène l'instance HttpHeaders-class spécifiée avec celle actuelle. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Ajoute les en-têtes connus à la collection spécifiée. |
| [get_Accept](./get_accept/)() | Informations RTTI. |
| [get_AcceptCharset](./get_acceptcharset/)() | Renvoie une valeur de l'en-tête 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Renvoie une valeur de l'en-tête 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Renvoie une valeur de l'en-tête 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | Obtient une valeur de l'en-tête 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | Obtient une valeur de l'en-tête 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Renvoie une valeur de l'en-tête 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Obtient une valeur qui indique si la valeur de l'en-tête 'Connection' contient 'Close'. |
| [get_Date](./get_date/)() | Obtient une valeur de l'en-tête 'Date'. |
| [get_Expect](./get_expect/)() | Renvoie la valeur de l'en-tête 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | Obtient une valeur qui indique si la valeur de l'en-tête 'Expect' contient 'Continue'. |
| [get_From](./get_from/)() | Obtient une valeur de l'en-tête 'From'. |
| [get_Host](./get_host/)() | Obtient une valeur de l'en-tête 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | Renvoie une valeur de l'en-tête 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Obtient une valeur de l'en-tête 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Renvoie une valeur de l'en-tête 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | Obtient une valeur de l'en-tête 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Obtient une valeur de l'en-tête 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | Obtient une valeur de l'en-tête 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | Renvoie une valeur de l'en-tête 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Obtient une valeur de l'en-tête 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | Obtient une valeur de l'en-tête 'Range'. |
| [get_Referrer](./get_referrer/)() | Obtient une valeur de l'en-tête 'Referer'. |
| [get_TE](./get_te/)() | Renvoie une valeur de l'en-tête 'TE'. |
| [get_Trailer](./get_trailer/)() | Renvoie une valeur de l'en-tête 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Renvoie une valeur de l'en-tête 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Obtient une valeur qui indique si la valeur de l'en-tête 'Transfer-Encoding' contient 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Renvoie une valeur de l'en-tête 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | Renvoie une valeur de l'en-tête 'User-Agent'. |
| [get_Via](./get_via/)() | Renvoie une valeur de l'en-tête 'Via'. |
| [get_Warning](./get_warning/)() | Renvoie une valeur de l'en-tête 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | Construit une nouvelle instance. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Définit une valeur de l'en-tête 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Définit une valeur de l'en-tête 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Définit une valeur qui indique si la valeur de l'en-tête 'Connection' contient 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Définit une valeur qui indique si la valeur de l'en-tête 'Expect' contient 'Continue'. |
| [set_From](./set_from/)(String) | Définit une valeur de l'en-tête 'From'. |
| [set_Host](./set_host/)(String) | Définit une valeur de l'en-tête 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Définit une valeur de l'en-tête 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Définit une valeur de l'en-tête 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Définit une valeur de l'en-tête 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Définit une valeur de l'en-tête 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Définit une valeur de l'en-tête 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Définit une valeur qui indique si la valeur de l'en-tête 'Transfer-Encoding' contient 'Chunked'. |
## Voir aussi

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
