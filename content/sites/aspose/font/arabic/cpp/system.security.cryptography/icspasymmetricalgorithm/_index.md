---
title: "الفئة System::Security::Cryptography::ICspAsymmetricAlgorithm"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Security::Cryptography::ICspAsymmetricAlgorithm. الفئة الأساسية للخوارزميات غير المتماثلة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


الفئة الأساسية للخوارزميات غير المتماثلة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Font for C++](../../)
