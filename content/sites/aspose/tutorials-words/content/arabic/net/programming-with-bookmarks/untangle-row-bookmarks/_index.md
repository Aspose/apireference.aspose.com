---
title: فك تشابك الإشارات المرجعية في مستند Word
linktitle: فك تشابك الإشارات المرجعية في مستند Word
second_title: Aspose.Words واجهة برمجة تطبيقات معالجة المستندات
description: تعرف على كيفية فك تشابك الإشارات المرجعية للصفوف المتداخلة في مستند Word لإزالة صفوف معينة دون التأثير على الإشارات المرجعية الأخرى.
type: docs
weight: 10
url: /ar/net/programming-with-bookmarks/untangle-row-bookmarks/
---

في هذه المقالة، سنستكشف التعليمات البرمجية المصدر لـ C# أعلاه لفهم كيفية استخدام وظيفة Untangle Row Bookmarks في مكتبة Aspose.Words for .NET. تتيح هذه الوظيفة إمكانية وضع نهايات الإشارات المرجعية للسطور في نفس سطر بدايات الإشارات المرجعية.

## المتطلبات الأساسية

- المعرفة الأساسية بلغة C#.
- بيئة تطوير .NET مع تثبيت مكتبة Aspose.Words.

## الخطوة 1: تحميل الوثيقة

 نحن نستخدم ال`Document` فئة لتحميل المستند الموجود من ملف:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Table column bookmarks.docx");
```

## الخطوة 2: كشف الإشارات المرجعية للخط

 نحن نستخدم ال`Untangle` وظيفة لفك الإشارات المرجعية من الصفوف. تقوم هذه الوظيفة بتنفيذ المهمة المخصصة المتمثلة في وضع نهايات سطور الإشارة المرجعية في نفس السطر الذي تبدأ فيه الإشارة المرجعية:

```csharp
Untangle(doc);
```

## الخطوة 3: حذف السطر حسب الإشارة المرجعية

 نحن نستخدم ال`DeleteRowByBookmark` وظيفة لحذف صف معين من خلال الإشارة المرجعية الخاصة به:

```csharp
DeleteRowByBookmark(doc, "ROW2");
```

## الخطوة 4: التحقق من سلامة الإشارات المرجعية الأخرى

نتحقق من عدم تلف الإشارات المرجعية الأخرى عن طريق التحقق مما إذا كانت نهاية الإشارة المرجعية لا تزال موجودة:

```csharp
if (doc.Range.Bookmarks["ROW1"].BookmarkEnd == null)
throw new Exception("Wrong, the end of the bookmark was deleted.");

doc.Save(dataDir + "WorkingWithBookmarks.UntangleRowBookmarks.docx");
```

### مثال على التعليمات البرمجية المصدر لـ Untangle Row Bookmarks باستخدام Aspose.Words لـ .NET**

فيما يلي نموذج التعليمات البرمجية المصدر الكامل لفك تشابك الإشارات المرجعية من الأسطر التي تستخدم Aspose.Words لـ .NET:


```csharp

	// المسار إلى دليل المستندات.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Table column bookmarks.docx");

	//يؤدي هذا إلى تنفيذ المهمة المخصصة المتمثلة في وضع نهايات الإشارة المرجعية للصف في نفس الصف مع بدء الإشارة المرجعية.
	Untangle(doc);

	// يمكننا الآن بسهولة حذف الصفوف حسب الإشارة المرجعية دون الإضرار بالإشارات المرجعية لأي صف آخر.
	DeleteRowByBookmark(doc, "ROW2");

	// هذا فقط للتأكد من عدم تلف الإشارة المرجعية الأخرى.
	if (doc.Range.Bookmarks["ROW1"].BookmarkEnd == null)
		throw new Exception("Wrong, the end of the bookmark was deleted.");

	doc.Save(dataDir + "WorkingWithBookmarks.UntangleRowBookmarks.docx");

```

## خاتمة

في هذه المقالة، قمنا باستكشاف التعليمات البرمجية المصدر لـ C# لفهم كيفية استخدام ميزة Untangle Row Bookmarks في Aspose.Words for .NET. لقد اتبعنا دليلًا خطوة بخطوة لفك تشابك الإشارات المرجعية للصف وحذف صف معين دون الإضرار بالإشارات المرجعية الأخرى.

### الأسئلة الشائعة حول فك تشابك الإشارات المرجعية في مستند Word

#### س: هل يعمل Unscramble Row Bookmarks فقط مع الإشارات المرجعية للصفوف في الجداول؟

ج: نعم، تم تصميم ميزة Untangle Row Bookmarks خصيصًا لفك تشابك الإشارات المرجعية للصفوف الموجودة في الجداول. يمكن استخدام هذه الوظيفة لمعالجة الإشارات المرجعية الخطية في المصفوفات والتأكد من أن نهايات الإشارة المرجعية في نفس السطر الذي تبدأ فيه الإشارة المرجعية.

#### س: هل تقوم وظيفة Unscramble Line Bookmarks بتعديل محتوى المستند الأصلي؟

ج: نعم، تعمل وظيفة فك تشفير الإشارات المرجعية على تعديل المستند الأصلي عن طريق تحريك نهايات إشارات السطر لوضعها في نفس السطر مثل بدايات الإشارات المرجعية. تأكد من حفظ نسخة احتياطية من المستند قبل تطبيق هذه الميزة.

#### س: كيف يمكنني تحديد الإشارات المرجعية الخطية في مستند Word الخاص بي؟

ج: يتم عادةً استخدام الإشارات المرجعية للصفوف في الجداول لوضع علامة على أقسام معينة. يمكنك تحديد الإشارات المرجعية للصف من خلال استعراض الإشارات المرجعية في المستند والتحقق لمعرفة ما إذا كانت الإشارات المرجعية موجودة في صفوف الجدول.

#### س: هل من الممكن فك تشابك الإشارات المرجعية في الجداول غير المتجاورة؟

ج: تم تصميم وظيفة Untangle Row Bookmarks كما هو موضح في هذه المقالة لفك تشابك الإشارات المرجعية للصفوف في الجداول المجاورة. لفك تشابك الإشارات المرجعية للصفوف في الجداول غير المتجاورة، قد يلزم إجراء تعديلات إضافية على التعليمات البرمجية اعتمادًا على بنية المستند.

#### س: ما هي المعالجات الأخرى التي يمكنني إجراؤها على الإشارات المرجعية للصفوف بمجرد كشفها؟

ج: بمجرد كشف الإشارات المرجعية للخط، يمكنك إجراء عمليات معالجة مختلفة حسب الحاجة. قد يشمل ذلك تحرير المحتوى أو حذفه أو إضافته إلى الأسطر التي تم وضع إشارة مرجعية عليها. تأكد من التعامل مع الإشارات المرجعية الخطية بعناية لتجنب أي تأثير غير مرغوب فيه على بقية المستند.