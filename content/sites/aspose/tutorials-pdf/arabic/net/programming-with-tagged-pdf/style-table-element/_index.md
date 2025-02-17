---
title: عنصر جدول النمط
linktitle: عنصر جدول النمط
second_title: Aspose.PDF لمرجع .NET API
description: تعرف على كيفية تنسيق عنصر الجدول باستخدام Aspose.PDF for .NET. دليل خطوة بخطوة لتخصيص الأنماط والخصائص.
type: docs
weight: 170
url: /ar/net/programming-with-tagged-pdf/style-table-element/
---
في هذا البرنامج التعليمي المفصل ، سنرشدك خلال التعليمات البرمجية المصدر C # المقدمة خطوة بخطوة لتنسيق عنصر المصفوفة باستخدام Aspose.PDF for .NET. اتبع الإرشادات أدناه لفهم كيفية تخصيص أنماط وخصائص عنصر المصفوفة.

## الخطوة الأولى: تهيئة البيئة

قبل أن تبدأ ، تأكد من تكوين بيئة التطوير الخاصة بك لاستخدام Aspose.PDF لـ .NET. يتضمن ذلك تثبيت مكتبة Aspose.PDF وتهيئة مشروعك للرجوع إليه.

## الخطوة 2: إنشاء وثيقة

في هذه الخطوة ، سننشئ كائن مستند جديد Aspose.PDF.

```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// إنشاء الوثيقة
Document document = new Document();
ITaggedContent taggedContent = document.TaggedContent;
taggedContent.SetTitle("Example of table formatting");
taggedContent.SetLanguage("fr-FR");
```

لقد أنشأنا مستندًا جديدًا وحددنا عنوان المستند ولغته.

## الخطوة 3: الحصول على عنصر بنية الجذر

في هذه الخطوة ، سنحصل على عنصر بنية الجذر لوثيقتنا.

```csharp
//الحصول على عنصر بنية الجذر
StructureElement rootElement = taggedContent.RootElement;
```

حصلنا على عنصر بنية الجذر الذي سيكون بمثابة حاوية لعنصر المصفوفة.

## الخطوة 4: إنشاء عنصر بنية المصفوفة

لنقم الآن بإنشاء عنصر هيكل جدول جديد لوثيقتنا.

```csharp
// قم بإنشاء عنصر بنية المصفوفة
TableElement tableElement = taggedContent.CreateTableElement();
rootElement.AppendChild(tableElement);
```

لقد أنشأنا عنصر هيكل مصفوفة جديد وأضفناه إلى عنصر بنية الجذر.

## الخطوة 5: تخصيص خصائص وأنماط عناصر الصفيف

في هذه الخطوة ، سنخصص أنماط وخصائص عنصر المصفوفة.

```csharp
// تخصيص أنماط وخصائص عنصر المصفوفة
tableElement.BackgroundColor = Color.Beige;
tableElement.Border = new BorderInfo(BorderSide.All, 0.80F, Color.Gray);
tableElement. Alignment = HorizontalAlignment. Center;
tableElement.Broken = TableBroken.Vertical;
tableElement.ColumnAdjustment = ColumnAdjustment.AutoFitToWindow;
tableElement. ColumnWidths = "80 80 80 80 80";
tableElement.DefaultCellBorder = new BorderInfo(BorderSide.All, 0.50F, Color.DarkBlue);
tableElement. DefaultCellPadding = new MarginInfo(16.0, 2.0, 8.0, 2.0);
tableElement.DefaultCellTextState.ForegroundColor = Color.DarkCyan;
tableElement.DefaultCellTextState.FontSize = 8F;
tableElement. DefaultColumnWidth = "70";
tableElement. IsBroken = false;
tableElement.IsBordersIncluded = true;
tableElement. Left = 0F;
tableElement. Top = 40F;
tableElement.RepeatingColumnsCount = 2;
tableElement.RepeatingRowsCount = 3;

// تخصيص نمط الخطوط المتكررة
TextState rowStyle = new TextState();
rowStyle.BackgroundColor = Color.LightCoral;
tableElement.RepeatingRowsStyle = rowStyle;
```

استخدمنا خصائص مختلفة لتخصيص عنصر الجدول ، مثل لون الخلفية ، والحدود ، والمحاذاة ، ونمط الخلية الافتراضي ، والهوامش ، وعرض العمود ، وما إلى ذلك.

## الخطوة 6: أضف رؤوس الجدول والنص والتذييل

الآن دعنا نضيف رؤوس الجدول والنص والتذييل إلى عنصر الجدول.
```csharp
// أضف رؤوس الجدول
TableTHeadElement tableTHeadElement = tableElement.CreateTHead();
TableTBodyElement tableTBodyElement = tableElement.CreateTBody();
TableTFootElement tableTFootElement = tableElement.CreateTFoot();

// عدد الصفوف والأعمدة في الجدول
int rowCount = 10;
int colCount = 5;
int rowIndex;
int colIndex;

// قم بإنشاء صف رأس الجدول
TableTRElement headTrElement = tableTHeadElement.CreateTR();
headTrElement.AlternativeText = "Header Row";

for (colIndex = 0; colIndex < colCount; colIndex++)
{
     TableTHElement theElement = headTrElement.CreateTH();
     theElement.SetText(string.Format("Header {0}", colIndex));
}

//أضف صفوف نص الجدول
for (rowIndex = 0; rowIndex < rowCount; rowIndex++)
{
     TableTRElement trElement = tableTBodyElement.CreateTR();
     trElement.AlternativeText = string.Format("Row {0}", rowIndex);

     for (colIndex = 0; colIndex < colCount; colIndex++)
     {
         TableTDElement tdelement = trElement.CreateTD();
         tdElement.SetText(string.Format("Cell [{0}, {1}]", rowIndex, colIndex));
     }
}

// أضف خط التأسيس للجدول
TableTRElement footTrElement = tableTFootElement.CreateTR();
footTrElement.AlternativeText = "Footline";

for (colIndex = 0; colIndex < colCount; colIndex++)
{
     TableTDElement tdElement = footTrElement.CreateTD();
     tdElement.SetText(string.Format("Foot {0}", colIndex));
}
```

أضفنا الرؤوس وصفوف الجسم وصف التذييل إلى الجدول باستخدام العناصر المقابلة.

## الخطوة 7: حفظ وثيقة PDF ذات العلامات

الآن بعد أن أنشأنا وثيقتنا باستخدام عنصر الجدول المصمم ، سنحفظه كمستند PDF مميز.

```csharp
// احفظ مستند PDF بعلامات
document.Save(dataDir + "StyleTableElement.pdf");
```

لقد حفظنا مستند PDF المميز بعلامات في الدليل المحدد.

## الخطوة 8: التحقق من توافق PDF / UA

بعد ذلك ، سوف نتحقق من توافق PDF / UA لوثيقتنا.

```csharp
// فحص التوافق مع PDF / UA
document = new Document(dataDir + "StyleTableElement.pdf");
bool isPdfUaCompliance = document.Validate(dataDir + "StyleTableElement.xml", PdfFormat.PDF_UA_1);
Console.WriteLine(string.Format("PDF/UA Compliance: {0}", isPdfUaCompliance));
```

قمنا بتحميل مستند PDF الذي تم وضع علامة عليه وتحققنا من توافقه مع PDF / UA من خلال إنشاء تقرير XML.

### نموذج التعليمات البرمجية المصدر لعنصر جدول النمط باستخدام Aspose.PDF لـ .NET 

```csharp

// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// إنشاء وثيقة
Document document = new Document();
ITaggedContent taggedContent = document.TaggedContent;
taggedContent.SetTitle("Example table style");
taggedContent.SetLanguage("en-US");

// الحصول على عنصر بنية الجذر
StructureElement rootElement = taggedContent.RootElement;

// إنشاء عنصر هيكل الجدول
TableElement tableElement = taggedContent.CreateTableElement();
rootElement.AppendChild(tableElement);
tableElement.BackgroundColor = Color.Beige;
tableElement.Border = new BorderInfo(BorderSide.All, 0.80F, Color.Gray);
tableElement.Alignment = HorizontalAlignment.Center;
tableElement.Broken = TableBroken.Vertical;
tableElement.ColumnAdjustment = ColumnAdjustment.AutoFitToWindow;
tableElement.ColumnWidths = "80 80 80 80 80";
tableElement.DefaultCellBorder = new BorderInfo(BorderSide.All, 0.50F, Color.DarkBlue);
tableElement.DefaultCellPadding = new MarginInfo(16.0, 2.0, 8.0, 2.0);
tableElement.DefaultCellTextState.ForegroundColor = Color.DarkCyan;
tableElement.DefaultCellTextState.FontSize = 8F;
tableElement.DefaultColumnWidth = "70";
tableElement.IsBroken = false;
tableElement.IsBordersIncluded = true;
tableElement.Left = 0F;
tableElement.Top = 40F;
tableElement.RepeatingColumnsCount = 2;
tableElement.RepeatingRowsCount = 3;
TextState rowStyle = new TextState();
rowStyle.BackgroundColor = Color.LightCoral;
tableElement.RepeatingRowsStyle = rowStyle;
TableTHeadElement tableTHeadElement = tableElement.CreateTHead();
TableTBodyElement tableTBodyElement = tableElement.CreateTBody();
TableTFootElement tableTFootElement = tableElement.CreateTFoot();
int rowCount = 10;
int colCount = 5;
int rowIndex;
int colIndex;
TableTRElement headTrElement = tableTHeadElement.CreateTR();
headTrElement.AlternativeText = "Head Row";
for (colIndex = 0; colIndex < colCount; colIndex++)
{
	TableTHElement thElement = headTrElement.CreateTH();
	thElement.SetText(String.Format("Head {0}", colIndex));
}
for (rowIndex = 0; rowIndex < rowCount; rowIndex++)
{
	TableTRElement trElement = tableTBodyElement.CreateTR();
	trElement.AlternativeText = String.Format("Row {0}", rowIndex);
	for (colIndex = 0; colIndex < colCount; colIndex++)
	{
		TableTDElement tdElement = trElement.CreateTD();
		tdElement.SetText(String.Format("Cell [{0}, {1}]", rowIndex, colIndex));
	}
}
TableTRElement footTrElement = tableTFootElement.CreateTR();
footTrElement.AlternativeText = "Foot Row";
for (colIndex = 0; colIndex < colCount; colIndex++)
{
	TableTDElement tdElement = footTrElement.CreateTD();
	tdElement.SetText(String.Format("Foot {0}", colIndex));
}

// حفظ وثيقة PDF الموسومة
document.Save(dataDir + "StyleTableElement.pdf");

// التحقق من توافق PDF / UA
document = new Document(dataDir + "StyleTableElement.pdf");
bool isPdfUaCompliance = document.Validate(dataDir + "StyleTableElement.xml", PdfFormat.PDF_UA_1);
Console.WriteLine(String.Format("PDF/UA compliance: {0}", isPdfUaCompliance));

```

## خاتمة

في هذا البرنامج التعليمي ، تعلمنا كيفية تنسيق عنصر المصفوفة باستخدام Aspose.PDF for .NET. قمنا بتخصيص أنماط وخصائص عنصر الجدول وإضافة رؤوس وصفوف النص والتذييل وحفظنا وثيقة PDF المميزة وتحققنا من توافقها مع PDF / UA.

### التعليمات

#### س: ما هو الغرض من هذا البرنامج التعليمي حول تنسيق عنصر المصفوفة باستخدام Aspose.PDF for .NET؟

ج: الهدف من هذا البرنامج التعليمي هو إرشادك خلال عملية تنسيق عنصر المصفوفة في مستند PDF باستخدام Aspose.PDF for .NET. يوفر إرشادات خطوة بخطوة وأمثلة على التعليمات البرمجية المصدر لـ C # لمساعدتك في تخصيص أنماط وخصائص عنصر المصفوفة.

#### س: ما هي المتطلبات الأساسية لاتباع هذا البرنامج التعليمي؟

ج: قبل أن تبدأ ، تأكد من قيامك بإعداد بيئة التطوير الخاصة بك لاستخدام Aspose.PDF لـ .NET. يتضمن ذلك تثبيت مكتبة Aspose.PDF وتكوين مشروعك للرجوع إليه.

#### س: كيف يمكنني إنشاء مستند PDF جديد وتعيين عنوانه ولغته باستخدام Aspose.PDF for .NET؟

 ج: لإنشاء مستند PDF جديد ، تحتاج إلى إنشاء ملف`Document` كائن من مكتبة Aspose.PDF. يوضح الكود المصدري C # المقدم من البرنامج التعليمي كيفية إنشاء مستند وتعيين عنوانه وخصائص اللغة.

#### س: ما هي أهمية عنصر البنية الجذرية في مستند PDF؟

ج: يعمل عنصر بنية الجذر كحاوية لعناصر بنية أخرى ، مما يساعد على تنظيم محتوى مستند PDF وتصنيفه. إنها تلعب دورًا حاسمًا في إنشاء البنية المنطقية للوثيقة.

#### س: كيف يمكنني إنشاء عنصر هيكل مصفوفة وتخصيصه باستخدام Aspose.PDF for .NET؟

 ج: يمكنك إنشاء عنصر بنية مصفوفة باستخدام امتداد`CreateTableElement()` طريقة. توفر التعليمات البرمجية المصدر الخاصة بالبرنامج التعليمي أمثلة لتخصيص الخصائص المختلفة لعنصر الجدول ، مثل لون الخلفية والحدود والمحاذاة وعرض العمود والمزيد.

#### س: هل يمكنني تخصيص أنماط وخصائص خلايا الجدول داخل عنصر الصفيف؟

ج: نعم ، يغطي البرنامج التعليمي كيفية تخصيص أنماط وخصائص عنصر الجدول بأكمله ، بما في ذلك الرؤوس وصفوف النص والتذييل. ومع ذلك ، فإنه لا يعالج تخصيص خلايا الجدول الفردية على وجه التحديد.

#### س: كيف يمكنني إضافة رؤوس وصفوف نصية وتذييل لعنصر الجدول؟

ج: يشرح البرنامج التعليمي كيفية إنشاء وإضافة رؤوس وصفوف نصية وتذييل لعنصر الجدول باستخدام الطرق المناسبة التي يوفرها Aspose.PDF لـ .NET.

#### س: ما هو التوافق مع PDF / UA ، وكيف يمكنني التحقق من صحته لمستند PDF المميز بعلامات؟

 ج: يضمن التوافق مع PDF / UA أن مستند PDF يتوافق مع معايير إمكانية الوصول ، مما يجعله في متناول المستخدمين ذوي الاحتياجات الخاصة. يوضح البرنامج التعليمي كيفية التحقق من توافق PDF / UA باستخدام ملف`Validate()` طريقة وإنشاء تقرير امتثال XML.

#### س: كيف يمكنني دمج هذه المفاهيم في تطبيقات .NET الخاصة بي؟

ج: يمكنك استخدام أمثلة كود المصدر C # المتوفرة كدليل لتنفيذ تنسيق عنصر الصفيف في تطبيقات .NET الخاصة بك. قم بتعديل وتكييف الكود ليتناسب مع متطلباتك ودمجها في مشاريعك.

#### س: هل هناك أي ممارسات أفضل موصى بها لتنسيق عناصر الصفيف في مستندات PDF؟

ج: عند تنسيق عناصر الصفيف (الجداول) ، ضع في اعتبارك سهولة القراءة وسهولة الوصول إلى المحتوى. استخدم خطوطًا واضحة ومقروءة ، وألوانًا مناسبة ، وحافظ على تنسيق ثابت. تحقق من توافق PDF / UA لضمان تلبية معايير إمكانية الوصول.

#### س: ما الميزات الأخرى لبرنامج Aspose.PDF for .NET التي يمكنني استكشافها لتخصيص مستند PDF؟

ج: يوفر Aspose.PDF for .NET مجموعة من الميزات لتخصيص مستند PDF ، بما في ذلك معالجة النص وإدراج الصور وإدارة حقل النموذج والتوقيعات الرقمية والتعليقات التوضيحية والمزيد. استشر الوثائق الرسمية والموارد لاستكشاف وظائف إضافية.