---
title: "System::Collections::Generic::BaseDictionary فئة"
linktitle: "BaseDictionary"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::BaseDictionary. تنفّذ كودًا شائعًا لهياكل بيانات شبيهة بالقواميس (مثل Dictionary, SortedDictionary). لا ينبغي استخدامها مباشرةً، إلا في الوراثة عند تعريف الحاويات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة بمؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


تنفّذ كودًا شائعًا لهياكل بيانات شبيهة بالقواميس (مثل [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). لا ينبغي استخدامها مباشرةً، إلا في الوراثة عند تعريف الحاويات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة بمؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| معامل | الوصف |
| --- | --- |
| Map | نوع الخريطة الأساسي. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | خاص بـ C++. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | يضيف زوج المفتاح-القيمة إلى القاموس. |
| [BaseDictionary](./basedictionary/)() | ينشئ بنية بيانات فارغة. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | منشئ توجيه لتمرير الوسائط إلى منشئ الخريطة الأساسي. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | منشئ النسخ. |
| [BaseDictionary](./basedictionary/)(BaseType *) | منشئ النسخ. |
| [begin](./begin/)() const | يعيد مُكرِّرًا إلى غلاف KVPair لعنصر المفتاح-القيمة في الحاوية. تم تنفيذها بأسلوب C# - يجب أن يُعيد المُكرِّر كائن KVPair مع واجهة get_Key() و get_Value(). إذا كانت الحاوية فارغة، سيكون المُكرِّر المُعاد مساويًا لـ [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | يعيد مُكرِّرًا إلى العنصر الأول في الحاوية. تم تنفيذها بأسلوب STL. إذا كانت الحاوية فارغة، سيكون المُكرِّر المُعاد مساويًا لـ [end()](../ienumerable/end/). |
| [cend](./cend/)() const | يعيد مُكرِّرًا إلى العنصر الذي يلي العنصر الأخير في الحاوية. تم تنفيذها بأسلوب STL. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [ContainsKey](./containskey/)(const key_t\&) const override | يتحقق مما إذا كان المفتاح موجودًا في القاموس. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | يتحقق مما إذا كانت القيمة موجودة في القاموس. يستخدم العامل == لمقارنة القيم. |
| [data](./data/)() | الوصول إلى مخزن البيانات الأساسي. |
| [data](./data/)() const | الوصول إلى مخزن البيانات الأساسي. |
| [end](./end/)() const | يعيد مُكرِّرًا إلى غلاف KVPair لعنصر المفتاح-القيمة الذي يلي العنصر الأخير في الحاوية. تم تنفيذها بأسلوب C# - يجب أن يُعيد المُكرِّر كائن KVPair مع واجهة get_Key() و get_Value(). هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر. |
| virtual [GetEnumerator](./getenumerator/)() | ينشئ مثيلًا للعداد، يجب أن يتم تنفيذه بواسطة الفئة الفرعية. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | يرجع القيمة إذا وجدت؛ أو **Value()** غير ذلك. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | يرجع القيمة إذا وجدت؛ أو **defaultValue** غير ذلك. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | يعيد القيمة إذا وُجدت؛ أو **null** خلاف ذلك. يكون ذلك منطقيًا فقط للأنواع المرجعية. |
| [idx_get](./idx_get/)(const key_t\&) const override | دالة الحصول بالمفتاح. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | دالة الضبط بالمفتاح. تعدل أو تنشئ العنصر. |
| virtual [operator[]](./operator[]/)(const key_t\&) | دالة وصول. |
| [Remove](./remove/)(const key_t\&) override | يزيل المفتاح المحدد من القاموس. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | يبحث عن القيمة بالمفتاح ويسترجعها إذا وُجدت. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [iterator](./iterator/) | نوع المكرر. |
| [KeyCollection](./keycollection/) | تأكد من أننا نستخدم المخصِّص الصحيح مع نوع التخزين الأساسي. |
| [KVPair](./kvpair/) | نوع زوج المفتاح والقيمة. |
| [map_t](./map_t/) | نوع الخريطة الداخلي. |
| [ValueCollection](./valuecollection/) | مجموعة من القيم. |

## انظر أيضًا

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
