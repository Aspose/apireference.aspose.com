---
title: "System::Net::Cache::HttpRequestCachePolicy klass"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page för C++"
description: "System::Net::Cache::HttpRequestCachePolicy klass. HTTP-cachepolicy som uttrycker RFC2616 HTTP-cachingssemantik. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 100
url: /sv/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


HTTP-cachepolicy som uttrycker RFC2616 HTTP-cachingssemantik. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Hämtar tiden då resurser lagrade i cachen måste omvalideras. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Hämtar tiden i UTC-format då resurser lagrade i cachen måste omvalideras. Endast för internt bruk. |
| [get_Level](./get_level/)() const | RTTI-information. |
| [get_MaxAge](./get_maxage/)() const | Hämtar den maximala åldern som är tillåten för en resurs. |
| [get_MaxStale](./get_maxstale/)() const | Hämtar det maximala föråldringsvärdet som är tillåtet för en resurs. |
| [get_MinFresh](./get_minfresh/)() const | Hämtar den minsta åldern som är tillåten för en resurs. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Skapar en ny instans. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Skapar en ny instans. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Skapar en ny instans. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Skapar en ny instans. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Skapar en ny instans. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Skapar en ny instans. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
## Se även

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
