---
title: "System::SmartPtr-Klasse"
linktitle: "SmartPtr"
second_title: "Aspose.Page für C++"
description: "System::SmartPtr class. Zeigerklasse zum Einhüllen von Typen, die auf dem Heap alloziert werden. Verwenden Sie sie, um den Speicher für Klassen zu verwalten, die Object erben. Dieser Zeigertyp folgt intrusiven Zeigersemantiken. Der Referenzzähler wird entweder im Object selbst oder in einer Zählerstruktur gespeichert, die fest mit der Object‑Instanz verknüpft ist. In jedem Fall bilden alle SmartPtr‑Instanzen eine Single‑Ownership‑Gruppe, unabhängig davon, wie sie erstellt wurden, was sich von dem Verhalten der std::shared_ptr‑Klasse unterscheidet. Das Konvertieren eines rohen Zeigers zu SmartPtr ist sicher, solange andere SmartPtr‑Instanzen gemeinsame Referenzen auf dasselbe Objekt halten. Eine SmartPtr‑Klasseninstanz kann sich in einem von zwei Zuständen befinden: Shared‑Pointer und Weak‑Pointer. Damit ein Objekt am Leben bleibt, sollte die Anzahl der Shared‑Referenzen positiv sein. Sowohl Weak‑ als auch Shared‑Pointer können verwendet werden, um auf das referenzierte Objekt zuzugreifen (Methoden aufzurufen, Felder zu lesen oder zu schreiben usw.), aber Weak‑Pointer nehmen nicht am Referenzzähler der Shared‑Pointer teil. Das Object wird gelöscht, wenn der letzte ''shared'' SmartPtr‑Pointer darauf zerstört wird. Stellen Sie also sicher, dass dies nicht passiert, wenn keine anderen Shared‑SmartPtr‑Pointer auf das Objekt existieren, z. B. während der Objektkonstruktion oder -destruktion. Verwenden Sie System::Object::ThisProtector‑Sentry‑Objekte (im C++‑Code) oder das CppCTORSelfReference‑ bzw. CppSelfReference‑Attribut (im zu übersetzenden C#‑Code), um dieses Problem zu beheben. Ähnlich sollten Sie Schleifenreferenzen durch die Verwendung der System::WeakPtr‑Zeigerklasse oder des System::SmartPtrMode::Weak‑Zeigermodus (im C++‑Code) bzw. des CppWeakPtr‑Attributs (im zu übersetzenden C#‑Code) aufbrechen. Wenn zwei oder mehr Objekte sich gegenseitig mit ''shared''‑Pointern referenzieren, werden sie nie gelöscht. Wenn der Zeigertyp (Weak oder Shared) zur Laufzeit gewechselt werden soll, verwenden Sie die System::SmartPtr<T>::set_Mode()‑Methode oder die System::DynamicWeakPtr‑Klasse. Die SmartPtr‑Klasse enthält keine virtuellen Methoden. Sie sollten sie nur erben, wenn Sie eine eigene Speicherverwaltungsstrategie erstellen. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden."
type: docs
weight: 5500
url: /de/cpp/system/smartptr/
---
## SmartPtr class


Zeigerklasse zum Einhüllen von Typen, die auf dem Heap alloziert werden. Verwenden Sie sie, um den Speicher für Klassen zu verwalten, die [Object](../object/) erben. Dieser Zeigertyp folgt intrusiven Zeigersemantiken. Der Referenzzähler wird entweder im [Object](../object/) selbst oder in einer Zählerstruktur gespeichert, die fest mit der [Object](../object/)-Instanz verknüpft ist. In jedem Fall bilden alle [SmartPtr](./)-Instanzen eine Single‑Ownership‑Gruppe, unabhängig davon, wie sie erstellt wurden, was sich vom Verhalten der std::shared_ptr‑Klasse unterscheidet. Das Konvertieren eines rohen Zeigers zu [SmartPtr](./) ist sicher, solange andere [SmartPtr](./)-Instanzen gemeinsame Referenzen auf dasselbe Objekt halten. Eine [SmartPtr](./)-Klasseninstanz kann sich in einem von zwei Zuständen befinden: Shared‑Pointer und Weak‑Pointer. Damit ein Objekt am Leben bleibt, sollte die Anzahl der Shared‑Referenzen positiv sein. Sowohl Weak‑ als auch Shared‑Pointer können verwendet werden, um auf das referenzierte Objekt zuzugreifen (Methoden aufzurufen, Felder zu lesen oder zu schreiben usw.), aber Weak‑Pointer nehmen nicht am Referenzzähler der Shared‑Pointer teil. Das [Object](../object/) wird gelöscht, wenn der letzte 'shared' [SmartPtr](./)-Pointer darauf zerstört wird. Stellen Sie also sicher, dass dies nicht passiert, wenn keine anderen Shared‑[SmartPtr](./)-Pointer auf das Objekt existieren, z. B. während der Objektkonstruktion oder -destruktion. Verwenden Sie System::Object::ThisProtector‑Sentry‑Objekte (im C++‑Code) oder CppCTORSelfReference‑ bzw. CppSelfReference‑Attribute (im zu übersetzenden C#‑Code), um dieses Problem zu beheben. Ähnlich sollten Sie Schleifenreferenzen durch die Verwendung der [System::WeakPtr](../weakptr/)-Zeigerklasse oder des [System::SmartPtrMode::Weak](../smartptrmode/)-Zeigermodus (im C++‑Code) bzw. des CppWeakPtr‑Attributs (im zu übersetzenden C#‑Code) aufbrechen. Wenn zwei oder mehr Objekte sich gegenseitig mit 'shared'‑Pointern referenzieren, werden sie nie gelöscht. Wenn der Zeigertyp (Weak oder Shared) zur Laufzeit gewechselt werden soll, verwenden Sie die [System::SmartPtr<T>::set_Mode()](./set_mode/)-Methode oder die [System::DynamicWeakPtr](../dynamicweakptr/)-Klasse. Die [SmartPtr](./)-Klasse enthält keine virtuellen Methoden. Sie sollten sie nur erben, wenn Sie eine eigene Speicherverwaltungsstrategie erstellen. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden.

```cpp
template<class T>class SmartPtr
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des referenzierten Objekts. Muss entweder [System::Object](../object/) oder eine Unterklasse davon sein. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [begin](./begin/)() | Zugriff auf die [begin()](./begin/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [begin()](./begin/)-Methode ist. |
| [begin](./begin/)() const | Zugriff auf die [begin()](./begin/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [begin()](./begin/)-Methode ist. |
| [Cast](./cast/)() const | Wandelt den Zeiger in seinen eigenen Typ um. |
| [Cast](./cast/)() const | Wandelt den Zeiger mittels static_cast in den Basistyp um. |
| [Cast](./cast/)() const | Wandelt den Zeiger mittels dynamic_cast in den abgeleiteten Typ um. |
| [Cast](./cast/)() const | Wandelt den Zeiger mittels dynamic_cast in den abgeleiteten Typ um. |
| [cbegin](./cbegin/)() const | Zugriff auf die [cbegin()](./cbegin/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [cbegin()](./cbegin/)-Methode ist. |
| [cend](./cend/)() const | Zugriff auf die [cend()](./cend/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [cend()](./cend/)-Methode ist. |
| [const_pointer_cast](./const_pointer_cast/)() const | Wandelt den Zeiger mittels const_cast in einen anderen Typ des referenzierten Objekts um. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Wandelt den Zeiger mittels dynamic_cast in einen anderen Typ des referenzierten Objekts um. |
| [end](./end/)() | Zugriff auf die [end()](./end/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [end()](./end/)-Methode ist. |
| [end](./end/)() const | Zugriff auf die [end()](./end/)-Methode einer zugrunde liegenden Sammlung. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) ein Spezialisierungstyp mit einer [end()](./end/)-Methode ist. |
| [get](./get/)() const | Gibt das referenzierte Objekt zurück. |
| [get_Mode](./get_mode/)() const | Gibt den Zeigermodus zurück. |
| [get_shared](./get_shared/)() const | Gibt das referenzierte Objekt zurück, assertiert jedoch, dass der Zeiger im shared mode ist. |
| [get_shared_count](./get_shared_count/)() const | Ermittelt die Anzahl der bestehenden Shared‑Pointer auf das referenzierte Objekt, einschließlich des aktuellen. Assertiert, dass der aktuelle Zeiger im shared mode ist. |
| [GetHashCode](./gethashcode/)() const | Ruft [GetHashCode()](./gethashcode/) für das referenzierte Objekt auf. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Gibt das aktuell referenzierte Objekt zurück (falls vorhanden) oder wirft eine Ausnahme. |
| [GetObjectOrNull](./getobjectornull/)() const | Gibt das referenzierte Objekt zurück (falls vorhanden) oder nullptr. Gleichbedeutend mit [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Gibt das referenzierte Objekt zurück. |
| [GetPointer](./getpointer/)() const | Gibt das referenzierte Objekt zurück (falls vorhanden) oder nullptr. Gleichbedeutend mit [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Prüft, ob das referenzierte Objekt vom angegebenen Typ oder einem abgeleiteten Typ ist. Folgt den C#‑'is'-Semantiken. |
| [IsAliasingPtr](./isaliasingptr/)() const | Prüft, ob der Zeiger auf ein anderes Objekt als das besessene (erstellt durch einen aliasing‑Konstruktor) zeigt. |
| [IsShared](./isshared/)() const | Prüft, ob der Zeiger im shared mode ist. |
| [IsWeak](./isweak/)() const | Prüft, ob der Zeiger im weak mode ist. |
| explicit [operator bool](./operatorbool/)() const | Prüft, ob der Zeiger nicht null ist. |
| [operator!](./operator!/)() const | Prüft, ob der Zeiger null ist. |
| [operator*](./operator_/)() const | Gibt eine Referenz auf das referenzierte Objekt zurück. Assertiert, dass der Zeiger nicht null ist. |
| [operator->](./operator-_/)() const | Ermöglicht den Zugriff auf Mitglieder des referenzierten Objekts. |
| [operator<](./operator_/)(Y *) const | Bietet weniger‑Vergleichssemantik für die Klasse [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Bietet weniger‑Vergleichssemantik für die Klasse [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | Move‑zuweist das [SmartPtr](./)-Objekt. x wird unbenutzbar. |
| [operator=](./operator=/)(const SmartPtr_\&) | Kopiert das [SmartPtr](./)-Objekt per Zuweisung. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Kopiert das [SmartPtr](./)-Objekt per Zuweisung. Führt notwendige Typkonvertierungen durch. |
| [operator=](./operator=/)(Pointee_ *) | Weist einen rohen Zeiger dem [SmartPtr](./)-Objekt zu. |
| [operator=](./operator=/)(std::nullptr_t) | Setzt den Zeigerwert auf nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Prüft, ob der Zeiger auf nullptr zeigt. |
| [operator[]](./operator[]/)(IdxType) const | Zugriff auf Array‑Elemente. Kompiliert nur, wenn [SmartPtr_](./smartptr_/) eine Spezialisierung von [System::Array](../array/) ist. |
| [RemoveAliasing](./removealiasing/)() const | Entfernt Aliasing (erstellt durch einen aliasing‑Konstruktor) vom Zeiger, stellt sicher, dass er (bei shared) verwaltet oder (bei weak) verfolgt dasselbe Objekt, auf das er zeigt. |
| [reset](./reset/)(Pointee_ *) | Setzt das referenzierte Objekt. |
| [reset](./reset/)() | Lässt den Zeiger auf nullptr zeigen. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Setzt den Zeigermodus. Kann die Referenzzähler des referenzierten Objekts ändern. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Ruft die Methode SetTemplateWeakPtr() am referenzierten Objekt auf (falls vorhanden). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Erstellt ein [SmartPtr](./)-Objekt des erforderlichen Modus. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Erstellt ein Nullzeiger-[SmartPtr](./)-Objekt des erforderlichen Modus. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Erstellt ein [SmartPtr](./), das auf das angegebene Objekt zeigt, oder konvertiert einen rohen Zeiger zu einem [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Kopiert ein [SmartPtr](./)-Objekt. Beide Zeiger zeigen danach auf dasselbe Objekt. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Kopiert ein [SmartPtr](./)-Objekt. Beide Zeiger zeigen danach auf dasselbe Objekt. Führt eine Typkonvertierung durch, falls erlaubt. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Verschiebt ein [SmartPtr](./)-Objekt. Tauscht im Wesentlichen zwei Zeiger aus, wenn sie beide im selben Modus sind. x kann nach dem Aufruf unbenutzbar sein. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Konvertiert den Typ des referenzierten Arrays, indem ein neues Array eines anderen Typs erstellt wird. Nützlich, wenn es in C# einen Array-Typumwandlung gibt, die in C++ nicht unterstützt wird. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Initialisiert ein leeres Array. Wird verwendet, um einige C#-Codekonstrukte zu übersetzen. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Konstruiert ein [SmartPtr](./), das Eigentumsinformationen mit dem Anfangswert von ptr teilt, aber einen nicht verwandten und nicht verwalteten Zeiger p enthält. |
| [static_pointer_cast](./static_pointer_cast/)() const | Wandelt den Zeiger mithilfe von static_cast auf das referenzierte Objekt in einen anderen Typ um. |
| [ToObjectPtr](./toobjectptr/)() const | Konvertiert jeden Zeigertyp zu einem Zeiger auf [Object](../object/). Erfordert nicht, dass der Typ [Pointee_](./pointee_/) vollständig ist. |
| static [Type](./type/)() | Abkürzung, um das [System::TypeInfo](../typeinfo/)-Objekt für den Typ [Pointee_](./pointee_/) zu erhalten. |
| [~SmartPtr](./~smartptr/)() | Zerstört das [SmartPtr](./)-Objekt. Falls nötig, verringert es den Referenzzähler des referenzierten Objekts und löscht das Objekt. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ArrayType](./arraytype/) | Dasselbe wie [Pointee_](./pointee_/), falls es eine Spezialisierung von [System::Array](../array/) ist, sonst void. |
| [Pointee_](./pointee_/) | Typ, auf den gezeigt wird. |
| [SmartPtr_](./smartptr_/) | Spezialisierter Smart-Pointer-Typ. |
| [ValueType](./valuetype/) | Speichertyp des referenzierten Arrays. Nur sinnvoll, wenn T eine Spezialisierung von [System::Array](../array/) ist. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
