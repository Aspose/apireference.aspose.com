---
title: تعداد العقد التابعة
linktitle: تعداد العقد التابعة
second_title: Aspose.Words واجهة برمجة تطبيقات معالجة المستندات
description: تعرف على كيفية تعداد العقد الفرعية في فقرة باستخدام Aspose.Words لـ .NET.
type: docs
weight: 10
url: /ar/net/working-with-node/enumerate-child-nodes/
---

فيما يلي دليل خطوة بخطوة لشرح كود مصدر C# أدناه والذي يوضح كيفية تعداد العقد الفرعية باستخدام Aspose.Words لـ .NET.

## الخطوة 1: استيراد المراجع اللازمة
قبل أن تبدأ، تأكد من استيراد المراجع اللازمة لاستخدام Aspose.Words for .NET في مشروعك. يتضمن ذلك استيراد مكتبة Aspose.Words وإضافة مساحات الأسماء المطلوبة إلى ملفك المصدر.

```csharp
using Aspose.Words;
using Aspose.Words.Nodes;
using Aspose.Words.NodeTypes;
```

## الخطوة 2: إنشاء مستند جديد
 في هذه الخطوة، سنقوم بإنشاء مستند جديد باستخدام الملف`Document` فصل.

```csharp
Document doc = new Document();
```

## الخطوة 3: الوصول إلى الفقرة والعقد التابعة لها
 لتعداد العقد الفرعية لفقرة ما، نحتاج أولاً إلى الوصول إلى الفقرة نفسها. استخدم ال`GetChild` الطريقة مع`Paragraph` نوع العقدة للحصول على الفقرة الأولى من المستند.

```csharp
Paragraph paragraph = (Paragraph)doc.GetChild(NodeType.Paragraph, 0, true);
```

 بعد ذلك، نقوم باسترداد مجموعة العقد الفرعية للفقرة باستخدام`ChildNodes` ملكية.

```csharp
NodeCollection children = paragraph. ChildNodes;
```

## الخطوة 4: تصفح العقد الفرعية
 الآن بعد أن أصبح لدينا مجموعة من العقد الفرعية، يمكننا تكرارها باستخدام ملف`foreach` حلقة. نتحقق من نوع كل عقدة فرعية ونجري عمليات محددة بناءً على النوع.

```csharp
foreach (Node child in children)
{
     // يمكن أن تحتوي الفقرة على عناصر فرعية من أنواع مختلفة مثل المسارات والأشكال وغيرها.
     if (child. NodeType == NodeType.Run)
     {
         Run run = (Run)child;
         Console.WriteLine(run.Text);
     }
}
```

 في هذا المثال، نحن نتحقق مما إذا كانت العقدة الفرعية من النوع`Run` (على سبيل المثال جزء من النص). إذا كان الأمر كذلك، فإننا نقوم بتحويل العقدة إلى`Run` وعرض النص باستخدام`run.Text`.

## مثال على التعليمات البرمجية المصدر لتعداد العقد الفرعية باستخدام Aspose.Words لـ .NET


```csharp
Document doc = new Document();
Paragraph paragraph = (Paragraph) doc.GetChild(NodeType.Paragraph, 0, true);

NodeCollection children = paragraph.ChildNodes;
foreach (Node child in children)
{
	//قد تحتوي الفقرة على أطفال من أنواع مختلفة مثل المسارات والأشكال وغيرها.
	if (child.NodeType == NodeType.Run)
	{
		Run run = (Run) child;
		Console.WriteLine(run.Text);
	}
}
```

يعد هذا مثالًا كاملاً للتعليمات البرمجية لتعداد العقد الفرعية لفقرة باستخدام Aspose.Words لـ .NET. تأكد من استيراد المراجع


### الأسئلة الشائعة

#### س: ما هي العقدة الفرعية في Node.js؟

ج: تشير العقدة الفرعية في Node.js إلى العقدة الموجودة مباشرة داخل عقدة معينة. هذه هي العقد التي تكون أقل مباشرة في التسلسل الهرمي من العقدة الأصلية.

#### س: كيفية تعداد العقد الفرعية لعقدة معينة؟

 ج: لتعداد العقد الفرعية لعقدة معينة في Node.js، يمكنك استخدام الأمر`childNodes` خاصية العقدة. تقوم هذه الخاصية بإرجاع قائمة بجميع العقد التابعة للعقدة المحددة.

#### س: كيفية الوصول إلى خصائص العقدة التابعة؟

 ج: للوصول إلى خصائص العقدة الفرعية في Node.js، يمكنك استخدام الطرق والخصائص التي توفرها XML API المستخدمة في بيئة Node.js الخاصة بك. على سبيل المثال، يمكنك استخدام أساليب مثل`getAttribute`للحصول على قيمة سمة محددة للعقدة الفرعية.

#### س: هل يمكننا تعديل العقد الفرعية للعقدة؟

 ج: نعم، من الممكن تعديل العقد الفرعية لعقدة في Node.js باستخدام الطرق والخصائص التي توفرها XML API المستخدمة في بيئة Node.js الخاصة بك. على سبيل المثال، يمكنك استخدام أساليب مثل`appendChild` أو`removeChild` لإضافة أو إزالة العقد التابعة من عقدة معينة.

#### س: كيفية تصفح كافة العقد التابعة للعقدة؟

 ج: للتكرار عبر جميع العقد الفرعية لعقدة معينة في Node.js، يمكنك استخدام ملف`for` حلقة للتكرار من خلال قائمة العقد الفرعية التي تم إرجاعها بواسطة ملف`childNodes` ملكية. يمكنك بعد ذلك الوصول إلى خصائص وقيم كل عقدة فرعية داخل الحلقة.