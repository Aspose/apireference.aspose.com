---
title: أزل عدة جداول من مستند PDF
linktitle: أزل عدة جداول من مستند PDF
second_title: Aspose.PDF لمرجع .NET API
description: تعرف على كيفية إزالة جداول متعددة في مستند PDF باستخدام Aspose.PDF for .NET.
type: docs
weight: 150
url: /ar/net/programming-with-tables/remove-multiple-tables/
---
في هذا البرنامج التعليمي ، سنوجهك خطوة بخطوة لإزالة جداول متعددة في مستند PDF باستخدام Aspose.PDF for .NET. سنشرح كود المصدر C # المقدم ونوضح لك كيفية تنفيذه.

## الخطوة 1: تحميل مستند PDF الحالي
أولاً ، تحتاج إلى تحميل مستند PDF الحالي باستخدام الكود التالي:

```csharp
// المسار إلى دليل المستندات
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// قم بتحميل مستند PDF الحالي
Document pdfDocument = new Document(dataDir + "Table_input2.pdf");
```

## الخطوة 2: إنشاء كائن TableAbsorber للعثور على الجداول
بعد ذلك ، سننشئ كائن TableAbsorber للعثور على الجداول في مستند PDF:

```csharp
// قم بإنشاء كائن TableAbsorber للعثور على الجداول
TableAbsorber absorber = new TableAbsorber();
```

## الخطوة الثالثة: قم بزيارة الصفحة الثانية مع جهاز الامتصاص
سنقوم الآن بزيارة الصفحة الثانية من مستند PDF باستخدام أداة الامتصاص:

```csharp
// قم بزيارة الصفحة الثانية مع الممتص
absorb.Visit(pdfDocument.Pages[1]);
```

## الخطوة 4: الحصول على نسخة من مجموعة الجدول
لكي نتمكن من إسقاط الجداول ، نحتاج إلى الحصول على نسخة من مجموعة الجداول:

```csharp
// احصل على نسخة من مجموعة الجدول
AbsorbedTable[] tables = new AbsorbedTable[absorb.TableList.Count];
absorb.TableList.CopyTo(tables, 0);
```

## الخطوة 5: تصفح نسخة المجموعة وقم بإزالة الجداول
الآن دعنا نكرر نسخة مجموعة الجداول ونزيلها واحدة تلو الأخرى:

```csharp
// تصفح نسخة المجموعة وإزالة الجداول
foreach(AbsorbedTable table in tables)
     absorb.Remove(table);
```

## الخطوة 6: حفظ المستند
أخيرًا ، نحفظ مستند PDF المعدل:

```csharp
// احفظ المستند
pdfDocument.Save(dataDir + "Table2_out.pdf");
```

### مثال على التعليمات البرمجية المصدر لـ Remove Multiple Tables باستخدام Aspose.PDF for .NET

```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// قم بتحميل مستند PDF موجود
Document pdfDocument = new Document(dataDir + "Table_input2.pdf");

// قم بإنشاء كائن TableAbsorber للعثور على الجداول
TableAbsorber absorber = new TableAbsorber();

// قم بزيارة الصفحة الثانية بالممتص
absorber.Visit(pdfDocument.Pages[1]);

// احصل على نسخة من مجموعة الجدول
AbsorbedTable[] tables = new AbsorbedTable[absorber.TableList.Count];
absorber.TableList.CopyTo(tables, 0);

// قم بالتكرار خلال نسخة جداول التجميع والإزالة
foreach (AbsorbedTable table in tables)
	absorber.Remove(table);

// احفظ المستند
pdfDocument.Save(dataDir + "Table2_out.pdf");
```

## خاتمة
تهنئة ! لقد تعلمت الآن كيفية إزالة جداول متعددة في مستند PDF باستخدام Aspose.PDF for .NET. يوضح لك هذا الدليل التفصيلي كيفية تحميل المستند والعثور على الجداول وإزالتها. الآن يمكنك تطبيق هذه المعرفة على مشاريعك الخاصة.

### الأسئلة الشائعة حول إزالة جداول متعددة في مستند PDF

#### س: هل يمكنني إزالة جداول معينة بدلاً من جميع الجداول في مستند PDF؟

 ج: نعم ، يمكنك إزالة جداول معينة بدلاً من جميع الجداول في مستند PDF باستخدام Aspose.PDF for .NET. في المثال المقدم ، تمت إزالة جميع الجداول الموجودة في الصفحة الثانية. ومع ذلك ، يمكنك تعديل التعليمات البرمجية لاستهداف وإزالة جداول معينة بناءً على متطلباتك. للقيام بذلك ، تحتاج إلى تحديد الجداول التي تريد إزالتها ثم استدعاء`absorber.Remove(table)` طريقة لكل جدول محدد ترغب في حذفه.

#### س: كيف يمكنني إزالة الجداول من عدة صفحات في وثيقة PDF؟

 ج: لإزالة الجداول من عدة صفحات في مستند PDF ، تحتاج إلى تكرار العملية لكل صفحة. في المثال المقدم ، تزيل الشفرة الجداول فقط من الصفحة الثانية باستخدام`pdfDocument.Pages[1]` . لإزالة الجداول من الصفحات الأخرى ، يمكنك استخدام رمز مشابه لكل صفحة مرغوبة عن طريق استبدال فهرس الصفحة (على سبيل المثال ،`pdfDocument.Pages[2]`, `pdfDocument.Pages[3]`، وما إلى ذلك وهلم جرا).

#### س: ماذا يحدث إذا حاولت إزالة جدول غير موجود في الصفحة المحددة؟

ج: إذا حاولت إزالة جدول غير موجود في الصفحة المحددة ، فلن يؤدي ذلك إلى حدوث خطأ. ال`absorber.Remove(table)` ستتجاهل الطريقة ببساطة طلب الإزالة ، وسيظل مستند PDF بدون تغيير.

#### س: هل يمكنني التراجع عن إزالة الجداول بعد حفظ المستند؟

ج: لا ، بمجرد حفظ مستند PDF المعدل بعد إزالة الجداول ، تكون التغييرات دائمة ، ولا يمكنك التراجع عن إزالة الجداول. لذلك ، من الضروري توخي الحذر أثناء إزالة المحتوى من مستند PDF حيث ستفقد البيانات الأصلية.

#### س: هل توجد أي قيود على نوع الجداول التي يمكن إزالتها بهذه الطريقة؟

ج: تسمح لك الطريقة الموضحة في هذا البرنامج التعليمي بإزالة الجداول من مستند PDF دون قيود بناءً على محتوى الجدول. ومع ذلك ، فمن الضروري النظر في الهيكل العام وتخطيط المستند للتأكد من أن إزالة الجداول لا تؤثر سلبًا على المحتوى المتبقي وسهولة القراءة.