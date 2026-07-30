---
title: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor Methode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor Methode. Erstellt ein Entschlüsselungsobjekt mit den vom Algorithmusobjekt definierten Parametern in C++."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


Erstellt ein Entschlüsseler-Objekt mit Parametern, die vom Algorithmus-Objekt definiert werden.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Erstellt ein Entschlüsseler-Objekt mit expliziten Parametern.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
