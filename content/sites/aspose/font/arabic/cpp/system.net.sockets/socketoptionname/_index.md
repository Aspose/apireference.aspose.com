---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::SocketOptionName enum. يحدد أسماء خيارات المقبس لفئة Socket في C++."
type: docs
weight: 1600
url: /ar/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


يحدد أسماء خيارات المقبس لفئة [Socket](../socket/).

```cpp
enum class SocketOptionName
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Debug | 1 | سجّل معلومات التصحيح. |
| AcceptConnection | 2 | يشير إلى ما إذا كان المقبس يستمع لاتصال وارد. |
| ReuseAddress | 4 | يشير إلى ما إذا كان يمكن ربط المقبس بالعنوان الذي هو قيد الاستخدام بالفعل. |
| KeepAlive | 8 | يفعل حزم 'Keep-Alive' لاتصال المقبس. |
| DontRoute | 16 | يشير إلى ما إذا تم إرسال الحزمة مباشرة إلى عناوين الواجهة. |
| Broadcast | 32 | يشير إلى ما إذا كان يمكن للمقبس إرسال رسائل البث. |
| UseLoopback | 64 | تجاوز الأجهزة عندما يكون ذلك ممكنًا. |
| Linger | 128 | سيقوم النظام بحجز العملية عند محاولة الإغلاق حتى يتمكن من نقل البيانات. |
| OutOfBandInline | 256 | يتلقى بيانات خارج النطاق ضمن تدفق البيانات العادي. |
| DontLinger | غير متوفر | يشير إلى ما إذا كان سيتم إغلاق المقبس دون الانتظار. |
| ExclusiveAddressUse | غير متوفر | سيستخدم المقبس العنوان المرتبط حصريًا. |
| SendBuffer | 4097 | يحدد حجم مخزن الإرسال. |
| ReceiveBuffer | 4098 | يحدد حجم مخزن الاستقبال. |
| SendLowWater | 4099 | يحدد الحد الأدنى لكمية البيانات لعمليات الإرسال. |
| ReceiveLowWater | 4100 | يحدد الحد الأدنى لكمية البيانات لعمليات الاستقبال. |
| SendTimeout | 4101 | يحدد مهلة عمليات الإرسال المتزامنة. |
| ReceiveTimeout | 4102 | يحدد مهلة عمليات الاستقبال المتزامنة. |
| Error | 4103 | يعيد حالة الخطأ ويُمسح. |
| نوع | 4104 | يعيد نوع المقبس. |
| ReuseUnicastPort | 12295 | يشير إلى ما إذا كان النظام يجب أن يؤجل تخصيص المنفذ المؤقت للاتصالات الصادرة. |
| MaxConnections | 2147483647 | هذا الخيار غير مدعوم. كان يُستخدم لتحديد الحد الأقصى لطول قائمة الانتظار للاستماع. |
| IPOptions | 1 | يحدد خيار IP الذي يجب إدراجه في الحزم الصادرة. |
| HeaderIncluded | 2 | يتم تضمين الرأس في الحزم الصادرة. |
| TypeOfService | 3 | غيّر نوع حقل الخدمة في رأس IP. |
| IpTimeToLive | 4 | وقت البقاء لـ IP. |
| MulticastInterface | 9 | حدد الواجهة للحزم المتعددة الإرسال الصادرة. |
| MulticastTimeToLive | 10 | وقت البقاء للـ IP المتعدد الإرسال. |
| MulticastLoopback | 11 | إعادة توجيه الـ IP المتعدد الإرسال. |
| AddMembership | 12 | أضف عضوية مجموعة IP. |
| DropMembership | 13 | احذف عضوية مجموعة IP. |
| DontFragment | 14 | لا تقم بتجزئة حزم IP. |
| AddSourceMembership | 15 | انضم إلى مجموعة/مصدر IP. |
| DropSourceMembership | 16 | احذف مجموعة/مصدر IP. |
| BlockSource | 17 | احظر مجموعة/مصدر IP. |
| UnblockSource | 18 | إلغاء حظر مجموعة/مصدر IP. |
| PacketInformation | 19 | استلام معلومات الحزمة لـ IPv4. |
| HopLimit | 21 | يُعيد عددًا صحيحًا يحتوي على عدد HOP للحزمة. |
| IPProtectionLevel | 23 | يُمكّن تقييد مقبس IPv6 إلى النطاق المحدد. |
| IPv6Only | 27 | المقبس مقيد بإرسال واستقبال حزم IPv6 فقط. |
| NoDelay | 1 | يعطل خوارزمية Nagle لتجميع الحزم المرسلة. |
| BsdUrgent | 2 | استخدم البيانات العاجلة كما هو موضح في RFC-1222. |
| Expedited | 2 | استخدم البيانات المعجلة كما هو موضح في RFC-1222. |
| NoChecksum | 1 | أرسل حزم UDP مع تعيين قيمة الفحص إلى صفر. |
| ChecksumCoverage | 20 | تعيين أو الحصول على تغطية فحص UDP. |
| UpdateAcceptContext | 28683 | يقوم بتحديث مقبس العميل بنفس خصائص مقبس الاستماع. |
| UpdateConnectContext | 28688 | يقوم بتحديث مقبس العميل بنفس خصائص مقبس الاستماع. |

## انظر أيضًا

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
