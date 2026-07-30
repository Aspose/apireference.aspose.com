---
title: "Classe System::Security::Cryptography::HashAlgorithm"
linktitle: "HashAlgorithm"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::HashAlgorithm. Classe de base pour les algorithmes de hachage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1600
url: /fr/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Classe de base pour les algorithmes de hachage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Calcule le hachage du tampon. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Calcule le hachage d'une tranche du tampon. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Lit le flux jusqu'à la fin et calcule le hachage des données lues. |
| static [Create](./create/)(const String\&) | Crée un algorithme de hachage basé sur le nom. |
| virtual [get_Hash](./get_hash/)() | Obtient la valeur du code de hachage calculé. |
| virtual [get_HashSize](./get_hashsize/)() | Obtient la taille de la valeur de hachage calculée en octets. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Taille du bloc d'entrée. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Taille du bloc de sortie. |
| virtual [Initialize](./initialize/)() | Réinitialise le hachage à son état initial. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Traite un bloc de données et copie les données dans le tableau de sortie. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Traite le dernier bloc de données et calcule le hachage. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Destructeur. |
## Voir aussi

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
