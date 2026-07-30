---
title: "IMorseEncoder.Encode"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "طريقة IMorseEncoder. تقوم بترميز النص إلى شفرة مورس"
type: docs
weight: 10
url: /ar/net/aspose.font.textutils/imorseencoder/encode/
---
## Encode(string, MorseAlphabets, char, char) {#encode}

يقوم بترميز النص باستخدام شفرة مورس.

```csharp
public string Encode(string text, MorseAlphabets alphabet, char inputSeparator = ' ', 
    char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| alphabet | MorseAlphabets | أبجدية شفرة مورس |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

النص المشفر، مثال "... --- ..." للنص المدخل "SOS"

### انظر أيضاً

* enum [MorseAlphabets](../../morsealphabets/)
* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)

---

## Encode(string, char, char) {#encode_1}

يقوم بترميز النص باستخدام شفرة مورس. يتم استخدام التحليل الاستدلالي لحساب أبجدية النص المدخل. يتم اختيار الأبجدية بناءً على الكلمة الأولى.

```csharp
public string Encode(string text, char inputSeparator = ' ', char outputSeparator = '/')
```

| معامل | نوع | الوصف |
| --- | --- | --- |
| نص | String | النص المراد ترميزه إلى شفرة مورس |
| inputSeparator | Char | الرمز المستخدم لفصل الكلمات في النص المدخل |
| outputSeparator | Char | رمز يستخدم لفصل الكلمات في النص المشفر |

### قيمة الإرجاع

النص المشفر، مثال "... --- ..." للنص المدخل "SOS"

### انظر أيضاً

* interface [IMorseEncoder](../)
* namespace [Aspose.Font.TextUtils](../../../aspose.font.textutils/)
* assembly [Aspose.Font](../../../)


