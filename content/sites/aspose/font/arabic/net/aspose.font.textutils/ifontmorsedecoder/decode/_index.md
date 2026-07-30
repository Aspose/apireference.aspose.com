---
title: "IFontMorseDecoder.Decode"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IFontMorseDecoder. تقوم بفك شفرة مورس إلى رموز الخط المحدد"
type: docs
weight: 10
url: /ar/net/aspose.font.textutils/ifontmorsedecoder/decode/
---
## Decode(string, IFont, MorseAlphabets, char, char) {#decode}

يفك شفرة مورس إلى رموز الخط المحدد.

```csharp
public GlyphId[] Decode(string morseText, IFont font, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| morseText | String | نص مشفر بشفرة مورس، أي نص مثل "... --- ..." (SOS) |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنص المفكك |
| alphabet | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المفكك |

### قيمة الإرجاع

الرموز (معرفات الرموز) المتعلقة بالنص المفكك

### انظر أيضاً

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFont](../../../aspose.font/ifont/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Decode(string, IFont, double, LineSpacingType, int, int, MorseAlphabets, char, char) {#decode_1}

يفك شفرة مورس ويرسم النتيجة بصيغة PNG.

```csharp
public Stream Decode(string morseText, IFont font, double fontSize, 
    LineSpacingType lineSpacingType, int lineSpacingValue, int maxWidth, 
    MorseAlphabets alphabet = MorseAlphabets.Latin, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| morseText | String | نص مشفر بشفرة مورس، أي نص مثل "... --- ..." (SOS) |
| الخط | IFont | الخط الذي تُؤخذ منه الرموز المتعلقة بالنص المفكك |
| fontSize | Double | حجم الخط |
| lineSpacingType | LineSpacingType | نوع تباعد الأسطر. عدد البكسلات أو نسبة من ارتفاع الخط |
| lineSpacingValue | Int32 | قيمة تباعد الأسطر |
| maxWidth | Int32 | العرض الأقصى بالبكسل للصورة |
| alphabet | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المفكك |

### قيمة الإرجاع

النص المفكك بصيغة PNG كتيار من البايتات

### انظر أيضاً

* interface [IFont](../../../aspose.font/ifont/)
* enum [LineSpacingType](../../../aspose.font.renderers/renderingutils.linespacingtype/)
* enum [MorseAlphabets](../../morsealphabets/)
* interface [IFontMorseDecoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


