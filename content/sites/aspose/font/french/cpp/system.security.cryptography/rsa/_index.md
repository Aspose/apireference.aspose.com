---
title: "Classe System::Security::Cryptography::RSA"
linktitle: "RSA"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::RSA. Classe de base pour les implémentations de l'algorithme RSA. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3400
url: /fr/cpp/system.security.cryptography/rsa/
---
## RSA class


Classe de base pour les implémentations de l'algorithme [RSA](./). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Create](./create/)() | Crée l'implémentation par défaut de [RSA](./) aglorithm. |
| static [Create](./create/)(const String\&) | Crée l'implémentation par défaut de l'algorithme [RSA](./). |
| static [Create](./create/)(int32_t) | Crée l'implémentation par défaut de l'algorithme [RSA](./) avec la taille de clé spécifiée. |
| static [Create](./create/)(const RSAParameters\&) | Crée l'implémentation par défaut de l'algorithme [RSA](./) avec les paramètres spécifiés. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Crée l'implémentation par défaut de l'algorithme [RSA](./) avec les paramètres encodés en XML spécifiés. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Déchiffre les données d'entrée en utilisant le mode de remplissage spécifié. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Déchiffre la valeur en utilisant la clé privée. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Chiffre les données d'entrée en utilisant le mode de remplissage spécifié. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Chiffre la valeur en utilisant la clé privée. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporte tous les paramètres. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialise l'objet en utilisant les paramètres encodés en XML. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informations RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Obtient l'algorithme de signature associé à l'objet CSP. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Importe tous les paramètres de la structure de données. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, et signe le résultat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, et signe le résultat. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, puis signe le résultat. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Calcule la signature pour la valeur de hachage spécifiée. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporte tous les paramètres au format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Vérifie que la signature du hachage spécifié est valide. |
## Voir aussi

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
