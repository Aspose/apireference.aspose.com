---
title: "Clase System::DynamicWeakPtr::Reference"
linktitle: "Reference"
second_title: "Aspose.Page para C++"
description: "Clase System::DynamicWeakPtr::Reference. Clase de referencia que garantiza que se llame a DynamicWeakPtr::Apply. Se usa si DynamicWeakPtr se pasa como parámetro de referencia SmartPtr a una función que pueda asignarle en C++."
type: docs
weight: 700
url: /es/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Métodos

| Método | Descripción |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Operador de conversión. Permite usar [Reference](./) en contextos donde se necesita [DynamicWeakPtr_](../dynamicweakptr_/). |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Crea una referencia de puntero inteligente. |
| [Reference](./reference/)(Reference\&&) | Construye por movimiento una referencia de puntero inteligente. |
| [~Reference](./~reference/)() | Destruye la referencia. Garantiza la llamada a Apply() en el puntero inteligente referenciado. |
## Ver también

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
