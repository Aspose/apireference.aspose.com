---
title: "System::Object‑Klasse"
linktitle: "Object"
second_title: "Aspose.Page für C++"
description: "System::Object‑Klasse. Basisklasse, die die Verwendung von Methoden ermöglicht, die für die System.Object‑Klasse in C# verfügbar sind. Alle nicht‑trivialen Klassen, die in der übersetzten Umgebung verwendet werden, sollten sie in C++ erben."
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
| virtual [Equals](./equals/)(ptr) | Vergleicht Objekte unter Verwendung der C# [Object.Equals](./equals/)-Semantik. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergleicht Referenztyp‑Objekte im C#‑Stil. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergleicht Werttyp‑Objekte im C#‑Stil. |
| static [Equals](./equals/)(float const\&, float const\&) | Emuliert den C#‑artigen Gleitkommavergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl nach IEC 60559:1989 NaN zu keinem Wert, einschließlich NaN, gleich ist. |
| static [Equals](./equals/)(double const\&, double const\&) | Emuliert den C#‑artigen Gleitkommavergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl nach IEC 60559:1989 NaN zu keinem Wert, einschließlich NaN, gleich ist. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Nur für interne Zwecke. |
| [GetCounter](./getcounter/)() | Ermittelt die Referenzzähler‑Datenstruktur, die dem Objekt zugeordnet ist. |
| virtual [GetHashCode](./gethashcode/)() const | Analog zur C# [Object.GetHashCode()](./gethashcode/)-Methode. Ermöglicht das Hashen benutzerdefinierter Objekte. |
| virtual [GetType](./gettype/)() const | Ermittelt den tatsächlichen Typ des Objekts. Analog zum C# [System.Object.GetType()](./gettype/)-Aufruf. |
| virtual [Is](./is/)(const TypeInfo\&) const | Prüft, ob das Objekt eine Instanz des durch targetType beschriebenen Typs darstellt. Analog zum C#‑Operator 'is'. |
| [Lock](./lock/)() | Implementiert das Sperren des C# lock()-Statements. Direkt aufrufen oder das [LockContext](../lockcontext/)-Wächterobjekt verwenden. |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analog zur C# [Object.MemberwiseClone()](./memberwiseclone/)-Methode. Ermöglicht das Klonen benutzerdefinierter Typen. |
| [Object](./object/)() | Erstellt ein Objekt. Initialisiert alle internen Datenstrukturen. |
| [Object](./object/)(Object const\&) | Kopierkonstruktor. Kopiert nichts, wirklich, er initialisiert nur ein neues Objekt und ermöglicht das Kopierkonstrukt von Unterklassen. |
| [operator=](./operator=/)(Object const\&) | Zuweisungsoperator. Kopiert nichts, wirklich, er initialisiert nur ein neues Objekt und ermöglicht das Kopierkonstrukt von Unterklassen. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Vergleicht Objekte nach Referenz. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Vergleicht Objekte nach Referenz. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Reference vergleicht Werttyp-Objekt mit nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Spezialisierung von [Object::ReferenceEquals](./referenceequals/) für den Fall von string und nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Spezialisierung von [Object::ReferenceEquals](./referenceequals/) für den Fall von strings. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Verringert die gemeinsame Referenzzählung um den angegebenen Wert. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |
| [SharedCount](./sharedcount/)() const | Liefert den aktuellen Wert des gemeinsamen Referenzzählers. |
| [SharedRefAdded](./sharedrefadded/)() | Erhöht die gemeinsame Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen smart pointers oder ThisProtector verwenden. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Verringert und gibt die gemeinsame Referenzzählung zurück. Sollte nicht direkt aufgerufen werden; stattdessen smart pointers oder ThisProtector verwenden. |
| virtual [ToString](./tostring/)() const | Analog zur C#-Methode [Object.ToString()](./tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen string. |
| static [Type](./type/)() | Implementiert das C#-Konstrukt typeof([System.Object](./)). |
| [Unlock](./unlock/)() | Implementiert das Entsperren der C# lock()-Anweisung. Direkt aufrufen oder das [LockContext](../lockcontext/) Wächterobjekt verwenden. |
| [WeakRefAdded](./weakrefadded/)() | Erhöht die schwache Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen smart pointers oder ThisProtector verwenden. |
| [WeakRefRemoved](./weakrefremoved/)() | Verringert die schwache Referenzzählung. Sollte nicht direkt aufgerufen werden; stattdessen smart pointers oder ThisProtector verwenden. |
| virtual [~Object](./~object/)() | Zerstört das Objekt. Gibt alle internen Datenstrukturen frei. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ptr](./ptr/) | Alias für den Smart-Pointer-Typ. |
## Hinweise


Zusätzlich zu den in der C#-Klasse [System.Object](./) verfügbaren Methoden ermöglicht es auch die Unterstützung einiger Konzepte, die speziell für die übersetzte Code-Umgebung gelten. Dazu gehören die Referenzzählung, die von Smart-Pointer-Klassen ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) verwendet wird, sowie weitere Dienste im Zusammenhang mit Speicherverwaltung, Debugging usw.

Jedes [Object](./) verfügt über zwei Referenzzähler: den gemeinsamen Referenzzähler und den schwachen Referenzzähler. Der schwache Referenzzähler wird stets in einer separaten Datenstruktur und nicht im [Object](./) selbst gespeichert, wodurch schwache Zeiger das referenzierte Objekt überleben können. Der gemeinsame Referenzzähler wird entweder im Objekt selbst oder in derselben separaten Struktur gespeichert, abhängig vom Zustand des Makros ENABLE_EXTERNAL_REFCOUNT. Standardmäßig ist er in Debug-Builds aktiviert und in Release-Builds deaktiviert. Wenn der Smart-Pointer-Zähler im Objekt selbst gespeichert wird, wird die separate Datenstruktur nur erstellt, falls schwache Zeiger auf das Objekt existieren. Andernfalls wird sie zusammen mit dem Objekt erstellt.

Alle Smart-Pointer verwenden diese beiden Referenzzähler und tragen zur selben einzigen Eigentümergruppe bei.

Wenn eine Unterklasse von [Object](./) auf dem Stack erstellt wird, dürfen keine Smart-Pointer darauf erzeugt werden, da sonst ein Problem beim Stack-Löschen entsteht.

Dieser Typ kann entweder als Werttyp auf dem Stack oder im Heap mittels der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Sobald das Objekt alloziert ist, dürfen diese beiden Anwendungsfälle niemals vermischt werden: Das Verwenden von [SmartPtr](../smartptr/)-Zeigern auf stack-allokierte Objekte ist strikt verboten.
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
