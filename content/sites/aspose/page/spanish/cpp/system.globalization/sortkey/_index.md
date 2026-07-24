---
title: "System::Globalization::SortKey clase"
linktitle: "SortKey"
second_title: "Aspose.Page para C++"
description: "System::Globalization::SortKey clase. Mapeo de una cadena a su clave de ordenación. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2200
url: /es/cpp/system.globalization/sortkey/
---
## SortKey class


Mapeo de una cadena a su clave de ordenación. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class SortKey : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Compara dos claves de ordenación. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Comprueba si el objeto especificado es igual al objeto [SortKey](./) actual. |
| virtual [get_KeyData](./get_keydata/)() | Obtiene la matriz de bytes que representa el objeto actual. |
| virtual [get_OriginalString](./get_originalstring/)() | Obtiene la cadena original utilizada para crear este objeto. |
| [GetHashCode](./gethashcode/)() const override | Obtiene el código hash del objeto [SortKey](./) actual. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Convierte el objeto actual a su representación en cadena. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
