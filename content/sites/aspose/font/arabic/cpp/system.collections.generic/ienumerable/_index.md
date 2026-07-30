---
title: "فئة System::Collections::Generic::IEnumerable"
linktitle: "IEnumerable"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::IEnumerable. واجهة كائن توفر مكرّرًا للعناصر المحتواة في C++."
type: docs
weight: 2200
url: /ar/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


واجهة كائن يوفر مُعددًا على العناصر المحتواة.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [begin](./begin/)() | يحصل على مكرّر يشير إلى العنصر الأول (إن وجد) في المجموعة. لا يمكن استخدام هذا المكرّر لتغيير الكائن المشار إليه لأن [GetEnumerator()](./getenumerator/) تُعيد نسخة من الكائن T. |
| [begin](./begin/)() const | يحصل على مكرّر يشير إلى العنصر الأول (إن وجد) في النسخة المؤهلة بـ const من المجموعة. |
| [cbegin](./cbegin/)() const | يحصل على مكرّر يشير إلى العنصر الأول المؤهل بـ const (إن وجد) في المجموعة. |
| [cend](./cend/)() const | يحصل على مكرّر يشير مباشرةً بعد العنصر الأخير المؤهل بـ const (إن وجد) في المجموعة. |
| [end](./end/)() | يحصل على مكرّر يشير مباشرةً بعد العنصر الأخير (إن وجد) في المجموعة. لا يمكن استخدام هذا المكرّر لتغيير الكائن المشار إليه لأن [GetEnumerator()](./getenumerator/) تُعيد نسخة من الكائن T. |
| [end](./end/)() const | يحصل على مكرّر يشير مباشرةً بعد العنصر الأخير (إن وجد) في النسخة المؤهلة بـ const من المجموعة. |
| virtual [GetEnumerator](./getenumerator/)() | يحصل على المُعدِّد. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | يطبق دالة تراكم على تسلسل. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | يحدد ما إذا كانت جميع عناصر التسلسل تفي بشرط. |
| [LINQ_Any](./linq_any/)() | يحدد ما إذا كان التسلسل يحتوي على أي عناصر. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | يحدد ما إذا كان هناك أي عنصر في التسلسل موجود أو يفي بشرط. |
| [LINQ_Cast](./linq_cast/)() | يحوّل العناصر إلى النوع المحدد. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | يجمع سلسلتين. |
| [LINQ_Contains](./linq_contains/)(T) | يحدد ما إذا كان التسلسل يحتوي على قيمة محددة. |
| [LINQ_Count](./linq_count/)() | يعيد عدد العناصر في التسلسل (محسوبًا عبر العد المباشر). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | يعيد عدد العناصر في التسلسل التي تفي بالشرط المحدد. |
| [LINQ_ElementAt](./linq_elementat/)(int) | يعيد العنصر عند الفهرس المحدد في التسلسل. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | يعيد العنصر عند الفهرس المحدد في التسلسل. |
| [LINQ_First](./linq_first/)() | يعيد العنصر الأول في التسلسل. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | يعيد العنصر الأول في التسلسل الذي يفي بالشرط المحدد. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | يعيد العنصر الأول في التسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | يعيد العنصر الأول في التسلسل الذي يفي بشرط أو قيمة افتراضية إذا لم يُعثر على مثل هذا العنصر. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | يجمع عناصر التسلسل في مجموعات. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | يجمع عناصر التسلسل في مجموعات. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | يعيد العنصر الأخير في التسلسل. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | يعيد العنصر الأخير في التسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | ينفّذ دالة تحويل على كل عنصر من تسلسل عام ويعيد القيمة القصوى الناتجة. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | ينفّذ دالة تحويل على كل عنصر من تسلسل عام ويعيد القيمة الدنيا الناتجة. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | يفلتر عناصر التسلسل بناءً على النوع المحدد. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | يرتب عناصر التسلسل بترتيب تصاعدي وفقًا لقيم المفاتيح التي يختارها keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | يرتب عناصر التسلسل بترتيب تنازلي وفقًا لقيم المفاتيح التي يختارها keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | يعكس ترتيب عناصر التسلسل. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | يحوّل عناصر التسلسل. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | يحوّل كل عنصر من التسلسل إلى شكل جديد باستخدام فهرس العنصر. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | يُسقط كل عنصر من التسلسل ويجمع التسلسلات الناتجة في تسلسل واحد. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | يعيد عددًا محددًا من العناصر المتتالية من بداية التسلسل. |
| [LINQ_ToArray](./linq_toarray/)() | ينشئ مصفوفة من تسلسل. |
| [LINQ_ToList](./linq_tolist/)() | ينشئ [List<T>](../list/) من تسلسل. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | يفلتر تسلسلًا بناءً على الشرط المحدد. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [IEnumeratorType](./ienumeratortype/) | معلومات RTTI. |
| [iterator](./iterator/) | نوع المكرر. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | نوع القاعدة للمكرّر الداخلي. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | نوع العنصر للمكرّر الداخلي. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
