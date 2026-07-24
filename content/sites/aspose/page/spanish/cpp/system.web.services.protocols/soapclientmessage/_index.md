---
title: "System::Web::Services::Protocols::SoapClientMessage clase"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page para C++"
description: "System::Web::Services::Protocols::SoapClientMessage clase. Representa los datos en una solicitud SOAP enviada o una respuesta SOAP recibida. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Representa los datos en una solicitud SOAP enviada o una respuesta SOAP recibida. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Action](./get_action/)() override | Devuelve un valor del atributo 'SOAPAction'. |
| [get_Client](./get_client/)() | Devuelve una instancia de la clase proxy del cliente. |
| virtual [get_OneWay](./get_oneway/)() | Devuelve un valor que indica si un cliente no espera a que el servidor termine de procesar un método. |
| [get_SoapVersion](./get_soapversion/)() override | Devuelve la versión de SOAP que se utiliza. |
| [get_Url](./get_url/)() override | Devuelve la URL del servicio XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Construye una nueva instancia. |
## Ver también

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
