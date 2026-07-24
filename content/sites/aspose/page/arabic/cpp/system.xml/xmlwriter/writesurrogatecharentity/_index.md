---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity method. عند تجاوزها في فئة مشتقة، تُنشئ وتكتب كيان الحرف البديل للزوج البديل في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


عند تجاوزها في فئة مشتقة، تولد وتكتب كيان الحرف البديل لزوج الأحرف البديلة.

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| lowChar | char16_t | البديل المنخفض. يجب أن تكون هذه القيمة بين 0xDC00 و 0xDFFF. |
| highChar | char16_t | البديل العالي. يجب أن تكون هذه القيمة بين 0xD800 و 0xDBFF. |

## انظر أيضًا

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
