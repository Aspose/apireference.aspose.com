---
title: احصل على وجهات الارتباط التشعبي في ملف PDF
linktitle: احصل على وجهات الارتباط التشعبي في ملف PDF
second_title: Aspose.PDF لمرجع .NET API
description: تعرف على كيفية استخراج وجهات الارتباط التشعبي في ملف PDF باستخدام Aspose.PDF for .NET.
type: docs
weight: 60
url: /ar/net/programming-with-links-and-actions/get-hyperlink-destinations/
---
Aspose.PDF for .NET مكتبة قوية لمعالجة واستخراج المعلومات في ملف PDF باستخدام لغة البرمجة C #. في هذا البرنامج التعليمي ، سنركز على استخراج وجهات الارتباط التشعبي من ملف PDF باستخدام Aspose.PDF for .NET.

## المتطلبات الأساسية

قبل أن تبدأ ، تأكد من أن لديك ما يلي:

- بيئة تطوير متكاملة (IDE) مثل Visual Studio.
- تم تثبيت مكتبة Aspose.PDF لـ .NET على جهازك.

## الخطوة الأولى: تهيئة بيئة التطوير

قبل أن تبدأ في كتابة التعليمات البرمجية ، تحتاج إلى إعداد بيئة التطوير الخاصة بك عن طريق إنشاء مشروع C # جديد في IDE المفضل لديك.

## الخطوة 2: استيراد مراجع Aspose.PDF

لاستخدام Aspose.PDF لـ .NET ، تحتاج إلى إضافة المراجع المناسبة إلى مشروعك. اتبع الخطوات أدناه لاستيراد المراجع الضرورية:

1. في مشروعك ، انقر بزر الماوس الأيمن فوق "المراجع" وحدد "إضافة مرجع".
2. في نافذة "إضافة مرجع" ، حدد موقع ملفات DLL الخاصة بـ Aspose.PDF for .NET وحددها.
3. انقر فوق "موافق" لاستيراد المراجع إلى مشروعك.

## الخطوة الثالثة: تحميل ملف PDF

قبل أن تتمكن من استخراج وجهات الارتباط التشعبي ، يجب عليك تحميل ملف PDF في التطبيق الخاص بك. استخدم الكود التالي لتحميل ملف PDF:

```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
// قم بتحميل ملف PDF
Document document = new Document(dataDir + "input.pdf");
```

تأكد من تحديد المسار الصحيح لدليل المستند وملف PDF الذي تريد معالجته.

## الخطوة 4: التنقل في صفحات المستند

الآن بعد أن تم تحميل ملف PDF ، تحتاج إلى تصفح جميع صفحات المستند. سيسمح لك هذا بالحصول على

ir التعليقات التوضيحية للارتباط التشعبي الموجودة في كل صفحة. استخدم الكود التالي للتكرار خلال صفحات المستند:

```csharp
foreach(Aspose.Pdf.Page page in document.Pages)
{
     // الحصول على رابط التعليقات التوضيحية لصفحة معينة
     AnnotationSelector selector = new AnnotationSelector(new Aspose.Pdf.Annotations.LinkAnnotation(page, Aspose.Pdf.Rectangle.Trivial));
     page. Accept(selector);
     // قم بإنشاء قائمة لتخزين جميع الروابط
     IList<Annotation> list = selector. Selected;
     // قم بالتكرار خلال كل عنصر في القائمة
     foreach(LinkAnnotation a in list)
     {
         // طباعة عنوان URL المقصود
         Console.WriteLine("\nDestination: " + (a.Action as Aspose.Pdf.Annotations.GoToURIAction).URI + "\n");
     }
}
```

تتكرر هذه التعليمات البرمجية خلال كل صفحة من صفحات المستند وتحدد التعليقات التوضيحية للارتباط التشعبي الموجودة في كل صفحة. ثم يخزن هذه التعليقات التوضيحية في قائمة ويطبع عنوان URL المقصود لكل رابط.

## الخطوة 5: الحصول على وجهات الارتباط التشعبي

الخطوة الأخيرة هي استخراج وجهات الارتباط التشعبي من التعليقات التوضيحية للارتباط التشعبي. يوضح لك الكود التالي كيفية القيام بذلك:

```csharp
foreach(Aspose.Pdf.Page page in document.Pages)
{
     AnnotationSelector selector = new AnnotationSelector(new Aspose.Pdf.Annotations.LinkAnnotation(page, Aspose.Pdf.Rectangle.Trivial));
     page. Accept(selector);
     IList<Annotation> list = selector. Selected;
     foreach(LinkAnnotation a in list)
     {
         string destination = (a.Action as Aspose.Pdf.Annotations.GoToURIAction).URI;
         // استخدم الوجهة كما يحلو لك
     }
}
```

في هذا الرمز ، نحصل على كل وجهة ارتباط تشعبي من التعليقات التوضيحية للرابط ونخزن الوجهة في متغير. يمكنك بعد ذلك استخدام هذه الوجهة كما يحلو لك في التطبيق الخاص بك.

### نموذج التعليمات البرمجية المصدر للحصول على وجهات الارتباط التشعبي باستخدام Aspose.PDF لـ .NET 
```csharp
try
{
	// المسار إلى دليل المستندات.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// قم بتحميل ملف PDF
	Document document = new Document(dataDir + "input.pdf");
	// اجتياز كل صفحات PDF
	foreach (Aspose.Pdf.Page page in document.Pages)
	{
		// احصل على التعليقات التوضيحية للارتباط من صفحة معينة
		AnnotationSelector selector = new AnnotationSelector(new Aspose.Pdf.Annotations.LinkAnnotation(page, Aspose.Pdf.Rectangle.Trivial));
		page.Accept(selector);
		// إنشاء قائمة تحتوي على جميع الروابط
		IList<Annotation> list = selector.Selected;
		// كرر من خلال عنصر invidiaul داخل القائمة
		foreach (LinkAnnotation a in list)
		{
			// اطبع عنوان URL المقصود
			Console.WriteLine("\nDestination: " + (a.Action as Aspose.Pdf.Annotations.GoToURIAction).URI + "\n");
		}
	}
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

### الأسئلة الشائعة للحصول على وجهات الارتباط التشعبي في ملف PDF

#### س: ما هي وجهة الارتباط التشعبي في ملف PDF؟

ج: وجهة الارتباط التشعبي في ملف PDF هي موقع أو هدف محدد يشير إليه الارتباط التشعبي. يمكن أن يكون عنوان URL أو صفحة داخل المستند نفسه أو مستندًا خارجيًا.

#### س: كيف يمكن لاستخراج وجهات الارتباط التشعبي الاستفادة من تحليل مستند PDF الخاص بي؟

ج: يتيح لك استخراج وجهات الارتباط التشعبي تحديد وفهرسة جميع الأهداف التي تشير إليها الارتباطات التشعبية داخل مستند PDF. يمكن أن تكون هذه المعلومات مفيدة للتحقق من صحة المحتوى والتحقق من الارتباط وتحليل البيانات.

#### س: كيف يساعد Aspose.PDF for .NET في استخراج وجهات الارتباط التشعبي؟

ج: يوفر Aspose.PDF for .NET واجهات برمجة تطبيقات قوية لاستخراج وجهات الارتباط التشعبي بسهولة. يوضح هذا البرنامج التعليمي كيفية استخراج وجهات الارتباط التشعبي باستخدام C # خطوة بخطوة.

#### س: هل يمكنني استخراج وجهات الارتباطات التشعبية بشكل انتقائي بناءً على معايير معينة؟

ج: نعم ، يمكنك استخراج وجهات الروابط التشعبية بشكل انتقائي عن طريق التكرار خلال صفحات مستند PDF وتصفية التعليقات التوضيحية للارتباط التشعبي المطلوب بناءً على المعايير الخاصة بك.

#### س: هل من الممكن استخراج وجهات الارتباط التشعبي من مستندات PDF المحمية بكلمة مرور؟

ج: يمكن لـ Aspose.PDF for .NET استخراج وجهات الارتباط التشعبي من مستندات PDF المحمية بكلمة مرور طالما أنك توفر بيانات اعتماد المصادقة الضرورية عند فتح المستند.

#### س: كيف يمكنني استخدام وجهات الارتباط التشعبي المستخرجة في تطبيقي؟

ج: بمجرد استخراج وجهات الارتباطات التشعبية ، يمكنك استخدامها لتنفيذ إجراءات متنوعة ، مثل التحقق من عناوين URL للارتباطات أو إنشاء التقارير أو تنفيذ التنقل المخصص.

#### س: هل هناك أي قيود عند استخراج وجهات الارتباط التشعبي؟

ج: في حين أن استخراج وجهة الارتباط التشعبي قوي ، فمن الضروري مراعاة بنية مستند PDF. قد تتطلب الارتباطات التشعبية المضمنة في الرسومات المعقدة أو محتوى الوسائط المتعددة معالجة إضافية.

#### س: هل يمكنني استخراج سمات أخرى للارتباطات التشعبية ، مثل أنواع الروابط أو الإحداثيات؟

ج: يركز البرنامج التعليمي على استخراج وجهات الارتباط التشعبي. ومع ذلك ، يمكنك الرجوع إلى وثائق Aspose.PDF الرسمية لاستكشاف الميزات المتقدمة ، بما في ذلك استخراج أنواع الروابط والإحداثيات.