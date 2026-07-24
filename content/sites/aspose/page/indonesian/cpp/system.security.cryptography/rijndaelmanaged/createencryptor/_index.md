---
title: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metode"
linktitle: "CreateEncryptor"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metode. Membuat objek encryptor dengan parameter yang ditentukan oleh objek algoritma dalam C++."
type: docs
weight: 200
url: /id/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


Membuat objek enkripsi dengan parameter yang ditentukan oleh objek algoritma.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Membuat objek enkripsi dengan parameter eksplisit.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Kunci enkripsi dalam bentuk array byte. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Nilai awal dalam bentuk array byte. |

### ReturnValue

Objek encryptor yang baru dibuat.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
