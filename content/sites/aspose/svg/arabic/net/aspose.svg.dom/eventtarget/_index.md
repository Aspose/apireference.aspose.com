---
title: Class EventTarget
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.EventTarget فصل. ملفEventTarget يتم تنفيذ الواجهة بواسطة جميع العقد في تطبيق يدعم نموذج حدث DOM . لذلك  يمكن الحصول على هذه الواجهة باستخدام طرق الصب الخاصة بالربط على مثيل لواجهة Node. تسمح الواجهة بتسجيل وإزالة مستمعي الأحداث على اEventTarget وإرسال الأحداث إلى ذلكIEventTarget .
type: docs
weight: 870
url: /ar/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

ملف`EventTarget` يتم تنفيذ الواجهة بواسطة جميع العقد في تطبيق يدعم نموذج حدث DOM . لذلك ، يمكن الحصول على هذه الواجهة باستخدام طرق الصب الخاصة بالربط على مثيل لواجهة Node. تسمح الواجهة بتسجيل وإزالة مستمعي الأحداث على ا`EventTarget` وإرسال الأحداث إلى ذلك[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## طُرق

| اسم | وصف |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | تسمح هذه الطريقة بإرسال الأحداث إلى نموذج حدث عمليات التنفيذ. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | تنفيذ مهام محددة بواسطة التطبيق مرتبطة بتحرير الموارد غير المُدارة أو تحريرها أو إعادة تعيينها. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف`EventTarget` أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف`EventTarget` أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف`EventTarget` أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |

### أنظر أيضا

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* مساحة الاسم [Aspose.Svg.Dom](../../aspose.svg.dom/)
* المجسم [Aspose.SVG](../../)


