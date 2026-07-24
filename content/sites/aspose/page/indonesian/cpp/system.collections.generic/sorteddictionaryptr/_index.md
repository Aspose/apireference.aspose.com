---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Penunjuk kamus terurut dengan operator akses. Tipe ini adalah penunjuk untuk mengelola penghapusan objek lain. Harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai atau referensi konstan dalam C++."
type: docs
weight: 4100
url: /id/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Pointer kamus terurut dengan operator akses. Tipe ini adalah pointer untuk mengelola penghapusan objek lain. Itu harus dialokasikan di stack dan diteruskan ke fungsi baik secara nilai maupun referensi konstan.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Fungsi accessor. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Membuat penunjuk null. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Membuat penunjuk ke kamus terurut yang ditentukan. |
## Lihat Juga

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
