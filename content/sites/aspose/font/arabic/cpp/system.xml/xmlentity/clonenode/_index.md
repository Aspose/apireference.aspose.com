---
title: "طريقة System::Xml::XmlEntity::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlEntity::CloneNode. يُنشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد الكيان. استدعاء هذه الطريقة على كائن XmlEntity يطرح استثناءً في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


يُنشئ نسخة مكررة من هذه العقدة. لا يمكن استنساخ عقد الكيان. استدعاء هذه الطريقة على كائن [XmlEntity](../) يطرح استثناءً.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| deep | bool | **true** لاستنساخ الشجرة الفرعية تحت العقدة المحددة بشكل متكرر؛ **false** لاستنساخ العقدة نفسها فقط. |

### ReturnValue

نسخة من [XmlNode](../../xmlnode/) التي تم استدعاء الطريقة منها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
