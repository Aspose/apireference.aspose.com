---
title: "System::Net::EndPoint فئة"
linktitle: "EndPoint"
second_title: "Aspose.Page لـ C++"
description: "System::Net::EndPoint فئة. الفئة المجردة تحتوي على عنوان شبكة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.net/endpoint/
---
## EndPoint class


الفئة المجردة تحتوي على عنوان شبكة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EndPoint : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | أنشئ مثالًا جديدًا للفئة [EndPoint](./) باستخدام عنوان المقبس المحدد. |
| virtual [get_AddressFamily](./get_addressfamily/)() | معلومات RTTI. |
| virtual [GetImpl](./getimpl/)() const | يعيد مؤشرًا إلى التنفيذ. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ImplPtr](./implptr/) | مؤشر إلى التنفيذ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
