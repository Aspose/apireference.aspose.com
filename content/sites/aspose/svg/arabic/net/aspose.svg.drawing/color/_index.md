---
title: Color
second_title: Aspose.SVG لمرجع .NET API
description: تتيح لك فئة اللون تحديد الألوان مثل قيم الأحمرالأخضرالأزرق RGB  HueSaturationLuminosity HSL  HueSaturationValue HSV  HueWhiteenessBlackness HWB  القيم  قيم lightnessAB LAB  قيم LuminanceChromaHue LCH  قيم CyanMagentaYellowKey CMYK  قيم الألوان الطبيعية NCOL  أو باسم لون . تتوفر أيضًا قناة Alpha للإشارة إلى الشفافية.
type: docs
weight: 1390
url: /ar/net/aspose.svg.drawing/color/
---
## Color class

تتيح لك فئة اللون تحديد الألوان مثل قيم الأحمر-الأخضر-الأزرق (RGB) ، Hue-Saturation-Luminosity (HSL) ، Hue-Saturation-Value (HSV) ، Hue-Whiteeness-Blackness (HWB ) القيم ، قيم lightness-AB (LAB) ، قيم Luminance-Chroma-Hue (LCH) ، قيم Cyan-Magenta-Yellow-Key (CMYK) ، قيم الألوان الطبيعية (NCOL) ، أو باسم لون . تتوفر أيضًا قناة Alpha للإشارة إلى الشفافية.

```csharp
public class Color
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Color](color#constructor)() | يقوم بتهيئة مثيل جديد لملف[`Color`](../color) class. اللون الافتراضي هو الأسود. |
| [Color](color#constructor_1)(byte, byte, byte) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color)class. يجب أن تكون كافة مكونات الألوان في النطاق 0-255. |
| [Color](color#constructor_5)(float, float, float) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color) class. يجب أن تكون جميع مكونات الألوان في النطاق 0-1. |
| [Color](color#constructor_3)(int, int, int) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color)class. يجب أن تكون كافة مكونات الألوان في النطاق 0-255. |
| [Color](color#constructor_2)(byte, byte, byte, byte) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color)class. يجب أن تكون كافة مكونات الألوان في النطاق 0-255. |
| [Color](color#constructor_6)(float, float, float, float) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color) class. يجب أن تكون جميع مكونات الألوان في النطاق 0-1. |
| [Color](color#constructor_4)(int, int, int, int) | يقوم بتهيئة مثيل جديد لملف[`Color`](../color)class. يجب أن تكون كافة مكونات الألوان في النطاق 0-255. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha) { get; } | يمثل مكون ألفا للون. |
| [Blue](../../aspose.svg.drawing/color/blue) { get; } | يمثل المكون الأزرق للون. |
| [Green](../../aspose.svg.drawing/color/green) { get; } | يمثل المكون الأخضر للون. |
| [Red](../../aspose.svg.drawing/color/red) { get; } | يمثل المكون الأحمر للون |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk)(float, float, float, float) | إرجاع لون جديد بقيم السماوي والأرجواني والأصفر والمفتاح (الأسود) المطلوبة. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka)(float, float, float, float, float) | إرجاع لون جديد بقيم ألفا سماوي وأرجواني وأصفر ومفتاح (أسود) وقيم ألفا. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray)(float) | إرجاع لون جديد بقيمة الرمادية المطلوبة. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl)(float, float, float) | إرجاع لون جديد بقيم الصبغة والتشبع والتشبع المطلوبة. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla)(float, float, float, float) | إرجاع لون جديد مع تدرج اللون المطلوب ، والتشبع ، والتشبع ، وقيم ألفا. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv)(float, float, float) | إرجاع لون جديد بالتدرج المطلوب ، والتشبع ، والقيمة. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva)(float, float, float, float) | إرجاع لون جديد بالتدرج المطلوب ، والتشبع ، والقيمة ، و alpha. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb)(float, float, float) | إرجاع لون جديد بقيم درجة اللون ، البياض ، السواد المطلوبة. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba)(float, float, float, float) | إرجاع لون جديد بقيم درجة اللون ، البياض ، السواد المطلوبة. |
| static [FromInt](../../aspose.svg.drawing/color/fromint)(int) | إرجاع لون جديد بقيمة ARGB المطلوبة. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab)(float, float, float) | إرجاع لون جديد بقيم الإضاءة A و B المطلوبة. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba)(float, float, float, float) | إرجاع لون جديد بقيم ألفا ، A ، B ، الخفة المطلوبة. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch)(float, float, float) | إرجاع لون جديد بقيم النصوع والصفاء ودرجة اللون المطلوبة. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha)(float, float, float, float) | إرجاع لون جديد مع قيم النصوع والصفاء وتدرج اللون وقيم ألفا المطلوبة. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab)(float, float, float) | إرجاع لون جديد بقيم الإضاءة A و B المطلوبة لنموذج OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba)(float, float, float, float) | إرجاع لون جديد بقيم ألفا ، A ، B ، الخفة المطلوبة لنموذج OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch)(float, float, float) | إرجاع لون جديد مع قيم النصوع والصفاء ودرجة اللون المطلوبة لنموذج OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha)(float, float, float, float) | إرجاع لون جديد مع قيم النصوع والصفاء وتدرج اللون وقيم ألفا المطلوبة لنموذج OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb)(byte, byte, byte) | إرجاع لون جديد بقيم ged والأخضر والأزرق المطلوبة. يجب أن تكون جميع مكونات اللون في النطاق 0-255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_2)(float, float, float) | إرجاع لون جديد بقيم ged والأخضر والأزرق المطلوبة. يجب أن تكون كافة مكونات اللون في النطاق 0-1 . |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_1)(int, int, int) | إرجاع لون جديد بقيم ged والأخضر والأزرق المطلوبة. يجب أن تكون جميع مكونات اللون في النطاق 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba)(byte, byte, byte, byte) | إرجاع لون جديد بقيم ألفا ، الأخضر ، الأزرق ، ged المطلوبة. يجب أن تكون جميع مكونات اللون في النطاق 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_2)(float, float, float, float) | إرجاع لون جديد بقيم ألفا ، الأخضر ، الأزرق ، ged المطلوبة. يجب أن تكون جميع مكونات اللون في النطاق 0-1 . |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_1)(int, int, int, int) | إرجاع لون جديد بقيم ألفا ، الأخضر ، الأزرق ، ged المطلوبة. يجب أن تكون جميع مكونات اللون في النطاق 0-255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring)(string) | يوزع سلسلة تحتوي على لون CSS وتُرجع لونًا جديدًا. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint)(uint) | إرجاع لون جديد بقيمة ARGB المطلوبة. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity)(float) | لإنشاء نسخة من اللون مع مجموع لمعانها وقيمة دلتا. |
| [Convert](../../aspose.svg.drawing/color/convert)(ColorModel) | إرجاع مكونات اللون بتنسيق نموذج اللون المحدد. |
| override [Equals](../../aspose.svg.drawing/color/equals)(object) | تحديد ما إذا كان الملف المحدد[`Color`](../color) يساوي هذا المثال. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary)() | إرجاع لون جديد موجود على الجانب الآخر من عجلة الألوان من الأصل. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode)() | إرجاع رمز تجزئة . |
| [GetHue](../../aspose.svg.drawing/color/gethue)() | إرجاع تدرج اللون. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity)() | إرجاع لمعان اللون. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation)() | إرجاع تشبع اللون. |
| [ToInt](../../aspose.svg.drawing/color/toint)() | لتشفير مكونات Color ARGB في int. |
| [ToName](../../aspose.svg.drawing/color/toname)() | إرجاع اسم اللون إذا كان يطابق لونًا في قائمة ألوان CSS المسماة ، أو سلسلة فارغة. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring)(int) | إرجاع اللون المحدد للألوان الطبيعية (NCol) باستخدام حرف ملون مع رقم لتحديد المسافة (بالنسبة المئوية) من اللون. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring)() | إرجاع تحديد لون سداسي عشري بـ: # RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring)() | إرجاع سلسلة تحتوي على لون RGBA المحدد بواسطة: rgba (R ، G ، B ، A) . |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring)() | إرجاع لون سداسي عشري محدد بـ: # RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring)() | إرجاع سلسلة تحتوي على لون RGB المحدد بواسطة: rgb (R ، G ، B) . |
| override [ToString](../../aspose.svg.drawing/color/tostring)() | إرجاع سلسلة تتكون من قيم مكون RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint)() | ترميز مكونات Color ARGB إلى عدد صحيح غير موقعة. |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha)(float) | إنشاء نسخة من اللون بمكون ألفا محدد. |
| [WithHue](../../aspose.svg.drawing/color/withhue)(float) | لإنشاء نسخة من اللون مع تدرج اللون المحدد. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity)(float) | إنشاء نسخة من اللون بالسطوع المحدد. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation)(float) | إنشاء نسخة من اللون بالتشبع المحدد. |

### أنظر أيضا

* مساحة الاسم [Aspose.Svg.Drawing](../../aspose.svg.drawing)
* المجسم [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
