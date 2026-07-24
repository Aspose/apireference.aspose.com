---
title: "تعداد System::Net::Sockets::SocketError"
linktitle: "SocketError"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::SocketError enum. يعدد أنواع أخطاء المقبس في C++."
type: docs
weight: 1300
url: /ar/cpp/system.net.sockets/socketerror/
---
## SocketError enum


يسرد أنواع أخطاء المقبس.

```cpp
enum class SocketError
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Success | 0 | تم إكمال عملية المقبس بنجاح. |
| SocketError | -1 | حدث خطأ غير محدد في المقبس. |
| Interrupted | 10004 | تم إلغاء استدعاء مقبس blocking. |
| AccessDenied | 10013 | تم رفض الوصول إلى مقبس. |
| Fault | 10014 | تم اكتشاف عنوان مؤشر غير صالح. |
| InvalidArgument | 10022 | تم توفير وسيط غير صالح. |
| TooManyOpenSockets | 10024 | هناك عدد كبير جدًا من المقابس المفتوحة في موفر المقابس الأساسي. |
| WouldBlock | 10035 | لا يمكن إكمال العملية فورًا على مقبس non-blocking. |
| InProgress | 10036 | جاري تنفيذ عملية حجب. |
| AlreadyInProgress | 10037 | المقبس غير الحاجز لديه بالفعل عملية جارية. |
| NotSocket | 10038 | محاولة استدعاء عملية مقبس على غير مقبس. |
| DestinationAddressRequired | 10039 | تم حذف عنوان مطلوب من عملية مقبس. |
| MessageSize | 10040 | حزمة البيانات طويلة جدًا. |
| ProtocolType | 10041 | نوع البروتوكول غير مدعوم من قبل هذا المقبس. |
| ProtocolOption | 10042 | تم استخدام خيار أو مستوى غير معروف أو غير صالح أو غير مدعوم. |
| ProtocolNotSupported | 10043 | البروتوكول غير مُنفذ أو غير مُكوَّن. |
| SocketNotSupported | 10044 | عائلة العناوين لا تدعم المقبس المحدد. |
| OperationNotSupported | 10045 | عائلة البروتوكول لا تدعم عائلة العنوان. |
| ProtocolFamilyNotSupported | 10046 | عائلة البروتوكول غير مُنفذة أو غير مُكوَّنة. |
| AddressFamilyNotSupported | 10047 | عائلة العنوان المحددة غير مدعومة. |
| AddressAlreadyInUse | 10048 | يمكن استخدام العنوان مرة واحدة فقط. |
| AddressNotAvailable | 10049 | عنوان IP المحدد غير صالح في هذا السياق. |
| NetworkDown | 10050 | الشبكة غير متوفرة. |
| NetworkUnreachable | 10051 | لا يوجد مسار إلى المضيف البعيد. |
| NetworkReset | 10052 | حاول تطبيق ضبط 'Keep-Alive' على اتصال انتهت مهلة صلاحيته بالفعل. |
| ConnectionAborted | 10053 | تم إلغاء الاتصال. |
| ConnectionReset | 10054 | تم إعادة تعيين الاتصال من قبل نظير بعيد. |
| NoBufferSpaceAvailable | 10055 | لا توجد مساحة مخزن مؤقت مجانية متاحة لعملية المقبس. |
| IsConnected | 10056 | المقبس متصل بالفعل. |
| NotConnected | 10057 | حاول تطبيق إرسال أو استقبال بيانات، ولكن المقبس غير متصل. |
| Shutdown | 10058 | طلب إرسال أو استقبال البيانات محظور لأن المقبس قد أُغلق بالفعل. |
| TimedOut | 10060 | انتهت مهلة محاولة الاتصال، أو فشل المضيف المتصل في الاستجابة. |
| ConnectionRefused | 10061 | المضيف البعيد يرفض الاتصال بنشاط. |
| HostDown | 10064 | فشلت عملية لأن المضيف البعيد متوقف. |
| HostUnreachable | 10065 | لا يوجد مسار شبكة إلى المضيف المحدد. |
| ProcessLimit | 10067 | عدد كبير جدًا من العمليات يستخدم موفر المقابس الأساسي. |
| SystemNotReady | 10091 | نظام فرعي للشبكة غير متاح. |
| VersionNotSupported | 10092 | إصدار من موفر المقابس الأساسي خارج النطاق. |
| NotInitialized | 10093 | موفر المقابس الأساسي غير مهيأ. |
| Disconnecting | 10101 | إغلاق هادئ قيد التنفيذ. |
| TypeNotFound | 10109 | الفئة المحددة غير موجودة. |
| HostNotFound | 11001 | المضيف المحدد غير معروف. |
| حاول مرة أخرى | 11002 | لا يمكن حل اسم المضيف. |
| بدون استرداد | 11003 | الخطأ غير قابل للاسترداد أو لا يمكن العثور على قاعدة البيانات المطلوبة. |
| لا توجد بيانات | 11004 | الاسم أو عنوان IP المطلوب غير موجود على خادم الأسماء. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
