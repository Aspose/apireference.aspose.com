---
title: "Kelas System::Object"
linktitle: "Object"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Object. Kelas dasar yang memungkinkan penggunaan metode yang tersedia untuk kelas System.Object dalam C#. Semua kelas non-trivial yang digunakan dengan lingkungan terjemahan harus mewarisinya dalam C++."
type: docs
weight: 4800
url: /id/cpp/system/object/
---
## Object class


Kelas dasar yang memungkinkan penggunaan metode yang tersedia untuk kelas [System.Object](./) dalam C#. Semua kelas non-trivial yang digunakan dengan lingkungan terjemahan harus mewarisinya.

```cpp
class Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | Membandingkan objek menggunakan semantik [Object.Equals](./equals/) C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Membandingkan objek tipe referensi dengan gaya C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Membandingkan objek tipe nilai dengan gaya C#. |
| static [Equals](./equals/)(float const\&, float const\&) | Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Hanya untuk keperluan internal. |
| [GetCounter](./getcounter/)() | Mendapatkan struktur data penghitung referensi yang terkait dengan objek. |
| virtual [GetHashCode](./gethashcode/)() const | Analog dari metode [Object.GetHashCode()](./gethashcode/) C#. Memungkinkan hashing objek kustom. |
| virtual [GetType](./gettype/)() const | Mendapatkan tipe aktual dari objek. Analog dari pemanggilan [System.Object.GetType()](./gettype/) C#. |
| virtual [Is](./is/)(const TypeInfo\&) const | Periksa apakah objek mewakili sebuah instance dari tipe yang dijelaskan oleh targetType. Analog dari operator 'is' C#. |
| [Lock](./lock/)() | Mengimplementasikan penguncian pernyataan lock() C#. Panggil secara langsung atau gunakan objek penjaga [LockContext](../lockcontext/). |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analog dari metode [Object.MemberwiseClone()](./memberwiseclone/) C#. Memungkinkan kloning tipe kustom. |
| [Object](./object/)() | Membuat objek. Menginisialisasi semua struktur data internal. |
| [Object](./object/)(Object const\&) | Konstruktor penyalin. Tidak menyalin apa pun, sebenarnya, hanya menginisialisasi objek baru dan memungkinkan penyalinan konstruktor pada subclass. |
| [operator=](./operator=/)(Object const\&) | Operator penugasan. Tidak menyalin apa pun, sebenarnya, hanya menginisialisasi objek baru dan memungkinkan penyalinan konstruktor pada subclass. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Membandingkan objek berdasarkan referensi. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Membandingkan objek berdasarkan referensi. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Reference-membandingkan objek tipe nilai dengan nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Spesialisasi dari [Object::ReferenceEquals](./referenceequals/) untuk kasus string dan nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Spesialisasi dari [Object::ReferenceEquals](./referenceequals/) untuk kasus string. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Mengurangi hitungan referensi bersama sebesar nilai yang ditentukan. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
| [SharedCount](./sharedcount/)() const | Mendapatkan nilai saat ini dari penghitung referensi bersama. |
| [SharedRefAdded](./sharedrefadded/)() | Meningkatkan hitungan referensi bersama. Tidak boleh dipanggil secara langsung; gunakan smart pointer atau ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Mengurangi dan mengembalikan hitungan referensi bersama. Tidak boleh dipanggil secara langsung; gunakan smart pointer atau ThisProtector. |
| virtual [ToString](./tostring/)() const | Analog dari metode C# [Object.ToString()](./tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [Type](./type/)() | Mengimplementasikan konstruk C# typeof([System.Object](./)). |
| [Unlock](./unlock/)() | Mengimplementasikan pembukaan pernyataan C# lock(). Panggil secara langsung atau gunakan objek penjaga [LockContext](../lockcontext/). |
| [WeakRefAdded](./weakrefadded/)() | Meningkatkan hitungan referensi lemah. Tidak boleh dipanggil secara langsung; gunakan smart pointer atau ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | Mengurangi hitungan referensi lemah. Tidak boleh dipanggil secara langsung; gunakan smart pointer atau ThisProtector. |
| virtual [~Object](./~object/)() | Menghancurkan objek. Membebaskan semua struktur data internal. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ptr](./ptr/) | Alias untuk tipe smart pointer. |
## Catatan


Selain metode yang tersedia dalam kelas C# [System.Object](./), ini juga memungkinkan dukungan untuk beberapa konsep khusus lingkungan kode yang diterjemahkan. Ini mencakup penghitung referensi yang digunakan oleh kelas smart pointer ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) dan layanan lain yang terkait dengan manajemen memori, debug, dll.

Setiap [Object](./) memiliki dua penghitung referensi: penghitung referensi bersama dan penghitung referensi lemah. Penghitung referensi lemah selalu disimpan dalam struktur data terpisah, bukan di dalam [Object](./) itu sendiri, yang memungkinkan pointer lemah tetap hidup setelah objek yang direferensikan dihancurkan. Penghitung referensi pintar disimpan baik di dalam objek itu sendiri maupun di struktur terpisah yang sama, tergantung pada status makro ENABLE_EXTERNAL_REFCOUNT. Secara default, ini diaktifkan pada build debug dan dinonaktifkan pada build release. Jika penghitung smart pointer disimpan di dalam objek, struktur data terpisah hanya dibuat bila ada pointer lemah ke objek tersebut. Jika tidak, struktur tersebut dibuat bersamaan dengan objek itu sendiri.

Semua smart pointer menggunakan kedua penghitung referensi ini dan berkontribusi pada satu grup kepemilikan yang sama dan tunggal.

Jika subclass [Object](./) dibuat di stack, tidak boleh dibuat smart pointer ke dalamnya, jika tidak akan terjadi masalah penghapusan stack.

Tipe ini dapat dialokasikan baik di stack sebagai tipe nilai maupun di heap menggunakan fungsi [System::MakeObject()](../makeobject/). Setelah objek dialokasikan, jangan pernah mencampur kedua penggunaan ini: memiliki pointer [SmartPtr](../smartptr/) ke objek yang dialokasikan di stack sangat dilarang.
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
