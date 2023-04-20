---
title: Interface IEventListener
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Events.IEventListener واجهه المستخدم. ملفIEventListenerالواجهة هي الطريقة الأساسية لمعالجة الأحداث. يقوم المستخدمون بتنفيذIEventListener واجهة وتسجيل المستمع الخاص بهم على ملفEventTarget باستخدامAddEventListener method. يجب على المستخدمين أيضًا إزالة ملفاتIEventListener منهاEventTarget بعد الانتهاء من استخدام المستمع.
type: docs
weight: 950
url: /ar/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

ملف`IEventListener`الواجهة هي الطريقة الأساسية لمعالجة الأحداث. يقوم المستخدمون بتنفيذ`IEventListener` واجهة وتسجيل المستمع الخاص بهم على ملف[`EventTarget`](../../aspose.svg.dom/eventtarget/) باستخدام[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. يجب على المستخدمين أيضًا إزالة ملفات`IEventListener` منها[`EventTarget`](../../aspose.svg.dom/eventtarget/) بعد الانتهاء من استخدام المستمع.

```csharp
public interface IEventListener
```

## طُرق

| اسم | وصف |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | يتم استدعاء هذه الطريقة كلما حدث حدث من النوع الذي تم`IEventListener` تم تسجيل الواجهة. |

### ملاحظات

عند نسخ عقدة باستخدام أسلوب cloneNode ، لا يتم إرفاق مستمعات الأحداث المرفقة بالعقدة المصدر بالعقدة المنسوخة.

### أنظر أيضا

* مساحة الاسم [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* المجسم [Aspose.SVG](../../)


