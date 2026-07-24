---
title: "Kelas System::Text::RegularExpressions::Regex"
linktitle: "Regex"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::RegularExpressions::Regex. Ekspresi reguler yang mengikuti sintaks mirip C#. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.text.regularexpressions/regex/
---
## Regex class


Ekspresi reguler yang mengikuti sintaks mirip C#. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Regex : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Escape](./escape/)(const String\&) | Menyandikan karakter khusus untuk menggunakan string sebagai bagian dari pola. |
| [get_MatchTimeout](./get_matchtimeout/)() | Mendapatkan batas waktu pencocokan. |
| [get_Options](./get_options/)() | Mendapatkan opsi regex. |
| [get_RightToLeft](./get_righttoleft/)() | Memeriksa apakah pencocokan dilakukan dalam mode kanan-ke-kiri. |
| [IsMatch](./ismatch/)(const String\&, int) | Mencocokkan regex terhadap string. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | Memeriksa apakah string cocok dengan pola. |
| [Match](./match/)(const String\&) | Mencocokkan regex terhadap string. |
| [Match](./match/)(const String\&, int, int) | Mencocokkan regex terhadap string. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Mencocokkan string dan pola. |
| [Matches](./matches/)(const String\&, int) | Mendapatkan semua kecocokan regex dalam string yang diberikan dengan mencocokkan berulang kali. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | Mendapatkan semua kecocokan antara string dan pola. |
| [Regex](./regex/)() | Membuat regexp kosong. |
| [Regex](./regex/)(const String\&) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions) | Konstruktor. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | Konstruktor. |
| [Replace](./replace/)(const String\&, const String\&) | Mengganti semua kecocokan regex dalam string dengan string pengganti. |
| [Replace](./replace/)(const String\&, const char_t *) | Mengganti semua kecocokan regex dalam string dengan string pengganti. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | Mengganti semua kecocokan regex dalam string dengan string pengganti. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | Mengganti semua kecocokan regex dalam string dengan string pengganti. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | Mengganti semua kecocokan dalam string dengan string pengganti yang dihasilkan oleh delegasi. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | Mengganti semua kecocokan dalam string dengan string pengganti yang dihasilkan oleh delegasi. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | Mengganti semua kecocokan dalam string dengan string pengganti yang dihasilkan oleh delegasi. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | Mengganti semua kecocokan dalam string dengan string pengganti yang dihasilkan oleh delegasi (fungsi statis). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | Mengganti semua kecocokan regex dalam string dengan string pengganti. |
| [Replace](./replace/)(const String\&, const String\&, int) | Mengganti substring dalam string. Tidak diimplementasikan. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Mengganti substring dalam string. Tidak diimplementasikan. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | Mengganti kecocokan regex. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | Mengganti kecocokan regex. |
| [Split](./split/)(const String\&) | Membagi string berdasarkan kecocokan regex. |
| [Split](./split/)(const String\&, int) | Membagi string berdasarkan kecocokan regex. |
| [Split](./split/)(const String\&, int, int) | Membagi sebuah string input sejumlah maksimum yang ditentukan menjadi sebuah array substring, pada posisi yang ditentukan oleh ekspresi reguler yang ditentukan dalam konstruktor [Regex](./). Pencarian pola ekspresi reguler dimulai pada posisi karakter yang ditentukan dalam string input. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | Membagi string berdasarkan regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | Membagi string berdasarkan regexp. |
| [ToString](./tostring/)() const override | Mengonversi regex menjadi string. |
| static [Unescape](./unescape/)(const String\&) | Membuka escape karakter khusus dalam string yang digunakan sebagai bagian dari pola. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | Nilai timeout khusus untuk menonaktifkan pemutusan kecocokan karena timeout. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
