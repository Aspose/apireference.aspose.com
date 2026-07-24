---
title: "kelas System::MulticastDelegate< ReturnType(ArgumentTypes...)>"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page untuk C++"
description: "kelas System::MulticastDelegate< ReturnType(ArgumentTypes...)>. Mewakili kumpulan delegate. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 4500
url: /id/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Mewakili kumpulan delegate. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Deskripsi |
| --- | --- |
| ReturnType | Tipe kembali dari entitas yang dapat dipanggil yang ditunjuk oleh setiap delegate dalam koleksi |
| ArgumentTypes | Daftar argumen dari entitas yang dapat dipanggil yang ditunjuk oleh setiap delegate dalam koleksi |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | BELUM DIIMPLEMENTASIKAN. |
| [connect](./connect/)(Callback) | Menambahkan delegate yang ditentukan ke koleksi. |
| [connect](./connect/)(std::function\<R(Args...)>) | Menambahkan objek fungsi yang ditentukan ke koleksi delegate. Objek fungsi tersebut dikonversi ke tipe delegate [Callback](./callback/) sebelum ditambahkan ke koleksi. |
| [connect](./connect/)(MulticastDelegate\&) | Menambahkan objek MulticastDelegate yang ditentukan ke koleksi delegate. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Menambahkan metode non-statis yang ditentukan dari objek yang ditentukan ke koleksi delegate. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Menambahkan metode non-statis yang ditentukan dari objek yang ditentukan ke koleksi delegate. |
| [disconnect](./disconnect/)(Callback) | Menghapus delegate yang ditentukan dari koleksi delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Menghapus metode non-statis yang ditentukan dari objek yang ditentukan dari koleksi delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Menghapus metode non-statis yang ditentukan dari objek yang ditentukan dari koleksi delegate. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Menghapus objek MulticastDelegate yang ditentukan dari koleksi delegate. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Menghapus semua delegate dari koleksi delegate. |
| [empty](./empty/)() const | Menentukan apakah koleksi delegate kosong. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Menjalankan semua delegate yang saat ini ada dalam koleksi delegate. Delegate dijalankan dalam urutan yang sama seperti saat ditambahkan ke koleksi. Metode ini memblokir selama delegate dieksekusi. |
| [IsNull](./isnull/)() const | Menentukan apakah koleksi delegate kosong. |
| [MulticastDelegate](./multicastdelegate/)() | Membuat koleksi kosong. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Setara dengan konstruktor default. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Melakukan salinan dangkal dari koleksi delegate. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Konstruktor pemindahan. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Membuat sebuah instance dan menempatkan delegasi yang ditentukan ke dalam koleksi delegasi. |
| [MulticastDelegate](./multicastdelegate/)(T) | Membuat sebuah instance dan menempatkan nilai yang ditentukan ke dalam koleksi delegasi. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Membuat sebuah instance dan menempatkan nilai yang ditentukan ke dalam koleksi delegasi. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Menentukan apakah koleksi delegasi tidak kosong. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Menentukan apakah dua instance MulticastDelegate - objek saat ini dan objek yang ditentukan - tidak sama. |
| [operator()](./operator()/)(ArgumentTypes...) const | Memanggil semua delegasi yang saat ini ada dalam koleksi delegasi. Delegasi dipanggil dalam urutan yang sama seperti saat mereka ditambahkan ke koleksi. Operator memblokir sementara delegasi dieksekusi. |
| [operator+=](./operator+=/)(Callback) | Menambahkan delegate yang ditentukan ke koleksi. |
| [operator-=](./operator-=/)(Callback) | Menghapus delegate yang ditentukan dari koleksi delegate. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Menetapkan koleksi delegasi yang diwakili oleh objek yang ditentukan ke objek saat ini. Akibatnya kedua objek menunjuk ke koleksi delegasi yang sama. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Operator penugasan pemindahan. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Menentukan apakah koleksi delegate kosong. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Menentukan apakah dua instance MulticastDelegate - objek saat ini dan objek yang ditentukan - sama. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Membersihkan callback yang terkandung yang kosong (tidak memanggil apa pun). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Mengembalikan referensi ke objek [TypeInfo](../typeinfo/) yang mewakili informasi tipe kelas MulticastDelegate. |
| [~MulticastDelegate](./~multicastdelegate/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Callback](./callback/) | Tipe delegasi yang diwakili oleh kelas MulticastDelegate. |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
