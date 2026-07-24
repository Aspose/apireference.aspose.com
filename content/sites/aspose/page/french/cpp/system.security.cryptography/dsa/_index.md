---
title: "Classe System::Security::Cryptography::DSA"
linktitle: "DSA"
second_title: "Aspose.Page pour C++"
description: "Classe System::Security::Cryptography::DSA. Classe de base pour les implémentations de l’algorithme DSA. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject() . Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.security.cryptography/dsa/
---
## DSA class


Classe de base pour les implémentations de l’algorithme [DSA](./). Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée une implémentation d’algorithme [DSA](./) par défaut. |
| static [Create](./create/)(const String\&) | Crée une implémentation d’algorithme [DSA](./) par défaut. |
| static [Create](./create/)(int32_t) | Crée une implémentation d’algorithme [DSA](./) par défaut avec une taille de clé spécifiée. |
| static [Create](./create/)(const DSAParameters\&) | Crée une implémentation d’algorithme [DSA](./) par défaut avec des paramètres spécifiés. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Crée une implémentation d'algorithme [DSA](./) par défaut avec des paramètres encodés en XML spécifiés. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | Informations RTTI. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporte tous les paramètres. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialise l’objet en utilisant des paramètres encodés en XML. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Importe tous les paramètres depuis la structure de données. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporte tous les paramètres au format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Vérifie la signature [DSA](./) pour les données spécifiées. |
## Voir aussi

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
