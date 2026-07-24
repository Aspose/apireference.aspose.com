---
title: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri. تحل الـ URI المطلق من الـ URI الأساسي والنسبي في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


يحل المعرف المطلق (URI) من المعرف الأساسي والنسبي.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | الـ URI الأساسي المستخدم لحل الـ URI النسبي. |
| relativeUri | String | الـ URI المراد حله. يمكن أن يكون الـ URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

الـ [Uri](../../../system/uri/) الذي يمثل الـ URI المطلق أو **nullptr** إذا لم يمكن حل الـ URI النسبي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
