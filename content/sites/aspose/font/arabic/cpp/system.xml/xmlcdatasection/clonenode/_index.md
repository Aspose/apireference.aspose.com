---
title: "System::Xml::XmlCDataSection::CloneNode طريقة"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlCDataSection::CloneNode طريقة. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لتكرار استنساخ الشجرة الفرعية تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد CDATA لا تملك أبناء، بغض النظر عن إعداد المعامل، ستشمل العقدة المستنسخة دائمًا محتوى البيانات. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
