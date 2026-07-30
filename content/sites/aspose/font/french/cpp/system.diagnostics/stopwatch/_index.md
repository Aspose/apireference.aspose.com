---
title: "System::Diagnostics::Stopwatch class"
linktitle: "Stopwatch"
second_title: "Aspose.Font pour C++"
description: "Classe System::Diagnostics::Stopwatch. Permet la mesure du temps. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Permet la mesure du temps. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Stopwatch : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Obtient le temps total écoulé mesuré par l'instance actuelle. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Obtient le temps total écoulé mesuré par l'instance actuelle, en millisecondes. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Obtient le temps total écoulé mesuré par l'instance actuelle, en ticks du minuteur. |
| [get_IsRunning](./get_isrunning/)() const | Vérifie si le chronomètre est en cours d'exécution. |
| [Reset](./reset/)() | Arrête la mesure du temps, met l'intervalle mesuré à zéro. |
| [Restart](./restart/)() | Met l'intervalle mesuré à zéro, puis démarre la mesure du temps. |
| [Start](./start/)() | Démarre la mesure du temps. |
| static [StartNew](./startnew/)() | Crée un nouvel objet [Stopwatch](./) et démarre la mesure. |
| [Stop](./stop/)() | Arrête la mesure du temps. |
| [Stopwatch](./stopwatch/)() | Informations RTTI. |
| virtual [~Stopwatch](./~stopwatch/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
