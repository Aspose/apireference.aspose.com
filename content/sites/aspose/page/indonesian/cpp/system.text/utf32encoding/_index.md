---
title: "System::Text::UTF32Encoding class"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page untuk C++"
description: "System::Text::UTF32Encoding class. Enkoding UTF-32. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


Enkoding UTF-32. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning objek encoding. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan dengan objek. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash encoding. |
| [GetPreamble](./getpreamble/)() override | Mendapatkan preambel kode halaman. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Membandingkan parameter enkoding. |
| [UTF32Encoding](./utf32encoding/)() | Konstruktor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Konstruktor. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Nomor ajaib yang digunakan oleh [Windows](../../system.windows/) untuk ID codepage UTF-32 big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Nomor ajaib yang digunakan oleh [Windows](../../system.windows/) untuk ID codepage UTF-32 little endian. |
## Lihat Juga

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
