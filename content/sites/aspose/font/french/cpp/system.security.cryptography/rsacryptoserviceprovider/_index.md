---
title: "classe System::Security::Cryptography::RSACryptoServiceProvider"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::RSACryptoServiceProvider. Algorithme RSA sous forme CSP. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 3500
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Déchiffre le message. Non implémenté. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Déchiffre les données d'entrée en utilisant le mode de remplissage spécifié. |
| [Dispose](./dispose/)() override | Libère les données associées à l'objet. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Chiffre le message. Non implémenté. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Chiffre les données d'entrée en utilisant le mode de remplissage spécifié. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exporte le blob contenant les informations sur la clé. Non implémenté. |
| [ExportParameters](./exportparameters/)(bool) override | Exporte les paramètres CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Obtient un objet [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Vérifie l'algorithme d'échange de clés associé à l'objet. |
| [get_KeySize](./get_keysize/)() override | Obtient la taille de la clé utilisée par l'algorithme. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Vérifie si la clé est persistée dans l'objet CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Vérifie si seule la clé publique est présente dans l'objet CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Obtient l'algorithme de signature associé à l'objet CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Vérifie si la clé persiste dans le magasin machine plutôt que dans le magasin utilisateur. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importe le blob contenant les informations sur la clé. Non implémenté. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Importe les paramètres CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | Informations RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Constructeur. Non implémenté. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Constructeur. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Constructeur. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Constructeur. Non implémenté. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Définit si la clé est persistée dans l'objet CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Définit si la clé persiste dans le magasin machine plutôt que dans le magasin utilisateur. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Calcule la signature pour la valeur de hachage spécifiée. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Calcule la signature de la valeur d'entrée spécifiée. Non implémenté. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Vérifie la signature des données. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Vérifie la signature des données. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Vérifie que la signature du hachage spécifié est valide. |
## Voir aussi

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
