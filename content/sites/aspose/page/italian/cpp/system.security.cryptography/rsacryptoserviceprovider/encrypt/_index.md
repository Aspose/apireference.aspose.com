---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metodo"
linktitle: "Cifra"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt metodo. Cifra i dati di input usando la modalità di padding specificata in C++."
type: docs
weight: 400
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Cripta i dati di input utilizzando la modalità di padding specificata.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | ByteArrayPtr | Array di [Byte](../../../system/byte/) da cifrare. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Modalità di padding. |

### ReturnValue

Dati cifrati in formato array di byte.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Cripta il messaggio. Non implementato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) da cifrare. |
| use_oaep | bool | True per usare il padding OAEP, false per usare il padding PKCS#1 v1.5. |

### ReturnValue

Array di dati cifrati.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
