---
title: "System::Collections::Generic::_ValueList sınıfı"
linktitle: "_ValueList"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::_ValueList sınıfı. dictionary'nin değerlerinin listesini uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


dictionary'nin değerlerinin listesini uygular. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Açıklama |
| --- | --- |
| Dict | [Dictionary](../dictionary/) türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Belirtilen dictionary'ye referans veren koleksiyonu başlatır. |
| virtual [idx_get](./idx_get/)(int) const | Belirtilen konumdaki değeri alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [TValue](./tvalue/) | Değer türü. |

## Ayrıca Bakınız

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
