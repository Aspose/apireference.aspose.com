---
title: "Classe System::Diagnostics::StackFrame"
linktitle: "StackFrame"
second_title: "Aspose.Font pour C++"
description: "Classe System::Diagnostics::StackFrame. Obtient des informations sur une seule trame de pile. MSVS uniquement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Obtient des informations sur une seule trame de pile. MSVS uniquement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class StackFrame : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Obtient le numéro colnum. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Obtient le numéro de ligne. |
| virtual [GetFileName](./getfilename/)() | Obtient le nom du fichier. |
| [GetMethod](./getmethod/)() | Obtient les informations de la méthode. |
| [operator=](./operator=/)(const StackFrame\&) const | Pas de modification. |
| [StackFrame](./stackframe/)(int) | Crée une trame de pile à l'offset de pile actuel. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Pas de copie. |
| virtual [~StackFrame](./~stackframe/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
