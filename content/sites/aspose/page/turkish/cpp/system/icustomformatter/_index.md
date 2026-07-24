---
title: "System::ICustomFormatter sınıfı"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page için C++"
description: "System::ICustomFormatter sınıfı. Belirtilen nesne tarafından temsil edilen bir değerin dize temsili üzerinde özel biçimlendirme yapan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++ içinde fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3500
url: /tr/cpp/system/icustomformatter/
---
## ICustomFormatter class


Belirtilen nesne tarafından temsil edilen bir değerin dize temsili üzerinde özel biçimlendirme yapan bir yöntem tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Geçerli nesne tarafından temsil edilen bir değerin, belirtilen biçimi kullanarak dize temsili döndürür. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
