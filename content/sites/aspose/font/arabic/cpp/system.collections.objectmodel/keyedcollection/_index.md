---
title: "System::Collections::ObjectModel::KeyedCollection فئة"
linktitle: "KeyedCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::ObjectModel::KeyedCollection فئة. مجموعة تجريدية من العناصر ذات المفاتيح المدمجة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


مجموعة تجريدية من العناصر ذات المفاتيح المدمجة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TItem | نوع القيمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const TItem\&) override | أضف العنصر إلى نهاية الحاوية. |
| [Contains](./contains/)(TKey) | يتحقق مما إذا كان المفتاح موجوداً في الحاوية. |
| [get_Comparer](./get_comparer/)() | يحصل على المقارن. |
| [idx_get](./idx_get/)(TKey) | يحصل على العنصر عند الفهرس المحدد. |
| [Remove](./remove/)(TKey) | يزيل المفتاح من الحاوية. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | يجعل معامل القالب المحدد يُعامل كمؤشر ضعيف بدلاً من مؤشر مشترك (إن كان ذلك مناسباً). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | حد عتبة إنشاء قاموس البحث، الافتراضي. |

## انظر أيضًا

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
