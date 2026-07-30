---
title: "طريقة System::Xml::XmlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlResolver::GetEntity. عندما يتم تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


عند تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | عنوان URI الذي تم إرجاعه من استدعاء [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| دور | String | غير مستخدم حالياً. |
| ofObjectToReturn | const TypeInfo\& | نوع الكائن المراد إرجاعه. النسخة الحالية تُعيد فقط كائنات Stream. |

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
* Library [Aspose.Font for C++](../../../)
