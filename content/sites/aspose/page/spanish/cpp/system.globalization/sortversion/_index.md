---
title: "Clase System::Globalization::SortVersion"
linktitle: "SortVersion"
second_title: "Aspose.Page para C++"
description: "Clase System::Globalization::SortVersion. Proporciona información sobre la versión Unicode utilizada para comparar y ordenar cadenas. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 2300
url: /es/cpp/system.globalization/sortversion/
---
## SortVersion class


Proporciona información sobre la versión Unicode utilizada para comparar y ordenar cadenas. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Comprueba si la instancia actual de [SortVersion](./) es igual a un objeto [SortVersion](./) especificado. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Comprueba si la instancia actual de [SortVersion](./) es igual a un objeto [SortVersion](./) especificado. |
| [get_FullVersion](./get_fullversion/)() | Obtiene el número de versión completo. |
| [get_SortId](./get_sortid/)() | Obtiene el identificador único de este objeto. |
| [GetHashCode](./gethashcode/)() const override | Obtiene el código hash del objeto actual. |
| [operator!=](./operator!=/)(const SortVersion\&) | Comprueba si la instancia actual de [SortVersion](./) no es igual a un objeto [SortVersion](./) especificado. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Comprueba si la instancia actual de [SortVersion](./) es igual a un objeto [SortVersion](./) especificado. |
| [SortVersion](./sortversion/)(int, const Guid\&) | Información RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Ver también

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
