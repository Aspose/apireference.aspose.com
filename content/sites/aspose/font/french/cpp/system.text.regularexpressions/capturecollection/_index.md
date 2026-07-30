---
title: "System::Text::RegularExpressions::CaptureCollection classe"
linktitle: "CaptureCollection"
second_title: "Aspose.Font pour C++"
description: "Classe System::Text::RegularExpressions::CaptureCollection. Liste des captures effectuées par un groupe de capture unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Liste des captures effectuées par un groupe de capture unique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Désactive la modification de la collection. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Méthode de service pour ajouter une capture à la collection. |
| [Clear](./clear/)() override | Désactive le nettoyage de la collection. |
| [get_Count](./get_count/)() const override | Obtient le nombre de captures. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Marque la collection comme en lecture seule. |
| [get_IsSynchronized](./get_issynchronized/)() const | Marque la collection comme non synchronisée. |
| [idx_get](./idx_get/)(int) const override | Accesseur [Capture](../capture/). |
| [operator[]](./operator[]/)(int) | Accesseur [Capture](../capture/). |
| [operator[]](./operator[]/)(int) const | Accesseur [Capture](../capture/). |
| [Remove](./remove/)(const CapturePtr\&) override | Désactive la modification de la collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Base](./base/) | Type [Base](./base/). |
## Voir aussi

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
