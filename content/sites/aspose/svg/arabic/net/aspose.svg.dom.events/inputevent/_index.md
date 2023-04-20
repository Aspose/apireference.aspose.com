---
title: Class InputEvent
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Events.InputEvent فصل. يتم إرسال أحداث الإدخال كإخطارات عندما يتم تحديث DOM.
type: docs
weight: 970
url: /ar/net/aspose.svg.dom.events/inputevent/
---
## InputEvent class

يتم إرسال أحداث الإدخال كإخطارات عندما يتم تحديث DOM.

```csharp
public class InputEvent : UIEvent
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [InputEvent](inputevent/#constructor)(string) | يقوم بتهيئة مثيل جديد لملف`InputEvent` فئة . |
| [InputEvent](inputevent/#constructor_1)(string, IDictionary&lt;string, object&gt;) | يقوم بتهيئة مثيل جديد لملف`InputEvent` فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | يُستخدم للإشارة إلى ما إذا كان الحدث عبارة عن حدث فقاعات أم لا. إذا كان الحدث يمكن أن ينفجر ، تكون القيمة صحيحة ، وإلا تكون القيمة خاطئة. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | يُستخدم للإشارة إلى ما إذا كان يمكن منع إجراء افتراضي لحدث أم لا. إذا كان من الممكن منع الإجراء الافتراضي ، كانت القيمة صحيحة ، وإلا تكون القيمة خاطئة. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | يُستخدم للإشارة إلى ملف[`IEventTarget`](../ieventtarget/) لمن[`IEventListener`](../ieventlistener/) يتم حاليًا معالجة الصورة . هذا مفيد بشكل خاص أثناء الالتقاط والفقاعات. |
| [Data](../../aspose.svg.dom.events/inputevent/data/) { get; } | تحتفظ البيانات بقيمة الأحرف التي تم إنشاؤها بواسطة أسلوب الإدخال. قد يكون هذا حرف Unicode واحدًا أو سلسلة غير فارغة من أحرف Unicode [Unicode]. يجب تطبيع الأحرف على النحو المحدد في نموذج تسوية Unicode NFC ، المحدد في [UAX15]. قد تحتوي هذه السمة على سلسلة فارغة. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | إرجاع صحيح إذا تم استدعاء PreventionDefault () بينما تكون قيمة السمة القابلة للإلغاء صحيحة ، والخطأ في الحالات الأخرى. |
| [Detail](../../aspose.svg.dom.events/uievent/detail/) { get; } | تحديد بعض المعلومات التفصيلية حول الحدث ، اعتمادًا على نوع الحدث. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | يُستخدم للإشارة إلى أي مرحلة من مراحل تدفق الأحداث يتم تقييمها حاليًا. |
| [IsComposing](../../aspose.svg.dom.events/inputevent/iscomposing/) { get; } | يكون صحيحًا إذا حدث حدث الإدخال كجزء من جلسة تكوين ، أي بعد حدث مقطوعة موسيقية وقبل حدث التكوين المقابل. يجب أن تكون القيمة غير المهيأة لهذه السمة خاطئة. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | يجب أن ترجع السمة isTrusted القيمة التي تمت تهيئتها إليها. عند إنشاء حدث ، يجب تهيئة السمة إلى false . |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | يُستخدم للإشارة إلى ملف[`IEventTarget`](../ieventtarget/) الذي تم إرسال الحدث إليه في الأصل. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | يُستخدم لتحديد الوقت (بالملي ثانية بالنسبة للعصر) الذي تم فيه إنشاء الحدث . نظرًا لأن بعض الأنظمة قد لا توفر هذه المعلومات ، فقد لا يكون الطابع الزمني متاحًا لجميع الأحداث. ، سيتم إرجاع القيمة 0. أمثلة على وقت الحقبة هي وقت بدء النظام أو 0: 0: 0 UTC 1 يناير 1970. |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | اسم الحدث (غير حساس لحالة الأحرف). يجب أن يكون الاسم اسم XML . |
| [View](../../aspose.svg.dom.events/uievent/view/) { get; } | تحدد سمة العرض النافذة التي تم إنشاء الحدث منها. يجب أن تكون القيمة غير المهيأة لهذه السمة خالية. |

## طُرق

| اسم | وصف |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | ملف[`InitEvent`](../event/initevent/) يتم استخدام طريقة لتهيئة قيمة[`Event`](../event/) تم إنشاؤه من خلال [`IDocumentEvent`](../idocumentevent/) الواجهة . |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | إذا كان الحدث قابلاً للإلغاء ، فإن ملف[`PreventDefault`](../event/preventdefault/) يتم استخدام الطريقة للدلالة على أن الحدث سيتم إلغاؤه ، مما يعني أن أي إجراء افتراضي يتم اتخاذه عادةً بواسطة التنفيذ نتيجة للحدث لن يحدث. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | استدعاء هذه الطريقة يمنع الحدث من الوصول إلى أي مستمعين للأحداث مسجل بعد الحدث الحالي وعندما يتم إرساله في شجرة يمنع أيضًا الحدث من الوصول إلى أي كائنات أخرى. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | ملف[`StopPropagation`](../event/stoppropagation/) الطريقة المستخدمة لمنع المزيد من الانتشار لحدث ما أثناء تدفق الحدث. |

### أنظر أيضا

* class [UIEvent](../uievent/)
* مساحة الاسم [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* المجسم [Aspose.SVG](../../)


