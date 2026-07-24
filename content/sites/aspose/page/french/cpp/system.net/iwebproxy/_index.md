---
title: "Classe System::Net::IWebProxy"
linktitle: "IWebProxy"
second_title: "Aspose.Page pour C++"
description: "Classe System::Net::IWebProxy. Cette interface est utilisée pour implémenter l'accès via proxy à la classe WebRequest. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2700
url: /fr/cpp/system.net/iwebproxy/
---
## IWebProxy class


Cette interface est utilisée pour implémenter l'accès via proxy à la classe [WebRequest](../webrequest/). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class IWebProxy : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | Informations RTTI. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Renvoie l'URI du proxy. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Renvoie une valeur indiquant si le proxy ne doit pas être utilisé pour l'hôte spécifié. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Définit les informations d'identification pour l'authentification sur le serveur proxy. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
