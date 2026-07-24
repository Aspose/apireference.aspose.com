---
title: "فئة System::Xml::XmlResolver"
linktitle: "XmlResolver"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlResolver. تقوم بحل الموارد الخارجية للـ XML التي يتم تسميتها بواسطة معرف الموارد الموحد (URI) في C++."
type: docs
weight: 3500
url: /ar/cpp/system.xml/xmlresolver/
---
## XmlResolver class


يحل الموارد الخارجية لـ XML المسماة بواسطة معرف الموارد الموحد (URI).

```cpp
class XmlResolver : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | عند تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | عند تجاوزها في فئة مشتقة، تقوم بحل الـ URI المطلق من الـ URI الأساسي والنسبي. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | عند تجاوزها في فئة مشتقة، تقوم بتعيين بيانات الاعتماد المستخدمة لمصادقة طلبات الويب. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | تمكن المحلل من إرجاع أنواع غير Stream. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
