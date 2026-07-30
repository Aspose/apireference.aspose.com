---
title: "System::Collections::Generic::BaseSet sınıfı"
linktitle: "BaseSet"
second_title: "Aspose.Font için C++"
description: "C++'ta System::Collections::Generic::BaseSet sınıfını nasıl kullanılır."
type: docs
weight: 800
url: /tr/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++'a özgü. |
| [Add](./add/)(const T\&) override | Kümeye eleman ekler. |
| [begin](./begin/)() const | const nitelikli koleksiyonun ilk öğesine bir yineleyici alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine bir yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundaki mevcut olmayan const-nitelikli bir öğe için yineleyici alır. |
| [Clear](./clear/)() override | Kümeye ait tüm elemanları siler. |
| [Contains](./contains/)(const T\&) const override | Elemanın kümede bulunup bulunmadığını kontrol eder. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Hash içeriğini mevcut dizi elemanlarına kopyalar. |
| [data](./data/)() | Altta yatan veri yapısı erişicisi. |
| [data](./data/)() const | Altta yatan veri yapısı erişicisi. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundaki mevcut olmayan bir öğe için yineleyici alır. |
| [get_Count](./get_count/)() const override | Kümedeki eleman sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Sayacı oluşturur. |
| [Remove](./remove/)(const T\&) override | Kümeye ait elemanı kaldırır. |
| [TryAdd](./tryadd/)(const T\&) | Kümeye eleman ekler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arabirim. |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [IEnumerablePtr](./ienumerableptr/) | Yinelemeli arayüz işaretçisi. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) işaretçisi. |
| [iterator](./iterator/) | Iterator türü. |
| [set_t](./set_t/) | Temel veri tipi. |
| [ThisPtr](./thisptr/) | İşaretçi türü. |
| [ThisType](./thistype/) | Kendi türü. |
| [ValueType](./valuetype/) | Değer türü. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
