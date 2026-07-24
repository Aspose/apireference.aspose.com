---
title: "System::Net::Security::AuthenticatedStream فئة"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Security::AuthenticatedStream class. تحتوي على الأساليب لتمرير بيانات الاعتماد عبر الدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


تحتوي على الأساليب لتمرير بيانات الاعتماد عبر الدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | يعيد قيمة تشير إلى ما إذا تم تمرير المصادقة بنجاح. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | يعيد قيمة تشير إلى ما إذا كانت البيانات المرسلة باستخدام هذا الدفق مشفرة. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | يعيد قيمة تشير إلى ما إذا كان الخادم والعميل قد تم مصادقتهما. |
| virtual [get_IsServer](./get_isserver/)() const | يعيد قيمة تشير إلى ما إذا كان الجانب المحلي للاتصال هو الخادم. |
| virtual [get_IsSigned](./get_issigned/)() const | يعيد قيمة تشير إلى ما إذا كانت البيانات المرسلة باستخدام هذا الدفق موقعة. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | معلومات RTTI. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../../system.io/stream/null/) | تدفق بدون تخزين أساسي. |
## انظر أيضًا

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
