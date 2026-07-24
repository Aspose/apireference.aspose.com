---
title: "System::Text::UnicodeEncoding class"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page untuk C++"
description: "System::Text::UnicodeEncoding class. Enkoding Unicode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Enkoding Unicode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning objek encoding. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan enkoding. |
| [GetHashCode](./gethashcode/)() const override | Membuat hash enkoding. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Mendapatkan jumlah maksimum byte yang diperlukan untuk meng-encode sejumlah karakter tertentu. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
| [GetPreamble](./getpreamble/)() override | Mengembalikan urutan byte yang menunjukkan enkoding (mis. BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Membandingkan enkoding berdasarkan codepage dan flag. |
| [UnicodeEncoding](./unicodeencoding/)() | Konstruktor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Konstruktor. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Nomor codepage big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Nomor codepage little endian. |
## Lihat Juga

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
