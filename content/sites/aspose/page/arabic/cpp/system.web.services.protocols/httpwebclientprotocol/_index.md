---
title: "System::Web::Services::Protocols::HttpWebClientProtocol فئة"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page لـ C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol فئة. هذه الفئة الأساسية تُستخدم في جميع وكلاء عميل خدمة الويب XML الذين يستخدمون HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


هذه الفئة الأساسية تُستخدم في جميع وكلاء عميل خدمة الويب XML [Web](../../system.web/) الذين يستخدمون HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | يضيف ملفات تعريف الارتباط من الطلب المحدد إلى حاوية ملفات تعريف الارتباط الداخلية. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | يحصل على قيمة تشير إلى ما إذا كان العميل يتبع عمليات إعادة توجيه الخادم. |
| [get_ClientCertificates](./get_clientcertificates/)() | يرجع مجموعة شهادات العميل. |
| [get_CookieContainer](./get_cookiecontainer/)() | يحصل على حاوية تُستخدم لتخزين ملفات تعريف الارتباط. |
| [get_EnableDecompression](./get_enabledecompression/)() | يحصل على قيمة تشير إلى ما إذا كان فك الضغط مفعّلاً. |
| [get_Proxy](./get_proxy/)() | يحصل على معلومات الوكيل. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | يحصل على قيمة تشير إلى ما إذا كان مشاركة الاتصال مفعّلة عندما يستخدم العميل مصادقة NTLM. |
| [get_UserAgent](./get_useragent/)() | يحصل على قيمة رأس 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | يضبط قيمة تشير إلى ما إذا كان العميل يتبع عمليات إعادة توجيه الخادم. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | يضبط حاوية تُستخدم لتخزين ملفات تعريف الارتباط. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | يضبط قيمة تشير إلى ما إذا كان فك الضغط مفعّلاً. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | يضبط معلومات الوكيل. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | يضبط قيمة تشير إلى ما إذا كان مشاركة الاتصال مفعّلة عندما يستخدم العميل مصادقة NTLM. |
| [set_UserAgent](./set_useragent/)(String) | يضبط قيمة رأس 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## انظر أيضًا

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
