---
title: "System::Collections::Generic::SortedDictionary فئة"
linktitle: "SortedDictionary"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::SortedDictionary فئة. إعلان مسبق لنوع القاموس المرتب في C++."
type: docs
weight: 4000
url: /ar/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


إعلان مسبق لنوع القاموس المرتب.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | يحصل على الـ[IComparer<TKey>](../icomparer/) المستخدم لترتيب عناصر الـSortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | دالة وصول المفرد. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد للتنقل عبر القاموس الحالي. |
| [rbegin](./rbegin/)() | يحصل على مكرر عكسي للعنصر الأخير في المجموعة (الأول في الاتجاه العكسي). |
| [rbegin](./rbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير في المجموعة المؤهلة كـ const (الأول في الاتجاه العكسي). |
| [rend](./rend/)() | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة. |
| [rend](./rend/)() const | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة المؤهلة كـ const. |
| [SortedDictionary](./sorteddictionary/)() | ينشئ قاموسًا فارغًا. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | ينشئ قاموسًا فارغًا. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | منشئ النسخ. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | منشئ النسخ. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرر العكسي الثابت. |
| [IEnumerablePtr](./ienumerableptr/) | مجموعة من العناصر المتطابقة. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) نوع. |
| [iterator](./iterator/) | نوع المكرر. |
| [KeyCollection](./keycollection/) | نوع مجموعة المفاتيح. |
| [KVPair](./kvpair/) | نوع زوج المفتاح والقيمة. |
| [map_t](./map_t/) | نوع البيانات الأساسي. |
| [Ptr](./ptr/) | نوع المؤشر. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
| [this_t](./this_t/) | النوع الذاتي. |
| [ValueCollection](./valuecollection/) | نوع مجموعة القيم. |
## ملاحظات


فئة القاموس المرتب التي تغلف خريطة STL. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
