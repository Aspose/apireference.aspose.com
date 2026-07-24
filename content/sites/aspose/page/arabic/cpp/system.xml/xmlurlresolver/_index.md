---
title: "الفئة System::Xml::XmlUrlResolver"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::XmlUrlResolver. تحل الموارد الخارجية للـ XML المسماة بواسطة معرف الموارد الموحد (URI) في C++."
type: docs
weight: 4100
url: /ar/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


يحل الموارد الخارجية لـ XML المسماة بواسطة معرف الموارد الموحد (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | يربط معرف الموارد (URI) بكائن يحتوي على المورد الفعلي. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | يحل المعرف المطلق (URI) من المعرف الأساسي والنسبي. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | يضبط سياسة التخزين المؤقت لكائن WebRequest الأساسي. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | يضبط بيانات الاعتماد المستخدمة لمصادقة طلبات الويب. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | يضبط وكيل الشبكة لكائن WebRequest الأساسي. |
| [XmlUrlResolver](./xmlurlresolver/)() | ينشئ مثيلًا جديدًا من الفئة [XmlUrlResolver](./). |
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
