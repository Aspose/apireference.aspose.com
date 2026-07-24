---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page para C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. La enumeración describe la configuración de caché para HTTP en C++."
type: docs
weight: 400
url: /es/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


La enumeración describe la configuración de caché para HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Default | 0 | Satisface una solicitud de un recurso ya sea utilizando la copia en caché del recurso o enviando una solicitud del recurso al servidor. |
| BypassCache | 1 | Satisface una solicitud utilizando el servidor. |
| CacheOnly | 2 | Siempre utiliza la caché del cliente para obtener un recurso. |
| CacheIfAvailable | 3 | Satisface una solicitud de un recurso desde la caché si el recurso está disponible; de lo contrario, envía una solicitud al servidor. |
| Revalidar | 4 | Utiliza una copia local del recurso si la marca de tiempo del cliente es la misma que la marca de tiempo del recurso en el servidor. De lo contrario, el recurso se descarga de un servidor. |
| Recargar | 5 | Un recurso siempre se descarga del servidor. |
| NoCacheNoStore | 6 | Nunca satisface una solicitud usando recursos de la caché y no almacena recursos en caché. |
| CacheOrNextCacheOnly | 7 | Satisface una solicitud de un recurso ya sea desde la caché del equipo local o desde una caché remota en la LAN. |
| Refresh | 8 | Satisface una solicitud utilizando el servidor o una caché distinta a la caché local. |

## Ver también

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
