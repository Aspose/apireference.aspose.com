---
title: "System::Collections::Generic::IEnumerator sınıfı"
linktitle: "IEnumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IEnumerator sınıfı. Öğeleri yineleyebilen bir enumeratorün arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2300
url: /tr/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


Enumerator arayüzü, bazı öğeler üzerinde yineleme yapmak için kullanılabilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | VirtualizedIterator sınıfı tarafından kullanılmak üzere yineleyiciyi hazırlar. |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi kopyalar. |
| virtual [Current](./current/)() const | Geçerli öğeyi alır. |
| virtual [get_Current](./get_current/)() const | Geçerli öğeyi alır. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. |
| [InitializeIterator](./initializeiterator/)() override | İlk [MoveNext()](./movenext/) çağrısını yapar ve enumerator nesnesini VirtualizedIterator tarafından kullanılmak üzere hazırlar. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | Virtualized iterator tarafından sahip olunan enumerator'ı işaretler. |
| virtual [MoveNext](./movenext/)() | Enumerator'ı bir sonraki öğeye taşır. Daha önce hiçbir öğe referans alınmamışsa, referansı mevcut ilk öğeye ayarlar. Eğer konteyner sonuna gelinmişse, hiçbir şey yapmaz. |
| virtual [Reset](./reset/)() | Sayacı ilk öğeden önceki konuma sıfırlar. |
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

  // Listenin yineleyicisini alın.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // Geçerli öğeyi alın ve yazdırın.
    std::cout << enumerator->get_Current() << ' ';
  }

  // Yineleyiciyi sıfırlayın.
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
* Library [Aspose.Page for C++](../../)
