---
title: "Clase System::Collections::Generic::IKVCollection"
linktitle: "IKVCollection"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::Generic::IKVCollection. Interfaz de contenedor que contiene claves o valores del contenedor tipo diccionario. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2500
url: /es/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Interfaz de contenedor que contiene claves o valores del contenedor tipo diccionario. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarla a funciones como argumento.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo [KeyValuePair](../keyvaluepair/). |
## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const T\&) override | Agrega un elemento al contenedor. |
| [Clear](./clear/)() override | Elimina todos los elementos del contenedor. |
| [Contains](./contains/)(const T\&) const override | Comprueba si el elemento está presente en el contenedor. |
| virtual [get_Count](./get_count/)() const | Obtiene el número de elementos en el contenedor. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Comprueba si el contenedor es de solo lectura. |
| virtual [GetEnumerator](./getenumerator/)() | Información RTTI. |
| virtual [idx_get](./idx_get/)(int) const | Función getter. |
| [idx_set](./idx_set/)(int, T) override | Función setter. |
| [IndexOf](./indexof/)(const T\&) const override | Obtiene el índice del elemento en el contenedor. |
| [Insert](./insert/)(int, const T\&) override | Inserta el elemento en la posición especificada. |
| [Remove](./remove/)(const T\&) override | Elimina el elemento del contenedor. |
| [RemoveAt](./removeat/)(int) override | Elimina el elemento en la posición especificada. |

## Ver también

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
