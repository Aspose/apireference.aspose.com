---
title: "System::Collections::ObjectModel::Collection class"
linktitle: "Koleksiyon"
second_title: "Aspose.Font için C++"
description: "System::Collections::ObjectModel::Collection sınıfı. Genel koleksiyon için temel tip. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections.objectmodel/collection/
---
## Collection class


Genel koleksiyon için temel tip. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Konteynere değer ekler. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Collection](./collection/)() | Boş koleksiyon oluşturur. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Öğenin koleksiyonda bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const-nitelikli elemanına (ters sırada ilk) bir ters yineleyici alır. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki mevcut olmayan const-nitelikli bir eleman için ters yineleyici alır. |
| [get_Count](./get_count/)() const override | Eleman sayısını alır. |
| [get_Items](./get_items/)() | Dahili veri yapısı erişicisi. |
| [get_Items](./get_items/)() const | Dahili veri yapısı erişicisi. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon içinde yineleme yapmak için döngüleyiciyi alır. |
| [idx_get](./idx_get/)(int) const override | Belirtilen indeksteki değeri alır. |
| [idx_set](./idx_set/)(int, T) override | Belirtilen indeksteki değeri ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Koleksiyonda eleman arar. |
| [Insert](./insert/)(int, const T\&) override | Öğeyi belirtilen konuma ekler. |
| [operator[]](./operator[]/)(int) | Belirtilen indeksteki değeri alır. |
| [operator[]](./operator[]/)(int) const | Belirtilen indeksteki değeri alır. |
| [rbegin](./rbegin/)() | Koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const-nitelikli koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Belirli öğeyi kaldırır. |
| [RemoveAt](./removeat/)(int) override | Belirli konumdaki öğeyi kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [rend](./rend/)() const | Const-nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Depolanan işaretçileri zayıf yapar (uygunsa). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Ayrıca Bakınız

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
