---
title: "System::Security::Cryptography::AsymmetricAlgorithm kelas"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm kelas. Kelas dasar abstrak untuk algoritma enkripsi asimetris. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Kelas dasar abstrak untuk algoritma enkripsi asimetris. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clear](./clear/)() | Melepaskan semua sumber daya. |
| static [Create](./create/)() | Membuat algoritma default. Tidak diimplementasikan. |
| static [Create](./create/)(const String\&) | Membuat algoritma berdasarkan nama. Tidak diimplementasikan. |
| [Dispose](./dispose/)() override | Melepaskan sumber daya yang dimiliki oleh objek saat ini. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Membaca parameter algoritma dari string XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Mendapatkan algoritma pertukaran kunci yang akan digunakan. |
| virtual [get_KeySize](./get_keysize/)() | Informasi RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Mendapatkan array ukuran kunci yang diizinkan. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Mendapatkan algoritma tanda tangan yang akan digunakan. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Mengatur ukuran kunci. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Menulis parameter algoritma ke string XML. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
