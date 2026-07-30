---
title: "طريقة System::Xml::XmlSecureResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlSecureResolver::GetEntity. تقوم بربط URI بكائن يحتوي على المورد الفعلي في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


يربط معرف URI بكائن يحتوي على المورد الفعلي.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | عنوان URI الذي يتم إرجاعه من استدعاء [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| دور | String | غير مستخدم حالياً. |
| ofObjectToReturn | const TypeInfo\& | نوع الكائن المراد إرجاعه. النسخة الحالية تُعيد فقط كائنات Stream. |

### ReturnValue

الدفق الذي يتم إرجاعه عند استدعاء **GetEntity** على [XmlResolver](../../xmlresolver/) الأساسي. إذا تم تحديد نوع غير Stream، فإن الطريقة تُعيد **nullptr**.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
