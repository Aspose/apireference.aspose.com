---
title: "System::ICustomFormatter sınıfı"
linktitle: "ICustomFormatter"
second_title: "Aspose.Font için C++"
description: "System::ICustomFormatter sınıfı. Belirtilen nesne tarafından temsil edilen bir değerin dize temsiline özel biçimlendirme yapan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3500
url: /tr/cpp/system/icustomformatter/
---
## ICustomFormatter class


Belirtilen nesne tarafından temsil edilen bir değerin dize temsiline özel biçimlendirme yapan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığına (stack) veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Belirtilen biçimi kullanarak geçerli nesne tarafından temsil edilen bir değerin dize temsili döndürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
