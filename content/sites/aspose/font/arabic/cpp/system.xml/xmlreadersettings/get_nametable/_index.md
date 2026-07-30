---
title: "طريقة System::Xml::XmlReaderSettings::get_NameTable"
linktitle: "get_NameTable"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReaderSettings::get_NameTable. تُرجع XmlNameTable المستخدم للمقارنات السلسلية المتجذرة في C++."
type: docs
weight: 1500
url: /ar/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


تُرجع الـ [XmlNameTable](../../xmlnametable/) المستخدم للمقارنات السلسلية المتجذرة.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

الـ [XmlNameTable](../../xmlnametable/) الذي يخزن جميع السلاسل المتجذرة المستخدمة من قبل جميع كائنات [XmlReader](../../xmlreader/) التي تم إنشاؤها باستخدام كائن [XmlReaderSettings](../) هذا. القيمة الافتراضية هي **nullptr**. سيستخدم كائن [XmlReader](../../xmlreader/) المُنشأ جدول أسماء جديد فارغ [NameTable](../../nametable/) إذا كانت هذه القيمة **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
