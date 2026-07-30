---
title: "System::Windows::Forms::Control::ControlCollection classe"
linktitle: "ControlCollection"
second_title: "Aspose.Font pour C++"
description: "System::Windows::Forms::Control::ControlCollection class. Collection de contrôles. Non implémenté en C++."
type: docs
weight: 200
url: /fr/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Collection de contrôles. Non implémenté.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Ajoute un contrôle à la collection. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Ajoute plusieurs contrôles à la collection. |
| [Clear](./clear/)() override | Supprime tous les contrôles de la collection. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Vérifie si un contrôle spécifique est présent dans la collection. |
| virtual [ContainsKey](./containskey/)(System::String) const | Vérifie si le contrôle avec un nom spécifique est présent dans la collection. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Constructeur. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Copie le contenu de la collection dans les éléments de tableau existants. |
| [Find](./find/)(const System::String\&, bool) const | Recherche le contrôle nommé dans la collection. Vérifie éventuellement les collections des contrôles contenus de manière récursive. |
| [get_Count](./get_count/)() const override | Obtient le nombre de contrôles dans la collection. |
| [get_Owner](./get_owner/)() const | Obtient le contrôle propriétaire de la collection. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Recherche un contrôle spécifique. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Recherche un contrôle spécifique. |
| [GetEnumerator](./getenumerator/)() override | Obtient l'énumérateur pour parcourir la collection. |
| [idx_get](./idx_get/)(int) const override | Accesseur par indice. |
| virtual [idx_get](./idx_get/)(System::String) const | Accesseur par nom. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Accesseur par indice. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Accesseur par nom. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Recherche un contrôle dans la collection. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Recherche le contrôle nommé dans la collection. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Insère le contrôle dans la collection. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Supprime le contrôle de la collection. |
| [RemoveAt](./removeat/)(int) override | Supprime le contrôle de la collection. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Supprime le contrôle de la collection. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Déplace le contrôle vers une nouvelle position. |
## Voir aussi

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Font for C++](../../../)
