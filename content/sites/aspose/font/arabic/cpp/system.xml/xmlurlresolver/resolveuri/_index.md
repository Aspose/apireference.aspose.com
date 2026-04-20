---
title: "طريقة System::Xml::XmlUrlResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlUrlResolver::ResolveUri. تحلّ URI المطلق من URI الأساسي و URI النسبي في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


يحل المعرف المطلق URI من المعرف الأساسي والنسبي.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI الأساسي المستخدم لحل URI النسبي. |
| relativeUri | String | URI المراد حله. يمكن أن يكون URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

URI المطلق، أو **nullptr** إذا تعذر حل URI النسبي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
