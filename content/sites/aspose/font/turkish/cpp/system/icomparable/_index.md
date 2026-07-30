---
title: "System::IComparable sınıfı"
linktitle: "IComparable"
second_title: "Aspose.Font için C++"
description: "System::IComparable sınıfı. İki nesneyi karşılaştıran bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3300
url: /tr/cpp/system/icomparable/
---
## IComparable class


İki nesneyi karşılaştıran bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Mevcut nesnenin karşılaştırıldığı nesnelerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Mevcut nesneyi belirtilen nesneyle karşılaştırır. |

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
