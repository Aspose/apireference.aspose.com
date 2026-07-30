---
title: "System::Web::Services::Protocols::HttpWebClientProtocol classe"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Font pour C++"
description: "Classe System::Web::Services::Protocols::HttpWebClientProtocol. Cette classe de base est utilisée dans tous les proxies client de services Web XML qui utilisent HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction `System::MakeObject()`. Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur `System::SmartPtr` et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Cette classe de base est utilisée dans tous les proxies client de services XML [Web](../../system.web/) qui utilisent HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Ajoute les cookies de la requête spécifiée au conteneur de cookies interne. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Obtient une valeur indiquant si le client suit les redirections du serveur. |
| [get_ClientCertificates](./get_clientcertificates/)() | Renvoie la collection des certificats client. |
| [get_CookieContainer](./get_cookiecontainer/)() | Obtient un conteneur utilisé pour stocker les cookies. |
| [get_EnableDecompression](./get_enabledecompression/)() | Obtient une valeur indiquant si la décompression est activée. |
| [get_Proxy](./get_proxy/)() | Obtient les informations du proxy. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Obtient une valeur indiquant si le partage de connexion est activé lorsque le client utilise l'authentification NTLM. |
| [get_UserAgent](./get_useragent/)() | Obtient une valeur de l'en-tête 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Définit une valeur indiquant si le client suit les redirections du serveur. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Définit un conteneur utilisé pour stocker les cookies. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Définit une valeur indiquant si la décompression est activée. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Définit les informations du proxy. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Définit une valeur indiquant si le partage de connexion est activé lorsque le client utilise l'authentification NTLM. |
| [set_UserAgent](./set_useragent/)(String) | Définit une valeur de l'en-tête 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Voir aussi

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
