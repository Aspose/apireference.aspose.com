---
title: "الفئة System::Xml::Xsl::XsltArgumentList"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Xsl::XsltArgumentList. تحتوي على عدد متغيّر من الوسائط التي تكون إما معلمات XSLT أو كائنات امتداد في C++."
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
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | يضيف كائنًا جديدًا إلى [XsltArgumentList](./) ويربطه بـ URI مساحة الاسم. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | يضيف معلمة إلى [XsltArgumentList](./) ويربطها بالاسم المؤهل للمساحة الاسمية. |
| [Clear](./clear/)() | يزيل جميع المعلمات وكائنات الامتداد من [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | يعيد الكائن المرتبط بالمساحة الاسمية المعطاة. |
| [GetParam](./getparam/)(const String\&, const String\&) | يعيد المعلمة المرتبطة بالاسم المؤهل للمساحة الاسمية. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | يزيل الكائن ذو URI للمساحة الاسمية من [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | يزيل المعلمة من [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | ينفّذ نسخة جديدة من [XsltArgumentList](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
