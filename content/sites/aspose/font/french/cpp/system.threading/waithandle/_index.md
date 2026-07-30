---
title: "classe System::Threading::WaitHandle"
linktitle: "WaitHandle"
second_title: "Aspose.Font pour C++"
description: "classe System::Threading::WaitHandle. Primitive d'attente classe de base. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en argument en C++."
type: docs
weight: 1700
url: /fr/cpp/system.threading/waithandle/
---
## WaitHandle class


Primitive d'attente classe de base. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en argument.

```cpp
class WaitHandle : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Libère toute ressource associée au handle. |
| [get_Handle](./get_handle/)() | Obtient le handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Informations RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Attend que tous les handles se déclenchent. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Attend que tous les handles se déclenchent. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Attend que l'un des handles se déclenche. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Attend que l'un des handles se déclenche. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Attend que l'un des handles se déclenche. |
| virtual [WaitOne](./waitone/)() | Attend que le handle se déclenche pendant une période illimitée. |
| virtual [WaitOne](./waitone/)(int) | Attend que le handle se déclenche. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Attend que le handle se déclenche. |
| virtual [WaitOne](./waitone/)(int, bool) | Attend que le handle se déclenche. |
| virtual [~WaitHandle](./~waithandle/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
