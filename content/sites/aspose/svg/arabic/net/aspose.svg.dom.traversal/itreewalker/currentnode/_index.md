---
title: ITreeWalker.CurrentNode
second_title: Aspose.SVG لمرجع .NET API
description: ITreeWalker ملكية. العقدة التي يتم وضع TreeWalker عليها حاليًا. قد تتسبب التغييرات في شجرة DOM في عدم قبول العقدة الحالية بواسطة مرشح TreeWalker المرتبط. ضمن الشجرة الفرعية المحددة بواسطة عقدة الجذر_ أو سيتم قبولها بواسطة المرشح وعلامة whatToShow. يحدث الاجتياز الإضافي بالنسبة إلى currentNode حتى إذا لم يكن جزءًا من العرض الحالي  عن طريق تطبيق المرشحات في الاتجاه المطلوب  إذا لم يكن هناك احتمال traversal  فلن يتم تغيير العقدة الحالية.
type: docs
weight: 10
url: /ar/net/aspose.svg.dom.traversal/itreewalker/currentnode/
---
## ITreeWalker.CurrentNode property

العقدة التي يتم وضع TreeWalker عليها حاليًا. قد تتسبب التغييرات في شجرة DOM في عدم قبول العقدة الحالية بواسطة مرشح TreeWalker المرتبط. ضمن الشجرة الفرعية المحددة بواسطة عقدة الجذر_ أو سيتم قبولها بواسطة المرشح وعلامة whatToShow. يحدث الاجتياز الإضافي بالنسبة إلى currentNode حتى إذا لم يكن جزءًا من العرض الحالي ، عن طريق تطبيق المرشحات في الاتجاه المطلوب ؛ إذا لم يكن هناك احتمال traversal ، فلن يتم تغيير العقدة الحالية.

```csharp
public Node CurrentNode { get; set; }
```

### Property_Value

العقدة الحالية.

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: يتم رفعه في حالة إجراء محاولة لضبط العقدة الحالية على قيمة خالية. |

### أنظر أيضا

* class [Node](../../../aspose.svg.dom/node/)
* interface [ITreeWalker](../)
* مساحة الاسم [Aspose.Svg.Dom.Traversal](../../itreewalker/)
* المجسم [Aspose.SVG](../../../)


