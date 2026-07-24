---
title: "فئة **System::Xml::XPath::XPathItem**"
linktitle: "XPathItem"
second_title: "Aspose.Page لـ C++"
description: "**System::Xml::XPath::XPathItem** فئة. يمثل عنصرًا في نموذج البيانات XQuery 1.0 و XPath 2.0 في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


يمثل عنصرًا في XQuery 1.0 و [XPath](../) 2.0 [Data](../../system.data/) Model.

```cpp
class XPathItem : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كان العنصر يمثل عقدة [XPath](../) أو قيمة ذرية. |
| virtual [get_TypedValue](./get_typedvalue/)() | عند تجاوزها في فئة مشتقة، تحصل على العنصر الحالي ككائن معبأ من النوع الأنسب وفقًا لنوع المخطط الخاص به. |
| virtual [get_Value](./get_value/)() | عند تجاوزها في فئة مشتقة، تحصل على القيمة **string** للعنصر. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة العنصر كـ [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة العنصر كـ [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة العنصر كـ [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة العنصر كـ [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة العنصر كـ [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع العنصر. |
| virtual [get_XmlType](./get_xmltype/)() | عند تجاوزها في فئة مشتقة، تحصل على XmlSchemaType للعنصر. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | يرجع قيمة العنصر بالنوع المحدد. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | عند تجاوزها في فئة مشتقة، تُعيد قيمة العنصر بالنوع المحدد باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات المساحات الاسمية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
