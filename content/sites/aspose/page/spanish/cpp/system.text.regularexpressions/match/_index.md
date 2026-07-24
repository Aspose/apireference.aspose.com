---
title: "Clase System::Text::RegularExpressions::Match"
linktitle: "Match"
second_title: "Aspose.Page para C++"
description: "Clase System::Text::RegularExpressions::Match. Coincidencia única de una expresión regular sobre una cadena. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 600
url: /es/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Métodos

| Método | Descripción |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Agrega una captura a la coincidencia. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Agrega un grupo a la coincidencia. |
| static [get_Empty](./get_empty/)() | Accesor de coincidencia vacía. |
| [get_Groups](./get_groups/)() | Obtiene la lista de grupos. |
| [Match](./match/)(const UStringPtr\&, int, int) | Constructor. |
| [NextMatch](./nextmatch/)() | Iteración sobre coincidencias. |
| virtual [Result](./result/)(const String\&) | Formatea la cadena reemplazando referencias de subcoincidencias con sus valores. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Ver también

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
