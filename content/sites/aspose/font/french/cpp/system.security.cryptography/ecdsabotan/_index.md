---
title: "System::Security::Cryptography::ECDsaBotan classe"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::ECDsaBotan. Algorithme ECDsa sous forme Botan. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Constructeur. Utilise les paramètres par défaut. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Constructeur. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Constructeur. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Constructeur. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Constructeur. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Constructeur. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Exporte les paramètres explicites. |
| [ExportParameters](./exportparameters/)(bool) override | Exporte les paramètres nommés ou explicites. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialise l'objet en utilisant des paramètres encodés en XML. Non implémenté. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Initialise l'objet en utilisant des paramètres encodés en XML. Non implémenté. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Génère une nouvelle paire de clés publique/privée pour la courbe spécifiée. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Obtient l'algorithme de hachage. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Importe tous les paramètres de la structure de données. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Définit l'algorithme de hachage. |
| [set_KeySize](./set_keysize/)(int32_t) override | Définit la taille de la clé. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Calcule la valeur de hachage du tableau de données spécifié, puis signe le résultat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Calcule la valeur de hachage du tableau de données spécifié, puis signe le résultat. |
| [SignData](./signdata/)(const StreamPtr\&) | Calcule la valeur de hachage du flux binaire spécifié, puis signe le résultat. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informations RTTI. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informations RTTI. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informations RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Calcule la signature de la valeur d'entrée spécifiée. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporte tous les paramètres au format XML. Non implémenté. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Exporte tous les paramètres au format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Vérifie la signature des données. |
## Voir aussi

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
