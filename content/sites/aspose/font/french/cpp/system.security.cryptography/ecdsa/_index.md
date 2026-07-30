---
title: "classe System::Security::Cryptography::ECDsa"
linktitle: "ECDsa"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::ECDsa. Classe de base pour les implémentations de l'algorithme ECDsa. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1300
url: /fr/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Classe de base pour les implémentations de l'algorithme [ECDsa](./) algorithm. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée une implémentation par défaut de l'algorithme ECDSA. |
| static [Create](./create/)(const ECCurve\&) | Crée une implémentation par défaut de l'algorithme ECDSA avec une clé nouvellement créée sur la courbe spécifiée. |
| static [Create](./create/)(const ECParameters\&) | Crée une implémentation par défaut de l'algorithme ECDSA en utilisant les paramètres spécifiés. |
| static [Create](./create/)(const String\&) | Crée l'implémentation spécifiée de l'algorithme ECDSA. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Exporte les paramètres explicites. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporte les paramètres nommés ou explicites. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Génère une nouvelle paire de clés publique/privée pour la courbe spécifiée. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informations RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Obtient l'algorithme de signature à utiliser. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importe tous les paramètres de la structure de données. |
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
* Library [Aspose.Font for C++](../../)
