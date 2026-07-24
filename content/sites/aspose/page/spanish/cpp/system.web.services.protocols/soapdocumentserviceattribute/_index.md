---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute clase"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page para C++"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute clase. Establece el formato predeterminado para las solicitudes y respuestas SOAP. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 500
url: /es/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Establece el formato predeterminado para las solicitudes y respuestas SOAP. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | Información RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | Obtiene un valor que muestra cómo se enrutan los mensajes SOAP al servicio. |
| [get_Use](./get_use/)() | Obtiene el formato de los parámetros. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Establece un valor que indica si los parámetros están encapsulados dentro de un único elemento XML bajo el elemento 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Establece un valor que muestra cómo se enrutan los mensajes SOAP al servicio. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Establece el formato de los parámetros. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Construye una nueva instancia. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Construye una nueva instancia. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Construye una nueva instancia. |
## Ver también

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
