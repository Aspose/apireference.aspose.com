---
title: "System::Windows::Forms::Control::ControlCollection class"
linktitle: "ControlCollection"
second_title: "Aspose.Page voor C++"
description: "System::Windows::Forms::Control::ControlCollection class. Collectie van besturingselementen. Niet geïmplementeerd in C++."
type: docs
weight: 200
url: /nl/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Collectie van besturingselementen. Niet geïmplementeerd.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Voegt besturingselement toe aan collectie. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Voegt meerdere besturingselementen toe aan collectie. |
| [Clear](./clear/)() override | Verwijdert alle besturingselementen uit de collectie. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Controleert of een specifieke controle aanwezig is in de collectie. |
| virtual [ContainsKey](./containskey/)(System::String) const | Controleert of een controle met een specifieke naam aanwezig is in de collectie. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Constructor. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Kopieert de inhoud van de collectie naar bestaande array‑elementen. |
| [Find](./find/)(const System::String\&, bool) const | Zoekt naar de benoemde controle in de collectie. Optioneel worden de collecties van ingesloten controles recursief gecontroleerd. |
| [get_Count](./get_count/)() const override | Haalt het aantal controles in de collectie op. |
| [get_Owner](./get_owner/)() const | Haalt de eigenaar‑controle van de collectie op. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Zoekt naar een specifieke controle. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Zoekt naar een specifieke controle. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door de collectie te itereren. |
| [idx_get](./idx_get/)(int) const override | Toegang via index. |
| virtual [idx_get](./idx_get/)(System::String) const | Toegang via naam. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Toegang via index. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Toegang via naam. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Zoekt naar een controle in de collectie. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Zoekt naar een benoemde controle in de collectie. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Voegt een controle toe aan de collectie. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Verwijdert een controle uit de collectie. |
| [RemoveAt](./removeat/)(int) override | Verwijdert een controle uit de collectie. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Verwijdert een controle uit de collectie. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Verplaatst een controle naar een nieuwe positie. |
## Zie ook

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
