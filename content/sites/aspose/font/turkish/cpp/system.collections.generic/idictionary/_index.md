---
title: "System::Collections::Generic::IDictionary class"
linktitle: "IDictionary"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::IDictionary sınıfı. Sözlük benzeri kapsayıcılar için arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Dictionary benzeri kapsayıcılar için arayüz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parametre | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Kapsayıcıya anahtar-değer çifti ekler. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Kapsayıcının anahtar içerip içermediğini denetler. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Sözlüğün içeriğini mevcut dizi elemanlarına kopyalar. |
| virtual [get_Count](./get_count/)() const | get_Count üye işlevinin gizliliğini kaldırır. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Koleksiyon boyutunun sabit olup olmadığını denetler. |
| [get_IsSynchronized](./get_issynchronized/)() const | Kapsayıcının iş parçacığı güvenli olup olmadığını denetler. |
| virtual [get_Keys](./get_keys/)() const | Anahtar koleksiyonuna erişir. |
| virtual [get_Values](./get_values/)() const | Değer koleksiyonuna erişir. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Bulunursa değeri döndürür; aksi takdirde **Value()** döndürür. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Bulunursa değeri döndürür; aksi takdirde **defaultValue** döndürür. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Bulunursa değeri döndürür; aksi takdirde **null** döndürür, yalnızca referans tipleri için anlamlıdır. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Alıcı işlev. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Ayarlayıcı işlev. |
| virtual [Remove](./remove/)(const TKey\&) | Anahtarı konteynerden kaldırır. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Değeri arar ve bulunursa getirir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | RTTI bilgisi. |
| [KeyValuePairType](./keyvaluepairtype/) | Anahtar-değer çifti tipi. |

## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
