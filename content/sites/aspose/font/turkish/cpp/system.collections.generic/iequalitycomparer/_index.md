---
title: "System::Collections::Generic::IEqualityComparer class"
linktitle: "IEqualityComparer"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::IEqualityComparer sınıfı. İki nesneyi eşitlik açısından karşılaştırma imkanı sağlayan arayüz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu türün bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Eşitlik açısından iki nesneyi karşılaştırma imkanı sağlayan arayüz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu türün bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parametre | Açıklama |
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
* Library [Aspose.Font for C++](../../)
