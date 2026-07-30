---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt méthode"
linktitle: "Chiffrer"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt méthode. Crypte les données d'entrée en utilisant le mode de remplissage spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Chiffre les données d'entrée en utilisant le mode de remplissage spécifié.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) tableau à chiffrer. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Mode de remplissage. |

### ReturnValue

Données chiffrées au format tableau d'octets.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Chiffre le message. Non implémenté.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) à crypter. |
| use_oaep | bool | Vrai pour utiliser le remplissage OAEP, faux pour utiliser le remplissage PKCS#1 v1.5. |

### ReturnValue

Tableau de données cryptées.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
