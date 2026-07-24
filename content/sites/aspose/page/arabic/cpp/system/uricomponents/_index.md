---
title: "تعداد System::UriComponents"
linktitle: "UriComponents"
second_title: "Aspose.Page لـ C++"
description: "تعداد System::UriComponents. يمثل مكونات URI في C++."
type: docs
weight: 8900
url: /ar/cpp/system/uricomponents/
---
## UriComponents enum


يمثل مكونات URI.

```cpp
enum class UriComponents
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| المخطط | 1 | بيانات المخطط. |
| UserInfo | 2 | بيانات UserInfo. |
| Host | 4 | بيانات المضيف. |
| المنفذ | 8 | بيانات المنفذ. |
| SchemeAndServer | n/a | بيانات المخطط، المضيف والمنفذ. |
| Path | 16 | بيانات المسار المحلي. |
| الاستعلام | 32 | بيانات الاستعلام. |
| PathAndQuery | n/a | بيانات المسار المحلي والاستعلام. |
| HttpRequestUrl | n/a | بيانات المخطط، المضيف، المنفذ، الاستعلام والمسار المحلي. |
| Fragment | 64 | بيانات الجزء. |
| AbsoluteUri | n/a | بيانات Scheme و Host و Port و Quer و LocalPath و Fragment. |
| StrongPort | 128 | بيانات Port؛ إذا لم تكن بيانات المنفذ موجودة في [Uri](../uri/) وتم تعيين منفذ افتراضي إلى Scheme، يتم إرجاع المنفذ الافتراضي؛ إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| HostAndPort | n/a | بيانات Host و Port؛ إذا لم تكن بيانات المنفذ موجودة في [Uri](../uri/) وتم تعيين منفذ افتراضي إلى Scheme، يتم إرجاع المنفذ الافتراضي. إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| StrongAuthority | n/a | بيانات UserInfo و Host و Port. إذا لم توجد بيانات المنفذ في [Uri](../uri/) وتم تعيين منفذ افتراضي إلى Scheme، يتم إرجاع المنفذ الافتراضي. إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | يحدد أنه يجب تضمين الفاصل. |
| SerializationInfoString | n/a | السياق الكامل لـ [Uri](../uri/) المطلوب لـ [Uri](../uri/) Serializers. يشمل السياق نطاق IPv6. |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
