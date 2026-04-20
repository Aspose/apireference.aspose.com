---
title: "فئة System::Net::Http::Headers::ObjectCollection"
linktitle: "ObjectCollection"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::Headers::ObjectCollection. تمثل مجموعة الكائنات في C++."
type: docs
weight: 1600
url: /ar/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


يمثل مجموعة الكائنات.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | معلومات RTTI. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | ينشئ نسخة جديدة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | عيّن معامل القالب الـ n'th إلى مؤشر ضعيف (بدلاً من المشترك). يسمح بتبديل المؤشرات في الحاويات إلى الوضع الضعيف. |

## انظر أيضًا

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
