---
title: "System::DynamicWeakPtr::Reference Klasse"
linktitle: "Reference"
second_title: "Aspose.Page für C++"
description: "System::DynamicWeakPtr::Reference Klasse. Referenzklasse, die sicherstellt, dass DynamicWeakPtr::Apply aufgerufen wird. Wird verwendet, wenn DynamicWeakPtr als SmartPtr-Referenzparameter an eine Funktion übergeben wird, die ihn in C++ zuweisen kann."
type: docs
weight: 700
url: /de/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Konvertierungsoperator. Ermöglicht die Verwendung von [Reference](./) in Kontexten, in denen [DynamicWeakPtr_](../dynamicweakptr_/) benötigt wird. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Erstellt eine Smart Pointer-Referenz. |
| [Reference](./reference/)(Reference\&&) | Move-konstruiert Smart Pointer-Referenz. |
| [~Reference](./~reference/)() | Zerstört die Referenz. Stellt sicher, dass Apply() auf dem referenzierten Smart Pointer aufgerufen wird. |
## Siehe auch

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
