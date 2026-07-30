---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor metodo"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor metodo. Crea un oggetto decryptor con i parametri definiti dall'oggetto algorithm in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


Crea un oggetto decryptor con parametri definiti dall'oggetto algoritmo.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crea un oggetto decryptor con parametri espliciti.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Chiave di crittografia in forma di array di byte. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Valore iniziale in forma di array di byte. |

### ReturnValue

Oggetto decryptor appena creato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
