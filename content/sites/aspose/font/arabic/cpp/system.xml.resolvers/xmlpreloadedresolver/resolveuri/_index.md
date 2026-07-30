---
title: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri. تُحلّ العنوان المطلق URI من العناوين الأساسية والنسبية في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


يحل المعرف المطلق URI من المعرف الأساسي والنسبي.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI الأساسي المستخدم لحل URI النسبي. |
| relativeUri | String | URI المراد حله. يمكن أن يكون URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

الـ [Uri](../../../system/uri/) الذي يمثل العنوان المطلق أو **nullptr** إذا تعذّر حل العنوان النسبي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
