---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt méthode"
linktitle: "Déchiffrer"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt méthode. Décrypte les données d'entrée en utilisant le mode de remplissage spécifié en C++."
type: docs
weight: 200
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Déchiffre les données d'entrée en utilisant le mode de remplissage spécifié.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) tableau à déchiffrer. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Mode de remplissage. |

### ReturnValue

Données déchiffrées au format tableau d'octets.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Déchiffre le message. Non implémenté.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) à déchiffrer. |
| use_oaep | bool | Vrai pour utiliser le remplissage OAEP, faux pour utiliser le remplissage PKCS#1 v1.5. |

### ReturnValue

Tableau de données décryptées.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
