---
title: "System::Net::CredentialCache classe"
linktitle: "CredentialCache"
second_title: "Aspose.Font pour C++"
description: "System::Net::CredentialCache classe. Fournit le stockage des informations d'identification. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.net/credentialcache/
---
## CredentialCache class


Fournit le stockage des informations d'identification. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | Ajoute les informations d'identification réseau spécifiées au cache. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | Ajoute les informations d'identification réseau spécifiées au cache. |
| [CredentialCache](./credentialcache/)() | Construit une nouvelle instance. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | Informations RTTI. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | Renvoie les informations d'identification réseau de l'utilisateur ou de l'application actuelle. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | Renvoie les informations d'identification pour le préfixe URI spécifié et le type d'authentification. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | Renvoie les informations d'identification pour le nom d'hôte, le port et le type d'authentification spécifiés. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | Supprime les informations d'identification réseau pour le préfixe URI spécifié et le type d'authentification. |
| [Remove](./remove/)(String, int32_t, String) | Supprime les informations d'identification réseau pour le nom d'hôte, le port et le type d'authentification spécifiés. |
## Voir aussi

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
