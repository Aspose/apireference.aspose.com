---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() Methode"
linktitle: "operator()"
second_title: "Aspose.Font für C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() Methode. Ruft alle derzeit in der Delegatensammlung vorhandenen Delegaten auf. Delegaten werden in derselben Reihenfolge aufgerufen, in der sie zur Sammlung hinzugefügt wurden. Der Operator blockiert, während die Delegaten in C++ ausgeführt werden."
type: docs
weight: 1500
url: /de/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


Ruft alle derzeit in der Delegaten‑Sammlung vorhandenen Delegaten auf. Delegaten werden in derselben Reihenfolge aufgerufen, in der sie zur Sammlung hinzugefügt wurden. Der Operator blockiert, solange die Delegaten ausgeführt werden.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| args | ArgumentTypes... | Argumente, die an die aufzurufenden Delegaten übergeben werden sollen |

### ReturnValue

Rückgabewert des zuletzt aufgerufenen Delegaten

## Siehe auch

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
