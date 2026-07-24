---
title: "System::ComponentModel::CancelEventArgs clase"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page para C++"
description: "System::ComponentModel::CancelEventArgs clase. Argumentos de un evento cancelable. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarla a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Argumentos de un evento cancelable. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarla a funciones como argumento.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Información RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Constructor; establece la propiedad Cancel a false. |
| [get_Cancel](./get_cancel/)() | Obtiene el valor que indica si el evento debe cancelarse. |
| [set_Cancel](./set_cancel/)(bool) | Establece el valor que indica si el evento debe cancelarse. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un miembro estático que representa un puntero compartido "vacío" [EventArgs](../../system/eventargs/) (puntero nulo). |
## Ver también

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
