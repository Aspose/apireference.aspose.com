---
title: "Clase System::Net::Cache::HttpRequestCachePolicy"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page para C++"
description: "Clase System::Net::Cache::HttpRequestCachePolicy. Política de caché HTTP que expresa la semántica de almacenamiento en caché HTTP RFC2616. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 100
url: /es/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Política de caché HTTP que expresa la semántica de almacenamiento en caché HTTP RFC2616. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Obtiene la hora en que los recursos almacenados en la caché deben ser revalidados. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Obtiene la hora en formato UTC en que los recursos almacenados en la caché deben ser revalidados. Solo para uso interno. |
| [get_Level](./get_level/)() const | Información RTTI. |
| [get_MaxAge](./get_maxage/)() const | Obtiene la edad máxima permitida para un recurso. |
| [get_MaxStale](./get_maxstale/)() const | Obtiene el valor máximo de obsolescencia que se permite para un recurso. |
| [get_MinFresh](./get_minfresh/)() const | Obtiene la edad mínima permitida para un recurso. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Construye una nueva instancia. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Construye una nueva instancia. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Construye una nueva instancia. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Construye una nueva instancia. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Construye una nueva instancia. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Construye una nueva instancia. |
| [ToString](./tostring/)() const override | Análogo del método C# [Object.ToString()](../../system/object/tostring/). Permite convertir objetos personalizados a cadena. |
## Ver también

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
