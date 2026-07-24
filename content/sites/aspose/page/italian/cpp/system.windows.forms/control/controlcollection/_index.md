---
title: "System::Windows::Forms::Control::ControlCollection classe"
linktitle: "ControlCollection"
second_title: "Aspose.Page per C++"
description: "System::Windows::Forms::Control::ControlCollection classe. Collezione di controlli. Non implementato in C++."
type: docs
weight: 200
url: /it/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Collezione di controlli. Non implementato.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Aggiunge il controllo alla collezione. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Aggiunge diversi controlli alla collezione. |
| [Clear](./clear/)() override | Elimina tutti i controlli dalla collezione. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Verifica se un controllo specifico è presente nella collezione. |
| virtual [ContainsKey](./containskey/)(System::String) const | Verifica se un controllo con nome specifico è presente nella collezione. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Costruttore. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Copia il contenuto della collezione negli elementi di un array esistente. |
| [Find](./find/)(const System::String\&, bool) const | Cerca il controllo nominato nella collezione. Facoltativamente verifica ricorsivamente le collezioni dei controlli contenuti. |
| [get_Count](./get_count/)() const override | Ottiene il numero di controlli nella collezione. |
| [get_Owner](./get_owner/)() const | Ottiene il controllo proprietario della collezione. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Cerca un controllo specifico. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Cerca un controllo specifico. |
| [GetEnumerator](./getenumerator/)() override | Ottiene l'enumeratore per iterare attraverso la collezione. |
| [idx_get](./idx_get/)(int) const override | Accessor per indice. |
| virtual [idx_get](./idx_get/)(System::String) const | Accessor per nome. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Accessor per indice. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Accessor per nome. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Cerca il controllo nella raccolta. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Cerca il controllo con nome nella raccolta. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Inserisce il controllo nella raccolta. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Rimuove il controllo dalla raccolta. |
| [RemoveAt](./removeat/)(int) override | Rimuove il controllo dalla raccolta. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Rimuove il controllo dalla raccolta. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Sposta il controllo in una nuova posizione. |
## Vedi anche

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
