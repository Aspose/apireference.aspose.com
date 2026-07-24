---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Xsl::IXsltContextFunction class. يوفر واجهة لدالة معينة معرفة في ورقة نمط Extensible Stylesheet Language for Transformations (XSLT) أثناء تنفيذ وقت التشغيل في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


يوفر واجهة لدالة معينة معرفة في ورقة أنماط لغة الأنماط القابلة للتمدد للتحويل (XSLT) أثناء تنفيذ وقت التشغيل.

```cpp
class IXsltContextFunction : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | يعيد أنواع لغة مسار XML ([XPath](../../system.xml.xpath/)) المزوّدة لقائمة معطيات الدالة. يمكن استخدام هذه المعلومات لاكتشاف توقيع الدالة مما يسمح لك بالتمييز بين الدوال المتجاوزة. |
| virtual [get_Maxargs](./get_maxargs/)() | يعيد الحد الأقصى لعدد المعطيات للدالة. يتيح ذلك للمستخدم التمييز بين الدوال المتجاوزة. |
| virtual [get_Minargs](./get_minargs/)() | يعيد الحد الأدنى لعدد المعطيات للدالة. يتيح ذلك للمستخدم التمييز بين الدوال المتجاوزة. |
| virtual [get_ReturnType](./get_returntype/)() | يعيد XPathResultType الذي يمثل نوع [XPath](../../system.xml.xpath/) الذي تُعيده الدالة. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | يوفر الطريقة لاستدعاء الدالة بالمعطيات المعطاة في السياق المعطى. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
