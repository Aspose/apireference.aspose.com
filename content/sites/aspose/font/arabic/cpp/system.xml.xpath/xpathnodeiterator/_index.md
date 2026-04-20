---
title: "System::Xml::XPath::XPathNodeIterator class"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNodeIterator class. يوفر مكرّرًا لمجموعة مختارة من العقد في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


يوفر مكرّرًا لمجموعة مختارة من العقد.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | عند تجاوزها في فئة مشتقة، تعيد نسخة مستنسخة من كائن [XPathNodeIterator](./) هذا. |
| virtual [get_Count](./get_count/)() | يعيد فهرس العقدة الأخيرة في مجموعة العقد المحددة. |
| virtual [get_Current](./get_current/)() | عند تجاوزها في فئة مشتقة، يحصل على كائن [XPathNavigator](../xpathnavigator/) لهذا [XPathNodeIterator](./)، موضعًا على عقدة السياق الحالية. |
| virtual [get_CurrentPosition](./get_currentposition/)() | عند تجاوزها في فئة مشتقة، يحصل على فهرس الموضع الحالي في مجموعة العقد المحددة. |
| [GetEnumerator](./getenumerator/)() override | يعيد كائن IEnumerator للتكرار عبر مجموعة العقد المحددة. |
| virtual [MoveNext](./movenext/)() | عند تجاوزها في فئة مشتقة، ينقل كائن [XPathNavigator](../xpathnavigator/) الذي تُعيده طريقة [XPathNodeIterator::get_Current](./get_current/) إلى العقدة التالية في مجموعة العقد المحددة. |
| [XPathNodeIterator](./xpathnodeiterator/)() | يُنشئ مثيلاً جديدًا من الفئة [XPathNodeIterator](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
