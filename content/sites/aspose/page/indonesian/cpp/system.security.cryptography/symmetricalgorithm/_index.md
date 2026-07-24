---
title: "Kelas System::Security::Cryptography::SymmetricAlgorithm"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::SymmetricAlgorithm kelas. Algoritma simetris yang menggunakan kunci yang sama untuk enkripsi dan dekripsi sebagai kelas dasar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 4900
url: /id/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Algoritma simetris yang menggunakan kunci yang sama untuk enkripsi dan dekripsi sebagai kelas dasar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)(const String\&) | Membuat instance algoritma. |
| virtual [CreateDecryptor](./createdecryptor/)() | Membuat decryptor dengan parameter yang terkait dengan objek algoritma. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Membuat decryptor dengan parameter eksplisit. |
| virtual [CreateEncryptor](./createencryptor/)() | Membuat encryptor dengan parameter yang terkait dengan objek algoritma. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Membuat encryptor dengan parameter eksplisit. |
| virtual [GenerateIV](./generateiv/)() | Menghasilkan nilai awal acak untuk algoritma. Menimpa yang ada (jika ada). |
| virtual [GenerateKey](./generatekey/)() | Menghasilkan kunci acak untuk algoritma. Menimpa yang ada (jika ada). |
| virtual [get_BlockSize](./get_blocksize/)() | Mendapatkan ukuran blok operasi kriptografi. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Mendapatkan ukuran umpan balik operasi kriptografi. |
| virtual [get_IV](./get_iv/)() | Mendapatkan nilai awal operasi kriptografi. Membuat baru jika belum dibuat. |
| virtual [get_Key](./get_key/)() | Mendapatkan kunci operasi kriptografi. Membuat baru jika belum dibuat. |
| virtual [get_KeySize](./get_keysize/)() | Mendapatkan ukuran kunci operasi kriptografi. |
| virtual [get_Mode](./get_mode/)() | Mendapatkan mode operasi kriptografi. |
| virtual [get_Padding](./get_padding/)() | Mendapatkan padding operasi kriptografi. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Mengatur ukuran blok operasi kriptografi. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Mengatur ukuran umpan balik operasi kriptografi. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Mengatur nilai awal operasi kriptografi. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Mengatur kunci operasi kriptografi. |
| virtual [set_KeySize](./set_keysize/)(int) | Mengatur ukuran kunci operasi kriptografi. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Mengatur mode operasi kriptografi. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Mengatur padding operasi kriptografi. |
| [ValidKeySize](./validkeysize/)(int) | Memeriksa apakah ukuran kunci valid. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
