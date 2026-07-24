---
title: "Clase System::Collections::Generic::_KeyList"
linktitle: "_KeyList"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::Generic::_KeyList. Implementa una lista de claves del diccionario. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 200
url: /es/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Implementa una lista de claves del diccionario. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parámetro | Descripción |
| --- | --- |
| Dict | Tipo [Dictionary](../dictionary/). |
## Métodos

| Método | Descripción |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Inicializa la colección que hace referencia al diccionario especificado. |
| [Contains](./contains/)(const TKey\&) const override | Comprueba si la clave especificada está presente en la colección. |
| [idx_get](./idx_get/)(int) const override | Obtiene la clave en la posición especificada. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [TKey](./tkey/) | Tipo de clave. |

## Ver también

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
