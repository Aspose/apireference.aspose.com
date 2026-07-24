---
title: "Enumeración System::UriComponents"
linktitle: "UriComponents"
second_title: "Aspose.Page para C++"
description: "Enumeración System::UriComponents. Representa los componentes URI en C++."
type: docs
weight: 8900
url: /es/cpp/system/uricomponents/
---
## UriComponents enum


Representa los componentes de URI.

```cpp
enum class UriComponents
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Scheme | 1 | Los datos del esquema. |
| UserInfo | 2 | Los datos de UserInfo. |
| Host | 4 | Los datos del host. |
| Puerto | 8 | Los datos del puerto. |
| SchemeAndServer | n/a | Los datos del esquema, host y puerto. |
| Path | 16 | Los datos de la ruta local. |
| Consulta | 32 | Los datos de la consulta. |
| PathAndQuery | n/a | Los datos de la ruta local y la consulta. |
| HttpRequestUrl | n/a | Los datos del esquema, host, puerto, consulta y ruta local. |
| Fragment | 64 | Los datos del fragmento. |
| AbsoluteUri | n/a | Los datos de Scheme, Host, Port, Quer, LocalPath y Fragment. |
| StrongPort | 128 | Los datos del Port; si los datos del port no están presentes en el [Uri](../uri/) y se ha asignado un puerto predeterminado al Scheme, se devuelve el puerto predeterminado; si no hay puerto predeterminado, se devuelve -1. |
| HostAndPort | n/a | Los datos de Host y Port; si los datos del port no están presentes en el [Uri](../uri/) y se ha asignado un puerto predeterminado al Scheme, se devuelve el puerto predeterminado. Si no hay puerto predeterminado, se devuelve -1. |
| StrongAuthority | n/a | Los datos de UserInfo, Host y Port. Si no hay datos de port en el [Uri](../uri/) y se ha asignado un puerto predeterminado al Scheme, se devuelve el puerto predeterminado. Si no hay puerto predeterminado, se devuelve -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Especifica que el delimitador debe incluirse. |
| SerializationInfoString | n/a | El contexto completo del [Uri](../uri/) que se necesita para los Serializadores de [Uri](../uri/). El contexto incluye el ámbito IPv6. |

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
