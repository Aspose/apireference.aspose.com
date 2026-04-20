---
title: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::SupportsType"
linktitle: "SupportsType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::Resolvers::XmlPreloadedResolver::SupportsType. تحدد ما إذا كان المحلل يدعم أنواعًا أخرى غير Stream فقط في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


يحدد ما إذا كان المحلّل يدعم أنواعًا أخرى غير Stream فقط.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | معرف URI المطلق للتحقق منه. |
| نوع | const TypeInfo\& | النوع المراد إرجاعه. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
