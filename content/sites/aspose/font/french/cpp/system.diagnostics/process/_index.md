---
title: "Classe System::Diagnostics::Process"
linktitle: "Processus"
second_title: "Aspose.Font pour C++"
description: "Classe System::Diagnostics::Process. Encapsule les informations et la manipulation du processus. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.diagnostics/process/
---
## Process class


Encapsule les informations et la manipulation du processus. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Process : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Obtient si l'événement Exited doit être déclenché lorsque le processus se termine. |
| [get_ExitCode](./get_exitcode/)() const | Obtient le code de sortie du processus. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Obtient la taille de l'ensemble de mémoire privée du processus. |
| [get_ProcessName](./get_processname/)() const | Obtient le nom du processus. |
| [get_StandardError](./get_standarderror/)() const | Fournit un lecteur pour lire la sortie d'erreur du processus. Non implémenté. |
| [get_StandardOutput](./get_standardoutput/)() const | Fournit un lecteur pour lire la sortie standard du processus. Non implémenté. |
| [get_StartInfo](./get_startinfo/)() const | Obtient les informations de démarrage du processus. |
| [get_WorkingSet64](./get_workingset64/)() const | Obtient la taille du jeu de travail mémoire du processus. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Obtient des informations sur le processus actuel. [Windows](../../system.windows/) uniquement. |
| [GetOutputText](./getoutputtext/)() const | Obtient le texte de sortie du processus. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Définit si l'événement Exited doit être déclenché lorsque le processus se termine. |
| [Start](./start/)() | Démarre le processus avec des paramètres prédéfinis. |
| static [Start](./start/)(const String\&, const String\&) | Démarre le processus avec le chemin et les arguments spécifiés. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Démarre le processus avec le chemin et les arguments spécifiés. |
| [WaitForExit](./waitforexit/)(int) | Attend que le processus se termine. Non implémenté. |
| [WaitForExit](./waitforexit/)() | Attend que le processus se termine, ne retourne pas tant que ce n'est pas fini. |
| virtual [~Process](./~process/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
