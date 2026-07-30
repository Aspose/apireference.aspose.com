---
title: "عدد System::Net::WebExceptionStatus"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Font لـ C++"
description: "عدد System::Net::WebExceptionStatus. يعدد رموز الحالة لفئة WebException في C++."
type: docs
weight: 4900
url: /ar/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


يعدد رموز الحالة لفئة [WebException](../webexception/).

```cpp
enum class WebExceptionStatus
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Success | 0 | لم تحدث أي أخطاء. |
| NameResolutionFailure | 1 | لم يتمكن خدمة حل الأسماء من حل اسم المضيف. |
| ConnectFailure | 2 | لم يتمكن نقطة الخدمة البعيدة من الاتصال على مستوى النقل. |
| ReceiveFailure | 3 | لم يتم استلام استجابة كاملة من الخادم البعيد. |
| SendFailure | 4 | لم يتمكن إرسال طلب كامل إلى الخادم البعيد. |
| PipelineFailure | 5 | كان الطلب طلبًا متسلسلًا وتم إغلاق الاتصال قبل استلام الاستجابة. |
| RequestCanceled | 6 | تم إلغاء الطلب أو حدث خطأ غير قابل للتصنيف. |
| ProtocolError | 7 | كانت الاستجابة المستلمة من الخادم كاملة لكنها أشارت إلى خطأ على مستوى البروتوكول. |
| ConnectionClosed | 8 | تم إغلاق الاتصال مبكرًا. |
| TrustFailure | 9 | لم يتمكن التحقق من شهادة الخادم. |
| SecureChannelFailure | 10 | حدث خطأ أثناء إنشاء اتصال باستخدام SSL. |
| ServerProtocolViolation | 11 | استجابة الخادم لم تكن استجابة HTTP صالحة. |
| KeepAliveFailure | 12 | تم إغلاق الاتصال لطلب يحدد رأس 'Keep-Alive' بشكل غير متوقع. |
| قيد الانتظار | 13 | هناك طلب غير متزامن داخلي قيد الانتظار. |
| Timeout | 14 | لم يتم استلام أي استجابة خلال فترة المهلة لطلب. |
| ProxyNameResolutionFailure | 15 | لم يتمكن خدمة حل الأسماء من حل اسم مضيف الوكيل. |
| UnknownError | 16 | حدث استثناء من نوع غير معروف. |
| MessageLengthLimitExceeded | 17 | تم استلام رسالة تجاوزت الحد المحدد. |
| CacheEntryNotFound | 18 | لم يتم العثور على إدخال الذاكرة المؤقتة المحدد. |
| RequestProhibitedByCachePolicy | 19 | لم يُسمح بالطلب وفقًا لسياسة الذاكرة المؤقتة. |
| RequestProhibitedByProxy | 20 | لم يُسمح بهذا الطلب من قبل الوكيل. |

## انظر أيضًا

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
