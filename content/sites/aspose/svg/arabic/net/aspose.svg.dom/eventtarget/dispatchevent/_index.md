---
title: EventTarget.DispatchEvent
second_title: Aspose.SVG لمرجع .NET API
description: EventTarget طريقة. تسمح هذه الطريقة بإرسال الأحداث إلى نموذج حدث عمليات التنفيذ.
type: docs
weight: 20
url: /ar/net/aspose.svg.dom/eventtarget/dispatchevent/
---
## EventTarget.DispatchEvent method

تسمح هذه الطريقة بإرسال الأحداث إلى نموذج حدث عمليات التنفيذ.

```csharp
public bool DispatchEvent(Event @event)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| event | Event | يحدد نوع الحدث والسلوك والمعلومات السياقية التي سيتم استخدامها في معالجة الحدث. |

### قيمة الإرجاع

القيمة المرجعة لـ`DispatchEvent` يشير إلى ما إذا تم استدعاء أي من المستمعين الذين تعاملوا مع الحدث[`PreventDefault`](../../../aspose.svg.dom.events/event/preventdefault/) . إذا[`PreventDefault`](../../../aspose.svg.dom.events/event/preventdefault/) كان يسمى القيمة خاطئة ، وإلا كانت القيمة صحيحة .

### استثناءات

| استثناء | حالة |
| --- | --- |
| [DOMException](../../domexception/) |  |

### ملاحظات

الأحداث المرسلة بهذه الطريقة سيكون لها نفس سلوك الالتقاط والفقاعات مثل الأحداث المرسلة مباشرة بواسطة التنفيذ. الهدف من الحدث هو[`EventTarget`](../) التي`DispatchEvent` يسمى .

### أنظر أيضا

* class [Event](../../../aspose.svg.dom.events/event/)
* class [EventTarget](../)
* مساحة الاسم [Aspose.Svg.Dom](../../eventtarget/)
* المجسم [Aspose.SVG](../../../)


