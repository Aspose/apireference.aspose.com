---
title: "System::Net::WebRequest classe"
linktitle: "WebRequest"
second_title: "Aspose.Font pour C++"
description: "System::Net::WebRequest classe. Représente une requête web. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3800
url: /fr/cpp/system.net/webrequest/
---
## WebRequest class


Représente une requête web. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Abort](./abort/)() | Interrompt la requête en cours. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Initie une opération asynchrone pour obtenir un flux afin d'écrire des données vers la ressource. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Initie une requête asynchrone pour la ressource. |
| static [Create](./create/)(String) | Crée une nouvelle instance de la classe [WebRequest](./) en utilisant l'URI spécifié. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Crée une nouvelle instance de la classe [WebRequest](./) en utilisant l'URI spécifié. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Crée un descendant [WebRequest](./) pour le schéma d'URI spécifié. |
| static [CreateHttp](./createhttp/)(String) | Crée une nouvelle instance de la classe [WebRequest](./) en utilisant l'URI spécifié. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Crée une nouvelle instance de la classe [WebRequest](./) en utilisant l'URI spécifié. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Attend que la requête asynchrone spécifiée pour la ressource se termine. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Obtient la politique de cache. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Obtient le nom du groupe de connexion. |
| virtual [get_ContentLength](./get_contentlength/)() | Obtient le nombre d'octets des données de la requête à envoyer. |
| virtual [get_ContentType](./get_contenttype/)() | Obtient le type MIME de la requête. |
| virtual [get_Credentials](./get_credentials/)() | Obtient les informations d'authentification associées à la requête en cours. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Obtient le proxy HTTP global. |
| virtual [get_Headers](./get_headers/)() | Obtient la collection des en-têtes HTTP. |
| virtual [get_Method](./get_method/)() | Obtient la méthode HTTP. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | Obtient une valeur indiquant si la requête doit être pré-authentifiée. |
| static [get_PrefixList](./get_prefixlist/)() | Obtient la liste des préfixes. |
| virtual [get_Proxy](./get_proxy/)() | Obtient le proxy HTTP. |
| virtual [get_RequestUri](./get_requesturi/)() | Renvoie l'URI de la requête. |
| virtual [get_Timeout](./get_timeout/)() | Obtient une durée en millisecondes après laquelle la requête expirera. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Obtient une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | Renvoie le flux pour écrire des données vers la ressource. |
| virtual [GetResponse](./getresponse/)() | Renvoie la réponse web associée à la requête web actuelle. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Enregistre le descendant [WebRequest](./) pour l'URI spécifié. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Définit la politique de cache. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Définit le nom du groupe de connexion. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Définit le nombre d'octets des données de la requête à envoyer. |
| virtual [set_ContentType](./set_contenttype/)(String) | Définit le type MIME de la requête. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Définit les informations d'authentification associées à la requête actuelle. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Définit le proxy HTTP global. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | Définit la collection des en-têtes HTTP. |
| virtual [set_Method](./set_method/)(String) | Définit la méthode HTTP. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | Définit une valeur indiquant si la requête doit être pré-authentifiée. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Définit la liste des préfixes. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Définit le proxy HTTP. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | Définit une durée en millisecondes après laquelle la requête expirera. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Définit une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
