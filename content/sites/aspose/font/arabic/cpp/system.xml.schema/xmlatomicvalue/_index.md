---
title: "فئة System::Xml::Schema::XmlAtomicValue"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlAtomicValue. تمثل القيمة ذات النوع لعنصر XML أو سمة تم التحقق منها. لا يمكن وراثة فئة XmlAtomicValue في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


تمثل القيمة ذات النوع لعنصر XML أو سمة تم التحقق منها. لا يمكن وراثة الفئة [XmlAtomicValue](./).

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة من كائن [XmlAtomicValue](./) هذا. |
| [get_IsNode](./get_isnode/)() override | يعيد قيمة تشير إلى ما إذا كان عنصر XML أو سمة تم التحقق منها هو عقدة [XPath](../../system.xml.xpath/) أم قيمة ذرية. |
| [get_TypedValue](./get_typedvalue/)() override | يعيد العنصر XML أو السمة المُتحققة حاليًا ككائن معبأ من النوع الأنسب وفقًا لنوع المخطط الخاص به. |
| [get_Value](./get_value/)() override | يعيد قيمة [String](../../system/string/) للعنصر XML أو السمة المُتحققة. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | يعيد قيمة العنصر XML أو السمة المُتحققة كـ [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | يعيد قيمة العنصر XML أو السمة المُتحققة كـ [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | يعيد قيمة العنصر XML أو السمة المُتحققة كـ [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | يعيد قيمة العنصر XML أو السمة المُتحققة كـ [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | يعيد قيمة العنصر XML أو السمة المُتحققة كـ [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | يعيد نوع العنصر XML أو السمة المُتحققة. |
| [get_XmlType](./get_xmltype/)() override | يعيد الـ [XmlSchemaType](../xmlschematype/) للعنصر XML أو السمة المُتحققة. |
| [ToString](./tostring/)() const override | يعيد قيمة [String](../../system/string/) للعنصر XML أو السمة المُتحققة. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | يعيد قيمة العنصر XML أو السمة المُتحققة بالنوع المحدد باستخدام كائن [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات النطاق. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
