---
title: "System::Collections::Generic::IEnumerator sınıfı"
linktitle: "IEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::IEnumerator sınıfı. Bazı öğeler üzerinde yineleme yapmak için kullanılabilen bir yineleyicinin arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2300
url: /tr/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Bazı öğeler üzerinde yineleme yapmak için kullanılabilecek bir enumerator arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | İteratörü VirtualizedIterator sınıfı tarafından kullanılmak üzere hazırlar. |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| virtual [Current](./current/)() const | Geçerli öğeyi alır. |
| virtual [get_Current](./get_current/)() const | Geçerli öğeyi alır. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. |
| [InitializeIterator](./initializeiterator/)() override | İlk [MoveNext()](./movenext/) çağrısını yapar ve enumeratör nesnesini VirtualizedIterator tarafından kullanılmak üzere hazırlar. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Sanal yineleyiciye ait enumeratörü işaretler. |
| virtual [MoveNext](./movenext/)() | Enumerator'ı bir sonraki elemana taşır. Daha önce bir elemana referans verilmemişse, referansı mevcut ilk elemana ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |
| virtual [Reset](./reset/)() | Enumeratörü ilk öğeden önceki konuma sıfırlar. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ValueType](./valuetype/) | Değer türü. |
## Açıklamalar



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // List sınıfı örneğini oluştur.
  auto collection = MakeObject<List<int>>();

  // Listeyi doldur.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // Listenin enumeratörünü al.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Mevcut öğeyi al ve yazdır.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Enumeratörü sıfırla.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
