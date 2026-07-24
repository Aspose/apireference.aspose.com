---
title: "الفئة System::Security::Cryptography::AsymmetricAlgorithm"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::Cryptography::AsymmetricAlgorithm. فئة أساسية مجردة لخوارزميات التشفير غير المتماثل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


فئة أساسية مجردة لخوارزميات التشفير غير المتماثل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() | يطلق جميع الموارد. |
| static [Create](./create/)() | ينشئ خوارزمية افتراضية. غير مُنفّذة. |
| static [Create](./create/)(const String\&) | ينشئ خوارزمية بالاسم. غير مُنفّذة. |
| [Dispose](./dispose/)() override | يطلق الموارد المملوكة للكائن الحالي. |
| virtual [FromXmlString](./fromxmlstring/)(String) | يقرأ معلمات الخوارزمية من سلسلة XML. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | يحصل على خوارزمية تبادل المفاتيح المستخدمة. |
| virtual [get_KeySize](./get_keysize/)() | معلومات RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | يحصل على مصفوفة أحجام المفاتيح المسموح بها. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | يحصل على خوارزمية التوقيع المستخدمة. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | يضبط حجم المفتاح. |
| virtual [ToXmlString](./toxmlstring/)(bool) | يكتب معلمات الخوارزمية إلى سلسلة XML. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
