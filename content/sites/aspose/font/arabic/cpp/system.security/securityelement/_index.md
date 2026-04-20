---
title: "System::Security::SecurityElement فئة"
linktitle: "SecurityElement"
second_title: "Aspose.Font لـ C++"
description: "System::Security::SecurityElement فئة. نموذج كائن XML لتشفير كائن الأمان. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security/securityelement/
---
## SecurityElement class


نموذج كائن XML لتشفير كائن الأمان. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SecurityElement : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | يضيف سمة إلى الوسم. |
| [AddChild](./addchild/)(SecurityElement) | يضيف وسمًا فرعيًا. |
| [Attribute](./attribute/)(const String\&) | يحصل على قيمة السمة. |
| [Copy](./copy/)() | ينسخ الوسم. |
| [Equal](./equal/)(SecurityElement) | يفحص مساواة المعلمات. |
| static [Escape](./escape/)(const String\&) | يُهرب الأحرف في سلسلة XML. |
| static [FromString](./fromstring/)(const String\&) | ينشئ عنصرًا من شفرة XML. |
| [get_Attributes](./get_attributes/)() | يحصل على سمات الوسم. |
| [get_Children](./get_children/)() | يحصل على كائنات الوسم الفرعية. |
| [get_Tag](./get_tag/)() | يحصل على اسم الوسم. |
| [get_Text](./get_text/)() | يحصل على النص الداخلي للعلامة. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | يتحقق مما إذا كان اسم السمة صالحًا. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | يتحقق مما إذا كانت قيمة السمة صالحة. |
| static [IsValidTag](./isvalidtag/)(const String\&) | يتحقق مما إذا كانت العلامة صالحة. |
| static [IsValidText](./isvalidtext/)(const String\&) | يتحقق مما إذا كان النص صالحًا. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | يحصل على العلامة الفرعية بالاسم. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | يحصل على النص الداخلي للعلامة الفرعية باسم العلامة. |
| [SecurityElement](./securityelement/)(const String\&) | المُنشئ. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | المُنشئ. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | يضبط خصائص العلامة. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | يضبط كائنات العلامة الفرعية. |
| [set_Tag](./set_tag/)(const String\&) | يضبط اسم العلامة. |
| [set_Text](./set_text/)(const String\&) | يضبط النص الداخلي للعلامة. |
| [ToString](./tostring/)() const override | يحوّل العلامة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
