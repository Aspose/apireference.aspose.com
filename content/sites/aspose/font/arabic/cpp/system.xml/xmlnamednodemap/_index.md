---
title: "فئة System::Xml::XmlNamedNodeMap"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlNamedNodeMap. تمثل مجموعة من العقد يمكن الوصول إليها بالاسم أو الفهرس في C++."
type: docs
weight: 2200
url: /ar/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


يمثل مجموعة من العقد يمكن الوصول إليها بالاسم أو الفهرس.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [begin](./begin/)() const | يحصل على المؤشر إلى العنصر الأول في المجموعة. |
| [cbegin](./cbegin/)() const | يحصل على المؤشر إلى العنصر الأول في المجموعة. |
| [cend](./cend/)() const | يحصل على المؤشر لعنصر غير موجود خلف العنصر الأخير في المجموعة. |
| [end](./end/)() const | يحصل على المؤشر لعنصر غير موجود خلف العنصر الأخير في المجموعة. |
| virtual [get_Count](./get_count/)() | يعيد عدد العقد في [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | يوفر دعمًا للتكرار عبر مجموعة العقد في [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | يسترجع [XmlNode](../xmlnode/) محدد بالاسم. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | يسترجع عقدة ذات القيم المطابقة لـ [XmlNode::get_LocalName](../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [Item](./item/)(int32_t) | يسترجع العقدة في الفهرس المحدد داخل [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | يزيل العقدة من [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | يزيل عقدة ذات القيم المطابقة لـ [XmlNode::get_LocalName](../xmlnode/get_localname/) و [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | يضيف [XmlNode](../xmlnode/) باستخدام قيمة [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [iterator](./iterator/) | نوع المكرر. |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
