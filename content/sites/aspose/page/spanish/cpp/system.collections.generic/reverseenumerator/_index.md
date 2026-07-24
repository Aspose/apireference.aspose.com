---
title: "System::Collections::Generic::ReverseEnumerator clase"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page para C++"
description: "System::Collections::Generic::ReverseEnumerator clase. Enumerador que itera en reversa a través del contenedor. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3800
url: /es/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parámetro | Descripción |
| --- | --- |
| Contenedor | Contenedor para iterar. |
| Element | Tipo de elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [get_Current](./get_current/)() const override | Obtiene el elemento 'actual'. |
| [IsValid](./isvalid/)() const | Comprueba si se llamó a [MoveNext()](./movenext/) y no se alcanzó el final. |
| [MoveNext](./movenext/)() override | Incremento al estilo de enumerador. |
| [Reset](./reset/)() override | Restablece el enumerador para permitir volver a enumerar los elementos. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Inicializa el iterador. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Destructor. |

## Ver también

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
