---
title: "Clase System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Page para C++"
description: "Clase System::Diagnostics::StackTrace. Colección de marcos de pila. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 600
url: /es/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Colección de marcos de pila. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class StackTrace : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Obtiene el recuento de marcos en la traza de pila. |
| virtual [GetFrame](./getframe/)(uint32_t) | Obtiene el marco de pila. |
| [operator=](./operator=/)(const StackTrace\&) const | Sin asignación. |
| [StackTrace](./stacktrace/)() | Crea una traza de pila que describe el estado actual de la pila. |
| [StackTrace](./stacktrace/)(bool) | Crea una traza de pila que describe el estado actual de la pila. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Sin copia. |
| virtual [~StackTrace](./~stacktrace/)() | Destructor. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
