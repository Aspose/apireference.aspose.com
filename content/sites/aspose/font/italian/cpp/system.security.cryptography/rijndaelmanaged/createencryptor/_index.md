---
title: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metodo"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metodo. Crea un oggetto encryptor con i parametri definiti dall'oggetto algoritmo in C++."
type: docs
weight: 200
url: /it/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


Crea un oggetto encryptor con parametri definiti dall'oggetto algoritmo.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crea un oggetto encryptor con parametri espliciti.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Chiave di crittografia in forma di array di byte. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Valore iniziale in forma di array di byte. |

### ReturnValue

Oggetto encryptor appena creato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
