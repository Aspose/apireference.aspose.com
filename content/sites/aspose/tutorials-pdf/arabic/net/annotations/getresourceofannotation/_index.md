---
title: احصل على مورد من التعليقات التوضيحية
linktitle: احصل على مورد من التعليقات التوضيحية
second_title: Aspose.PDF لمرجع .NET API
description: تعرف على كيفية استرداد مورد أحد التعليقات التوضيحية باستخدام Aspose.PDF for .NET باستخدام هذا الدليل التفصيلي خطوة بخطوة.
type: docs
weight: 90
url: /ar/net/annotations/getresourceofannotation/
---
يوضح المثال كيفية الحصول على مورد التعليق التوضيحي باستخدام Aspose.PDF لـ .NET. للحصول على مورد أحد التعليقات التوضيحية باستخدام Aspose.PDF لـ .NET ، اتبع الخطوات التالية:

## الخطوة 1: قم بتعيين مسار الدليل حيث يوجد المستند.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## الخطوة 2: افتح مستند PDF الذي يحتوي على التعليق التوضيحي الذي تريد الحصول على مورده.

```csharp
Document doc = new Document(dataDir + "AddAnnotation.pdf");
```

## الخطوة 3: قم بإنشاء تعليق توضيحي.

```csharp
ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
```

## الخطوة 4: أضف التعليق التوضيحي إلى صفحة في المستند.

```csharp
doc.Pages[1].Annotations.Add(sa);
```

## الخطوة 5: احفظ المستند.

```csharp
doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## الخطوة 6: افتح المستند المعدل.

```csharp
Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## الخطوة 7: احصل على تأثير التعليق التوضيحي.

```csharp
RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
```

## الخطوة 7: احصل على عرض للعمل.

```csharp
Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
```

## الخطوة 8: احصل على مقطع الوسائط.

```csharp
MediaClip clip = (rendition as MediaRendition).MediaClip;
```

## الخطوة 9: احصل على مواصفات الملف.

```csharp
FileSpecification data = (clip as MediaClipData).Data;
```

## الخطوة 10: اقرأ بيانات الوسائط.

```csharp
MemoryStream ms = new MemoryStream();
byte[] buffer = new byte[1024];
int read = 0;
Stream source = data.Contents;
while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
{
   ms.Write(buffer, 0, read);
}
```

## الخطوة 11: اطبع اسم الترجمة وعملية التسليم.

```csharp
Console.WriteLine(rendition.Name);
Console.WriteLine(action.RenditionOperation);
```

باتباع هذه الخطوات ، يمكنك بسهولة الحصول على مورد التعليق التوضيحي في مستند PDF باستخدام Aspose.PDF لـ .NET.

### مثال على التعليمات البرمجية المصدر للحصول على مورد من التعليقات التوضيحية باستخدام Aspose.PDF لـ .NET:

```csharp
// المسار إلى دليل المستندات.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// افتح المستند
Document doc = new Document(dataDir + "AddAnnotation.pdf");
//أنشئ تعليقًا توضيحيًا
ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
doc.Pages[1].Annotations.Add(sa);
// حفظ Doucument
doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
// افتح المستند
Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
//احصل على إجراء للتعليق التوضيحي
RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
//احصل على أداء التسليم
Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
// مقطع وسائط
MediaClip clip = (rendition as MediaRendition).MediaClip;
FileSpecification data = (clip as MediaClipData).Data;
MemoryStream ms = new MemoryStream();
byte[] buffer = new byte[1024];
int read = 0;
//يمكن الوصول إلى بيانات الوسائط في FileSpecification.Contents
Stream source = data.Contents;
while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
{
ms.Write(buffer, 0, read);
}
Console.WriteLine(rendition.Name);
Console.WriteLine(action.RenditionOperation);
```

## خاتمة

في هذا البرنامج التعليمي ، اكتشفنا كيفية الحصول على مورد تعليق توضيحي معين من مستند PDF باستخدام Aspose.PDF لـ .NET. باتباع الدليل خطوة بخطوة واستخدام الكود المصدري C # المقدم ، يمكن للمطورين الوصول بسهولة إلى التعليقات التوضيحية وإدارتها ، بما في ذلك التعليقات التوضيحية للتسليم ، في مستندات PDF الخاصة بهم.

### التعليمات

#### س: ما هو التسليم في سياق تعليقات PDF التوضيحية؟

ج: في سياق التعليقات التوضيحية بتنسيق PDF ، يكون العرض عبارة عن عرض تقديمي لمحتوى الوسائط المتعددة. يسمح بتضمين الوسائط المتعددة ، مثل الصوت أو الفيديو ، في مستند PDF. يحدد التعليق التوضيحي للتسليم الوسائط التي سيتم تقديمها وكيفية تشغيلها.

#### س: هل يمكنني الحصول على اسم ملف الوسائط المرتبط بتعليق توضيحي للتسليم؟

 ج: نعم ، يمكنك الحصول على اسم ملف الوسائط المرتبط بتعليق توضيحي للتسليم باستخدام Aspose.PDF لـ .NET. يمكن الوصول إلى اسم ملف الوسائط من خلال ملف`FileSpecification` التابع`MediaClip` هدف.

#### س: هل يمكن لـ Aspose.PDF for .NET استخراج ملفات الوسائط من تعليق توضيحي للتسليم؟

ج: نعم ، يمكن لـ Aspose.PDF for .NET استخراج بيانات الوسائط من تعليق توضيحي للتسليم ، والذي يتضمن محتوى الصوت أو الفيديو ، وحفظه كملف منفصل.

#### س: كيف يمكنني الوصول إلى بيانات الوسائط لتعليق توضيحي للتسليم؟

 ج: يمكن الوصول إلى بيانات الوسائط لتعليق توضيحي للتسليم من خلال`FileSpecification.Contents` ممتلكات`MediaClipData` هدف.

#### س: هل يمكنني تعديل الوسائط المرتبطة بتعليق توضيحي للتسليم باستخدام Aspose.PDF for .NET؟

ج: يوفر Aspose.PDF for .NET طرقًا للوصول إلى بيانات الوسائط المرتبطة بتعليق توضيحي للتسليم وتعديلها. يمكنك تحديث أو استبدال ملف الوسائط المستخدم بواسطة تعليق توضيحي للتسليم.