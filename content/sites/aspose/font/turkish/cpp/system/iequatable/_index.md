---
title: "System::IEquatable sınıfı"
linktitle: "IEquatable"
second_title: "Aspose.Font için C++"
description: "System::IEquatable sınıfı. İki nesnenin eşitliğini belirleyen bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 3700
url: /tr/cpp/system/iequatable/
---
## IEquatable class


İki nesnenin eşitliğini belirleyen bir yöntemi tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Karşılaştırılan nesnelerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Equals](./equals/)(T) | Mevcut ve belirtilen nesnelerin eşit olup olmadığını belirler. |

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
