---
title: "System::Collections::Concurrent::ConcurrentDictionary sınıfı"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Font için C++"
description: "System::Collections::Concurrent::ConcurrentDictionary sınıfı. İş parçacığı güvenli sözlük uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


İş parçacığı güvenli sözlük uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parametre | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Sözlüğe değer ekler. |
| [Clear](./clear/)() override | Kapsayıcıdaki tüm öğeleri siler. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Konteynır elemanlarını mevcut dizi elemanlarına kopyalar. |
| [get_KeysInternal](./get_keysinternal/)() const override | Sözlük anahtarlarına erişmek için sarmalayıcı koleksiyon alır. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI bilgisi. |
| [Remove](./remove/)(const TKey\&) override | Kapsayıcıdan öğeyi kaldırır. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Anahtar/değer çiftini sözlüğe eklemeyi dener. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulama türü. |
| [ThisType](./thistype/) | Bu tip. |
## Açıklamalar



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // ConcurrentDictionary sınıfı örneğini oluştur.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // ConcurrentDictionary sözlüğünü doldur.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Ayrıca Bakınız

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Font for C++](../../)
