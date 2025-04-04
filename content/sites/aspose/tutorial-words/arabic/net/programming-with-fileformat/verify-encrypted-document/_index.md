---
title: تحقق من المستند المشفر
linktitle: تحقق من المستند المشفر
second_title: Aspose.Words لمراجع .NET API
description: دليل تفصيلي خطوة بخطوة للتحقق من أن المستند مشفر باستخدام Aspose.Words for .NET.
type: docs
weight: 10
url: /ar/net/programming-with-fileformat/verify-encrypted-document/
---

توفر هذه المقالة دليلًا تفصيليًا حول كيفية استخدام ميزة التحقق من المستند المشفر مع Aspose.Words for .NET. سنشرح كل جزء من الكود بالتفصيل. في نهاية هذا البرنامج التعليمي ، ستتمكن من فهم كيفية التحقق مما إذا كان المستند مشفرًا.

قبل أن تبدأ ، تأكد من تثبيت وتهيئة مكتبة Aspose.Words for .NET في مشروعك. يمكنك العثور على المكتبة وإرشادات التثبيت على موقع Aspose.

## الخطوة 1: تحديد دليل المستند

 للبدء ، تحتاج إلى تحديد المسار إلى الدليل حيث توجد مستنداتك. يستبدل`"YOUR DOCUMENT DIRECTORY"` مع المسار الفعلي إلى دليل المستندات الخاص بك.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## الخطوة 2: كشف تنسيق الملف

 بعد ذلك ، نستخدم ملف`DetectFileFormat` طريقة`FileFormatUtil` فئة للكشف عن معلومات تنسيق الملف. في هذا المثال ، نفترض أن المستند المشفر يسمى "Encrypted.docx" وموجود في دليل المستندات المحدد.

```csharp
FileFormatInfo info = FileFormatUtil.DetectFileFormat(dataDir + "Encrypted.docx");
```

## الخطوة 3: تحقق مما إذا كان المستند مشفرًا

 نحن نستخدم ال`IsEncrypted` ممتلكات`FileFormatInfo` للتحقق مما إذا كان المستند مشفرًا. تعود هذه الخاصية`true` إذا تم تشفير المستند ، وإلا فإنه يعود`false`. نعرض النتيجة في وحدة التحكم.

```csharp
Console.WriteLine(info.IsEncrypted);
```

هذا كل شئ ! لقد نجحت في التحقق مما إذا كان المستند مشفرًا باستخدام Aspose.Words for .NET.

### مثال على شفرة المصدر للتحقق من المستندات المشفرة باستخدام Aspose.Words for .NET

```csharp

	// المسار إلى دليل المستندات.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	FileFormatInfo info = FileFormatUtil.DetectFileFormat(dataDir + "Encrypted.docx");
	Console.WriteLine(info.IsEncrypted);
            
        
```
