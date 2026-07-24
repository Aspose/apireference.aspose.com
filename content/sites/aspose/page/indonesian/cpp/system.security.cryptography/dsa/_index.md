---
title: "Kelas System::Security::Cryptography::DSA"
linktitle: "DSA"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::DSA. Kelas dasar untuk implementasi algoritma DSA. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.security.cryptography/dsa/
---
## DSA class


Kelas dasar untuk implementasi algoritma [DSA](./). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)() | Membuat implementasi algoritma [DSA](./) default. |
| static [Create](./create/)(const String\&) | Membuat implementasi algoritma [DSA](./) default. |
| static [Create](./create/)(int32_t) | Membuat implementasi algoritma [DSA](./) default dengan ukuran kunci yang ditentukan. |
| static [Create](./create/)(const DSAParameters\&) | Membuat implementasi algoritma [DSA](./) default dengan parameter yang ditentukan. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Membuat implementasi algoritma [DSA](./) default dengan parameter yang dienkode XML yang ditentukan. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | Informasi RTTI. |
| virtual [ExportParameters](./exportparameters/)(bool) | Mengekspor semua parameter. |
| [FromXmlString](./fromxmlstring/)(String) override | Menginisialisasi objek menggunakan parameter XML-encoded. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Mengimpor semua parameter dari struktur data. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash yang ditentukan, dan menandatangani hasilnya. |
| [ToXmlString](./toxmlstring/)(bool) override | Mengekspor semua parameter dalam format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Verifikasi tanda tangan [DSA](./) untuk data yang ditentukan. |
## Lihat Juga

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
