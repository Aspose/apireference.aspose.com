---
title: "Kelas System::Char"
linktitle: "Char"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Char. Menyediakan metode untuk manipulasi karakter yang direpresentasikan sebagai unit kode UTF-16. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun di C++."
type: docs
weight: 1200
url: /id/cpp/system/char/
---
## Char class


Menyediakan metode untuk memanipulasi karakter yang direpresentasikan sebagai unit kode UTF-16. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class Char
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | Mengonversi unit kode UTF-32 menjadi instance dari kelas [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | Mengonversi pasangan surrogate UTF-16 yang ditentukan menjadi unit kode UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | Mengonversi nilai karakter yang dikodekan UTF-16 atau pasangan surrogate pada posisi tertentu dalam string menjadi unit kode UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | Mengonversi karakter UTF-16 yang ditentukan menjadi nilai numerik floating-point presisi ganda. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | Mengembalikan nilai yang mewakili kategori Unicode dari karakter yang ditentukan. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter spasi putih ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai karakter kontrol Unicode. |
| static [IsControl](./iscontrol/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter kontrol Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai digit desimal. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan diklasifikasikan sebagai digit desimal. |
| static [IsDigit](./isdigit/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai digit desimal. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan merupakan unit kode surrogate tinggi UTF-16. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan merupakan surrogate tinggi. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | Menentukan apakah karakter yang ditentukan merupakan surrogate tinggi. |
| static [IsLetter](./isletter/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai huruf Unicode. |
| static [IsLetter](./isletter/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai huruf Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai huruf Unicode atau digit desimal. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai huruf Unicode atau digit desimal. |
| static [IsLower](./islower/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai huruf kecil. |
| static [IsLower](./islower/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai huruf kecil. |
| static [IsLower](./islower/)(const String\&, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan diklasifikasikan sebagai huruf kecil. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan merupakan surrogate rendah. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | Menentukan apakah karakter yang ditentukan merupakan surrogate rendah. |
| static [IsNumber](./isnumber/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai angka. |
| static [IsNumber](./isnumber/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai angka. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai karakter tanda baca. |
| static [IsPunctuation](./ispunctuation/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter tanda baca. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai karakter pemisah. |
| static [IsSeparator](./isseparator/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter pemisah. |
| static [IsSurrogate](./issurrogate/)(char_t) | Menentukan apakah karakter yang ditentukan adalah unit kode surrogate UTF-16. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan adalah unit kode surrogate UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | Menentukan apakah dua karakter yang ditentukan untuk pasangan surrogate UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | Menentukan apakah dua karakter berurutan dalam buffer karakter yang ditentukan merupakan pasangan surrogate. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai karakter simbol. |
| static [IsSymbol](./issymbol/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter simbol. |
| static [IsUpper](./isupper/)(const String\&, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan diklasifikasikan sebagai huruf kapital. |
| static [IsUpper](./isupper/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai huruf kapital. |
| static [IsUpper](./isupper/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai huruf kapital. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam buffer karakter yang ditentukan diklasifikasikan sebagai karakter spasi putih. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | Menentukan apakah karakter yang ditentukan diklasifikasikan sebagai karakter spasi putih. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | Menentukan apakah karakter pada indeks yang ditentukan dalam string yang ditentukan diklasifikasikan sebagai karakter spasi putih. |
| static [Parse](./parse/)(const String\&) | Mengonversi karakter pertama dan satu-satunya dari string yang ditentukan menjadi nilai char_t. |
| static [ToLower](./tolower/)(char_t) | Mengonversi karakter yang ditentukan menjadi huruf kecil. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Mengonversi karakter yang ditentukan menjadi huruf kecil. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | Mengonversi karakter yang ditentukan menjadi huruf kecil. |
| static [ToUpper](./toupper/)(char_t) | Mengonversi karakter yang ditentukan menjadi huruf kapital. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | Mengonversi karakter yang ditentukan menjadi huruf kapital. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | Mengonversi karakter yang ditentukan menjadi huruf kapital. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | Mencoba mengonversi string yang terdiri dari satu karakter menjadi karakter UTF-16. Fungsi ini berhasil hanya ketika string masukan tidak null dan memiliki panjang tepat satu karakter. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
