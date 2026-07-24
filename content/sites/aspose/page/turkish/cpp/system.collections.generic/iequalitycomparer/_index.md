---
title: "System::Collections::Generic::IEqualityComparer sınıfı"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IEqualityComparer sınıfı. Eşitlik için iki nesneyi karşılaştırma imkanı sağlayan bir arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2400
url: /tr/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Bu arayüz, iki nesneyi eşitlik açısından karşılaştırma imkanı sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Karşılaştırılan tür. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI bilgisi. |
| virtual [GetHashCode](./gethashcode/)(T) const | Bir nesne için hash kodunu alır. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
