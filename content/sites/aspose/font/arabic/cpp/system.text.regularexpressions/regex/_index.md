---
title: "الفئة System::Text::RegularExpressions::Regex"
linktitle: "Regex"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::RegularExpressions::Regex. تعبير نمطي يتبع بنية شبيهة بـ C#. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.text.regularexpressions/regex/
---
## Regex class


تعبير نمطي يتبع بنية شبيهة بـ C#. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Regex : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Escape](./escape/)(const String\&) | يهرب من الأحرف الخاصة لاستخدام السلسلة كجزء من النمط. |
| [get_MatchTimeout](./get_matchtimeout/)() | يحصل على مهلة المطابقة. |
| [get_Options](./get_options/)() | يحصل على خيارات التعبير النمطي. |
| [get_RightToLeft](./get_righttoleft/)() | يتحقق مما إذا كانت المطابقة تُجرى في وضع من اليمين إلى اليسار. |
| [IsMatch](./ismatch/)(const String\&, int) | يطابق التعبير النمطي مع السلسلة. |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | يتحقق مما إذا كانت السلسلة تطابق النمط. |
| [Match](./match/)(const String\&) | يطابق التعبير النمطي مع السلسلة. |
| [Match](./match/)(const String\&, int, int) | يطابق التعبير النمطي مع السلسلة. |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | يطابق السلسلة والنمط. |
| [Matches](./matches/)(const String\&, int) | يحصل على جميع مطابقات التعبير النمطي في السلسلة المعطاة عبر المطابقة المتكررة. |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | يحصل على جميع المطابقات بين السلسلة والنمط. |
| [Regex](./regex/)() | يبني تعبير نمطي فارغ. |
| [Regex](./regex/)(const String\&) | المُنشئ. |
| [Regex](./regex/)(const String\&, RegexOptions) | المُنشئ. |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | المُنشئ. |
| [Replace](./replace/)(const String\&, const String\&) | يستبدل جميع مطابقات التعبير النمطي في السلسلة بسلسلة الاستبدال. |
| [Replace](./replace/)(const String\&, const char_t *) | يستبدل جميع مطابقات التعبير النمطي في السلسلة بسلسلة الاستبدال. |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | يستبدل جميع مطابقات التعبير النمطي في السلسلة بسلسلة الاستبدال. |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | يستبدل جميع مطابقات التعبير النمطي في السلسلة بسلسلة الاستبدال. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | يستبدل جميع المطابقات في السلسلة بسلاسل استبدال مُولدة بواسطة المُندوب. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | يستبدل جميع المطابقات في السلسلة بسلاسل استبدال مُولدة بواسطة المُندوب. |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | يستبدل جميع المطابقات في السلسلة بسلاسل استبدال مُولدة بواسطة المُندوب. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | يستبدل جميع التطابقات في السلسلة بسلاسل استبدال تم إنشاؤها بواسطة التفويض (دالة ثابتة). |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | يستبدل جميع مطابقات التعبير النمطي في السلسلة بسلسلة الاستبدال. |
| [Replace](./replace/)(const String\&, const String\&, int) | يستبدل السلاسل الفرعية في السلسلة. غير مُنفَّذ. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | يستبدل السلاسل الفرعية في السلسلة. غير مُنفَّذ. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | يستبدل تطابقات التعبير النمطي. |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | يستبدل تطابقات التعبير النمطي. |
| [Split](./split/)(const String\&) | يقسم السلسلة حسب تطابقات التعبير النمطي. |
| [Split](./split/)(const String\&, int) | يقسم السلسلة حسب تطابقات التعبير النمطي. |
| [Split](./split/)(const String\&, int, int) | يقسم سلسلة الإدخال عددًا أقصى محددًا من المرات إلى مصفوفة من السلاسل الفرعية، في المواضع التي يحددها تعبير نمطي محدد في مُنشئ [Regex](./). يبدأ البحث عن نمط التعبير النمطي عند موضع حرف محدد في سلسلة الإدخال. |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | يقسم السلسلة حسب regexp. |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | يقسم السلسلة حسب regexp. |
| [ToString](./tostring/)() const override | يحوّل regex إلى سلسلة. |
| static [Unescape](./unescape/)(const String\&) | يفكّ تشفير الأحرف الخاصة في السلسلة المستخدمة كجزء من النمط. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | قيمة مهلة خاصة لتعطيل انقطاع التطابق بسبب المهلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
