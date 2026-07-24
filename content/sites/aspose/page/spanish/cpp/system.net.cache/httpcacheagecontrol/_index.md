---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page para C++"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl se utiliza para especificar preferencias respecto a la edad y frescura de los elementos en caché en C++."
type: docs
weight: 300
url: /es/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl se utiliza para especificar preferencias respecto a la edad y frescura de los elementos en caché.

```cpp
enum class HttpCacheAgeControl
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | Solo para uso interno. |
| MinFresh | 1 | El contenido puede obtenerse de la caché si el tiempo restante antes de la expiración es mayor o igual al tiempo especificado con este valor. |
| MaxAge | 2 | El contenido puede tomarse de la caché hasta que sea más antiguo que la edad especificada con este valor. |
| MaxStale | 4 | El contenido puede tomarse de la caché después de que haya expirado hasta que transcurra el tiempo especificado con este valor. |
| MaxAgeAndMinFresh | 3 | MaxAge y MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge y MaxStale. |

## Ver también

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
