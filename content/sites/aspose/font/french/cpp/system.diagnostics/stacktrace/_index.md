---
title: "classe System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Font pour C++"
description: "classe System::Diagnostics::StackTrace. Collection de cadres de pile. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours envelopper cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Collection de cadres de pile. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours envelopper cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StackTrace : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Obtient le nombre de cadres dans la trace de pile. |
| virtual [GetFrame](./getframe/)(uint32_t) | Obtient le cadre de pile. |
| [operator=](./operator=/)(const StackTrace\&) const | Aucune assignation. |
| [StackTrace](./stacktrace/)() | Crée une trace de pile décrivant l'état actuel de la pile. |
| [StackTrace](./stacktrace/)(bool) | Crée une trace de pile décrivant l'état actuel de la pile. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Pas de copie. |
| virtual [~StackTrace](./~stacktrace/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
