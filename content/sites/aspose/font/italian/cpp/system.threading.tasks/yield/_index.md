---
title: "Metodo System::Threading::Tasks::Yield"
linktitle: "Yield"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::Yield. Crea un task attendibile che restituisce in modo asincrono il controllo al contesto corrente quando viene atteso in C++."
type: docs
weight: 3200
url: /it/cpp/system.threading.tasks/yield/
---
## System::Threading::Tasks::Yield method


Crea un task attendibile che restituisce in modo asincrono il controllo al contesto corrente quando viene atteso.

```cpp
Runtime::CompilerServices::YieldAwaitable System::Threading::Tasks::Yield()
```


### ReturnValue

Un YieldAwaitable che può essere atteso per cedere il controllo.
## Osservazioni



Questo metodo è utile per forzare un metodo asincrono a cedere il controllo, consentendo l'elaborazione di altri lavori in sospeso prima di continuare.
## Vedi anche

* Class [YieldAwaitable](../../system.runtime.compilerservices/yieldawaitable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
