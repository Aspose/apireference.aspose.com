---
title: "The type of object to return. The current version only returns Stream objects."
linktitle: "ResolveUri"
second_title: "Aspose.Page لـ C++"
description: "The type of object to return. The current version only returns Stream objects."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


عند تجاوزها في فئة مشتقة، تقوم بحل الـ URI المطلق من الـ URI الأساسي والنسبي.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | الـ URI الأساسي المستخدم لحل الـ URI النسبي. |
| relativeUri | String | الـ URI المراد حله. يمكن أن يكون الـ URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

The type of object to return. The current version only returns Stream objects.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
