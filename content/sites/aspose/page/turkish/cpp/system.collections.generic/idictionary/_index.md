---
title: "System::Collections::Generic::IDictionary sınıfı"
linktitle: "IDictionary"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IDictionary sınıfı. Sözlük benzeri kapsayıcılar için bir arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2100
url: /tr/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Dictionary-benzeri kapsayıcılar için bir arayüz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parameter | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Kapsayıcıya anahtar-değer çifti ekler. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Kapsayıcının anahtar içerip içermediğini kontrol eder. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Sözlüğün içeriğini mevcut dizi öğelerine kopyalar. |
| virtual [get_Count](./get_count/)() const | get_Count üye işlevini görünür hâle getirir. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Koleksiyon boyutunun sabit olup olmadığını kontrol eder. |
| [get_IsSynchronized](./get_issynchronized/)() const | Kapsayıcının çok iş parçacıklı güvenli olup olmadığını kontrol eder. |
| virtual [get_Keys](./get_keys/)() const | Anahtar koleksiyonuna erişir. |
| virtual [get_Values](./get_values/)() const | Değer koleksiyonuna erişir. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Bulunursa değeri döndürür; aksi takdirde **Value()** döndürür. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Bulunursa değeri döndürür; aksi takdirde **defaultValue** döndürür. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Bulunursa değeri döndürür; aksi takdirde **null** döner, yalnızca referans tipleri için anlamlıdır. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Alıcı işlev. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Ayarlayıcı işlev. |
| virtual [Remove](./remove/)(const TKey\&) | Anahtarı konteynerden kaldırır. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Değeri arar ve bulunursa alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | RTTI bilgisi. |
| [KeyValuePairType](./keyvaluepairtype/) | Anahtar-değer çifti türü. |

## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
