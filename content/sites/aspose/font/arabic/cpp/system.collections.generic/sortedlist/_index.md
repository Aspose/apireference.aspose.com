---
title: "فئة System::Collections::Generic::SortedList"
linktitle: "SortedList"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::SortedList. قائمة مرتبة تغلف بنية FlatMap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 4200
url: /ar/cpp/system.collections.generic/sortedlist/
---
## SortedList class


قائمة مرتبة تغلف بنية FlatMap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [crbegin](./crbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير المؤهل كـ const في المجموعة (الأول في الاتجاه العكسي). |
| [crend](./crend/)() const | يحصل على مكرر عكسي لعنصر غير موجود مؤهل كـ const قبل بداية المجموعة. |
| [get_Capacity](./get_capacity/)() const | يحصل على سعة القائمة الحالية. |
| virtual [get_Keys](./get_keys/)() const | يصل إلى مجموعة المفاتيح. |
| virtual [get_Values](./get_values/)() const | يصل إلى مجموعة القيم. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المكرّر الذي يتنقل عبر القائمة الحالية. |
| [IndexOfKey](./indexofkey/)(TKey) const | يبحث عن المفتاح المحدد. |
| [IndexOfValue](./indexofvalue/)(TValue) const | يبحث عن القيمة المحددة. |
| [rbegin](./rbegin/)() | يحصل على مكرر عكسي للعنصر الأخير في المجموعة (الأول في الاتجاه العكسي). |
| [rbegin](./rbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير في المجموعة المؤهلة كـ const (الأول في الاتجاه العكسي). |
| [RemoveAt](./removeat/)(int) | يزيل العنصر في الموضع المحدد. |
| [rend](./rend/)() | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة. |
| [rend](./rend/)() const | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة المؤهلة كـ const. |
| [set_Capacity](./set_capacity/)(int) | يضبط سعة القائمة الحالية. |
| [SortedList](./sortedlist/)() | ينشئ قائمة فارغة. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | ينشئ قائمة فارغة. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | منشئ النسخ. |
| [SortedList](./sortedlist/)(const map_t\&) | منشئ النسخ. |
| [SortedList](./sortedlist/)(int) | ينشئ قائمة فارغة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرر العكسي الثابت. |
| [IEnumerablePtr](./ienumerableptr/) | مجموعة من نفس نوع الأزواج. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) نوع. |
| [iterator](./iterator/) | نوع المكرر. |
| [KeyCollection](./keycollection/) | نوع مجموعة المفاتيح. |
| [KVPair](./kvpair/) | نوع زوج المفتاح والقيمة. |
| [map_t](./map_t/) | نوع البيانات الأساسي. |
| [Ptr](./ptr/) | نوع المؤشر. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
| [this_t](./this_t/) | هذا النوع. |
| [ValueCollection](./valuecollection/) | نوع مجموعة القيم. |

## انظر أيضًا

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
