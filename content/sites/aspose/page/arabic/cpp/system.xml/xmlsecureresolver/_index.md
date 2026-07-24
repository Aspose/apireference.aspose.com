---
title: "فئة System::Xml::XmlSecureResolver"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlSecureResolver. تساعد في تأمين تنفيذ آخر لـ XmlResolver عن طريق تغليف كائن XmlResolver وتقييد الموارد التي يمكن للوصول إليها XmlResolver الأساسي في C++."
type: docs
weight: 3600
url: /ar/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


تساعد في تأمين تنفيذ آخر لـ [XmlResolver](../xmlresolver/) عن طريق تغليف كائن [XmlResolver](../xmlresolver/) وتقييد الموارد التي يمكن للوصول إليها [XmlResolver](../xmlresolver/) الأساسي.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | يربط معرف الموارد (URI) بكائن يحتوي على المورد الفعلي. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | يقوم بحل الـ URI المطلق من الـ URI الأساسي والنسبي عن طريق استدعاء **ResolveUri** على [XmlResolver](../xmlresolver/) الأساسي. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | يضبط بيانات الاعتماد المستخدمة لمصادقة طلبات الويب. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | يُنشئ نسخة جديدة من فئة [XmlSecureResolver](./) باستخدام [XmlResolver](../xmlresolver/) وعنوان URL المقدم. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
