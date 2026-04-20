---
title: "فئة System::Xml::XmlResolver"
linktitle: "XmlResolver"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::XmlResolver. تحل الموارد الخارجية للـ XML التي يُشار إليها بواسطة معرف الموارد الموحد (URI) في C++."
type: docs
weight: 3500
url: /ar/cpp/system.xml/xmlresolver/
---
## XmlResolver class


يحلّ الموارد الخارجية لـ XML التي تم تسميتها بواسطة معرف الموارد الموحد (URI).

```cpp
class XmlResolver : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | عند تجاوزها في فئة مشتقة، تقوم بربط URI بكائن يحتوي على المورد الفعلي. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | عند تجاوزها في فئة مشتقة، تحل الـ URI المطلق من الـ URI الأساسي والنسبي. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | عند تجاوزها في فئة مشتقة، تعيين بيانات الاعتماد المستخدمة لمصادقة طلبات الويب. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | يُمكّن المحلّل من إرجاع أنواع غير الـ Stream. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
