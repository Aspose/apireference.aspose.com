---
title: "فئة System::Net::Sockets::TcpClient"
linktitle: "TcpClient"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::Sockets::TcpClient. تمثل عميلًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت تشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


تمثل عميلًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت تشغيل و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TcpClient : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية اتصال غير متزامنة. |
| [Close](./close/)() | يغلق الاتصال ويحرّر النسخة الحالية. |
| [Connect](./connect/)(String, int32_t) | يقوم بإنشاء اتصال بالمضيف البعيد المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | يقوم بإنشاء اتصال بالمضيف البعيد المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | يقوم بإنشاء اتصال بالمضيف البعيد المحدد. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | يقوم بإنشاء اتصال بالمضيف البعيد المحدد. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى يكتمل عملية الاتصال غير المتزامنة المحددة. |
| [get_Available](./get_available/)() | يعيد عدد البايتات التي تم استلامها وجاهزة للقراءة. |
| [get_Client](./get_client/)() | معلومات RTTI. |
| [get_Connected](./get_connected/)() | يعيد قيمة تشير إلى ما إذا كان المقبس متصلاً بالمضيف البعيد. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | يحصل على قيمة تشير إلى ما إذا كانت النسخة الحالية تسمح بعميل واحد فقط باستخدام المنفذ. |
| [get_LingerState](./get_lingerstate/)() | يحصل على قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [get_NoDelay](./get_nodelay/)() | يحصل على قيمة تشير إلى ما إذا كانت النسخة الحالية تستخدم خوارزمية Nagle. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | يحصل على حجم المخزن المؤقت المستخدم لاستقبال البيانات. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | يحصل على قيمة تشير إلى مقدار الوقت الذي ينتهي بعده استلام البيانات. |
| [get_SendBufferSize](./get_sendbuffersize/)() | يحصل على حجم المخزن المؤقت المستخدم لإرسال البيانات. |
| [get_SendTimeout](./get_sendtimeout/)() | يحصل على قيمة تشير إلى مقدار الوقت الذي ينتهي بعده إرسال البيانات. |
| [GetStream](./getstream/)() | يعيد الدفق المستخدم لإرسال واستقبال البيانات. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | يضبط المقبس. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | يضبط قيمة تشير إلى ما إذا كانت النسخة الحالية تسمح بعميل واحد فقط باستخدام المنفذ. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | يضبط قيمة تشير إلى ما إذا كان المقبس سيؤخر الإغلاق في محاولة لإرسال جميع البيانات المعلقة. |
| [set_NoDelay](./set_nodelay/)(bool) | يضبط قيمة تشير إلى ما إذا كانت النسخة الحالية تستخدم خوارزمية Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | يضبط حجم المخزن المؤقت المستخدم لاستقبال البيانات. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | يضبط قيمة تشير إلى مقدار الوقت الذي ينتهي بعده استلام البيانات. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | يضبط حجم المخزن المؤقت المستخدم لإرسال البيانات. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | يضبط قيمة تشير إلى مقدار الوقت الذي ينتهي بعده إرسال البيانات. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | ينشئ نسخة جديدة. |
| [TcpClient](./tcpclient/)() | ينشئ نسخة جديدة. |
| [TcpClient](./tcpclient/)(AddressFamily) | ينشئ نسخة جديدة. |
| [TcpClient](./tcpclient/)(String, int32_t) | ينشئ نسخة جديدة. |
| virtual [~TcpClient](./~tcpclient/)() | يدمر المثيل الحالي. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
