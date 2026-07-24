---
title: "Kelas System::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::SmartPtr. Kelas pointer untuk membungkus tipe yang dialokasikan di heap. Gunakan untuk mengelola memori kelas yang mewarisi Object. Tipe pointer ini mengikuti semantik pointer intrusif. Penghitung referensi disimpan baik di dalam Object itu sendiri atau dalam struktur penghitung yang terikat erat pada instance Object. Dalam hal apa pun, semua instance SmartPtr membentuk grup kepemilikan tunggal terlepas dari bagaimana mereka dibuat, yang berbeda dengan perilaku kelas std::shared_ptr. Mengonversi pointer mentah ke SmartPtr aman asalkan ada instance SmartPtr lain yang memegang referensi bersama ke objek yang sama. Instance kelas SmartPtr dapat berada dalam satu dari dua keadaan: pointer bersama dan pointer lemah. Agar objek tetap hidup, harus ada jumlah referensi bersama ke objek tersebut positif. Baik pointer lemah maupun bersama dapat digunakan untuk mengakses objek yang ditunjuk (untuk memanggil metode, membaca atau menulis bidang, dll.), tetapi pointer lemah tidak berpartisipasi dalam penghitung referensi pointer bersama. Object dihapus ketika pointer ''shared'' SmartPtr terakhir ke objek tersebut dihancurkan. Jadi, pastikan hal ini tidak terjadi ketika tidak ada pointer SmartPtr bersama lain ke objek, misalnya selama konstruksi atau penghancuran objek. Gunakan objek penjaga System::Object::ThisProtector (dalam kode C++) atau atribut CppCTORSelfReference atau CppSelfReference (dalam kode C# yang diterjemahkan) untuk memperbaiki masalah ini. Demikian pula, pastikan memutuskan referensi siklus dengan menggunakan kelas pointer System::WeakPtr atau mode pointer System::SmartPtrMode::Weak (dalam kode C++) atau atribut CppWeakPtr (dalam kode C# yang diterjemahkan). Jika dua atau lebih objek saling merujuk menggunakan pointer ''shared'', mereka tidak akan pernah dihapus. Jika tipe pointer (lemah atau bersama) harus diganti pada waktu berjalan, gunakan metode System::SmartPtr<T>::set_Mode() atau kelas System::DynamicWeakPtr. Kelas SmartPtr tidak mengandung metode virtual apa pun. Anda hanya harus mewarisinya jika Anda membuat strategi manajemen memori sendiri. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan di stack dan diteruskan ke fungsi baik dengan nilai atau dengan referensi konstan dalam C++."
type: docs
weight: 5500
url: /id/cpp/system/smartptr/
---
## SmartPtr class


Kelas pointer untuk membungkus tipe yang dialokasikan di heap. Gunakan untuk mengelola memori kelas yang mewarisi [Object](../object/). Tipe pointer ini mengikuti semantik pointer intrusif. Penghitung referensi disimpan baik di dalam [Object](../object/) itu sendiri atau dalam struktur penghitung yang terikat erat pada instance [Object](../object/). Dalam hal apa pun, semua instance [SmartPtr](./) membentuk grup kepemilikan tunggal terlepas dari bagaimana mereka dibuat, yang berbeda dengan perilaku kelas std::shared_ptr. Mengonversi pointer mentah ke [SmartPtr](./) aman asalkan ada instance [SmartPtr](./) lain yang memegang referensi bersama ke objek yang sama. Instance kelas [SmartPtr](./) dapat berada dalam satu dari dua keadaan: pointer bersama dan pointer lemah. Agar objek tetap hidup, harus ada jumlah referensi bersama ke objek tersebut positif. Baik pointer lemah maupun bersama dapat digunakan untuk mengakses objek yang ditunjuk (untuk memanggil metode, membaca atau menulis bidang, dll.), tetapi pointer lemah tidak berpartisipasi dalam penghitung referensi pointer bersama. [Object](../object/) dihapus ketika pointer 'shared' [SmartPtr](./) terakhir ke objek tersebut dihancurkan. Jadi, pastikan hal ini tidak terjadi ketika tidak ada pointer [SmartPtr](./) bersama lain ke objek, misalnya selama konstruksi atau penghancuran objek. Gunakan objek penjaga System::Object::ThisProtector (dalam kode C++) atau atribut CppCTORSelfReference atau CppSelfReference (dalam kode C# yang diterjemahkan) untuk memperbaiki masalah ini. Demikian pula, pastikan memutuskan referensi siklus dengan menggunakan kelas pointer [System::WeakPtr](../weakptr/) atau mode pointer [System::SmartPtrMode::Weak](../smartptrmode/) (dalam kode C++) atau atribut CppWeakPtr (dalam kode C# yang diterjemahkan). Jika dua atau lebih objek saling merujuk menggunakan pointer 'shared', mereka tidak akan pernah dihapus. Jika tipe pointer (lemah atau bersama) harus diganti pada waktu berjalan, gunakan metode [System::SmartPtr<T>::set_Mode()](./set_mode/) atau kelas [System::DynamicWeakPtr](../dynamicweakptr/). Kelas [SmartPtr](./) tidak mengandung metode virtual apa pun. Anda hanya harus mewarisinya jika Anda membuat strategi manajemen memori sendiri. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan di stack dan diteruskan ke fungsi baik dengan nilai atau dengan referensi konstan.

```cpp
template<class T>class SmartPtr
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe dari objek yang ditunjuk. Harus berupa [System::Object](../object/) atau subclass-nya. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [begin](./begin/)() | Akses ke metode [begin()](./begin/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [begin()](./begin/). |
| [begin](./begin/)() const | Akses ke metode [begin()](./begin/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [begin()](./begin/). |
| [Cast](./cast/)() const | Mengubah tipe pointer ke tipe aslinya. |
| [Cast](./cast/)() const | Mengubah tipe pointer ke tipe dasar menggunakan static_cast. |
| [Cast](./cast/)() const | Mengubah tipe pointer ke tipe turunan menggunakan dynamic_cast. |
| [Cast](./cast/)() const | Mengubah tipe pointer ke tipe turunan menggunakan dynamic_cast. |
| [cbegin](./cbegin/)() const | Akses ke metode [cbegin()](./cbegin/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [cbegin()](./cbegin/). |
| [cend](./cend/)() const | Akses ke metode [cend()](./cend/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [cend()](./cend/). |
| [const_pointer_cast](./const_pointer_cast/)() const | Mengubah tipe pointer ke tipe lain menggunakan const_cast pada objek yang ditunjuk. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Mengubah tipe pointer ke tipe lain menggunakan dynamic_cast pada objek yang ditunjuk. |
| [end](./end/)() | Akses ke metode [end()](./end/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [end()](./end/). |
| [end](./end/)() const | Akses ke metode [end()](./end/) dari koleksi yang mendasari. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah tipe spesialisasi dengan metode [end()](./end/). |
| [get](./get/)() const | Mendapatkan objek yang ditunjuk. |
| [get_Mode](./get_mode/)() const | Mendapatkan mode pointer. |
| [get_shared](./get_shared/)() const | Mendapatkan objek yang ditunjuk, tetapi memastikan bahwa pointer berada dalam mode berbagi. |
| [get_shared_count](./get_shared_count/)() const | Mendapatkan jumlah pointer berbagi yang ada pada objek yang direferensikan, termasuk yang saat ini. Memastikan pointer saat ini berada dalam mode berbagi. |
| [GetHashCode](./gethashcode/)() const | Memanggil [GetHashCode()](./gethashcode/) pada objek yang ditunjuk. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Mendapatkan objek yang saat ini direferensikan (jika ada) atau melempar pengecualian. |
| [GetObjectOrNull](./getobjectornull/)() const | Mendapatkan objek yang ditunjuk (jika ada) atau nullptr. Sama dengan [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Mendapatkan objek yang direferensikan. |
| [GetPointer](./getpointer/)() const | Mendapatkan objek yang ditunjuk (jika ada) atau nullptr. Sama dengan [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Memeriksa apakah objek yang ditunjuk berjenis tipe tertentu atau tipe turunannya. Mengikuti semantik C# 'is'. |
| [IsAliasingPtr](./isaliasingptr/)() const | Memeriksa apakah pointer menunjuk ke objek lain selain yang dimiliki (dibuat oleh konstruktor aliasing). |
| [IsShared](./isshared/)() const | Memeriksa apakah pointer berada dalam mode berbagi. |
| [IsWeak](./isweak/)() const | Memeriksa apakah pointer berada dalam mode lemah. |
| explicit [operator bool](./operatorbool/)() const | Memeriksa apakah pointer tidak null. |
| [operator!](./operator!/)() const | Memeriksa apakah pointer null. |
| [operator*](./operator_/)() const | Mendapatkan referensi ke objek yang ditunjuk. Memastikan bahwa pointer tidak null. |
| [operator->](./operator-_/)() const | Memungkinkan mengakses anggota dari objek yang direferensikan. |
| [operator<](./operator_/)(Y *) const | Menyediakan semantik perbandingan kurang untuk kelas [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Menyediakan semantik perbandingan kurang untuk kelas [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | Melakukan penugasan pindah pada objek [SmartPtr](./). x menjadi tidak dapat digunakan. |
| [operator=](./operator=/)(const SmartPtr_\&) | Menugaskan salinan pada objek [SmartPtr](./). |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Menugaskan salinan pada objek [SmartPtr](./). Melakukan konversi tipe yang diperlukan. |
| [operator=](./operator=/)(Pointee_ *) | Menetapkan pointer mentah ke objek [SmartPtr](./). |
| [operator=](./operator=/)(std::nullptr_t) | Mengatur nilai pointer menjadi nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah pointer menunjuk ke nullptr. |
| [operator[]](./operator[]/)(IdxType) const | Akses ke elemen array. Hanya dapat dikompilasi jika [SmartPtr_](./smartptr_/) adalah spesialisasi dari [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | Menghapus aliasing (yang dibuat oleh konstruktor aliasing) dari pointer, memastikan bahwa ia mengelola (jika berbagi) atau melacak (jika lemah) objek yang sama yang ditunjuknya. |
| [reset](./reset/)(Pointee_ *) | Mengatur objek yang ditunjuk. |
| [reset](./reset/)() | Membuat pointer menunjuk ke nullptr. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Mengatur mode penunjuk. Mungkin mengubah hitungan referensi objek yang dirujuk. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Memanggil metode SetTemplateWeakPtr() pada objek yang ditunjuk (jika ada). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Membuat objek [SmartPtr](./) dengan mode yang diperlukan. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Membuat objek [SmartPtr](./) null-pointer dengan mode yang diperlukan. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Membuat [SmartPtr](./) yang menunjuk ke objek yang ditentukan, atau mengonversi penunjuk mentah ke [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Menyusun salinan objek [SmartPtr](./). Kedua penunjuk menunjuk ke objek yang sama setelahnya. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Menyusun salinan objek [SmartPtr](./). Kedua penunjuk menunjuk ke objek yang sama setelahnya. Melakukan konversi tipe jika diizinkan. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Menyusun objek [SmartPtr](./) dengan pemindahan. Secara efektif, menukar dua penunjuk, jika keduanya berada dalam mode yang sama. x mungkin tidak dapat digunakan setelah pemanggilan. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Mengonversi tipe array yang dirujuk dengan membuat array baru dengan tipe berbeda. Berguna jika di C# terdapat cast tipe array yang tidak didukung di C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Menginisialisasi array kosong. Digunakan untuk menerjemahkan beberapa konstruksi kode C#. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Menyusun sebuah [SmartPtr](./) yang berbagi informasi kepemilikan dengan nilai awal ptr, tetapi memegang penunjuk p yang tidak terkait dan tidak dikelola. |
| [static_pointer_cast](./static_pointer_cast/)() const | Mencast penunjuk ke tipe berbeda menggunakan static_cast pada objek yang ditunjuk. |
| [ToObjectPtr](./toobjectptr/)() const | Mengonversi tipe penunjuk apa pun menjadi penunjuk ke [Object](../object/). Tidak memerlukan tipe [Pointee_](./pointee_/) lengkap. |
| static [Type](./type/)() | Jalan pintas untuk mendapatkan objek [System::TypeInfo](../typeinfo/) untuk tipe [Pointee_](./pointee_/). |
| [~SmartPtr](./~smartptr/)() | Menghancurkan objek [SmartPtr](./). Jika diperlukan, mengurangi penghitung referensi objek yang ditunjuk dan menghapus objek. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ArrayType](./arraytype/) | Sama dengan [Pointee_](./pointee_/), jika itu merupakan spesialisasi dari [System::Array](../array/), dan void jika tidak. |
| [Pointee_](./pointee_/) | Tipe yang ditunjuk. |
| [SmartPtr_](./smartptr_/) | Tipe penunjuk pintar khusus. |
| [ValueType](./valuetype/) | Tipe penyimpanan array yang ditunjuk. Hanya bermakna jika T merupakan spesialisasi dari [System::Array](../array/). |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
