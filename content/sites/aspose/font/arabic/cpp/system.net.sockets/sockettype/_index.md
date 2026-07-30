---
title: "System::Net::Sockets::SocketType تعداد"
linktitle: "SocketType"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::SocketType تعداد. يسرد أنواع المقابس في C++."
type: docs
weight: 1800
url: /ar/cpp/system.net.sockets/sockettype/
---
## SocketType enum


يسرد أنواع المقبس.

```cpp
enum class SocketType
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| تيار | 1 | النوع الذي يدعم تدفقات بايت موثوقة، ثنائية الاتجاه، قائمة على الاتصال، دون تكرار البيانات ودون الحفاظ على الحدود. |
| Dgram | 2 | النوع الذي يدعم datagrams، وهي رسائل غير موثوقة ولا تحتاج إلى اتصال بطول أقصى ثابت. |
| Raw | 3 | النوع الذي يدعم الوصول إلى بروتوكول النقل الأساسي. |
| Rdm | 4 | النوع الذي يدعم الاتصالات غير المتصلة، الموجهة للرسائل، التي تُسلم الرسائل بموثوقية، ويحافظ على حدود الرسائل في البيانات. |
| Seqpacket | 5 | النوع الذي يوفر نقلًا ثنائي الاتجاه موثوقًا وموجهًا للاتصال لتدفقات بايت مرتبة عبر الشبكة. |
| غير معروف | غير متوفر | نوع غير معروف. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
