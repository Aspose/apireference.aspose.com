---
title: "kelas System::Text::UTF8Encoding"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::UTF8Encoding. Encoding UTF-8. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 2800
url: /id/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


Encoding UTF-8. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning objek encoding. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan dengan objek. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash encoding. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Mendapatkan jumlah maksimum byte yang diperlukan untuk meng-encode sejumlah karakter tertentu. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
| [GetPreamble](./getpreamble/)() override | Mendapatkan preambel kode halaman. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Membandingkan parameter encoding. |
| [UTF8Encoding](./utf8encoding/)() | Konstruktor. |
| [UTF8Encoding](./utf8encoding/)(bool) | Konstruktor. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | Informasi RTTI. |
## Lihat Juga

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
