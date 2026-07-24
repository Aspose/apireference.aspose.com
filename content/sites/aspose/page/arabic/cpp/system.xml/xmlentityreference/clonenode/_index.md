---
title: "System::Xml::XmlEntityReference::CloneNode طريقة"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlEntityReference::CloneNode طريقة. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| deep | bool | **true** لاستنساخ الشجرة الفرعية بشكل متكرر تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. بالنسبة لعقد [XmlEntityReference](../)، هذه الطريقة دائمًا ما تُعيد عقدة إشارة كيان بدون أبناء. يتم تعيين نص الاستبدال عندما تُدرج العقدة في أصل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
