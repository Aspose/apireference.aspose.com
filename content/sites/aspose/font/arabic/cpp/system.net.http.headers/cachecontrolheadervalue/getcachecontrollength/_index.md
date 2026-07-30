---
title: "طريقة System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength"
linktitle: "GetCacheControlLength"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength. يحول سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من فئة CacheControlHeaderValue في C++."
type: docs
weight: 3400
url: /ar/cpp/system.net.http.headers/cachecontrolheadervalue/getcachecontrollength/
---
## CacheControlHeaderValue::GetCacheControlLength method


يحوِّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من الفئة [CacheControlHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength(String input, int32_t startIndex, System::SharedPtr<CacheControlHeaderValue> storeValue, System::SharedPtr<CacheControlHeaderValue> &parsedValue)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الإدخال | String | سلسلة للتحليل. |
| startIndex | int32_t | موضع بدء للتحليل. |
| storeValue | System::SharedPtr\<CacheControlHeaderValue\> | قيمة يجب إضافتها إلى الكائن المُحلَّل. |
| parsedValue | System::SharedPtr\<CacheControlHeaderValue\>\& | نسخة حيث سيتم تعيين كائن مُحلَّل. |

### ReturnValue

طول الجزء الفرعي المُحلَّل، وإلا 0.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CacheControlHeaderValue](../)
* Class [CacheControlHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
