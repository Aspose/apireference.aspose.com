---
title: "Kelas Aspose::Page::UserProperties"
linktitle: "UserProperties"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::UserProperties class. Kelas properti khusus yang memungkinkan properti bertipe diatur dan dikembalikan. Ini juga memungkinkan pengaitan dua objek properti default untuk dicari jika objek properti ini tidak berisi properti tersebut dalam C++."
type: docs
weight: 1600
url: /id/cpp/aspose.page/userproperties/
---
## UserProperties class


Kelas properti khusus yang memungkinkan properti bertipe diatur dan dikembalikan. Ini juga memungkinkan pengaitan dua objek properti default untuk dicari jika objek properti ini tidak berisi properti tersebut.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Mendapatkan nilai properti string. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Mendapatkan nilai properti string. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Mendapatkan nilai properti warna. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Mendapatkan nilai properti warna. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Mendapatkan nilai properti double. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Mendapatkan nilai properti double. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Mendapatkan nilai properti float. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Mendapatkan nilai properti float. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Mendapatkan nilai properti integer. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Mendapatkan nilai properti integer. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Mendapatkan nilai properti margin. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Mendapatkan nilai properti margin. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Mendapatkan nilai properti matriks. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mendapatkan nilai properti matriks. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Mendapatkan nilai properti persegi panjang. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Mendapatkan nilai properti persegi panjang. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Mendapatkan nilai properti ukuran. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Mendapatkan nilai properti ukuran. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Mendapatkan nilai properti array string. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Mendapatkan nilai properti array string. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [IsProperty](./isproperty/)(System::String) | Mendapatkan nilai properti boolean. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Mendapatkan nilai properti boolean. Jika properti yang diminta tidak ada, mengembalikan nilai default yang diberikan. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Mengembalikan nama-nama properti. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Menyalin properti, termasuk nilai defaultnya ke dalam [UserProperties](./) ini. |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Mengatur nilai properti string. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Mengatur nilai properti array string. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Mengatur nilai properti array string dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Mengatur nilai properti warna. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Mengatur nilai properti warna dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Mengatur nilai properti persegi panjang. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Mengatur nilai properti persegi panjang dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Mengatur nilai properti margin. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Mengatur nilai properti margin dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Mengatur nilai properti ukuran. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Mengatur nilai properti ukuran dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Mengatur nilai properti integer. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Mengatur nilai properti integer dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Mengatur nilai properti double. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Mengatur nilai properti double dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Mengatur nilai properti float. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Mengatur nilai properti float dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Mengatur nilai properti boolean. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Mengatur nilai properti boolean dalam tabel properti yang ditentukan. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mengatur nilai properti matriks. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mengatur nilai properti matriks dalam tabel properti yang ditentukan. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
| [UserProperties](./userproperties/)() | Menginisialisasi instance kosong dari kelas [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Menginisialisasi kelas [UserProperties](./) dengan nilai default. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Membuat [UserProperties](./) dengan tabel defaults dan altDefaults, yang dicari dalam urutan tersebut. |
## Lihat Juga

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
