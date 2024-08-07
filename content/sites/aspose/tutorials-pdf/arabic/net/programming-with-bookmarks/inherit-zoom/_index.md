---
title: وراثة تكبير في ملف PDF
linktitle: وراثة تكبير في ملف PDF
second_title: Aspose.PDF لمرجع .NET API
description: ورث بسهولة الإشارة المرجعية في ملف PDF باستخدام Aspose.PDF لـ .NET.
type: docs
weight: 90
url: /ar/net/programming-with-bookmarks/inherit-zoom/
---
يتيح لك توريث التكبير في ملف PDF تحديد مستوى تكبير افتراضي للإشارات المرجعية. باستخدام Aspose.PDF for .NET ، يمكنك بسهولة وراثة التكبير باتباع التعليمات البرمجية المصدر التالية:

## الخطوة 1: استيراد المكتبات المطلوبة

قبل أن تبدأ ، تحتاج إلى استيراد المكتبات اللازمة لمشروع C # الخاص بك. فيما يلي توجيه الاستيراد الضروري:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.InteractiveFeatures;
```

## الخطوة 2: حدد المسار إلى مجلد المستندات

 في هذه الخطوة ، تحتاج إلى تحديد المسار إلى المجلد الذي يحتوي على ملف PDF الذي تريد أن ترث التكبير منه. يستبدل`"YOUR DOCUMENT DIRECTORY"`في الكود التالي بالمسار الفعلي لمجلد المستندات الخاص بك:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## الخطوة 3: افتح مستند PDF

سنقوم الآن بفتح مستند PDF الذي نريد أن نرث التكبير باستخدام الكود التالي:

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

## الخطوة 4: احصل على مجموعة الإشارات المرجعية

 في هذه الخطوة ، سنحصل على مجموعة من الإشارات المرجعية أو معالم المستند باستخدام امتداد`Outlines` ممتلكات`doc` هدف. هذا هو الكود المقابل:

```csharp
OutlineItemCollection item = new OutlineItemCollection(doc.Outlines);
```

## الخطوة 5: تعيين مستوى التكبير

 الآن سنقوم بتعيين مستوى التكبير / التصغير عن طريق إنشاء ملف`XYZExplicitDestination` كائن بإحداثيات x و y و z المحددة. هنا نستخدم الإحداثيات (100 ، 100 ، 0) بتكبير 2. وهنا الكود المقابل:

```csharp
XYZExplicitDestination dest = new XYZExplicitDestination(2, 100, 100, 0);
```

## الخطوة 6: إضافة مستوى التكبير إلى الإشارات المرجعية

 في هذه الخطوة ، نضيف`XYZExplicitDestination` كإجراء على الإشارات المرجعية لـ`item` مجموعة. هذا هو الكود المقابل:

```csharp
item. Action = new GoToAction(dest);
```

## الخطوة 7: أضف الإشارات المرجعية المحدثة إلى المستند

 أخيرًا ، نضيف الإشارات المرجعية المحدثة إلى مجموعة الإشارات المرجعية للمستند باستخدام امتداد`Add` طريقة`doc.Outlines` هدف. هذا هو الكود المقابل:

```csharp
doc. Outlines. Add(item);
```

## الخطوة 8: احفظ الملف المحدث

 الآن دعنا نحفظ ملف PDF المحدث باستخدام امتداد`Save` طريقة`doc` هدف. هذا هو الكود المقابل:

```csharp
dataDir = dataDir + "InheritZoom_out.pdf";
doc.Save(dataDir);
```

### عينة من التعليمات البرمجية المصدر لـ Inherit Zoom باستخدام Aspose.PDF لـ .NET 
```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// افتح المستند
Document doc = new Document(dataDir + "input.pdf");
// احصل على مخططات / مجموعة إشارات مرجعية لملف PDF
OutlineItemCollection item = new OutlineItemCollection(doc.Outlines);
// اضبط مستوى التكبير على 0
XYZExplicitDestination dest = new XYZExplicitDestination(2, 100, 100, 0);
// أضف XYZExplicitDestination كإجراء لتحديد مجموعة من ملفات PDF
item.Action = new GoToAction(dest);
// أضف عنصرًا إلى مجموعة الخطوط العريضة لملف PDF
doc.Outlines.Add(item);
dataDir = dataDir + "InheritZoom_out.pdf";
// حفظ الإخراج
doc.Save(dataDir);
Console.WriteLine("\nBookmarks updated successfully.\nFile saved at " + dataDir);
```

## خاتمة

تهنئة ! الآن لديك دليل خطوة بخطوة لـ Inherit Zoom باستخدام Aspose.PDF for .NET. يمكنك استخدام هذا الرمز لتحديد مستوى التكبير الافتراضي للإشارات المرجعية في مستندات PDF الخاصة بك.

تأكد من إطلاعك على وثائق Aspose.PDF الرسمية لمزيد من المعلومات حول ميزات معالجة الإشارات المرجعية المتقدمة.

### الأسئلة الشائعة لوراثة التكبير في ملف PDF

#### س: ما هو تكبير التوريث في ملف PDF؟

ج: يشير توريث التكبير إلى القدرة على تحديد مستوى تكبير افتراضي للإشارات المرجعية في مستند PDF. وهذا يسمح بالتنقل المتسق وسهل الاستخدام عندما يتفاعل المستخدمون مع الإشارات المرجعية.

#### س: لماذا أرغب في اكتساب مستويات التكبير للإشارات المرجعية؟

ج: إن وراثة مستويات التكبير / التصغير تضمن للمستخدمين تجربة عرض متسقة عند التنقل عبر الإشارات المرجعية في مستند PDF. يمكن أن يكون مفيدًا بشكل خاص عندما تريد توفير طريقة عرض محددة لأقسام مختلفة من المستند.

#### س: كيف يمكنني استيراد المكتبات اللازمة لمشروع C # الخاص بي؟

ج: لاستيراد المكتبات المطلوبة لمشروع C # ، قم بتضمين توجيهات الاستيراد التالية:

```csharp
using Aspose.Pdf;
using Aspose.Pdf.InteractiveFeatures;
```

تتيح لك هذه التوجيهات الوصول إلى الفئات والطرق اللازمة للعمل مع مستندات PDF والإشارات المرجعية.

#### س: كيف يمكنني تحديد المسار إلى مجلد المستندات؟

 ج: في كود المصدر المقدم ، استبدل`"YOUR DOCUMENT DIRECTORY"` بالمسار الفعلي للمجلد الذي يحتوي على ملف PDF الذي تريد أن ترث مستويات التكبير / التصغير الخاصة به.

#### س: كيف أقوم بفتح مستند PDF لاكتساب مستويات التكبير / التصغير؟

ج: لفتح مستند PDF لتوارث مستويات التكبير ، استخدم الكود التالي:

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

 يستبدل`"input.pdf"` مع اسم الملف الفعلي.

#### س: كيف يمكنني ضبط مستوى التكبير / التصغير للإشارات المرجعية؟

 ج: لتعيين مستوى التكبير / التصغير ، قم بإنشاء ملف`XYZExplicitDestination` مع الإحداثيات المطلوبة وعامل التكبير / التصغير. هذا مثال:

```csharp
XYZExplicitDestination dest = new XYZExplicitDestination(2, 100, 100, 0);
```

هذا يضبط مستوى التكبير / التصغير على 2 عند الإحداثيات (100 ، 100).

#### س: كيف أضيف مستوى التكبير / التصغير إلى الإشارات المرجعية؟

 ج: أضف ملف`XYZExplicitDestination` كإجراء لمجموعة الإشارات المرجعية:

```csharp
item.Action = new GoToAction(dest);
```

 أين`item` هو`OutlineItemCollection` تمثل إشارة مرجعية.

#### س: كيف أحفظ ملف PDF المحدث؟

 ج: احفظ ملف PDF المحدث باستخدام امتداد`Save` طريقة`doc` هدف:

```csharp
dataDir = dataDir + "InheritZoom_out.pdf";
doc.Save(dataDir);
```

#### س: هل يمكنني تخصيص مستويات التكبير / التصغير لإشارات مرجعية مختلفة؟

 ج: نعم ، يمكنك تخصيص مستويات التكبير / التصغير لإشارات مرجعية مختلفة عن طريق إنشاء عدة إشارات مرجعية`XYZExplicitDestination` كائنات ذات إحداثيات مختلفة وعوامل تكبير.

#### س: هل هناك حد لعدد الإشارات المرجعية التي يمكنني تطبيق توريث التكبير عليها؟

ج: لا يوجد عادةً حد صارم لعدد الإشارات المرجعية التي يمكنك تطبيق توريث التكبير عليها. ومع ذلك ، قد تتطلب المستندات الكبيرة جدًا التي تحتوي على عدد كبير من الإشارات المرجعية إدارة فعالة للذاكرة.

#### س: كيف يمكنني تأكيد تطبيق توريث التكبير / التصغير؟

ج: افتح ملف PDF الذي تم إنشاؤه للتحقق من أن مستويات التكبير المحددة قد تم توارثها بواسطة الإشارات المرجعية.