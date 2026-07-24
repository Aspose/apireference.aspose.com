---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature metode"
linktitle: "VerifySignature"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature metode. Memverifikasi tanda tangan pada data dalam C++."
type: docs
weight: 300
url: /id/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Memverifikasi tanda tangan pada data.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) ditandatangani dengan **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Tanda tangan yang akan diverifikasi untuk data. |

### ReturnValue

Benar jika pemeriksaan tanda tangan berhasil, salah jika tidak.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Memverifikasi tanda tangan pada data. Tidak diimplementasikan.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritma yang digunakan untuk hashing. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Tanda tangan yang akan diverifikasi untuk data. |

### ReturnValue

Benar jika pemeriksaan tanda tangan berhasil, salah jika tidak.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
