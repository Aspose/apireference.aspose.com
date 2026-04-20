---
title: "System::Security::Cryptography::Pkcs::CmsSigner فئة"
linktitle: "CmsSigner"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner فئة. يوفر واجهة برمجة تطبيقات لتوقيع الكائنات باستخدام CMS. لا يقوم بتوقيع الكائنات بنفسه، استخدم فئة SignedCMS للقيام بذلك. غير مُنفّذ. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


يوفر واجهة برمجة تطبيقات لتوقيع الكائنات باستخدام CMS. لا يقوم بتوقيع الكائنات بنفسه، استخدم فئة SignedCMS للقيام بذلك. غير مُنفّذ. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CmsSigner : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | يُهيئ المُوقّع باستخدام شهادة X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | يحصل على خوارزمية التجزئة المستخدمة مع التوقيع. |
| [get_IncludeOption](./get_includeoption/)() const | يتحقق من الشهادات التي سيتم تضمينها من السلسلة في التوقيع. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | يضبط خوارزمية التجزئة المستخدمة مع التوقيع. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | يحدد الشهادات التي سيتم تضمينها من السلسلة في التوقيع. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
