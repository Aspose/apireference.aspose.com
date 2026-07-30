---
title: "Classe System::Net::WebProxy"
linktitle: "WebProxy"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::WebProxy. Représente un serveur proxy web http. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3700
url: /fr/cpp/system.net/webproxy/
---
## WebProxy class


Représente un serveur proxy web http. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Address](./get_address/)() | Obtient l'adresse du serveur proxy actuel. |
| [get_BypassList](./get_bypasslist/)() | Obtient la liste des adresses qui n'utilisent pas le serveur proxy. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Obtient une valeur indiquant si le serveur proxy doit être utilisé pour les adresses locales. |
| virtual [get_Credentials](./get_credentials/)() | Obtient les informations d'identification qui sont envoyées au serveur proxy pour l'authentification. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Obtient une valeur indiquant si les informations d'identification par défaut doivent être envoyées avec les requêtes. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Renvoie le proxy qui utilise les paramètres non dynamiques d'Internet Explorer. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Renvoie l'URI proxy pour une requête web. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Vérifie si le serveur proxy n'est pas utilisé pour l'URI spécifié. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Définit l'adresse du serveur proxy actuel. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Définit la liste des adresses qui n'utilisent pas le serveur proxy. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Définit une valeur indiquant si le serveur proxy doit être utilisé pour les adresses locales. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Définit les informations d'identification qui sont envoyées au serveur proxy pour l'authentification. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Définit une valeur indiquant si les informations d'identification par défaut doivent être envoyées avec les requêtes. |
| [WebProxy](./webproxy/)() | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(String, int32_t) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(String) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(String, bool) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Construit une nouvelle instance. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Construit une nouvelle instance. |
## Voir aussi

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
