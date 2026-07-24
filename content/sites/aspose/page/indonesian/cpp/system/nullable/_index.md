---
title: "System::Nullable kelas"
linktitle: "Nullable"
second_title: "Aspose.Page untuk C++"
description: "System::Nullable kelas. Deklarasi maju di C++."
type: docs
weight: 4600
url: /id/cpp/system/nullable/
---
## Nullable class


Deklarasi maju.

```cpp
template<typename T>class Nullable
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai dasar yang diperluas oleh kelas [Nullable](./) |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini sama dengan nilai yang diwakili oleh objek [Nullable](./) yang ditentukan. |
| [get_HasValue](./get_hasvalue/)() const | Menentukan apakah objek saat ini mewakili nilai apa pun. |
| [get_Value](./get_value/)() const | Mengembalikan salinan nilai yang diwakili oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Mengembalikan nilai yang diwakili oleh objek saat ini atau nilai yang ditentukan jika nilai yang diwakili oleh objek saat ini bernilai null. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Menentukan apakah objek saat ini mewakili nilai null. |
| [Nullable](./nullable/)() | Membuat instance yang mewakili nilai null. |
| [Nullable](./nullable/)(std::nullptr_t) | Membuat instance yang mewakili null. |
| [Nullable](./nullable/)(const T1\&) | Membuat instance kelas [Nullable](./) yang mewakili nilai yang ditentukan yang dikonversi (jika diperlukan) ke nilai dari tipe dasar T. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Membuat sebuah instance yang mewakili nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan. Objek nullable yang ditentukan dapat mewakili nilai dengan tipe yang berbeda dari tipe dasar dari instance yang dibuat, sehingga nilai yang direpresentasikan dikonversi menjadi nilai dengan tipe T. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Fungsi pembantu untuk memeriksa apakah this dan **other** keduanya tidak null dan memanggil lambda jika demikian. Digunakan dalam implementasi. |
| [operator const T &](./operatorconstt&/)() const | Mengembalikan referensi konstan ke nilai yang direpresentasikan oleh objek saat ini. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini tidak null. |
| [operator!=](./operator!=/)(const T1\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini tidak sama dengan nilai yang ditentukan. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini tidak sama dengan nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan. |
| [operator&=](./operator&=/)(bool) | Menerapkan [operator&=()](./operator&=/) pada nilai yang direpresentasikan oleh objek saat ini dengan menggunakan nilai yang ditentukan sebagai argumen sisi kanan. |
| [operator+](./operator+/)(std::nullptr_t) const | Mengembalikan instance yang dibangun secara default dari kelas Nullable<T>. |
| [operator+](./operator+/)(const T1\&) const | Menjumlahkan nilai nullable dan non-nullable. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Menjumlahkan nilai nullable. |
| [operator+=](./operator+=/)(std::nullptr_t) | Mengatur ulang objek saat ini sehingga ia merepresentasikan nilai null. |
| [operator+=](./operator+=/)(const T1\&) | Menerapkan [operator+=()](./operator+=/) pada nilai yang direpresentasikan oleh objek saat ini dengan menggunakan nilai yang ditentukan sebagai argumen sisi kanan. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Menerapkan [operator+=()](./operator+=/) pada nilai yang direpresentasikan oleh objek saat ini dengan menggunakan nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan sebagai argumen sisi kanan. |
| [operator-](./operator-/)(T1) const | Mengurangkan nilai nullable dan nilai yang menunjuk ke null. |
| [operator-](./operator-/)(const T1\&) const | Mengurangkan nilai nullable dan non-nullable. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Mengurangkan nilai nullable. |
| [operator-=](./operator-=/)(T1) | Mengembalikan sebuah instance dari kelas [Nullable](./) yang merepresentasikan nilai null. |
| [operator-=](./operator-=/)(const T1\&) | Menerapkan [operator-=()](./operator-=/) pada nilai yang direpresentasikan oleh objek saat ini dengan menggunakan nilai yang ditentukan sebagai argumen sisi kanan. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Menerapkan [operator-=()](./operator-=/) pada nilai yang direpresentasikan oleh objek saat ini dengan menggunakan nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan sebagai argumen sisi kanan. |
| [operator<](./operator_/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [operator<](./operator_/)(const T1\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih kecil dari nilai yang ditentukan dengan menerapkan [operator<()](./operator_/) pada nilai-nilai tersebut. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih kecil dari nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan dengan menerapkan [operator<()](./operator_/) pada nilai-nilai tersebut. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [operator<=](./operator_=/)(const T1\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini kurang atau sama dengan nilai yang ditentukan dengan menerapkan [operator<=()](./operator_=/) pada nilai-nilai tersebut. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini kurang atau sama dengan nilai yang direpresentasikan oleh objek [Nullable](./) yang ditentukan dengan menerapkan [operator<=()](./operator_=/) pada nilai-nilai tersebut. |
| [operator=](./operator=/)(std::nullptr_t) | Menetapkan null ke objek saat ini. |
| [operator=](./operator=/)(const T1\&) | Mengganti nilai yang saat ini direpresentasikan oleh objek dengan nilai yang ditentukan. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Mengganti nilai yang saat ini direpresentasikan oleh objek dengan nilai yang ditentukan. |
| [operator==](./operator==/)(std::nullptr_t) const | Menentukan apakah nilai yang diwakili oleh objek saat ini bernilai null. |
| [operator==](./operator==/)(const T1\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini sama dengan nilai yang ditentukan. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini sama dengan nilai yang diwakili oleh objek [Nullable](./) yang ditentukan. |
| [operator>](./operator_/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [operator>](./operator_/)(const T1\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini lebih besar dari nilai yang ditentukan dengan menerapkan [operator>()](./operator_/) pada nilai-nilai ini. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini lebih besar dari nilai yang diwakili oleh objek [Nullable](./) yang ditentukan dengan menerapkan [operator>()](./operator_/) pada nilai-nilai ini. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [operator>=](./operator_=/)(const T1\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini lebih besar atau sama dengan nilai yang diwakili oleh objek yang ditentukan dengan menerapkan [operator>=()](./operator_=/) pada nilai-nilai ini. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini lebih besar atau sama dengan nilai yang diwakili oleh objek [Nullable](./) yang ditentukan dengan menerapkan [operator>=()](./operator_=/) pada nilai-nilai ini. |
| [operator | =](./operator_=/)(bool) | Menerapkan [operator | =()](./operator_=/) pada nilai yang diwakili oleh objek saat ini dengan menggunakan nilai yang ditentukan sebagai argumen sisi kanan. |
| [reset](./reset/)() | Mengatur nilai yang saat ini diwakili menjadi null. |
| [ToString](./tostring/)() const | Mengonversi nilai yang diwakili oleh objek saat ini menjadi string. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ValueType](./valuetype/) | Alias untuk tipe nilai yang diwakili oleh kelas ini. |
## Catatan


Mewakili nilai dari tipe yang ditentukan yang dapat diberi nilai null. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek dari tipe ini.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
