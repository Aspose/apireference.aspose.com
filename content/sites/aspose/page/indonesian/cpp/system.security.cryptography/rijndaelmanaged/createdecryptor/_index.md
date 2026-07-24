---
title: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor metode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor metode. Membuat objek decryptor dengan parameter yang ditentukan oleh objek algoritma dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


Membuat objek dekripsi dengan parameter yang ditentukan oleh objek algoritma.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Membuat objek dekripsi dengan parameter eksplisit.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
