---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor metode"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor metode. Membuat objek dekripsi dengan parameter yang ditentukan oleh objek algoritma dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


Membuat objek dekripsi dengan parameter yang ditentukan oleh objek algoritma.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Membuat objek dekripsi dengan parameter eksplisit.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
