---
title: "System::Net::WebRequest::HttpRequestCreator فئة"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Page لـ C++"
description: "System::Net::WebRequest::HttpRequestCreator فئة. ينشئ كائنات WebRequest-class. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3900
url: /ar/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


ينشئ كائنات WebRequest-class. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | ينشئ مثالًا جديدًا من WebRequest-class باستخدام عنوان URI المحدد. |
## انظر أيضًا

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
