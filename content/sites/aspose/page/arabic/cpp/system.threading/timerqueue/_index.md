---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page لـ C++"
description: "System::Threading::TimerQueue class. طابور يتعامل مع كائنات المؤقت. هذه مجرد تنفيذة. تقوم كائنات المؤقت بالتسجيل هناك ذاتيًا، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم واجهة برمجة تطبيقات فئة Timer بدلاً من ذلك. هذا نوع مفرد مع إدارة الذاكرة تتم عبر دوال الوصول. لا ينبغي لك أبدًا إنشاء مثيلات منه مباشرةً في C++."
type: docs
weight: 1600
url: /ar/cpp/system.threading/timerqueue/
---
## TimerQueue class


قائمة الانتظار التي تتعامل مع كائنات [Timer](../timer/). هذه مجرد تنفيذ. تقوم كائنات [Timer](../timer/) بالتسجيل هناك بنفسها، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم واجهة برمجة تطبيقات فئة [Timer](../timer/) بدلاً من ذلك. هذا نوع مفرد مع إدارة الذاكرة تتم عبر دالة (دوال) الوصول. يجب ألا تقوم بإنشاء مثيلات منه مباشرةً.

```cpp
class TimerQueue
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(Timer *) | يسجل المؤقت في قائمة الانتظار. |
| [Delete](./delete/)(Timer *) | يحذف المؤقت من قائمة الانتظار. |
| static [GetInstance](./getinstance/)() | مفرد التنفيذ. |
| static [JoinWorkerThread](./joinworkerthread/)() | ينضم إلى خيط العامل. ينتظر إلى ما لا نهاية إذا لزم الأمر. |
| [operator=](./operator=/)(const TimerQueue\&) | لا نسخ. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | لا نسخ. |
## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
