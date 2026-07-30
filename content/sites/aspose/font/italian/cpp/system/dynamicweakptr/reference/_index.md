---
title: "System::DynamicWeakPtr::Reference class"
linktitle: "Reference"
second_title: "Aspose.Font per C++"
description: "System::DynamicWeakPtr::Reference class. Classe di riferimento che garantisce che DynamicWeakPtr::Apply sia chiamato. Usata se DynamicWeakPtr viene passato come parametro di riferimento SmartPtr a una funzione che può assegnargli in C++."
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
| [Reference](./reference/)(DynamicWeakPtr_\&) | Crea un riferimento a puntatore intelligente. |
| [Reference](./reference/)(Reference\&&) | Costruisce per spostamento il riferimento al puntatore intelligente. |
| [~Reference](./~reference/)() | Distrugge il riferimento. Garantisce la chiamata a Apply() sul puntatore intelligente referenziato. |
## Vedi anche

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
