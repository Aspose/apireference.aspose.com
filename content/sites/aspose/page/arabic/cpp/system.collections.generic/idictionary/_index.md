---
title: "فئة System::Collections::Generic::IDictionary"
linktitle: "IDictionary"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::IDictionary. واجهة لحاويات شبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.collections.generic/idictionary/
---
## IDictionary class


واجهة لحاويات شبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parameter | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | يضيف زوج المفتاح‑القيمة إلى الحاوية. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | يتحقق مما إذا كانت الحاوية تحتوي على المفتاح. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | ينسخ محتويات القاموس إلى عناصر المصفوفة الموجودة. |
| virtual [get_Count](./get_count/)() const | يكشف عن الدالة العضو get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | يتحقق مما إذا كان حجم المجموعة ثابتًا. |
| [get_IsSynchronized](./get_issynchronized/)() const | يتحقق مما إذا كانت الحاوية آمنة للخطوط المتعددة. |
| virtual [get_Keys](./get_keys/)() const | الوصول إلى مجموعة المفاتيح. |
| virtual [get_Values](./get_values/)() const | الوصول إلى مجموعة القيم. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | يرجع القيمة إذا وُجدت؛ أو **Value()** خلاف ذلك. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | يرجع القيمة إذا وُجدت؛ أو **defaultValue** خلاف ذلك. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | يرجع القيمة إذا تم العثور عليها؛ أو **null** خلاف ذلك، ويكون منطقيًا فقط لأنواع المراجع. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | دالة جلب. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | دالة ضبط. |
| virtual [Remove](./remove/)(const TKey\&) | يزيل المفتاح من الحاوية. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | يبحث عن القيمة ويسترجعها إذا تم العثور عليها. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | معلومات RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | نوع زوج المفتاح والقيمة. |

## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
