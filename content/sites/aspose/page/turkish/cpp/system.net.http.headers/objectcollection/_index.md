---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::Headers::ObjectCollection sınıfı. C++'ta nesnelerin koleksiyonunu temsil eder."
type: docs
weight: 1600
url: /tr/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Nesnelerin koleksiyonunu temsil eder.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Nesne türü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçmek için kullanın. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI bilgisi. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Yeni bir örnek oluşturur. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |

## Ayrıca Bakınız

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
