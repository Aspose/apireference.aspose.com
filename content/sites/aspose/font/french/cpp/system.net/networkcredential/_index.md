---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Font pour C++"
description: "System::Net::NetworkCredential class. Fournit des informations d'identification pour les schémas d'authentification basés sur un mot de passe. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2900
url: /fr/cpp/system.net/networkcredential/
---
## NetworkCredential class


Fournit des informations d'identification pour les schémas d'authentification basés sur un mot de passe. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Domain](./get_domain/)() | Obtient le domaine qui vérifie les informations d'identification. |
| [get_Password](./get_password/)() | Obtient le mot de passe. |
| [get_UserName](./get_username/)() | Informations RTTI. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Renvoie les informations d'identification pour l'URI spécifié et le type d'authentification. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Renvoie les informations d'identification pour le nom d'hôte, le port et le type d'authentification spécifiés. |
| [NetworkCredential](./networkcredential/)() | Construit une nouvelle instance. |
| [NetworkCredential](./networkcredential/)(String, String) | Construit une nouvelle instance. |
| [NetworkCredential](./networkcredential/)(String, String, String) | Construit une nouvelle instance. |
| [set_Domain](./set_domain/)(String) | Définit le domaine qui vérifie les informations d'identification. |
| [set_Password](./set_password/)(String) | Définit le mot de passe. |
| [set_UserName](./set_username/)(String) | Définit le nom d'utilisateur. |
## Voir aussi

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
