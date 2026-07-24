---
title: "System::Collections::ObjectModel::KeyedCollection class"
linktitle: "KeyedCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::ObjectModel::KeyedCollection sınıfı. Gömülü anahtarları olan öğelerin soyut koleksiyonu. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Gömülü anahtarları olan öğelerin soyut koleksiyonu. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parameter | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TItem | değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Öğeyi konteynerin sonuna ekle. |
| [Contains](./contains/)(TKey) | Anahtarın konteynerde bulunup bulunmadığını kontrol eder. |
| [get_Comparer](./get_comparer/)() | Karşılaştırıcıyı al. |
| [idx_get](./idx_get/)(TKey) | Belirli bir indeksteki öğeyi al. |
| [Remove](./remove/)(TKey) | Anahtarı konteynerden kaldırır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Belirli şablon argümanının paylaşımlı işaretçi yerine zayıf işaretçi olarak ele alınmasını sağlar (uygunsa). |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Sözlük oluşturma eşiği, varsayılan. |

## Ayrıca Bakınız

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
