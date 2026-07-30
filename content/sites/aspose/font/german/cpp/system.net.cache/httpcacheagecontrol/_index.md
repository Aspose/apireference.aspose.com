---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Font für C++"
description: "System::Net::Cache::HttpCacheAgeControl Aufzählung. CacheAgeControl wird verwendet, um Präferenzen bezüglich des Alters und der Frische von zwischengespeicherten Elementen in C++ anzugeben."
type: docs
weight: 300
url: /de/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl wird verwendet, um Präferenzen hinsichtlich des Alters und der Frische von zwischengespeicherten Elementen anzugeben.

```cpp
enum class HttpCacheAgeControl
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Nur für den internen Gebrauch. |
| MinFresh | 1 | Inhalte können aus dem Cache entnommen werden, wenn die verbleibende Zeit bis zum Ablauf größer oder gleich der mit diesem Wert angegebenen Zeit ist. |
| MaxAge | 2 | Inhalte können aus dem Cache entnommen werden, bis sie älter sind als das mit diesem Wert angegebene Alter. |
| MaxStale | 4 | Inhalte können aus dem Cache entnommen werden, nachdem sie abgelaufen sind, bis die mit diesem Wert angegebene Zeit verstrichen ist. |
| MaxAgeAndMinFresh | 3 | MaxAge und MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge und MaxStale. |

## Siehe auch

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
