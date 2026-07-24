---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "Aspose.Page pour C++"
description: "System::EventHandler typedef. Représente une méthode qui réagit à et traite un événement. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 11400
url: /fr/cpp/system/eventhandler/
---
## EventHandler typedef


Représente une méthode qui réagit à et traite un événement. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## Voir aussi

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
