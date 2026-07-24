---
title: "System::DynamicWeakPtr::Reference klasse"
linktitle: "Reference"
second_title: "Aspose.Page voor C++"
description: "System::DynamicWeakPtr::Reference klasse. Referentieklasse die ervoor zorgt dat DynamicWeakPtr::Apply wordt aangeroepen. Wordt gebruikt als DynamicWeakPtr wordt doorgegeven als SmartPtr-referentieparameter aan een functie die er mogelijk aan toewijst in C++."
type: docs
weight: 700
url: /nl/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Conversie‑operator. Stelt toe om [Reference](./) te gebruiken in contexten waar [DynamicWeakPtr_](../dynamicweakptr_/) nodig is. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Creëert smart pointer-referentie. |
| [Reference](./reference/)(Reference\&&) | Move-constructeert smart pointer-referentie. |
| [~Reference](./~reference/)() | Vernietigt referentie. Zorgt voor Apply()-aanroep op de gerefereerde smart pointer. |
## Zie ook

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
