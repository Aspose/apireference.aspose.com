---
title: "الفئة System::Security::Cryptography::ICspAsymmetricAlgorithm"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::Cryptography::ICspAsymmetricAlgorithm. فئة قاعدة لخوارزمية غير متماثلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


فئة قاعدة لخوارزمية غير متماثلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | يصدّر كتلة (blob) تحتوي على معلومات المفتاح. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | معلومات RTTI. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | يستورد معلومات المفتاح من كتلة البيانات. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
