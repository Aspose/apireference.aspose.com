---
title: "طريقة System::Xml::XmlCDataSection::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlCDataSection::CloneNode. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| عميق | bool | **true** لاستنساخ الشجرة الفرعية تحت العقدة المحددة بشكل متكرر؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد CDATA لا تحتوي على أطفال، بغض النظر عن إعداد المعامل، ستشمل العقدة المستنسخة دائمًا محتوى البيانات. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
