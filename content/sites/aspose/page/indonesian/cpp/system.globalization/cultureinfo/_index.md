---
title: "Kelas System::Globalization::CultureInfo"
linktitle: "CultureInfo"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::CultureInfo class. Kumpulan nilai dan algoritma spesifik budaya. Operasi setter hanya diaktifkan pada objek yang tidak hanya-baca. Objek dari kelas ini harus dialokasikan hanya menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Kumpulan nilai dan algoritma spesifik budaya. Operasi setter hanya diaktifkan pada objek yang tidak hanya-baca. Objek dari kelas ini harus dialokasikan hanya menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Menyegarkan informasi budaya yang di-cache. |
| [Clone](./clone/)() override | Menggandakan info budaya. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Membuat budaya berdasarkan nama. |
| explicit [CultureInfo](./cultureinfo/)(int) | Informasi RTTI. |
| [CultureInfo](./cultureinfo/)(int, bool) | Konstruktor. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Konstruktor. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Konstruktor. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Selalu melempar ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan objek. |
| virtual [get_Calendar](./get_calendar/)() const | Mendapatkan kalender yang digunakan oleh budaya. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Mendapatkan pembanding string yang mematuhi aturan budaya. |
| [get_CultureTypes](./get_culturetypes/)() const | Mendapatkan gabungan bitwise dari tipe budaya yang menggambarkan budaya saat ini. |
| static [get_CurrentCulture](./get_currentculture/)() | Mendapatkan budaya yang ditetapkan untuk thread saat ini. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Mendapatkan budaya UI thread saat ini. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Mendapatkan informasi format tanggal. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Mendapatkan budaya default dalam domain aplikasi saat ini. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Mendapatkan budaya UI default dalam domain aplikasi saat ini. |
| virtual [get_DisplayName](./get_displayname/)() const | Mendapatkan nama tampilan budaya. |
| virtual [get_EnglishName](./get_englishname/)() const | Mendapatkan nama bahasa Inggris budaya. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Mendapatkan nama RFC 4646 untuk sebuah bahasa. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Mendapatkan budaya yang terpasang dengan sistem operasi. |
| static [get_InvariantCulture](./get_invariantculture/)() | Mendapatkan budaya invarian. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Memeriksa apakah budaya tersebut netral. |
| [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah objek budaya bersifat read-only. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Mendapatkan pengidentifikasi lokal masukan yang aktif. |
| virtual [get_LCID](./get_lcid/)() const | Mendapatkan pengidentifikasi budaya. |
| virtual [get_Name](./get_name/)() const | Mendapatkan nama budaya. |
| virtual [get_NativeName](./get_nativename/)() const | Mendapatkan nama asli budaya. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Mendapatkan informasi format angka. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Daftar kalender yang dapat digunakan dengan budaya. |
| virtual [get_Parent](./get_parent/)() const | Mendapatkan budaya induk. |
| virtual [get_TextInfo](./get_textinfo/)() const | Mendapatkan parameter teks yang digunakan oleh budaya. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Mendapatkan kode bahasa ISO 639-2 tiga huruf. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Mendapatkan kode tiga huruf untuk bahasa sebagaimana didefinisikan dalam API [Windows](../../system.windows/). |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Mendapatkan nama bahasa ISO dua huruf yang terkait dengan budaya. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Mendapatkan bendera yang menunjukkan apakah [CultureInfo](./) menggunakan pengaturan budaya yang dipilih pengguna. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Mendapatkan budaya alternatif yang cocok untuk aplikasi konsol. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Mendapatkan budaya berdasarkan namanya. Sama dengan CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Mendapatkan budaya berdasarkan namanya. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Mendapatkan budaya berdasarkan id. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Usang. Mendapatkan objek [CultureInfo](./) read-only berdasarkan tag bahasa RFC 4646 yang ditentukan. |
| static [GetCultures](./getcultures/)(CultureTypes) | Mendapatkan budaya yang termasuk dalam tipe yang ditentukan. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Mendapatkan objek format untuk tipe tertentu. |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash objek. |
| [IsInherited](./isinherited/)() const | Mendapatkan bendera is-inherited. UNTUK PENGGUNAAN INTERNAL. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Membandingkan parameter budaya. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Mendapatkan versi read-only dari kultur. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Mengatur budaya untuk thread saat ini. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Mengatur budaya UI thread saat ini. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Mengatur informasi format tanggal. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Mengatur budaya default di domain aplikasi saat ini. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Mengatur budaya UI default di domain aplikasi saat ini. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Mendapatkan informasi format angka. |
| [ToString](./tostring/)() const override | Mengonversi budaya menjadi string. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
