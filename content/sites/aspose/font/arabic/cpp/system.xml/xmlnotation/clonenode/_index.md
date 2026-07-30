---
title: "System::Xml::XmlNotation::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlNotation::CloneNode method. ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد التدوين. استدعاء هذه الطريقة على كائن XmlNotation يطرح استثناءً في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد التدوين. استدعاء هذه الطريقة على كائن [XmlNotation](../) يطرح استثناءً.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لاستنساخ الشجرة الفرعية تحت العقدة المحددة بشكل متكرر؛ **false** لاستنساخ العقدة نفسها فقط. |

### ReturnValue

نسخة [XmlNode](../../xmlnode/) من العقدة التي تم استدعاء الطريقة منها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
