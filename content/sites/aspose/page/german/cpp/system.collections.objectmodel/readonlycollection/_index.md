---
title: "System::Collections::ObjectModel::ReadOnlyCollection Klasse"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page für C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection Klasse. Wickelt einen bestimmten Container, um im Nur‑Lese‑Modus auf ihn zuzugreifen. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Wickelt einen bestimmten Container, um im Nur‑Lese‑Modus auf ihn zuzugreifen. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
| [get_IsReadOnly](./get_isreadonly/)() const override | Prüft, ob die Sammlung schreibgeschützt ist. |
| [GetEnumerator](./getenumerator/)() override | Gibt den Aufzählungs‑Enumerator der Sammlung zurück. |
| [idx_get](./idx_get/)(int) const override | Gibt das Element an einer bestimmten Position zurück. |
| [IndexOf](./indexof/)(const T\&) const override | Sucht nach einem bestimmten Element in der Sammlung. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Wickelt eine schreibgeschützte Sammlung um eine bestimmte Sammlung. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Tut nichts, da die schreibgeschützte Sammlung nur Daten einwickelt und nichts speichert. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementiertes Interface. |
| [IEnumeratorPtr](./ienumeratorptr/) | Container gleicher Elemente. |
| [ValueType](./valuetype/) | Werttyp. |

## Siehe auch

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
