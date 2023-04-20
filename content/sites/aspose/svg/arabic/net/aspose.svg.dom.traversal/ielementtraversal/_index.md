---
title: Interface IElementTraversal
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Traversal.IElementTraversal واجهه المستخدم. واجهة ElementTraversal هي مجموعة من سمات القراءة فقط التي تسمح للمؤلف بالتنقل بسهولة بين العناصر في المستند. في توافق عمليات تنفيذ Element Traversal  يجب على جميع الكائنات التي تنفذ Element أيضًا تنفيذ واجهة ElementTraversal .
type: docs
weight: 1230
url: /ar/net/aspose.svg.dom.traversal/ielementtraversal/
---
## IElementTraversal interface

واجهة ElementTraversal هي مجموعة من سمات القراءة فقط التي تسمح للمؤلف بالتنقل بسهولة بين العناصر في المستند. في توافق عمليات تنفيذ Element Traversal ، يجب على جميع الكائنات التي تنفذ Element أيضًا تنفيذ واجهة ElementTraversal .

```csharp
public interface IElementTraversal
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom.traversal/ielementtraversal/childelementcount/) { get; } | إرجاع العدد الحالي لعقد العناصر التي هي عناصر فرعية لهذا العنصر. 0 إذا كان هذا العنصر لا يحتوي على عقد فرعية من نوع العقدة 1. |
| [FirstElementChild](../../aspose.svg.dom.traversal/ielementtraversal/firstelementchild/) { get; } | إرجاع أول عقدة عنصر فرعي لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عناصر فرعية. |
| [LastElementChild](../../aspose.svg.dom.traversal/ielementtraversal/lastelementchild/) { get; } | إرجاع آخر عقدة عنصر فرعي لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عناصر فرعية. |
| [NextElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/nextelementsibling/) { get; } | إرجاع عقدة العنصر الشقيقة التالية لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عقد شقيقة لعنصر تأتي بعد هذا في شجرة المستند. |
| [PreviousElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/previouselementsibling/) { get; } | إرجاع عقدة العنصر الشقيقة السابقة لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عقد شقيقة لعنصر تأتي قبل هذا في شجرة الوثيقة. |

### أنظر أيضا

* مساحة الاسم [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* المجسم [Aspose.SVG](../../)


