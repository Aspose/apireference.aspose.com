---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method. Informasi RTTI dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


Informasi RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) untuk menghitung hash. |

### ReturnValue

Tanda tangan yang dihitung dalam bentuk array byte.
## Catatan


Membuat tanda tangan untuk data yang ditentukan.
## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Membuat tanda tangan untuk nilai hash yang ditentukan.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritma hash yang digunakan saat membuat tanda tangan. |

### ReturnValue

Tanda tangan yang dihitung dalam bentuk array byte.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
