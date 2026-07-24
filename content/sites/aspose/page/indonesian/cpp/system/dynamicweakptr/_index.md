---
title: "Kelas System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::DynamicWeakPtr. Kelas smart pointer yang melacak mode pointer dari argumen template objek yang disimpan dan memperbaruinya setelah setiap penugasan. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai maupun referensi konstan dalam C++."
type: docs
weight: 2200
url: /id/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Kelas smart pointer yang melacak mode pointer dari argumen template objek yang disimpan dan memperbaruinya setelah setiap penugasan. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan di stack dan diteruskan ke fungsi baik dengan nilai maupun referensi konstan.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parameter | Deskripsi |
| --- | --- |
| Pointee | tipe. |
| trunkMode | Mode smart pointer itu sendiri, shared atau weak. |
| weakLeafs | Indeks argumen template dari tipe yang disimpan yang harus diatur ke mode pointer lemah. |
## Nested classes

* Class [Reference](./reference/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Membuat smart pointer null. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Membuat smart pointer yang menunjuk ke objek yang diberikan. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Membuat smart pointer dengan copy-constructor. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Membuat smart pointer dengan copy-constructor. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Membuat smart pointer dengan copy-constructor. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Membuat smart pointer dengan move-constructor. |
| [operator=](./operator=/)(SmartPtr_\&&) | Menetapkan smart pointer dengan move-assignment. |
| [operator=](./operator=/)(const SmartPtr_\&) | Menetapkan smart pointer dengan copy-assignment. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Menetapkan smart pointer dengan copy-assignment. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Menetapkan smart pointer. |
| [operator=](./operator=/)(std::nullptr_t) | Mengatur smart pointer menjadi null. |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah smart pointer null. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Alias tipe diri. |
| [Pointee_](./pointee_/) | Tipe yang ditunjuk. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) alias kelas dasar. |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
