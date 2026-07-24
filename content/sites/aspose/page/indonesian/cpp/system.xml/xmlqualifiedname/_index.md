---
title: "System::Xml::XmlQualifiedName class"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlQualifiedName class. Mewakili nama yang memenuhi syarat XML dalam C++."
type: docs
weight: 3200
url: /id/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Mewakili nama terkualifikasi XML.

```cpp
class XmlQualifiedName : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Menentukan apakah objek [XmlQualifiedName](./) yang ditentukan sama dengan objek [XmlQualifiedName](./) saat ini. |
| [get_IsEmpty](./get_isempty/)() const | Mengembalikan nilai yang menunjukkan apakah [XmlQualifiedName](./) kosong. |
| [get_Name](./get_name/)() const | Mengembalikan representasi string dari nama yang memenuhi syarat dari [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | Mengembalikan representasi string dari ruang nama [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash untuk [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Mengembalikan nilai string dari [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Mengembalikan nilai string dari [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | Menginisialisasi instance baru dari kelas [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Menginisialisasi instance baru dari kelas [XmlQualifiedName](./) dengan nama yang ditentukan. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Menginisialisasi instance baru dari kelas [XmlQualifiedName](./) dengan nama dan ruang nama yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Menyediakan [XmlQualifiedName](./) kosong. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
