---
title: "Kelas System::Version"
linktitle: "Versi"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Version. Mewakili nomor versi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 7300
url: /id/cpp/system/version/
---
## Version class


Mewakili nomor versi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
class Version
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | Membandingkan versi yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [Equals](./equals/)(const Version\&) const | Menentukan apakah nomor versi yang diwakili oleh objek saat ini dan objek yang ditentukan sama. |
| [get_Build](./get_build/)() const | Mengembalikan nomor build. |
| [get_Major](./get_major/)() const | Mengembalikan versi mayor. |
| [get_MajorRevision](./get_majorrevision/)() const | Mengembalikan nilai 16-bit tinggi dari nomor revisi. |
| [get_Minor](./get_minor/)() const | Mengembalikan versi minor. |
| [get_MinorRevision](./get_minorrevision/)() const | Mengembalikan nilai 16-bit rendah dari nomor revisi. |
| [get_Revision](./get_revision/)() const | Mengembalikan nomor revisi. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| static [Parse](./parse/)(const String\&) | Mengonversi representasi string dari nomor versi menjadi instance yang setara dari kelas [Version](./). |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari nomor versi yang diwakili oleh objek saat ini. |
| [ToString](./tostring/)(int) const | Mengembalikan representasi string dari jumlah bagian yang ditentukan dari nomor versi yang diwakili oleh objek saat ini. |
| [Version](./version/)(int, int, int, int) | Membuat instance yang mewakili nilai mayor, minor, build, dan revisi yang ditentukan. |
| [Version](./version/)(int, int, int) | Membuat instance yang mewakili nilai mayor, minor, dan build yang ditentukan. |
| [Version](./version/)(int, int) | Membuat instance yang mewakili nilai mayor dan nilai yang ditentukan. |
| [Version](./version/)(const String\&) | Membuat instance yang mewakili nomor versi yang direpresentasikan sebagai string. |
| [Version](./version/)() | Membuat sebuah instance yang mewakili nomor versi 0.0.-1.-1. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
