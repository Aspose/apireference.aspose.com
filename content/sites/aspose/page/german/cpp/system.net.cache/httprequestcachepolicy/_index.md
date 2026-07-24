---
title: "Klasse System::Net::Cache::HttpRequestCachePolicy"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page für C++"
description: "System::Net::Cache::HttpRequestCachePolicy Klasse. HTTP-Cache-Richtlinie, die die RFC2616-HTTP-Caching-Semantik ausdrückt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


HTTP-Cache-Richtlinie, die die RFC2616-HTTP-Caching-Semantik ausdrückt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Ermittelt die Zeit, zu der im Cache gespeicherte Ressourcen neu validiert werden müssen. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Ermittelt die Zeit im UTC-Format, zu der im Cache gespeicherte Ressourcen neu validiert werden müssen. Nur für den internen Gebrauch. |
| [get_Level](./get_level/)() const | RTTI-Informationen. |
| [get_MaxAge](./get_maxage/)() const | Ermittelt das maximal zulässige Alter für eine Ressource. |
| [get_MaxStale](./get_maxstale/)() const | Ermittelt den maximal zulässigen Veralterungswert für eine Ressource. |
| [get_MinFresh](./get_minfresh/)() const | Ermittelt das minimal zulässige Alter für eine Ressource. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Konstruiert eine neue Instanz. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Konstruiert eine neue Instanz. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Konstruiert eine neue Instanz. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Konstruiert eine neue Instanz. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Konstruiert eine neue Instanz. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Konstruiert eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
