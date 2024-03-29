---
title: Table.RelativeVerticalAlignment
linktitle: RelativeVerticalAlignment
articleTitle: RelativeVerticalAlignment
second_title: Aspose.Words لـ .NET
description: Table RelativeVerticalAlignment ملكية. الحصول على أو تعيين المحاذاة العمودية النسبية للجدول العائم في C#.
type: docs
weight: 240
url: /ar/net/aspose.words.tables/table/relativeverticalalignment/
---
## Table.RelativeVerticalAlignment property

الحصول على أو تعيين المحاذاة العمودية النسبية للجدول العائم.

```csharp
public VerticalAlignment RelativeVerticalAlignment { get; set; }
```

## أمثلة

يوضح كيفية ضبط موقع الجداول العائمة.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Table table = builder.StartTable();
builder.InsertCell();
builder.Write("Table 1, cell 1");
builder.EndTable();
table.PreferredWidth = PreferredWidth.FromPoints(300);

// قم بتعيين موقع الجدول في مكان على الصفحة، مثل، في هذه الحالة، الزاوية اليمنى السفلية.
table.RelativeVerticalAlignment = VerticalAlignment.Bottom;
table.RelativeHorizontalAlignment = HorizontalAlignment.Right;

table = builder.StartTable();
builder.InsertCell();
builder.Write("Table 2, cell 1");
builder.EndTable();
table.PreferredWidth = PreferredWidth.FromPoints(300);

 // يمكننا أيضًا تعيين إزاحة أفقية ورأسية في النقاط من موقع الفقرة حيث قمنا بإدراج الجدول.
table.AbsoluteVerticalDistance = 50;
table.AbsoluteHorizontalDistance = 100;

doc.Save(ArtifactsDir + "Table.ChangeFloatingTableProperties.docx");
```

### أنظر أيضا

* enum [VerticalAlignment](../../../aspose.words.drawing/verticalalignment/)
* class [Table](../)
* مساحة الاسم [Aspose.Words.Tables](../../../aspose.words.tables/)
* المجسم [Aspose.Words](../../../)
