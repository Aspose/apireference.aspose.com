---
title: "System::Security::Cryptography::ECDsa class"
linktitle: "ECDsa"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::ECDsa class. Kelas dasar untuk implementasi algoritma ECDsa. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Kelas dasar untuk implementasi algoritma [ECDsa](./). Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)() | Membuat implementasi algoritma ECDSA default. |
| static [Create](./create/)(const ECCurve\&) | Membuat implementasi algoritma ECDSA default dengan kunci baru yang dibuat di atas kurva yang ditentukan. |
| static [Create](./create/)(const ECParameters\&) | Membuat implementasi algoritma ECDSA default menggunakan parameter yang ditentukan. |
| static [Create](./create/)(const String\&) | Membuat implementasi algoritma ECDSA yang ditentukan. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Mengekspor parameter eksplisit. |
| virtual [ExportParameters](./exportparameters/)(bool) | Mengekspor parameter bernama atau eksplisit. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Menghasilkan pasangan kunci publik/privat baru untuk kurva yang ditentukan. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informasi RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Mendapatkan algoritma tanda tangan yang akan digunakan. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Mengimpor semua parameter dari struktur data. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Menghitung tanda tangan dari nilai input yang ditentukan. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Memeriksa tanda tangan data. |
## Lihat Juga

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
