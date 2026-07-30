---
title: "طريقة System::Xml::Xsl::XsltArgumentList::GetParam"
linktitle: "GetParam"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XsltArgumentList::GetParam. تُرجع المعامل المرتبط بالاسم المؤهل للمساحة الاسمية في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


يعيد المعلمة المرتبطة بالاسم المؤهل للمساحة الاسمية.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم المعامل. لا يتحقق [XsltArgumentList](../) من صحة أن الاسم الممرَّر هو اسم محلي صالح؛ ومع ذلك، لا يمكن أن يكون الاسم **nullptr**. |
| namespaceUri | const String\& | معرف URI للمساحة الاسمية المرتبط بالمعامل. |

### ReturnValue

كائن المعامل أو **nullptr** إذا لم يتم العثور عليه.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
