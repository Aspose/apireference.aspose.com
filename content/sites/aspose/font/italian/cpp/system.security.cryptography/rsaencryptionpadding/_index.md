---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSAEncryptionPadding class. Modalità di padding e parametri per le operazioni di crittografia o decrittografia RSA in C++."
type: docs
weight: 3600
url: /it/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Modalità di padding e parametri per le operazioni di crittografia o decrittografia [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Crea [RSAEncryptionPadding](./) con modalità OAEP e algoritmo hash specificato. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Restituisce la modalità di padding. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Restituisce l'algoritmo hash utilizzato con OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Restituisce la modalità OAEP con algoritmo hash [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | Restituisce la modalità OAEP con algoritmo hash [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | Restituisce la modalità OAEP con algoritmo hash [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | Restituisce la modalità OAEP con algoritmo hash [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
