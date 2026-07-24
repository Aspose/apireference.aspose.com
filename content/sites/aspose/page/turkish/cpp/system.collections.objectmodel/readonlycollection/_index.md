---
title: "System::Collections::ObjectModel::ReadOnlyCollection sınıfı"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection sınıfı. Belirli bir konteyneri yalnızca okuma modunda erişmek için sarar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Belirli bir konteyneri yalnızca okuma modunda erişmek için sarar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Konteynerin belirli bir öğe içerip içermediğini kontrol eder. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Konteyner öğelerini mevcut dizi öğelerine kopyalar. |
| [get_Count](./get_count/)() const override | Konteyner öğelerinin sayısını alır. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Koleksiyonun yalnızca okunur olup olmadığını kontrol eder. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon yineleyicisini alır. |
| [idx_get](./idx_get/)(int) const override | Belirli konumdaki öğeyi alır. |
| [IndexOf](./indexof/)(const T\&) const override | Koleksiyonda belirli bir öğeyi arar. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Belirli bir koleksiyon etrafında yalnızca okuma koleksiyonunu sarar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Yalnızca okuma koleksiyonu sadece veriyi sarar ve hiçbir şey depolamaz, bu yüzden bir şey yapmaz. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Uygulanan arayüz. |
| [IEnumeratorPtr](./ienumeratorptr/) | Aynı öğelerden oluşan konteyner. |
| [ValueType](./valuetype/) | Değer türü. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
