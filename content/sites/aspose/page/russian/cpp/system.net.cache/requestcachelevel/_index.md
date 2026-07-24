---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page для C++"
description: "System::Net::Cache::RequestCacheLevel enum. Перечисление описывает параметры кэша, применимые к любому WebRequest в C++."
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
| CacheOnly | 2 | Удовлетворяет запрос ресурса только из кэша. Будет выброшено исключение [WebException](../../system.net/webexception/), если ресурс отсутствует в клиентском кэше. |
| CacheIfAvailable | 3 | Удовлетворяет запрос на ресурс из кэша, если ресурс доступен, иначе отправляет запрос на сервер. |
| Revalidate | 4 | Используется локальная копия ресурса, если метка времени клиента совпадает с меткой времени ресурса на сервере. В противном случае ресурс загружается с сервера. |
| Reload | 5 | Ресурс всегда загружается с сервера. |
| NoCacheNoStore | 6 | Никогда не удовлетворяет запрос, используя ресурсы из кэша, и не кэширует ресурсы. |

## См. также

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
