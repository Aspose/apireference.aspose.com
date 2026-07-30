---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::ObjectCollection sınıfı. C++'ta nesnelerin koleksiyonunu temsil eder."
type: docs
weight: 1600
url: /tr/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Nesnelerin koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Nesne türü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI bilgisi. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Yeni bir örnek oluşturur. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir gösterici (paylaşılan yerine) olarak ayarlayın. Kapsayıcılardaki göstericileri zayıf moda geçiş yapmayı sağlar. |

## Ayrıca Bakınız

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
