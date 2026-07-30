---
title: "System::Xml::XmlComment::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlComment::CloneNode method. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لاستنساخ الشجرة الفرعية بشكل متكرر تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد التعليق لا تحتوي على أبناء، فإن العقدة المستنسخة تشمل دائمًا محتوى النص، بغض النظر عن إعداد المعامل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
