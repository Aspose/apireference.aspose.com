---
title: "System::Security::Cryptography::SymmetricAlgorithm classe"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::SymmetricAlgorithm classe. Algorithme symétrique utilisant la même clé pour le chiffrement et le déchiffrement, classe de base. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 4900
url: /fr/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Algorithme symétrique utilisant la même clé pour le chiffrement et le déchiffrement, classe de base. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)(const String\&) | Crée une instance d'algorithme. |
| virtual [CreateDecryptor](./createdecryptor/)() | Crée un déchiffreur avec les paramètres associés à l'objet algorithme. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Crée un déchiffreur avec des paramètres explicites. |
| virtual [CreateEncryptor](./createencryptor/)() | Crée un chiffreur avec les paramètres associés à l'objet algorithme. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Crée un encryptor avec des paramètres explicites. |
| virtual [GenerateIV](./generateiv/)() | Génère une valeur initiale aléatoire pour l'algorithme. Remplace celle existante (le cas échéant). |
| virtual [GenerateKey](./generatekey/)() | Génère une clé aléatoire pour l'algorithme. Remplace celle existante (le cas échéant). |
| virtual [get_BlockSize](./get_blocksize/)() | Obtient la taille du bloc de l'opération cryptographique. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Obtient la taille de rétroaction de l'opération cryptographique. |
| virtual [get_IV](./get_iv/)() | Obtient la valeur initiale de l'opération cryptographique. Crée une nouvelle si elle n'a pas encore été créée. |
| virtual [get_Key](./get_key/)() | Obtient la clé de l'opération cryptographique. Crée une nouvelle si elle n'a pas encore été créée. |
| virtual [get_KeySize](./get_keysize/)() | Obtient la taille de la clé de l'opération cryptographique. |
| virtual [get_Mode](./get_mode/)() | Obtient le mode de l'opération cryptographique. |
| virtual [get_Padding](./get_padding/)() | Obtient le remplissage de l'opération cryptographique. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Définit la taille du bloc de l'opération cryptographique. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Définit la taille de rétroaction de l'opération cryptographique. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Définit la valeur initiale de l'opération cryptographique. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Définit la clé de l'opération cryptographique. |
| virtual [set_KeySize](./set_keysize/)(int) | Définit la taille de la clé de l'opération cryptographique. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Définit le mode de l'opération cryptographique. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Définit le remplissage de l'opération cryptographique. |
| [ValidKeySize](./validkeysize/)(int) | Vérifie si la taille de la clé est valide. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
