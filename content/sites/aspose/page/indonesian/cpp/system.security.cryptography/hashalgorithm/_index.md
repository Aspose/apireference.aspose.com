---
title: "System::Security::Cryptography::HashAlgorithm class"
linktitle: "HashAlgorithm"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::HashAlgorithm class. Kelas dasar untuk algoritma hashing. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


Kelas dasar untuk algoritma hashing. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Membuat hash buffer. |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | Membuat hash potongan buffer. |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | Membaca aliran hingga akhir dan menghitung hash untuk data yang dibaca. |
| static [Create](./create/)(const String\&) | Membuat algoritma hash berdasarkan nama. |
| virtual [get_Hash](./get_hash/)() | Mendapatkan nilai kode hash yang dihitung. |
| virtual [get_HashSize](./get_hashsize/)() | Mendapatkan ukuran nilai hash yang dihitung dalam byte. |
| [get_InputBlockSize](./get_inputblocksize/)() override | Ukuran blok masukan. |
| [get_OutputBlockSize](./get_outputblocksize/)() override | Ukuran blok keluaran. |
| virtual [Initialize](./initialize/)() | Mengatur ulang hasher ke keadaan awal. |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Memproses blok data dan menyalin data ke array keluaran. |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | Memproses blok data terakhir dan menghitung hash. |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | Destruktor. |
## Lihat Juga

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
