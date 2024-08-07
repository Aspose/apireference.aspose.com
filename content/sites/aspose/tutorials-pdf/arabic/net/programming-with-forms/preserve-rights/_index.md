---
title: حقوق الحفظ
linktitle: حقوق الحفظ
second_title: Aspose.PDF لمرجع .NET API
description: احتفظ بحقوق النموذج في مستندات PDF الخاصة بك باستخدام Aspose.PDF for .NET.
type: docs
weight: 210
url: /ar/net/programming-with-forms/preserve-rights/
---
في هذا البرنامج التعليمي ، سنوضح لك كيفية الحفاظ على حقوق النموذج في مستند PDF باستخدام Aspose.PDF لـ .NET. سنشرح كود المصدر C # خطوة بخطوة لإرشادك خلال هذه العملية.

## الخطوة الأولى: التحضير

تأكد من أنك قمت باستيراد المكتبات الضرورية وقم بتعيين المسار إلى دليل المستندات الخاص بك:

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## الخطوة 2: افتح المستند

 افتح مستند PDF المصدر باستخدام ملف`FileStream` بإذن القراءة والكتابة:

```csharp
FileStream fs = new FileStream(dataDir + "input.pdf", FileMode.Open, FileAccess.ReadWrite);
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document(fs);
```

## الخطوة 3: تحرير حقول النموذج

انتقل إلى جميع حقول النموذج في المستند وقم بإجراء التغييرات اللازمة. في هذا المثال ، نقوم بتغيير قيمة حقل النموذج الذي يحتوي اسمه على "A1":

```csharp
foreach(Field formField in pdfDocument.Form)
{
if (formField.FullName.Contains("A1"))
{
TextBoxField textBoxField = formField as TextBoxField;
textBoxField.Value = "Testing";
}
}
```

## الخطوة 4: احفظ المستند المحدث

احفظ مستند PDF المعدل:

```csharp
pdfDocument.Save();
```

##  الخطوة 5: أغلق ملف`FileStream`

 لا تنسى إغلاق ملف`FileStream` كائن عند الانتهاء:

```csharp
fs. Close();
```

### نموذج التعليمات البرمجية المصدر لـ Preserve Rights باستخدام Aspose.PDF لـ .NET 
```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// اقرأ نموذج PDF المصدر باستخدام FileAccess of Read and Write.
// نحتاج إلى إذن ReadWrite لأنه بعد التعديل ،
// نحتاج إلى حفظ المحتويات المحدثة في نفس المستند / الملف.
FileStream fs = new FileStream(dataDir + "input.pdf", FileMode.Open, FileAccess.ReadWrite);
// مثيل المستند
Aspose.Pdf.Document pdfDocument = new Aspose.Pdf.Document(fs);
// احصل على القيم من جميع المجالات
foreach (Field formField in pdfDocument.Form)
{
	// إذا كان الاسم الكامل للحقل يحتوي على A1 ، فقم بإجراء العملية
	if (formField.FullName.Contains("A1"))
	{
		// إرسال حقل النموذج إلى TextBox
		TextBoxField textBoxField = formField as TextBoxField;
		// تعديل قيمة الحقل
		textBoxField.Value = "Testing";
	}
}
// احفظ المستند المحدث في حفظ FileStream
pdfDocument.Save();
// أغلق كائن "دفق الملفات"
fs.Close();
```

## خاتمة

في هذا البرنامج التعليمي ، تعلمنا كيفية الحفاظ على حقوق النموذج في مستند PDF باستخدام Aspose.PDF لـ .NET. باتباع هذه الخطوات ، يمكنك الوصول بسهولة إلى حقول النموذج وإجراء تغييرات محددة مع الحفاظ على أذونات الوصول والكتابة.


### التعليمات

#### س: هل يمكنني الاحتفاظ بحقوق حقول نموذج معينة دون التأثير على الآخرين في مستند PDF؟

 ج: نعم ، باستخدام ملف`FullName` خاصية حقول النموذج ، يمكنك استهداف حقول نموذج معينة للحفظ مع ترك الآخرين دون تأثر.

#### س: هل يمكنني الاحتفاظ بحقوق نموذج في مستند PDF محمي بكلمة مرور؟

ج: نعم ، يسمح لك Aspose.PDF for .NET بالحفاظ على حقوق النموذج حتى في مستندات PDF المحمية بكلمة مرور ، طالما أنك توفر كلمة المرور الصحيحة للوصول إلى الملف وتعديله.

#### س: ماذا يحدث إذا حاولت تعديل حقول النموذج بدون حقوق الوصول المناسبة؟

ج: إذا حاولت تعديل حقول النموذج بدون حقوق الوصول المناسبة ، فلن يتم حفظ التغييرات في مستند PDF ، وقد تتلقى استثناء أو رسالة خطأ.

#### س: هل Aspose.PDF for .NET متوافق مع كافة إصدارات .NET Framework؟

ج: نعم ، Aspose.PDF for .NET متوافق مع كافة إصدارات .NET Framework ، بما في ذلك .NET Core و .NET Standard.

#### س: هل يمكنني الاحتفاظ بحقوق النموذج في مستند PDF برمجيًا بلغات البرمجة الأخرى إلى جانب C #؟

ج: نعم ، يدعم Aspose.PDF for .NET لغات البرمجة المختلفة ، مثل VB.NET و ASP.NET ، بالإضافة إلى C #.