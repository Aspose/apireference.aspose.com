---
title: "الفئة System::Net::ServicePoint"
linktitle: "ServicePoint"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::ServicePoint. توفر إدارة اتصال HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت تشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3100
url: /ar/cpp/system.net/servicepoint/
---
## ServicePoint class


توفر إدارة اتصال HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت تشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ServicePoint : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | يغلق ويزيل الاتصالات التي تنتمي إلى مجموعة الاتصال المحددة. |
| [get_Address](./get_address/)() | يعيد عنوان URI للخادم الذي يتصل به الكائن الحالي. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | معلومات RTTI. |
| [get_Certificate](./get_certificate/)() | يعيد شهادة يستخدمها الكائن الحالي. |
| [get_ClientCertificate](./get_clientcertificate/)() | يعيد آخر شهادة عميل. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | يحصل على مهلة بالميليثانية، بعد ذلك سيتم إغلاق [ServicePoint](./) النشط. |
| [get_ConnectionLimit](./get_connectionlimit/)() | يحصل على الحد الأقصى لعدد الاتصالات المسموح بها من قبل الكائن الحالي. |
| [get_ConnectionName](./get_connectionname/)() | يرجع اسم الاتصال. |
| [get_CurrentConnections](./get_currentconnections/)() | يرجع عدد الاتصالات المفتوحة. |
| [get_Expect100Continue](./get_expect100continue/)() | يحصل على قيمة تشير إلى ما إذا كان سلوك 100-Continue مستخدمًا. |
| [get_IdleSince](./get_idlesince/)() | يرجع التاريخ والوقت لأحدث اتصال بالمضيف. |
| [get_MaxIdleTime](./get_maxidletime/)() | يحصل على مقدار الوقت بالمللي ثانية الذي بعده سيتم إغلاق الاتصال الخامل. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | يرجع نسخة HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | يحصل على حجم مخزن الاستقبال. |
| [get_SupportsPipelining](./get_supportspipelining/)() | يرجع قيمة تشير إلى ما إذا كانت المثيلة الحالية تدعم اتصالات الأنابيب. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | يحصل على قيمة تشير إلى ما إذا كان خوارزمية Nagle مستخدمة من قبل الاتصالات التي تديرها المثيلة الحالية. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | يضبط المفوض الذي يُستخدم لربط [IPEndPoint](../ipendpoint/) المحلي بالمثيلة الحالية. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | يضبط مهلة بالمللي ثانية التي بعده سيتم إغلاق [ServicePoint](./) النشط. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | يضبط الحد الأقصى لعدد الاتصالات المسموح بها من قبل المثيلة الحالية. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | يضبط قيمة تشير إلى ما إذا كان سلوك 100-Continue مستخدمًا. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | يضبط مقدار الوقت بالمللي ثانية الذي بعده سيتم إغلاق الاتصال الخامل. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | يضبط حجم مخزن الاستقبال. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | يضبط قيمة تشير إلى ما إذا كان خوارزمية Nagle مستخدمة من قبل الاتصالات التي تديرها المثيلة الحالية. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | يضبط القيمة التي تشير إلى ما إذا كان خيار 'Keep-Alive' مفعلاً. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
