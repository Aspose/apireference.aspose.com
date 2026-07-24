---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "Aspose.Page لـ C++"
description: "System::EventHandler typedef. يمثل طريقة تتفاعل مع حدث وتعالجه. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً صنف System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 11400
url: /ar/cpp/system/eventhandler/
---
## EventHandler typedef


يمثل طريقة تتفاعل مع حدث وتعالجه. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً صنف [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
