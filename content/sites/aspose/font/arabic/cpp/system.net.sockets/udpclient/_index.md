---
title: "System::Net::Sockets::UdpClient فئة"
linktitle: "UdpClient"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Sockets::UdpClient. توفر خدمات شبكة بروتوكول حزمة المستخدم (UDP). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.sockets/udpclient/
---
## UdpClient class


توفر خدمات شبكة بروتوكول حزمة المستخدم (UDP). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UdpClient : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() | يغلق اتصال UDP. |
| [Connect](./connect/)(String, int32_t) | يقوم بإنشاء اتصال إلى المنفذ المحدد على المضيف المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | يقوم بإنشاء اتصال مع المضيف على العنوان المحدد على المنفذ المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | يقوم بإنشاء اتصال بنقطة النهاية البعيدة. |
| [Dispose](./dispose/)() override | يطلق الموارد المدارة وغير المدارة المستخدمة بواسطة [UdpClient](./). |
| [get_Client](./get_client/)() | معلومات RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | يرجع حزمة بيانات أُرسلت من قبل الخادم. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | يرسل حزمة UDP إلى المضيف عند نقطة النهاية البعيدة. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | يرسل حزمة UDP إلى المنفذ المحدد على المضيف البعيد المحدد. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | يرسل حزمة UDP إلى مضيف بعيد. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | يُستخدم لتوفير مقبس الشبكة الأساسي. |
| [UdpClient](./udpclient/)() | يُنشئ نسخة جديدة من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | يُنشئ نسخة جديدة من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | يُنشئ نسخة جديدة من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | يُنشئ نسخة جديدة من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | يُنشئ نسخة جديدة من الفئة [UdpClient](./). param local EP نقطة النهاية المحلية التي تقوم بربط اتصال UDP بها. |
| [UdpClient](./udpclient/)(String, int32_t) | ينشئ نسخة جديدة من الفئة [UdpClient](./) ويتصل بالمضيف البعيد المحدد على المنفذ المحدد. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
