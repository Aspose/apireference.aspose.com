---
title: "System::Security::Cryptography::CspKeyContainerInfo class"
linktitle: "CspKeyContainerInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::CspKeyContainerInfo class. معلومات إضافية حول زوج مفاتيح تشفير في C++."
type: docs
weight: 600
url: /ar/cpp/system.security.cryptography/cspkeycontainerinfo/
---
## CspKeyContainerInfo class


معلومات إضافية حول زوج مفاتيح تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CspKeyContainerInfo : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CspKeyContainerInfo](./cspkeycontainerinfo/)(const SharedPtr\<CspParameters\>\&) | معلومات RTTI. |
| [get_Accessible](./get_accessible/)() const | يحصل على علم يشير إلى ما إذا كان المفتاح في الحاوية قابلًا للوصول. |
| [get_Exportable](./get_exportable/)() const | يحصل على علم يشير إلى ما إذا كان يمكن تصدير المفتاح من الحاوية. |
| [get_HardwareDevice](./get_hardwaredevice/)() const | يحصل على علم يشير إلى ما إذا كان المفتاح مفتاحًا ماديًا. |
| [get_KeyContainerName](./get_keycontainername/)() const | يحصل على اسم حاوية المفتاح. |
| [get_KeyNumber](./get_keynumber/)() const | يحصل على كائن [KeyNumber](../keynumber/). |
| [get_MachineKeyStore](./get_machinekeystore/)() const | يحصل على علامة تشير إلى ما إذا كان المفتاح محملاً من مخزن مفاتيح الجهاز. |
| [get_Protected](./get_protected/)() const | يحصل على علامة تشير إلى ما إذا كان المفتاح محمياً من النسخ. |
| [get_ProviderName](./get_providername/)() const | يحصل على اسم الموفر. |
| [get_ProviderType](./get_providertype/)() const | يحصل على نوع الموفر. |
| [get_RandomlyGenerated](./get_randomlygenerated/)() const | يحصل على علامة تشير إلى ما إذا كان المفتاح قد تم توليده عشوائياً. |
| [get_Removable](./get_removable/)() const | يحصل على علامة تشير إلى ما إذا كان يمكن إزالة المفتاح من الحاوية. |
| [get_UniqueKeyContainerName](./get_uniquekeycontainername/)() const | يحصل على اسم حاوية فريد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
