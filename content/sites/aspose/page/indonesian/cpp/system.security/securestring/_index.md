---
title: "System::Security::SecureString kelas"
linktitle: "SecureString"
second_title: "Aspose.Page untuk C++"
description: "System::Security::SecureString kelas. Secure string, mewakili teks yang harus dijaga kerahasiaannya. Kelas ini TIDAK MENGENKRIPSI data internal. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.security/securestring/
---
## SecureString class


Secure string, mewakili teks yang harus dijaga kerahasiaannya. Kelas ini TIDAK MENGENKRIPSI data internal. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class SecureString : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Menambahkan sebuah karakter ke akhir string. |
| [Clear](./clear/)() | Menghapus semua karakter dari secure string saat ini. |
| [Copy](./copy/)() const | Membuat duplikat dari secure string ini. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini. |
| [get_Length](./get_length/)() const | Mendapatkan jumlah karakter dalam string aman ini. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Menyisipkan sebuah karakter pada indeks yang ditentukan. |
| [IsReadOnly](./isreadonly/)() const | Mendapatkan flag yang menunjukkan apakah objek ini ditandai sebagai hanya-baca. |
| [MakeReadOnly](./makereadonly/)() | Membuat string aman ini menjadi hanya-baca. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Menghapus karakter pada posisi yang ditentukan. |
| [SecureString](./securestring/)() | Informasi RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Konstruktor. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Mengganti karakter yang ada pada posisi yang ditentukan. |
| [ToUnsecureString](./tounsecurestring/)() const | Menyalin isi string aman ini ke objek [String](../../system/string/) yang tidak aman. Gunakan dengan hati-hati. |
| [~SecureString](./~securestring/)() | Destruktor. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
