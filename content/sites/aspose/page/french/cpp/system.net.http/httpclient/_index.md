---
title: "Classe System::Net::Http::HttpClient"
linktitle: "HttpClient"
second_title: "Aspose.Page pour C++"
description: "Classe System::Net::Http::HttpClient. Représente une classe de base d'un client HTTP pour l'envoi de requêtes et la réception de réponses. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.net.http/httpclient/
---
## HttpClient class


Représente une classe de base d'un client HTTP pour l'envoi de requêtes et la réception de réponses. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Annule toutes les requêtes en attente. |
| [get_BaseAddress](./get_baseaddress/)() | Obtient l'adresse de base de la ressource utilisée pour l'envoi des requêtes. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | Informations RTTI. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Obtient le nombre maximal d'octets du contenu de la réponse. |
| [get_Timeout](./get_timeout/)() | Obtient la durée d'attente avant que la requête n'expire. |
| [HttpClient](./httpclient/)() | Construit une nouvelle instance. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Construit une nouvelle instance. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Construit une nouvelle instance. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Envoie la requête HTTP spécifiée. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Définit l'adresse de base de la ressource utilisée pour envoyer des requêtes. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Définit le nombre maximal d'octets du contenu de la réponse. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Définit la durée d'attente avant que la requête n'expire. |
## Voir aussi

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
