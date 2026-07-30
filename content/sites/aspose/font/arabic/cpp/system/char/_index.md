---
title: "الفئة System::Char"
linktitle: "Char"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Char. توفر طرقًا لمعالجة الأحرف الممثلة كوحدات شفرة UTF-16. هذا نوع ثابت لا يحتوي على خدمات مثيلات. لا ينبغي لك أبدًا إنشاء مثيلات منه بأي وسيلة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/char/
---
## Char class


يوفر طرقًا لمعالجة الأحرف الممثلة كوحدات شفرة UTF-16. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة.

```cpp
class Char
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | يحوّل وحدة شفرة UTF-32 إلى مثيل من الفئة [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | يحوّل الزوج البديل UTF-16 المحدد إلى وحدة شفرة UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | يحوّل قيمة حرف مشفر بـ UTF-16 أو زوج بديل في موقع محدد داخل سلسلة إلى وحدة شفرة UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | يحوّل الحرف UTF-16 المحدد إلى قيمة عددية ذات دقة مزدوجة. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | يرجع قيمة تمثل فئة Unicode للحرف المحدد. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنفًا كحرف مسافة بيضاء ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد داخل المخزن المؤقت للحروف المحدد مصنفًا كحرف تحكم Unicode. |
| static [IsControl](./iscontrol/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنفًا كحرف تحكم Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كرقم عشري. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | يحدد ما إذا كان الحرف في الفهرس المحدد في السلسلة المحددة يُصنَّف كرقم عشري. |
| static [IsDigit](./isdigit/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كرقم عشري. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في السلسلة المحددة وحدة شفرة UTF-16 عالية البديل. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد بديلًا عاليًا. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد بديلًا عاليًا. |
| static [IsLetter](./isletter/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كحرف يونيكود. |
| static [IsLetter](./isletter/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كحرف يونيكود. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كحرف يونيكود أو رقم عشري. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كحرف يونيكود أو رقم عشري. |
| static [IsLower](./islower/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كحرف صغير. |
| static [IsLower](./islower/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كحرف صغير. |
| static [IsLower](./islower/)(const String\&, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في السلسلة المحددة يُصنَّف كحرف صغير. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد بديلًا منخفضًا. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد بديلًا منخفضًا. |
| static [IsNumber](./isnumber/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كرقم. |
| static [IsNumber](./isnumber/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كرقم. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كحرف علامات ترقيم. |
| static [IsPunctuation](./ispunctuation/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كحرف علامات ترقيم. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنَّف كحرف فاصل. |
| static [IsSeparator](./isseparator/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنَّف كحرف فاصل. |
| static [IsSurrogate](./issurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد وحدة شفرة UTF-16 بديلة. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | يحدد ما إذا كان الحرف في الفهرس المحدد في السلسلة المحددة وحدة شفرة UTF-16 بديلة. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | يحدد ما إذا كان الحرفان المحددان لزوج UTF-16 بديل. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | يحدد ما إذا كان حرفان متتاليان في المخزن المؤقت للحروف المحدد يشكلان زوجًا بديلًا. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد مصنّفًا كحرف رمزي. |
| static [IsSymbol](./issymbol/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف رمزي. |
| static [IsUpper](./isupper/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في السلسلة المحددة مصنّفًا كحرف كبير. |
| static [IsUpper](./isupper/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد مصنّفًا كحرف كبير. |
| static [IsUpper](./isupper/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف كبير. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد مصنّفًا كحرف مساحة بيضاء. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف مساحة بيضاء. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في السلسلة المحددة مصنّفًا كحرف مساحة بيضاء. |
| static [Parse](./parse/)(const String\&) | يحوّل الحرف الأول والوحيد في السلسلة المحددة إلى قيمة من نوع char_t. |
| static [ToLower](./tolower/)(char_t) | يحوّل الحرف المحدد إلى حرف صغير. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | يحوّل الحرف المحدد إلى حرف صغير. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | يحوّل الحرف المحدد إلى حرف صغير. |
| static [ToUpper](./toupper/)(char_t) | يحوّل الحرف المحدد إلى حرف كبير. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | يحوّل الحرف المحدد إلى حرف كبير. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | يحوّل الحرف المحدد إلى حرف كبير. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | يحاول تحويل سلسلة تتكوّن من حرف واحد إلى حرف UTF-16. تنجح الدالة فقط عندما لا تكون السلسلة المدخلة فارغة وتكون طولها حرفًا واحدًا بالضبط. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
