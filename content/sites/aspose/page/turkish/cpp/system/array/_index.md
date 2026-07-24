---
title: "System::Array sınıfı"
linktitle: "Dizi"
second_title: "Aspose.Page için C++"
description: "System::Array sınıfı. Dizi veri yapısını temsil eden sınıf. Bu sınıfın nesneleri yalnızca System::MakeArray() ve System::MakeObject() işlevleri kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system/array/
---
## Array class


Dizi veri yapısını temsil eden sınıf. Bu sınıfın nesneleri yalnızca [System::MakeArray()](../makearray/) ve [System::MakeObject()](../makeobject/) işlevleri kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Bir dizinin öğelerinin tipi |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunabilir. |
| [Array](./array/)() | Boş bir dizi oluşturur. |
| [Array](./array/)(int, const T\&) | Dolgu kurucusu. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Dolgu kurucusu. |
| [Array](./array/)(int, const T) | Dolgu kurucusu. |
| [Array](./array/)(vector_t\&&) | Taşıma kurucusu. |
| [Array](./array/)(const vector_t\&) | Kopya yapıcı. |
| [Array](./array/)(const std::vector\<Q\>\&) | Bir [Array](./) nesnesi oluşturur ve değerlerini, değer tipi **T** ile aynı ancak **[UnderlyingType](./underlyingtype/)**'den farklı olan bir std::vector nesnesinden kopyalanan değerlerle doldurur. |
| [Array](./array/)(std::vector\<Q\>\&&) | Bir [Array](./) nesnesi oluşturur ve değerlerini, değer tipi **T** ile aynı ancak **[UnderlyingType](./underlyingtype/)**'den farklı olan bir std::vector nesnesinden taşınan değerlerle doldurur. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Bir [Array](./) nesnesi oluşturur ve değerlerini, **[UnderlyingType](./underlyingtype/)** tipinde öğeler içeren belirtilen başlatıcı listeden alır. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Belirtilen **[UnderlyingType](./underlyingtype/)** tipinde öğeler içeren belirtilen diziden değerlerle dolduran bir [Array](./) nesnesi oluşturur. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Belirtilen bool tipinde öğeler içeren başlatıcı listeden değerlerle dolduran bir [Array](./) nesnesi oluşturur. |
| [begin](./begin/)() | Konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) ile eşit olur. |
| [begin](./begin/)() const | Const nitelikli konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) ile eşit olur. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Sıralı dizide ikili arama gerçekleştirir. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | UYGULANMADI. |
| [cbegin](./cbegin/)() const | Konteynerin ilk const-nitelikli elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [cend()](./cend/) ile eşit olur. |
| [cend](./cend/)() const | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [Clear](./clear/)() override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunabilir. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Belirtilen dizide **startIndex** indeksinden başlayarak **count** değeri varsayılan değerlerle değiştirir. |
| [Clone](./clone/)() | Diziyi klonlar. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen kaynaktan başlayarak bir [System.Array](./) içindeki öğeler aralığını kopyalar. |
| [Contains](./contains/)(const T\&) const override | Belirtilen öğenin dizi içinde olup olmadığını belirler. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Belirtilen dönüştürücü temsilcisi kullanılarak **OutputType** tipine dönüştürülmüş belirtilen dizinin öğeleriyle dolduran yeni bir [Array](./) nesnesi oluşturur. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Belirtilen dönüştürücü fonksiyon nesnesi kullanılarak **OutputType** tipine dönüştürülmüş belirtilen dizinin öğeleriyle dolduran yeni bir [Array](./) nesnesi oluşturur. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Belirtilen sayıda öğeyi kaynak diziden hedef diziye kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef diziye kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Belirtilen sayıda öğeyi kaynak diziden hedef dizi görünümüne kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef dizi görünümüne kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Belirtilen sayıda öğeyi yığın üzerindeki kaynak diziden hedef diziye kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Belirtilen sayıda öğeyi kaynak diziden yığın üzerindeki hedef diziye kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Belirtilen sayıda öğeyi yığın üzerindeki kaynak diziden yığın üzerindeki hedef diziye kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak diziden hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak dizi görünümünden hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak diziden hedef dizi görünümünde belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak dizi görünümünden hedef dizi görünümünde belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan yığın üzerindeki kaynak diziden hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak diziden yığın üzerindeki hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan yığın üzerindeki kaynak diziden yığın üzerindeki hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Belirtilen sayıda öğeyi, belirtilen indeksden başlayan kaynak dizi görünümünden yığın üzerindeki hedef dizide belirtilen konuma kopyalar. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Geçerli dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, arrayIndex argümanı ile belirtilen indeksten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Geçerli dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Geçerli dizinin tüm öğelerini belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef dizi görünümüne eklenir. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Geçerli diziden belirtilen konumda başlayan belirtilen sayıda öğeyi belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Geçerli diziden belirtilen konumda başlayan belirtilen sayıda öğeyi belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı tarafından belirtilen indeks'ten başlayarak hedef dizi görünümüne eklenir. |
| [Count](./count/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden bir sayı döndürür. |
| [crbegin](./crbegin/)() const | Ters çevrilmiş konteynerin ilk elemanına bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son elemanına karşılık gelir. Konteyner boşsa, döndürülen yineleyici [crend()](./crend/) ile eşit olur. |
| [crend](./crend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [data](./data/)() | Dizi öğelerini depolamak için kullanılan iç veri yapısına bir referans döndürür. |
| [data](./data/)() const | Dizi öğelerini depolamak için kullanılan iç veri yapısına sabit bir referans döndürür. |
| [data_ptr](./data_ptr/)() | Dizi öğelerinin depolandığı bellek tamponunun başlangıcına ham bir işaretçi döndürür. |
| [data_ptr](./data_ptr/)() const | Dizi öğelerinin depolandığı bellek tamponunun başlangıcına sabit bir ham işaretçi döndürür. |
| [end](./end/)() | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [end](./end/)() const | Const-nitelikli konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Belirtilen [Array](./) nesnesinin, belirtilen koşulu sağlayan bir öğe içerip içermediğini belirler. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizide, belirtilen koşulu sağlayan ilk öğeyi arar. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen koşul tarafından tanımlanan koşullara uyan tüm öğeleri alır. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizide, belirtilen koşulu sağlayan ilk öğeyi arar. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Belirtilen dizinin her bir öğesi üzerinde belirtilen eylemi gerçekleştirir. |
| [get_Count](./get_count/)() const override | Dizinin boyutunu döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Dizinin yalnızca okunur olup olmadığını gösterir. |
| [get_Length](./get_length/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden 32‑bit tamsayı döndürür. |
| [get_LongLength](./get_longlength/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden 64‑bit tamsayı döndürür. |
| [get_Rank](./get_rank/)() const | UYGULANMADI. |
| [GetEnumerator](./getenumerator/)() override | Geçerli nesne tarafından temsil edilen dizinin öğelerine IEnumerator arayüzü sağlayan [Enumerator](./enumerator/) nesnesine bir işaretçi döndürür. |
| [GetLength](./getlength/)(int) | Belirtilen boyuttaki öğe sayısını döndürür. |
| [GetLongLength](./getlonglength/)(int) | Belirtilen boyuttaki öğe sayısını 64‑bit tamsayı olarak döndürür. |
| [GetLowerBound](./getlowerbound/)(int) const | Belirtilen boyutun alt sınırını döndürür. |
| [GetSizeTLength](./getsizetlength/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden bir std::size_t değişkeni döndürür. |
| [GetUpperBound](./getupperbound/)(int) | Belirtilen boyutun üst sınırını döndürür. |
| [idx_get](./idx_get/)(int) const override | Belirtilen indeksteki öğeyi döndürür. |
| [idx_set](./idx_set/)(int, T) override | Belirtilen değeri, belirtilen indeksteki dizi öğesi olarak ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Belirtilen öğenin dizideki ilk oluşumunun dizinini belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Belirtilen öğenin dizideki ilk oluşumunun dizinini belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Belirtilen öğenin dizideki ilk oluşumunun dizinini, belirtilen dizinden başlayarak belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Belirtilen öğenin, başlangıç dizini ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığındaki ilk oluşumunun dizinini belirler. |
| [Init](./init/)(const T) | Mevcut nesne tarafından temsil edilen diziyi, belirtilen diziden gelen değerlerle doldurur. |
| [Initialize](./initialize/)() | Diziyi, **T** tipinde varsayılan oluşturulmuş nesnelerle doldurur. |
| [Insert](./insert/)(int, const T\&) override | Dizi, mevcut nesne tarafından temsil edildiği için yalnızca okunabilir olduğundan desteklenmez. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Belirtilen öğenin, başlangıç dizini ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığındaki son oluşumunun dizinini belirler. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Belirtilen öğenin dizideki son oluşumunun dizinini, belirtilen dizinden başlayarak belirler. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Belirtilen öğenin dizideki son oluşumunun dizinini belirler. |
| [Max](./max/)() const | Dizideki en büyük öğeyi, öğeleri karşılaştırmak için [operator<()](../operator_/) kullanarak bulur. |
| [Min](./min/)() const | Dizideki en küçük öğeyi, öğeleri karşılaştırmak için [operator<()](../operator_/) kullanarak bulur. |
| [operator[]](./operator[]/)(int) | Belirtilen dizindeki bir öğeyi döndürür. |
| [operator[]](./operator[]/)(int) const | Belirtilen dizindeki bir öğeyi döndürür. |
| [rbegin](./rbegin/)() | Ters çevrilmiş konteynerin ilk öğesine bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen yineleyici [rend()](./rend/) ile eşittir. |
| [rbegin](./rbegin/)() const | Ters çevrilmiş konteynerin ilk öğesine bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen yineleyici [rend()](./rend/) ile eşittir. |
| [Remove](./remove/)(const T\&) override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunabilir. |
| [RemoveAt](./removeat/)(int) override | Dizi, mevcut nesne tarafından temsil edildiği için yalnızca okunabilir olduğundan desteklenmez. |
| [rend](./rend/)() | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [rend](./rend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Belirtilen dizinin boyutunu belirtilen değere değiştirir veya belirtilen boyutta yeni bir dizi oluşturur. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Belirtilen dizideki öğeleri tersine çevirir. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Belirtilen dizideki bir öğe aralığını tersine çevirir. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Dizinin saklanan işaretçileri zayıf olarak ele almasını sağlar (uygulanabilir ise). |
| [SetValue](./setvalue/)(const T\&, int) | Belirtilen dizindeki öğenin değerini ayarlar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Belirtilen dizideki öğeleri varsayılan karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Belirtilen dizideki bir öğe aralığını varsayılan karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Belirtilen dizideki öğeleri belirtilen karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | UYGULANMADI. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Anahtarları içeren bir dizi ve diğer dizi - karşılık gelen öğeler - anahtar dizisinin değerlerine göre, öğeleri operator< kullanılarak karşılaştırılan bir diziye göre sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Anahtarları içeren bir dizi ve diğer dizi - karşılık gelen öğeler - anahtar dizisinin değerlerine göre, öğeleri varsayılan karşılaştırıcı kullanılarak karşılaştırılan bir diziye göre sıralar. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizideki tüm öğelerin, belirtilen koşulu tanımlayan önermeyi karşılayıp karşılamadığını belirler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Sabit ters yineleyici türü. |
| [EnumerablePtr](./enumerableptr/) | An alias for shared pointer type pointing to IEnumerable object containing elements of type **T**. |
| [EnumeratorPtr](./enumeratorptr/) | Tip **T** elemanlarını içeren IEnumerator nesnesine işaret eden paylaşımlı gösterici türü için bir takma ad. |
| [iterator](./iterator/) | Yineleyici türü. |
| [reverse_iterator](./reverse_iterator/) | Ters yineleyici türü. |
| [UnderlyingType](./underlyingtype/) | Dizinin her bir elemanını temsil etmek için kullanılan tür için bir takma ad. |
| [ValueType](./valuetype/) | Dizinin elemanlarının türü için bir takma ad. |
## Açıklamalar



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
  // Diziyi oluştur ve doldur.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Dizi öğelerini yazdır.
  Print(arrayPtr);

  // Dizi öğelerini artan şekilde sırala.
  Array<int32_t>::Sort(arrayPtr);

  // Dizi öğelerini yazdır.
  Print(arrayPtr);

  // Dizi öğelerinin sayısını yazdır.
  std::cout << arrayPtr->get_Length() << std::endl;

  // 4'e eşit olan öğenin indeksini yazdır.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Diziyi yeniden boyutlandır.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Dizi öğelerini yazdır.
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

## Ayrıca Bakınız

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
