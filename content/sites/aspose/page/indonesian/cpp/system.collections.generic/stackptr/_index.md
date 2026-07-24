---
title: "System::Collections::Generic::StackPtr kelas"
linktitle: "StackPtr"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::StackPtr kelas. Penunjuk stack. Tipe ini adalah penunjuk untuk mengelola penghapusan objek''s. Itu harus dialokasikan pada stack dan diteruskan ke fungsi baik dengan nilai atau dengan referensi konstan dalam C++."
type: docs
weight: 4700
url: /id/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [StackPtr](./stackptr/)() | Membuat penunjuk null. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Membuat penunjuk yang merujuk ke stack tertentu. |

## Lihat Juga

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
