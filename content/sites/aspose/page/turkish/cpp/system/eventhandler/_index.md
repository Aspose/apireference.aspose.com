---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "Aspose.Page için C++"
description: "System::EventHandler typedef. Bir olaya tepki veren ve işleyen bir yöntemi temsil eder. Bu tür yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. C++'ta bu tür nesneleri yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 11400
url: /tr/cpp/system/eventhandler/
---
## EventHandler typedef


Bir olaya tepki veren ve işleyen bir yöntemi temsil eder. Bu tür yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tür nesneleri yönetmek için asla [System::SmartPtr](../smartptr/) sınıfını kullanmayın.

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
