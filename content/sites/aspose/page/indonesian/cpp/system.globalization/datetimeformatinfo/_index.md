---
title: "Kelas System::Globalization::DateTimeFormatInfo"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Globalization::DateTimeFormatInfo. Sekumpulan parameter pemformatan tanggal dan waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk System::SmartPtr dan gunakan penunjuk ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


Sekumpulan parameter pemformatan tanggal dan waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk [System::SmartPtr](../../system/smartptr/) dan gunakan penunjuk ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning informasi format. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | Konstruktor default, membuat informasi format invarian. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | Mendapatkan nama hari singkat. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | Mendapatkan nama bulan singkat dalam bentuk genitif. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | Mendapatkan nama bulan singkat. |
| [get_AMDesignator](./get_amdesignator/)() const | Mendapatkan penanda AM. |
| [get_Calendar](./get_calendar/)() const | Mendapatkan kalender yang terkait dengan pemformat. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | Mendapatkan aturan minggu kalender yang terkait dengan pemformat. |
| static [get_CurrentInfo](./get_currentinfo/)() | Mendapatkan pemformat tanggal dan waktu dari thread saat ini. |
| [get_DateSeparator](./get_dateseparator/)() const | Mendapatkan pemisah tanggal. |
| [get_DayNames](./get_daynames/)() const | Mendapatkan nama hari. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | Mendapatkan hari pertama dalam seminggu. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | Mendapatkan pola tanggal dan waktu lengkap. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Mendapatkan format tanggal dan waktu invarian. |
| [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah format bersifat hanya-baca. |
| [get_LongDatePattern](./get_longdatepattern/)() const | Mendapatkan pola tanggal panjang. |
| [get_LongTimePattern](./get_longtimepattern/)() const | Mendapatkan pola waktu panjang. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | Mendapatkan pola hari bulan. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | Mendapatkan nama bulan dalam bentuk genitif. |
| [get_MonthNames](./get_monthnames/)() const | Mendapatkan nama bulan. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | Mendapatkan nama kalender asli jika tersedia. |
| [get_PMDesignator](./get_pmdesignator/)() const | Mendapatkan penanda PM. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | Mendapatkan pola RFC1123. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | Mendapatkan pola tanggal singkat. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | Mendapatkan nama hari terpendek yang memungkinkan. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | Mendapatkan pola waktu singkat. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | Mendapatkan pola tanggal dan waktu yang dapat diurutkan. |
| [get_TimeSeparator](./get_timeseparator/)() const | Mendapatkan pemisah waktu. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | Mendapatkan pola tanggal dan waktu universal yang dapat diurutkan. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | Mendapatkan pola tahun dan bulan. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | Mendapatkan nama hari minggu singkat. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | Mendapatkan nama era singkat. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | Mendapatkan nama bulan singkat. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | Mendapatkan semua pola di mana nilai tanggal dan waktu dapat diformat. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | Mendapatkan semua pola di mana nilai tanggal dan waktu dapat diformat menggunakan string format yang ditentukan. |
| [GetDayName](./getdayname/)(DayOfWeek) const | Mendapatkan nama hari minggu. |
| [GetEra](./getera/)(const String\&) const | Mendapatkan era berdasarkan nama. |
| [GetEraName](./geteraname/)(int) const | Mendapatkan nama era. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Mendapatkan formatir dari tipe tertentu. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Mendapatkan formatir yang terkait dengan penyedia format. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | Mendapatkan nama bulan tahun kabisat. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | Mendapatkan nama bulan genitif. |
| [GetMonthName](./getmonthname/)(int) const | Mendapatkan nama bulan. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | Mendapatkan nama terpendek untuk hari dalam minggu yang ditentukan. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | Mendapatkan versi hanya-baca dari formatir. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | Mengatur nama hari singkat. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | Mengatur nama bulan singkat dalam bentuk genitif. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | Mengatur nama bulan singkat. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | Mengatur penanda AM. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | Mengatur kalender yang terkait dengan pemformat. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | Mengatur aturan minggu kalender yang terkait dengan pemformat. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | Mengatur pemisah tanggal. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | Mengatur nama hari. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | Mengatur hari pertama dalam minggu. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | Mengatur pola tanggal dan waktu lengkap. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | Mengatur pola tanggal panjang. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | Mengatur pola waktu panjang. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | Mengatur pola hari bulan. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | Mengatur nama bulan dalam bentuk genitif. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | Mengatur nama bulan. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | Mengatur penanda PM. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | Mengatur pola tanggal singkat. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | Mengatur nama hari terpendek yang memungkinkan. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | Mengatur pola waktu singkat. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | Mengatur pemisah waktu. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | Mengatur pola tahun dan bulan. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | Mengatur pola untuk format yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
