---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Font pour C++"
description: "Classe System::Diagnostics::TraceListener. Interface pour réagir aux informations de débogage et de trace. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Interface pour réagir aux informations de débogage et de trace. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class TraceListener : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Écrit le message d'échec dans le débogueur. |
| virtual [Fail](./fail/)(System::String, System::String) | Écrit le message d'échec dans le débogueur. |
| virtual [Write](./write/)(System::String) | Informations RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | Écrit une ligne dans le débogueur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
