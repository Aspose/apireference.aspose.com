---
title: "System::Timers::Timer classe"
linktitle: "Timer"
second_title: "Aspose.Page pour C++"
description: "System::Timers::Timer classe. Minuterie qui appelle le délégué dans une boucle en C++."
type: docs
weight: 200
url: /fr/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() | Arrête la minuterie, libère les ressources allouées. |
| [Dispose](./dispose/)() | Arrête la minuterie, libère les ressources allouées. |
| [get_AutoReset](./get_autoreset/)() const | Vérifie si la minuterie est en mode réinitialisation automatique. |
| [get_Enabled](./get_enabled/)() const | Vérifie si la minuterie est active. |
| [get_Interval](./get_interval/)() const | Obtient l'intervalle de la minuterie. |
| [get_IsStopped](./get_isstopped/)() const | Vérifie si la minuterie est arrêtée. |
| [set_AutoReset](./set_autoreset/)(bool) | Définit le minuteur en mode réinitialisation automatique ou le désactive. |
| [set_Enabled](./set_enabled/)(bool) | Démarre ou arrête le minuteur. Démarrer le minuteur ne redémarre pas le comptage du temps si le minuteur est déjà en cours d'exécution. |
| [set_Interval](./set_interval/)(double) | Définit l'intervalle du minuteur. |
| [Start](./start/)() | Démarre le minuteur. Ne redémarre pas le comptage du temps si le minuteur est déjà en cours d'exécution. |
| [Stop](./stop/)() | Arrête le minuteur. |
| [Timer](./timer/)() | Informations RTTI. |
| [Timer](./timer/)(double) | Construit un minuteur arrêté avec l'intervalle spécifié. |
## Voir aussi

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Page for C++](../../)
