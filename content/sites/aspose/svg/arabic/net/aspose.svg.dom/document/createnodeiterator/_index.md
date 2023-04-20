---
title: Document.CreateNodeIterator
second_title: Aspose.SVG لمرجع .NET API
description: Document طريقة. قم بإنشاء NodeIterator جديد فوق الشجرة الفرعية التي تم تحديد جذرها في العقدة المحددة.
type: docs
weight: 900
url: /ar/net/aspose.svg.dom/document/createnodeiterator/
---
## CreateNodeIterator(Node) {#createnodeiterator}

قم بإنشاء NodeIterator جديد فوق الشجرة الفرعية التي تم تحديد جذرها في العقدة المحددة.

```csharp
public INodeIterator CreateNodeIterator(Node root)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| root | Node | العقدة التي سيتم تكرارها مع توابعها. يتم وضع المكرر في البداية قبل هذه العقدة مباشرةً. إشارات whatToShow والمرشح ، إن وجد ، لا يتم اعتبارهما عند تعيين هذا الموضع. يجب ألا يكون الجذر فارغًا. |

### قيمة الإرجاع

NodeIterator الذي تم إنشاؤه حديثًا .

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: يُثار إذا كان الجذر المحدد هو فارغًا. |

### أنظر أيضا

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* class [Document](../)
* مساحة الاسم [Aspose.Svg.Dom](../../document/)
* المجسم [Aspose.SVG](../../../)

---

## CreateNodeIterator(Node, long) {#createnodeiterator_1}

قم بإنشاء NodeIterator جديد فوق الشجرة الفرعية التي تم تحديد جذرها في العقدة المحددة.

```csharp
public INodeIterator CreateNodeIterator(Node root, long whatToShow)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| root | Node | العقدة التي سيتم تكرارها مع توابعها. يتم وضع المكرر في البداية قبل هذه العقدة مباشرةً. إشارات whatToShow والمرشح ، إن وجد ، لا يتم اعتبارهما عند تعيين هذا الموضع. يجب ألا يكون الجذر فارغًا. |
| whatToShow | Int64 | تحدد العلامة أنواع العقدة التي قد تظهر في العرض المنطقي للشجرة الذي يقدمه المكرر. راجع وصف ل NodeFilter لمجموعة من القيم الممكنة SHOW_. يمكن دمج هذه العلامات باستخدام أو. |

### قيمة الإرجاع

NodeIterator الذي تم إنشاؤه حديثًا .

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: يُثار إذا كان الجذر المحدد هو فارغًا. |

### أنظر أيضا

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* class [Document](../)
* مساحة الاسم [Aspose.Svg.Dom](../../document/)
* المجسم [Aspose.SVG](../../../)

---

## CreateNodeIterator(Node, long, INodeFilter) {#createnodeiterator_2}

قم بإنشاء NodeIterator جديد فوق الشجرة الفرعية التي تم تحديد جذرها في العقدة المحددة.

```csharp
public INodeIterator CreateNodeIterator(Node root, long whatToShow, INodeFilter filter)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| root | Node | العقدة التي سيتم تكرارها مع توابعها. يتم وضع المكرر في البداية قبل هذه العقدة مباشرةً. إشارات whatToShow والمرشح ، إن وجد ، لا يتم اعتبارهما عند تعيين هذا الموضع. يجب ألا يكون الجذر فارغًا. |
| whatToShow | Int64 | تحدد العلامة أنواع العقدة التي قد تظهر في العرض المنطقي للشجرة الذي يقدمه المكرر. راجع وصف ل NodeFilter لمجموعة من القيم الممكنة SHOW_. يمكن دمج هذه العلامات باستخدام أو. |
| filter | INodeFilter | NodeFilter للاستخدام مع this TreeWalker ، أو null للإشارة إلى عدم وجود عامل تصفية. |

### قيمة الإرجاع

NodeIterator الذي تم إنشاؤه حديثًا .

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: يُثار إذا كان الجذر المحدد هو فارغًا. |

### أنظر أيضا

* interface [INodeIterator](../../../aspose.svg.dom.traversal/inodeiterator/)
* class [Node](../../node/)
* interface [INodeFilter](../../../aspose.svg.dom.traversal/inodefilter/)
* class [Document](../)
* مساحة الاسم [Aspose.Svg.Dom](../../document/)
* المجسم [Aspose.SVG](../../../)


