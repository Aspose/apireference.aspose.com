---
title: "System::DynamicWeakPtr::Reference sınıfı"
linktitle: "Reference"
second_title: "Aspose.Font için C++"
description: "System::DynamicWeakPtr::Reference sınıfı. DynamicWeakPtr::Apply'in çağrılmasını sağlayan referans sınıfı. DynamicWeakPtr, C++'ta ona atama yapabilecek bir fonksiyona SmartPtr referans parametresi olarak geçirilirse kullanılır."
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
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Dönüştürme operatörü. [DynamicWeakPtr_](../dynamicweakptr_/) gerektiği durumlarda [Reference](./) kullanılmasını sağlar. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Akıllı gösterici referansı oluşturur. |
| [Reference](./reference/)(Reference\&&) | Akıllı gösterici referansını taşıyarak oluşturur. |
| [~Reference](./~reference/)() | Referansı yok eder. Referans verilen akıllı göstericide Apply() çağrısını garanti eder. |
## Ayrıca Bakınız

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
