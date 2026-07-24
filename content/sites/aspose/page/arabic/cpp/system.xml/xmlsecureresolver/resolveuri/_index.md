---
title: "طريقة System::Xml::XmlSecureResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XmlSecureResolver::ResolveUri. تحل العنوان المطلق من العناوين الأساسية والنسبيّة عن طريق استدعاء **ResolveUri** على XmlResolver الأساسي في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


يحلّ العنوان المطلق من العناوين الأساسية والنسبيّة عن طريق استدعاء **ResolveUri** على [XmlResolver](../../xmlresolver/) الأساسي.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | الـ URI الأساسي المستخدم لحل الـ URI النسبي. |
| relativeUri | String | الـ URI المراد حله. يمكن أن يكون الـ URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

العنوان المطلق أو **nullptr** إذا تعذّر حل العنوان النسبي (يُرجع عند استدعاء **ResolveUri** على [XmlResolver](../../xmlresolver/) الأساسي).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
