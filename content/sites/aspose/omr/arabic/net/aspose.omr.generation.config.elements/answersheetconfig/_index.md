---
title: Class AnswerSheetConfig
second_title: Aspose.OMR لمرجع .NET API
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig فصل. يمثل عنصر ورقة الإجابة. يسمح بإضافة مربعات اختيار مجمعة في أعمدة وصفوف. استخدم ورقة الإجابة إذا كنت ترغب في احتواء الكثير من الأسئلة على إحدى الصفحات نظرًا لأنها تقع بالقرب من بعضها البعض .
type: docs
weight: 90
url: /ar/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

يمثل عنصر ورقة الإجابة. يسمح بإضافة مربعات اختيار مجمعة في أعمدة وصفوف. استخدم ورقة الإجابة إذا كنت ترغب في احتواء الكثير من الأسئلة على إحدى الصفحات نظرًا لأنها تقع بالقرب من بعضها البعض .

```csharp
public class AnswerSheetConfig : BaseConfig
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Default_Constructor |

## الخصائص

| اسم | وصف |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | عدد خيارات الإجابة لكل سؤال في ورقة الإجابة. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | تمثل كل قيمة رمزًا داخل الفقاعة. يجب أن يكون له نفس عدد[`AnswersCount`](./answerscount/) مثال: سلسلة جديدة [] {"A"، "B"، "C"، "D"} مثال: سلسلة جديدة [] {"1"، "2"، "3"، "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | نوع الفقاعة |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | يشير إلى العمود الذي سيتم رسم الورقة فيه |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | يحدد عدد الأعمدة المراد رسمها. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | يحدد العدد الإجمالي للأسئلة في ورقة الإجابة. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | اسم ورقة الإجابة |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | فهرس البداية للأسئلة numbering |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | نوع عنصر omr. حقل مطلوب للتسلسل JSON . |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | الهامش الرأسي لورقة الإجابة. ضبط بالبكسل. |

## مجالات

| اسم | وصف |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | حجم الفقاعة |

### أنظر أيضا

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* مساحة الاسم [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* المجسم [Aspose.OMR](../../)


