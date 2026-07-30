---
title: "Перечисление System::Net::Cache::RequestCacheLevel"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font для C++"
description: "Перечисление System::Net::Cache::RequestCacheLevel. Перечисление описывает параметры кэша, применимые к любому WebRequest в C++."
type: docs
weight: 500
url: /ru/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


Перечисление описывает параметры кэша, применимые к любому [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Default | 0 | Удовлетворяет запрос ресурса, используя либо кэшированную копию ресурса, либо отправляя запрос ресурса на сервер. |
| BypassCache | 1 | Удовлетворяет запрос, используя сервер. Записи из кэша не берутся. |
| CacheOnly | 2 | Удовлетворяет запрос ресурса только из кэша. При отсутствии ресурса в клиентском кэше будет выброшено исключение [WebException](../../system.net/webexception/). |
| CacheIfAvailable | 3 | Удовлетворяет запрос ресурса из кэша, если ресурс доступен; в противном случае отправляет запрос на сервер. |
| Revalidate | 4 | Используется локальная копия ресурса, если метка времени клиента совпадает с меткой времени ресурса на сервере. В противном случае ресурс загружается с сервера. |
| Reload | 5 | Ресурс всегда загружается с сервера. |
| NoCacheNoStore | 6 | Никогда не удовлетворяет запрос, используя ресурсы из кэша, и не кэширует ресурсы. |

## См. также

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
