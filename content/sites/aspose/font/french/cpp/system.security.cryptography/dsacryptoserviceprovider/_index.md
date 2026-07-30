---
title: "Classe System::Security::Cryptography::DSACryptoServiceProvider"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::DSACryptoServiceProvider. Algorithme DSA sous forme CSP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Créer une signature [DSA](../dsa/) pour les données spécifiées. |
| [Dispose](./dispose/)() override | Libère les données associées à l'objet. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Constructeur. Utilise les paramètres par défaut. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Constructeur. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Constructeur. Non implémenté. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Constructeur. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Constructeur. Non implémenté. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exporte le blob contenant les informations sur la clé. Non implémenté. |
| [ExportParameters](./exportparameters/)(bool) override | Exporte les paramètres CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Obtient un objet [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Vérifie l'algorithme d'échange de clés associé à l'objet. |
| [get_KeySize](./get_keysize/)() override | Obtient la taille de la clé. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Vérifie si la clé est persistée dans l'objet CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Vérifie si seule la clé publique est présente dans l'objet CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Obtient l'algorithme de signature à utiliser. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Vérifie si la clé persiste dans le magasin machine plutôt que dans le magasin utilisateur. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importe le blob contenant les informations sur la clé. Non implémenté. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Importe tous les paramètres de la structure de données. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Définit si la clé est persistée dans l'objet CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Définit si la clé persiste dans le magasin machine plutôt que dans le magasin utilisateur. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Calcule la signature de la valeur d'entrée spécifiée. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Informations RTTI. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Informations RTTI. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Informations RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Calcule la signature de la valeur d'entrée spécifiée. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Vérifie la signature des données. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature des données spécifiées est valide. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Vérifie que la signature du flux binaire spécifié est valide. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Vérifie la signature des données. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Vérifier la signature [DSA](../dsa/) pour les données spécifiées. |
## Voir aussi

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
