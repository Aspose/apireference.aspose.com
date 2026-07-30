---
title: "طريقة System::Threading::Tasks::Parallel::ForEach"
linktitle: "ForEach"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::Parallel::ForEach. تنفّذ عملية foreach على IEnumerable حيث يمكن أن تُجرى التكرارات بالتوازي في C++."
type: docs
weight: 100
url: /ar/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


ينفّذ عملية foreach على IEnumerable حيث يمكن أن تُجرى التكرارات بشكل متوازي.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| معامل | الوصف |
| --- | --- |
| TSource | نوع البيانات في المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| المصدر | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | مصدر بيانات قابل للتعداد. |
| body | const Action\<TSource\>\& | المندوب (delegate) الذي يُستدعى مرة واحدة لكل تكرار. |

### ReturnValue

هيكل [ParallelLoopResult](../../parallelloopresult/) يحتوي على معلومات حول أي جزء من الحلقة تم إكماله.
## ملاحظات



يستخدم [ParallelOptions](../../paralleloptions/) الافتراضي مع توازي غير محدود ولا إلغاء.
## انظر أيضًا

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


ينفّذ عملية foreach على IEnumerable حيث يمكن أن تُجرى التكرارات بشكل متوازي.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| معامل | الوصف |
| --- | --- |
| TSource | نوع البيانات في المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| المصدر | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | مصدر بيانات قابل للتعداد. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | كائن يكوّن سلوك هذه العملية. |
| body | const Action\<TSource\>\& | المندوب (delegate) الذي يُستدعى مرة واحدة لكل تكرار. |

### ReturnValue

هيكل [ParallelLoopResult](../../parallelloopresult/) يحتوي على معلومات حول أي جزء من الحلقة تم إكماله.
## ملاحظات



تقسّم هذه الطريقة المصدر القابل للتعداد وتنفّذ المندوب (delegate) body على عدة خيوط في وقت واحد.
## انظر أيضًا

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
