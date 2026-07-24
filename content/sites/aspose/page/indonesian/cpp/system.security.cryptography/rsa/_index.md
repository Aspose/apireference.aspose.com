---
title: "System::Security::Cryptography::RSA kelas"
linktitle: "RSA"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSA kelas. Kelas dasar untuk implementasi algoritma RSA. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3400
url: /id/cpp/system.security.cryptography/rsa/
---
## RSA class


Kelas dasar untuk implementasi algoritma [RSA](./). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)() | Membuat implementasi algoritma [RSA](./) bawaan. |
| static [Create](./create/)(const String\&) | Membuat implementasi algoritma [RSA](./) bawaan. |
| static [Create](./create/)(int32_t) | Membuat implementasi algoritma [RSA](./) bawaan dengan ukuran kunci yang ditentukan. |
| static [Create](./create/)(const RSAParameters\&) | Membuat implementasi algoritma [RSA](./) bawaan dengan parameter yang ditentukan. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Membuat implementasi algoritma [RSA](./) default dengan parameter XML-encoded yang ditentukan. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Mendekripsi data masukan menggunakan mode padding yang ditentukan. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Mendekripsi nilai menggunakan kunci pribadi. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Mengenkripsi data masukan menggunakan mode padding yang ditentukan. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Mengenkripsi nilai menggunakan kunci pribadi. |
| virtual [ExportParameters](./exportparameters/)(bool) | Mengekspor semua parameter. |
| [FromXmlString](./fromxmlstring/)(String) override | Menginisialisasi objek menggunakan parameter XML-encoded. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Informasi RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Mendapatkan algoritma tanda tangan yang terkait dengan objek CSP. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Mengimpor semua parameter dari struktur data. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Menghitung nilai hash dari array data yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Menghitung nilai hash dari aliran biner yang ditentukan menggunakan algoritma hash dan padding yang ditentukan, serta menandatangani hasilnya. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Menghitung tanda tangan untuk nilai hash yang ditentukan. |
| [ToXmlString](./toxmlstring/)(bool) override | Mengekspor semua parameter dalam format XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Memverifikasi bahwa tanda tangan dari data yang ditentukan valid. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Memverifikasi bahwa tanda tangan dari aliran biner yang ditentukan valid. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Memverifikasi bahwa tanda tangan dari hash yang ditentukan valid. |
## Lihat Juga

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
