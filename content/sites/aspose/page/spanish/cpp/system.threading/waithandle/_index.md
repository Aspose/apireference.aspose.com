---
title: "System::Threading::WaitHandle clase"
linktitle: "WaitHandle"
second_title: "Aspose.Page para C++"
description: "System::Threading::WaitHandle clase. Clase base primitiva de espera. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1700
url: /es/cpp/system.threading/waithandle/
---
## WaitHandle class


Clase base primitiva de espera. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en el puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class WaitHandle : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Close](./close/)() | Libera cualquier recurso asociado al handle. |
| [get_Handle](./get_handle/)() | Obtiene el handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Información RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Espera a que todos los handles se activen. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Espera a que todos los handles se activen. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Espera a que cualquiera de los handles se active. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Espera a que cualquiera de los handles se active. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Espera a que cualquiera de los handles se active. |
| virtual [WaitOne](./waitone/)() | Espera a que el manejador se active indefinidamente. |
| virtual [WaitOne](./waitone/)(int) | Espera a que el manejador se active. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Espera a que el manejador se active. |
| virtual [WaitOne](./waitone/)(int, bool) | Espera a que el manejador se active. |
| virtual [~WaitHandle](./~waithandle/)() | Destructor. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Valor especial que debe ser devuelto por la función, de lo contrario devuelve el índice del objeto señalizado en el arreglo, si el tiempo de espera se supera y nada señala. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
