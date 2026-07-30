---
title: "classe System::Security::Cryptography::RandomNumberGenerator"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::RandomNumberGenerator. Classe abstraite dont les générateurs de nombres aléatoires doivent hériter. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2600
url: /fr/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Classe abstraite dont les générateurs de nombres aléatoires doivent hériter. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée une instance de l'implémentation par défaut d'un générateur de nombres aléatoires cryptographique pouvant être utilisé pour générer des données aléatoires. Non implémenté. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Remplit les éléments existants du tableau avec des octets aléatoires. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Remplit la tranche existante du tableau avec des octets aléatoires. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Remplit les éléments de la vue du tableau existante avec des octets aléatoires. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Remplit la tranche de la vue du tableau existante avec des octets aléatoires. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Remplit les éléments du tableau empilé existant avec des octets aléatoires. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Remplit la tranche du tableau empilé existant avec des octets aléatoires. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Remplit les éléments existants du tableau avec des octets aléatoires non nuls. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Remplit les éléments de la vue du tableau existante avec des octets aléatoires non nuls. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Remplit les éléments du tableau empilé existant avec des octets aléatoires non nuls. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
