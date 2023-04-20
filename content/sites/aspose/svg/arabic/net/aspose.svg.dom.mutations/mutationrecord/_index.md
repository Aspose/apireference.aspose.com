---
title: Class MutationRecord
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Mutations.MutationRecord فصل. يمثل سجل الطفرة طفرة DOM فردية. إنه الكائن الذي يتم تمريره إليهMutationObserver سMutationCallback .
type: docs
weight: 1140
url: /ar/net/aspose.svg.dom.mutations/mutationrecord/
---
## MutationRecord class

يمثل سجل الطفرة طفرة DOM فردية. إنه الكائن الذي يتم تمريره إليه[`MutationObserver`](../mutationobserver/) س[`MutationCallback`](../mutationcallback/) .

```csharp
public class MutationRecord : DOMObject
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [AddedNodes](../../aspose.svg.dom.mutations/mutationrecord/addednodes/) { get; } | إرجاع العقد المضافة . |
| [AttributeName](../../aspose.svg.dom.mutations/mutationrecord/attributename/) { get; } | تُرجع الاسم المحلي للسمة التي تم تغييرها ، وتكون خالية بخلاف ذلك. |
| [AttributeNamespace](../../aspose.svg.dom.mutations/mutationrecord/attributenamespace/) { get; } | إرجاع مساحة الاسم للسمة التي تم تغييرها ، وبخلاف ذلك خالية. |
| [NextSibling](../../aspose.svg.dom.mutations/mutationrecord/nextsibling/) { get; } | إرجاع الشقيق التالي للعقد المضافة أو التي تمت إزالتها ، أو فارغة. |
| [OldValue](../../aspose.svg.dom.mutations/mutationrecord/oldvalue/) { get; } | تعتمد القيمة المعادة على النوع. بالنسبة إلى "السمات" ، فهي قيمة السمة التي تم تغييرها قبل التغيير. |
| [PreviousSibling](../../aspose.svg.dom.mutations/mutationrecord/previoussibling/) { get; } | إرجاع الشقيق السابق للعقد المضافة أو التي تمت إزالتها ، أو فارغة. |
| [RemovedNodes](../../aspose.svg.dom.mutations/mutationrecord/removednodes/) { get; } | قم بإرجاع العقد التي تمت إزالتها. |
| [Target](../../aspose.svg.dom.mutations/mutationrecord/target/) { get; } | تُرجع العقدة التي تأثرت بها الطفرة ، اعتمادًا على النوع. بالنسبة إلى "السمات" ، هو العنصر الذي تغيرت صفته. بالنسبة لـ "CharacterData" ، فهي عقدة CharacterData. بالنسبة إلى "قائمة الأطفال" ، فإن العقدة هي التي تغيرت عناصرها الفرعية. |
| [Type](../../aspose.svg.dom.mutations/mutationrecord/type/) { get; } | تُرجع "السمات" إذا كانت طفرة في السمة ، و "characterData" إذا كانت طفرة في عقدة CharacterData و "قائمة الأطفال" إذا كانت طفرة في شجرة العقد. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |

### أنظر أيضا

* class [DOMObject](../../aspose.svg.dom/domobject/)
* مساحة الاسم [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* المجسم [Aspose.SVG](../../)


