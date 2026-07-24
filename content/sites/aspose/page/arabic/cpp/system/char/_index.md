---
title: "فئة System::Char"
linktitle: "Char"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Char. توفر طرقًا للتعامل مع الأحرف الممثلة كوحدات كود UTF-16. هذا نوع ثابت بدون خدمات مثيل. لا يجب عليك أبداً إنشاء مثيلات منه بأي وسيلة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/char/
---
## Char class


يقدم طرقًا لمعالجة الأحرف الممثلة كوحدات شفرة UTF‑16. هذا نوع ثابت لا يقدم خدمات مثيل. يجب ألا تنشئ أي نسخ منه بأي وسيلة.

```cpp
class Char
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | يحوّل وحدة كود UTF-32 إلى مثيل من فئة [System::String](../string/). |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | يحوّل الزوج البديل UTF-16 المحدد إلى وحدة كود UTF-32. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | يحوّل قيمة حرف مشفر بـ UTF-16 أو زوج بديل (surrogate pair) في موضع محدد داخل سلسلة إلى وحدة شفرة UTF-32. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | يحوّل الحرف المحدد بـ UTF-16 إلى قيمة عددية ذات دقة مزدوجة بنقطة عائمة. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | يرجع قيمة تمثل فئة Unicode للحرف المحدد. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف مسافة بيضاء ASCII. |
| static [IsControl](./iscontrol/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كحرف تحكم Unicode. |
| static [IsControl](./iscontrol/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف تحكم Unicode. |
| static [IsDigit](./isdigit/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كرقم عشري. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل السلسلة المحددة مصنّفًا كرقم عشري. |
| static [IsDigit](./isdigit/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كرقم عشري. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل السلسلة المحددة هو وحدة شفرة UTF-16 عالية (high surrogate). |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد هو بديل عالي (high surrogate). |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد هو بديل عالي (high surrogate). |
| static [IsLetter](./isletter/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كحرف Unicode. |
| static [IsLetter](./isletter/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف Unicode. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كحرف Unicode أو رقم عشري. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف Unicode أو رقم عشري. |
| static [IsLower](./islower/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كحرف صغير. |
| static [IsLower](./islower/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف صغير. |
| static [IsLower](./islower/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل السلسلة المحددة مصنّفًا كحرف صغير. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد هو بديل منخفض (low surrogate). |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد هو بديل منخفض (low surrogate). |
| static [IsNumber](./isnumber/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كعدد. |
| static [IsNumber](./isnumber/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كعدد. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد داخل مخزن الأحرف المحدد مصنّفًا كحرف علامات ترقيم. |
| static [IsPunctuation](./ispunctuation/)(char_t) | يحدد ما إذا كان الحرف المحدد مصنّفًا كحرف علامات ترقيم. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنّف كحرف فاصل. |
| static [IsSeparator](./isseparator/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنّف كحرف فاصل. |
| static [IsSurrogate](./issurrogate/)(char_t) | يحدد ما إذا كان الحرف المحدد وحدة رمز بديلة UTF-16. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في السلسلة المحددة وحدة رمز بديلة UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | يحدد ما إذا كان الحرفان المحددان يشكلان زوجًا بديلًا UTF-16. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | يحدد ما إذا كان حرفان متتاليان في المخزن المؤقت للحروف المحدد يشكلان زوجًا بديلًا. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنّف كحرف رمزي. |
| static [IsSymbol](./issymbol/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنّف كحرف رمزي. |
| static [IsUpper](./isupper/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في السلسلة المحددة يُصنّف كحرف كبير. |
| static [IsUpper](./isupper/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنّف كحرف كبير. |
| static [IsUpper](./isupper/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنّف كحرف كبير. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في المخزن المؤقت للحروف المحدد يُصنّف كحرف مسافة بيضاء. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | يحدد ما إذا كان الحرف المحدد يُصنّف كحرف مسافة بيضاء. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | يحدد ما إذا كان الحرف الموجود في الفهرس المحدد في السلسلة المحددة يُصنّف كحرف مسافة بيضاء. |
| static [Parse](./parse/)(const String\&) | يحوّل الحرف الأول والوحيد في السلسلة المحددة إلى قيمة من نوع char_t. |
| static [ToLower](./tolower/)(char_t) | يحوّل الحرف المحدد إلى حالة صغيرة. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | يحوّل الحرف المحدد إلى حالة صغيرة. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | يحوّل الحرف المحدد إلى حالة صغيرة. |
| static [ToUpper](./toupper/)(char_t) | يحوّل الحرف المحدد إلى حالة كبيرة. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | يحوّل الحرف المحدد إلى حالة كبيرة. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | يحوّل الحرف المحدد إلى حالة كبيرة. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | يحاول تحويل سلسلة تتكون من حرف واحد إلى حرف UTF-16. تنجح الدالة فقط عندما لا تكون السلسلة المدخلة فارغة وتكون طولها حرفًا واحدًا بالضبط. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
