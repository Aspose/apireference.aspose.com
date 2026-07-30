---
title: "System::Net::Sockets::SocketFlags enum"
linktitle: "SocketFlags"
second_title: "Aspose.Font لـ C++"
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
| None | 0 | لا توجد أعلام مستخدمة لهذا الاستدعاء. |
| OutOfBand | 1 | يتم معالجة البيانات خارج النطاق. |
| Peek | 2 | معاينة رسالة واردة. |
| DontRoute | 4 | إرسال رسالة دون استخدام جداول التوجيه. |
| Truncated | 256 | الرسالة كبيرة جدًا بحيث لا يمكن أن تتسع في المخزن المؤقت المحدد. تم تقصيرها. |
| ControlDataTruncated | 512 | بيانات التحكم أكبر من 64 كيلوبايت ولا تتسع في المخزن المؤقت الداخلي. تم تقصيرها. |
| Broadcast | 1024 | حزمة بث. |
| Multicast | 2048 | حزمة متعددة الإرسال. |
| جزئي | 32768 | رسالة تم إرسالها أو استلامها جزئيًا. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
