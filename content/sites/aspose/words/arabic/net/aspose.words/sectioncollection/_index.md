---
title: SectionCollection Class
linktitle: SectionCollection
articleTitle: SectionCollection
second_title: Aspose.Words لـ .NET
description: Aspose.Words.SectionCollection فصل. مجموعة منSection الكائنات الموجودة في المستند في C#.
type: docs
weight: 5740
url: /ar/net/aspose.words/sectioncollection/
---
## SectionCollection class

مجموعة من[`Section`](../section/) الكائنات الموجودة في المستند.

لمعرفة المزيد، قم بزيارة[العمل مع الأقسام](https://docs.aspose.com/words/net/working-with-sections/) مقالة توثيقية.

```csharp
public class SectionCollection : NodeCollection
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Count](../../aspose.words/nodecollection/count/) { get; } | الحصول على عدد العقد في المجموعة. |
| [Item](../../aspose.words/sectioncollection/item/) { get; } | استرداد قسم في الفهرس المحدد. (2 indexers) |

## طُرق

| اسم | وصف |
| --- | --- |
| [Add](../../aspose.words/nodecollection/add/)(*[Node](../node/)*) | إضافة عقدة إلى نهاية المجموعة. |
| [Clear](../../aspose.words/nodecollection/clear/)() | إزالة كافة العقد من هذه المجموعة ومن المستند. |
| [Contains](../../aspose.words/nodecollection/contains/)(*[Node](../node/)*) | تحديد ما إذا كانت العقدة موجودة في المجموعة. |
| [GetEnumerator](../../aspose.words/nodecollection/getenumerator/)() | يوفر تكرارًا بسيطًا لنمط "foreach" عبر مجموعة العقد. |
| [IndexOf](../../aspose.words/nodecollection/indexof/)(*[Node](../node/)*) | إرجاع الفهرس الصفري للعقدة المحددة. |
| [Insert](../../aspose.words/nodecollection/insert/)(*int, [Node](../node/)*) | إدراج عقدة في المجموعة في الفهرس المحدد. |
| [Remove](../../aspose.words/nodecollection/remove/)(*[Node](../node/)*) | إزالة العقدة من المجموعة ومن المستند. |
| [RemoveAt](../../aspose.words/nodecollection/removeat/)(*int*) | إزالة العقدة الموجودة في الفهرس المحدد من المجموعة ومن المستند. |
| [ToArray](../../aspose.words/sectioncollection/toarray/#toarray_1)() | نسخ كافة الأقسام من المجموعة إلى مجموعة جديدة من الأقسام. (2 methods) |

## ملاحظات

يمكن أن يحتوي مستند Microsoft Word على أقسام متعددة. لإنشاء قسم في Microsoft Word، حدد أمر إدراج/فاصل وحدد نوع الفاصل. يحدد الفاصل ما إذا كان القسم يبدأ في صفحة جديدة أو في نفس الصفحة.

يمكن استخدام إدراج المقاطع وإزالتها برمجيًا لتخصيص المستندات التي تم إنتاجها أثناء دمج البريد. إذا كان المستند يحتاج إلى محتوى أو أجزاء مختلفة من محتوى بناءً على بعض المعايير، فيمكنك إنشاء مستند "رئيسي" يحتوي على أقسام متعددة وحذف بعض الأقسام قبل دمج البريد أو بعده.

## أمثلة

يوضح كيفية إضافة وإزالة الأقسام في المستند.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Section 1");
builder.InsertBreak(BreakType.SectionBreakNewPage);
builder.Write("Section 2");

Assert.AreEqual("Section 1\x000cSection 2", doc.GetText().Trim());

// احذف القسم الأول من المستند.
doc.Sections.RemoveAt(0);

Assert.AreEqual("Section 2", doc.GetText().Trim());

// إلحاق نسخة مما هو الآن القسم الأول بنهاية المستند.
int lastSectionIdx = doc.Sections.Count - 1;
Section newSection = doc.Sections[lastSectionIdx].Clone();
doc.Sections.Add(newSection);

Assert.AreEqual("Section 2\x000cSection 2", doc.GetText().Trim());
```

### أنظر أيضا

* class [NodeCollection](../nodecollection/)
* مساحة الاسم [Aspose.Words](../../aspose.words/)
* المجسم [Aspose.Words](../../)
