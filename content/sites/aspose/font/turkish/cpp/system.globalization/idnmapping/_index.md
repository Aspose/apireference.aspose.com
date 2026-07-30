---
title: "System::Globalization::IdnMapping class"
linktitle: "IdnMapping"
second_title: "Aspose.Font için C++"
description: "System::Globalization::IdnMapping sınıfı. IdnMapping, adları Punycode'a eşlemek için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini asla yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirin."
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
| [get_AllowUnassigned](./get_allowunassigned/)() const | İşlemlerde kullanılan atanmamış kod noktalarını gösteren bayrağı alır. |
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
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | İşlemlerde kullanılan atanmamış kod noktalarını gösteren bayrağı ayarlar. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | İşlemlerde kullanılan standart adlandırma kurallarını gösteren bayrağı ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
