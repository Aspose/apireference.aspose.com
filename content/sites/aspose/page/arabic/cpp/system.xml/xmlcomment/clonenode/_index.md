---
title: "System::Xml::XmlComment::CloneNode طريقة"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlComment::CloneNode طريقة. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| عميق | bool | **true** لاستنساخ الشجرة الفرعية تحت العقدة المحددة بشكل متكرر؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد التعليق لا تحتوي على أبناء، فإن العقدة المستنسخة تشمل دائمًا محتوى النص، بغض النظر عن إعداد المعامل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
