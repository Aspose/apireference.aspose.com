---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType method"
linktitle: "The type of object to return. The current version only returns Stream objects."
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType method. يحدد ما إذا كان المحلل يدعم أنواعًا أخرى غير Stream في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


يحدد ما إذا كان المحلّل يدعم أنواعاً أخرى غير Stream فقط.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| The type of object to return. The current version only returns Stream objects. | SharedPtr\<Uri\> | URI المطلق للتحقق منه. |
| نوع | const TypeInfo\& | النوع المراد إرجاعه. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
