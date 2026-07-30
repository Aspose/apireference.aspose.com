---
title: "System::Net::Http::HttpClientHandler classe"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::HttpClientHandler classe. Représente le gestionnaire de messages par défaut utilisé par la classe HttpClient. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Représente le gestionnaire de messages par défaut utilisé par la classe [HttpClient](../httpclient/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [get_CookieContainer](./get_cookiecontainer/)() | Obtient le conteneur de cookies utilisé pour stocker les cookies du serveur. |
| [get_Credentials](./get_credentials/)() | Obtient les informations d'authentification. |
| [HttpClientHandler](./httpclienthandler/)() | Informations RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | Informations RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Définit le conteneur de cookies utilisé pour stocker les cookies du serveur. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Définit les informations d'authentification. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Définit les informations du proxy. |
| [set_Timeout](./set_timeout/)(int32_t) | Obtient une durée en millisecondes après laquelle la requête expirera. |
| [set_UseCookies](./set_usecookies/)(bool) | Définit la valeur indiquant si l'instance actuelle utilise le conteneur de cookies pour stocker les cookies du serveur et si l'instance utilise les cookies du serveur lors de l'envoi des requêtes. |
| [set_UseProxy](./set_useproxy/)(bool) | Définit la valeur indiquant si l'instance actuelle utilise le proxy pour envoyer les requêtes. |
## Voir aussi

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
