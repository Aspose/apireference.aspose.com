---
title: "System::Net::Http::Headers::ObjectCollection فئة"
linktitle: "ObjectCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::ObjectCollection فئة. تمثل مجموعة الكائنات في C++."
type: docs
weight: 1600
url: /ar/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


يمثل مجموعة الكائنات.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | معلومات RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | ينشئ نسخة جديدة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |

## انظر أيضًا

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
