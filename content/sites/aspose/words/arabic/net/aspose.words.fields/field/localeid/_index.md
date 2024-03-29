---
title: Field.LocaleId
linktitle: LocaleId
articleTitle: LocaleId
second_title: Aspose.Words لـ .NET
description: Field LocaleId ملكية. الحصول على أو تعيين LCID الخاص بالحقل في C#.
type: docs
weight: 60
url: /ar/net/aspose.words.fields/field/localeid/
---
## Field.LocaleId property

الحصول على أو تعيين LCID الخاص بالحقل.

```csharp
public int LocaleId { get; set; }
```

## أمثلة

يوضح كيفية إدراج حقل والتعامل مع الإعدادات المحلية الخاصة به.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// أدخل حقل التاريخ، ثم اطبع التاريخ الذي سيعرضه.
// تحدد الثقافة الحالية لموضوعك تنسيق التاريخ.
Field field = builder.InsertField(@"DATE");
Console.WriteLine($"Today's date, as displayed in the \"{CultureInfo.CurrentCulture.EnglishName}\" culture: {field.Result}");

Assert.AreEqual(1033, field.LocaleId);
// سيؤثر تغيير ثقافة موضوعنا على نتيجة حقل التاريخ.
// هناك طريقة أخرى للحصول على حقل التاريخ لعرض تاريخ في ثقافة مختلفة وهي استخدام خاصية LocaleId الخاصة به.
// تتيح لنا هذه الطريقة تجنب تغيير ثقافة الخيط للحصول على هذا التأثير.
doc.FieldOptions.FieldUpdateCultureSource = FieldUpdateCultureSource.FieldCode;
CultureInfo de = new CultureInfo("de-DE");
field.LocaleId = de.LCID;
field.Update();

Console.WriteLine($"Today's date, as displayed according to the \"{CultureInfo.GetCultureInfo(field.LocaleId).EnglishName}\" culture: {field.Result}");
```

### أنظر أيضا

* class [Field](../)
* مساحة الاسم [Aspose.Words.Fields](../../../aspose.words.fields/)
* المجسم [Aspose.Words](../../../)
