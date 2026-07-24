---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Page untuk C++"
description: "System::Guid class. Mewakili Globally Unique Identifier. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 3000
url: /id/cpp/system/guid/
---
## Guid class


Mewakili Globally Unique Identifier. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
class Guid
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Melakukan perbandingan aritmetika GUID yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [Equals](./equals/)(const Guid\&) const | Menentukan apakah GUID yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [Guid](./guid/)() | Menyiapkan sebuah objek yang merepresentasikan GUID yang terdiri dari semua nol. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | Menyiapkan sebuah objek yang merepresentasikan GUID yang ditentukan sebagai array nilai integer tak bertanda 8-bit. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | Menyiapkan sebuah objek yang merepresentasikan GUID yang ditentukan sebagai tampilan array nilai integer tak bertanda 8-bit. |
| [Guid](./guid/)(const String\&) | Menyiapkan sebuah objek yang merepresentasikan GUID yang ditentukan sebagai string. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Menyiapkan sebuah instance dari kelas [Guid](./) dari komponen GUID yang ditentukan. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Menyiapkan sebuah instance dari kelas [Guid](./) dari komponen GUID yang ditentukan. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Menyiapkan sebuah instance dari kelas [Guid](./) dari integer tak bertanda dan byte yang ditentukan. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Menyiapkan sebuah instance dari kelas [Guid](./) dari integer tak bertanda dan byte yang ditentukan. |
| [Guid](./guid/)(const Guid\&) | Menyiapkan sebuah objek yang merepresentasikan GUID yang sama dengan objek yang ditentukan. |
| static [NewGuid](./newguid/)() | Menghasilkan GUID baru dan mengembalikan objek [Guid](./) yang merepresentasikannya. |
| [operator!=](./operator!=/)(const Guid\&) const | Menentukan apakah GUID yang direpresentasikan oleh objek saat ini dan objek yang ditentukan tidak sama. |
| [operator=](./operator=/)(const Guid\&) | Menetapkan ke objek saat ini nilai GUID yang direpresentasikan oleh objek [Guid](./) yang ditentukan. |
| [operator==](./operator==/)(const Guid\&) const | Menentukan apakah GUID yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| static [Parse](./parse/)(const String\&) | Mengonversi representasi string GUID yang ditentukan menjadi objek [Guid](./) yang setara. |
| [ToByteArray](./tobytearray/)() const | Mengonversi GUID yang direpresentasikan oleh objek saat ini menjadi array byte. |
| [ToString](./tostring/)() const | Mengonversi GUID yang direpresentasikan oleh objek saat ini ke representasi stringnya. |
| [ToString](./tostring/)(const String\&) const | Mengonversi GUID yang direpresentasikan oleh objek saat ini ke representasi stringnya menggunakan format string yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Mengonversi GUID yang direpresentasikan oleh objek saat ini ke representasi stringnya menggunakan format string dan Budaya yang ditentukan. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Mencoba mengonversi string yang ditentukan menjadi objek [Guid](./). |
| [~Guid](./~guid/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Merepresentasikan GUID yang memiliki nilai 0. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
