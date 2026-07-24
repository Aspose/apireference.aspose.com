---
title: "System::DefaultBoxedValue class"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page için C++"
description: "System::DefaultBoxedValue sınıfı. BoxedValue sınıfının uygulaması. Ortak kodu çoğaltmadan BoxingValue özelleştirmelerinin ilan edilmesine izin verir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2000
url: /tr/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Belirtilen değeri temsil eden [DefaultBoxedValue](./) sınıfının yeni bir örneğini oluşturur. |
| [Equals](./equals/)(ptr) override | Geçerli ve belirtilen nesneler tarafından temsil edilen kutulanmış değerlerin eşitliğini belirler. |
| [GetHashCode](./gethashcode/)() const override | Mevcut nesne için bir hash kodu döndürür. |
| [GetType](./gettype/)() const override | Nesnenin gerçek türünü alır. |
| [is](./is/)() const | Geçerli nesne tarafından temsil edilen kutulanmış değerin türünün **V** olup olmadığını belirler. |
| [ToString](./tostring/)() const override | Kutulanmış değerin dize temsilini döndürür. |
| [unbox](./unbox/)() const | Kutulanmış değerin kutusunu açar. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
