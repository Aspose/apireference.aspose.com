---
title: "Metodo System::Security::Cryptography::RSACryptoServiceProvider::Decrypt"
linktitle: "Decrypt"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::RSACryptoServiceProvider::Decrypt. Decifra i dati di input usando la modalità di padding specificata in C++."
type: docs
weight: 200
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Decripta i dati di input usando la modalità di padding specificata.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) array da decrittare. |
| padding | SharedPtr\<RSAEncryptionPadding\> | Modalità di padding. |

### ReturnValue

Dati decrittati in formato array di byte.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Decripta il messaggio. Non implementato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) da decifrare. |
| use_oaep | bool | True per usare il padding OAEP, false per usare il padding PKCS#1 v1.5. |

### ReturnValue

Array di dati decifrati.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
