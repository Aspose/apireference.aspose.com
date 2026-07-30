---
title: "System::Collections::BitArray sınıfı"
linktitle: "BitArray"
second_title: "Aspose.Font için C++"
description: "System::Collections::BitArray sınıfı. İndeks ile adreslenebilen bit dizisi. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const bool\&) override | Değeri konteynerin sonuna ekler. |
| [And](./and/)(const BitArrayPtr\&) | İki BitSet arasında bit düzeyinde 'and' işlemini hesaplar. |
| [BitArray](./bitarray/)(const bitset\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(const BitArray\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Kopya yapıcı. |
| [BitArray](./bitarray/)(int, bool) | Doldurma yapıcı. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Contains](./contains/)(const bool\&) const override | Belirli bir değerin konteynerde bulunup bulunmadığını kontrol eder. Henüz uygulanmadı. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Verileri mevcut dizi elemanlarına kopyalar. |
| [data](./data/)() | Altta yatan veri yapısına erişim. |
| [data](./data/)() const | Altta yatan veri yapısına erişim. |
| [Get](./get/)(int) const | [BitArray](./) elemanını alır. |
| [get_Count](./get_count/)() const override | Konteyner boyutunu alır. |
| [get_Length](./get_length/)() const | Konteyner boyutunu alır. |
| [GetEnumerator](./getenumerator/)() override | Enumerator nesnesi oluşturur. |
| [idx_get](./idx_get/)(int) const | Alıcı işlev. |
| [idx_set](./idx_set/)(int, bool) | Ayarlayıcı işlev. |
| [Not](./not/)() | BitSet'i olumsuzlar. |
| [operator!=](./operator!=/)(const BitArray\&) const | Bit düzeyinde karşılaştırma operatörü. |
| [operator==](./operator==/)(const BitArray\&) const | Bit düzeyinde karşılaştırma operatörü. |
| [operator[]](./operator[]/)(int) | Erişimci işlev. |
| [Or](./or/)(const BitArrayPtr\&) | İki BitSet arasında bit düzeyinde 'or' işlemini hesaplar. |
| [Remove](./remove/)(const bool\&) override | Belirtilen değerin ilk oluşumunu döndürür. Henüz uygulanmadı. |
| [Set](./set/)(int, bool) | [BitArray](./) elemanını ayarlar. |
| [SetAll](./setall/)(bool) | Tüm elemanları belirli bir değere ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Zayıf şablon argümanları mekanizmasının resmi uygulanması; bu sınıfa uygulanamaz. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
| [Xor](./xor/)(const BitArrayPtr\&) | İki BitSet arasında bit düzeyinde 'xor' hesaplar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [bitset](./bitset/) | RTTI bilgisi. |
## Açıklamalar



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // BitArray sınıfının yeni bir örneğini oluşturur.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Değerleri yazdır.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
