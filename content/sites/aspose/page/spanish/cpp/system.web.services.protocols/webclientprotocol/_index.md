---
title: "System::Web::Services::Protocols::WebClientProtocol clase"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page para C++"
description: "System::Web::Services::Protocols::WebClientProtocol clase. Esta clase base se utiliza en todos los proxies de cliente de servicios Web XML que fueron creados usando ASP.NET. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1100
url: /es/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Esta clase base se utiliza en todos los proxies de cliente de servicio XML [Web](../../system.web/) que fueron creados usando ASP.NET. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Abort](./abort/)() | Cancela la solicitud. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Obtiene el nombre del grupo de conexión. |
| [get_Credentials](./get_credentials/)() | Obtiene la información de autenticación. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Obtiene un valor que indica si la preautenticación está habilitada. |
| [get_RequestEncoding](./get_requestencoding/)() | Obtiene la codificación que se utiliza para realizar las solicitudes del cliente. |
| [get_Timeout](./get_timeout/)() | Obtiene el intervalo de tiempo a esperar antes de que la solicitud expire. |
| [get_Uri](./get_uri/)() | Obtiene el URI del servicio XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | Obtiene la URL del servicio XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Obtiene un valor que indica si la propiedad 'Credential' es igual a la propiedad 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Establece el nombre del grupo de conexión. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Establece la información de autenticación. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Establece un valor que indica si la preautenticación está habilitada. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Establece la codificación que se usa para realizar las solicitudes del cliente. |
| [set_Timeout](./set_timeout/)(int32_t) | Establece el intervalo de tiempo a esperar antes de que la solicitud expire. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Establece el URI del servicio XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | Establece la URL del servicio XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Establece un valor que indica si la propiedad 'Credential' es igual a la propiedad 'DefaultCredentials'. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
