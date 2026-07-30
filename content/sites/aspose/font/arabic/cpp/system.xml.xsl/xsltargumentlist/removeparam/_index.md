---
title: "طريقة System::Xml::Xsl::XsltArgumentList::RemoveParam"
linktitle: "RemoveParam"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Xsl::XsltArgumentList::RemoveParam. يزيل المعامل من XsltArgumentList في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.xsl/xsltargumentlist/removeparam/
---
## XsltArgumentList::RemoveParam method


يزيل المعامل من [XsltArgumentList](../).

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::RemoveParam(const String &name, const String &namespaceUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم المعامل المراد إزالته. لا يتحقق [XsltArgumentList](../) من أن الاسم الممرَّر هو اسم محلي صالح؛ ومع ذلك، لا يمكن أن يكون الاسم **nullptr**. |
| namespaceUri | const String\& | معرف مساحة الاسم URI للمعامل المراد إزالته. |

### ReturnValue

كائن المعامل أو **nullptr** إذا لم يتم العثور عليه.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
