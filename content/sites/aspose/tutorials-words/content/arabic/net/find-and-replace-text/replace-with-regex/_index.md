---
title: استبدل بـ Regex
linktitle: استبدل بـ Regex
second_title: Aspose.Words واجهة برمجة تطبيقات معالجة المستندات
description: تعرف على كيفية إجراء استبدال نص يعتمد على التعبير العادي في مستند Word باستخدام Aspose.Words for .NET.
type: docs
weight: 10
url: /ar/net/find-and-replace-text/replace-with-regex/
---
في هذه المقالة، سنستكشف التعليمات البرمجية المصدر لـ C# أعلاه لفهم كيفية استخدام وظيفة Replace With Regex في مكتبة Aspose.Words for .NET. تتيح لك هذه الميزة إجراء استبدال النص بناءً على أنماط محددة يحددها التعبير العادي.

## المتطلبات الأساسية

- المعرفة الأساسية بلغة C#.
- بيئة تطوير .NET مع تثبيت مكتبة Aspose.Words.

## الخطوة 1: إنشاء مستند جديد

 قبل أن نبدأ في استخدام استبدال التعبير العادي، نحتاج إلى إنشاء مستند جديد باستخدام Aspose.Words for .NET. يمكن القيام بذلك عن طريق إنشاء مثيل لـ`Document` هدف:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
```

## الخطوة 2: أدخل النص في المستند

 بمجرد حصولنا على مستند، يمكننا إدراج نص باستخدام ملف`DocumentBuilder` هدف. في مثالنا، نستخدم`Writeln` طريقة إدخال عبارة "حزين مجنون سيء":

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("sad mad bad");
```

## الخطوة 3: تكوين خيارات البحث والاستبدال

 سنقوم الآن بتكوين خيارات البحث والاستبدال باستخدام ملف`FindReplaceOptions`هدف. في مثالنا، نستخدم الخيارات الافتراضية:

```csharp
FindReplaceOptions options = new FindReplaceOptions();
```

## الخطوة 4: استبدل بالتعبير العادي

 نحن نستخدم ال`Range.Replace` طريقة لإجراء استبدال النص باستخدام تعبير عادي. في مثالنا، نستخدم التعبير العادي "[س|m]ad" to find the words "sad" and "mad" and replace them with the word "bad":

```csharp
doc.Range.Replace(new Regex("[s|m]ad"), "bad", options);
```

## الخطوة 5: حفظ المستند المعدل

 وأخيرًا، نقوم بحفظ المستند المعدل في دليل محدد باستخدام الملف`Save` طريقة:

```csharp
doc.Save(dataDir + "FindAndReplace.ReplaceWithRegex.docx");
```

### مثال على التعليمات البرمجية المصدر لـ Replace With Regex باستخدام Aspose.Words لـ .NET

فيما يلي نموذج التعليمات البرمجية المصدر الكامل لتوضيح استخدام استبدال التعبير العادي باستخدام Aspose.Words لـ .NET:

```csharp

	// المسار إلى دليل المستندات.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	
	builder.Writeln("sad mad bad");

	FindReplaceOptions options = new FindReplaceOptions();

	doc.Range.Replace(new Regex("[s|m]ad"), "bad", options);

	doc.Save(dataDir + "FindAndReplace.ReplaceWithRegex.docx");
  
```

## خاتمة

في هذه المقالة، قمنا باستكشاف التعليمات البرمجية المصدر لـ C# لفهم كيفية استخدام وظيفة Replace With Regex الخاصة بـ Aspose.Words لـ .NET. لقد اتبعنا دليلاً خطوة بخطوة لإنشاء مستند وإدراج نص وإجراء الاستبدال بتعبير عادي وحفظ المستند المعدل.

### الأسئلة الشائعة

#### س: ما هي وظيفة "الاستبدال بـ Regex" في Aspose.Words لـ .NET؟

ج: تتيح لك وظيفة "Replace With Regex" في Aspose.Words for .NET إجراء استبدال النص بناءً على أنماط محددة يحددها التعبير العادي. فهو يمكّنك من البحث عن النص واستبداله في مستند عن طريق تحديد أنماط بحث معقدة باستخدام التعبيرات العادية.

#### س: كيف يمكنني إنشاء مستند جديد باستخدام Aspose.Words لـ .NET؟

 ج: لإنشاء مستند جديد باستخدام Aspose.Words لـ .NET، يمكنك إنشاء مثيل`Document` هدف. فيما يلي مثال على كود C# لإنشاء مستند جديد:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
```

#### س: كيف يمكنني إدراج نص في مستند باستخدام Aspose.Words for .NET؟

 ج: بمجرد حصولك على مستند، يمكنك إدراج نص باستخدام ملف`DocumentBuilder` هدف. في Aspose.Words for .NET، يمكنك استخدام طرق مختلفة لـ`DocumentBuilder` فئة لإدراج النص في مواقع مختلفة. على سبيل المثال، يمكنك استخدام`Writeln` طريقة إدراج نص في سطر جديد هنا مثال:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("sad mad bad");
```

#### س: ما هي خيارات البحث والاستبدال في Aspose.Words لـ .NET؟

 ج: البحث عن الخيارات واستبدالها في Aspose. تسمح لك الكلمات الخاصة بـ .NET بتكوين كيفية إجراء عملية البحث والاستبدال. تتضمن بعض الخيارات شائعة الاستخدام`MatchCase` (لتحديد ما إذا كان البحث حساسًا لحالة الأحرف أم لا)،`FindWholeWordsOnly` (لمطابقة الكلمات الكاملة فقط)، و`Direction` (لتحديد اتجاه البحث). يمكنك تخصيص هذه الخيارات بناءً على متطلباتك المحددة.

#### س: كيف يمكنني إجراء استبدال النص باستخدام تعبير عادي في Aspose.Words لـ .NET؟

 ج: لإجراء استبدال النص باستخدام تعبير عادي في Aspose.Words لـ .NET، يمكنك استخدام`Range.Replace` طريقة وتمرير أ`Regex` كائن كنمط البحث. يتيح لك ذلك تحديد أنماط البحث المعقدة باستخدام التعبيرات العادية. هنا مثال:

```csharp
doc.Range.Replace(new Regex("[s|m]ad"), "bad", options);
```

#### س: هل يمكنني استبدال النص بمحتوى مختلف بناءً على النمط المطابق باستخدام التعبيرات العادية في Aspose.Words for .NET؟

ج: نعم، يمكنك استبدال النص بمحتوى مختلف بناءً على النمط المطابق باستخدام التعبيرات العادية في Aspose.Words لـ .NET. من خلال التقاط المجموعات في نمط التعبير العادي، يمكنك الرجوع إلى المجموعات الملتقطة واستخدامها في السلسلة البديلة. وهذا يسمح بالبدائل الديناميكية بناءً على النمط المطابق.

#### س: هل هناك أي قيود أو اعتبارات عند استخدام التعبيرات العادية لاستبدال النص في Aspose.Words لـ .NET؟

ج: عند استخدام التعبيرات العادية لاستبدال النص في Aspose.Words لـ .NET، من المهم أن تضع في اعتبارك التعقيد والتأثيرات على الأداء. يمكن أن تكون التعبيرات العادية قوية، ولكن الأنماط المعقدة قد تؤثر على أداء عملية البحث والاستبدال. بالإضافة إلى ذلك، تأكد من أن تعبيراتك العادية دقيقة وتأخذ في الاعتبار أي حالات حافة أو تعارضات محتملة مع محتوى المستند.

#### س: هل يمكنني إجراء استبدال نص غير حساس لحالة الأحرف باستخدام التعبيرات العادية في Aspose.Words لـ .NET؟

ج: نعم، يمكنك إجراء استبدال نص غير حساس لحالة الأحرف باستخدام التعبيرات العادية في Aspose.Words لـ .NET. بشكل افتراضي، تكون التعبيرات العادية في .NET حساسة لحالة الأحرف. ومع ذلك، يمكنك تعديل السلوك باستخدام علامة RegexOptions.IgnoreCase المناسبة عند إنشاء كائن Regex الخاص بك.

#### س: هل يمكنني استبدال النص في مستندات متعددة باستخدام وظيفة "Replace With Regex" في Aspose.Words for .NET؟

ج: نعم، يمكنك استبدال النص في مستندات متعددة باستخدام وظيفة "Replace With Regex" في Aspose.Words لـ .NET. ما عليك سوى تكرار الخطوات لكل مستند تريد معالجته. قم بتحميل كل مستند، وقم بإجراء استبدال النص باستخدام التعبير العادي المحدد، واحفظ المستند المعدل. يمكنك أتمتة هذه العملية لمستندات متعددة ضمن حلقة أو بالتكرار على قائمة مسارات ملفات المستندات.