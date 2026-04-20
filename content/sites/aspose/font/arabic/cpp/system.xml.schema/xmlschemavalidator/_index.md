---
title: "الفئة System::Xml::Schema::XmlSchemaValidator"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaValidator. تمثل محرك تحقق من مخططات لغة تعريف مخطط XML (XSD). لا يمكن توريث فئة XmlSchemaValidator في C++."
type: docs
weight: 7000
url: /ar/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


تمثل محرك تحقق من مخطط XML [Schema](../) لغة التعريف (XSD) [Schema](../). لا يمكن توريث الفئة [XmlSchemaValidator](./).

```cpp
class XmlSchemaValidator : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | يضيف مخطط XML [Schema](../) لغة التعريف (XSD) إلى مجموعة المخططات المستخدمة في التحقق. |
| [EndValidation](./endvalidation/)() | ينهي عملية التحقق ويفحص قيود الهوية للمستند XML بالكامل. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | يعيد معلومات رقم السطر لعقدة XML التي يتم التحقق منها. |
| [get_SourceUri](./get_sourceuri/)() | يعيد عنوان URI المصدر لعقدة XML التي يتم التحقق منها. |
| [get_ValidationEventSender](./get_validationeventsender/)() | يعيد الكائن المرسل ككائن المرسل لحدث التحقق. |
| [GetExpectedAttributes](./getexpectedattributes/)() | يعيد السمات المتوقعة لسياق العنصر الحالي. |
| [GetExpectedParticles](./getexpectedparticles/)() | يعيد الجسيمات المتوقعة في سياق العنصر الحالي. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | يتحقق من قيود الهوية على السمات الافتراضية ويملأ القائمة المحددة بكائنات [XmlSchemaAttribute](../xmlschemaattribute/) لأي سمات ذات قيم افتراضية لم يتم التحقق منها مسبقًا باستخدام طريقة [XmlSchemaValidator::ValidateAttribute](./validateattribute/) في سياق العنصر. |
| [Initialize](./initialize/)() | يُهيئ حالة كائن [XmlSchemaValidator](./). |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | يُهيئ حالة كائن [XmlSchemaValidator](./) باستخدام [XmlSchemaObject](../xmlschemaobject/) المحدد للتحقق الجزئي. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | يضبط معلومات رقم السطر لعقدة XML التي يتم التحقق منها. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | يضبط عنوان URI المصدر لعقدة XML التي يتم التحقق منها. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | يضبط الكائن المرسل ككائن المرسل لحدث التحقق. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط كائن [XmlResolver](../../system.xml/xmlresolver/) المستخدم لحل عناصر **xs:import** و **xs:include** وكذلك سمات **xsi:schemaLocation** و **xsi:noNamespaceSchemaLocation**. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | يتخطى التحقق من محتوى العنصر الحالي ويجهز كائن [XmlSchemaValidator](./) للتحقق من المحتوى في سياق العنصر الأب. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | يتحقق من اسم السمة، ومعرّف مساحة الاسم (URI)، والقيمة في سياق العنصر الحالي. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | يتحقق من اسم السمة، ومعرّف مساحة الاسم (URI)، والقيمة في سياق العنصر الحالي. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | يتحقق من العنصر في السياق الحالي. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | يتحقق من العنصر في السياق الحالي مع قيم السمات **xsi:Type**، **xsi:Nil**، **xsi:SchemaLocation**، و**xsi:NoNamespaceSchemaLocation** المحددة. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | يتحقق مما إذا كان محتوى النص للعنصر صالحًا وفقًا لنوع البيانات الخاص به للعناصر ذات المحتوى البسيط، ويتحقق مما إذا كان محتوى العنصر الحالي مكتملًا للعناصر ذات المحتوى المعقد. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | يتحقق مما إذا كان محتوى النص للعنصر المحدد صالحًا وفقًا لنوع البيانات الخاص به. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | يتحقق مما إذا كانت جميع السمات المطلوبة في سياق العنصر موجودة ويجهز كائن [XmlSchemaValidator](./) للتحقق من محتوى العنصر الفرعي. |
| [ValidateText](./validatetext/)(const String\&) | يتحقق مما إذا كانت **string** النصية المحددة مسموحًا بها في سياق العنصر الحالي، ويجمع النص للتحقق إذا كان العنصر الحالي يحتوي على محتوى بسيط. |
| [ValidateText](./validatetext/)(XmlValueGetter) | يتحقق مما إذا كان النص الذي تُعيده الكائن [XmlValueGetter](../xmlvaluegetter/) المحدد مسموحًا به في سياق العنصر الحالي، ويجمع النص للتحقق إذا كان العنصر الحالي يحتوي على محتوى بسيط. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | يتحقق مما إذا كانت المسافة البيضاء في **string** المحددة مسموحًا بها في سياق العنصر الحالي، ويجمع المسافة البيضاء للتحقق إذا كان العنصر الحالي يحتوي على محتوى بسيط. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | يتحقق مما إذا كانت المسافة البيضاء التي تُعيدها الكائن [XmlValueGetter](../xmlvaluegetter/) المحدد مسموحًا بها في سياق العنصر الحالي، ويجمع المسافة البيضاء للتحقق إذا كان العنصر الحالي يحتوي على محتوى بسيط. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | ينشئ مثيلًا جديدًا للفئة [XmlSchemaValidator](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
