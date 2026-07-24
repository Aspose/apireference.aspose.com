---
title: "System::Xml::XmlResolver::GetEntity method"
linktitle: "GetEntity"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlResolver::GetEntity method. عند تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


عند تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | معرف URI الذي تم إرجاعه من استدعاء [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| الدور | String | حاليًا غير مستخدم. |
| ofObjectToReturn | const TypeInfo\& | The type of object to return. The current version only returns Stream objects. |

### ReturnValue

كائن تدفق أو **nullptr** إذا تم تحديد نوع غير التدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
