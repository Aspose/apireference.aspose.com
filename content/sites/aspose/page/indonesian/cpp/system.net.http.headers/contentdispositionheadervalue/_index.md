---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue kelas"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue kelas. Mewakili nilai header ''Content-Disposition''. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Mewakili nilai header 'Content-Disposition'. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Membuat instance baru. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_CreationDate](./get_creationdate/)() | Mendapatkan tanggal pembuatan file. |
| [get_DispositionType](./get_dispositiontype/)() | Informasi RTTI. |
| [get_FileName](./get_filename/)() | Mendapatkan nilai yang menentukan cara membuat nama file untuk menyimpan muatan pesan. Ini digunakan ketika entitas terlepas dan disimpan dalam file terpisah. |
| [get_FileNameStar](./get_filenamestar/)() | Mendapatkan nilai yang menentukan cara membuat nama file untuk menyimpan muatan pesan. Ini digunakan ketika entitas-entitas terlepas dan disimpan dalam file terpisah. |
| [get_ModificationDate](./get_modificationdate/)() | Mendapatkan tanggal modifikasi file. |
| [get_Name](./get_name/)() | Mendapatkan nama untuk bagian dari isi konten. |
| [get_Parameters](./get_parameters/)() | Mengembalikan koleksi parameter dari header 'Content-Disposition'. |
| [get_ReadDate](./get_readdate/)() | Mendapatkan tanggal ketika file terakhir kali dibaca. |
| [get_Size](./get_size/)() | Mendapatkan perkiraan ukuran file. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [ContentDispositionHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [ContentDispositionHeaderValue](./). |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Mengatur tanggal pembuatan file. |
| [set_DispositionType](./set_dispositiontype/)(String) | Mengatur tipe disposisi. |
| [set_FileName](./set_filename/)(String) | Mengatur nilai yang menentukan cara membuat nama file untuk menyimpan muatan pesan. Ini digunakan ketika entitas terlepas dan disimpan dalam file terpisah. |
| [set_FileNameStar](./set_filenamestar/)(String) | Mengatur nilai yang menentukan cara membuat nama file untuk menyimpan muatan pesan. Ini digunakan ketika entitas-entitas terlepas dan disimpan dalam file terpisah. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Mengatur tanggal modifikasi file. |
| [set_Name](./set_name/)(String) | Mengatur nama untuk bagian dari isi konten. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Mengatur tanggal ketika file terakhir kali dibaca. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Mengatur perkiraan ukuran file. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [ContentDispositionHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
