---
title: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > Klasse"
linktitle: "String >"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection< System::String > Klasse. Die partielle Spezialisierung der HttpHeaderValueCollection‑Vorlage für den Typ String. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.net.http.headers/string_/
---
## String > class


Die partielle Spezialisierung der [HttpHeaderValueCollection](../httpheadervaluecollection/) Vorlage für den Typ [String](../../system/string/). Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class String > : public System::Collections::Generic::ICollection<System::String>,
                 public System::Collections::Generic::ICollection<System::String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&) override | Fügt ein Element zur Sammlung hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente aus der Sammlung. |
| [Contains](./contains/)(const String\&) const override | Prüft, ob ein Element in der Sammlung vorhanden ist. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override |  |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente in der Sammlung. |
| [get_IsReadOnly](./get_isreadonly/)() |  |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() |  |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String) |  |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, String, Action\<System::SharedPtr\<HttpHeaderValueCollection\<String\>\>, String\>) |  |
| [ParseAdd](./parseadd/)(String) |  |
| [Remove](./remove/)(const String\&) override | Löscht ein Element aus der Sammlung. |
| [RemoveSpecialValue](./removespecialvalue/)() |  |
| [SetSpecialValue](./setspecialvalue/)() |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| [TryParseAdd](./tryparseadd/)(String) |  |
## Siehe auch

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
