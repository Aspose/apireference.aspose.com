---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::UdpClient class. يوفر خدمات شبكة بروتوكول حزمة المستخدم (UDP). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.sockets/udpclient/
---
## UdpClient class


يوفر خدمات شبكة بروتوكول حزمة المستخدم (UDP). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UdpClient : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() | يغلق اتصال UDP. |
| [Connect](./connect/)(String, int32_t) | يقيم اتصالًا إلى المنفذ المحدد على المضيف المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | يقيم اتصالًا مع المضيف على العنوان المحدد على المنفذ المحدد. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | يقيم اتصالًا بنقطة النهاية البعيدة. |
| [Dispose](./dispose/)() override | يطلق الموارد المدارة وغير المدارة المستخدمة بواسطة [UdpClient](./). |
| [get_Client](./get_client/)() | معلومات RTTI. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | يرجع حزمة بيانات أُرسلت من قبل الخادم. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | يرسل حزمة UDP إلى المضيف عند نقطة النهاية البعيدة. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | يرسل حزمة UDP إلى المنفذ المحدد على المضيف البعيد المحدد. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | يرسل حزمة UDP إلى مضيف بعيد. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | يُستخدم لتوفير مقبس الشبكة الأساسي. |
| [UdpClient](./udpclient/)() | ينشئ مثلاً جديداً من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(AddressFamily) | ينشئ مثلاً جديداً من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t) | ينشئ مثلاً جديداً من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | ينشئ مثلاً جديداً من الفئة [UdpClient](./). |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | ينشئ مثلاً جديداً من الفئة [UdpClient](./). المعامل local EP هو نقطة النهاية المحلية التي تربط بها اتصال UDP. |
| [UdpClient](./udpclient/)(String, int32_t) | ينشئ مثلاً جديداً من الفئة [UdpClient](./) ويتصل بالمضيف البعيد المحدد على المنفذ المحدد. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
