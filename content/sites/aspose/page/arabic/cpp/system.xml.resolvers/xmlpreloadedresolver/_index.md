---
title: "System::Xml::Resolvers::XmlPreloadedResolver class"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver class. تمثل فئة تُستخدم لملء الذاكرة المؤقتة مسبقاً بـ DTDs أو تدفقات XML في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


يمثل فئة تُستخدم لملء الذاكرة المؤقتة مسبقًا بـ DTDs أو تدفقات XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | يضيف مصفوفة بايت إلى مخزن [XmlPreloadedResolver](./) ويربطها بـ URI. إذا كان المخزن يحتوي بالفعل على تعيين لنفس الـ URI، يتم استبدال التعيين الموجود. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يضيف مصفوفة بايت إلى مخزن [XmlPreloadedResolver](./) ويربطها بـ URI. إذا كان المخزن يحتوي بالفعل على تعيين لنفس الـ URI، يتم استبدال التعيين الموجود. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | يضيف Stream إلى مخزن [XmlPreloadedResolver](./) ويربطه بـ URI. إذا كان المخزن يحتوي بالفعل على تعيين لنفس الـ URI، يتم استبدال التعيين الموجود. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | يضيف سلسلة نصية تحتوي على بيانات محملة مسبقاً إلى مخزن [XmlPreloadedResolver](./) ويربطها بـ URI. إذا كان المخزن يحتوي بالفعل على تعيين لنفس الـ URI، يتم استبدال التعيين الموجود. |
| [get_PreloadedUris](./get_preloadeduris/)() | يرجع مجموعة من URIs المحملة مسبقاً. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | يربط معرف الموارد (URI) بكائن يحتوي على المورد الفعلي. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | يزيل البيانات التي تتطابق مع الـ URI من [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | يحل المعرف المطلق (URI) من المعرف الأساسي والنسبي. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | يضبط بيانات الاعتماد المستخدمة لمصادقة [Net::WebRequest](../../system.net/webrequest/) الأساسي. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | يحدد ما إذا كان المحلّل يدعم أنواعاً أخرى غير Stream فقط. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | يقوم بتهيئة نسخة جديدة من الفئة [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | يقوم بتهيئة نسخة جديدة من الفئة [XmlPreloadedResolver](./) مع ملفات DTD المعروفة المحملة مسبقًا المحددة. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | يقوم بتهيئة نسخة جديدة من الفئة [XmlPreloadedResolver](./) مع محلل الرجوع الاحتياطي المحدد. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | يقوم بتهيئة نسخة جديدة من الفئة [XmlPreloadedResolver](./) مع محلل الرجوع الاحتياطي المحدد وملفات DTD المعروفة المحملة مسبقًا. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | يقوم بتهيئة نسخة جديدة من الفئة [XmlPreloadedResolver](./) مع محلل الرجوع الاحتياطي المحدد، وملفات DTD المعروفة المحملة مسبقًا، ومقارن مساواة URI. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
