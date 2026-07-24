---
title: "System::Globalization::IdnMapping sınıfı"
linktitle: "IdnMapping"
second_title: "Aspose.Page için C++"
description: "System::Globalization::IdnMapping sınıfı. IdnMapping, adları Punycode'a eşlemek için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1300
url: /tr/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | İki [IdnMapping](./) nesnesini karşılaştırır. |
| [get_AllowUnassigned](./get_allowunassigned/)() const | İşlemlerde kullanılan atanmış olmayan kod noktalarını gösteren bayrağı alır. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | İşlemlerde kullanılan standart adlandırma kurallarını gösteren bayrağı alır. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) unicode alan adını ascii eşdeğerine dönüştürür. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) unicode alan adını ascii eşdeğerine dönüştürür. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) unicode alan adını ascii eşdeğerine dönüştürür. |
| [GetHashCode](./gethashcode/)() const override | Mevcut [IdnMapping](./) nesnesi için hash kodunu alır. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ascii alan adını unicode eşdeğerine dönüştürür. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ascii alan adını unicode eşdeğerine dönüştürür. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ascii alan adını unicode eşdeğerine dönüştürür. |
| [IdnMapping](./idnmapping/)() | RTTI bilgisi. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | İşlemlerde kullanılan atanamayan kod noktalarını gösteren bayrağı ayarlar. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | İşlemlerde kullanılan standart adlandırma kurallarını gösteren bayrağı ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
