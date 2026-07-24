---
title: "Kelas System::String"
linktitle: "String"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::String. Kelas string yang digunakan di seluruh perpustakaan. Merupakan pengganti untuk C# System.String saat menerjemahkan kode. Karena alasan optimisasi, tidak dianggap sebagai subclass Object. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 5800
url: /id/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) adalah tipe nilai di sisi C++ yang secara implisit (tanpa pewarisan) mengimplementasikan beberapa antarmuka. |
| [begin](./begin/)() const | Mengembalikan pointer ke awal buffer string yang sebenarnya. Tidak pernah melakukan alokasi ulang apa pun. Tidak menjamin buffer berakhir dengan null. |
| [Clone](./clone/)() const | Membuat salinan string saat ini. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater-membandingkan dua substring. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-membandingkan dua substring. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater-membandingkan dua string. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater-membandingkan dua string. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater-membandingkan dua string. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-membandingkan dua string. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater-membandingkan dua string menggunakan mode ordinal. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater-membandingkan dua string menggunakan mode ordinal. |
| [CompareTo](./compareto/)(const String\&) const | Membandingkan dua string dalam gaya 'less-equals-more'. Menggunakan budaya saat ini. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Menggabungkan string. |
| static [Concat](./concat/)(const String\&, const String\&) | Menggabungkan string. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Menggabungkan string. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Menggabungkan string. |
| [Contains](./contains/)(const String\&) const | Memeriksa apakah str adalah substring dari string saat ini. |
| [Contains](./contains/)(char16_t) const | Memeriksa apakah string berisi karakter yang diberikan. |
| static [Copy](./copy/)(const String\&) | Membuat salinan string. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Menyalin karakter string ke elemen array yang ada. Tidak ada perubahan ukuran yang dilakukan. |
| [end](./end/)() const | Mengembalikan pointer ke akhir buffer string yang sebenarnya. Tidak pernah melakukan alokasi ulang apa pun. Tidak menjamin buffer berakhir dengan null. |
| [EndsWith](./endswith/)(const String\&) const | Memeriksa apakah string diakhiri dengan substring yang ditentukan. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Memeriksa apakah string diakhiri dengan substring yang ditentukan. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Memeriksa apakah string diakhiri dengan substring yang ditentukan. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) perbandingan kesetaraan. Beberapa mode yang disediakan oleh enumerasi [StringComparison](../stringcomparison/) didukung. |
| [Equals](./equals/)(const String\&) const | [String](./) perbandingan kesetaraan. Menggunakan mode perbandingan [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal-membandingkan dua string menggunakan mode perbandingan Ordial. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal-membandingkan dua string. |
| [FastToAscii](./fasttoascii/)(char, int) const | Mencoba mengonversi [String](./) menjadi string ASCII. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Memformat string dalam gaya C#. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Memformat string dalam gaya C#. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Memformat string dalam gaya C#. |
| static [Format](./format/)(const String\&, const Args\&...) | Memformat string dalam gaya C#. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Memformat string dalam gaya C#. |
| static [FromAscii](./fromascii/)(const char *) | Membuat [String](./) dari string ASCII. |
| static [FromAscii](./fromascii/)(const char *, int) | Membuat [String](./) dari string ASCII. |
| static [FromAscii](./fromascii/)(const std::string\&) | Membuat [String](./) dari string ASCII. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Membuat [String](./) dari string utf16. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Membuat [String](./) dari string utf32. |
| static [FromUtf8](./fromutf8/)(const char *) | Membuat [String](./) dari string utf8. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Membuat [String](./) dari string utf8. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Membuat [String](./) dari string utf8. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Membuat [String](./) dari string utf8. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Membuat [String](./) dari widestring. |
| [get_Length](./get_length/)() const | Mengambil panjang string. |
| [GetHashCode](./gethashcode/)() const | String yang berisi hash. Diimplementasikan di ICU, tidak cocok dengan hash di C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Pencarian maju substring. |
| [IndexOf](./indexof/)(char_t, int) const | Pencarian maju karakter. |
| [IndexOf](./indexof/)(char_t, int, int) const | Pencarian maju karakter dalam substring. |
| [IndexOf](./indexof/)(const String\&, int) const | Pencarian maju substring. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Pencarian maju substring. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Pencarian maju substring. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Pencarian maju substring. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Pencarian maju karakter. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Secara konsekuen mencari semua karakter dari str dalam ini. Jika karakter pertama ditemukan, posisinya dikembalikan, jika tidak mencari karakter kedua dan seterusnya. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Mencari salah satu karakter yang diberikan melalui seluruh string. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Mencari salah satu karakter yang diberikan melalui substring. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Mencari salah satu karakter yang diberikan melalui substring. Membandingkan karakter pertama string dengan semua karakter di anyOf, kemudian membandingkan yang kedua dan seterusnya. Mengembalikan indeks dari yang pertama yang cocok dengan salah satu karakter target. |
| [Insert](./insert/)(int, const String\&) const | Menyisipkan substring pada posisi yang ditentukan. |
| [Is](./is/)(const System::TypeInfo\&) const | Memeriksa apakah objek string berjenis tipe yang ditentukan oleh [TypeInfo](../typeinfo/) yang diberikan. |
| [IsAsciiString](./isasciistring/)() const | Menunjukkan apakah sebuah [String](./) hanya berisi simbol ASCII. |
| [IsEmpty](./isempty/)() const | Memeriksa apakah string tidak null dan kosong. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Memeriksa apakah string unicode dinormalisasi menggunakan bentuk normalisasi yang ditentukan. |
| [IsNull](./isnull/)() const | Memeriksa apakah string dianggap null. [String](./) adalah null hanya jika dibuat melalui konstruktor [String()](./string/), dipindahkan, disalin atau ditetapkan dari string null atau metode [reset()](./reset/) dipanggil. |
| [IsNullOrEmpty](./isnullorempty/)() const | Memeriksa apakah string kosong atau dianggap null. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Memeriksa apakah string yang diberikan null atau kosong. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Menunjukkan apakah sebuah string yang ditentukan null, kosong, atau hanya terdiri dari karakter spasi putih. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Menggabungkan array menggunakan string sebagai pemisah. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Menggabungkan array menggunakan string sebagai pemisah. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Menggabungkan array menggunakan string sebagai pemisah. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Menggabungkan array menggunakan string sebagai pemisah. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Pencarian mundur substring. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Pencarian mundur substring. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Pencarian mundur substring. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Pencarian mundur substring. |
| [LastIndexOf](./lastindexof/)(char_t) const | Pencarian mundur karakter. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Pencarian mundur karakter. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Pencarian mundur karakter. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Mencari salah satu karakter yang diberikan melalui seluruh string secara mundur. Membandingkan karakter terakhir string dengan semua karakter di anyOf, kemudian membandingkan yang sebelumnya dan seterusnya. Mengembalikan indeks dari kecocokan pertama yang ditemukan. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Mencari salah satu karakter yang diberikan melalui substring secara mundur. Membandingkan karakter terakhir string dengan semua karakter di anyOf, kemudian membandingkan yang sebelumnya dan seterusnya. Mengembalikan indeks dari kecocokan pertama yang ditemukan. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Mencari salah satu karakter yang diberikan melalui substring secara mundur. Membandingkan karakter terakhir string dengan semua karakter di anyOf, kemudian membandingkan yang sebelumnya dan seterusnya. Mengembalikan indeks dari kecocokan pertama yang ditemukan. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Menormalkan string unicode menggunakan bentuk normalisasi yang ditentukan. |
| [operator!=](./operator!=/)(const String\&) const | Operator perbandingan tidak sama. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Memeriksa apakah string tidak null. Menerapkan logika yang sama seperti pemanggilan [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | Operator penggabungan [String](./). |
| [operator+](./operator+/)(const T\&) const | [String](./) penggabungan dengan literal string atau pointer string karakter. |
| [operator+](./operator+/)(char_t) const | Menambahkan karakter ke akhir string. |
| [operator+](./operator+/)(int) const | Menambahkan representasi string nilai integer ke akhir string. |
| [operator+](./operator+/)(uint32_t) const | Menambahkan representasi string nilai integer tak bertanda ke akhir string. |
| [operator+](./operator+/)(double) const | Menambahkan representasi string nilai titik mengambang ke akhir string. |
| [operator+](./operator+/)(int64_t) const | Menambahkan representasi string nilai integer ke akhir string. |
| [operator+](./operator+/)(const T\&) const | Menambahkan representasi string objek tipe referensi ke akhir string. |
| [operator+](./operator+/)(const T\&) const | Menambahkan representasi string objek tipe referensi ke akhir string. |
| [operator+](./operator+/)(T) const | Menambahkan representasi string nilai boolean ke akhir string. |
| [operator+=](./operator+=/)(char_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(const String\&) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(double) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(uint8_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(int16_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(uint16_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(int32_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(uint32_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(int64_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(uint64_t) | Operator penugasan penggabungan. |
| [operator+=](./operator+=/)(T) | Operator penugasan penggabungan. |
| [operator<](./operator_/)(const String\&) const | Membandingkan urutan string. |
| [operator=](./operator=/)(const String\&) | Operator penugasan. |
| [operator=](./operator=/)(String\&&) | Operator penugasan pindah. |
| [operator==](./operator==/)(const String\&) const | Operator perbandingan kesetaraan. |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah string bernilai null. Menerapkan logika yang sama seperti pemanggilan [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Membandingkan urutan string. |
| [operator[]](./operator[]/)(int) const | Mendapatkan karakter pada posisi yang ditentukan. |
| [PadLeft](./padleft/)(int, char_t) const | Menambahkan padding di sebelah kiri string asli. |
| [PadRight](./padright/)(int, char_t) const | Menambahkan padding di sebelah kanan string asli. |
| [rbegin](./rbegin/)() const | Mengembalikan iterator terbalik ke karakter terakhir (jika ada) dari buffer string aktual. |
| [Remove](./remove/)(int32_t, int32_t) const | Mengekstrak semua kecuali substring dari string saat ini. |
| [rend](./rend/)() const | Mengembalikan iterator terbalik ke sebelum karakter pertama (jika ada) dari buffer string aktual. |
| [Replace](./replace/)(char_t, char_t) const | Mengganti semua kemunculan karakter dalam string. |
| [Replace](./replace/)(const String\&, const String\&) const | Mengganti semua kemunculan pencarian dalam string ini. |
| [reset](./reset/)() | Mengatur string menjadi null. Seperti 'string_variable_name = null' dalam C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Mengatur karakter pada posisi yang ditentukan. |
| [Split](./split/)(char_t, StringSplitOptions) const | Membagi string berdasarkan karakter. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Membagi string berdasarkan karakter. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Membagi string berdasarkan salah satu dari dua karakter. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Membagi string berdasarkan salah satu karakter yang ditentukan. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Membagi string berdasarkan salah satu karakter yang ditentukan. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Membagi string berdasarkan substring. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Membagi string berdasarkan substring. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Membagi string berdasarkan substring. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Membagi string berdasarkan substring. Saat ini, hanya mendukung array pemisah dengan nol atau satu elemen. |
| [StartsWith](./startswith/)(const String\&) const | Memeriksa apakah string dimulai dengan substring yang ditentukan. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Memeriksa apakah string dimulai dengan substring yang ditentukan. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Memeriksa apakah string dimulai dengan substring yang ditentukan. |
| [String](./string/)() | Konstruktor default. Membuat objek string yang dianggap null. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Membuat string berdasarkan literal string. Menganggap literal sebagai string yang diakhiri null, menghitung panjang string target berdasarkan ukuran literal. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Membuat string berdasarkan pointer string karakter. Menganggap string yang ditunjuk sebagai string yang diakhiri null, menghitung panjang string target berdasarkan karakter null. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Membuat string berdasarkan literal string. Menganggap literal sebagai string yang diakhiri null dalam UTF8, menghitung panjang string target berdasarkan ukuran literal. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Membuat string berdasarkan pointer string karakter. Menganggap string yang ditunjuk sebagai string yang diakhiri null dalam UTF8, menghitung panjang string target berdasarkan karakter null. |
| [String](./string/)(const char16_t *, int) | Membuat string dari pointer string karakter dan panjang eksplisit. |
| [String](./string/)(const char *, int) | Membuat string dari pointer string karakter dan panjang eksplisit. |
| [String](./string/)(const char16_t *, int, int) | Membuat string dari pointer string karakter mulai dari posisi awal menggunakan panjang. |
| explicit [String](./string/)(const char16_t, int) | Konstruktor pengisian. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Konstruktor nullptr. Dideklarasikan sebagai templat untuk menyelesaikan prioritas dengan konstruktor templat lainnya. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Membuat string berdasarkan literal widestring. Menganggap literal sebagai string yang diakhiri null, menghitung panjang string target berdasarkan ukuran literal. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Membuat string berdasarkan pointer string widecharacter. Menganggap string yang ditunjuk sebagai string yang diakhiri null, menghitung panjang string target berdasarkan karakter null. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan. |
| explicit [String](./string/)(const wchar_t *, int) | Membuat string dari pointer string widecharacter dan panjang eksplisit. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan. |
| explicit [String](./string/)(const wchar_t, int) | Konstruktor pengisian. Konversi dari wchar_t memakan waktu pada beberapa platform, sehingga konversi implisit tidak diizinkan. |
| [String](./string/)(const String\&) | Konstruktor penyalinan. |
| [String](./string/)(String\&&) | Konstruktor pemindahan. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Mengonversi seluruh array karakter menjadi string. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Mengonversi subrentang array karakter menjadi string. Jika parameter berada di luar batas array, string kosong akan dibuat. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Membungkus UnicodeString ke dalam [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Konstruktor pemindahan. |
| explicit [String](./string/)(const std::wstring\&) | Membuat [String](./) dari widestring. |
| explicit [String](./string/)(const std::u16string\&) | Membuat [String](./) dari string utf16. |
| explicit [String](./string/)(const std::string\&) | Membuat [String](./) dari string std::string yang disajikan dalam format UTF-8. |
| explicit [String](./string/)(const std::u32string\&) | Membuat [String](./) dari string std::u32string. |
| [Substring](./substring/)(int32_t) const | Mengekstrak substring. |
| [Substring](./substring/)(int32_t, int32_t) const | Mengekstrak substring. |
| [ToAsciiString](./toasciistring/)() const | Mengonversi string menjadi std::string. Menggunakan enkoding ASCII. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Mengonversi string atau substring menjadi array byte. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Mengonversi string atau substring menjadi array karakter. |
| [ToLower](./tolower/)() const | Mengonversi semua karakter string menjadi huruf kecil. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Mengonversi semua karakter string menjadi huruf kecil menggunakan budaya tertentu. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Mengonversi semua karakter string menjadi huruf kecil menggunakan budaya invarian. |
| [ToString](./tostring/)() const | Pembungkus untuk menangani kelas [String](./) dalam konteks di mana [ToString()](./tostring/) dipanggil pada objek tipe nilai. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Pembungkus untuk menangani kelas [String](./) dalam konteks di mana [ToString()](./tostring/) dipanggil pada objek tipe nilai. |
| [ToU16Str](./tou16str/)() const | Mengonversi string menjadi std::u16string. |
| [ToU32Str](./tou32str/)() const | Mengonversi string menjadi std::u32string. |
| [ToUpper](./toupper/)() const | Mengonversi semua karakter string menjadi huruf besar. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Mengonversi semua karakter string menjadi huruf besar menggunakan budaya tertentu. |
| [ToUpperInvariant](./toupperinvariant/)() const | Mengonversi semua karakter string menjadi huruf besar menggunakan budaya invarian. |
| [ToUtf8String](./toutf8string/)() const | Mengonversi string menjadi std::string. Menggunakan enkoding UTF-8. |
| [ToWCS](./towcs/)() const | Mengonversi string menjadi std::wstring. |
| [Trim](./trim/)() const | Menghapus semua karakter spasi putih dari awal dan akhir string. |
| [Trim](./trim/)(char_t) const | Menghapus semua kemunculan karakter yang diberikan dari awal dan akhir string. |
| [Trim](./trim/)(const String\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari awal dan akhir string. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari awal dan akhir string. |
| [TrimEnd](./trimend/)() const | Menghapus semua karakter spasi putih dari akhir string. |
| [TrimEnd](./trimend/)(char_t) const | Menghapus semua kemunculan karakter yang diberikan dari akhir string. |
| [TrimEnd](./trimend/)(const String\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari akhir string. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari akhir string. |
| [TrimStart](./trimstart/)() const | Menghapus semua karakter spasi putih dari awal string. |
| [TrimStart](./trimstart/)(char_t) const | Menghapus semua kemunculan karakter yang diberikan dari awal string. |
| [TrimStart](./trimstart/)(const String\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari awal string. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Menghapus semua kemunculan karakter-karakter yang diberikan dari awal string. |
| [u_str](./u_str/)() const | Mengembalikan buffer null-terminated bergaya ICU. Mungkin akan mengalokasikan ulang string. |
| [~String](./~string/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | String kosong. |
| static [Null](./null/) | String null. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
## Catatan



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Membuat string dari array karakter dan mencetaknya.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Bangun string dari array byte dan cetaknya.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Potong string di bawah ini dan cetaknya.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Cetak jumlah kata dalam .
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
