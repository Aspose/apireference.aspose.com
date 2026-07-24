---
title: "System::Security::Cryptography::ECDsa classe"
linktitle: "ECDsa"
second_title: "Aspose.Page pour C++"
description: "Classe System::Security::Cryptography::ECDsa. Classe de base pour les implémentations de l'algorithme ECDsa. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Classe de base pour les implémentations de l'algorithme [ECDsa](./). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée une implémentation d'ECDSA par défaut. |
| static [Create](./create/)(const ECCurve\&) | Crée une implémentation d'ECDSA par défaut avec une clé nouvellement créée sur la courbe spécifiée. |
| static [Create](./create/)(const ECParameters\&) | Crée une implémentation d'ECDSA par défaut en utilisant les paramètres spécifiés. |
| static [Create](./create/)(const String\&) | Crée l'implémentation d'ECDSA spécifiée. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Exporte les paramètres explicites. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporte les paramètres nommés ou explicites. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Génère une nouvelle paire de clés publique/privée pour la courbe spécifiée. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informations RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Obtient l'algorithme de signature à utiliser. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importe tous les paramètres depuis la structure de données. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Vérifie la signature des données. |
## Voir aussi

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
