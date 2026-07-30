---
title: "System::UriComponents عدد"
linktitle: "UriComponents"
second_title: "Aspose.Font لـ C++"
description: "System::UriComponents عدد. يمثل مكونات URI في C++."
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
| المخطط | 1 | بيانات Scheme. |
| UserInfo | 2 | بيانات UserInfo. |
| Host | 4 | بيانات Host. |
| Port | 8 | بيانات Port. |
| SchemeAndServer | غير متوفر | بيانات Scheme، Host و Port. |
| المسار | 16 | بيانات LocalPath. |
| الاستعلام | 32 | بيانات Query. |
| PathAndQuery | غير متوفر | بيانات LocalPath و Query. |
| HttpRequestUrl | غير متوفر | بيانات Scheme، Host، Port، Query و LocalPath. |
| Fragment | 64 | بيانات Fragment. |
| AbsoluteUri | غير متوفر | بيانات Scheme، Host، Port، Quer، LocalPath و Fragment. |
| StrongPort | 128 | بيانات Port؛ إذا لم تكن بيانات المنفذ موجودة في [Uri](../uri/) وتم تعيين منفذ افتراضي إلى Scheme، يتم إرجاع المنفذ الافتراضي؛ إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| HostAndPort | n/a | بيانات المضيف والمنفذ؛ إذا لم تكن بيانات المنفذ موجودة في [Uri](../uri/) وتم تعيين منفذ افتراضي للمخطط، يتم إرجاع المنفذ الافتراضي. إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| StrongAuthority | n/a | بيانات UserInfo والمضيف والمنفذ. إذا لم تكن بيانات المنفذ موجودة في [Uri](../uri/) وتم تعيين منفذ افتراضي للمخطط، يتم إرجاع المنفذ الافتراضي. إذا لم يكن هناك منفذ افتراضي، يتم إرجاع -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | يحدد أنه يجب تضمين الفاصل. |
| SerializationInfoString | n/a | السياق الكامل لـ [Uri](../uri/) المطلوب لمُسلسلات [Uri](../uri/). يتضمن السياق نطاق IPv6. |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
