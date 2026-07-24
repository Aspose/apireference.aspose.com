---
title: "System::Collections::Generic::SimpleEnumerator clase"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::Generic::SimpleEnumerator. Clase iteradora para contenedores simples que mantienen elementos directamente usando las funciones rbegin() y rend(). Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3900
url: /es/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Clase iteradora para contenedores simples que mantienen elementos directamente usando las funciones rbegin() y rend(). Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parámetro | Descripción |
| --- | --- |
| Contenedor | Tipo de contenedor para iterar. |
| Element | Tipo de elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona el iterador actual. |
| [get_Current](./get_current/)() const override | Obtiene el elemento 'actual'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Crea un iterador simple. |

## Ver también

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
