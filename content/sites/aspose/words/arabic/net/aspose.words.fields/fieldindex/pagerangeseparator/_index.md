---
title: FieldIndex.PageRangeSeparator
linktitle: PageRangeSeparator
articleTitle: PageRangeSeparator
second_title: Aspose.Words لـ .NET
description: FieldIndex PageRangeSeparator ملكية. الحصول على أو تعيين تسلسل الأحرف المستخدم للفصل بين بداية نطاق الصفحات ونهايته في C#.
type: docs
weight: 130
url: /ar/net/aspose.words.fields/fieldindex/pagerangeseparator/
---
## FieldIndex.PageRangeSeparator property

الحصول على أو تعيين تسلسل الأحرف المستخدم للفصل بين بداية نطاق الصفحات ونهايته.

```csharp
public string PageRangeSeparator { get; set; }
```

## أمثلة

يوضح كيفية تحديد الصفحات الممتدة لإشارة مرجعية كنطاق صفحات لإدخال حقل INDEX.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// قم بإنشاء حقل INDEX الذي سيعرض إدخالاً لكل حقل XE موجود في المستند.
// سيعرض كل إدخال قيمة خاصية النص لحقل XE على الجانب الأيسر،
// ورقم الصفحة التي تحتوي على حقل XE على اليمين.
// سيقوم إدخال INDEX بجمع كافة حقول XE ذات القيم المطابقة في خاصية "النص".
// في إدخال واحد بدلاً من عمل إدخال لكل حقل XE.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// بالنسبة لإدخالات INDEX التي تعرض نطاقات الصفحات، يمكننا تحديد سلسلة فاصلة
// الذي سيظهر بين رقم الصفحة الأولى ورقم الصفحة الأخيرة.
index.PageNumberSeparator = ", on page(s) ";
index.PageRangeSeparator = " to ";

Assert.AreEqual(" INDEX  \\e \", on page(s) \" \\g \" to \"", index.GetFieldCode());

builder.InsertBreak(BreakType.PageBreak);
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "My entry";

// إذا قام حقل XE بتسمية إشارة مرجعية باستخدام خاصية PageRangeBookmarkName،
// سيُظهر إدخال INDEX الخاص به نطاق الصفحات التي تغطيها الإشارة المرجعية
// بدلاً من رقم الصفحة التي تحتوي على حقل XE.
indexEntry.PageRangeBookmarkName = "MyBookmark";

Assert.AreEqual(" XE  \"My entry\" \\r MyBookmark", indexEntry.GetFieldCode());
Assert.AreEqual("MyBookmark", indexEntry.PageRangeBookmarkName);

// أدخل إشارة مرجعية تبدأ في الصفحة 3 وتنتهي في الصفحة 5.
// سيعرض إدخال INDEX لحقل XE الذي يشير إلى هذه الإشارة المرجعية نطاق الصفحات هذا.
// في جدولنا، سيعرض مُدخل INDEX "إدخالي، في الصفحة (الصفحات) من 3 إلى 5".
builder.InsertBreak(BreakType.PageBreak);
builder.StartBookmark("MyBookmark");
builder.Write("Start of MyBookmark");
builder.InsertBreak(BreakType.PageBreak);
builder.InsertBreak(BreakType.PageBreak);
builder.Write("End of MyBookmark");
builder.EndBookmark("MyBookmark");

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.PageRangeBookmark.docx");
```

### أنظر أيضا

* class [FieldIndex](../)
* مساحة الاسم [Aspose.Words.Fields](../../../aspose.words.fields/)
* المجسم [Aspose.Words](../../../)
