---
title: "System::WeakPtr clase"
linktitle: "WeakPtr"
second_title: "Aspose.Page para C++"
description: "Clase System::WeakPtr. Subclase de System::SmartPtr que se establece en modo débil en la construcción. Tenga en cuenta que esta clase no garantiza que su instancia permanezca siempre en modo débil ya que set_Mode() sigue siendo accesible. Este tipo es un puntero para gestionar la eliminación de otros objetos. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante en C++."
type: docs
weight: 7500
url: /es/cpp/system/weakptr/
---
## WeakPtr class


Subclase de [System::SmartPtr](../smartptr/) que se establece en modo débil en la construcción. Tenga en cuenta que esta clase no garantiza que su instancia permanezca siempre en modo débil ya que [set_Mode()](../smartptr/set_mode/) sigue siendo accesible. Este tipo es un puntero para gestionar la eliminación de otro objeto. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo apuntado. |
## Métodos

| Método | Descripción |
| --- | --- |
| [expired](./expired/)() const | Comprueba si el objeto referenciado ya fue eliminado. |
| [get_weak](./get_weak/)() const | Obtiene el objeto referenciado. Asegura que el puntero está en modo débil. |
| [operator=](./operator=/)(Q\&&) | Asigna valor al puntero débil. Llama al operador de asignación específico de [SmartPtr_](./smartptr_/). |
| [operator==](./operator==/)(std::nullptr_t) const | Comprueba si el puntero débil es nulo. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Crea un puntero nulo. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Crea un puntero débil al objeto dado. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Crea un puntero débil que referencia el mismo puntero al que apunta ptr. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Crea un puntero débil que referencia el mismo puntero al que apunta x. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Construye por copia un puntero débil. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Construye por copia un puntero débil. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Construye por movimiento un puntero débil. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Pointee_](./pointee_/) | Tipo apuntado. |
| [SmartPtr_](./smartptr_/) | Alias de la clase [SmartPtr](../smartptr/) correspondiente. |
| [WeakPtr_](./weakptr_/) | Alias del tipo propio. |

## Ver también

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
