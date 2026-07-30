---
title: "فئة System::Xml::XmlCharacterData"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlCharacterData. توفر طرق معالجة النصوص التي تستخدمها عدة فئات في C++."
type: docs
weight: 900
url: /ar/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


يوفر طرق معالجة النص التي تستخدمها عدة فئات.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | يضيف السلسلة المحددة إلى نهاية بيانات الأحرف للعقدة. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | يزيل نطاقاً من الأحرف من العقدة. |
| virtual [get_Data](./get_data/)() | يعيد بيانات العقدة. |
| [get_InnerText](./get_innertext/)() override | يعيد القيم المدمجة للعقدة وجميع أبناءها. |
| virtual [get_Length](./get_length/)() | يعيد طول البيانات بالأحرف. |
| [get_Value](./get_value/)() override | يعيد قيمة العقدة. |
| virtual [InsertData](./insertdata/)(int32_t, String) | يدرج السلسلة المحددة عند الإزاحة الأحرفية المحددة. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | يستبدل عدد الأحرف المحدد بدءاً من الإزاحة المحددة بالسلسلة المحددة. |
| virtual [set_Data](./set_data/)(String) | يضبط بيانات العقدة. |
| [set_InnerText](./set_innertext/)(String) override | يضبط القيم المدمجة للعقدة وجميع أبناءها. |
| [set_Value](./set_value/)(String) override | يضبط قيمة العقدة. |
| virtual [Substring](./substring/)(int32_t, int32_t) | يسترجع جزءاً من السلسلة الكاملة من النطاق المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
