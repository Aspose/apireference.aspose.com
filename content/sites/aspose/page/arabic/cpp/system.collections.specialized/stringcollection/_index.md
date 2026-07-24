---
title: "System::Collections::Specialized::StringCollection فئة"
linktitle: "StringCollection"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Specialized::StringCollection. قائمة مفهرسة من السلاسل. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


قائمة مفهرسة من السلاسل. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const System::String\&) | يضيف القيمة إلى نهاية القائمة. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | أضف عناصر إلى الحاوية. |
| [begin](./begin/)() | يعيد مُكرِّرًا إلى العنصر الأول في الحاوية. إذا كانت الحاوية فارغة، سيكون المُكرِّر المُعاد مساويًا لـ [end()](./end/). |
| [begin](./begin/)() const | يعيد مُكرِّرًا إلى العنصر الأول في الحاوية المؤهَّلة بالثابت. إذا كانت الحاوية فارغة، سيكون المُكرِّر المُعاد مساويًا لـ [end()](./end/). |
| [cbegin](./cbegin/)() const | يعيد مُكرِّرًا إلى العنصر الأول المؤهَّل بالثابت في الحاوية. إذا كانت الحاوية فارغة، سيكون المُكرِّر المُعاد مساويًا لـ [cend()](./cend/). |
| [cend](./cend/)() const | يعيد مُكرِّرًا إلى العنصر الذي يلي العنصر الأخير في الحاوية. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [Clear](./clear/)() | يحذف جميع العناصر. |
| [Contains](./contains/)(const System::String\&) const | يتحقق مما إذا كانت السلسلة المحددة موجودة في الحاوية. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | انسخ العناصر إلى عناصر المصفوفة الموجودة. |
| [crbegin](./crbegin/)() const | يعيد مُكرِّرًا عكسيًا إلى العنصر الأول في الحاوية المعكوسة. وهو يتطابق مع العنصر الأخير في الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، يكون المُكرِّر المُعاد مساويًا لـ [crend()](./crend/). |
| [crend](./crend/)() const | يعيد مُكرِّرًا عكسيًا إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يتطابق مع العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [data](./data/)() | مُستَخدِم بنية البيانات الداخلية. |
| [data](./data/)() const | مُستَخدِم بنية البيانات الداخلية. |
| [end](./end/)() | يعيد مُكرِّرًا إلى العنصر الذي يلي العنصر الأخير في الحاوية. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [end](./end/)() const | يعيد مُكرِّرًا إلى العنصر الذي يلي العنصر الأخير في الحاوية المؤهَّلة بالثابت. هذا العنصر يعمل كعنصر نائب؛ محاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [get_Count](./get_count/)() const | يحصل على عدد العناصر في المجموعة. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد الذي يتنقل عبر المجموعة الحالية. |
| [idx_get](./idx_get/)(int) const | يحصل على القيمة في الموضع المحدد. |
| [idx_set](./idx_set/)(int, const System::String\&) | يضبط القيمة في الموضع المحدد. |
| [IndexOf](./indexof/)(const System::String\&) const | يبحث عن سلسلة محددة في الحاوية. |
| [Insert](./insert/)(int, const System::String\&) | يدرج قيمة محددة في الحاوية. |
| [operator[]](./operator[]/)(int) | دالة وصول. |
| [rbegin](./rbegin/)() | يعيد مكرّرًا عكسيًا إلى العنصر الأول من الحاوية المعكوسة. يتطابق مع العنصر الأخير من الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، فإن المكرّر المعاد يساوي [rend()](./rend/). |
| [rbegin](./rbegin/)() const | يعيد مكرّرًا عكسيًا إلى العنصر الأول من الحاوية المعكوسة. يتطابق مع العنصر الأخير من الحاوية غير المعكوسة. إذا كانت الحاوية فارغة، فإن المكرّر المعاد يساوي [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | يزيل الظهور الأول للسلسلة المحددة. |
| [RemoveAt](./removeat/)(int) | يزيل العنصر في الموضع المحدد. |
| [rend](./rend/)() | يعيد مُكرِّرًا عكسيًا إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يتطابق مع العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [rend](./rend/)() const | يعيد مُكرِّرًا عكسيًا إلى العنصر الذي يلي العنصر الأخير في الحاوية المعكوسة. وهو يتطابق مع العنصر الذي يسبق العنصر الأول في الحاوية غير المعكوسة. هذا العنصر يعمل كعنصر نائب، ومحاولة الوصول إليه تؤدي إلى سلوك غير معرف. |
| [StringCollection](./stringcollection/)() | ينشئ مجموعة سلاسل فارغة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يسترجع تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يسترجع تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يسترجع تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يسترجع تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرّر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرّر العكسي الثابت. |
| [iterator](./iterator/) | نوع المكرّر. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرّر العكسي. |
## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
