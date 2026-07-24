---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page voor C++"
description: "System::Text::RegularExpressions::CaptureCollection klasse. Lijst van captures uitgevoerd door een enkele capturingsgroep. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Lijst van captures uitgevoerd door een enkele capturingsgroep. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Schakelt het aanpassen van de collectie uit. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Service‑methode om een capture toe te voegen aan de collectie. |
| [Clear](./clear/)() override | Schakelt het opschonen van de collectie uit. |
| [get_Count](./get_count/)() const override | Haalt het aantal captures op. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Markeert de collectie als alleen‑lezen. |
| [get_IsSynchronized](./get_issynchronized/)() const | Markeert de collectie als niet‑gesynchroniseerd. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) toegangsmethode. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) toegangsmethode. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) toegangsmethode. |
| [Remove](./remove/)(const CapturePtr\&) override | Schakelt het aanpassen van de collectie uit. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Base](./base/) | [Base](./base/) type. |
## Zie ook

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
