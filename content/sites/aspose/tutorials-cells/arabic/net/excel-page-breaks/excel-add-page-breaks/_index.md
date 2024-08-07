---
title: Excel إضافة فواصل الصفحات
linktitle: Excel إضافة فواصل الصفحات
second_title: Aspose.Cells لمرجع .NET API
description: تعرف على كيفية إضافة فواصل الصفحات في Excel باستخدام Aspose.Cells for .NET. برنامج تعليمي خطوة بخطوة لإنشاء تقارير جيدة التنظيم.
type: docs
weight: 10
url: /ar/net/excel-page-breaks/excel-add-page-breaks/
---
تعد إضافة فواصل الصفحات في ملف Excel ميزة أساسية عند إنشاء تقارير أو مستندات كبيرة. في هذا البرنامج التعليمي ، سوف نستكشف كيفية إضافة فواصل الصفحات في ملف Excel باستخدام مكتبة Aspose.Cells لـ .NET. سنوجهك خطوة بخطوة لفهم وتنفيذ كود المصدر C # المقدم.

## الخطوة الأولى: تهيئة البيئة

 قبل أن تبدأ ، تأكد من تثبيت Aspose.Cells for .NET على جهازك. يمكنك تنزيل المكتبة من ملف[إصدارات Aspose](https://releases.aspose.com/cells/net)وتثبيته باتباع التعليمات المقدمة.

بمجرد اكتمال التثبيت ، قم بإنشاء مشروع C # جديد في بيئة التطوير المتكاملة المفضلة لديك (IDE) واستورد مكتبة Aspose.Cells لـ .NET.

## الخطوة 2: تكوين مسار دليل المستند

 في التعليمات البرمجية المصدر المتوفرة ، تحتاج إلى تحديد مسار الدليل حيث تريد حفظ ملف Excel الذي تم إنشاؤه. تعديل`dataDir` متغير عن طريق استبدال "دليل المستند" بالمسار المطلق للدليل على جهازك.

```csharp
// المسار إلى دليل المستندات.
string dataDir = "PATH TO YOUR DOCUMENTS DIRECTORY";
```

## الخطوة 3: إنشاء كائن مصنف

للبدء ، نحتاج إلى إنشاء كائن مصنف يمثل ملف Excel الخاص بنا. يمكن تحقيق ذلك باستخدام فئة Workbook التي توفرها Aspose.Cells.

```csharp
// إنشاء كائن مصنف
Workbook workbook = new Workbook();
```

## الخطوة 4: إضافة فاصل صفحات أفقي

الآن دعنا نضيف فاصل صفحات أفقي إلى ورقة عمل Excel الخاصة بنا. في نموذج التعليمات البرمجية ، نضيف فاصل صفحات أفقيًا إلى الخلية "Y30" في ورقة العمل الأولى.

```csharp
workbook.Worksheets[0].HorizontalPageBreaks.Add("Y30");
```

## الخطوة 5: إضافة فاصل صفحة عمودي

وبالمثل ، يمكننا إضافة فاصل صفحة عمودي باستخدام`VerticalPageBreaks.Add()` طريقة. في مثالنا ، نضيف فاصل صفحات عمودي إلى الخلية "Y30" في ورقة العمل الأولى.

```csharp
workbook.Worksheets[0].VerticalPageBreaks.Add("Y30");
```

## الخطوة 6: حفظ ملف Excel

 الآن بعد أن أضفنا فواصل الصفحات ، نحتاج إلى حفظ ملف Excel النهائي. استخدم ال`Save()` طريقة لتحديد المسار الكامل لملف الإخراج.

```csharp
// احفظ ملف Excel.
workbook.Save(dataDir + "AddingPageBreaks_out.xls");
```
### نموذج التعليمات البرمجية المصدر لبرنامج Excel إضافة فواصل الصفحات باستخدام Aspose.Cells لـ .NET 
```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// إنشاء كائن مصنف
Workbook workbook = new Workbook();
// أضف فاصل صفحات في الخلية Y30
workbook.Worksheets[0].HorizontalPageBreaks.Add("Y30");
workbook.Worksheets[0].VerticalPageBreaks.Add("Y30");
// احفظ ملف Excel.
workbook.Save(dataDir + "AddingPageBreaks_out.xls");
```

## خاتمة

في هذا البرنامج التعليمي ، تعلمنا كيفية إضافة فواصل من

  صفحة في ملف Excel باستخدام Aspose.Cells for .NET. باتباع الخطوات المقدمة ، ستتمكن بسهولة من إدراج فواصل الصفحات الأفقية والعمودية في ملفات Excel التي تم إنشاؤها ديناميكيًا. لا تتردد في تجربة المزيد مع مكتبة Aspose.Cells لاكتشاف الميزات القوية الأخرى التي تقدمها.

### أسئلة وأجوبة

#### س: هل Aspose.Cells for .NET مكتبة مجانية؟

ج: Aspose.Cells for .NET مكتبة تجارية ، لكنها تقدم نسخة تجريبية مجانية يمكنك استخدامها لتقييم وظائفها.

#### س: هل يمكنني إضافة عدة فواصل صفحات في ملف Excel؟

ج: نعم ، يمكنك إضافة العديد من فواصل الصفحات حسب الحاجة في أجزاء مختلفة من جدول البيانات.

#### س: هل يمكن إزالة فاصل صفحة مضاف مسبقًا؟

ج: نعم ، يسمح لك Aspose.Cells بإزالة فواصل الصفحات الموجودة باستخدام الطرق المناسبة لكائن ورقة العمل.

#### س: هل تعمل هذه الطريقة أيضًا مع تنسيقات ملفات Excel الأخرى مثل XLSX أو XLSM؟

ج: نعم ، تعمل الطريقة الموضحة في هذا البرنامج التعليمي مع العديد من تنسيقات ملفات Excel التي يدعمها Aspose.Cells.

#### س: هل يمكنني تخصيص مظهر فواصل الصفحات في Excel؟

ج: نعم ، تقدم Aspose.Cells مجموعة من الميزات لتخصيص فواصل الصفحات ، مثل النمط واللون والأبعاد.
