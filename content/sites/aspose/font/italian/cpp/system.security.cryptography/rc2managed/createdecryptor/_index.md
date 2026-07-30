---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor metodo"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor metodo. Crea un oggetto decryptor con i parametri definiti dall'oggetto algoritmo in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


Crea un oggetto decryptor con parametri definiti dall'oggetto algoritmo.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Crea un oggetto decryptor con parametri espliciti.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
