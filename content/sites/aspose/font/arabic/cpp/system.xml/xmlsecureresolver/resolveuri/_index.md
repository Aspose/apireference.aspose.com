---
title: "طريقة System::Xml::XmlSecureResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlSecureResolver::ResolveUri. تحل العنوان المطلق URI من العناوين الأساسية والنسبية عن طريق استدعاء ResolveUri على XmlResolver الأساسي في C++."
type: docs
weight: 300
url: /ar/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


تحل العنوان المطلق URI من العناوين الأساسية والنسبية عن طريق استدعاء **ResolveUri** على [XmlResolver](../../xmlresolver/) الأساسي.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | URI الأساسي المستخدم لحل URI النسبي. |
| relativeUri | String | URI المراد حله. يمكن أن يكون URI مطلقًا أو نسبيًا. إذا كان مطلقًا، فإن هذه القيمة تستبدل قيمة **baseUri** فعليًا. إذا كان نسبيًا، فإنه يُدمج مع **baseUri** لتكوين URI مطلق. |

### ReturnValue

العنوان المطلق URI أو **nullptr** إذا تعذر حل العنوان النسبي (يُعاد باستدعاء **ResolveUri** على [XmlResolver](../../xmlresolver/) الأساسي).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
