---
title: تعيين موضع الحاشية السفلية وموضع الملاحظة النهائية
linktitle: تعيين موضع الحاشية السفلية وموضع الملاحظة النهائية
second_title: Aspose.Words واجهة برمجة تطبيقات معالجة المستندات
description: تعرف على كيفية تعيين موضع الحواشي السفلية والتعليقات الختامية في مستندات Word باستخدام Aspose.Words لـ .NET.
type: docs
weight: 10
url: /ar/net/working-with-footnote-and-endnote/set-footnote-and-end-note-position/
---

في هذا البرنامج التعليمي خطوة بخطوة، سنرشدك حول كيفية استخدام Aspose.Words لـ .NET لتعيين موضع الحواشي السفلية والتعليقات الختامية في مستند Word. سنشرح لك كود مصدر C# المقدم ونوضح لك كيفية تنفيذه في مشاريعك الخاصة.

 للبدء، تأكد من تثبيت Aspose.Words for .NET وإعداده في بيئة التطوير لديك. إذا لم تكن قد قمت بذلك، قم بتنزيل المكتبة وتثبيتها من[Aspose.Releases]https://releases.aspose.com/words/net/.

## الخطوة 1: تهيئة كائن المستند

 أولاً، قم بتهيئة`Document` كائن من خلال توفير المسار إلى المستند المصدر الخاص بك:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";     
Document doc = new Document(dataDir + "Document.docx");
```

## الخطوة 2: تحديد موضع الحاشية السفلية والتعليق الختامي

 بعد ذلك، قم بالوصول إلى`FootnoteOptions` و`EndnoteOptions` خصائص المستند لتعيين موضع الحواشي السفلية والتعليقات الختامية. في هذا المثال، قمنا بتعيين موضع الحواشي السفلية ليكون أسفل النص وموضع الحواشي الختامية ليكون في نهاية القسم:

```csharp
doc.FootnoteOptions.Position = FootnotePosition.BeneathText;
doc.EndnoteOptions.Position = EndnotePosition.EndOfSection;
```

## الخطوة 3: حفظ المستند

وأخيرا، احفظ الوثيقة المعدلة:

```csharp
doc.Save(dataDir + "WorkingWithFootnotes.SetFootnoteAndEndNotePosition.docx");
```

هذا كل شيء! لقد نجحت في تعيين موضع الحواشي السفلية والتعليقات الختامية في مستند Word باستخدام Aspose.Words لـ .NET.

### مثال على التعليمات البرمجية المصدر لتعيين موضع الحواشي السفلية والتعليقات الختامية باستخدام Aspose.Words لـ .NET

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";     
Document doc = new Document(dataDir + "Document.docx");

doc.FootnoteOptions.Position = FootnotePosition.BeneathText;
doc.EndnoteOptions.Position = EndnotePosition.EndOfSection;

doc.Save(dataDir + "WorkingWithFootnotes.SetFootnoteAndEndNotePosition.docx");
```

لا تتردد في استخدام هذا الرمز في مشاريعك الخاصة وتعديله وفقًا لمتطلباتك المحددة.

### الأسئلة الشائعة

#### س: كيف يمكنني وضع الحواشي السفلية والتعليقات الختامية في Aspose.Words؟

 ج: لوضع الحواشي السفلية والتعليقات الختامية في Aspose.Words، تحتاج إلى استخدام`FootnoteOptions` الطبقة و`Position` ملكية. يمكنك تعيين هذه الخاصية إلى أي قيمة تريدها، مثل`BottomOfPage` (في أسفل الصفحة) أو`EndOfSection`(في نهاية القسم).

#### س: هل من الممكن تخصيص موضع الحواشي السفلية والتعليقات الختامية لكل صفحة أو قسم من المستند؟

ج: نعم، من الممكن تخصيص موضع الحواشي السفلية والتعليقات الختامية لكل صفحة أو قسم من المستند. يمكنك استخدام قسم Aspose.Words وأساليب معالجة الصفحة لتحديد مواضع محددة للحواشي السفلية والتعليقات الختامية.

#### س: كيف يمكنني إزالة الحواشي السفلية أو التعليقات الختامية من المستند؟

 ج: لإزالة الحواشي السفلية أو التعليقات الختامية من مستند في Aspose.Words، يمكنك استخدام الطرق المناسبة مثل`RemoveAllFootnotes` لإزالة كافة الحواشي السفلية أو`RemoveAllEndnotes` لإزالة كافة الحواشي الختامية. تأكد من حفظ المستند بعد إجراء هذه العمليات.

#### س: هل يمكن وضع الحواشي السفلية والتعليقات الختامية خارج هوامش الصفحة؟

لا، افتراضيًا لا يمكن وضع الحواشي السفلية والتعليقات الختامية خارج هوامش الصفحة في Aspose.Words. ومع ذلك، يمكنك ضبط هوامش المستند للسماح بمساحة أكبر للحواشي السفلية والتعليقات الختامية إذا لزم الأمر.

#### س: هل يمكن تخصيص الحواشي السفلية والتعليقات الختامية باستخدام أنماط خطوط أو تنسيقات معينة؟

ج: نعم، يمكنك تخصيص الحواشي السفلية والتعليقات الختامية بخط محدد أو أنماط تنسيق في Aspose.Words. يمكنك استخدام الأساليب والخصائص المتاحة لتطبيق أنماط الخطوط والألوان وأحجام الخطوط وما إلى ذلك الحواشي السفلية والتعليقات الختامية.