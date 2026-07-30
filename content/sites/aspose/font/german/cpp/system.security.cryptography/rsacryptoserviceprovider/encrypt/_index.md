---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt Methode"
linktitle: "Encrypt"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt Methode. Verschlüsselt Eingabedaten mit dem angegebenen Auffüllmodus in C++."
type: docs
weight: 400
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Verschlüsselt Eingabedaten mit dem angegebenen Auffüllmodus.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) Array zum Verschlüsseln. |
| Padding | SharedPtr\<RSAEncryptionPadding\> | Padding-Modus. |

### ReturnValue

Verschlüsselte Daten im Byte-Array-Format.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Verschlüsselt Nachricht. Nicht implementiert.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) zum Verschlüsseln. |
| use_oaep | bool | True, um OAEP-Padding zu verwenden, false, um PKCS#1 v1.5-Padding zu verwenden. |

### ReturnValue

Verschlüsseltes Datenarray.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
