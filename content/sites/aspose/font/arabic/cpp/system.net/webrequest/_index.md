---
title: "System::Net::WebRequest فئة"
linktitle: "WebRequest"
second_title: "Aspose.Font لـ C++"
description: "System::Net::WebRequest فئة. تمثل طلب ويب. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system.net/webrequest/
---
## WebRequest class


تمثل طلب ويب. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Abort](./abort/)() | يلغي الطلب الحالي. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | يبدأ عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | يبدأ طلبًا غير متزامنًا للمورد. |
| static [Create](./create/)(String) | ينشئ مثيلاً جديداً من فئة [WebRequest](./) باستخدام URI المحدد. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | ينشئ مثيلاً جديداً من فئة [WebRequest](./) باستخدام URI المحدد. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | ينشئ مشتقاً من [WebRequest](./) للمخطط URI المحدد. |
| static [CreateHttp](./createhttp/)(String) | ينشئ مثيلاً جديداً من فئة [WebRequest](./) باستخدام URI المحدد. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | ينشئ مثيلاً جديداً من فئة [WebRequest](./) باستخدام URI المحدد. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | يحصل على سياسة التخزين المؤقت. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | يحصل على اسم مجموعة الاتصال. |
| virtual [get_ContentLength](./get_contentlength/)() | يحصل على عدد البايتات لبيانات الطلب التي سيتم إرسالها. |
| virtual [get_ContentType](./get_contenttype/)() | يحصل على نوع MIME للطلب. |
| virtual [get_Credentials](./get_credentials/)() | يحصل على معلومات المصادقة المرتبطة بالطلب الحالي. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | يحصل على الوكيل HTTP العالمي. |
| virtual [get_Headers](./get_headers/)() | يحصل على مجموعة رؤوس HTTP. |
| virtual [get_Method](./get_method/)() | يحصل على طريقة HTTP. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | يحصل على قيمة تشير إلى ما إذا كان يجب المصادقة المسبقة للطلب. |
| static [get_PrefixList](./get_prefixlist/)() | يحصل على قائمة البادئات. |
| virtual [get_Proxy](./get_proxy/)() | يحصل على وكيل HTTP. |
| virtual [get_RequestUri](./get_requesturi/)() | يعيد URI الطلب. |
| virtual [get_Timeout](./get_timeout/)() | يحصل على مقدار الوقت بالمللي ثانية الذي بعده سينتهي مهلة الطلب. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | يحصل على قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | يعيد الدفق لكتابة البيانات إلى المورد. |
| virtual [GetResponse](./getresponse/)() | يعيد استجابة الويب المرتبطة بالطلب الويب الحالي. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | يسجل المشتق [WebRequest](./) للـ URI المحدد. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | يضبط سياسة التخزين المؤقت. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | يضبط اسم مجموعة الاتصال. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | يضبط عدد البايتات من بيانات الطلب لإرسالها. |
| virtual [set_ContentType](./set_contenttype/)(String) | يضبط نوع MIME للطلب. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | يضبط معلومات المصادقة المرتبطة بالطلب الحالي. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | يضبط وكيل HTTP العالمي. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | يضبط مجموعة رؤوس HTTP. |
| virtual [set_Method](./set_method/)(String) | يضبط طريقة HTTP. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب أن يتم المصادقة المسبقة للطلب. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | يضبط قائمة البادئات. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | يضبط وكيل HTTP. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | يضبط مقدار الوقت بالميليثانية الذي بعده سينتهي مهلة الطلب. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | يضبط قيمة تشير إلى ما إذا كانت الخاصية 'Credential' مساوية للخاصية 'DefaultCredentials'. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
