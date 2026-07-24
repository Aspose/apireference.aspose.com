---
title: "System::Net::Http::HttpMessageInvoker clase"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page para C++"
description: "System::Net::Http::HttpMessageInvoker clase. Permite a las aplicaciones llamar al método Send en una cadena de manejadores HTTP. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject() . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 600
url: /es/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Permite a las aplicaciones llamar al método Send en una cadena de manejadores HTTP. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/) . Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Dispose](./dispose/)() override | Elimina la instancia actual. Este método también elimina el manejador si es necesario. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | Información RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Construye una nueva instancia. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Envía la solicitud especificada. |
## Ver también

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
