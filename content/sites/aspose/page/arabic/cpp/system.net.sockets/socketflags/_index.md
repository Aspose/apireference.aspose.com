---
title: "تعداد System::Net::Sockets::SocketFlags"
linktitle: "SocketFlags"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::SocketFlags enum. يوفر قيمًا ثابتة لرسائل المقبس في C++."
type: docs
weight: 1400
url: /ar/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


يوفر قيمًا ثابتة لرسائل المقبس.

```cpp
enum class SocketFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | لا توجد أعلام مستخدمة لهذا الاستدعاء. |
| OutOfBand | 1 | يتم معالجة البيانات خارج النطاق. |
| Peek | 2 | معاينة رسالة واردة. |
| عدم التوجيه | 4 | إرسال رسالة دون استخدام جداول التوجيه. |
| Truncated | 256 | الرسالة كبيرة جدًا لتناسب المخزن المؤقت المحدد. تم اقتطاعها. |
| ControlDataTruncated | 512 | بيانات التحكم أكبر من 64 كيلوبايت ولا تتناسب مع المخزن المؤقت الداخلي. تم اقتطاعها. |
| بث | 1024 | حزمة بث. |
| Multicast | 2048 | حزمة متعددة البث. |
| Partial | 32768 | رسالة تم إرسالها أو استلامها جزئيًا. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
