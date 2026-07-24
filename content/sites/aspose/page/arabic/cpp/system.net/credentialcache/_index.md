---
title: "System::Net::CredentialCache class"
linktitle: "CredentialCache"
second_title: "Aspose.Page لـ C++"
description: "System::Net::CredentialCache class. يوفر تخزين الاعتمادات. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.net/credentialcache/
---
## CredentialCache class


يوفر تخزين الاعتمادات. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | يضيف الاعتمادات الشبكية المحددة إلى الذاكرة المؤقتة. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | يضيف الاعتمادات الشبكية المحددة إلى الذاكرة المؤقتة. |
| [CredentialCache](./credentialcache/)() | ينشئ نسخة جديدة. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | معلومات RTTI. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | يعيد الاعتمادات الشبكية للمستخدم الحالي أو التطبيق. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | يعيد الاعتمادات للبادئة URI المحددة ونوع المصادقة. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | يرجع بيانات الاعتماد لاسم المضيف المحدد، المنفذ، ونوع المصادقة. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | يزيل الاعتمادات الشبكية للبادئة URI المحددة ونوع المصادقة. |
| [Remove](./remove/)(String, int32_t, String) | يزيل الاعتمادات الشبكية لاسم المضيف المحدد، المنفذ، ونوع المصادقة. |
## انظر أيضًا

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
