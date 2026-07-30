---
title: "IFontMorseEncoder.Encode"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontMorseEncoder. تقوم بترميز النص إلى شفرة مورس وتعيد النتيجة كمجموعة من معرفات الرموز"
type: docs
weight: 10
url: /ar/net/aspose.font.textutils/ifontmorseencoder/encode/
---
## Encode(string, IFont, MorseAlphabets, char, char) {#encode}

يقوم بترميز النص بشفرة مورس ويعيد النتيجة كمجموعة من الرموز (معرفات الرموز).

```csharp
public GlyphId[] Encode(string text, IFont font, MorseAlphabets alphabet, 
    char inputSeparator = ' ', char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنقاط والشرطات |
| alphabet | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

الرموز(glyphId) المتعلقة بالنص المشفر، مثال "... --- ..." للنص المدخل "SOS"

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, char, char) {#encode_1}

يقوم بترميز النص بشفرة مورس ويعيد النتيجة كمجموعة من الرموز (glyphId). يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل.

```csharp
public GlyphId[] Encode(string text, IFont font, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنقاط والشرطات |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

الرموز(glyphId) المتعلقة بالنص المشفر، مثال "... --- ..." للنص المدخل "SOS"

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#encode_2}

يقوم بترميز النص بشفرة مورس ويرسم النتيجة بصيغة PNG.

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنقاط والشرطات |
| fontSize | Double | حجم الخط |
| lineSpacingType | LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | Int32 | قيمة تباعد الأسطر |
| maxWidth | Int32 | العرض الأقصى بالبكسل للصورة |
| alphabet | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

النص، المشفر إلى شفرة مورس، بصيغة PNG كتيار من البايتات

### انظر أيضاً

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, IFont, double, LineSpacingType, int, int, char, char) {#encode_3}

يقوم بترميز النص بشفرة مورس ويرسم النتيجة بصيغة PNG. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل.

```csharp
public Stream Encode(string text, IFont font, double fontSize, LineSpacingType lineSpacingType, 
    int lineSpacingValue, int maxWidth, char inputSeparator = ' ', char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنقاط والشرطات |
| fontSize | Double | حجم الخط |
| lineSpacingType | LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | Int32 | قيمة تباعد الأسطر |
| maxWidth | Int32 | العرض الأقصى بالبكسل للصورة |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

النص، المشفر إلى شفرة مورس، بصيغة PNG كتيار من البايتات

### انظر أيضاً

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* interface [IFontMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


