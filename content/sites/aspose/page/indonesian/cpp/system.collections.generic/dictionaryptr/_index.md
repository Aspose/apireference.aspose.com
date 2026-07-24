---
title: "Kelas System::Collections::Generic::DictionaryPtr"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::DictionaryPtr. Kelas pointer kamus dengan overload operator. Tipe ini adalah pointer untuk mengelola penghapusan objek lain''. Itu harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai atau dengan referensi konstan dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe kunci. |
| V | Tipe nilai. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Menginisialisasi penunjuk null. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Mengonversi tipe pointer. |
| [operator[]](./operator[]/)(const X\&) const | Operator akses untuk bekerja dengan konversi tipe kunci. |
| [operator[]](./operator[]/)(const T\&) const | Operator akses. |

## Lihat Juga

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
