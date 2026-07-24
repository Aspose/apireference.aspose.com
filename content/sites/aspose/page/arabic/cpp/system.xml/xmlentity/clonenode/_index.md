---
title: "System::Xml::XmlEntity::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlEntity::CloneNode method. ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد الكيان. استدعاء هذه الطريقة على كائن XmlEntity يطرح استثناءً في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


ينشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد الكيان. استدعاء هذه الطريقة على كائن [XmlEntity](../) يطرح استثناءً.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| عميق | bool | **true** لاستنساخ الشجرة الفرعية بشكل متكرر تحت العقدة المحددة؛ **false** لاستنساخ العقدة نفسها فقط. |

### ReturnValue

نسخة من الـ[XmlNode](../../xmlnode/) الذي تم استدعاء الطريقة منه.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
