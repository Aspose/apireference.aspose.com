---
title: تغيير الاتجاه
linktitle: تغيير الاتجاه
second_title: Aspose.PDF لمرجع .NET API
description: دليل خطوة بخطوة لتغيير اتجاه صفحة PDF باستخدام Aspose.PDF for .NET. سهولة المتابعة والتنفيذ في مشاريعك.
type: docs
weight: 10
url: /ar/net/programming-with-pdf-pages/change-orientation/
---
في هذا البرنامج التعليمي ، سنرشدك خلال العملية خطوة بخطوة لتغيير اتجاه الصفحة لمستند PDF باستخدام Aspose.PDF for .NET. سنشرح الكود المصدري C # المجمّع ونزودك بدليل شامل لمساعدتك على فهم هذه الميزة وتنفيذها في مشاريعك الخاصة. في نهاية هذا البرنامج التعليمي ، ستعرف كيفية تغيير اتجاه الصفحة لمستندات PDF الخاصة بك باستخدام Aspose.PDF for .NET.

## المتطلبات الأساسية
قبل أن تبدأ ، تأكد من أن لديك ما يلي:

- معرفة أساسية بلغة البرمجة C #
- تم تثبيت Aspose.PDF for .NET في بيئة التطوير الخاصة بك

## الخطوة 1: تحديد دليل المستند
أولاً ، تحتاج إلى تعيين المسار إلى دليل المستندات الخاص بك. هذا هو المكان الذي يوجد به ملف PDF الذي تم إدخاله والمكان الذي تريد حفظ ملف PDF الناتج المعدل فيه. استبدل "دليل المستندات" بالمسار المناسب.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## الخطوة 2: قم بتحميل مستند PDF
 ثم يمكنك تحميل مستند PDF من ملف الإدخال باستخدام امتداد`Document` فئة Aspose.PDF. تأكد من تحديد المسار الصحيح لملف PDF.

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

## الخطوة 3: تغيير اتجاه الصفحة
سنقوم الآن بالمرور على كل صفحة من الوثيقة وتغيير اتجاهها. لكل صفحة نقوم بتعديل أبعاد صندوق الوسائط (`MediaBox`) من خلال تبديل العرض والارتفاع ، ثم نقوم بتعديل إحداثيات مربع الوسائط للحفاظ على موضع الصفحة. أخيرًا ، قمنا بتعيين تدوير الصفحة على 90 درجة.

```csharp
foreach(Page page in doc.Pages)
{
Aspose.Pdf.Rectangle r = page.MediaBox;
double newHeight = r.Width;
double newWidth = r.Height;
double newLLX = r.LLX;
double newLLY = r.LLY + (r.Height - newHeight);
page.MediaBox = new Aspose.Pdf.Rectangle(newLLX, newLLY, newLLX + newWidth, newLLY + newHeight);
page.CropBox = new Aspose.Pdf.Rectangle(newLLX, newLLY, newLLX + newWidth, newLLY + newHeight);
page. Rotate = Rotate. on90;
}
```

## الخطوة 4: احفظ مستند PDF المعدل
 أخيرًا ، يمكنك حفظ مستند PDF المعدل في ملف ناتج باستخدام امتداد`Save()` طريقة`Document`فصل. تأكد من تحديد المسار الصحيح واسم الملف.

```csharp
dataDir = dataDir + "ChangeOrientation_out.pdf";
doc.Save(dataDir);
```

### نموذج التعليمات البرمجية المصدر لتغيير الاتجاه باستخدام Aspose.PDF لـ .NET 

```csharp

// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "input.pdf");
foreach (Page page in doc.Pages)
{
	Aspose.Pdf.Rectangle r = page.MediaBox;
	double newHeight = r.Width;
	double newWidth = r.Height;
	double newLLX = r.LLX;
	// يجب علينا تحريك الصفحة لأعلى لتعويض تغيير حجم الصفحة
	// (الحافة السفلية للصفحة هي 0،0 ويتم وضع المعلومات عادةً من ملف
	// أعلى الصفحة. هذا هو السبب في أننا نقلنا حافة الحبيب إلى الأعلى على الفرق بينهما
	// الارتفاع القديم والجديد.
	double newLLY = r.LLY + (r.Height - newHeight);
	page.MediaBox = new Aspose.Pdf.Rectangle(newLLX, newLLY, newLLX + newWidth, newLLY + newHeight);
	// في بعض الأحيان نحتاج أيضًا إلى تعيين CropBox (إذا تم تعيينه في الملف الأصلي)
	page.CropBox = new Aspose.Pdf.Rectangle(newLLX, newLLY, newLLX + newWidth, newLLY + newHeight);
	// ضبط زاوية دوران الصفحة
	page.Rotate = Rotation.on90;
}
dataDir = dataDir + "ChangeOrientation_out.pdf";
// حفظ ملف الإخراج
doc.Save(dataDir);
System.Console.WriteLine("\nPage orientation changed successfully.\nFile saved at " + dataDir);

```

## خاتمة
في هذا البرنامج التعليمي ، تعلمنا كيفية تغيير اتجاه الصفحة لمستند PDF باستخدام Aspose.PDF for .NET. باتباع الخطوات الموضحة أعلاه ، يمكنك بسهولة تنفيذ هذه الوظيفة في مشاريعك الخاصة. لا تتردد في استكشاف وثائق Aspose.PDF لاكتشاف الميزات المفيدة الأخرى للعمل مع ملفات PDF.

### التعليمات

#### س: ما هو الغرض من تغيير اتجاه الصفحة في مستند PDF؟

ج: يتيح لك تغيير اتجاه الصفحة في مستند PDF تدوير محتوى الصفحة بمقدار 90 درجة. يمكن أن يكون هذا مفيدًا في السيناريوهات التي يلزم فيها عرض المحتوى الأصلي أو طباعته في اتجاه مختلف ، مثل التبديل من الوضع الرأسي إلى الوضع الأفقي أو العكس.

#### س: هل يمكنني تغيير اتجاه صفحات معينة في مستند PDF؟

 ج: نعم ، يمكنك تغيير اتجاه صفحات معينة في مستند PDF. في الكود المصدري C # المقدم ، فإن ملف`foreach` حلقة لتصفح كل صفحة من الوثيقة وتغيير اتجاهها. إذا كنت تريد فقط تغيير اتجاه صفحات معينة ، فيمكنك تعديل الحلقة لاستهداف تلك الصفحات بناءً على أرقام الصفحات أو المعايير الأخرى.

#### س: هل يؤثر تغيير اتجاه الصفحة على تخطيط المحتوى على الصفحة؟

ج: نعم ، سيؤثر تغيير اتجاه الصفحة على تخطيط المحتوى على الصفحة. سيتم تدوير المحتوى بمقدار 90 درجة ، وسيتم تبديل عرض الصفحة وارتفاعها. نتيجة لذلك ، قد يتغير موضع المحتوى على الصفحة ومواءمته.

#### س: هل يمكنني تدوير الصفحة بزاوية غير 90 درجة؟

 ج: في الكود المصدري C # المقدم ، يتم ضبط تدوير الصفحة على 90 درجة باستخدام`page.Rotate = Rotate.on90;` . ومع ذلك ، يمكنك تغيير زاوية الدوران إلى قيم أخرى إذا لزم الأمر. على سبيل المثال ، يمكنك استخدام ملفات`Rotate.on180` لتدوير الصفحة بمقدار 180 درجة أو`Rotate.on270` لتدويره بمقدار 270 درجة.

#### س: كيف أتعامل مع محتوى الصفحة الذي يفيض بعد تغيير الاتجاه؟

ج: عند تغيير اتجاه الصفحة ، قد تتغير أبعاد الصفحة ، مما قد يؤدي إلى تجاوز المحتوى. للتعامل مع هذا الأمر ، قد تحتاج إلى ضبط تخطيط وتنسيق المحتوى على الصفحة. يمكنك استخدام الميزات التي يوفرها Aspose.PDF لـ .NET ، مثل تغيير حجم العناصر ، أو تعديل الهوامش ، أو إعادة تنظيم المحتوى ، للتأكد من أن محتوى الصفحة يناسب بشكل صحيح بعد تغيير الاتجاه.