---
title: "System::DynamicWeakPtr::Reference sınıfı"
linktitle: "Reference"
second_title: "Aspose.Page için C++"
description: "System::DynamicWeakPtr::Reference sınıfı. DynamicWeakPtr::Apply'in çağrılmasını sağlayan referans sınıfı. DynamicWeakPtr, C++'ta ona atama yapabilecek bir fonksiyona SmartPtr referans parametresi olarak geçirildiğinde kullanılır."
type: docs
weight: 700
url: /tr/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Dönüşüm operatörü. [Reference](./) öğesinin, [DynamicWeakPtr_](../dynamicweakptr_/) gerektiği bağlamlarda kullanılmasını sağlar. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Akıllı işaretçi referansı oluşturur. |
| [Reference](./reference/)(Reference\&&) | Akıllı işaretçi referansını taşıyarak oluşturur. |
| [~Reference](./~reference/)() | Referansı yok eder. Referans verilen akıllı işaretçide Apply() çağrısının yapılmasını sağlar. |
## Ayrıca Bakınız

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
