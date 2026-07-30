---
title: "System::Xml::XmlDocument::CreateXmlDeclaration طريقة"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlDocument::CreateXmlDeclaration طريقة. يُنشئ عقدة XmlDeclaration بالقيم المحددة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


يُنشئ عقدة [XmlDeclaration](../../xmldeclaration/) بالقيم المحددة.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| إصدار | const String\& | يجب أن تكون النسخة "1.0". |
| encoding | const String\& | قيمة سمة الترميز. هذا هو الترميز الذي يُستخدم عند حفظ الـ [XmlDocument](../) إلى ملف أو تدفق؛ لذلك، يجب تعيينه إلى سلسلة يدعمها الفئة [Text::Encoding](../../../system.text/encoding/)، وإلا فستفشل "XmlDocument::Save(String)". إذا كان هذا **nullptr** أو [String::Empty](../../../system/string/empty/)، فإن طريقة [XmlDocument::Save](../save/) لا تكتب سمة الترميز في إعلان XML وبالتالي يُستخدم الترميز الافتراضي، UTF-8. |
| standalone | const String\& | يجب أن تكون القيمة إما "yes" أو "no". إذا كان هذا **nullptr** أو [String::Empty](../../../system/string/empty/)، فإن طريقة [XmlDocument::Save](../save/) لا تكتب سمة مستقلة على إعلان XML. |

### ReturnValue

العقدة الجديدة [XmlDeclaration](../../xmldeclaration/).
## ملاحظات



ملاحظة: إذا تم حفظ الـ [XmlDocument](../) إلى إما TextWriter أو [XmlTextWriter](../../xmltextwriter/)، يتم تجاهل قيمة الترميز هذه. بدلاً من ذلك، يُستخدم ترميز الـ TextWriter أو [XmlTextWriter](../../xmltextwriter/). يضمن ذلك أن XML المكتوب يمكن قراءته مرة أخرى باستخدام الترميز الصحيح.
## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
