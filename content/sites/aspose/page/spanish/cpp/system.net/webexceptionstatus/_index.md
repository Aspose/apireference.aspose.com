---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Page para C++"
description: "System::Net::WebExceptionStatus enum. Enumera los códigos de estado de la clase WebException en C++."
type: docs
weight: 4900
url: /es/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


Enumera los códigos de estado de la clase [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Success | 0 | No se produjeron errores. |
| NameResolutionFailure | 1 | El servicio de resolución de nombres no pudo resolver el nombre de host. |
| ConnectFailure | 2 | No se pudo contactar el punto de servicio remoto a nivel de transporte. |
| ReceiveFailure | 3 | No se recibió una respuesta completa del servidor remoto. |
| SendFailure | 4 | No se pudo enviar una solicitud completa al servidor remoto. |
| PipelineFailure | 5 | La solicitud era una solicitud en canalización y la conexión se cerró antes de que se recibiera la respuesta. |
| RequestCanceled | 6 | La solicitud fue cancelada o se produjo un error no clasificable. |
| ProtocolError | 7 | La respuesta recibida del servidor estaba completa pero indicó un error a nivel de protocolo. |
| ConnectionClosed | 8 | La conexión se cerró prematuramente. |
| TrustFailure | 9 | No se pudo validar un certificado del servidor. |
| SecureChannelFailure | 10 | Se produjo un error al establecer una conexión usando SSL. |
| ServerProtocolViolation | 11 | La respuesta del servidor no era una respuesta HTTP válida. |
| KeepAliveFailure | 12 | La conexión para una solicitud que especifica el encabezado 'Keep-Alive' se cerró inesperadamente. |
| Pendiente | 13 | Una solicitud asíncrona interna está pendiente. |
| Tiempo de espera | 14 | No se recibió respuesta durante el período de tiempo de espera para una solicitud. |
| ProxyNameResolutionFailure | 15 | El servicio de resolución de nombres no pudo resolver el nombre de host del proxy. |
| UnknownError | 16 | Se ha producido una excepción de tipo desconocido. |
| MessageLengthLimitExceeded | 17 | Se recibió un mensaje que excedió el límite especificado. |
| CacheEntryNotFound | 18 | La entrada de caché especificada no se encontró. |
| RequestProhibitedByCachePolicy | 19 | La solicitud no fue permitida por la política de caché. |
| RequestProhibitedByProxy | 20 | Esta solicitud no fue permitida por el proxy. |

## Ver también

* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
