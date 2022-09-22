---
title: EncoderParameter
second_title: Aspose.Drawing لمرجع NET API
description: يُستخدم لتمرير قيمة  أو مجموعة من القيم  إلى برنامج تشفير الصور.
type: docs
weight: 700
url: /ar/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

يُستخدم لتمرير قيمة ، أو مجموعة من القيم ، إلى برنامج تشفير الصور.

```csharp
public sealed class EncoderParameter : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter) فئة مع المحددEncoder object وعدد صحيح 8 بت واحد بدون إشارة. يضبط الValueType property إلىValueTypeByte ، وتعيينNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومجموعة من الأعداد الصحيحة 8 بت بدون إشارةValueType الملكية لValueTypeByte ، ويعين ملفNumberOfValues إلى عدد العناصر في المصفوفة. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وعدد صحيح 64 بت. يضبط الValueType property إلىValueTypeLong (32 بت) ، وتعيين the NumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومجموعة من الأعداد الصحيحة 64 بت. يضبط الValueType خاصيةValueTypeLong (32 بت) ، و set theNumberOfValues إلى عدد العناصر في المصفوفة. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن واحد ، عدد صحيح 16 بت. يضبط الValueType property إلىValueTypeShort ، وتعيينNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومجموعة من الأعداد الصحيحة 16 بت. يضبط الValueType خاصيةValueTypeShort ، وتعيين the NumberOfValues إلى عدد العناصر في المصفوفة. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder الكائن وسلسلة الأحرف. يتم تحويل السلسلة إلى سلسلة ASCII منتهية بقيمة خالية قبل يتم تخزينها في ملفEncoderParameter هدف. يضبط الValueType خاصيةValueTypeAscii ، و set theNumberOfValues خاصية طول سلسلة ASCII بما في ذلك فاصل NULL. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وقيمة 8 بت واحد. يضبط الValueType property إلىValueTypeUndefined أوValueTypeByte ، ويعين ملفNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومجموعة من البايت. يضبط الValueType خاصيةValueTypeUndefined أو ValueTypeByte ، وتعيينNumberOfValues إلى عدد العناصر في المصفوفة. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoderكائن وزوج من الأعداد الصحيحة 32 بت. زوج الأعداد الصحيحة يمثل كسر ، أول عدد صحيح هو البسط ، والثاني هو المقام.ValueType الملكية لValueTypeRational ، ويعين ملفNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومصفوفتين من الأعداد الصحيحة 32 بت. المصفوفتان تمثلان مصفوفة من الكسورValueType الملكية لValueTypeRational ، ويعين ملفNumberOfValuesإلى عدد العناصر في ملف*numerator* المصفوفة ، والتي يجب أن تكون هي نفس عدد العناصر في ملف*denominator* مجموعة مصفوفة. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وزوج من الأعداد الصحيحة 64 بت. يمثل زوج الأعداد الصحيحة نطاقًا من الأعداد الصحيحة ، حيث يمثل العدد الصحيح الأول أصغر رقم في النطاق ، ويمثل العدد الثاني أكبر عدد في النطاق . يضبطValueType الملكية لValueTypeLongRange ، ويعين ملفNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن ومصفوفتين من الأعداد الصحيحة 64 بت. المصفوفتان تمثلان نطاقات عدد صحيح للصفيفValueType الملكية لValueTypeLongRange ، ويعين ملفNumberOfValuesإلى عدد العناصر في ملف*rangebegin* المصفوفة ، والتي يجب أن تكون هي نفس عدد العناصر في ملف*rangeend* مجموعة . |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وثلاثة أعداد صحيحة تحدد عدد القيم ونوع بيانات القيم ومؤشر للقيم المخزنة فيEncoderParameter الكائن . |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وأربعة ، 32 بت الأعداد الصحيحة. تمثل الأعداد الصحيحة الأربعة نطاقًا من الكسور. يمثل أول عددين صحيحين أصغر كسر في النطاق ، ويمثل العددان الصحيحان المتبقيان أكبر جزء في النطاق. يضبط الValueType الخاصية to ValueTypeRationalRange ، و set theNumberOfValues الخاصية حتى 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | يقوم بتهيئة مثيل جديد لملف[`EncoderParameter`](../encoderparameter)فئة مع المحدد Encoder كائن وأربع مصفوفات من 32 بت الأعداد الصحيحة. المصفوفات الأربعة تمثل نطاقات عقلانية للصفيف . النطاق المنطقي هو مجموعة كل الكسور من أدنى قيمة كسرية إلى أقصى قيمة كسرية.ValueType الملكية لValueTypeRationalRange ، ويعين ملفNumberOfValues إلى عدد العناصر in the*numerator1* المصفوفة ، والتي يجب أن تكون مماثلة لعدد العناصر في المصفوفات الثلاثة الأخرى. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | يحصل أو يحدد ملفEncoder كائن مرتبط بهذاEncoderParameter الكائن . ملفEncoder يقوم الكائن بتغليف المعرف الفريد العمومي (GUID) الذي يحدد الفئة (على سبيل المثالQuality وColorDepth أو أوCompression ) من المعلمة المخزنة في هذاEncoderParameter الكائن . |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | الحصول على عدد العناصر في مصفوفة القيم المخزنة في هذاEncoderParameter الكائن . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | يقوم بإصدار كافة الموارد التي يستخدمها هذاEncoderParameter الكائن . |

### أنظر أيضا

* مساحة الاسم [System.Drawing.Imaging](../../system.drawing.imaging)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
