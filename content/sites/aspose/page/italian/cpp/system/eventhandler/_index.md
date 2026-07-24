---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "Aspose.Page per C++"
description: "System::EventHandler typedef. Rappresenta un metodo che reagisce a e elabora un evento. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 11400
url: /it/cpp/system/eventhandler/
---
## EventHandler typedef


Rappresenta un metodo che reagisce a e elabora un evento. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
