---
title: "System::Collections::Generic::BaseEnumerator clase."
linktitle: "BaseEnumerator"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::Generic::BaseEnumerator. Definición del enumerador para envolver tipos estilo STL para uso estilo C#. No realiza afirmaciones sobre la estructura del contenedor excepto la existencia de un iterador secuencial. Utiliza las funciones begin() y end(). Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 600
url: /es/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parámetro | Descripción |
| --- | --- |
| Contenedor | Tipo de contenedor estilo STL. |
| Element | Tipo de elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Inicializa el iterador. |
| [IsValid](./isvalid/)() const | Comprueba si se llamó a [MoveNext()](./movenext/) y no se alcanzó el final. |
| [MoveNext](./movenext/)() override | Incremento al estilo de enumerador. |
| [Reset](./reset/)() override | Restablece el enumerador para permitir volver a enumerar los elementos. |

## Ver también

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
