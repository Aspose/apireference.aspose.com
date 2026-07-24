---
title: "clase System::Net::Http::HttpRequestMessage"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::Http::HttpRequestMessage. Representa un mensaje de solicitud HTTP. Los objetos de esta clase solo deben asignarse mediante la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 800
url: /es/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Representa un mensaje de solicitud HTTP. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Dispose](./dispose/)() override | Descarta la instancia actual. Este método también descarta el contenido de la solicitud HTTP. |
| [get_Content](./get_content/)() | Obtiene el contenido de la solicitud HTTP. |
| [get_Headers](./get_headers/)() | Devuelve los encabezados de contenido HTTP. |
| [get_Method](./get_method/)() | Obtiene el método de solicitud HTTP. |
| [get_Properties](./get_properties/)() | Devuelve la colección de las propiedades de la solicitud HTTP. |
| [get_RequestUri](./get_requesturi/)() | Obtiene el URI del recurso solicitado. |
| [get_Version](./get_version/)() | Información RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | Construye una nueva instancia. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Construye una nueva instancia. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Construye una nueva instancia. |
| [MarkAsSent](./markassent/)() | Marca la solicitud actual como enviada. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Establece el contenido de la solicitud HTTP. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Establece el método de solicitud HTTP. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Establece el URI del recurso solicitado. |
| [set_Version](./set_version/)(System::Version) | Establece la versión HTTP. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../../system/object/tostring/). Permite convertir objetos personalizados a cadena. |
## Ver también

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
