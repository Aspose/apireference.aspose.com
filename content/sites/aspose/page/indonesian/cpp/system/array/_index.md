---
title: "Kelas System::Array"
linktitle: "Array"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Array. Kelas yang merepresentasikan struktur data array. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeArray() dan System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system/array/
---
## Array class


Kelas yang merepresentasikan struktur data array. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeArray()](../makearray/) dan [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari sebuah array |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const T\&) override | Tidak didukung karena array yang direpresentasikan oleh objek saat ini bersifat read-only. |
| [Array](./array/)() | Membuat sebuah array kosong. |
| [Array](./array/)(int, const T\&) | Konstruktor pengisian. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Konstruktor pengisian. |
| [Array](./array/)(int, const T) | Konstruktor pengisian. |
| [Array](./array/)(vector_t\&&) | Konstruktor pemindahan. |
| [Array](./array/)(const vector_t\&) | Konstruktor penyalinan. |
| [Array](./array/)(const std::vector\<Q\>\&) | Membuat objek [Array](./) dan mengisinya dengan nilai yang disalin dari objek std::vector yang tipe nilainya sama dengan **T** tetapi berbeda dari **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | Membuat objek [Array](./) dan mengisinya dengan nilai yang dipindahkan dari objek std::vector yang tipe nilainya sama dengan **T** tetapi berbeda dari **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Membuat objek [Array](./) dan mengisinya dengan nilai dari daftar inisialisasi yang ditentukan yang berisi elemen berjenis **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Membuat sebuah [Array](./) objek dan mengisinya dengan nilai dari array yang ditentukan yang berisi elemen berjenis **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Membuat sebuah [Array](./) objek dan mengisinya dengan nilai dari daftar inisialisasi yang ditentukan yang berisi elemen berjenis bool. |
| [begin](./begin/)() | Mengembalikan iterator ke elemen pertama dari kontainer. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](./end/). |
| [begin](./begin/)() const | Mengembalikan iterator ke elemen pertama dari kontainer yang dikualifikasi const. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Melakukan pencarian biner pada array yang sudah diurutkan. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [cbegin](./cbegin/)() const | Mengembalikan iterator ke elemen pertama yang dikualifikasi const dari kontainer. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [cend()](./cend/). |
| [cend](./cend/)() const | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| [Clear](./clear/)() override | Tidak didukung karena array yang direpresentasikan oleh objek saat ini bersifat read-only. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Mengganti **count** nilai mulai dari indeks **startIndex** dalam array yang ditentukan dengan nilai default. |
| [Clone](./clone/)() | Menggandakan array. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Menyalin rentang elemen dari [System.Array](./) mulai dari sumber yang ditentukan. |
| [Contains](./contains/)(const T\&) const override | Menentukan apakah item yang ditentukan ada di dalam array. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Membuat sebuah [Array](./) baru dan mengisinya dengan elemen dari array yang ditentukan yang dikonversi ke tipe **OutputType** menggunakan delegasi konverter yang ditentukan. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Membuat sebuah [Array](./) baru dan mengisinya dengan elemen dari array yang ditentukan yang dikonversi ke tipe **OutputType** menggunakan objek fungsi konverter yang ditentukan. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber ke array tujuan. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Menyalin sejumlah elemen yang ditentukan dari tampilan array sumber ke array tujuan. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber ke tampilan array tujuan. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Menyalin sejumlah elemen yang ditentukan dari tampilan array sumber ke tampilan array tujuan. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber pada stack ke array tujuan. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber ke array tujuan pada stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber pada stack ke array tujuan pada stack. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari tampilan array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam tampilan array tujuan. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari tampilan array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam tampilan array tujuan. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber pada stack mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan pada stack. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari array sumber pada stack mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan pada stack. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Menyalin sejumlah elemen yang ditentukan dari tampilan array sumber mulai pada indeks yang ditentukan ke posisi yang ditentukan dalam array tujuan pada stack. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Menyalin semua elemen dari array saat ini ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai pada indeks yang ditentukan oleh argumen arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Menyalin semua elemen dari array saat ini ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Menyalin semua elemen dari array saat ini ke tampilan array tujuan yang ditentukan. Elemen dimasukkan ke dalam tampilan array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Menyalin sejumlah elemen yang ditentukan dari array saat ini mulai dari posisi yang ditentukan ke array tujuan yang ditentukan. Elemen dimasukkan ke dalam array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Menyalin sejumlah elemen yang ditentukan dari array saat ini mulai dari posisi yang ditentukan ke tampilan array tujuan yang ditentukan. Elemen dimasukkan ke dalam tampilan array tujuan mulai dari indeks yang ditentukan oleh argumen dstIndex. |
| [Count](./count/)() const | Mengembalikan sebuah angka yang mewakili total jumlah semua elemen di semua dimensi array. |
| [crbegin](./crbegin/)() const | Mengembalikan reverse iterator ke elemen pertama dari kontainer terbalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak terbalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [crend()](./crend/). |
| [crend](./crend/)() const | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| [data](./data/)() | Mengembalikan referensi ke struktur data internal yang digunakan untuk menyimpan elemen array. |
| [data](./data/)() const | Mengembalikan referensi konstan ke struktur data internal yang digunakan untuk menyimpan elemen array. |
| [data_ptr](./data_ptr/)() | Mengembalikan pointer mentah ke awal buffer memori tempat elemen array disimpan. |
| [data_ptr](./data_ptr/)() const | Mengembalikan pointer mentah konstan ke awal buffer memori tempat elemen array disimpan. |
| [end](./end/)() | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| [end](./end/)() const | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer yang dikualifikasi const. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Menentukan apakah objek [Array](./) yang ditentukan berisi elemen yang memenuhi persyaratan predikat yang ditentukan. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Mencari elemen pertama dalam array yang ditentukan yang memenuhi kondisi predikat yang ditentukan. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Mengambil semua elemen yang cocok dengan kondisi yang didefinisikan oleh predikat yang ditentukan. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Mencari elemen pertama dalam array yang ditentukan yang memenuhi kondisi predikat yang ditentukan. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Melakukan aksi yang ditentukan pada setiap elemen dari array yang ditentukan. |
| [get_Count](./get_count/)() const override | Mengembalikan ukuran array. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Menunjukkan apakah array bersifat read-only. |
| [get_Length](./get_length/)() const | Mengembalikan integer 32-bit yang mewakili total jumlah semua elemen di semua dimensi array. |
| [get_LongLength](./get_longlength/)() const | Mengembalikan integer 64-bit yang mewakili total jumlah semua elemen di semua dimensi array. |
| [get_Rank](./get_rank/)() const | BELUM DIIMPLEMENTASIKAN. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan pointer ke objek [Enumerator](./enumerator/) yang menyediakan antarmuka IEnumerator untuk elemen array yang diwakili oleh objek saat ini. |
| [GetLength](./getlength/)(int) | Mengembalikan jumlah elemen dalam dimensi yang ditentukan. |
| [GetLongLength](./getlonglength/)(int) | Mengembalikan jumlah elemen dalam dimensi yang ditentukan sebagai integer 64-bit. |
| [GetLowerBound](./getlowerbound/)(int) const | Mengembalikan batas bawah dari dimensi yang ditentukan. |
| [GetSizeTLength](./getsizetlength/)() const | Mengembalikan variabel std::size_t yang mewakili total jumlah semua elemen di semua dimensi array. |
| [GetUpperBound](./getupperbound/)(int) | Mengembalikan batas atas dari dimensi yang ditentukan. |
| [idx_get](./idx_get/)(int) const override | Mengembalikan item pada indeks yang ditentukan. |
| [idx_set](./idx_set/)(int, T) override | Menetapkan nilai yang ditentukan sebagai item array pada indeks yang ditentukan. |
| [IndexOf](./indexof/)(const T\&) const override | Menentukan indeks kemunculan pertama dari item yang ditentukan dalam array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Menentukan indeks kemunculan pertama dari item yang ditentukan dalam array. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Menentukan indeks kemunculan pertama dari item yang ditentukan dalam array mulai dari indeks yang ditentukan. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Menentukan indeks kemunculan pertama dari item yang ditentukan dalam rentang item array yang ditentukan oleh indeks mulai dan jumlah elemen dalam rentang tersebut. |
| [Init](./init/)(const T) | Mengisi array yang diwakili oleh objek saat ini dengan nilai-nilai dari array yang ditentukan. |
| [Initialize](./initialize/)() | Mengisi array dengan objek yang dibangun secara default berjenis **T**. |
| [Insert](./insert/)(int, const T\&) override | Tidak didukung karena array yang diwakili oleh objek saat ini bersifat read-only. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Menentukan indeks kemunculan terakhir dari item yang ditentukan dalam rentang item array yang ditentukan oleh indeks mulai dan jumlah elemen dalam rentang tersebut. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Menentukan indeks kemunculan terakhir dari item yang ditentukan dalam array mulai dari indeks yang ditentukan. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Menentukan indeks kemunculan terakhir dari item yang ditentukan dalam array. |
| [Max](./max/)() const | Menemukan elemen terbesar dalam array menggunakan [operator<()](../operator_/) untuk membandingkan elemen. |
| [Min](./min/)() const | Menemukan elemen terkecil dalam array menggunakan [operator<()](../operator_/) untuk membandingkan elemen. |
| [operator[]](./operator[]/)(int) | Mengembalikan sebuah item pada indeks yang ditentukan. |
| [operator[]](./operator[]/)(int) const | Mengembalikan sebuah item pada indeks yang ditentukan. |
| [rbegin](./rbegin/)() | Mengembalikan iterator terbalik ke elemen pertama dari kontainer yang dibalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak dibalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Mengembalikan iterator terbalik ke elemen pertama dari kontainer yang dibalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak dibalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Tidak didukung karena array yang direpresentasikan oleh objek saat ini bersifat read-only. |
| [RemoveAt](./removeat/)(int) override | Tidak didukung karena array yang diwakili oleh objek saat ini bersifat read-only. |
| [rend](./rend/)() | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| [rend](./rend/)() const | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Mengubah ukuran array yang ditentukan ke nilai yang ditentukan atau membuat array baru dengan ukuran yang ditentukan. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Membalik urutan elemen dalam array yang ditentukan. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Membalik urutan rentang elemen dalam array yang ditentukan. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Membuat array memperlakukan pointer yang disimpan sebagai lemah (jika berlaku). |
| [SetValue](./setvalue/)(const T\&, int) | Menetapkan nilai elemen pada indeks yang ditentukan. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Mengurutkan elemen dalam array yang ditentukan menggunakan pembanding default. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Mengurutkan rentang elemen dalam array yang ditentukan menggunakan pembanding default. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Mengurutkan elemen dalam array yang ditentukan menggunakan pembanding yang ditentukan. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | BELUM DIIMPLEMENTASIKAN. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Mengurutkan dua array, satu berisi kunci dan yang lainnya berisi item yang sesuai, berdasarkan nilai array yang berisi kunci, elemen-elemennya dibandingkan menggunakan operator<. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Mengurutkan dua array, satu berisi kunci dan yang lainnya berisi item yang sesuai, berdasarkan nilai array yang berisi kunci, elemen-elemennya dibandingkan menggunakan pembanding default. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Menentukan apakah semua elemen dalam array yang ditentukan memenuhi kondisi yang didefinisikan oleh predikat yang ditentukan. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [EnumerablePtr](./enumerableptr/) | Alias untuk tipe pointer bersama yang menunjuk ke objek IEnumerable yang berisi elemen berjenis **T**. |
| [EnumeratorPtr](./enumeratorptr/) | Alias untuk tipe shared pointer yang menunjuk ke objek IEnumerator yang berisi elemen berjenis **T**. |
| [iterator](./iterator/) | Tipe iterator. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
| [UnderlyingType](./underlyingtype/) | Alias untuk tipe yang digunakan untuk merepresentasikan setiap elemen array. |
| [ValueType](./valuetype/) | Alias untuk tipe elemen array. |
## Catatan



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Buat dan isi array.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Cetak item array.
  Print(arrayPtr);

  // Urutkan item array secara naik.
  Array<int32_t>::Sort(arrayPtr);

  // Cetak item array.
  Print(arrayPtr);

  // Cetak jumlah item array.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Cetak indeks item yang bernilai 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Ubah ukuran array.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Cetak item array.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## Lihat Juga

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
