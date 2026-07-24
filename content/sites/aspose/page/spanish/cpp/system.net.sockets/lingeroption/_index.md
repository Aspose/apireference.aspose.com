---
title: "System::Net::Sockets::LingerOption class"
linktitle: "LingerOption"
second_title: "Aspose.Page para C++"
description: "System::Net::Sockets::LingerOption class. Especifica si un socket permanecerá conectado después de una llamada a los métodos Close() o Close(). También especifica el período que el socket permanecerá conectado si continúa el envío de los datos. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 200
url: /es/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Especifica si un socket permanecerá conectado después de una llamada a los métodos Close() o Close(). También especifica el período que el socket permanecerá conectado si continúa el envío de los datos. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class LingerOption : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Enabled](./get_enabled/)() | Información RTTI. |
| [get_LingerTime](./get_lingertime/)() | Obtiene un tiempo de espera de retraso en segundos. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Construye una nueva instancia. |
| [set_Enabled](./set_enabled/)(bool) | Establece un valor que indica si el socket retrasará el cierre en un intento de enviar todos los datos pendientes. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Establece un tiempo de espera de retraso en segundos. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
