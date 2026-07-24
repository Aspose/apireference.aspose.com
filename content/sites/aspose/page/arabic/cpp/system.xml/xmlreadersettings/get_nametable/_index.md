---
title: "طريقة System::Xml::XmlReaderSettings::get_NameTable"
linktitle: "get_NameTable"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlReaderSettings::get_NameTable. تُعيد XmlNameTable المستخدم للمقارنات المتجذرة للسلاسل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


تُعيد الـ[XmlNameTable](../../xmlnametable/) المستخدم للمقارنات المتجذرة للسلاسل.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

الـ[XmlNameTable](../../xmlnametable/) الذي يخزن جميع السلاسل المتجذرة المستخدمة من قبل جميع كائنات [XmlReader](../../xmlreader/) التي تم إنشاؤها باستخدام كائن [XmlReaderSettings](../) هذا. القيمة الافتراضية هي **nullptr**. ستستخدم نسخة [XmlReader](../../xmlreader/) التي تم إنشاؤها [NameTable](../../nametable/) فارغًا جديدًا إذا كانت هذه القيمة **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
