---
title: "System::Xml::Xsl::XsltArgumentList فئة"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Xsl::XsltArgumentList فئة. يحتوي على عدد متغير من الوسائط التي تكون إما معلمات XSLT أو كائنات امتداد في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


يحتوي على عدد متغيّر من الوسائط التي تكون إما معلمات XSLT أو كائنات امتداد.

```cpp
class XsltArgumentList : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | يضيف كائنًا جديدًا إلى [XsltArgumentList](./) ويربطه بـ URI للمساحة الاسمية. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | يضيف معلمة إلى [XsltArgumentList](./) ويربطها بالاسم المؤهل للمساحة الاسمية. |
| [Clear](./clear/)() | يزيل جميع المعلمات وكائنات الامتداد من [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | يعيد الكائن المرتبط بالمساحة الاسمية المعطاة. |
| [GetParam](./getparam/)(const String\&, const String\&) | يعيد المعلمة المرتبطة بالاسم المؤهل للمساحة الاسمية. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | يزيل الكائن الذي يحمل URI مساحة الاسم من قائمة [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | يزيل المعامل من قائمة [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | ينشئ نسخة جديدة من [XsltArgumentList](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
