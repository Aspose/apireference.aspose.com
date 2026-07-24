---
title: "System::Net::NetworkInformation::IPGlobalProperties clase"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page para C++"
description: "System::Net::NetworkInformation::IPGlobalProperties clase. Representa información sobre la conexión de red del equipo local. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 200
url: /es/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


Representa información sobre la conexión de red del equipo local. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class IPGlobalProperties : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | Devuelve el dominio en el que el equipo local está registrado. |
| virtual [get_HostName](./get_hostname/)() | Devuelve el nombre de host del equipo local. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | Información RTTI. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
