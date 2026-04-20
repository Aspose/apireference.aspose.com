---
title: "System::Collections::Generic::IDictionary class"
linktitle: "IDictionary"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::IDictionary class. واجهة للحاويات الشبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.collections.generic/idictionary/
---
## IDictionary class


واجهة لحاويات شبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | يضيف زوج المفتاح-القيمة إلى الحاوية. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | يتحقق مما إذا كانت الحاوية تحتوي على المفتاح. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | ينسخ محتويات القاموس إلى عناصر المصفوفة الموجودة. |
| virtual [get_Count](./get_count/)() const | يكشف عن الدالة العضو get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | يتحقق مما إذا كان حجم المجموعة ثابتًا. |
| [get_IsSynchronized](./get_issynchronized/)() const | يتحقق مما إذا كانت الحاوية آمنة للخطوط المتعددة. |
| virtual [get_Keys](./get_keys/)() const | يصل إلى مجموعة المفاتيح. |
| virtual [get_Values](./get_values/)() const | يصل إلى مجموعة القيم. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | يرجع القيمة إذا وجدت؛ أو **Value()** غير ذلك. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | يرجع القيمة إذا وجدت؛ أو **defaultValue** غير ذلك. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | يرجع القيمة إذا وجدت؛ أو **null** غير ذلك، وهذا منطقي فقط للأنواع المرجعية. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | دالة جلب. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | دالة ضبط. |
| virtual [Remove](./remove/)(const TKey\&) | يزيل المفتاح من الحاوية. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | يبحث عن القيمة ويسترجعها إذا وجدت. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | معلومات RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | نوع زوج المفتاح والقيمة. |

## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
