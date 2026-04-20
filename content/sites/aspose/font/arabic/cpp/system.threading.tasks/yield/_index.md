---
title: "طريقة System::Threading::Tasks::Yield"
linktitle: "Yield"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::Tasks::Yield. تنشئ مهمة قابلة للانتظار تُعيد التحكم إلى السياق الحالي بشكل غير متزامن عند الانتظار في C++."
type: docs
weight: 3200
url: /ar/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


ينشئ مهمة قابلة للانتظار تُعيد التحكم إلى السياق الحالي بشكل غير متزامن عند الانتظار.

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

كائن YieldAwaitable يمكن الانتظار عليه لإعادة التحكم.
## ملاحظات



هذه الطريقة مفيدة لإجبار طريقة غير متزامنة على إعادة التحكم، مما يسمح بمعالجة الأعمال المعلقة الأخرى قبل المتابعة.
## انظر أيضًا

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
