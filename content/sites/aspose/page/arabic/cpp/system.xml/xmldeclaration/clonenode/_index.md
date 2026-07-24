---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlDeclaration::CloneNode. تنشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| deep | bool | **true** لتكرار استنساخ الشجرة الفرعية تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد [XmlDeclaration](../) لا تحتوي على أبناء، فإن العقدة المستنسخة تشمل دائمًا قيمة البيانات، بغض النظر عن إعداد المعامل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
