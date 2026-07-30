---
title: "System::Web::Services::Protocols::WebClientProtocol class"
linktitle: "WebClientProtocol"
second_title: "Aspose.Font pour C++"
description: "System::Web::Services::Protocols::WebClientProtocol classe. Cette classe de base est utilisée dans tous les proxies client de services Web XML qui ont été créés avec ASP.NET. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Cette classe de base est utilisée dans tous les proxies client de services [Web](../../system.web/) XML qui ont été créés avec ASP.NET. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Abort](./abort/)() | Annule la requête. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Obtient le nom du groupe de connexion. |
| [get_Credentials](./get_credentials/)() | Obtient les informations d'authentification. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Obtient une valeur indiquant si l'authentification préalable est activée. |
| [get_RequestEncoding](./get_requestencoding/)() | Obtient le codage utilisé pour effectuer les requêtes du client. |
| [get_Timeout](./get_timeout/)() | Obtient la durée d'attente avant l'expiration de la requête. |
| [get_Uri](./get_uri/)() | Obtient l'URI du service XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | Obtient l'URL du service XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Obtient une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Définit le nom du groupe de connexion. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Définit les informations d'authentification. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Définit une valeur indiquant si l'authentification préalable est activée. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Définit le codage utilisé pour effectuer les requêtes du client. |
| [set_Timeout](./set_timeout/)(int32_t) | Définit la durée d'attente avant l'expiration de la requête. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Définit l'URI du service XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | Définit l'URL du service XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Définit une valeur indiquant si la propriété 'Credential' est égale à la propriété 'DefaultCredentials'. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
