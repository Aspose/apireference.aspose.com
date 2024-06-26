---
title: أضف طبقات إلى ملف PDF
linktitle: أضف طبقات إلى ملف PDF
second_title: Aspose.PDF لمرجع .NET API
description: تعرف على كيفية إضافة طبقات إلى ملفات PDF باستخدام Aspose.PDF for .NET. دليل خطوة بخطوة مع برامج تعليمية حول التعليمات البرمجية لإنشاء ملفات PDF ذات طبقات وحفظها.
type: docs
weight: 20
url: /ar/net/programming-with-document/addlayers/
---
لإضافة طبقات إلى ملف PDF ، سنستخدم Aspose.PDF لـ .NET. تتيح لنا هذه المكتبة العمل مع ملفات PDF في تطبيقات .NET بشكل فعال. اتبع الإرشادات خطوة بخطوة أدناه لإضافة طبقات باستخدام Aspose.PDF for .NET.

## الخطوة 1: قم بإنشاء مستند PDF جديد

 ابدأ بإنشاء مثيل جديد لـ`Document` فئة مقدمة من Aspose.PDF لـ .NET. سيكون هذا بمثابة مستند PDF حيث سنضيف الطبقات.

```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
```

## الخطوة 2: أضف صفحة إلى المستند

 بعد ذلك ، أضف صفحة إلى المستند باستخدام ملف`Add` طريقة`Pages` جمع في`Document` فصل.

```csharp
Page page = doc.Pages.Add();
```

## الخطوة 3: إنشاء وإضافة طبقات إلى الصفحة

 إنشاء مثيلات من`Layer` فئة لكل طبقة تريد إضافتها إلى ملف PDF. حدد معرفًا فريدًا واسمًا لكل طبقة.

```csharp
Layer layer = new Layer("oc1", "Red Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(1, 0, 0));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 700));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 700));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers = new List<Layer>();
page.Layers.Add(layer);

layer = new Layer("oc2", "Green Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(0, 1, 0));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 750));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 750));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers.Add(layer);

layer = new Layer("oc3", "Blue Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(0, 0, 1));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 800));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 800));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers.Add(layer);
```

في هذا البرنامج التعليمي ، قمنا بإضافة ثلاث طبقات بألوان وأسماء مختلفة إلى الصفحة.

## الخطوة 4: احفظ ملف PDF

احفظ ملف PDF المعدل باستخدام امتداد`Save` طريقة`Document` فصل.

```csharp
dataDir = dataDir + "AddLayers_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nLayers added successfully to PDF file.\nFile saved at " + dataDir);
```

سيحفظ هذا الرمز ملف PDF المعدل في الدليل المحدد.

### مثال على الكود المصدري لإضافة طبقات إلى صفحات PDF باستخدام Aspose.PDF for .NET

```csharp            
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
Page page = doc.Pages.Add();
Layer layer = new Layer("oc1", "Red Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(1, 0, 0));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 700));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 700));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers = new  List<Layer>();
page.Layers.Add(layer);
layer = new Layer("oc2", "Green Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(0, 1, 0));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 750));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 750));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers.Add(layer);
layer = new Layer("oc3", "Blue Line");
layer.Contents.Add(new Aspose.Pdf.Operators.SetRGBColorStroke(0, 0, 1));
layer.Contents.Add(new Aspose.Pdf.Operators.MoveTo(500, 800));
layer.Contents.Add(new Aspose.Pdf.Operators.LineTo(400, 800));
layer.Contents.Add(new Aspose.Pdf.Operators.Stroke());
page.Layers.Add(layer);
dataDir = dataDir + "AddLayers_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nLayers added successfully to PDF file.\nFile saved at " + dataDir);

```

## خاتمة

في هذه المقالة ، قدمنا دليلاً خطوة بخطوة لإضافة طبقات إلى ملفات PDF باستخدام Aspose.PDF for .NET. باتباع التعليمات واستخدام برامج التعليمات البرمجية المتوفرة ، يمكنك بسهولة دمج الطبقات في مستندات PDF الخاصة بك. تتيح لك الطبقات تنظيم رؤية المحتوى والتحكم فيها ، مما يوفر تجربة تفاعلية وقابلة للتخصيص للمستخدمين لديك.


### الأسئلة الشائعة حول إضافة طبقات إلى ملف PDF

#### س: ما هو Aspose.PDF لـ .NET؟

ج: Aspose.PDF for .NET مكتبة قوية تمكن المطورين من العمل مع ملفات PDF بفاعلية في تطبيقات .NET. يوفر مجموعة كبيرة من الميزات لإنشاء مستندات PDF وتعديلها ومعالجتها.

#### س: ما هي طبقات PDF؟

ج: طبقات PDF ، المعروفة أيضًا باسم مجموعات المحتوى الاختيارية (OCGs) ، تسمح لك بالتحكم في رؤية ومظهر محتوى معين داخل ملف PDF. إنها مفيدة لتنظيم المحتوى وإنشاء مستندات تفاعلية.

#### س: هل يمكنني إضافة طبقات متعددة إلى ملف PDF باستخدام Aspose.PDF for .NET؟

ج: نعم ، يمكنك إضافة طبقات متعددة إلى ملف PDF باستخدام Aspose.PDF for .NET. يمكن أن يكون لكل طبقة اسم ومعرف فريد خاص بها ، كما هو موضح في البرنامج التعليمي.

#### س: كيف يمكنني تخصيص مظهر الطبقات؟

ج: يمكنك تخصيص مظهر الطبقات بتحديد خصائص مختلفة ، مثل اللون والعتامة والرؤية. يوفر Aspose.PDF for .NET خيارات متنوعة لتحقيق ذلك.

#### س: هل Aspose.PDF for .NET مناسب للمشاريع الاحترافية؟

ج: نعم ، Aspose.PDF for .NET مكتبة موثوقة ومستخدمة على نطاق واسع لمعالجة ملفات PDF في المشاريع الاحترافية. يوفر وظائف مكثفة وأداء ممتاز للعمل مع ملفات PDF في تطبيقات .NET.