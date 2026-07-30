---
title: "System::Net::Http::HttpRequestMessage classe"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::HttpRequestMessage classe. Représente un message de requête HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Représente un message de requête HTTP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Libère l'instance actuelle. Cette méthode libère également le contenu de la requête HTTP. |
| [get_Content](./get_content/)() | Obtient le contenu de la requête HTTP. |
| [get_Headers](./get_headers/)() | Renvoie les en-têtes de contenu HTTP. |
| [get_Method](./get_method/)() | Obtient la méthode de la requête HTTP. |
| [get_Properties](./get_properties/)() | Renvoie la collection des propriétés de la requête HTTP. |
| [get_RequestUri](./get_requesturi/)() | Obtient l'URI de la ressource demandée. |
| [get_Version](./get_version/)() | Informations RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | Construit une nouvelle instance. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Construit une nouvelle instance. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Construit une nouvelle instance. |
| [MarkAsSent](./markassent/)() | Marque la requête actuelle comme envoyée. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Définit le contenu de la requête HTTP. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Définit la méthode de la requête HTTP. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Définit l'URI de la ressource demandée. |
| [set_Version](./set_version/)(System::Version) | Définit la version HTTP. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
