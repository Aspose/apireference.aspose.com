---
title: "System::IEquatable sınıfı"
linktitle: "IEquatable"
second_title: "Aspose.Page için C++"
description: "System::IEquatable sınıfı. İki nesnenin eşitliğini belirleyen bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3700
url: /tr/cpp/system/iequatable/
---
## IEquatable class


İki nesnenin eşitliğini belirleyen bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Karşılaştırılan nesnelerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Equals](./equals/)(T) | Mevcut ve belirtilen nesnelerin eşit olup olmadığını belirler. |

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
