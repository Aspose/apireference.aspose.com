---
title: "Kelas System::Collections::Generic::IEnumerable"
linktitle: "IEnumerable"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::IEnumerable. Antarmuka objek yang menyediakan enumerator pada elemen yang terkandung dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Antarmuka objek yang menyediakan enumerator pada elemen yang terkandung.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [begin](./begin/)() | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari koleksi. Iterator ini tidak dapat digunakan untuk mengubah objek yang direferensikan karena [GetEnumerator()](./getenumerator/) mengembalikan objek salinan dari T. |
| [begin](./begin/)() const | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari instance koleksi yang dikualifikasi const. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator yang menunjuk ke elemen pertama yang dikualifikasi const (jika ada) dari koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir yang dikualifikasi const (jika ada) dari koleksi. |
| [end](./end/)() | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari koleksi. Iterator ini tidak dapat digunakan untuk mengubah objek yang direferensikan karena [GetEnumerator()](./getenumerator/) mengembalikan objek salinan dari T. |
| [end](./end/)() const | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari instance koleksi yang bersifat const. |
| virtual [GetEnumerator](./getenumerator/)() | Mendapatkan enumerator. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Menerapkan fungsi akumulator pada sebuah urutan. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Menentukan apakah semua elemen dalam urutan memenuhi suatu kondisi. |
| [LINQ_Any](./linq_any/)() | Menentukan apakah sebuah urutan berisi elemen apa pun. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Menentukan apakah ada elemen dalam urutan yang ada atau memenuhi suatu kondisi. |
| [LINQ_Cast](./linq_cast/)() | Mengubah tipe elemen ke tipe yang ditentukan. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Menggabungkan dua urutan. |
| [LINQ_Contains](./linq_contains/)(T) | Menentukan apakah sebuah urutan berisi nilai yang ditentukan. |
| [LINQ_Count](./linq_count/)() | Mengembalikan jumlah elemen dalam urutan (dihitung melalui penghitung langsung). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Mengembalikan jumlah elemen dalam urutan yang memenuhi kondisi yang ditentukan. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Mengembalikan elemen pada indeks yang ditentukan dalam sebuah urutan. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Mengembalikan elemen pada indeks yang ditentukan dalam sebuah urutan. |
| [LINQ_First](./linq_first/)() | Mengembalikan elemen pertama dari sebuah urutan. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Mengembalikan elemen pertama dari sebuah urutan yang memenuhi kondisi yang ditentukan. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Mengembalikan elemen pertama dari sebuah urutan, atau nilai default jika urutan kosong. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Mengembalikan elemen pertama dari urutan yang memenuhi kondisi atau nilai default jika tidak ada elemen seperti itu. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Mengelompokkan elemen-elemen dalam sebuah urutan. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | Mengembalikan elemen terakhir dari sebuah urutan. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Mengembalikan elemen terakhir dari sebuah urutan, atau nilai default jika urutan kosong. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Memanggil fungsi transformasi pada setiap elemen dari urutan generik dan mengembalikan nilai maksimum yang dihasilkan. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Memanggil fungsi transformasi pada setiap elemen dari urutan generik dan mengembalikan nilai minimum yang dihasilkan. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Menyaring elemen-elemen urutan berdasarkan tipe yang ditentukan. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Mengurutkan elemen-elemen urutan secara naik berdasarkan nilai kunci yang dipilih oleh keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Mengurutkan elemen-elemen urutan secara turun berdasarkan nilai kunci yang dipilih oleh keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Membalik urutan elemen dalam sebuah urutan. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Mengubah elemen-elemen dari sebuah urutan. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Mengubah setiap elemen dari sebuah urutan menjadi bentuk baru dengan memasukkan indeks elemen. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Memproyeksikan setiap elemen dari sebuah urutan dan menggabungkan urutan-urutan yang dihasilkan menjadi satu urutan. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Mengembalikan sejumlah elemen berurutan yang ditentukan dari awal sebuah urutan. |
| [LINQ_ToArray](./linq_toarray/)() | Membuat array dari sebuah urutan. |
| [LINQ_ToList](./linq_tolist/)() | Membuat sebuah [List<T>](../list/) dari sebuah urutan. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Menyaring sebuah urutan berdasarkan predikat yang ditentukan. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [IEnumeratorType](./ienumeratortype/) | Informasi RTTI. |
| [iterator](./iterator/) | Tipe iterator. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Tipe dasar iterator internal. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Tipe elemen iterator internal. |

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
