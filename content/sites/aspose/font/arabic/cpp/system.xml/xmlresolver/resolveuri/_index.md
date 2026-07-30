---
title: "طريقة System::Xml::XmlResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlResolver::ResolveUri. عندما يتم تجاوزها في فئة مشتقة، تقوم بحل عنوان URI المطلق من عناوين URI الأساسية والنسبيّة في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


عند تجاوزها في فئة مشتقة، تحل الـ URI المطلق من الـ URI الأساسي والنسبي.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI الأساسي المستخدم لحل URI النسبي. |
| relativeUri | String | URI المراد حله. يمكن أن يكون URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

عنوان URI المطلق أو **nullptr** إذا تعذر حل عنوان URI النسبي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
