---
title: "System::Security::Cryptography::RC2Managed classe"
linktitle: "RC2Managed"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::RC2Managed classe. Algorithme RC2 géré. Seuls les modes de chiffrement ECB, CFB et CBC sont pris en charge. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en argument en C++."
type: docs
weight: 2800
url: /fr/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Algorithme [RC2](../rc2/) géré. Seuls les modes de chiffrement ECB, CFB et CBC sont pris en charge. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en argument.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crée un objet déchiffreur avec des paramètres explicites. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crée un objet déchiffreur avec des paramètres définis par l'objet algorithme. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Crée un objet chiffreur avec des paramètres explicites. |
| virtual [CreateEncryptor](./createencryptor/)() | Crée un objet chiffreur avec des paramètres définis par l'objet algorithme. |
| [GenerateIV](./generateiv/)() override | Crée une valeur initiale aléatoire et la stocke dans les internes de l'algorithme. |
| [GenerateKey](./generatekey/)() override | Crée une clé aléatoire et la stocke dans les internes de l'algorithme. |
## Voir aussi

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
