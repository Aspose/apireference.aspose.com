---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode μέθοδος"
linktitle: "ΑνάκτησηΚώδικαΚατακερματισμού"
second_title: "Aspose.Page για C++"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode μέθοδος. Λαμβάνει τον κωδικό κατακερματισμού για οποιονδήποτε τύπο. Καλεί Object::GetHashCode() για να το κάνει σε C++."
type: docs
weight: 100
url: /el/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


Λαμβάνει τον κωδικό κατακερματισμού για οποιονδήποτε τύπο. Καλεί [Object::GetHashCode()](../../../system/object/gethashcode/) για να το κάνει.

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος για τον οποίο λαμβάνεται ο κωδικός κατακερματισμού. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | [Object](../../../system/object/) για λήψη πληροφοριών από. |

### ReturnValue

Τιμή κωδικού κατακερματισμού όπως υπολογίζεται από την υλοποίηση στόχου.

## Δείτε επίσης

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
