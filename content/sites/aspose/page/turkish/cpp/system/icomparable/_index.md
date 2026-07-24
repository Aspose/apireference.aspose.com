---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Page için C++"
description: "System::IComparable sınıfı. İki nesneyi karşılaştıran bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3300
url: /tr/cpp/system/icomparable/
---
## IComparable class


İki nesneyi karşılaştıran bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Mevcut nesnenin karşılaştırıldığı nesnelerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Mevcut nesneyi belirtilen nesneyle karşılaştırır. |

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
