---
title: "System::Xml::Schema::XmlAtomicValue class"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlAtomicValue class. يمثل القيمة المكتوبة لعنصر XML أو سمة تم التحقق منها. لا يمكن وراثة فئة XmlAtomicValue في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


يمثل القيمة المكتوبة لعنصر XML أو سمة تم التحقق منها. لا يمكن وراثة فئة [XmlAtomicValue](./).

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة من كائن [XmlAtomicValue](./) هذا. |
| [get_IsNode](./get_isnode/)() override | يعيد قيمة تشير إلى ما إذا كان عنصر XML أو سمة تم التحقق منها هو عقدة [XPath](../../system.xml.xpath/) أم قيمة ذرية. |
| [get_TypedValue](./get_typedvalue/)() override | يعيد العنصر أو السمة XML المُتحقق منها الحالي ككائن معبأ من النوع الأنسب وفقًا لنوع المخطط الخاص به. |
| [get_Value](./get_value/)() override | يعيد قيمة [String](../../system/string/) للعنصر أو السمة XML المُتحقق منها. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | يعيد قيمة العنصر أو السمة XML المُتحقق منها كـ [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | يعيد قيمة العنصر أو السمة XML المُتحقق منها كـ [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | يعيد قيمة العنصر أو السمة XML المُتحقق منها كـ [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | يعيد قيمة العنصر أو السمة XML المُتحقق منها كـ [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | يعيد قيمة العنصر أو السمة XML المُتحقق منها كـ [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | يعيد نوع العنصر أو السمة XML المُتحقق منها. |
| [get_XmlType](./get_xmltype/)() override | يعيد الـ [XmlSchemaType](../xmlschematype/) للعنصر أو السمة XML المُتحقق منها. |
| [ToString](./tostring/)() const override | يعيد قيمة [String](../../system/string/) للعنصر أو السمة XML المُتحقق منها. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | يعيد قيمة العنصر أو السمة XML المُتحقق منها بالنوع المحدد باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
