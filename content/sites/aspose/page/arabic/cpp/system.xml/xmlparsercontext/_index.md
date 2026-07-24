---
title: "System::Xml::XmlParserContext الفئة"
linktitle: "XmlParserContext"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlParserContext الفئة. يوفر جميع معلومات السياق المطلوبة من قبل XmlReader لتحليل جزء XML في C++."
type: docs
weight: 3000
url: /ar/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


يوفر جميع معلومات السياق المطلوبة من قبل [XmlReader](../xmlreader/) لتحليل جزء XML.

```cpp
class XmlParserContext : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | يرجع عنوان URI الأساسي. |
| [get_DocTypeName](./get_doctypename/)() | يرجع اسم إعلان نوع المستند. |
| [get_Encoding](./get_encoding/)() | يرجع نوع الترميز. |
| [get_InternalSubset](./get_internalsubset/)() | يرجع مجموعة DTD الداخلية. |
| [get_NamespaceManager](./get_namespacemanager/)() | يرجع [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | يرجع [XmlNameTable](../xmlnametable/) المستخدم لتجميع السلاسل. لمزيد من المعلومات حول السلاسل المجمعّة، راجع [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | يرجع المعرف العام. |
| [get_SystemId](./get_systemid/)() | يرجع المعرف النظامي. |
| [get_XmlLang](./get_xmllang/)() | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() | يعيد نطاق **xml:space** الحالي. |
| [set_BaseURI](./set_baseuri/)(const String\&) | يضبط عنوان URI الأساسي. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | يضبط اسم إعلان نوع المستند. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | يضبط نوع الترميز. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | يضبط مجموعة DTD الداخلية. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | يضبط [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | يضبط [XmlNameTable](../xmlnametable/) المستخدم لتجميع السلاسل. لمزيد من المعلومات حول السلاسل المجمعّة، راجع [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | يضبط المعرف العام. |
| [set_SystemId](./set_systemid/)(const String\&) | يضبط المعرف النظامي. |
| [set_XmlLang](./set_xmllang/)(const String\&) | يضبط نطاق **xml:lang** الحالي. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | يضبط نطاق **xml:space** الحالي. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) المحدد، و[XmlNamespaceManager](../xmlnamespacemanager/) المحدد، وقيم **xml:lang** و **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) المحدد، و[XmlNamespaceManager](../xmlnamespacemanager/) المحدد، وقيم **xml:lang** و **xml:space**، والترميز. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | ينشئ مثيلاً جديداً من الفئة [XmlParserContext](./) مع [XmlNameTable](../xmlnametable/) المحدد، و[XmlNamespaceManager](../xmlnamespacemanager/) المحدد، وعنوان URI الأساسي، وقيم **xml:lang** و **xml:space**، وقيم نوع المستند. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | يُنشئ مثيلاً جديدًا من الفئة [XmlParserContext](./) باستخدام [XmlNameTable](../xmlnametable/)، [XmlNamespaceManager](../xmlnamespacemanager/)، عنوان URI الأساسي، **xml:lang**، **xml:space**، الترميز، وقيم نوع المستند. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
