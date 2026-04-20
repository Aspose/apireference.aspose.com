---
title: "طريقة System::Threading::SynchronizationContext::SetSynchronizationContext"
linktitle: "SetSynchronizationContext"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Threading::SynchronizationContext::SetSynchronizationContext. يحدد سياق المزامنة للخيط الحالي في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


يضبط سياق المزامنة للخلية الحالية.

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | سياق المزامنة لتعيينه للخط الحالي. |
## ملاحظات



تمرير nullptr سيؤدي إلى مسح سياق المزامنة للخط الحالي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
