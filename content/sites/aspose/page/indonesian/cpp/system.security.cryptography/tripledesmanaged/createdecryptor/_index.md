---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor metode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor metode. Membuat objek decryptor dengan parameter yang ditentukan oleh objek algoritma dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


Membuat objek dekripsi dengan parameter yang ditentukan oleh objek algoritma.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Membuat objek dekripsi dengan parameter eksplisit.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Kunci enkripsi dalam bentuk array byte. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Nilai awal dalam bentuk array byte. |

### ReturnValue

Objek decryptor yang baru dibuat.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
