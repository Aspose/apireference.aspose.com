---
title: "System::Net::Cache::HttpRequestCachePolicy class"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page voor C++"
description: "System::Net::Cache::HttpRequestCachePolicy class. HTTP-cachebeleid dat de RFC2616 HTTP-cachingsemantiek uitdrukt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


HTTP-cachebeleid dat de RFC2616 HTTP-cachingsemantiek uitdrukt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Geeft de tijd terug wanneer opgeslagen bronnen in de cache moeten worden gerevalideerd. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Geeft de tijd in UTC-formaat terug wanneer opgeslagen bronnen in de cache moeten worden gerevalideerd. Alleen voor intern gebruik. |
| [get_Level](./get_level/)() const | RTTI-informatie. |
| [get_MaxAge](./get_maxage/)() const | Geeft de maximale leeftijd die voor een bron is toegestaan. |
| [get_MaxStale](./get_maxstale/)() const | Geeft de maximale verouderingswaarde die voor een bron is toegestaan. |
| [get_MinFresh](./get_minfresh/)() const | Geeft de minimale leeftijd die voor een bron is toegestaan. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Construeert een nieuw exemplaar. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Construeert een nieuw exemplaar. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Construeert een nieuw exemplaar. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Construeert een nieuw exemplaar. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Construeert een nieuw exemplaar. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
