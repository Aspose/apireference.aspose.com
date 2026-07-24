---
title: "System::Net::Cache::RequestCacheLevel enumeración"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page para C++"
description: "System::Net::Cache::RequestCacheLevel enumeración. La enumeración describe la configuración de caché aplicable a cualquier WebRequest en C++."
type: docs
weight: 500
url: /es/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


La enumeración describe la configuración de caché aplicable a cualquier [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Default | 0 | Satisface una solicitud de un recurso ya sea utilizando la copia en caché del recurso o enviando una solicitud del recurso al servidor. |
| BypassCache | 1 | Satisface una solicitud utilizando el servidor. No se toman entradas de la caché. |
| CacheOnly | 2 | Satisface una solicitud de un recurso solo desde la caché. Se lanzará [WebException](../../system.net/webexception/) cuando un recurso no se encuentre en la caché del cliente. |
| CacheIfAvailable | 3 | Satisface una solicitud de un recurso desde la caché si el recurso está disponible; de lo contrario, envía una solicitud al servidor. |
| Revalidar | 4 | Utiliza una copia local del recurso si la marca de tiempo del cliente es la misma que la marca de tiempo del recurso en el servidor. De lo contrario, el recurso se descarga de un servidor. |
| Recargar | 5 | Un recurso siempre se descarga del servidor. |
| NoCacheNoStore | 6 | Nunca satisface una solicitud usando recursos de la caché y no almacena recursos en caché. |

## Ver también

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
