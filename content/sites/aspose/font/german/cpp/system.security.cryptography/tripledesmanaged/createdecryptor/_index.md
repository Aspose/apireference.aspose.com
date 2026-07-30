---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor-Methode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor-Methode. Erstellt ein Entschlüsselungsobjekt mit Parametern, die vom Algorithmusobjekt in C++ definiert werden."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


Erstellt ein Entschlüsseler-Objekt mit Parametern, die vom Algorithmus-Objekt definiert werden.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Erstellt ein Entschlüsseler-Objekt mit expliziten Parametern.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Verschlüsselungsschlüssel in Byte-Array-Form. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Initialwert in Byte-Array-Form. |

### ReturnValue

Neu erstelltes Entschlüsselungsobjekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
