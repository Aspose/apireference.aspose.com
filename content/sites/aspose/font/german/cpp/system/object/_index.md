---
title: "System::Object-Klasse"
linktitle: "Object"
second_title: "Aspose.Font für C++"
description: "System::Object-Klasse. Basisklasse, die die Verwendung von Methoden ermöglicht, die für die System.Object‑Klasse in C# verfügbar sind. Alle nicht‑trivialen Klassen, die in der übersetzten Umgebung verwendet werden, sollten sie in C++ erben."
type: docs
weight: 4800
url: /de/cpp/system/object/
---
## Object class


Basisklasse, die die Verwendung von Methoden ermöglicht, die für die [System.Object](./)-Klasse in C# verfügbar sind. Alle nicht‑trivialen Klassen, die in der übersetzten Umgebung verwendet werden, sollten sie erben.

```cpp
class Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | Vergleicht Objekte nach den C#-Semantiken von [Object.Equals](./equals/). |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergleicht Referenztyp‑Objekte im C#‑Stil. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergleicht Werttyp‑Objekte im C#‑Stil. |
| static [Equals](./equals/)(float const\&, float const\&) | Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist. |
| static [Equals](./equals/)(double const\&, double const\&) | Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Nur für interne Zwecke. |
| [GetCounter](./getcounter/)() | Ermittelt die Referenzzähler‑Datenstruktur, die dem Objekt zugeordnet ist. |
| virtual [GetHashCode](./gethashcode/)() const | Analog zur C#-Methode [Object.GetHashCode()](./gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| virtual [GetType](./gettype/)() const | Ermittelt den tatsächlichen Typ des Objekts. Analog zum C#-Aufruf [System.Object.GetType()](./gettype/). |
| virtual [Is](./is/)(const TypeInfo\&) const | Prüft, ob das Objekt eine Instanz des durch targetType beschriebenen Typs darstellt. Analog zum C#-Operator 'is'. |
| [Lock](./lock/)() | Implementiert das Sperren des C#-lock()-Statements. Direkt aufrufen oder das [LockContext](../lockcontext/)-Wächterobjekt verwenden. |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analog zur C#-Methode [Object.MemberwiseClone()](./memberwiseclone/). Ermöglicht das Klonen benutzerdefinierter Typen. |
| [Object](./object/)() | Erstellt ein Objekt. Initialisiert alle internen Datenstrukturen. |
| [Object](./object/)(Object const\&) | Kopierkonstruktor. Kopiert nichts, sondern initialisiert lediglich ein neues Objekt und ermöglicht das Kopierkonstrukt von Unterklassen. |
| [operator=](./operator=/)(Object const\&) | Zuweisungsoperator. Kopiert nichts, sondern initialisiert lediglich ein neues Objekt und ermöglicht das Kopierkonstrukt von Unterklassen. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Vergleicht Objekte nach Referenz. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Vergleicht Objekte nach Referenz. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Vergleicht den Werttyp‑Objekt referenziell mit nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Spezialisierung von [Object::ReferenceEquals](./referenceequals/) für den Fall von string und nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Spezialisierung von [Object::ReferenceEquals](./referenceequals/) für den Fall von strings. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Verringert die gemeinsame Referenzzählung um den angegebenen Wert. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |
| [SharedCount](./sharedcount/)() const | Liefert den aktuellen Wert des gemeinsamen Referenzzählers. |
| [SharedRefAdded](./sharedrefadded/)() | Erhöht die gemeinsame Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen sollten Smart‑Pointer oder ThisProtector verwendet werden. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Verringert und gibt die gemeinsame Referenzzählung zurück. Sollte nicht direkt aufgerufen werden; stattdessen sollten Smart‑Pointer oder ThisProtector verwendet werden. |
| virtual [ToString](./tostring/)() const | Analog zur C#‑Methode [Object.ToString()](./tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [Type](./type/)() | Implementiert das C#‑Konstrukt typeof([System.Object](./)). |
| [Unlock](./unlock/)() | Implementiert das Entsperren der C#‑lock()-Anweisung. Direkt aufrufen oder das [LockContext](../lockcontext/) Wächterobjekt verwenden. |
| [WeakRefAdded](./weakrefadded/)() | Erhöht die schwache Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen sollten Smart‑Pointer oder ThisProtector verwendet werden. |
| [WeakRefRemoved](./weakrefremoved/)() | Verringert die schwache Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen sollten Smart‑Pointer oder ThisProtector verwendet werden. |
| virtual [~Object](./~object/)() | Zerstört das Objekt. Gibt alle internen Datenstrukturen frei. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ptr](./ptr/) | Alias für den Smart‑Pointer‑Typ. |
## Hinweise


Zusätzlich zu den in der C#‑Klasse [System.Object](./) verfügbaren Methoden ermöglicht es auch die Unterstützung einiger für die übersetzte Code‑Umgebung spezifischer Konzepte. Dazu gehören die Referenzzählung, die von Smart‑Pointer‑Klassen ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) verwendet wird, sowie weitere Dienste im Zusammenhang mit Speicherverwaltung, Debugging usw.

Jedes [Object](./) verfügt über zwei Referenzzähler: einen gemeinsamen Referenzzähler und einen schwachen Referenzzähler. Der schwache Referenzzähler wird stets in einer separaten Datenstruktur gespeichert, nicht im [Object](./) selbst, wodurch schwache Zeiger das referenzierte Objekt überleben können. Der gemeinsame Referenzzähler wird entweder im Objekt selbst oder in derselben separaten Struktur gespeichert, abhängig vom Zustand des Makros ENABLE_EXTERNAL_REFCOUNT. Standardmäßig ist er in Debug‑Builds aktiviert und in Release‑Builds deaktiviert. Wenn der Smart‑Pointer‑Zähler im Objekt selbst gespeichert wird, wird die separate Datenstruktur nur erstellt, falls schwache Zeiger auf das Objekt existieren. Andernfalls wird sie zusammen mit dem Objekt erstellt.

Alle Smart‑Pointer verwenden diese beiden Referenzzähler und tragen zur selben, einzigen Eigentümergruppe bei.

Wenn eine Unterklasse von [Object](./) auf dem Stack erstellt wird, dürfen keine Smart‑Pointer darauf erzeugt werden, da sonst ein Problem beim Stack‑Löschen entsteht.

Dieser Typ kann entweder als Werttyp auf dem Stack oder im Heap mittels der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Sobald das Objekt alloziert ist, dürfen diese beiden Anwendungsfälle niemals vermischt werden: Das Vorhandensein von [SmartPtr](../smartptr/)-Zeigern auf stack‑alloziierte Objekte ist streng verboten.
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
