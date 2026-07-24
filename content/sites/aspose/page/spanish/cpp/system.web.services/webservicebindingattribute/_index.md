---
title: "System::Web::Services::WebServiceBindingAttribute clase"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Page para C++"
description: "Clase System::Web::Services::WebServiceBindingAttribute. Se utiliza para declarar un enlace que define uno o más métodos del servicio Web XML. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use este puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 400
url: /es/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


Se utiliza para declarar un enlace que define uno o más métodos del servicio XML [Web](../../system.web/). Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use este puntero para pasarlo a funciones como argumento.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | Obtiene la especificación WSI. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | Obtiene un valor que indica si el enlace emite reclamaciones de conformidad. |
| [get_Location](./get_location/)() | Información RTTI. |
| [get_Name](./get_name/)() | Obtiene el nombre del enlace. |
| [get_Namespace](./get_namespace/)() | Obtiene el espacio de nombres asociado al enlace. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | Establece la especificación WSI. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | Establece un valor que indica si el enlace emite reclamaciones de conformidad. |
| [set_Location](./set_location/)(String) | Establece la ubicación donde se define el enlace. |
| [set_Name](./set_name/)(String) | Establece el nombre del enlace. |
| [set_Namespace](./set_namespace/)(String) | Establece el espacio de nombres asociado al enlace. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | Construye una nueva instancia. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | Construye una nueva instancia. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | Construye una nueva instancia. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | Construye una nueva instancia. |
## Ver también

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
