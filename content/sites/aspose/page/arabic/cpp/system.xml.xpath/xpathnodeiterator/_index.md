---
title: "فئة System::Xml::XPath::XPathNodeIterator"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XPath::XPathNodeIterator. توفر مُكرِّرًا لمجموعة مختارة من العقد في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


يوفر مكرّرًا على مجموعة مختارة من العقد.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تُعيد نسخة من كائن [XPathNodeIterator](./) هذا. |
| virtual [get_Count](./get_count/)() | تُعيد فهرس العقدة الأخيرة في المجموعة المختارة من العقد. |
| virtual [get_Current](./get_current/)() | عند تجاوزها في فئة مشتقة، تحصل على كائن [XPathNavigator](../xpathnavigator/) لهذا [XPathNodeIterator](./)، مُوضعًا على عقدة السياق الحالية. |
| virtual [get_CurrentPosition](./get_currentposition/)() | عند تجاوزها في فئة مشتقة، تحصل على فهرس الموضع الحالي في المجموعة المختارة من العقد. |
| [GetEnumerator](./getenumerator/)() override | تُعيد كائن IEnumerator للتكرار عبر مجموعة العقد المختارة. |
| virtual [MoveNext](./movenext/)() | عند تجاوزها في فئة مشتقة، تنقل كائن [XPathNavigator](../xpathnavigator/) الذي تُعيده طريقة [XPathNodeIterator::get_Current](./get_current/) إلى العقدة التالية في مجموعة العقد المختارة. |
| [XPathNodeIterator](./xpathnodeiterator/)() | تهيئ نسخة جديدة من فئة [XPathNodeIterator](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
