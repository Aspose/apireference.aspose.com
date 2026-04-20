---
title: "فئة System::String"
linktitle: "String"
second_title: "Aspose.Font لـ C++"
description: "فئة System::String. فئة السلسلة المستخدمة عبر المكتبة. هي بديل لـ C# System.String عند ترجمة الشيفرة. لأسباب تحسين الأداء، لا تُعتبر فئة فرعية من Object. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 5800
url: /ar/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) هو نوع قيمة على جانب C++ والذي يطبق ضمنياً (بدون وراثة) بعض الواجهات. |
| [begin](./begin/)() const | يرجع مؤشر إلى بداية مخزن السلسلة الفعلي. لا يعيد تخصيص أي شيء أبداً. لا يضمن أن المخزن منتهي بـ null. |
| [Clone](./clone/)() const | ينشئ نسخة من السلسلة الحالية. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater-يقارن سلسلتين فرعيتين. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-يقارن سلسلتين فرعيتين. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater-يقارن سلسلتين. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater-يقارن سلسلتين. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater-يقارن سلسلتين. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-يقارن سلسلتين. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater-يقارن سلسلتين باستخدام وضع ترتيبي. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater-يقارن سلسلتين باستخدام وضع ترتيبي. |
| [CompareTo](./compareto/)(const String\&) const | يقارن سلسلتين بنمط 'less-equals-more'. يستخدم الثقافة الحالية. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | يجمع السلاسل. |
| static [Concat](./concat/)(const String\&, const String\&) | يجمع السلاسل. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | يجمع السلاسل. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | يجمع السلاسل. |
| [Contains](./contains/)(const String\&) const | يتحقق مما إذا كان str جزءًا فرعيًا من السلسلة الحالية. |
| [Contains](./contains/)(char16_t) const | يتحقق مما إذا كانت السلسلة تحتوي على الحرف المعطى. |
| static [Copy](./copy/)(const String\&) | ينشئ نسخة من السلسلة. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | ينسخ أحرف السلسلة إلى عناصر المصفوفة الموجودة. لا يتم تغيير الحجم. |
| [end](./end/)() const | يرجع مؤشرًا إلى نهاية مخزن السلسلة الفعلي. لا يعيد تخصيص أي شيء أبدًا. لا يضمن أن يكون المخزن منتهيًا بـ null. |
| [EndsWith](./endswith/)(const String\&) const | يتحقق مما إذا كانت السلسلة تنتهي بالجزء الفرعي المحدد. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | يتحقق مما إذا كانت السلسلة تنتهي بالجزء الفرعي المحدد. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | يتحقق مما إذا كانت السلسلة تنتهي بالجزء الفرعي المحدد. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | مقارنة مساواة [String](./). يتم دعم عدة أوضاع توفرها تعداد [StringComparison](../stringcomparison/). |
| [Equals](./equals/)(const String\&) const | مقارنة مساواة [String](./). يستخدم وضع المقارنة [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal-يقارن سلسلتين باستخدام وضع المقارنة Ordial. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal-يقارن سلسلتين. |
| [FastToAscii](./fasttoascii/)(char, int) const | يحاول تحويل [String](./) إلى سلسلة ASCII. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | يصيغ السلسلة بنمط C#. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | يصيغ السلسلة بنمط C#. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | يصيغ السلسلة بنمط C#. |
| static [Format](./format/)(const String\&, const Args\&...) | يصيغ السلسلة بنمط C#. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | يصيغ السلسلة بنمط C#. |
| static [FromAscii](./fromascii/)(const char *) | ينشئ [String](./) من سلسلة ASCII. |
| static [FromAscii](./fromascii/)(const char *, int) | ينشئ [String](./) من سلسلة ASCII. |
| static [FromAscii](./fromascii/)(const std::string\&) | ينشئ [String](./) من سلسلة ASCII. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | ينشئ [String](./) من سلسلة utf16. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | ينشئ [String](./) من سلسلة utf32. |
| static [FromUtf8](./fromutf8/)(const char *) | ينشئ [String](./) من سلسلة utf8. |
| static [FromUtf8](./fromutf8/)(const char *, int) | ينشئ [String](./) من سلسلة utf8. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | ينشئ [String](./) من سلسلة utf8. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | ينشئ [String](./) من سلسلة utf8. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | ينشئ [String](./) من widestring. |
| [get_Length](./get_length/)() const | يحصل على طول السلسلة. |
| [GetHashCode](./gethashcode/)() const | يحسب تجزئة السلسلة المحتواة. تم تنفيذها في ICU، ولا تتطابق التجزئات مع تلك في C#. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | بحث أمامي عن الجزء الفرعي. |
| [IndexOf](./indexof/)(char_t, int) const | البحث الأمامي عن الحرف. |
| [IndexOf](./indexof/)(char_t, int, int) const | البحث الأمامي عن الحرف في السلسلة الفرعية. |
| [IndexOf](./indexof/)(const String\&, int) const | بحث أمامي عن الجزء الفرعي. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | بحث أمامي عن الجزء الفرعي. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | بحث أمامي عن الجزء الفرعي. |
| [IndexOf](./indexof/)(const String\&, int, int) const | بحث أمامي عن الجزء الفرعي. |
| [IndexOfAny](./indexofany/)(char_t, int) const | البحث الأمامي عن الحرف. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | وبالتالي يبحث عن جميع أحرف السلسلة str في هذا. إذا تم العثور على الحرف الأول، تُرجع موقعه، وإلا يبحث عن الحرف الثاني وهكذا. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي. يقارن الحرف الأول في السلسلة بجميع الأحرف في anyOf، ثم يقارن الثاني وهكذا. يُرجع فهرس أول حرف يطابق أيًا من الأحرف المستهدفة. |
| [Insert](./insert/)(int, const String\&) const | يدرج الجزء الفرعي في الموضع المحدد. |
| [Is](./is/)(const System::TypeInfo\&) const | يتحقق مما إذا كان كائن السلسلة من النوع المحدد بواسطة [TypeInfo](../typeinfo/) الممرر. |
| [IsAsciiString](./isasciistring/)() const | يشير إلى ما إذا كان [String](./) يحتوي على رموز ASCII فقط. |
| [IsEmpty](./isempty/)() const | يتحقق مما إذا كانت السلسلة غير null وفارغة. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | يتحقق مما إذا كانت السلسلة Unicode مُطَبَّقة باستخدام نموذج التطبيع المحدد. |
| [IsNull](./isnull/)() const | يتحقق مما إذا كانت السلسلة تُعتبر null. تكون [String](./) null فقط إذا تم إنشاؤها عبر مُنشئ [String()](./string/)، أو تم نقلها أو نسخها أو تعيينها من سلسلة null أو تم استدعاء طريقة [reset()](./reset/). |
| [IsNullOrEmpty](./isnullorempty/)() const | يتحقق مما إذا كانت السلسلة فارغة أو تُعتبر null. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | يتحقق مما إذا كانت السلسلة الممررة null أو فارغة. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | يشير إلى ما إذا كانت السلسلة المحددة null أو فارغة أو تتكون فقط من أحرف المسافات البيضاء. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | يجمع المصفوفة باستخدام السلسلة كفاصل. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | يجمع المصفوفة باستخدام السلسلة كفاصل. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | يجمع المصفوفة باستخدام السلسلة كفاصل. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | يجمع المصفوفة باستخدام السلسلة كفاصل. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | بحث خلفي عن الجزء الفرعي. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | بحث خلفي عن الجزء الفرعي. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | بحث خلفي عن الجزء الفرعي. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | بحث خلفي عن الجزء الفرعي. |
| [LastIndexOf](./lastindexof/)(char_t) const | بحث خلفي عن الحرف. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | بحث خلفي عن الحرف. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | بحث خلفي عن الحرف. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | يبحث عن أي من الأحرف الممررة عبر السلسلة بأكملها بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | يبحث عن أي من الأحرف الممررة عبر الجزء الفرعي بشكل عكسي. يقارن الحرف الأخير في السلسلة بجميع الأحرف في anyOf، ثم يقارن السابق وهكذا. يُرجع فهرس أول تطابق تم العثور عليه. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | يقوم بتطبيع السلسلة Unicode باستخدام نموذج التطبيع المحدد. |
| [operator!=](./operator!=/)(const String\&) const | عامل مقارنة عدم المساواة. |
| [operator!=](./operator!=/)(std::nullptr_t) const | يتحقق مما إذا كانت السلسلة ليست null. يطبق نفس المنطق كما في استدعاء [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | عامل ربط [String](./). |
| [operator+](./operator+/)(const T\&) const | ربط [String](./) مع ثابت نصي أو مؤشر إلى سلسلة أحرف. |
| [operator+](./operator+/)(char_t) const | يضيف حرفًا إلى نهاية السلسلة. |
| [operator+](./operator+/)(int) const | يضيف تمثيل قيمة عدد صحيح كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(uint32_t) const | يضيف تمثيل قيمة عدد صحيح غير موقع كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(double) const | يضيف تمثيل قيمة عدد عائم كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(int64_t) const | يضيف تمثيل قيمة عدد صحيح كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(const T\&) const | يضيف تمثيل كائن من نوع مرجعي كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(const T\&) const | يضيف تمثيل كائن من نوع مرجعي كسلسلة نصية إلى نهاية السلسلة. |
| [operator+](./operator+/)(T) const | يضيف تمثيل قيمة منطقية كسلسلة نصية إلى نهاية السلسلة. |
| [operator+=](./operator+=/)(char_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(const String\&) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(double) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(uint8_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(int16_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(uint16_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(int32_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(uint32_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(int64_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(uint64_t) | عامل إسناد الدمج. |
| [operator+=](./operator+=/)(T) | عامل إسناد الدمج. |
| [operator<](./operator_/)(const String\&) const | يقارن السلاسل ترتيبياً. |
| [operator=](./operator=/)(const String\&) | عامل الإسناد. |
| [operator=](./operator=/)(String\&&) | عامل إسناد النقل. |
| [operator==](./operator==/)(const String\&) const | عامل مقارنة المساواة. |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كانت السلسلة null. يطبق نفس المنطق كما في استدعاء [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | يقارن السلاسل ترتيبياً. |
| [operator[]](./operator[]/)(int) const | يحصل على الحرف في الموضع المحدد. |
| [PadLeft](./padleft/)(int, char_t) const | يضيف حشوًا على يسار السلسلة الأصلية. |
| [PadRight](./padright/)(int, char_t) const | يضيف حشوًا على يمين السلسلة الأصلية. |
| [rbegin](./rbegin/)() const | يرجع مكرّرًا عكسيًا إلى آخر حرف (إن وجد) في مخزن السلسلة الفعلي. |
| [Remove](./remove/)(int32_t, int32_t) const | يستخرج كل شيء ما عدا الجزء الفرعي من السلسلة الحالية. |
| [rend](./rend/)() const | يرجع مكرّرًا عكسيًا إلى ما قبل أول حرف (إن وجد) في مخزن السلسلة الفعلي. |
| [Replace](./replace/)(char_t, char_t) const | يستبدل جميع تكرارات الحرف في السلسلة. |
| [Replace](./replace/)(const String\&, const String\&) const | يستبدل جميع تكرارات البحث في هذه السلسلة. |
| [reset](./reset/)() | يضبط السلسلة إلى null. وهو مماثل لـ 'string_variable_name = null' في C#. |
| [SetCharAt](./setcharat/)(int, char_t) | يضبط الحرف في الموضع المحدد. |
| [Split](./split/)(char_t, StringSplitOptions) const | يقسم السلسلة حسب الحرف. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | يقسم السلسلة حسب الحرف. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | يقسم السلسلة حسب أحد حرفين. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | يقسم السلسلة حسب أحد الأحرف المحددة. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | يقسم السلسلة حسب أحد الأحرف المحددة. |
| [Split](./split/)(const String\&, StringSplitOptions) const | يقسم السلسلة حسب الجزء الفرعي. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | يقسم السلسلة حسب الجزء الفرعي. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | يقسم السلسلة حسب الجزء الفرعي. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | يقسم السلسلة حسب الجزء الفرعي. حاليًا، يدعم فقط مصفوفة الفواصل التي تحتوي على صفر أو عنصر واحد. |
| [StartsWith](./startswith/)(const String\&) const | يتحقق مما إذا كانت السلسلة تبدأ بالجزء الفرعي المحدد. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | يتحقق مما إذا كانت السلسلة تبدأ بالجزء الفرعي المحدد. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | يتحقق مما إذا كانت السلسلة تبدأ بالجزء الفرعي المحدد. |
| [String](./string/)() | منشئ افتراضي. ينشئ كائن سلسلة يُعتبر فارغًا. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | يبني سلسلة بناءً على ثابت نصي. يعتبر الثابت سلسلة منتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حجم الثابت. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | يبني سلسلة بناءً على مؤشر سلسلة أحرف. يتعامل مع السلسلة المشار إليها كمنتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حرف null. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | يبني سلسلة بناءً على ثابت نصي. يعتبر الثابت سلسلة منتهية بـ null بتشفير UTF8، ويحسب طول السلسلة الهدف بناءً على حجم الثابت. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | يبني سلسلة بناءً على مؤشر سلسلة أحرف. يتعامل مع السلسلة المشار إليها كمنتهية بـ null بتشفير UTF8، ويحسب طول السلسلة الهدف بناءً على حرف null. |
| [String](./string/)(const char16_t *, int) | يبني سلسلة من مؤشر سلسلة أحرف وطول صريح. |
| [String](./string/)(const char *, int) | يبني سلسلة من مؤشر سلسلة أحرف وطول صريح. |
| [String](./string/)(const char16_t *, int, int) | يبني سلسلة من مؤشر سلسلة أحرف بدءًا من موضع معين باستخدام الطول. |
| explicit [String](./string/)(const char16_t, int) | منشئ تعبئة. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | منشئ nullptr. مُعلن كقالب لحل الأولويات مع منشئات القالب الأخرى. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | يبني سلسلة بناءً على ثابت نص واسع. يعتبر الثابت سلسلة منتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حجم الثابت. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | يبني سلسلة بناءً على مؤشر سلسلة أحرف واسعة. يتعامل مع السلسلة المشار إليها كمنتهية بـ null، ويحسب طول السلسلة الهدف بناءً على حرف null. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية. |
| explicit [String](./string/)(const wchar_t *, int) | يبني سلسلة من مؤشر سلسلة أحرف واسعة وطول صريح. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية. |
| explicit [String](./string/)(const wchar_t, int) | منشئ تعبئة. التحويل من wchar_t يستغرق وقتًا على بعض المنصات، لذا لا يُسمح بالتحويلات الضمنية. |
| [String](./string/)(const String\&) | منشئ النسخ. |
| [String](./string/)(String\&&) | منشئ نقل. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | يحوّل مصفوفة الأحرف بالكامل إلى سلسلة. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | يحوّل نطاقًا فرعيًا من مصفوفة الأحرف إلى سلسلة. إذا كانت المعلمات خارج حدود المصفوفة، يتم إنشاء سلسلة فارغة. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | يُغلف UnicodeString إلى [String](./). |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | منشئ نقل. |
| explicit [String](./string/)(const std::wstring\&) | ينشئ [String](./) من widestring. |
| explicit [String](./string/)(const std::u16string\&) | ينشئ [String](./) من سلسلة utf16. |
| explicit [String](./string/)(const std::string\&) | ينشئ [String](./) من سلسلة std::string مقدمة بصيغة UTF-8. |
| explicit [String](./string/)(const std::u32string\&) | ينشئ [String](./) من سلسلة std::u32string. |
| [Substring](./substring/)(int32_t) const | يستخرج جزءًا فرعيًا. |
| [Substring](./substring/)(int32_t, int32_t) const | يستخرج جزءًا فرعيًا. |
| [ToAsciiString](./toasciistring/)() const | يحوّل السلسلة إلى std::string. يستخدم ترميز ASCII. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | يحوّل السلسلة أو الجزء الفرعي إلى مصفوفة من البايتات. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | يحوّل السلسلة أو الجزء الفرعي إلى مصفوفة من الأحرف. |
| [ToLower](./tolower/)() const | يحوّل جميع أحرف السلسلة إلى أحرف صغيرة. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | يقوم بتحويل جميع أحرف السلسلة إلى أحرف صغيرة باستخدام ثقافة محددة. |
| [ToLowerInvariant](./tolowerinvariant/)() const | يقوم بتحويل جميع أحرف السلسلة إلى أحرف صغيرة باستخدام ثقافة ثابتة. |
| [ToString](./tostring/)() const | غلاف للتعامل مع فئة [String](./) في السياقات التي يتم فيها استدعاء [ToString()](./tostring/) على كائنات من نوع القيمة. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | غلاف للتعامل مع فئة [String](./) في السياقات التي يتم فيها استدعاء [ToString()](./tostring/) على كائنات من نوع القيمة. |
| [ToU16Str](./tou16str/)() const | يقوم بتحويل السلسلة إلى std::u16string. |
| [ToU32Str](./tou32str/)() const | يقوم بتحويل السلسلة إلى std::u32string. |
| [ToUpper](./toupper/)() const | يقوم بتحويل جميع أحرف السلسلة إلى أحرف كبيرة. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | يقوم بتحويل جميع أحرف السلسلة إلى أحرف كبيرة باستخدام ثقافة محددة. |
| [ToUpperInvariant](./toupperinvariant/)() const | يقوم بتحويل جميع أحرف السلسلة إلى أحرف كبيرة باستخدام ثقافة ثابتة. |
| [ToUtf8String](./toutf8string/)() const | يقوم بتحويل السلسلة إلى std::string. يستخدم ترميز UTF-8. |
| [ToWCS](./towcs/)() const | يقوم بتحويل السلسلة إلى std::wstring. |
| [Trim](./trim/)() const | يزيل جميع أحرف المسافات البيضاء من بداية ونهاية السلسلة. |
| [Trim](./trim/)(char_t) const | يزيل جميع تكرارات الحرف الممرَّر من بداية ونهاية السلسلة. |
| [Trim](./trim/)(const String\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من بداية ونهاية السلسلة. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من بداية ونهاية السلسلة. |
| [TrimEnd](./trimend/)() const | يزيل جميع أحرف المسافات البيضاء من نهاية السلسلة. |
| [TrimEnd](./trimend/)(char_t) const | يزيل جميع تكرارات الحرف الممرَّر من نهاية السلسلة. |
| [TrimEnd](./trimend/)(const String\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من نهاية السلسلة. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من نهاية السلسلة. |
| [TrimStart](./trimstart/)() const | يزيل جميع أحرف المسافات البيضاء من بداية السلسلة. |
| [TrimStart](./trimstart/)(char_t) const | يزيل جميع تكرارات الحرف الممرَّر من بداية السلسلة. |
| [TrimStart](./trimstart/)(const String\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من بداية السلسلة. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | يزيل جميع تكرارات الأحرف الممرَّرة من بداية السلسلة. |
| [u_str](./u_str/)() const | يعيد مخزنًا منتهيًا بـ null على نمط ICU. قد يعيد تخصيص السلسلة. |
| [~String](./~string/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | سلسلة فارغة. |
| static [Null](./null/) | سلسلة null. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
## ملاحظات



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // أنشئ سلسلة من مصفوفة الأحرف واطبعها.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // أنشئ سلسلة من مصفوفة البايتات واطبعها.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // قم بتقليم السلسلة أدناه واطبعها.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // اطبع عدد الكلمات في الـ .
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
