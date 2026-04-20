---
title: "الفئة System::Net::HttpWebRequest"
linktitle: "HttpWebRequest"
second_title: "Aspose.Font لـ C++"
description: "System::Net::HttpWebRequest class. تمثل طلب الويب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


تمثل طلب الويب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Abort](./abort/)() override | يلغي الطلب الحالي. |
| virtual [AddRange](./addrange/)(int32_t) | يضيف رأس 'Range' إلى الطلب الحالي. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | يضيف رأس 'Range' إلى الطلب الحالي. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ طلبًا غير متزامنًا للمورد. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد. |
| [get_Accept](./get_accept/)() | يحصل على قيمة رأس HTTP 'Accept'. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | يحصل على قيمة تشير إلى ما إذا كان يجب على الطلب متابعة عمليات إعادة التوجيه. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | يحصل على قيمة تشير إلى ما إذا كان يجب تخزين البيانات المستلمة من المورد في الذاكرة المؤقتة. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | يحصل على قيمة تشير إلى ما إذا كان التخزين المؤقت مفعلاً لإرسال البيانات. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | يحصل على مجموعة الشهادات المرتبطة بالطلب الحالي. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | يحصل على اسم مجموعة الاتصال. |
| [get_ContentLength](./get_contentlength/)() override | يحصل على عدد البايتات لبيانات الطلب التي سيتم إرسالها. |
| [get_ContentType](./get_contenttype/)() override | يحصل على نوع MIME للطلب. |
| [get_ContinueTimeout](./get_continuetimeout/)() | يحصل على مهلة الانتظار حتى يتم استلام رمز الحالة 100-Continue. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | يحصل على حاوية ملفات تعريف الارتباط المرتبطة بطلب الويب الحالي. |
| [get_Credentials](./get_credentials/)() override | يحصل على معلومات المصادقة المرتبطة بالطلب الحالي. |
| virtual [get_HaveResponse](./get_haveresponse/)() | يرجع قيمة تشير إلى ما إذا تم استلام استجابة. |
| [get_Headers](./get_headers/)() override | يحصل على مجموعة رؤوس HTTP. |
| virtual [get_KeepAlive](./get_keepalive/)() | يحصل على قيمة تشير إلى ما إذا كان يجب أن يحتوي الطلب الحالي على رأس 'Keep-Alive'. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | يحصل على الحد الأقصى لعدد عمليات إعادة التوجيه المسموح بها. |
| [get_Method](./get_method/)() override | يحصل على طريقة HTTP. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | يحصل على قيمة تشير إلى ما إذا كان يجب المصادقة المسبقة للطلب. |
| [get_Proxy](./get_proxy/)() override | يحصل على وكيل HTTP. |
| virtual [get_Referer](./get_referer/)() | يحصل على قيمة رأس 'Referer'. |
| [get_RequestUri](./get_requesturi/)() override | يعيد URI الطلب. |
| virtual [get_SendChunked](./get_sendchunked/)() | يحصل على قيمة تشير إلى ما إذا كان يجب إرسال البيانات على شكل قطع. |
| [get_ServicePoint](./get_servicepoint/)() | يعيد نقطة خدمة تمثل الاتصال الشبكي بالمورد. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | يعيد قيمة تشير إلى ما إذا كان يمكن للطلب الحالي استخدام حاوية ملفات تعريف الارتباط. |
| [get_Timeout](./get_timeout/)() override | يحصل على مقدار الوقت بالمللي ثانية الذي بعده سينتهي مهلة الطلب. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | يحصل على قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | يحصل على قيمة رأس 'User-Agent'. |
| [GetRequestStream](./getrequeststream/)() override | يعيد الدفق لكتابة البيانات إلى المورد. |
| [GetResponse](./getresponse/)() override | يعيد استجابة الويب المرتبطة بالطلب الويب الحالي. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [set_Accept](./set_accept/)(String) | يضبط قيمة رأس HTTP 'Accept'. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب على الطلب متابعة عمليات إعادة التوجيه. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تخزين البيانات المستلمة من المورد في الذاكرة المؤقتة. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | يضبط قيمة تشير إلى ما إذا كان تمكين التخزين المؤقت لإرسال البيانات. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | يضبط مجموعة الشهادات المرتبطة بالطلب الحالي. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | يضبط اسم مجموعة الاتصال. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | يضبط عدد البايتات من بيانات الطلب لإرسالها. |
| [set_ContentType](./set_contenttype/)(String) override | يضبط نوع MIME للطلب. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | يضبط مهلة الانتظار حتى يتم استلام رمز الحالة 100-Continue. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | يضبط حاوية ملفات تعريف الارتباط المرتبطة بالطلب الويب الحالي. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | يضبط معلومات المصادقة المرتبطة بالطلب الحالي. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | يضبط مجموعة رؤوس HTTP. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب أن يحتوي الطلب الحالي على رأس 'Keep-Alive'. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | يضبط الحد الأقصى لعدد عمليات إعادة التوجيه المسموح بها. |
| [set_Method](./set_method/)(String) override | يضبط طريقة HTTP. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | يضبط قيمة تشير إلى ما إذا كان يجب أن يتم المصادقة المسبقة للطلب. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | معلومات RTTI. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | يضبط وكيل HTTP. |
| virtual [set_Referer](./set_referer/)(System::String) | يضبط قيمة رأس 'Referer'. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب إرسال البيانات على شكل قطع. |
| [set_Timeout](./set_timeout/)(int) override | يضبط مقدار الوقت بالميليثانية الذي بعده سينتهي مهلة الطلب. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | يضبط قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | يضبط قيمة رأس 'User-Agent'. |
## انظر أيضًا

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
