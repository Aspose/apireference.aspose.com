---
title: "System::ComponentModel::Component classe"
linktitle: "Component"
second_title: "Aspose.Page pour C++"
description: "System::ComponentModel::Component classe. Classe factice pour rendre le code traduit utilisant la classe Component compilable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.componentmodel/component/
---
## Component class


Classe factice pour rendre le code traduit utilisant la classe [Component](./) compilable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Component](./component/)() | Informations RTTI. |
| [Dispose](./dispose/)(bool) | Prise en charge du modèle Disposable ; ne fait rien. |
| [get_DesignMode](./get_designmode/)() | Vérifie si le composant est en mode conception. |
## Voir aussi

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
