---
title: "System::Xml::Xsl::IXsltContextFunction فئة"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::IXsltContextFunction فئة. توفر واجهة لدالة معينة معرفة في ورقة أنماط Extensible Stylesheet Language for Transformations (XSLT) أثناء تنفيذ وقت التشغيل في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


يوفر واجهة لدالة معينة معرفة في ورقة أنماط لغة الأنماط القابلة للامتداد للتحويلات (XSLT) أثناء تنفيذ وقت التشغيل.

```cpp
class IXsltContextFunction : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | يعيد أنواع لغة مسار XML ([XPath](../../system.xml.xpath/)) المقدمة لقائمة معلمات الدالة. يمكن استخدام هذه المعلومات لاكتشاف توقيع الدالة مما يتيح لك التمييز بين الدوال المتعددة التحميل. |
| virtual [get_Maxargs](./get_maxargs/)() | يعيد الحد الأقصى لعدد المعلمات للدالة. يتيح ذلك للمستخدم التمييز بين الدوال المتعددة التحميل. |
| virtual [get_Minargs](./get_minargs/)() | يعيد الحد الأدنى لعدد الوسائط للدالة. يتيح ذلك للمستخدم التمييز بين الدوال المتعددة التحميل. |
| virtual [get_ReturnType](./get_returntype/)() | يعيد XPathResultType الذي يمثل نوع [XPath](../../system.xml.xpath/) الذي تُعيده الدالة. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | يوفر الطريقة لاستدعاء الدالة بالوسائط المحددة في السياق المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
