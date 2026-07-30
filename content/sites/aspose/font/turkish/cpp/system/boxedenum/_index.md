---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font için C++"
description: "System::BoxedEnum sınıfı. Kutulanmış enum değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system/boxedenum/
---
## BoxedEnum class


Kutu içinde tutulmuş enum değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parametre | Açıklama |
| --- | --- |
| E | Enum değerinin türü |
| UT | Enum **E**'nin temel türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Belirtilen enum değerini temsil eden bir örnek oluşturur. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Kutu içinde tutulan enum sabitinin değerini 64 bit tamsayı değerine dönüştürür. |
| [IsBoxedEnum](./isboxedenum/)() override | Mevcut nesnenin enum tipinde bir kutu içinde tutulan değeri temsil edip etmediğini belirler. |
| [ToString](./tostring/)() const override | Mevcut nesne tarafından temsil edilen kutu içindeki değeri stringe dönüştürür. |

## Ayrıca Bakınız

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
