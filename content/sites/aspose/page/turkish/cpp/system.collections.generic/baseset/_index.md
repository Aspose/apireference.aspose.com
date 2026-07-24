---
title: "System::Collections::Generic::BaseSet sınıfı"
linktitle: "BaseSet"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::BaseSet sınıfını C++'ta nasıl kullanılır."
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
| [Add](./add/)(const T\&) override | Kümeye bir öğe ekler. |
| [begin](./begin/)() const | Sabit nitelikli koleksiyonun ilk elemanına bir yineleyici (iterator) alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundan sonraki mevcut olmayan const-nitelikli öğe için yineleyici alır. |
| [Clear](./clear/)() override | Kümedeki tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | Elemanın kümede bulunup bulunmadığını denetler. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Karma (hash) içeriğini mevcut dizi öğelerine kopyalar. |
| [data](./data/)() | Temel veri yapısı erişicisi. |
| [data](./data/)() const | Temel veri yapısı erişicisi. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundan sonraki mevcut olmayan öğe için yineleyici alır. |
| [get_Count](./get_count/)() const override | Kümedeki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | İteratör oluşturur. |
| [Remove](./remove/)(const T\&) override | Öğeyi kümeden kaldırır. |
| [TryAdd](./tryadd/)(const T\&) | Kümeye bir öğe ekler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arayüz. |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [IEnumerablePtr](./ienumerableptr/) | Enumerable arabirim işaretçisi. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) işaretçisi. |
| [iterator](./iterator/) | Yineleyici türü. |
| [set_t](./set_t/) | Temel veri tipi. |
| [ThisPtr](./thisptr/) | İşaretçi türü. |
| [ThisType](./thistype/) | Kendi tipi. |
| [ValueType](./valuetype/) | Değer türü. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
