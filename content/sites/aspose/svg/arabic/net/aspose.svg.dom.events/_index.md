---
title: Aspose.Svg.Dom.Events
second_title: Aspose.SVG لمرجع .NET API
description: ملف الأحداث توفر مساحة الاسم كائنات لـ أي أحداث متعلقة بتحديث DOM. يتضمن الاشتراك في مراقبة معلومات سياقية محددة المرتبطة بالحدث بالإضافة إلى إنشاء الأحداث المخصصة.
type: docs
weight: 80
url: /ar/net/aspose.svg.dom.events/
---
ملف **الأحداث** توفر مساحة الاسم كائنات لـ أي أحداث متعلقة بتحديث DOM. يتضمن الاشتراك في مراقبة معلومات سياقية محددة المرتبطة بالحدث بالإضافة إلى إنشاء الأحداث المخصصة.

## الطبقات

| فصل | وصف |
| --- | --- |
| [CustomEvent](./customevent/) | يمكن استخدام الأحداث التي تستخدم واجهة CustomEvent لنقل البيانات المخصصة. |
| [DocumentLoadErrorEvent](./documentloaderrorevent/) | ملف[`DocumentLoadErrorEvent`](../aspose.svg.dom.events/documentloaderrorevent/) يحدث عندما لا يتوفر المورد المطلوب. |
| [DOMEventHandler](./domeventhandler/) | يمثل رد الاتصال لمعالجة الحدث. |
| [ErrorEvent](./errorevent/) | ملف[`ErrorEvent`](../aspose.svg.dom.events/errorevent/) يوفر معلومات سياقية حول الأخطاء التي حدثت أثناء وقت التشغيل. |
| [Event](./event/) | ملف[`Event`](../aspose.svg.dom.events/event/) يستخدم لتوفير معلومات سياقية حول حدث للمعالج الذي يقوم بمعالجة الحدث. |
| [FocusEvent](./focusevent/) | توفر واجهة FocusEvent معلومات سياقية محددة مرتبطة بأحداث التركيز. |
| [InputEvent](./inputevent/) | يتم إرسال أحداث الإدخال كإخطارات عندما يتم تحديث DOM. |
| [KeyboardEvent](./keyboardevent/) | توفر واجهة KeyboardEvent معلومات سياقية محددة مرتبطة بأجهزة لوحة المفاتيح. يشير كل حدث لوحة مفاتيح إلى مفتاح يستخدم قيمة. يتم توجيه أحداث لوحة المفاتيح بشكل عام إلى العنصر الذي يتم التركيز عليه. |
| [MouseEvent](./mouseevent/) | توفر واجهة MouseEvent معلومات سياقية محددة مرتبطة بأحداث الماوس. |
| [UIEvent](./uievent/) | توفر واجهة UIEvent معلومات سياقية محددة مرتبطة بأحداث واجهة المستخدم. |
| [WheelEvent](./wheelevent/) | توفر واجهة WheelEvent معلومات سياقية محددة مرتبطة بأحداث العجلة. لإنشاء مثيل لواجهة WheelEvent ، استخدم مُنشئ WheelEvent ، وتمرير قاموس WheelEventInit الاختياري. |
## واجهات

| واجهه المستخدم | وصف |
| --- | --- |
| [IDocumentEvent](./idocumentevent/) | ملف[`IDocumentEvent`](../aspose.svg.dom.events/idocumentevent/) توفر الواجهة آلية يمكن للمستخدم من خلالها إنشاء ملف[`Event`](../aspose.svg.dom.events/event/) من النوع الذي يدعمه التنفيذ . |
| [IEventListener](./ieventlistener/) | ملف[`IEventListener`](../aspose.svg.dom.events/ieventlistener/)الواجهة هي الطريقة الأساسية لمعالجة الأحداث. يقوم المستخدمون بتنفيذ[`IEventListener`](../aspose.svg.dom.events/ieventlistener/) واجهة وتسجيل المستمع الخاص بهم على ملف[`EventTarget`](../aspose.svg.dom/eventtarget/) باستخدام[`AddEventListener`](../aspose.svg.dom/eventtarget/addeventlistener/) method. يجب على المستخدمين أيضًا إزالة ملفات[`IEventListener`](../aspose.svg.dom.events/ieventlistener/) منها[`EventTarget`](../aspose.svg.dom/eventtarget/) بعد الانتهاء من استخدام المستمع. |
| [IEventTarget](./ieventtarget/) | ملف[`EventTarget`](../aspose.svg.dom/eventtarget/) يتم تنفيذ الواجهة بواسطة جميع العقد في تطبيق يدعم نموذج حدث DOM . لذلك ، يمكن الحصول على هذه الواجهة باستخدام طرق الصب الخاصة بالربط على مثيل لواجهة Node. تسمح الواجهة بتسجيل وإزالة مستمعي الأحداث على ا[`EventTarget`](../aspose.svg.dom/eventtarget/) وإرسال الأحداث إلى ذلك[`IEventTarget`](../aspose.svg.dom.events/ieventtarget/) . |


