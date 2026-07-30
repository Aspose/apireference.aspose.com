---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection classe"
linktitle: "X509ExtensionCollection"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection classe. Collection d'objets d'extension. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.security.cryptography.x509certificates/x509extensioncollection/
---
## X509ExtensionCollection class


Collection d'objets d'extension. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class X509ExtensionCollection : public System::Collections::Generic::List<SharedPtr<X509Extension>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const | Accesseur. Non implémenté. |
| [idx_get](./idx_get/)(int) const override | Données RTTI. |
| [X509ExtensionCollection](./x509extensioncollection/)() | Construit une collection vide. |
## Voir aussi

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
