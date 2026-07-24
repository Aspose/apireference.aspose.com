---
title: "Méthode System::Security::Cryptography::RSACryptoServiceProvider::Encrypt"
linktitle: "Encrypt"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Security::Cryptography::RSACryptoServiceProvider::Encrypt. Chiffre les données d'entrée en utilisant le mode de remplissage spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Crypte les données d’entrée en utilisant le mode de remplissage spécifié.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| data | ByteArrayPtr | Tableau de [Byte](../../../system/byte/) à chiffrer. |
| remplissage | SharedPtr\<RSAEncryptionPadding\> | Mode de remplissage. |

### ReturnValue

Données chiffrées au format tableau d'octets.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Chiffre le message. Non implémenté.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) à chiffrer. |
| use_oaep | bool | Vrai pour utiliser le remplissage OAEP, faux pour utiliser le remplissage PKCS#1 v1.5. |

### ReturnValue

Tableau de données chiffrées.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
