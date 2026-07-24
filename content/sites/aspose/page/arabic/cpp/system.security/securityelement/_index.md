---
title: "الفئة System::Security::SecurityElement"
linktitle: "SecurityElement"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::SecurityElement. نموذج كائن XML لتشفير كائن الأمان. غير مُنفّذ. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security/securityelement/
---
## SecurityElement class


نموذج كائن XML لتشفير كائن الأمان. غير مُنفّذ. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| [Equal](./equal/)(SecurityElement) | يفحص مساواة المعاملات. |
| static [Escape](./escape/)(const String\&) | يهرب الأحرف في سلسلة XML. |
| static [FromString](./fromstring/)(const String\&) | ينشئ عنصرًا من شفرة XML. |
| [get_Attributes](./get_attributes/)() | يحصل على سمات الوسم. |
| [get_Children](./get_children/)() | يحصل على كائنات الوسم الفرعية. |
| [get_Tag](./get_tag/)() | يحصل على اسم الوسم. |
| [get_Text](./get_text/)() | يحصل على النص الداخلي للوسم. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | يفحص ما إذا كان اسم السمة صالحًا. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | يفحص ما إذا كانت قيمة السمة صالحة. |
| static [IsValidTag](./isvalidtag/)(const String\&) | يفحص ما إذا كان الوسم صالحًا. |
| static [IsValidText](./isvalidtext/)(const String\&) | يتحقق مما إذا كان النص صالحًا. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | يحصل على العلامة الفرعية بالاسم. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | يحصل على النص الداخلي للعلامة الفرعية باسم العلامة. |
| [SecurityElement](./securityelement/)(const String\&) | منشئ. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | منشئ. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | يضبط خصائص العلامة. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | يضبط كائنات العلامة الفرعية. |
| [set_Tag](./set_tag/)(const String\&) | يضبط اسم العلامة. |
| [set_Text](./set_text/)(const String\&) | يضبط النص الداخلي للعلامة. |
| [ToString](./tostring/)() const override | يحوّل العلامة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
