---
title: "طريقة System::Xml::XmlNodeChangedEventArgs::get_NewValue"
linktitle: "get_NewValue"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlNodeChangedEventArgs::get_NewValue. تُرجع القيمة الجديدة للعقدة في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


يعيد القيمة الجديدة للعقدة.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

القيمة الجديدة للعقدة. تُرجع هذه الطريقة **nullptr** إذا لم تكن العقدة سمة ولا عقدة نصية، أو إذا كانت العقدة تُزال. إذا تم الاستدعاء في حدث **XmlDocument::NodeChanging**، تُرجع **get_NewValue** قيمة العقدة إذا كان التغيير ناجحًا. إذا تم الاستدعاء في حدث **XmlDocument::NodeChanged**، تُرجع **get_NewValue** القيمة الحالية للعقدة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
