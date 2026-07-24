---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity method. يربط URI بكائن يحتوي على المورد الفعلي في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


يربط معرف الموارد (URI) بكائن يحتوي على المورد الفعلي.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI الذي تم إرجاعه من استدعاء [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| الدور | String | حاليًا غير مستخدم. |
| ofObjectToReturn | const TypeInfo\& | نوع الكائن المراد إرجاعه. يدعم [XmlPreloadedResolver](../) كائنات Stream وكائنات TextReader للـ URIs التي تم إضافتها كـ [String](../../../system/string/). إذا لم يكن النوع المطلوب مدعومًا من قبل المحلل، سيتم رمي استثناء. استخدم طريقة XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) لتحديد ما إذا كان **Type** معين مدعومًا من هذا المحلل. |

### ReturnValue

كائن Stream أو TextReader يتطابق مع المصدر الفعلي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
