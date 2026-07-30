---
title: "System::Security::Cryptography::TripleDESManaged classe"
linktitle: "TripleDESManaged"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::TripleDESManaged. Implémentation gérée de TripleDES. Prend uniquement en charge les modes ECB et CFB avec remplissage None et le mode CBC avec les remplissages None, Zeros et PKCS7. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 5200
url: /fr/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Implémentation gérée de [TripleDES](../tripledes/). Prend uniquement en charge les modes ECB et CFB avec remplissage None et le mode CBC avec les remplissages None, Zeros et PKCS7. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
