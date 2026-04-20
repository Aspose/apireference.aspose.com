---
title: "فئة System::Text::StringBuilder"
linktitle: "StringBuilder"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::StringBuilder. مخزن لتجميع السلسلة جزءًا بجزء. يمكن تخصيص هذا النوع إما في المكدس كنوع قيمة أو في الكومة باستخدام الدالة System::MakeObject(). بمجرد تخصيص الكائن، لا تخلط بين هاتين الحالتين: وجود مؤشرات SmartPtr إلى كائنات مخصصة على المكدس محظور تمامًا في C++."
type: docs
weight: 2400
url: /ar/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Append](./append/)(char_t) | يضيف حرفًا إلى المُنشئ. |
| [Append](./append/)(char_t, int) | يضيف أحرفًا إلى المُنشئ. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | يضيف مصفوفة أحرف إلى المُنشئ. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | يضيف شريحة من مصفوفة الأحرف إلى المُنشئ. |
| [Append](./append/)(const String\&) | يضيف سلسلة إلى المُنشئ. |
| [Append](./append/)(const String\&, int, int) | يضيف شريحة من السلسلة إلى المُنشئ. |
| [Append](./append/)(const SharedPtr\<T\>\&) | يضيف تمثيل السلسلة للكائن إلى المُنشئ. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | يضيف محتوى المُنشئ إلى المُنشئ. |
| [Append](./append/)(float) | يضيف قيمة عددية عائمة إلى المُنشئ. |
| [Append](./append/)(double) | يضيف قيمة عددية عائمة إلى المُنشئ. |
| [Append](./append/)(int) | يضيف قيمة عددية صحيحة إلى المُنشئ. |
| [Append](./append/)(T) | يضيف قيمة حسابية إلى المُنشئ. |
| [Append](./append/)(E) | يضيف تمثيل سلسلة لقيمة تعداد إلى المُنشئ. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | يضيف سلسلة مُنسقة إلى المُنشئ. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | يضيف سلسلة مُنسقة إلى المُنشئ. |
| [AppendLine](./appendline/)() | يضيف حرف سطر جديد إلى المُنشئ. |
| [AppendLine](./appendline/)(const String\&) | يضيف سلسلة متبوعة بحرف سطر جديد إلى المُنشئ. |
| [Clear](./clear/)() | يزيل جميع الأحرف من المُنشئ. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | ينسخ بيانات المُنشئ إلى مواضع المصفوفة الحالية. |
| [get_Capacity](./get_capacity/)() const | يحصل على السعة الحالية لمُنشئ السلسلة. |
| [get_Length](./get_length/)() const | يحصل على طول السلسلة الحالية في المُنشئ. |
| [idx_get](./idx_get/)(int) const | يحصل على الحرف في الموضع المحدد. |
| [idx_set](./idx_set/)(int, char_t) | يضبط الحرف في الموضع المحدد. |
| [Insert](./insert/)(int, const String\&) | يدرج سلسلة في الموضع الثابت للمُنشئ. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | يدرج سلسلة مكررة في الموضع الثابت للمُنشئ. |
| [Insert](./insert/)(int, char_t) | يدرج حرفًا في الموضع الثابت للمُنشئ. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | يدرج أحرفًا في الموضع الثابت للمُنشئ. |
| [Insert](./insert/)(int, T) | يدرج قيمة في الموضع الثابت للمُنشئ. |
| [operator[]](./operator[]/)(int) const | يحصل على الحرف في الموضع المحدد. |
| [Remove](./remove/)(int, int) | يزيل جزءًا من المُنشئ. |
| [Replace](./replace/)(const String\&, const String\&) | يستبدل سلسلة فرعية عبر المُنشئ. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | يستبدل سلسلة فرعية عبر نطاق المُنشئ. |
| [Replace](./replace/)(char_t, char_t) | يستبدل حرفًا عبر المُنشئ. |
| [Replace](./replace/)(char_t, char_t, int, int) | يستبدل حرفًا عبر نطاق المُنشئ. |
| [set_Capacity](./set_capacity/)(int) | يضبط السعة الحالية لمُنشئ السلسلة. |
| [set_Length](./set_length/)(int) | يقص أو يمد مُنشئ السلسلة إلى الطول المحدد. |
| [StringBuilder](./stringbuilder/)() | المُنشئ. |
| [StringBuilder](./stringbuilder/)(int) | المُنشئ. |
| [StringBuilder](./stringbuilder/)(const String\&) | المُنشئ. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | المُنشئ. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | المُنشئ. |
| [ToString](./tostring/)() const override | يحصل على السلسلة الحالية الموجودة في المُنشئ. |
| [ToString](./tostring/)(int, int) const | يحصل على السلسلة الفرعية الحالية الموجودة في المُنشئ. |
| [~StringBuilder](./~stringbuilder/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
