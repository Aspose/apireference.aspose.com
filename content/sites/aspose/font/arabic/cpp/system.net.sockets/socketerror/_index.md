---
title: "System::Net::Sockets::SocketError تعداد"
linktitle: "SocketError"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::SocketError تعداد. يسرد أنواع أخطاء المقبس في C++."
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
| Success | 0 | اكتملت عملية المقبس بنجاح. |
| SocketError | -1 | حدث خطأ غير محدد في المقبس. |
| Interrupted | 10004 | تم إلغاء استدعاء المقبس المحجوز. |
| AccessDenied | 10013 | تم رفض الوصول إلى المقبس. |
| Fault | 10014 | تم اكتشاف عنوان مؤشر غير صالح. |
| InvalidArgument | 10022 | تم توفير وسيط غير صالح. |
| TooManyOpenSockets | 10024 | هناك عدد كبير جدًا من المقابس المفتوحة في موفر المقابس الأساسي. |
| WouldBlock | 10035 | لا يمكن إكمال العملية فورًا على مقبس غير محجوب. |
| InProgress | 10036 | عملية محجوبة جارية. |
| AlreadyInProgress | 10037 | مقبس غير محجوب لديه بالفعل عملية جارية. |
| NotSocket | 10038 | محاولة لاستدعاء عملية مقبس على كائن غير مقبس. |
| DestinationAddressRequired | 10039 | تم حذف عنوان مطلوب من عملية مقبس. |
| MessageSize | 10040 | حزمة البيانات طويلة جدًا. |
| ProtocolType | 10041 | نوع البروتوكول غير مدعوم من قبل هذا المقبس. |
| ProtocolOption | 10042 | تم استخدام خيار أو مستوى غير معروف أو غير صالح أو غير مدعوم. |
| ProtocolNotSupported | 10043 | البروتوكول غير مطبق أو غير مُكوَّن. |
| SocketNotSupported | 10044 | عائلة العناوين لا تدعم المقبس المحدد. |
| OperationNotSupported | 10045 | عائلة البروتوكولات لا تدعم عائلة العناوين. |
| ProtocolFamilyNotSupported | 10046 | عائلة البروتوكولات غير مطبقة أو غير مُكوَّنة. |
| AddressFamilyNotSupported | 10047 | عائلة العناوين المحددة غير مدعومة. |
| AddressAlreadyInUse | 10048 | يمكن استخدام العنوان مرة واحدة فقط. |
| AddressNotAvailable | 10049 | عنوان IP المختار غير صالح في هذا السياق. |
| NetworkDown | 10050 | الشبكة غير متاحة. |
| NetworkUnreachable | 10051 | لا يوجد مسار إلى المضيف البعيد. |
| NetworkReset | 10052 | حاول تطبيق ضبط 'Keep-Alive' على اتصال انتهت مهلة صلاحيته بالفعل. |
| ConnectionAborted | 10053 | تم إلغاء الاتصال. |
| ConnectionReset | 10054 | تم إعادة ضبط الاتصال من قبل نظير بعيد. |
| NoBufferSpaceAvailable | 10055 | لا توجد مساحة تخزين مؤقتة حرة متاحة لعملية مقبس. |
| IsConnected | 10056 | المقبس متصل بالفعل. |
| NotConnected | 10057 | حاول تطبيق إرسال أو استقبال بيانات، ولم يتم توصيل المقبس. |
| Shutdown | 10058 | طلب إرسال أو استقبال البيانات محظور لأن المقبس قد أُغلق بالفعل. |
| TimedOut | 10060 | انتهت مهلة محاولة الاتصال، أو فشل المضيف المتصل في الاستجابة. |
| ConnectionRefused | 10061 | المضيف البعيد يرفض الاتصال بنشاط. |
| HostDown | 10064 | فشلت العملية لأن المضيف البعيد متوقف. |
| HostUnreachable | 10065 | لا يوجد مسار شبكة إلى المضيف المحدد. |
| ProcessLimit | 10067 | عدد كبير جدًا من العمليات يستخدم موفر المقبس الأساسي. |
| SystemNotReady | 10091 | نظام الشبكة غير متاح. |
| VersionNotSupported | 10092 | إصدار من موفر المقبس الأساسي خارج النطاق. |
| NotInitialized | 10093 | موفر المقبس الأساسي غير مهيأ. |
| جاري قطع الاتصال | 10101 | إغلاق هادئ قيد التنفيذ. |
| TypeNotFound | 10109 | الفئة المحددة غير موجودة. |
| HostNotFound | 11001 | المضيف المحدد غير معروف. |
| TryAgain | 11002 | لا يمكن حل اسم المضيف. |
| NoRecovery | 11003 | الخطأ غير قابل للاسترداد أو لا يمكن العثور على قاعدة البيانات المطلوبة. |
| NoData | 11004 | الاسم أو عنوان IP المطلوب غير موجود على خادم الأسماء. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
