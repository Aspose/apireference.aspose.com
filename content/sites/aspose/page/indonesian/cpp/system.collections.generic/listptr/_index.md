---
title: "System::Collections::Generic::ListPtr kelas"
linktitle: "ListPtr"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::ListPtr kelas. Penunjuk daftar dengan operator akses. Tipe ini adalah penunjuk untuk mengelola penghapusan objek''s. Itu harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai atau dengan referensi konstan dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Menginisialisasi penunjuk null. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Menginisialisasi penunjuk ke daftar yang ditentukan. |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah penunjuk [List](../list/) null. |
| [operator[]](./operator[]/)(int) | Aksesor. |
| [operator[]](./operator[]/)(int) const | Aksesor. |
## Lihat Juga

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
