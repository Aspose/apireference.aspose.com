---
title: "System::Xml::Xsl::IXsltContextVariable class"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Xsl::IXsltContextVariable class. يوفر واجهة لمتغير معين يتم تعريفه في ورقة الأنماط أثناء تنفيذ وقت التشغيل في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


يوفر واجهة لمتغير معين معرف في ورقة الأنماط أثناء تنفيذ وقت التشغيل.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | يقيم المتغيّر في وقت التشغيل ويعيد كائنًا يمثل قيمة المتغيّر. |
| virtual [get_IsLocal](./get_islocal/)() | يعيد قيمة تشير إلى ما إذا كان المتغيّر محليًا. |
| virtual [get_IsParam](./get_isparam/)() | يعيد قيمة تشير إلى ما إذا كان المتغيّر معاملًا في Extensible Stylesheet Language Transformations (XSLT). يمكن أن يكون هذا معاملًا لورقة نمط أو قالب. |
| virtual [get_VariableType](./get_variabletype/)() | يعيد XPathResultType الذي يمثل نوع لغة مسار XML ([XPath](../../system.xml.xpath/)) للمتغيّر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
