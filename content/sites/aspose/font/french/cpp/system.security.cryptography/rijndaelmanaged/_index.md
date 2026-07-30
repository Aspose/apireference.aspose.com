---
title: "classe System::Security::Cryptography::RijndaelManaged"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::RijndaelManaged. Algorithme Rijndael géré. Prend en charge uniquement les modes ECB et CFB avec un remplissage None et le mode CBC avec les remplissages None et Zeros. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 3100
url: /fr/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Algorithme [Rijndael](../rijndael/) géré. Prend en charge uniquement les modes ECB et CFB avec un remplissage None et le mode CBC avec les remplissages None et Zeros. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
