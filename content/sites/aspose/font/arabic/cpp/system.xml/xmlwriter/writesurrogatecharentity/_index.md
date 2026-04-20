---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity method. عند تجاوزها في فئة مشتقة، تُنشئ وتكتب كيان الحرف البديل للزوج البديل في C++."
type: docs
weight: 3400
url: /ar/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


عند تجاوزها في فئة مشتقة، تُنشئ وتكتب كيان الحرف البديل للزوج البديل من الأحرف.

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| lowChar | char16_t | البديل الأدنى. يجب أن تكون قيمة بين 0xDC00 و0xDFFF. |
| highChar | char16_t | البديل الأعلى. يجب أن تكون قيمة بين 0xD800 و0xDBFF. |

## انظر أيضًا

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
