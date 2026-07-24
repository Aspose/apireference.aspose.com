---
title: "طريقة System::Xml::XmlNotation::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlNotation::CloneNode. تُنشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد Notation. استدعاء هذه الطريقة على كائن XmlNotation يُطلق استثناءً في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


تنشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد Notation. استدعاء هذه الطريقة على كائن [XmlNotation](../) يُطلق استثناءً.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| عميق | bool | **true** لاستنساخ الشجرة الفرعية بشكل متكرر تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. |

### ReturnValue

نسخة [XmlNode](../../xmlnode/) من العقدة التي تم استدعاء الطريقة منها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
