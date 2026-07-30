---
title: "System::Net::Http::Headers::HttpHeaderValueCollection Klasse"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection Klasse. Stellt die Sammlung der Header‑Werte dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Stellt die Sammlung der Header‑Werte dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschreibung |
| --- | --- |
| Der | Typ der in der Sammlung dargestellten Header‑Werte. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const T\&) override | Fügt ein Element zur Sammlung hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente aus der Sammlung. |
| [Contains](./contains/)(const T\&) const override | Prüft, ob ein Element in der Sammlung vorhanden ist. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Kopiert alle Elemente der Sammlung in vorhandene Array‑Elemente. |
| [get_Count](./get_count/)() const override | RTTI-Informationen. |
| [get_IsReadOnly](./get_isreadonly/)() | Gibt einen Wert zurück, der angibt, ob die aktuelle Sammlung schreibgeschützt ist. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Gibt einen Wert zurück, der anzeigt, ob die aktuelle Sammlung einen "Spezialwert" enthält. |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Gibt eine Zeichenkettenrepräsentation der aktuellen Sammlung ohne einen "Spezialwert" zurück. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Erstellt eine neue Instanz. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Erstellt eine neue Instanz. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Erstellt eine neue Instanz. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Erstellt eine neue Instanz. |
| [ParseAdd](./parseadd/)(String) | Parst eine Header‑Zeichenkettenrepräsentation und fügt sie der aktuellen Sammlung hinzu. |
| [Remove](./remove/)(const T\&) override | Löscht ein Element aus der Sammlung. |
| [RemoveSpecialValue](./removespecialvalue/)() | Entfernt einen "Spezialwert". |
| [SetSpecialValue](./setspecialvalue/)() | Setzt einen "Spezialwert". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| [TryParseAdd](./tryparseadd/)(String) | Versucht, eine Header‑Zeichenkettenrepräsentation zu parsen und sie der aktuellen Sammlung hinzuzufügen. |

## Siehe auch

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
