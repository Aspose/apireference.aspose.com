---
title: "طريقة System::Xml::XmlReader::MoveToContent"
linktitle: "MoveToContent"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlReader::MoveToContent. يتحقق مما إذا كانت العقدة الحالية عقدة محتوى (نص غير فارغ، CDATA، عنصر، عنصر نهائي، مرجع كيان، أو كيان نهائي). إذا لم تكن العقدة عقدة محتوى، يتخطى القارئ إلى العقدة المحتوى التالية أو إلى نهاية الملف. يتخطى العقد من الأنواع التالية: ProcessingInstruction، DocumentType، Comment، Whitespace، أو SignificantWhitespace في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


يتحقق مما إذا كانت العقدة الحالية عقدة محتوى (نص غير مسافة بيضاء، **CDATA**، **Element**، **EndElement**، **EntityReference**، أو **EndEntity**). إذا لم تكن العقدة عقدة محتوى، يتخطى القارئ إلى عقدة المحتوى التالية أو إلى نهاية الملف. يتخطى العقد من النوع التالي: **ProcessingInstruction**، **DocumentType**، **Comment**، **Whitespace**، أو **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

قيمة [XmlReader::get_NodeType](../get_nodetype/) للعقدة الحالية التي تم العثور عليها بواسطة الطريقة أو [XmlNodeType::None](../../xmlnodetype/) إذا وصل القارئ إلى نهاية تدفق الإدخال.

## انظر أيضًا

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
