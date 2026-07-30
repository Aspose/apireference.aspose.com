---
title: "System::Collections::ObjectModel::ReadOnlyCollection Klasse"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection Klasse. Kapselt einen bestimmten Container, um im Nur‑Lese‑Modus auf ihn zuzugreifen. Objekte dieser Klasse sollten nur mit der System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Kapselt einen bestimmten Container, um im Nur‑Lese‑Modus auf ihn zuzugreifen. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Prüft, ob der Container ein bestimmtes Element enthält. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Kopiert Container‑Elemente in vorhandene Array‑Elemente. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Container‑Elemente zurück. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Überprüft, ob die Sammlung schreibgeschützt ist. |
| [GetEnumerator](./getenumerator/)() override | Ruft den Enumerator der Sammlung ab. |
| [idx_get](./idx_get/)(int) const override | Ruft das Element an einer bestimmten Position ab. |
| [IndexOf](./indexof/)(const T\&) const override | Sucht nach einem bestimmten Element in der Sammlung. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Umwickelt eine schreibgeschützte Sammlung um eine bestimmte Sammlung. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Tut nichts, da die schreibgeschützte Sammlung nur Daten umschließt und nichts speichert. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementierte Schnittstelle. |
| [IEnumeratorPtr](./ienumeratorptr/) | Container gleicher Elemente. |
| [ValueType](./valuetype/) | Werttyp. |

## Siehe auch

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
