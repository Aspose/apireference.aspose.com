---
title: Document.RevisionsView
linktitle: RevisionsView
articleTitle: RevisionsView
second_title: Aspose.Words لـ .NET
description: Document RevisionsView ملكية. الحصول على أو تعيين قيمة تشير إلى ما إذا كان سيتم العمل مع النسخة الأصلية أو المنقحة من المستند في C#.
type: docs
weight: 360
url: /ar/net/aspose.words/document/revisionsview/
---
## Document.RevisionsView property

الحصول على أو تعيين قيمة تشير إلى ما إذا كان سيتم العمل مع النسخة الأصلية أو المنقحة من المستند.

```csharp
public RevisionsView RevisionsView { get; set; }
```

## ملاحظات

القيمة الافتراضية هي .

## أمثلة

يوضح كيفية التبديل بين العرض الأصلي والمراجع للمستند.

```csharp
Document doc = new Document(MyDir + "Revisions at list levels.docx");
doc.UpdateListLabels();

ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;
Assert.AreEqual("1.", paragraphs[0].ListLabel.LabelString);
Assert.AreEqual("a.", paragraphs[1].ListLabel.LabelString);
Assert.AreEqual(string.Empty, paragraphs[2].ListLabel.LabelString);

// اعرض كائن المستند كما لو تم قبول جميع المراجعات. يدعم حاليا تسميات القائمة.
doc.RevisionsView = RevisionsView.Final;

Assert.AreEqual(string.Empty, paragraphs[0].ListLabel.LabelString);
Assert.AreEqual("1.", paragraphs[1].ListLabel.LabelString);
Assert.AreEqual("a.", paragraphs[2].ListLabel.LabelString);
```

### أنظر أيضا

* enum [RevisionsView](../../revisionsview/)
* class [Document](../)
* مساحة الاسم [Aspose.Words](../../../aspose.words/)
* المجسم [Aspose.Words](../../../)
