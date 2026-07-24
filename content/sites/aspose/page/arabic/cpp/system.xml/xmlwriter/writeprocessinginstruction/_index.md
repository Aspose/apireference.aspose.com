---
title: "System::Xml::XmlWriter::WriteProcessingInstruction طريقة"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction طريقة. عند تجاوزها في فئة مشتقة، تقوم بكتابة تعليم معالجة مع مسافة بين الاسم والنص كما يلي: <?name text?> في C++."
type: docs
weight: 2700
url: /ar/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


عند تجاوزها في فئة مشتقة، تكتب تعليمة معالجة مع مسافة بين الاسم والنص كما يلي: **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | اسم تعليمات المعالجة. |
| text | String | النص لتضمينه في تعليمات المعالجة. |
## ملاحظات



يتم استخدام هذه الطريقة لإنشاء إعلان XML بعد أن تم استدعاء [XmlWriter::WriteStartDocument](../writestartdocument/) بالفعل.
## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
