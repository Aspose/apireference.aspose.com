---
title: "System::Net::Sockets::TcpListener class"
linktitle: "TcpListener"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Sockets::TcpListener. تمثل مستمعًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


تمثل مستمعًا لخدمات الشبكة TCP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TcpListener : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | يقبل طلب الاتصال المعلق ويعيد المقبس المستخدم لإرسال واستقبال البيانات. |
| [AcceptTcpClient](./accepttcpclient/)() | يقبل طلب الاتصال المعلق ويعيد نسخة من فئة TcpClient المستخدمة لإرسال واستقبال البيانات. |
| [AllowNatTraversal](./allownattraversal/)(bool) | يفعل أو يعطل عبور NAT. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية قبول غير متزامنة. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية قبول غير متزامنة. |
| static [Create](./create/)(int32_t) | إنشاء نسخة جديدة باستخدام رقم المنفذ المحدد. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل عملية القبول غير المتزامنة المحددة. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل عملية القبول غير المتزامنة المحددة. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | يحصل على قيمة تشير إلى ما إذا كانت النسخة الحالية تسمح لعميل واحد فقط باستخدام المنفذ. |
| [get_LocalEndpoint](./get_localendpoint/)() | يرجع نقطة النهاية الأساسية. |
| [get_Server](./get_server/)() | معلومات RTTI. |
| [Pending](./pending/)() | يرجع قيمة تشير إلى ما إذا كان هناك طلبات اتصال معلقة. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | يضبط قيمة تشير إلى ما إذا كانت النسخة الحالية تسمح لعميل واحد فقط باستخدام المنفذ. |
| [Start](./start/)() | يبدأ الاستماع للاتصالات الواردة. |
| [Start](./start/)(int32_t) | يبدأ الاستماع للاتصالات الواردة. |
| [Stop](./stop/)() | يتوقف عن الاستماع للاتصالات الواردة. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | ينشئ نسخة جديدة. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | ينشئ نسخة جديدة. |
| [TcpListener](./tcplistener/)(int32_t) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
