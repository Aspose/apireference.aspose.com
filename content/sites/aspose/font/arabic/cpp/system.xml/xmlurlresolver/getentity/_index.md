---
title: "طريقة System::Xml::XmlUrlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XmlUrlResolver::GetEntity. تُطابق URI مع كائن يحتوي على المورد الفعلي في C++."
type: docs
weight: 200
url: /ar/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


يربط معرف URI بكائن يحتوي على المورد الفعلي.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI الذي تم إرجاعه من استدعاء [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| دور | String | غير مستخدم حالياً. |
| ofObjectToReturn | const TypeInfo\& | نوع الكائن المراد إرجاعه. التنفيذ الحالي يُعيد فقط كائنات Stream. |

### ReturnValue

كائن تدفق أو **nullptr** إذا تم تحديد نوع غير التدفق.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
