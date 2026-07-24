---
title: "طريقة System::Xml::XmlDocument::CreateXmlDeclaration"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlDocument::CreateXmlDeclaration. تُنشئ عقدة XmlDeclaration بالقيم المحددة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


تنشئ عقدة [XmlDeclaration](../../xmldeclaration/) بالقيم المحددة.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| إصدار | const String\& | يجب أن تكون النسخة "1.0". |
| encoding | const String\& | قيمة سمة الترميز. هذا هو الترميز المستخدم عند حفظ [XmlDocument](../) إلى ملف أو تدفق؛ لذلك يجب تعيينه إلى سلسلة يدعمها الفصل [Text::Encoding](../../../system.text/encoding/)، وإلا فستفشل "XmlDocument::Save(String)". إذا كان هذا **nullptr** أو [String::Empty](../../../system/string/empty/)، فإن طريقة [XmlDocument::Save](../save/) لا تكتب سمة الترميز في إعلان XML وبالتالي يُستخدم الترميز الافتراضي UTF-8. |
| standalone | const String\& | يجب أن تكون القيمة إما "yes" أو "no". إذا كان هذا **nullptr** أو [String::Empty](../../../system/string/empty/)، فإن طريقة [XmlDocument::Save](../save/) لا تكتب سمة standalone في إعلان XML. |

### ReturnValue

العقدة الجديدة [XmlDeclaration](../../xmldeclaration/).
## ملاحظات



ملاحظة: إذا تم حفظ [XmlDocument](../) إما إلى TextWriter أو إلى [XmlTextWriter](../../xmltextwriter/)، يتم تجاهل قيمة الترميز هذه. بدلاً من ذلك يُستخدم ترميز الـ TextWriter أو [XmlTextWriter](../../xmltextwriter/). يضمن ذلك إمكانية قراءة XML المكتوب مرة أخرى باستخدام الترميز الصحيح.
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
