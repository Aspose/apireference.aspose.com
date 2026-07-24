---
title: "فئة System::Collections::Generic::IEnumerable"
linktitle: "IEnumerable"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::IEnumerable. واجهة الكائن التي توفر مُعدِّدًا على العناصر المحتواة في C++."
type: docs
weight: 2200
url: /ar/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


واجهة كائن يوفر مُعدِّدًا على العناصر المحتواة.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [begin](./begin/)() | يحصل على المُؤشِّر الذي يشير إلى العنصر الأول (إن وجد) في المجموعة. لا يمكن استخدام هذا المُؤشِّر لتغيير الكائن المشار إليه لأن [GetEnumerator()](./getenumerator/) تُعيد نسخة من الكائن من النوع T. |
| [begin](./begin/)() const | يحصل على المؤشر الذي يشير إلى العنصر الأول (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| [cbegin](./cbegin/)() const | يحصل على المؤشر الذي يشير إلى العنصر الأول المؤهل بالثابت (إن وجد) في المجموعة. |
| [cend](./cend/)() const | يحصل على المؤشر الذي يشير مباشرة بعد العنصر الأخير المؤهل بالثابت (إن وجد) في المجموعة. |
| [end](./end/)() | يحصل على المُؤشِّر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في المجموعة. لا يمكن استخدام هذا المُؤشِّر لتغيير الكائن المشار إليه لأن [GetEnumerator()](./getenumerator/) تُعيد نسخة من الكائن من النوع T. |
| [end](./end/)() const | يحصل على المؤشر الذي يشير مباشرةً بعد العنصر الأخير (إن وجد) في النسخة المؤهلة بالثابت من المجموعة. |
| virtual [GetEnumerator](./getenumerator/)() | يحصل على المُعدِّد. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | يطبق دالة تراكم على تسلسل. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | يحدد ما إذا كانت جميع عناصر التسلسل تلبي شرطًا. |
| [LINQ_Any](./linq_any/)() | يحدد ما إذا كان التسلسل يحتوي على أي عناصر. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | يحدد ما إذا كان هناك أي عنصر في التسلسل موجود أو يلبي شرطًا. |
| [LINQ_Cast](./linq_cast/)() | يحوّل العناصر إلى النوع المحدد. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | يجمع تسلسلين. |
| [LINQ_Contains](./linq_contains/)(T) | يحدد ما إذا كان التسلسل يحتوي على قيمة محددة. |
| [LINQ_Count](./linq_count/)() | يعيد عدد العناصر في التسلسل (محسوبًا عبر العد المباشر). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | يعيد عدد العناصر في التسلسل التي تلبي الشرط المحدد. |
| [LINQ_ElementAt](./linq_elementat/)(int) | يعيد العنصر عند فهرس محدد في التسلسل. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | يعيد العنصر عند فهرس محدد في التسلسل. |
| [LINQ_First](./linq_first/)() | يعيد العنصر الأول في التسلسل. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | يعيد العنصر الأول في التسلسل الذي يلبي الشرط المحدد. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | يعيد العنصر الأول في التسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | يعيد العنصر الأول في التسلسل الذي يلبي شرطًا أو قيمة افتراضية إذا لم يُعثر على مثل هذا العنصر. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | يجمع عناصر التسلسل في مجموعات. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | يعيد العنصر الأخير في التسلسل. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | يعيد العنصر الأخير في تسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | يستدعي دالة تحويل على كل عنصر في تسلسل عام ويعيد القيمة القصوى الناتجة. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | يستدعي دالة تحويل على كل عنصر في تسلسل عام ويعيد القيمة الدنيا الناتجة. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | يفلتر عناصر التسلسل بناءً على النوع المحدد. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | يرتب عناصر التسلسل تصاعديًا وفقًا لقيم المفاتيح التي يختارها keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | يرتب عناصر التسلسل تنازليًا وفقًا لقيم المفاتيح التي يختارها keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | يعكس ترتيب العناصر في تسلسل. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | يحوّل عناصر تسلسل. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | يحوّل كل عنصر في تسلسل إلى شكل جديد من خلال دمج فهرس العنصر. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | يُسقط كل عنصر في تسلسل ويجمع التسلسلات الناتجة في تسلسل واحد. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | يعيد عددًا محددًا من العناصر المتتالية من بداية تسلسل. |
| [LINQ_ToArray](./linq_toarray/)() | ينشئ مصفوفة من تسلسل. |
| [LINQ_ToList](./linq_tolist/)() | ينشئ [List<T>](../list/) من تسلسل. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | يفلتر تسلسل بناءً على الشرط المحدد. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | يسترجع تنفيذ begin const iterator للحاوية الحالية. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | يسترجع تنفيذ begin iterator للحاوية الحالية. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | يسترجع تنفيذ end const iterator للحاوية الحالية. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | يسترجع تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرّر الثابت. |
| [IEnumeratorType](./ienumeratortype/) | معلومات RTTI. |
| [iterator](./iterator/) | نوع المكرّر. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | نوع القاعدة للمكرّر الداخلي. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | نوع عنصر المكرّر الداخلي. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
