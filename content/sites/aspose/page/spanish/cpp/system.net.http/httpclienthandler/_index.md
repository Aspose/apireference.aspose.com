---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page para C++"
description: "System::Net::Http::HttpClientHandler class. Representa el manejador de mensajes predeterminado utilizado por la clase HttpClient. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 300
url: /es/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Representa el manejador de mensajes predeterminado utilizado por la clase [HttpClient](../httpclient/). Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Dispose](./dispose/)() override | No hace nada. |
| [get_CookieContainer](./get_cookiecontainer/)() | Obtiene el contenedor de cookies que se utiliza para almacenar las cookies del servidor. |
| [get_Credentials](./get_credentials/)() | Obtiene la información de autenticación. |
| [HttpClientHandler](./httpclienthandler/)() | Información RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | Información RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Establece el contenedor de cookies que se utiliza para almacenar las cookies del servidor. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Establece la información de autenticación. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Establece la información del proxy. |
| [set_Timeout](./set_timeout/)(int32_t) | Obtiene una cantidad de tiempo en milisegundos después de la cual la solicitud expirará. |
| [set_UseCookies](./set_usecookies/)(bool) | Establece el valor que indica si la instancia actual utiliza el contenedor de cookies para almacenar las cookies del servidor y si la instancia utiliza cookies del servidor al enviar solicitudes. |
| [set_UseProxy](./set_useproxy/)(bool) | Establece el valor que indica si la instancia actual usa el proxy para enviar solicitudes. |
## Ver también

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
