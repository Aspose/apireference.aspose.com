---
title: "System::Collections::Concurrent::ConcurrentDictionary sınıfı"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page için C++"
description: "System::Collections::Concurrent::ConcurrentDictionary sınıfı. İş parçacığı güvenli sözlük uygulaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


İş parçacığı güvenli sözlük uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Sözlüğe değer ekler. |
| [Clear](./clear/)() override | Konteynerdeki tüm öğeleri siler. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Konteyner öğelerini mevcut dizi öğelerine kopyalar. |
| [get_KeysInternal](./get_keysinternal/)() const override | Sözlük anahtarlarına erişmek için sarmalayıcı koleksiyonunu alır. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI bilgisi. |
| [Remove](./remove/)(const TKey\&) override | Konteynerden öğeyi kaldırır. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Sözlüğe anahtar/değer çiftini eklemeye çalışır. |
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

  // ConcurrentDictionary sınıfı örneğini oluşturun.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // ConcurrentDictionary sözlüğünü doldurun.
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
* Library [Aspose.Page for C++](../../)
