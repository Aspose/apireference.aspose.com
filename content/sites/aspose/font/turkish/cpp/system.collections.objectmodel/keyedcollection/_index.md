---
title: "System::Collections::ObjectModel::KeyedCollection class"
linktitle: "KeyedCollection"
second_title: "Aspose.Font için C++"
description: "System::Collections::ObjectModel::KeyedCollection class. Gömülü anahtarlara sahip öğelerin soyut koleksiyonu. Bu sınıfın nesneleri yalnızca System::MakeObject() fonksiyonu kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 200
url: /tr/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


Gömülü anahtarlara sahip öğelerin soyut koleksiyonu. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) fonksiyonu kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| Parametre | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TItem | value türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const TItem\&) override | Öğeyi konteynerin sonuna ekle. |
| [Contains](./contains/)(TKey) | Anahtarın konteynerde bulunup bulunmadığını kontrol eder. |
| [get_Comparer](./get_comparer/)() | Karşılaştırıcıyı al. |
| [idx_get](./idx_get/)(TKey) | Belirli bir indeksteki öğeyi al. |
| [Remove](./remove/)(TKey) | Anahtarı konteynerden kaldırır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Belirli bir şablon argümanının, uygulanabilir ise, paylaşımlı işaretçi yerine zayıf işaretçi olarak ele alınmasını sağlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | Sözlük oluşturma eşiği, varsayılan. |

## Ayrıca Bakınız

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
