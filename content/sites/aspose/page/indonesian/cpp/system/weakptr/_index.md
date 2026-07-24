---
title: "System::WeakPtr kelas"
linktitle: "WeakPtr"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::WeakPtr. Subkelas dari System::SmartPtr yang mengatur dirinya ke mode lemah pada konstruksi. Harap perhatikan bahwa kelas ini tidak menjamin bahwa instansinya akan selalu tetap dalam mode lemah karena set_Mode() masih dapat diakses. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai maupun dengan referensi konstan dalam C++."
type: docs
weight: 7500
url: /id/cpp/system/weakptr/
---
## WeakPtr class


Subkelas dari [System::SmartPtr](../smartptr/) yang mengatur dirinya ke mode lemah pada konstruksi. Harap perhatikan bahwa kelas ini tidak menjamin bahwa instansinya akan selalu tetap dalam mode lemah karena [set_Mode()](../smartptr/set_mode/) masih dapat diakses. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai maupun dengan referensi konstan.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang ditunjuk. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [expired](./expired/)() const | Memeriksa apakah objek yang direferensikan sudah dihapus. |
| [get_weak](./get_weak/)() const | Mendapatkan objek yang direferensikan. Menyatakan bahwa pointer berada dalam mode lemah. |
| [operator=](./operator=/)(Q\&&) | Menetapkan nilai ke weak pointer. Memanggil operator penugasan spesifik dari [SmartPtr_](./smartptr_/). |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah weak pointer bernilai null. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Membuat pointer null. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Membuat weak pointer ke objek yang diberikan. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Membuat weak pointer yang merujuk ke pointer yang sama yang ditunjuk oleh ptr. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Membuat weak pointer yang merujuk ke pointer yang sama yang ditunjuk oleh x. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Membuat weak pointer dengan copy-constructor. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Membuat weak pointer dengan copy-constructor. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Membuat weak pointer dengan move-constructor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Pointee_](./pointee_/) | Tipe yang ditunjuk. |
| [SmartPtr_](./smartptr_/) | Alias untuk kelas [SmartPtr](../smartptr/) yang bersesuaian. |
| [WeakPtr_](./weakptr_/) | Alias untuk tipe dirinya sendiri. |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
