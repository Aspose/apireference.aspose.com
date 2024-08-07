---
title: قم بتعيين رقم الصفحة الأولى في Excel
linktitle: قم بتعيين رقم الصفحة الأولى في Excel
second_title: Aspose.Cells لمرجع .NET API
description: تعرف على كيفية تعيين رقم الصفحة الأولى في Excel باستخدام Aspose.Cells for .NET.
type: docs
weight: 90
url: /ar/net/excel-page-setup/set-excel-first-page-number/
---
في هذا البرنامج التعليمي ، سنرشدك إلى كيفية تعيين رقم الصفحة الأولى في Excel باستخدام Aspose.Cells for .NET. سوف نستخدم كود المصدر C # لتوضيح العملية.

## الخطوة الأولى: تهيئة البيئة

تأكد من تثبيت Aspose.Cells for .NET على جهازك. قم أيضًا بإنشاء مشروع جديد في بيئة التطوير المفضلة لديك.

## الخطوة 2: استيراد المكتبات الضرورية

في ملف التعليمات البرمجية الخاص بك ، قم باستيراد المكتبات اللازمة للعمل مع Aspose.Cells. هذا هو الكود المقابل:

```csharp
using Aspose.Cells;
```

## الخطوة 3: تعيين دليل البيانات

قم بتعيين دليل البيانات حيث تريد حفظ ملف Excel المعدل. استخدم الكود التالي:

```csharp
string dataDir = "YOUR DATA DIRECTORY";
```

تأكد من تحديد مسار الدليل الكامل.

## الخطوة 4: إنشاء المصنف وورقة العمل

قم بإنشاء كائن مصنف جديد وانتقل إلى ورقة العمل الأولى في المصنف باستخدام التعليمات البرمجية التالية:

```csharp
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
```

سيؤدي هذا إلى إنشاء مصنف فارغ بورقة عمل.

## الخطوة 5: تحديد رقم الصفحة الأولى

عيّن رقم الصفحة الأولى لصفحات ورقة العمل باستخدام الكود التالي:

```csharp
worksheet.PageSetup.FirstPageNumber = 2;
```

سيؤدي هذا إلى ضبط رقم الصفحة الأولى على 2.

## الخطوة 6: حفظ المصنف المعدل

احفظ المصنف المعدل باستخدام الكود التالي:

```csharp
workbook.Save(dataDir + "OutputFileName.xls");
```

سيؤدي هذا إلى حفظ المصنف المعدل في دليل البيانات المحدد.

### نموذج التعليمات البرمجية المصدر لتعيين رقم الصفحة الأولى في Excel باستخدام Aspose.Cells for .NET 
```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// إنشاء كائن مصنف
Workbook workbook = new Workbook();
// الوصول إلى ورقة العمل الأولى في ملف Excel
Worksheet worksheet = workbook.Worksheets[0];
// تعيين رقم الصفحة الأولى لصفحات ورقة العمل
worksheet.PageSetup.FirstPageNumber = 2;
// احفظ المصنف.
workbook.Save(dataDir + "SetFirstPageNumber_out.xls");
```

## خاتمة

لقد تعلمت الآن كيفية تعيين رقم الصفحة الأولى في Excel باستخدام Aspose.Cells لـ .NET. يرشدك هذا البرنامج التعليمي خلال كل خطوة من خطوات العملية ، من إعداد البيئة إلى تعيين رقم الصفحة الأولى. يمكنك الآن استخدام هذه المعرفة لتخصيص ترقيم الصفحات في ملفات Excel الخاصة بك.

### التعليمات

#### س 1: هل يمكنني تعيين رقم صفحة أولى مختلف لكل ورقة عمل؟

 ج ١: نعم ، يمكنك تعيين رقم صفحة أولى مختلف لكل ورقة عمل عن طريق الوصول إلى ملف`FirstPageNumber`خاصية ورقة العمل المعنية`PageSetup` هدف.

#### س 2: كيف يمكنني التحقق من رقم الصفحة الأولى لجدول بيانات موجود؟

 ج ٢: يمكنك التحقق من رقم الصفحة الأولى لورقة عمل موجودة عن طريق الوصول إلى ملف`FirstPageNumber` ممتلكات`PageSetup` كائن مطابق لورقة العمل هذه.

#### س 3: هل يبدأ ترقيم الصفحات دائمًا من 1 افتراضيًا؟

ج 3: نعم ، يبدأ ترقيم الصفحات من 1 افتراضيًا في Excel. ومع ذلك ، يمكنك استخدام الرمز الموضح في هذا البرنامج التعليمي لتعيين رقم مختلف للصفحة الأولى.

#### س 4: هل التغييرات التي يتم إجراؤها على رقم الصفحة الأولى دائمة في ملف Excel المحرر؟

A4: نعم ، يتم حفظ التغييرات التي تم إجراؤها على رقم الصفحة الأولى بشكل دائم في ملف Excel المعدل.

#### س 5: هل تعمل هذه الطريقة مع كافة تنسيقات ملفات Excel ، مثل .xls و. xlsx؟

ج 5: نعم ، تعمل هذه الطريقة مع جميع تنسيقات ملفات Excel التي يدعمها Aspose.Cells ، بما في ذلك .xls و. xlsx.