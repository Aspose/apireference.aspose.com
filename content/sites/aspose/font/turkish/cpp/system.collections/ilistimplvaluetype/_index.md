---
title: "System::Collections::IListImplValueType sınıfı"
linktitle: "IListImplValueType"
second_title: "Aspose.Font için C++"
description: "System::Collections::IListImplValueType sınıfı. System::Collections::Generic::List nesnesi üzerinde System::Collections::IList arayüzünü uygulayan bir stub - C++'ta değer tipleri için uygulama."
type: docs
weight: 1200
url: /tr/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


[System::Collections::IList](../ilist/) arayüzünü [System::Collections::Generic::List](../../system.collections.generic/list/) nesnesi üzerinde uygulayan bir stub - değer tipleri için uygulama.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Liste sonuna bir öğe ekler. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Öğenin listede bulunup bulunmadığını kontrol eder. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) metotların uygulanması Koleksiyondaki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) uygulanması Bir koleksiyon üzerinde yineleme yapan bir enumerator döndürür. |
| [idx_get](./idx_get/)(int, int) const override | Belirtilen indeksteki öğeyi alır. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Yeni bir nesne örneği oluşturur. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Öğenin konteynerdeki ilk görünümünün indeksini alır. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Öğeyi belirtilen konuma ekler, diğer öğeleri kaydırır. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Belirli bir öğenin listeden ilk örneğini kaldırır. |
| [RemoveAt](./removeat/)(int) override | Belirtilen konumdaki öğeyi kaldırır. |
## Ayrıca Bakınız

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
