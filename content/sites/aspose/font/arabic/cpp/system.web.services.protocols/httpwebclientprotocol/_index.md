---
title: "فئة System::Web::Services::Protocols::HttpWebClientProtocol"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::HttpWebClientProtocol. تُستخدم هذه الفئة الأساسية في جميع وكلاء عميل خدمة الويب XML الذين يستخدمون HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


تُستخدم هذه الفئة الأساسية في جميع وكلاء عميل خدمة XML [Web](../../system.web/) الذين يستخدمون HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | يضيف ملفات تعريف الارتباط من الطلب المحدد إلى حاوية ملفات تعريف الارتباط الداخلية. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | يحصل على قيمة تشير إلى ما إذا كان العميل يتبع إعادة توجيه الخادم. |
| [get_ClientCertificates](./get_clientcertificates/)() | يعيد مجموعة شهادات العميل. |
| [get_CookieContainer](./get_cookiecontainer/)() | يحصل على حاوية تُستخدم لتخزين ملفات تعريف الارتباط. |
| [get_EnableDecompression](./get_enabledecompression/)() | يحصل على قيمة تشير إلى ما إذا كان فك الضغط مفعلاً. |
| [get_Proxy](./get_proxy/)() | يحصل على معلومات الوكيل. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | يحصل على قيمة تشير إلى ما إذا كان مشاركة الاتصال مفعلة عندما يستخدم العميل مصادقة NTLM. |
| [get_UserAgent](./get_useragent/)() | يحصل على قيمة رأس 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | يضبط قيمة تشير إلى ما إذا كان العميل يتبع إعادة توجيه الخادم. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | يضبط حاوية تُستخدم لتخزين ملفات تعريف الارتباط. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | يضبط قيمة تشير إلى ما إذا كان فك الضغط مفعلاً. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | يضبط معلومات الوكيل. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | يضبط قيمة تشير إلى ما إذا كان مشاركة الاتصال مفعلة عندما يستخدم العميل مصادقة NTLM. |
| [set_UserAgent](./set_useragent/)(String) | يضبط قيمة رأس 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## انظر أيضًا

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
