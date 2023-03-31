---
title: Class CompositeGridConfig
second_title: Aspose.OMR لمرجع .NET API
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig فصل. عنصر الشبكة . قم بإنتاج مصفوفة من الفقاعات. تمثل كل فقاعة مملوءة رمزًا واحدًا في value المركب_ سيتم ربط جميع الرموز المميزة بعلامة واحدة في value
type: docs
weight: 120
url: /ar/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

عنصر الشبكة . قم بإنتاج مصفوفة من الفقاعات. تمثل كل فقاعة مملوءة رمزًا واحدًا في value المركب_ سيتم ربط جميع الرموز المميزة بعلامة واحدة في value

```csharp
public class CompositeGridConfig : BaseConfig
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Constructor |

## الخصائص

| اسم | وصف |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | نوع الفقاعة |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | عند رسم عنصر في أصل متعدد الأعمدة - يمثل الموضع. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | مقدار الأعمدة داخل الشبكة. يمثل كل عمود رمزًا واحدًا في النتيجة value يجب أن يكون المبلغ مساويًا لـ[`ExtraRow`](./extrarow/) كمية الأعمدة |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | هل يجب عرض اسم هذه الشبكة |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | القيم الخاصة بالعمود التي سيتم وضعها فوق القيم الافتراضية -[`Values`](./values/) . مقدمة كمصفوفة ثنائية الأبعاد . الصف الأول. الثاني - العمود . كل سلسلة تمثل نصًا داخل فقاعة. إذا كانت السلسلة خالية ، فلن يتم وضع فقاعة . يجب أن يكون مقدار الأعمدة مساويًا لـ[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | محاذاة الشبكة ، تشير إلى المكان الذي يجب رسم الشبكة فيه على page |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | اتجاه الشبكة: أفقي أو عمودي. يشير إلى كيفية وضع العناصر الفرعية |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | لون حد مربع |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | حجم حد مربع |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | يشير إلى نوع العنصر المراد رسمه في بداية الشبكة |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | اسم الشبكة. تستخدم كمعرف في Recogn |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | وصف دوران عنصر الشبكة حول محوره الخاص. "90" - تدوير شبكة CompositeGrid 90 درجة "-90" - تدوير ComopositeGrid حتى -90 درجة |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | نوع عنصر omr. حقل مطلوب للتسلسل JSON . |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | مجموعة السلاسل التي ستصف الرموز المحتملة في كل عمود. يتم وضع القيم الخاصة بالعمود في[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | موضع الشبكة X على الصفحة ، يتجاوز المحاذاة |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | موضع الشبكة Y على الصفحة ، يتجاوز المحاذاة |

## مجالات

| اسم | وصف |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | حجم الفقاعة |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | الهامش بين الأسطر |

### أنظر أيضا

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* مساحة الاسم [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* المجسم [Aspose.OMR](../../)


