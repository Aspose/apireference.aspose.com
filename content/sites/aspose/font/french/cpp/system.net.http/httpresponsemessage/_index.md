---
title: "System::Net::Http::HttpResponseMessage classe"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::HttpResponseMessage. Représente un message de réponse HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Représente un message de réponse HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Libère l'instance actuelle. Cette méthode libère également le contenu de la réponse HTTP. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Vérifie le code d'état. [HttpRequestException](../httprequestexception/) sera levée lorsque le code d'état n'appartient pas à la plage 2xx. |
| [get_Content](./get_content/)() const | Obtient le contenu de la réponse HTTP. |
| [get_Headers](./get_headers/)() const | Renvoie les en-têtes de contenu HTTP. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Vérifie si le code d'état indique que l'action demandée par le client a été reçue, comprise et acceptée. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Obtient la Reason-Phrase qui est envoyée par les serveurs avec le code d'état. |
| [get_RequestMessage](./get_requestmessage/)() const | Obtient le message de requête HTTP. |
| [get_StatusCode](./get_statuscode/)() const | Obtient le code d'état HTTP. |
| [get_Version](./get_version/)() const | Informations RTTI. |
| [HttpResponseMessage](./httpresponsemessage/)() | Construit une nouvelle instance. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Construit une nouvelle instance. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Définit le contenu de la réponse HTTP. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Définit la Reason-Phrase qui est envoyée par les serveurs avec le code d'état. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Définit le message de requête HTTP. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Définit le code d'état HTTP. |
| [set_Version](./set_version/)(System::Version) | Définit la version HTTP. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
