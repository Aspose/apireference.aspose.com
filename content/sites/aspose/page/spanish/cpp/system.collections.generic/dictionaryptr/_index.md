---
title: "System::Collections::Generic::DictionaryPtr clase"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::DictionaryPtr clase. Clase de puntero de diccionario con sobrecargas de operadores. Este tipo es un puntero para gestionar la eliminación de otros objetos. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante en C++."
type: docs
weight: 1300
url: /es/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de clave. |
| V | Tipo de valor. |
## Métodos

| Método | Descripción |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Inicializa un puntero nulo. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Convierte el tipo de puntero. |
| [operator[]](./operator[]/)(const X\&) const | Operador de acceso para trabajar con la conversión del tipo de clave. |
| [operator[]](./operator[]/)(const T\&) const | Operador de acceso. |

## Ver también

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
