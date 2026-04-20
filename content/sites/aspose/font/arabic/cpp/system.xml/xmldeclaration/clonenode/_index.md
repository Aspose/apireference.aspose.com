---
title: "System::Xml::XmlDeclaration::CloneNode طريقة"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDeclaration::CloneNode طريقة. ينشئ نسخة مكررة من هذه العقدة في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


ينشئ نسخة مكررة من هذه العقدة.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لاستنساخ الشجرة الفرعية بشكل متكرر تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. لأن عقد [XmlDeclaration](../) لا تحتوي على أبناء، فإن العقدة المستنسخة تتضمن دائمًا قيمة البيانات، بغض النظر عن إعداد المعامل. |

### ReturnValue

العقدة المستنسخة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
