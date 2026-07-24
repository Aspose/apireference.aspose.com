---
title: "System::Net::ServicePointManager فئة"
linktitle: "ServicePointManager"
second_title: "Aspose.Page لـ C++"
description: "System::Net::ServicePointManager فئة. تدير مراحل دورة حياة (إنشاء، صيانة، وحذف) مثيلات فئة ServicePoint. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3200
url: /ar/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


يدير مراحل دورة الحياة (إنشاء، صيانة، وحذف) مثيلات فئة [ServicePoint](../servicepoint/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ServicePointManager : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | يحصل على سياسة الشهادة. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | يحصل على قيمة تشير إلى ما إذا كان يجب فحص الشهادة مقابل قائمة إلغاء صلاحية سلطة الشهادات. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | يحصل على الحد الأقصى لعدد الاتصالات المتزامنة المسموح بها من قبل مثيلات ServicePoint-class. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | يحصل على مهلة بالمللي ثانية يُعتبر خلالها حل DNS صالحًا. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | يحصل على قيمة تشير إلى ما إذا كان حل DNS يدور بين عناوين IP المتاحة. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | يعيد سياسة التشفير المستخدمة من قبل النسخة الحالية. |
| static [get_Expect100Continue](./get_expect100continue/)() | يحصل على قيمة تشير إلى ما إذا كانت مثيلات ServicePoint-class تستخدم سلوك 100-Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | يحصل على الحد الأقصى لوقت الخمول لمثيلات ServicePoint-class. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | يحصل على الحد الأقصى لعدد مثيلات ServicePoint-class التي يمكن إدارتها من قبل النسخة الحالية. |
| static [get_ReusePort](./get_reuseport/)() | يحصل على قيمة تشير إلى ما إذا كانت مقابس اتصالات الإخراج تستخدم الخيار 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | يحصل على نوع بروتوكول الأمان المستخدم من قبل مثيلات ServicePoint-class التي تُدار بواسطة النسخة الحالية. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | يحصل على رد النداء المستخدم للتحقق من صحة شهادة الخادم. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | يحصل على قيمة تشير إلى ما إذا كانت مثيلات ServicePoint-class تستخدم خوارزمية Nagle. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | يضبط سياسة الشهادة. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب فحص الشهادة مقابل قائمة إلغاء صلاحية سلطة الشهادات. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | يضبط الحد الأقصى لعدد الاتصالات المتزامنة المسموح بها من قبل مثيلات ServicePoint-class. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | يضبط مهلة بالمللي ثانية يُعتبر خلالها حل DNS صالحًا. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | يضبط قيمة تشير إلى ما إذا كان حل DNS يدور بين عناوين IP المتاحة. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | يضبط قيمة تشير إلى ما إذا كانت كائنات ServicePoint-class تستخدم سلوك 100-Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | يضبط الحد الأقصى للوقت الخامل لكائنات ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | يضبط الحد الأقصى لعدد كائنات ServicePoint-class التي يمكن إدارتها بواسطة الكائن الحالي. |
| static [set_ReusePort](./set_reuseport/)(bool) | يضبط قيمة تشير إلى ما إذا كانت مآخذ (sockets) الاتصالات الخارجة تستخدم الخيار 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | يضبط نوع بروتوكول الأمان المستخدم من قبل كائنات ServicePoint-class التي تُدار بواسطة الكائن الحالي. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | يضبط دالة الاستدعاء (callback) المستخدمة للتحقق من شهادة الخادم. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | يضبط قيمة تشير إلى ما إذا كانت كائنات ServicePoint-class تستخدم خوارزمية Nagle. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | يضبط القيمة التي تشير إلى ما إذا كان خيار 'Keep-Alive' مفعلاً. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | معلومات RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | العدد الافتراضي للاتصالات المستمرة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
