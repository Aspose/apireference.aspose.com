---
title: "System::Array sınıfı"
linktitle: "Dizi"
second_title: "Aspose.Font için C++"
description: "System::Array sınıfı. Dizi veri yapısını temsil eden sınıf. Bu sınıfın nesneleri yalnızca System::MakeArray() ve System::MakeObject() işlevleri kullanılarak ayrılmalıdır. Bu tipin örneğini yığında veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system/array/
---
## Array class


Array veri yapısını temsil eden sınıf. Bu sınıfın nesneleri yalnızca [System::MakeArray()](../makearray/) ve [System::MakeObject()](../makeobject/) işlevleri kullanılarak ayrılmalıdır. Bu tipin örneğini yığında veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Bir dizinin öğelerinin türü |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunur. |
| [Array](./array/)() | Boş bir dizi oluşturur. |
| [Array](./array/)(int, const T\&) | Dolgu kurucusu. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Dolgu kurucusu. |
| [Array](./array/)(int, const T) | Dolgu kurucusu. |
| [Array](./array/)(vector_t\&&) | Taşıma kurucusu. |
| [Array](./array/)(const vector_t\&) | Kopya yapıcı. |
| [Array](./array/)(const std::vector\<Q\>\&) | Bir [Array](./) nesnesi oluşturur ve değerlerini, değer türü **T** ile aynı ancak **[UnderlyingType](./underlyingtype/)**'den farklı olan bir std::vector nesnesinden kopyalanan değerlerle doldurur. |
| [Array](./array/)(std::vector\<Q\>\&&) | Bir [Array](./) nesnesi oluşturur ve değerlerini, değer türü **T** ile aynı ancak **[UnderlyingType](./underlyingtype/)**'den farklı olan bir std::vector nesnesinden taşınan değerlerle doldurur. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Belirtilen başlatıcı listeden, **[UnderlyingType](./underlyingtype/)** türünde öğeler içeren değerlerle bir [Array](./) nesnesi oluşturur ve doldurur. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Belirtilen diziden, **[UnderlyingType](./underlyingtype/)** türünde öğeler içeren değerlerle bir [Array](./) nesnesi oluşturur ve doldurur. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Belirtilen başlatıcı listeden, bool türünde öğeler içeren değerlerle bir [Array](./) nesnesi oluşturur ve doldurur. |
| [begin](./begin/)() | Konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) değerine eşit olur. |
| [begin](./begin/)() const | Const nitelikli konteynerin ilk elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [end()](./end/) değerine eşit olur. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Sıralı dizide ikili arama gerçekleştirir. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | UYGULANMADI. |
| [cbegin](./cbegin/)() const | Konteynerin ilk const nitelikli elemanına bir yineleyici döndürür. Konteyner boşsa, döndürülen yineleyici [cend()](./cend/) değerine eşit olur. |
| [cend](./cend/)() const | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [Clear](./clear/)() override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunur. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | **count** değerlerini, belirtilen dizide **startIndex** indeksinden başlayarak varsayılan değerlerle değiştirir. |
| [Clone](./clone/)() | Diziyi klonlar. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen kaynaktan başlayarak bir [System.Array](./) aralığındaki öğeleri kopyalar. |
| [Contains](./contains/)(const T\&) const override | Belirtilen öğenin dizide olup olmadığını belirler. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Yeni bir [Array](./) nesnesi oluşturur ve belirtilen dönüştürücü temsilcisi kullanılarak **OutputType** türüne dönüştürülmüş belirtilen dizinin öğeleriyle doldurur. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Yeni bir [Array](./) nesnesi oluşturur ve belirtilen dönüştürücü fonksiyon nesnesi kullanılarak **OutputType** türüne dönüştürülmüş belirtilen dizinin öğeleriyle doldurur. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Belirtilen sayıda öğeyi kaynak diziden hedef diziye kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef diziye kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Belirtilen sayıda öğeyi kaynak diziden hedef dizi görünümüne kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Belirtilen sayıda öğeyi kaynak dizi görünümünden hedef dizi görünümüne kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Yığında bulunan kaynak diziden hedef diziye belirtilen sayıda öğeyi kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Kaynak diziden yığında bulunan hedef diziye belirtilen sayıda öğeyi kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Yığında bulunan kaynak diziden yığında bulunan hedef diziye belirtilen sayıda öğeyi kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen indeksten başlayarak kaynak diziden belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Belirtilen indeksten başlayarak kaynak dizi görünümünden belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Belirtilen indeksten başlayarak kaynak diziden belirtilen sayıda öğeyi hedef dizi görünümünde belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Belirtilen indeksten başlayarak kaynak dizi görünümünden belirtilen sayıda öğeyi hedef dizi görünümünde belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Yığında bulunan kaynak diziden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Belirtilen indeksten başlayarak kaynak diziden, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Yığında bulunan kaynak diziden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Kaynak dizi görünümünden, belirtilen indeksten başlayarak, belirtilen sayıda öğeyi yığında bulunan hedef dizide belirtilen konuma kopyalar. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Mevcut dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, arrayIndex argümanı ile belirtilen indeksten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Mevcut dizinin tüm öğelerini belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı ile belirtilen indeksten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Mevcut dizinin tüm öğelerini belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı ile belirtilen indeksten başlayarak hedef dizi görünümüne eklenir. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Belirtilen konumdan başlayarak geçerli diziden belirtilen sayıda öğeyi belirtilen hedef diziye kopyalar. Öğeler, dstIndex argümanı ile belirtilen indeksten başlayarak hedef diziye eklenir. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Belirtilen konumdan başlayarak geçerli diziden belirtilen sayıda öğeyi belirtilen hedef dizi görünümüne kopyalar. Öğeler, dstIndex argümanı ile belirtilen indeksten başlayarak hedef dizi görünümüne eklenir. |
| [Count](./count/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden bir sayı döndürür. |
| [crbegin](./crbegin/)() const | Ters çevrilmiş konteynerin ilk elemanına bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin son elemanına karşılık gelir. Konteyner boşsa, döndürülen yineleyici [crend()](./crend/) değerine eşit olur. |
| [crend](./crend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [data](./data/)() | Dizi öğelerini depolamak için kullanılan iç veri yapısına bir referans döndürür. |
| [data](./data/)() const | Dizi öğelerini depolamak için kullanılan iç veri yapısına sabit bir referans döndürür. |
| [data_ptr](./data_ptr/)() | Dizi öğelerinin depolandığı bellek tamponunun başlangıcına ham bir işaretçi döndürür. |
| [data_ptr](./data_ptr/)() const | Dizi öğelerinin depolandığı bellek tamponunun başlangıcına sabit bir ham işaretçi döndürür. |
| [end](./end/)() | Konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [end](./end/)() const | Const nitelikli konteynerin son elemanını takiben gelen elemana bir yineleyici döndürür. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Belirtilen [Array](./) nesnesinin, belirtilen koşulu sağlayan bir öğe içerip içermediğini belirler. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizide, belirtilen koşulun şartlarını sağlayan ilk öğeyi arar. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen koşul tarafından tanımlanan şartları karşılayan tüm öğeleri alır. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizide, belirtilen koşulun şartlarını sağlayan ilk öğeyi arar. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Belirtilen dizinin her bir öğesi üzerinde belirtilen eylemi gerçekleştirir. |
| [get_Count](./get_count/)() const override | Dizinin boyutunu döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Dizinin yalnızca okunur olup olmadığını gösterir. |
| [get_Length](./get_length/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden 32-bit tamsayı döndürür. |
| [get_LongLength](./get_longlength/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden 64-bit tamsayı döndürür. |
| [get_Rank](./get_rank/)() const | UYGULANMADI. |
| [GetEnumerator](./getenumerator/)() override | Geçerli nesne tarafından temsil edilen dizinin öğelerine IEnumerator arayüzü sağlayan bir [Enumerator](./enumerator/) nesnesine işaretçi döndürür. |
| [GetLength](./getlength/)(int) | Belirtilen boyuttaki öğe sayısını döndürür. |
| [GetLongLength](./getlonglength/)(int) | Belirtilen boyuttaki öğe sayısını 64-bit tamsayı olarak döndürür. |
| [GetLowerBound](./getlowerbound/)(int) const | Belirtilen boyutun alt sınırını döndürür. |
| [GetSizeTLength](./getsizetlength/)() const | Dizinin tüm boyutlarındaki tüm öğelerin toplam sayısını temsil eden bir std::size_t değişkeni döndürür. |
| [GetUpperBound](./getupperbound/)(int) | Belirtilen boyutun üst sınırını döndürür. |
| [idx_get](./idx_get/)(int) const override | Belirtilen indeksteki öğeyi döndürür. |
| [idx_set](./idx_set/)(int, T) override | Belirtilen değeri, belirtilen indeksteki dizi öğesi olarak ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Dizide belirtilen öğenin ilk görülme konumunun indeksini belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Dizide belirtilen öğenin ilk görülme konumunun indeksini belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Belirtilen dizide, belirtilen indeksden başlayarak belirtilen öğenin ilk oluşumunun dizinini belirler. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığında, belirtilen öğenin ilk oluşumunun dizinini belirler. |
| [Init](./init/)(const T) | Geçerli nesne tarafından temsil edilen diziyi, belirtilen diziden gelen değerlerle doldurur. |
| [Initialize](./initialize/)() | **T** tipinde varsayılan oluşturulmuş nesnelerle diziyi doldurur. |
| [Insert](./insert/)(int, const T\&) override | Geçerli nesne tarafından temsil edilen dizi yalnızca okunabilir olduğundan desteklenmez. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Başlangıç indeksi ve aralıktaki öğe sayısı ile belirtilen dizi öğeleri aralığında, belirtilen öğenin son oluşumunun dizinini belirler. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Belirtilen dizide, belirtilen indeksden başlayarak belirtilen öğenin son oluşumunun dizinini belirler. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Belirtilen dizide belirtilen öğenin son oluşumunun dizinini belirler. |
| [Max](./max/)() const | Dizideki en büyük öğeyi, öğeleri karşılaştırmak için [operator<()](../operator_/) kullanarak bulur. |
| [Min](./min/)() const | Dizideki en küçük öğeyi, öğeleri karşılaştırmak için [operator<()](../operator_/) kullanarak bulur. |
| [operator[]](./operator[]/)(int) | Belirtilen indeksteki bir öğeyi döndürür. |
| [operator[]](./operator[]/)(int) const | Belirtilen indeksteki bir öğeyi döndürür. |
| [rbegin](./rbegin/)() | Ters çevrilmiş konteynerin ilk öğesine bir ters iterator döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen iterator [rend()](./rend/) ile eşittir. |
| [rbegin](./rbegin/)() const | Ters çevrilmiş konteynerin ilk öğesine bir ters iterator döndürür. Bu, ters çevrilmemiş konteynerin son öğesine karşılık gelir. Eğer konteyner boşsa, döndürülen iterator [rend()](./rend/) ile eşittir. |
| [Remove](./remove/)(const T\&) override | Desteklenmiyor çünkü mevcut nesne tarafından temsil edilen dizi yalnızca okunur. |
| [RemoveAt](./removeat/)(int) override | Geçerli nesne tarafından temsil edilen dizi yalnızca okunabilir olduğundan desteklenmez. |
| [rend](./rend/)() | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| [rend](./rend/)() const | Ters çevrilmiş konteynerin son elemanını takiben gelen elemana bir ters yineleyici döndürür. Bu, ters çevrilmemiş konteynerin ilk elemanından önceki elemana karşılık gelir. Bu eleman bir yer tutucu görevi görür; ona erişmeye çalışmak tanımsız davranışa yol açar. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Belirtilen dizinin boyutunu belirtilen değere değiştirir veya belirtilen boyutta yeni bir dizi oluşturur. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Belirtilen dizideki öğeleri tersine çevirir. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Belirtilen dizideki bir öğe aralığını tersine çevirir. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Dizinin saklanan işaretçileri zayıf olarak ele almasını sağlar (uygunsa). |
| [SetValue](./setvalue/)(const T\&, int) | Belirtilen indeksteki öğenin değerini ayarlar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Belirtilen dizideki öğeleri varsayılan karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Belirtilen dizideki bir öğe aralığını varsayılan karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Belirtilen dizideki öğeleri belirtilen karşılaştırıcıyı kullanarak sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | UYGULANMADI. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Anahtarları içeren bir dizi ve diğer dizi - karşılık gelen öğeler, anahtarları içeren dizinin değerlerine göre, öğeleri operator< kullanılarak karşılaştırılarak iki diziyi sıralar. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Anahtarları içeren bir dizi ve diğer dizi - karşılık gelen öğeler, anahtarları içeren dizinin değerlerine göre, öğeleri varsayılan karşılaştırıcıyı kullanarak karşılaştırılarak iki diziyi sıralar. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Belirtilen dizideki tüm öğelerin, belirtilen koşul tarafından tanımlanan koşulları sağlayıp sağlamadığını belirler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse iterator türü. |
| [EnumerablePtr](./enumerableptr/) | **T** tipinde öğeler içeren IEnumerable nesnesine işaret eden paylaşımlı işaretçi türü için bir takma ad. |
| [EnumeratorPtr](./enumeratorptr/) | **T** tipinde öğeler içeren IEnumerator nesnesine işaret eden paylaşımlı işaretçi türü için bir takma ad. |
| [iterator](./iterator/) | Iterator türü. |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
| [UnderlyingType](./underlyingtype/) | Dizideki her öğeyi temsil etmek için kullanılan türün takma adı. |
| [ValueType](./valuetype/) | Dizinin elemanlarının türü için takma ad. |
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

  // Dizi öğelerini artan sırayla sırala.
  Array<int32_t>::Sort(arrayPtr);

  // Dizi öğelerini yazdır.
  Print(arrayPtr);

  // Dizi öğelerinin sayısını yazdır.
  std::cout << arrayPtr->get_Length() << std::endl;

  // 4'e eşit olan öğenin indeksini yazdır.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Dizinin boyutunu değiştir.
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
* Library [Aspose.Font for C++](../../)
