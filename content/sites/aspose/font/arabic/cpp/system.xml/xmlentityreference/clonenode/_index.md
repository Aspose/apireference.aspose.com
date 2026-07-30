---
title: "System::Xml::XmlEntityReference::CloneNode طريقة"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لتكرار استنساخ الشجرة الفرعية تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. بالنسبة لعقد [XmlEntityReference](../)، هذه الطريقة تُرجِع دائمًا عقدة إشارة كيان بدون أطفال. يتم تعيين نص الاستبدال عندما تُدرج العقدة في أصل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
