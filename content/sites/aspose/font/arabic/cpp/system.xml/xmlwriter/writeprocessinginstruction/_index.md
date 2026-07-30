---
title: "System::Xml::XmlWriter::WriteProcessingInstruction طريقة"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlWriter::WriteProcessingInstruction طريقة. عند تجاوزها في فئة مشتقة، تقوم بكتابة تعليمات معالجة مع مسافة بين الاسم والنص كما يلي: <?name text?> في C++."
type: docs
weight: 2700
url: /ar/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


عند تجاوزها في فئة مشتقة، تكتب تعليمًا معالجة مع مسافة بين الاسم والنص كما يلي: **<?name text?>**.

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | اسم تعليمات المعالجة. |
| نص | String | النص الذي سيتم تضمينه في تعليمات المعالجة. |
## ملاحظات



يتم استخدام هذه الطريقة لإنشاء إعلان XML بعد استدعاء [XmlWriter::WriteStartDocument](../writestartdocument/) بالفعل.
## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
