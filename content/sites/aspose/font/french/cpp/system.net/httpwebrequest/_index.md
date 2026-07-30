---
title: "System::Net::HttpWebRequest classe"
linktitle: "HttpWebRequest"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::HttpWebRequest. Représente la requête web HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


Représente la requête web HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Abort](./abort/)() override | Interrompt la requête en cours. |
| virtual [AddRange](./addrange/)(int32_t) | Ajoute l'en-tête 'Range' à la requête en cours. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Ajoute l'en-tête 'Range' à la requête en cours. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initie une opération asynchrone pour obtenir un flux afin d'écrire des données vers la ressource. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Initie une requête asynchrone pour la ressource. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Attend que l'opération asynchrone spécifiée pour obtenir un flux se termine. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Attend que la requête asynchrone spécifiée pour la ressource se termine. |
| [get_Accept](./get_accept/)() | Obtient la valeur de l'en-tête HTTP 'Accept'. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | Obtient une valeur indiquant si la requête doit suivre les redirections. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Obtient une valeur indiquant si les données reçues de la ressource doivent être mises en mémoire tampon. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Obtient une valeur indiquant si la mise en mémoire tampon est activée pour l'envoi de données. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Obtient la collection des certificats associés à la requête en cours. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Obtient le nom du groupe de connexion. |
| [get_ContentLength](./get_contentlength/)() override | Obtient le nombre d'octets des données de la requête à envoyer. |
| [get_ContentType](./get_contenttype/)() override | Obtient le type MIME de la requête. |
| [get_ContinueTimeout](./get_continuetimeout/)() | Obtient un délai d'attente pour attendre la réception du code d'état 100-Continue. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Obtient un conteneur de cookies associé à la requête web en cours. |
| [get_Credentials](./get_credentials/)() override | Obtient les informations d'authentification associées à la requête en cours. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Renvoie une valeur indiquant si une réponse est reçue. |
| [get_Headers](./get_headers/)() override | Obtient la collection des en-têtes HTTP. |
| virtual [get_KeepAlive](./get_keepalive/)() | Obtient une valeur indiquant si la requête en cours doit contenir l'en-tête 'Keep-Alive'. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | Obtient le nombre maximal de redirections autorisées. |
| [get_Method](./get_method/)() override | Obtient la méthode HTTP. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | Obtient une valeur indiquant si la requête doit être pré-authentifiée. |
| [get_Proxy](./get_proxy/)() override | Obtient le proxy HTTP. |
| virtual [get_Referer](./get_referer/)() | Obtient une valeur de l'en-tête 'Referer'. |
| [get_RequestUri](./get_requesturi/)() override | Renvoie l'URI de la requête. |
| virtual [get_SendChunked](./get_sendchunked/)() | Obtient une valeur indiquant si les données doivent être envoyées en segments. |
| [get_ServicePoint](./get_servicepoint/)() | Renvoie un point de service qui représente la connexion réseau à la ressource. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Renvoie une valeur indiquant si la requête actuelle peut utiliser un conteneur de cookies. |
| [get_Timeout](./get_timeout/)() override | Obtient une durée en millisecondes après laquelle la requête expirera. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | Obtient une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | Obtient une valeur de l'en-tête 'User-Agent'. |
| [GetRequestStream](./getrequeststream/)() override | Renvoie le flux pour écrire des données vers la ressource. |
| [GetResponse](./getresponse/)() override | Renvoie la réponse web associée à la requête web actuelle. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Construit une nouvelle instance. |
| [set_Accept](./set_accept/)(String) | Définit la valeur de l'en-tête HTTP 'Accept'. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Définit une valeur indiquant si la requête doit suivre les redirections. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Définit une valeur indiquant si les données reçues de la ressource doivent être mises en mémoire tampon. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Définit une valeur indiquant si la mise en mémoire tampon est activée pour l'envoi de données. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Définit la collection des certificats associés à la requête actuelle. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Définit le nom du groupe de connexion. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Définit le nombre d'octets des données de la requête à envoyer. |
| [set_ContentType](./set_contenttype/)(String) override | Définit le type MIME de la requête. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | Définit un délai d'attente jusqu'à la réception du code d'état 100-Continue. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Définit un conteneur de cookies associé à la requête web actuelle. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Définit les informations d'authentification associées à la requête actuelle. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Définit la collection des en-têtes HTTP. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Définit une valeur indiquant si la requête actuelle doit contenir l'en-tête 'Keep-Alive'. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | Définit un nombre maximal de redirections autorisées. |
| [set_Method](./set_method/)(String) override | Définit la méthode HTTP. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | Définit une valeur indiquant si la requête doit être pré-authentifiée. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | Informations RTTI. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | Définit le proxy HTTP. |
| virtual [set_Referer](./set_referer/)(System::String) | Définit une valeur de l'en-tête 'Referer'. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Définit une valeur indiquant si les données doivent être envoyées en segments. |
| [set_Timeout](./set_timeout/)(int) override | Définit une durée en millisecondes après laquelle la requête expirera. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | Définit une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | Définit une valeur de l'en-tête 'User-Agent'. |
## Voir aussi

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
