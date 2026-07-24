---
title: "kelas System::Text::ASCIIEncoding"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Text::ASCIIEncoding. Mewakili enkoding ASCII. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


Mewakili enkoding ASCII. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | Konstruktor. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Mendapatkan jumlah byte maksimum yang dapat menampung string dengan jumlah karakter yang diketahui. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
## Lihat Juga

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
