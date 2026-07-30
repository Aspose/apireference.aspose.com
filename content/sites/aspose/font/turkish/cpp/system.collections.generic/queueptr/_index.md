---
title: "System::Collections::Generic::QueuePtr sınıfı"
linktitle: "QueuePtr"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::QueuePtr sınıfı. Kuyruk işaretçisi. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. Yığına (stack) ayrılmalı ve C++'ta fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 3700
url: /tr/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<T0>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [QueuePtr](./queueptr/)() | Null işaretçi oluşturur. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | Belirli bir kuyruğa işaretçi oluşturur. |

## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
