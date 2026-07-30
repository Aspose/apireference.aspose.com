---
title: "System::Net::NetworkCredential class"
linktitle: "NetworkCredential"
second_title: "Aspose.Font لـ C++"
description: "System::Net::NetworkCredential class. يوفر بيانات الاعتماد لآليات المصادقة المعتمدة على كلمة المرور. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. دائمًا غلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2900
url: /ar/cpp/system.net/networkcredential/
---
## NetworkCredential class


يوفر بيانات الاعتماد لآليات المصادقة المعتمدة على كلمة المرور. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. دائمًا غلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Domain](./get_domain/)() | يحصل على النطاق الذي يتحقق من بيانات الاعتماد. |
| [get_Password](./get_password/)() | يحصل على كلمة المرور. |
| [get_UserName](./get_username/)() | معلومات RTTI. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | يعيد بيانات الاعتماد للـ URI المحدد ونوع المصادقة. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | يعيد بيانات الاعتماد لاسم المضيف المحدد، المنفذ، ونوع المصادقة. |
| [NetworkCredential](./networkcredential/)() | ينشئ نسخة جديدة. |
| [NetworkCredential](./networkcredential/)(String, String) | ينشئ نسخة جديدة. |
| [NetworkCredential](./networkcredential/)(String, String, String) | ينشئ نسخة جديدة. |
| [set_Domain](./set_domain/)(String) | يضبط النطاق الذي يتحقق من بيانات الاعتماد. |
| [set_Password](./set_password/)(String) | يضبط كلمة المرور. |
| [set_UserName](./set_username/)(String) | يضبط اسم المستخدم. |
## انظر أيضًا

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
