---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Puntero de diccionario ordenado con operadores de acceso. Este tipo es un puntero para gestionar la eliminación de otros object''s. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante en C++."
type: docs
weight: 4100
url: /es/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Puntero a diccionario ordenado con operadores de acceso. Este tipo es un puntero para gestionar la eliminación de otro objeto. Debe asignarse en la pila y pasarse a funciones ya sea por valor o por referencia constante.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Función de acceso. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Construye un puntero nulo. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Construye un puntero al diccionario ordenado especificado. |
## Ver también

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
