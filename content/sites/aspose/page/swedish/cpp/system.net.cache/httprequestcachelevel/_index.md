---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page för C++"
description: "System::Net::Cache::HttpRequestCacheLevel enum. Enumet beskriver cacheinställningar för HTTP i C++."
type: docs
weight: 400
url: /sv/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


Enumet beskriver cacheinställningar för HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Default | 0 | Tillfredsställer en begäran om en resurs antingen genom att använda den cachade kopian av resursen eller genom att skicka en begäran om resursen till servern. |
| BypassCache | 1 | Uppfyller en begäran genom att använda servern. |
| CacheOnly | 2 | Använder alltid klientcachen för att hämta en resurs. |
| CacheIfAvailable | 3 | Uppfyller en begäran om en resurs från cachen om resursen är tillgänglig, annars skickas en begäran till servern. |
| Omvalidera | 4 | Använder en lokal kopia av en resurs om klientens tidsstämpel är densamma som tidsstämpeln för resursen på servern. Annars hämtas en resurs från en server. |
| Läs om | 5 | En resurs hämtas alltid från servern. |
| NoCacheNoStore | 6 | Uppfyller aldrig en begäran genom att använda resurser från cachen och cachar inte resurser. |
| CacheOrNextCacheOnly | 7 | Uppfyller en begäran om en resurs antingen från den lokala datorns cache eller från en fjärrcache på LAN. |
| Refresh | 8 | Uppfyller en begäran genom att använda servern eller en cache annan än den lokala cachen. |

## Se även

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
