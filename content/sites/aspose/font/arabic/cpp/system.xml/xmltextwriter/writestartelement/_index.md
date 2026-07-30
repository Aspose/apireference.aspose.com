---
title: "طريقة System::Xml::XmlTextWriter::WriteStartElement"
linktitle: "WriteStartElement"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlTextWriter::WriteStartElement. يكتب علامة البداية المحددة ويربطها بالمساحة الاسمية والبادئة المعطاة في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml/xmltextwriter/writestartelement/
---
## XmlTextWriter::WriteStartElement method


يكتب وسم البداية المحدد ويربطه بالمساحة الاسمية والبادئة المعطاة.

```cpp
void System::Xml::XmlTextWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| البادئة | const String\& | بادئة مساحة الاسم للعنصر. |
| localName | const String\& | الاسم المحلي للعنصر. |
| ns | const String\& | معرف URI لمساحة الاسم لربطه بالعنصر. إذا كانت هذه المساحة الاسمية موجودة بالفعل في النطاق ولها بادئة مرتبطة، فإن الكاتب يكتب تلك البادئة تلقائيًا. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
