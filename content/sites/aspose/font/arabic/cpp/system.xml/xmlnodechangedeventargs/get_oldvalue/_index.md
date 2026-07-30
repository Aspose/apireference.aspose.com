---
title: "طريقة System::Xml::XmlNodeChangedEventArgs::get_OldValue"
linktitle: "get_OldValue"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNodeChangedEventArgs::get_OldValue. تُرجع القيمة الأصلية للعقدة في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


يعيد القيمة الأصلية للعقدة.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

القيمة الأصلية للعقدة. تُرجع هذه الطريقة **nullptr** إذا لم تكن العقدة سمة ولا عقدة نصية، أو إذا كانت العقدة تُدرج. إذا تم الاستدعاء في حدث **XmlDocument::NodeChanging**، تُرجع **get_OldValue** القيمة الحالية للعقدة التي سيتم استبدالها إذا كان التغيير ناجحًا. إذا تم الاستدعاء في حدث **XmlDocument::NodeChanged**، تُرجع **get_OldValue** قيمة العقدة قبل التغيير.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
