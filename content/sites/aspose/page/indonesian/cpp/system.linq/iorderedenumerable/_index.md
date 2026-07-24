---
title: "kelas System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Linq::IOrderedEnumerable. Mewakili urutan yang diurutkan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Mewakili urutan yang terurut.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari urutan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Melakukan pengurutan lanjutan pada elemen dalam urutan secara naik berdasarkan kunci. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Comparator](./comparator/) | Informasi RTTI. |

## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)
