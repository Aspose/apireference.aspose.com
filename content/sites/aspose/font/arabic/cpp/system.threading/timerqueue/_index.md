---
title: "System::Threading::TimerQueue فئة"
linktitle: "TimerQueue"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::TimerQueue فئة. طابور يتعامل مع كائنات Timer. هذا مجرد تنفيذ. تقوم كائنات Timer بالتسجيل هناك بنفسها، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم واجهة برمجة تطبيقات فئة Timer بدلاً من ذلك. هذا نوع مفرد مع إدارة الذاكرة تتم عبر دالة (دوال) الوصول. يجب ألا تقوم بإنشاء أي مثيلات له مباشرةً في C++."
type: docs
weight: 1600
url: /ar/cpp/system.threading/timerqueue/
---
## TimerQueue class


طابور يتعامل مع كائنات [Timer](../timer/). هذا مجرد تنفيذ. تقوم كائنات [Timer](../timer/) بالتسجيل هناك بنفسها، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم واجهة برمجة تطبيقات فئة [Timer](../timer/) بدلاً من ذلك. هذا نوع مفرد مع إدارة الذاكرة تتم عبر دالة (دوال) الوصول. يجب ألا تقوم بإنشاء أي مثيلات له مباشرةً.

```cpp
class TimerQueue
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(Timer *) | يسجل المؤقت في الطابور. |
| [Delete](./delete/)(Timer *) | يحذف المؤقت من الطابور. |
| static [GetInstance](./getinstance/)() | تنفيذ مفرد. |
| static [JoinWorkerThread](./joinworkerthread/)() | ينضم إلى خيط العامل. ينتظر إلى ما لا نهاية إذا لزم الأمر. |
| [operator=](./operator=/)(const TimerQueue\&) | لا نسخ. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | لا نسخ. |
## انظر أيضًا

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
