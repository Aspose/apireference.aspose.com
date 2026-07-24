---
title: "Clase System::IDisposable"
linktitle: "IDisposable"
second_title: "Aspose.Page para C++"
description: "Clase System::IDisposable. Define un método que libera los recursos que posee el objeto actual. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 3600
url: /es/cpp/system/idisposable/
---
## IDisposable class


Define un método que libera los recursos propiedad del objeto actual. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class IDisposable : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Dispose](./dispose/)() | No hace nada. |
## Ver también

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
