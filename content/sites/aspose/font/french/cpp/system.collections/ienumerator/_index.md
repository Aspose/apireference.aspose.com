---
title: "System::Collections::IEnumerator classe"
linktitle: "IEnumerator"
second_title: "Aspose.Font pour C++"
description: "classe System::Collections::IEnumerator. Interface de l'énumérateur qui peut être utilisée pour parcourir certains éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.collections/ienumerator/
---
## IEnumerator class


Interface de l'énumérateur qui peut être utilisée pour parcourir certains éléments. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Current](./current/)() const | Obtient l'élément actuel. |
| virtual [get_Current](./get_current/)() const | Obtient l'élément actuel. |
| virtual [MoveNext](./movenext/)() | Déplace l'énumérateur vers l'élément suivant. Si aucun élément n'a été référencé auparavant, définit la référence sur le premier élément disponible. Si la fin du conteneur est atteinte, ne fait rien. |
| virtual [Reset](./reset/)() | Réinitialise l'énumérateur à la position précédant le premier élément. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ValueType](./valuetype/) | Informations RTTI. |

## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
