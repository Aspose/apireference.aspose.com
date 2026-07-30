---
title: "Classe System::Diagnostics::ProcessStartInfo"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Diagnostics::ProcessStartInfo. Décrit les paramètres de démarrage du processus. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


Décrit les paramètres de démarrage du processus. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class ProcessStartInfo : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | Obtient les arguments du processus. |
| [get_CreateNoWindow](./get_createnowindow/)() const | Obtient la propriété NoWindow. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | Obtient les variables d'environnement du processus. |
| [get_FileName](./get_filename/)() const | Obtient le nom de fichier du processus. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | Obtient la propriété RedirectStandardError. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | Obtient la propriété RedirectStandardInput. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | Obtient la propriété RedirectStandardOutput. |
| [get_UseShellExecute](./get_useshellexecute/)() const | Obtient la propriété UseShellExecute. |
| [get_WindowStyle](./get_windowstyle/)() const | Obtient le style de fenêtre. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | Obtient le répertoire de travail du processus. |
| [ProcessStartInfo](./processstartinfo/)() | Crée un objet start info vide. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Crée un objet start info. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Crée un objet start info. |
| [set_Arguments](./set_arguments/)(const String\&) | Définit les arguments du processus. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | Définit la propriété NoWindow. |
| [set_FileName](./set_filename/)(const String\&) | Définit le nom de fichier du processus. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | Définit la propriété RedirectStandardError. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | Définit la propriété RedirectStandardInput. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | Définit la propriété RedirectStandardOutput. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | Définit la propriété UseShellExecute. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Définit le style de fenêtre. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | Définit le répertoire de travail du processus. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
