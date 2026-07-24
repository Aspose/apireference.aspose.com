---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. Mewakili nilai XMP dalam C++."
type: docs
weight: 300
url: /id/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Mewakili nilai [XMP](../).

```cpp
class XmpValue : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Mengembalikan true jika [XmpValue](./) adalah array. |
| [get_IsDateTime](./get_isdatetime/)() const | Mengembalikan true jika nilai adalah DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Mengembalikan true jika nilai adalah nilai floating point. |
| [get_IsField](./get_isfield/)() | Mengembalikan true jika [XmpValue](./) adalah field. |
| [get_IsInteger](./get_isinteger/)() const | Mengembalikan true jika nilai adalah integer. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Mengembalikan true jika [XmpValue](./) adalah nilai bernama. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Mengembalikan true jika [XmpValue](./) mewakili nilai-nilai bernama. |
| [get_IsRaw](./get_israw/)() | Nilai tidak didukung/tidak diketahui dan kode XML mentah disediakan. |
| [get_IsString](./get_isstring/)() | Mengembalikan true jika nilai adalah string. |
| [get_IsStructure](./get_isstructure/)() | Mengembalikan true jika [XmpValue](./) mewakili struktur. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Mengonversi [XmpValue](./) menjadi nilai bernama. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Mengonversi XmlValue menjadi nilai koleksi bernama. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Mengonversi [XmpValue](./) menjadi string. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Mengonversi string menjadi [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Mengonversi integer menjadi [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Mengonversi double menjadi [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Mengonversi DateTime menjadi [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Mengonversi array menjadi [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Mengonversi [XmpValue](./) menjadi array. |
| [ToArray](./toarray/)() | Mengembalikan array. |
| [ToDateTime](./todatetime/)() | Mengonversi menjadi tanggal dan waktu. |
| [ToDictionary](./todictionary/)() | Mengembalikan kamus yang berisi nilai bernama. |
| [ToDouble](./todouble/)() | Mengonversi menjadi double. |
| [ToField](./tofield/)() | Mengembalikan nilai [XMP](../) sebagai bidang [XMP](../). |
| [ToInteger](./tointeger/)() | Mengonversi menjadi integer. |
| [ToNamedValue](./tonamedvalue/)() | Mengembalikan nilai [XMP](../) sebagai nilai bernama. |
| [ToNamedValues](./tonamedvalues/)() | Mengembalikan nilai [XMP](../) sebagai koleksi nilai bernama. |
| [ToRaw](./toraw/)() | Kode XML mentah untuk nilai yang tidak diketahui/tidak didukung. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Mengembalikan representasi string. |
| [ToString](./tostring/)() const override | Mengembalikan representasi string dari [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Mengonversi menjadi string. |
| [ToStructure](./tostructure/)() | Mengembalikan nilai [XMP](../) sebagai struktur (kumpulan bidang). |
| [XmpValue](./xmpvalue/)(System::String) | Konstruktor untuk nilai string. |
| [XmpValue](./xmpvalue/)(int32_t) | Konstruktor untuk nilai integer. |
| [XmpValue](./xmpvalue/)(double) | Konstruktor untuk nilai floating point. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Konstruktor untuk nilai tanggal dan waktu. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Konstruktor untuk nilai array. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
