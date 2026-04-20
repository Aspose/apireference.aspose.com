---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XsltSettings class. يحدد ميزات XSLT التي يجب دعمها أثناء تنفيذ ورقة نمط XSLT في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


يحدد ميزات XSLT التي يجب دعمها أثناء تنفيذ ورقة أنماط XSLT.

```cpp
class XsltSettings : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [get_Default](./get_default/)() | يعيد كائنًا من نوع [XsltSettings](./) بالإعدادات الافتراضية. دعم دالة XSLT **document()** وكتل السكريبت المدمجة معطَّل. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | يعيد قيمة تشير إلى ما إذا كان يجب تمكين دعم دالة XSLT **document()**. |
| [get_EnableScript](./get_enablescript/)() | يعيد قيمة تشير إلى ما إذا كان يجب تمكين دعم كتل السكريبت المدمجة. |
| static [get_TrustedXslt](./get_trustedxslt/)() | يعيد كائنًا من نوع [XsltSettings](./) يتيح دعم دالة XSLT **document()** وكتل السكريبت المدمجة. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تمكين دعم دالة XSLT **document()**. |
| [set_EnableScript](./set_enablescript/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تمكين دعم كتل السكريبت المدمجة. |
| [XsltSettings](./xsltsettings/)() | يُهيئ نسخة جديدة من فئة [XsltSettings](./) بالإعدادات الافتراضية. |
| [XsltSettings](./xsltsettings/)(bool, bool) | يُهيئ نسخة جديدة من فئة [XsltSettings](./) بالإعدادات المحددة. |
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
