---
title: "System::Xml::XmlUrlResolver::ResolveUri طريقة"
linktitle: "ResolveUri"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlUrlResolver::ResolveUri طريقة. يستخرج الـ URI المطلق من الـ URI الأساسي والـ URI النسبي في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


يحل المعرف المطلق (URI) من المعرف الأساسي والنسبي.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | الـ URI الأساسي المستخدم لحل الـ URI النسبي. |
| relativeUri | String | الـ URI المراد حله. يمكن أن يكون الـ URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

الـ URI المطلق، أو **nullptr** إذا تعذر حل الـ URI النسبي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
