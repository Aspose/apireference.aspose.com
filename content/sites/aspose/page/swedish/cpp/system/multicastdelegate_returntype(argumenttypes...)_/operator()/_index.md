---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() metod"
linktitle: "operator()"
second_title: "Aspose.Page för C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() metod. Anropar alla delegater som för närvarande finns i delegatsamlingen. Delegater anropas i samma ordning som de lades till i samlingen. Operatören blockerar medan delegaterna körs i C++."
type: docs
weight: 1400
url: /sv/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


Invokerar alla delegater som för närvarande finns i delegatkollektionen. Delegaterna anropas i samma ordning som de lades till i kollektionen. Operatören blockerar medan delegaterna körs.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| args | ArgumentTypes... | Argument att skicka till delegaterna som ska anropas |

### ReturnValue

Returvärde från den senast anropade delegaten

## Se även

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
