---
title: "System::DynamicWeakPtr::Reference classe"
linktitle: "Reference"
second_title: "Aspose.Page per C++"
description: "System::DynamicWeakPtr::Reference classe. Classe di riferimento che garantisce che DynamicWeakPtr::Apply sia chiamato. Usata se DynamicWeakPtr viene passato come parametro di riferimento SmartPtr a una funzione che può assegnargli in C++."
type: docs
weight: 700
url: /it/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Operatore di conversione. Consente di usare [Reference](./) in contesti in cui è necessario [DynamicWeakPtr_](../dynamicweakptr_/). |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Crea un riferimento allo smart pointer. |
| [Reference](./reference/)(Reference\&&) | Costruisce per spostamento il riferimento allo smart pointer. |
| [~Reference](./~reference/)() | Distrugge il riferimento. Garantisce la chiamata a Apply() sullo smart pointer referenziato. |
## Vedi anche

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
