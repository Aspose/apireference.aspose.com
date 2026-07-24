---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Page için C++"
description: "System::BoxedEnum class. Kutulanmış enum değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr göstericisine sarın ve bu göstericiyi C++'da işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system/boxedenum/
---
## BoxedEnum class


Kutulanmış enum değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) göstericisine sarın ve bu göstericiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | Açıklama |
| --- | --- |
| E | Enum değerinin türü |
| UT | **E** sayımının temel türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Belirtilen sayım değerini temsil eden bir örnek oluşturur. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Kutulanmış sayım sabitinin değerini 64 bit tam sayı değerine dönüştürür. |
| [IsBoxedEnum](./isboxedenum/)() override | Geçerli nesnenin bir sayım türünün kutulanmış değerini temsil edip etmediğini belirler. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından temsil edilen kutulanmış değeri dizeye dönüştürür. |

## Ayrıca Bakınız

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
