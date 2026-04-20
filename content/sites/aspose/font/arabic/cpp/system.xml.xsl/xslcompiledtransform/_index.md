---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Xsl::XslCompiledTransform class. يحول بيانات XML باستخدام ورقة نمط XSLT في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


يحوّل بيانات XML باستخدام ورقة أنماط XSLT.

```cpp
class XslCompiledTransform : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | يعيد كائنًا من نوع [XmlWriterSettings](../../system.xml/xmlwritersettings/) يحتوي على معلومات الإخراج المستمدة من عنصر **xsl:output** في ورقة النمط. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | يقوم بتجميع ورقة الأنماط الموجودة في [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | يقوم بتجميع ورقة الأنماط XSLT الموجودة في [XmlReader](../../system.xml/xmlreader/). يقوم [XmlResolver](../../system.xml/xmlresolver/) بحل أي عناصر **import** أو **include** في XSLT وتحدد إعدادات XSLT الأذونات لورقة الأنماط. |
| [Load](./load/)(const String\&) | يقوم بتحميل وتجميع ورقة الأنماط الموجودة في عنوان URI المحدد. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | يقوم بتحميل وتجميع ورقة الأنماط XSLT المحددة بواسطة URI. يقوم [XmlResolver](../../system.xml/xmlresolver/) بحل أي عناصر **import** أو **include** في XSLT وتحدد إعدادات XSLT الأذونات لورقة الأنماط. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | يقوم بتجميع ورقة الأنماط الموجودة في كائن IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | يقوم بتجميع ورقة الأنماط XSLT الموجودة في IXPathNavigable. يقوم [XmlResolver](../../system.xml/xmlresolver/) بحل أي عناصر **import** أو **include** في XSLT وتحدد إعدادات XSLT الأذونات لورقة الأنماط. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى TextWriter. توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن [XmlReader](../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن [XmlReader](../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن [XmlReader](../../system.xml/xmlreader/) ويخرج النتائج إلى TextWriter. توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن [XmlReader](../../system.xml/xmlreader/) ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى تدفق. توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية. |
| [Transform](./transform/)(const String\&, const String\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة URI ويخرج النتائج إلى ملف. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن [XmlReader](../../system.xml/xmlreader/) ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية و[XmlResolver](../../system.xml/xmlresolver/) يحل دالة XSLT **document()**. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | ينفّذ التحويل باستخدام مستند الإدخال المحدد بواسطة كائن IXPathNavigable ويخرج النتائج إلى [XmlWriter](../../system.xml/xmlwriter/). توفر [XsltArgumentList](../xsltargumentlist/) وسائط تشغيل إضافية و[XmlResolver](../../system.xml/xmlresolver/) يحل دالة XSLT **document()**. |
| [XslCompiledTransform](./xslcompiledtransform/)() | ينشئ مثيلًا جديدًا من الفئة [XslCompiledTransform](./). |
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
