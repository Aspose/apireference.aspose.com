---
title: "System::Net::Cache::HttpRequestCachePolicy класс"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Font для C++"
description: "System::Net::Cache::HttpRequestCachePolicy класс. Политика кэширования HTTP, выражающая семантику кэширования HTTP RFC2616. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Политика кэширования HTTP, выражающая семантику кэширования HTTP RFC2616. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Получает время, когда ресурсы, хранящиеся в кэше, должны быть переоценены. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Получает время в формате UTC, когда ресурсы, хранящиеся в кэше, должны быть переоценены. Только для внутреннего использования. |
| [get_Level](./get_level/)() const | Информация RTTI. |
| [get_MaxAge](./get_maxage/)() const | Получает максимальный возраст, разрешённый для ресурса. |
| [get_MaxStale](./get_maxstale/)() const | Получает максимальное значение устаревания, разрешённое для ресурса. |
| [get_MinFresh](./get_minfresh/)() const | Получает минимальный возраст, разрешённый для ресурса. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Создаёт новый экземпляр. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Создаёт новый экземпляр. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Создаёт новый экземпляр. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Создаёт новый экземпляр. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Создаёт новый экземпляр. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Создаёт новый экземпляр. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../../system/object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
## См. также

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
