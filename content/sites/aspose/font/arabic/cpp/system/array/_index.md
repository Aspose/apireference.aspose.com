---
title: "فئة System::Array"
linktitle: "المصفوفة"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Array. فئة تمثل بنية بيانات المصفوفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالتي System::MakeArray() و System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system/array/
---
## Array class


فئة تمثل بنية بيانات المصفوفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالتي [System::MakeArray()](../makearray/) و[System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع عناصر المصفوفة |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const T\&) override | غير مدعوم لأن المصفوفة التي يمثلها الكائن الحالي للقراءة فقط. |
| [Array](./array/)() | ينشئ مصفوفة فارغة. |
| [Array](./array/)(int, const T\&) | منشئ تعبئة. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | منشئ تعبئة. |
| [Array](./array/)(int, const T) | منشئ تعبئة. |
| [Array](./array/)(vector_t\&&) | منشئ نقل. |
| [Array](./array/)(const vector_t\&) | منشئ النسخ. |
| [Array](./array/)(const std::vector\<Q\>\&) | ينشئ كائن [Array](./) ويملأه بالقيم المنسوخة من كائن std::vector الذي يكون نوع قيمه هو نفسه **T** لكنه مختلف عن **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | ينشئ كائن [Array](./) ويملأه بالقيم المنقولة من كائن std::vector الذي يكون نوع قيمه هو نفسه **T** لكنه مختلف عن **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | ينشئ كائن [Array](./) ويملأه بالقيم من قائمة التهيئة المحددة التي تحتوي على عناصر من نوع **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | ينشئ كائن [Array](./) ويملأه بالقيم من المصفوفة المحددة التي تحتوي على عناصر من نوع **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | ينشئ كائن [Array](./) ويملأه بالقيم من قائمة التهيئة المحددة التي تحتوي على عناصر من نوع bool. |
| [begin](./begin/)() | يعيد مُكرِّر إلى العنصر الأول في الحاوية. إذا كانت الحاوية فارغة، سيكون المُكرِّر المعاد مساوياً لـ [end()](./end/). |
| [begin](./begin/)() const | يعيد مُكرِّر إلى العنصر الأول في الحاوية المؤهلة بالثابت. إذا كانت الحاوية فارغة، سيكون المُكرِّر المعاد مساوياً لـ [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | ينفّذ بحثًا ثنائيًا في المصفوفة المرتبة. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | غير مُنفّذ. |
| [cbegin](./cbegin/)() const | يعيد مُكرِّر إلى العنصر الأول المؤهل بالثابت في الحاوية. إذا كانت الحاوية فارغة، سيكون المُكرِّر المعاد مساوياً لـ [cend()](./cend/). |
| [cend](./cend/)() const | يعيد مُكرِّر إلى العنصر الذي يلي العنصر الأخير في الحاوية. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [Clear](./clear/)() override | غير مدعوم لأن المصفوفة التي يمثلها الكائن الحالي للقراءة فقط. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | يستبدل القيم **count** بدءًا من الفهرس **startIndex** في المصفوفة المحددة بالقيم الافتراضية. |
| [Clone](./clone/)() | ينسخ المصفوفة. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | ينسخ نطاقًا من العناصر من [System.Array](./) بدءًا من المصدر المحدد. |
| [Contains](./contains/)(const T\&) const override | يحدد ما إذا كان العنصر المحدد موجودًا في المصفوفة. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | ينشئ كائنًا جديدًا من نوع [Array](./) ويملأه بعناصر المصفوفة المحددة المحوّلة إلى النوع **OutputType** باستخدام المفوض المحدد للتحويل. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | ينشئ كائنًا جديدًا من نوع [Array](./) ويملأه بعناصر المصفوفة المحددة المحوّلة إلى النوع **OutputType** باستخدام كائن الدالة المحدد للمحول. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | ينسخ العدد المحدد من العناصر من عرض مصفوفة المصدر إلى مصفوفة الوجهة. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى عرض مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | ينسخ العدد المحدد من العناصر من عرض مصفوفة المصدر إلى عرض مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | ينسخ العدد المحدد من العناصر من مصفوفة المصدر على المكدس إلى مصفوفة الوجهة. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى مصفوفة الوجهة على المكدس. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | ينسخ العدد المحدد من العناصر من مصفوفة المصدر على المكدس إلى مصفوفة الوجهة على المكدس. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في عرض مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في عرض مصفوفة الوجهة. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من مصفوفة المصدر على المكدس بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من مصفوفة المصدر على المكدس بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ينسخ جميع عناصر المصفوفة الحالية إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | ينسخ جميع عناصر المصفوفة الحالية إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | ينسخ جميع عناصر المصفوفة الحالية إلى عرض مصفوفة الوجهة المحدد. تُدرج العناصر في عرض مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | ينسخ عددًا محددًا من العناصر من المصفوفة الحالية بدءًا من الموضع المحدد إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | ينسخ عددًا محددًا من العناصر من المصفوفة الحالية بدءًا من الموضع المحدد إلى عرض مصفوفة الوجهة المحدد. يتم إدراج العناصر في عرض مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex. |
| [Count](./count/)() const | يرجع عددًا يمثل إجمالي عدد جميع العناصر في جميع أبعاد المصفوفة. |
| [crbegin](./crbegin/)() const | يعيد مُكرِّر عكسي إلى العنصر الأول في الحاوية المعكوسة. وهو يطابق العنصر الأخير في الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، يكون المُكرِّر المعاد مساوياً لـ [crend()](./crend/). |
| [crend](./crend/)() const | يعيد مُكرِّر عكسي إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يطابق العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [data](./data/)() | يرجع مرجعًا إلى بنية البيانات الداخلية المستخدمة لتخزين عناصر المصفوفة. |
| [data](./data/)() const | يرجع مرجعًا ثابتًا إلى بنية البيانات الداخلية المستخدمة لتخزين عناصر المصفوفة. |
| [data_ptr](./data_ptr/)() | يرجع مؤشرًا خامًا إلى بداية مخزن الذاكرة حيث تُخزن عناصر المصفوفة. |
| [data_ptr](./data_ptr/)() const | يرجع مؤشرًا خامًا ثابتًا إلى بداية مخزن الذاكرة حيث تُخزن عناصر المصفوفة. |
| [end](./end/)() | يعيد مُكرِّر إلى العنصر الذي يلي العنصر الأخير في الحاوية. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [end](./end/)() const | يعيد مُكرِّر إلى العنصر الذي يلي العنصر الأخير في الحاوية المؤهلة بالثابت. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | يحدد ما إذا كان كائن [Array](./) المحدد يحتوي على عنصر يفي بمتطلبات الدالة الشرطية المحددة. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | يبحث عن أول عنصر في المصفوفة المحددة يفي بشروط الدالة الشرطية المحددة. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | يسترجع جميع العناصر التي تطابق الشروط المحددة بواسطة الدالة الشرطية المحددة. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | يبحث عن أول عنصر في المصفوفة المحددة يفي بشروط الدالة الشرطية المحددة. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | ينفّذ الإجراء المحدد على كل عنصر من المصفوفة المحددة. |
| [get_Count](./get_count/)() const override | يرجع حجم المصفوفة. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يشير إلى ما إذا كانت المصفوفة للقراءة فقط. |
| [get_Length](./get_length/)() const | يرجع عددًا صحيحًا 32-بت يمثل إجمالي عدد جميع العناصر في جميع أبعاد المصفوفة. |
| [get_LongLength](./get_longlength/)() const | يرجع عددًا صحيحًا 64-بت يمثل إجمالي عدد جميع العناصر في جميع أبعاد المصفوفة. |
| [get_Rank](./get_rank/)() const | غير مُنفّذ. |
| [GetEnumerator](./getenumerator/)() override | يرجع مؤشرًا إلى كائن [Enumerator](./enumerator/) الذي يوفر واجهة IEnumerator لعناصر المصفوفة التي يمثلها الكائن الحالي. |
| [GetLength](./getlength/)(int) | يرجع عدد العناصر في البُعد المحدد. |
| [GetLongLength](./getlonglength/)(int) | يرجع عدد العناصر في البُعد المحدد كعدد صحيح 64-بت. |
| [GetLowerBound](./getlowerbound/)(int) const | يرجع الحد الأدنى للبُعد المحدد. |
| [GetSizeTLength](./getsizetlength/)() const | يرجع متغيّر std::size_t يمثل إجمالي عدد جميع العناصر في جميع أبعاد المصفوفة. |
| [GetUpperBound](./getupperbound/)(int) | يرجع الحد الأعلى للبُعد المحدد. |
| [idx_get](./idx_get/)(int) const override | يرجع العنصر عند الفهرس المحدد. |
| [idx_set](./idx_set/)(int, T) override | يضبط القيمة المحددة كعنصر للمصفوفة عند الفهرس المحدد. |
| [IndexOf](./indexof/)(const T\&) const override | يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | يحدد فهرس أول ظهور للعنصر المحدد في المصفوفة بدءًا من الفهرس المحدد. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | يحدد فهرس أول ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحددة بواسطة فهرس البداية وعدد العناصر في النطاق. |
| [Init](./init/)(const T) | يملأ المصفوفة التي يمثلها الكائن الحالي بالقيم من المصفوفة المحددة. |
| [Initialize](./initialize/)() | يملأ المصفوفة بالكائنات المُنشأة افتراضيًا من النوع **T**. |
| [Insert](./insert/)(int, const T\&) override | غير مدعوم لأن المصفوفة التي يمثلها الكائن الحالي للقراءة فقط. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | يحدد فهرس آخر ظهور للعنصر المحدد في نطاق من عناصر المصفوفة المحددة بواسطة فهرس البداية وعدد العناصر في النطاق. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة بدءًا من الفهرس المحدد. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | يحدد فهرس آخر ظهور للعنصر المحدد في المصفوفة. |
| [Max](./max/)() const | يجد العنصر الأكبر في المصفوفة باستخدام [operator<()](../operator_/) لمقارنة العناصر. |
| [Min](./min/)() const | يجد العنصر الأصغر في المصفوفة باستخدام [operator<()](../operator_/) لمقارنة العناصر. |
| [operator[]](./operator[]/)(int) | يرجع عنصرًا عند الفهرس المحدد. |
| [operator[]](./operator[]/)(int) const | يرجع عنصرًا عند الفهرس المحدد. |
| [rbegin](./rbegin/)() | يرجع مكرراً عكسياً إلى العنصر الأول في الحاوية المعكوسة. وهو يتطابق مع العنصر الأخير في الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، فإن المكرر المعاد يساوي [rend()](./rend/). |
| [rbegin](./rbegin/)() const | يرجع مكرراً عكسياً إلى العنصر الأول في الحاوية المعكوسة. وهو يتطابق مع العنصر الأخير في الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، فإن المكرر المعاد يساوي [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | غير مدعوم لأن المصفوفة التي يمثلها الكائن الحالي للقراءة فقط. |
| [RemoveAt](./removeat/)(int) override | غير مدعوم لأن المصفوفة التي يمثلها الكائن الحالي للقراءة فقط. |
| [rend](./rend/)() | يعيد مُكرِّر عكسي إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يطابق العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [rend](./rend/)() const | يعيد مُكرِّر عكسي إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يطابق العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | يغيّر حجم المصفوفة المحددة إلى القيمة المحددة أو ينشئ مصفوفة جديدة بالحجم المحدد. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | يعكس العناصر في المصفوفة المحددة. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | يعكس نطاقًا من العناصر في المصفوفة المحددة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | يجعل المصفوفة تتعامل مع المؤشرات المخزنة كضعيفة (إن كان ذلك ممكنًا). |
| [SetValue](./setvalue/)(const T\&, int) | يضبط قيمة العنصر عند الفهرس المحدد. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | يرتب العناصر في المصفوفة المحددة باستخدام المقارن الافتراضي. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | يرتب نطاقًا من العناصر في المصفوفة المحددة باستخدام المقارن الافتراضي. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | يرتب العناصر في المصفوفة المحددة باستخدام المقارن المحدد. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | غير مُنفّذ. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | يرتب مصفوفتين إحداهما تحتوي على المفاتيح والأخرى على العناصر المقابلة، بناءً على قيم المصفوفة التي تحتوي على المفاتيح، حيث يتم مقارنة عناصرها باستخدام operator<. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | يرتب مصفوفتين إحداهما تحتوي على المفاتيح والأخرى على العناصر المقابلة، بناءً على قيم المصفوفة التي تحتوي على المفاتيح، حيث يتم مقارنة عناصرها باستخدام المقارن الافتراضي. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | يحدد ما إذا كانت جميع العناصر في المصفوفة المحددة تفي بالشروط المحددة بواسطة الدالة الشرطية المحددة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرر العكسي الثابت. |
| [EnumerablePtr](./enumerableptr/) | اسم مستعار لنوع المؤشر المشترك الذي يشير إلى كائن IEnumerable يحتوي على عناصر من النوع **T**. |
| [EnumeratorPtr](./enumeratorptr/) | اسم مستعار لنوع المؤشر المشترك الذي يشير إلى كائن IEnumerator يحتوي على عناصر من النوع **T**. |
| [iterator](./iterator/) | نوع المكرر. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
| [UnderlyingType](./underlyingtype/) | اسم مستعار للنوع المستخدم لتمثيل كل عنصر في المصفوفة. |
| [ValueType](./valuetype/) | اسم مستعار لنوع عناصر المصفوفة. |
## ملاحظات



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // إنشاء وملء المصفوفة.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // طباعة عناصر المصفوفة.
  Print(arrayPtr);

  // رتّب عناصر المصفوفة تصاعديًا.
  Array<int32_t>::Sort(arrayPtr);

  // طباعة عناصر المصفوفة.
  Print(arrayPtr);

  // اطبع عدد عناصر المصفوفة.
  std::cout << arrayPtr->get_Length() << std::endl;

  // اطبع فهرس العنصر الذي يساوي 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // غيّر حجم المصفوفة.
  Array<int32_t>::Resize(arrayPtr, 3);

  // طباعة عناصر المصفوفة.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## انظر أيضًا

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
