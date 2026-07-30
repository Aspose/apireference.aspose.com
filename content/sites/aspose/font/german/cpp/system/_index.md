---
title: "System-Namespace"
linktitle: "System"
second_title: "Aspose.Font für C++"
description: "Wie man den System-Namespace in C++ verwendet."
type: docs
weight: 2500
url: /de/cpp/system/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Activator](./activator/) | Enthält Methoden zum Erzeugen von Objekttypen. |
| [Array](./array/) | Klasse, die eine Array-Datenstruktur darstellt. Objekte dieser Klasse sollten nur mit den Funktionen [System::MakeArray()](./makearray/) und [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ArraySegment](./arraysegment/) | Stellt ein Segment des eindimensionalen Arrays dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [Attribute](./attribute/) | Eine Basisklasse für benutzerdefinierte Attribute. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [BitConverter](./bitconverter/) | Enthält Methoden, die Konvertierungen einer Sequenz von Bytes zu einem Werttyp und umgekehrt durchführen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [Boolean](./boolean/) | Klasse, die statische Mitglieder des Typs [System.Boolean](./boolean/) .[Net](../system.net/) hält. |
| [BoxedEnum](./boxedenum/) | Stellt einen verpackten Enumerationswert dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [BoxedValue](./boxedvalue/) | Stellt einen verpackten Wert dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [BoxedValueBase](./boxedvaluebase/) | Eine Basisklasse, die ein Interface definiert und einige grundlegende Methoden einer abgeleiteten Klasse implementiert, die einen verpackten Wert darstellt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Buffer](./buffer/) | Enthält Methoden, die rohe Byte-Arrays manipulieren. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [Byte](./byte/) | Enthält Methoden zur Arbeit mit dem vorzeichenlosen 8‑Bit‑Integer. |
| [Char](./char/) | Stellt Methoden zur Manipulation von Zeichen bereit, die als UTF‑16‑Codeeinheiten dargestellt werden. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [Comparison](./comparison/) | Stellt einen Zeiger auf die Methode dar, die zwei Objekte desselben Typs vergleicht. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [Console](./console/) | Stellt Methoden zum Ausgeben von Daten in den Standardausgabestream bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [ConsoleOutput](./consoleoutput/) | Stellt den Standardausgabestream dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [DateTime](./datetime/) | Stellt einen bestimmten Datum‑ und Uhrzeitwert im Zeitkontinuum dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [DateTimeOffset](./datetimeoffset/) | Enthält das Datum und die Uhrzeit relativ zur koordinierten Weltzeit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [DBNull](./dbnull/) | Stellt einen nicht vorhandenen Wert dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Decimal](./decimal/) | Stellt eine Dezimalzahl dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [DefaultBoxedValue](./defaultboxedvalue/) | [BoxedValue](./boxedvalue/) Klassenimplementation. Ermöglicht es, BoxingValue‑Spezialisierungen zu deklarieren, ohne gemeinsamen Code zu duplizieren. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | Stellt einen Zeiger auf eine Funktion, Methode oder ein Funktionsobjekt dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [DynamicWeakPtr](./dynamicweakptr/) | Smart‑Pointer‑Klasse, die die Zeigermodi von Template‑Argumenten des gespeicherten Objekts verfolgt und nach jeder Zuweisung aktualisiert. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und per Wert oder als const‑Referenz an Funktionen übergeben werden. |
| [EnumValues](./enumvalues/) | Stellt Metainformationen über Aufzählungskonstanten des Aufzählungstyps **E** bereit. |
| [EnumValuesBase](./enumvaluesbase/) | Eine Basisklasse für eine Klasse, die Metainformationen eines Aufzählungstyps darstellt. |
| [EventArgs](./eventargs/) | Die Basisklasse für Klassen, die einen Kontext darstellen, der an die Ereignis‑Abonnenten übergeben wird, wenn ein Ereignis ausgelöst wird. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ExceptionWrapper](./exceptionwrapper/) | Template, das einen Wrapper für Ausnahmen darstellt, die von der Klasse [Exception](./exception/) abgeleitet sind. |
| [FlagsAttribute](./flagsattribute/) | Gibt an, dass eine Aufzählung als Bitfeld behandelt werden kann; das heißt, als Menge von. |
| [Func](./func/) | Funktions‑Delegate. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [GC](./gc/) | Stellt eine emulierte Garbage Collection dar, die eher wie ein Stub funktioniert und de facto nichts tut. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [Guid](./guid/) | Stellt einen global eindeutigen Bezeichner (GUID) dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/) zur Verwaltung von Objekten dieses Typs. |
| [IAsyncResult](./iasyncresult/) | Stellt den Status einer asynchronen Operation dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ICloneable](./icloneable/) | Definiert eine Methode, die das Klonen von Objekten ermöglicht – das Erstellen einer Kopie eines Objekts. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IComparable](./icomparable/) | Definiert eine Methode, die zwei Objekte vergleicht. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IConvertible](./iconvertible/) | Definiert Methoden, die den Wert des implementierenden Referenz‑ oder Werttyps in einen Common Language Runtime‑Typ mit äquivalentem Wert konvertieren. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ICustomFormatter](./icustomformatter/) | Definiert eine Methode, die eine benutzerdefinierte Formatierung der Zeichenkettenrepräsentation eines durch das angegebene Objekt dargestellten Werts durchführt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IDisposable](./idisposable/) | Definiert eine Methode, die Ressourcen freigibt, die dem aktuellen Objekt gehören. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IEquatable](./iequatable/) | Definiert eine Methode, die die Gleichheit von zwei Objekten bestimmt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IFormatProvider](./iformatprovider/) | Definiert eine Methode, die Formatierungsinformationen bereitstellt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [IFormattable](./iformattable/) | Definiert eine Methode, die den Wert des aktuellen Objekts mithilfe der angegebenen Formatzeichenfolge und des Formatproviders formatiert. |
| [Int16](./int16/) | Enthält Methoden zur Arbeit mit dem 16‑Bit‑Integer. |
| [Int32](./int32/) | Enthält Methoden zur Arbeit mit dem 32‑Bit‑Integer. |
| [Int64](./int64/) | Enthält Methoden zur Arbeit mit dem 64‑Bit‑Integer. |
| [LockContext](./lockcontext/) | Wächterobjekt, das die C#-lock()-Anweisung implementiert. |
| [MarshalByRefObject](./marshalbyrefobject/) | Stellt Zugriff auf Objekte über Anwendungsdomänengrenzen in remoting‑fähigen Anwendungen bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | Stellt eine Sammlung von Delegaten dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [Nullable](./nullable/) | Vorwärtsdeklaration. |
| [NullableUtils](./nullableutils/) | Stellt die C#-Klasse [System.Nullable](./nullable/) (ohne Typargumente) als statische Klasse dar. Der Originalname kann nicht verwendet werden, da in C++ Klassen‑Templates nicht überladen werden können. Unterstützt einen Werttyp, dem null zugewiesen werden kann. Diese Klasse kann nicht vererbt werden. |
| [Object](./object/) | Basisklasse, die die Verwendung von Methoden der Klasse [System.Object](./object/) in C# ermöglicht. Alle nicht triviale Klassen, die in der übersetzten Umgebung verwendet werden, sollten von ihr erben. |
| [ObjectExt](./objectext/) | Stellt statische Methoden bereit, die C#‑[Object](./object/)-Methoden für Nicht‑Object‑C++‑Typen (Strings, Zahlen usw.) nachahmen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon erstellen. |
| [ObjectType](./objecttype/) | Stellt statische Methoden bereit, die Objekt‑Typ‑Getter implementieren. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon erstellen. |
| [OperatingSystem](./operatingsystem/) | Stellt ein bestimmtes Betriebssystem dar und liefert Informationen darüber. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Random](./random/) | Stellt einen Pseudo‑Zufallszahlengenerator dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ReadOnlySpan](./readonlyspan/) | Vorwärtsdeklaration zur Verwendung innerhalb der Klasse [Span](./span/). |
| [ScopedCulture](./scopedculture/) | Stellt eine im Geltungsbereich verwendete Kultur dar. |
| [SmartPtr](./smartptr/) | Zeigerklasse zum Einhüllen von Typen, die im Heap alloziert werden. Verwenden Sie sie, um den Speicher für Klassen zu verwalten, die von [Object](./object/) erben. Dieser Zeigertyp folgt den Semantiken intrusiver Zeiger. Der Referenzzähler wird entweder im [Object](./object/) selbst oder in einer Zählerstruktur gespeichert, die eng mit der [Object](./object/)-Instanz verknüpft ist. In jedem Fall bilden alle [SmartPtr](./smartptr/)-Instanzen eine einzige Besitzgruppe, unabhängig davon, wie sie erstellt wurden, was sich vom Verhalten der Klasse std::shared_ptr unterscheidet. Das Konvertieren eines rohen Zeigers zu einem [SmartPtr](./smartptr/) ist sicher, solange andere [SmartPtr](./smartptr/)-Instanzen geteilte Referenzen auf dasselbe Objekt halten. Eine [SmartPtr](./smartptr/)-Klasseninstanz kann sich in einem von zwei Zuständen befinden: Shared‑Pointer und Weak‑Pointer. Damit ein Objekt am Leben bleibt, muss die Anzahl der geteilten Referenzen positiv sein. Sowohl schwache als auch geteilte Zeiger können verwendet werden, um auf das referenzierte Objekt zuzugreifen (Methoden aufzurufen, Felder zu lesen oder zu schreiben usw.), jedoch nehmen schwache Zeiger nicht am Referenzzählen der geteilten Zeiger teil. Das [Object](./object/) wird gelöscht, wenn der letzte „shared“ [SmartPtr](./smartptr/)-Zeiger darauf zerstört wird. Stellen Sie also sicher, dass dies nicht geschieht, wenn keine anderen geteilten [SmartPtr](./smartptr/)-Zeiger auf das Objekt existieren, z. b. während der Objektkonstruktion oder -zerstörung. Verwenden Sie System::Object::ThisProtector‑Wächterobjekte (im C++‑Code) oder die Attribute CppCTORSelfReference bzw. CppSelfReference (im zu übersetzenden C#‑Code), um dieses Problem zu beheben. Ebenso sollten Sie Schleifenreferenzen durch die Verwendung der Zeigerklasse [System::WeakPtr](./weakptr/) oder des Zeigermodus [System::SmartPtrMode::Weak](./smartptrmode/) (im C++‑Code) bzw. des Attributs CppWeakPtr (im zu übersetzenden C#‑Code) aufbrechen. Wenn zwei oder mehr Objekte sich gegenseitig mit „shared“-Zeigern referenzieren, werden sie nie gelöscht. Sollte der Zeigertyp (weak oder shared) zur Laufzeit gewechselt werden müssen, verwenden Sie die Methode [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) oder die Klasse [System::DynamicWeakPtr](./dynamicweakptr/). Die [SmartPtr](./smartptr/)-Klasse enthält keine virtuellen Methoden. Sie sollten sie nur erben, wenn Sie eine eigene Speicherverwaltungsstrategie erstellen. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und per Wert oder konstanter Referenz an Funktionen übergeben werden. |
| [SmartPtrInfo](./smartptrinfo/) | Dienstklasse zum Testen und Ändern des Inhalts von [SmartPtr](./smartptr/), ohne den endgültigen Typ zu kennen. Wird für Garbage‑Collection und die Erkennung von Schleifenreferenzen usw. verwendet. Denken Sie an sie als „Zeiger‑zu‑Zeiger“. Wir können den Basistyp von [SmartPtr](./smartptr/) nicht verwenden, da er keinen hat; stattdessen nutzen wir diese „Info“-Klasse. |
| [Span](./span/) | Stellt einen zusammenhängenden Bereich beliebigen Speichers dar, ähnlich wie std::span aus C++20. |
| [String](./string/) | Die Klasse [String](./string/) wird bibliotheksweit verwendet. Sie ist ein Ersatz für C#‑[System.String](./string/) beim Übersetzen von Code. Aus Optimierungsgründen wird sie nicht als Unterklasse von [Object](./object/) betrachtet. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [StringComparer](./stringcomparer/) | Vergleicht Zeichenketten mit verschiedenen Vergleichsmodi. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [StringHashCompiletime](./stringhashcompiletime/) | Hilfsklasse, die einen Hashwert aus einem C‑String erzeugt. |
| [TimeSpan](./timespan/) | Stellt ein Zeitintervall dar. Dieser Typ sollte auf dem Stack alloziert und per Wert oder Referenz an Funktionen übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [TimeZone](./timezone/) | Stellt eine Zeitzone dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [TimeZoneInfo](./timezoneinfo/) | Stellt Informationen zu einer bestimmten Zeitzone dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](./smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Tuple](./tuple/) | Klasse, die eine Tupel‑Datenstruktur darstellt. Die maximale Anzahl von Elementen beträgt 8. |
| [TupleFactory](./tuplefactory/) | Stellt statische Methoden zum Erzeugen von Tupel‑Objekten bereit. |
| [TypeInfo](./typeinfo/) | Stellt einen bestimmten Typ dar und liefert Informationen darüber. |
| [Uri](./uri/) | Einheitlicher Ressourcenbezeichner. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [UriBuilder](./uribuilder/) | Stellt Methoden zum Erstellen und Ändern universeller Ressourcenbezeichner (URIs) bereit. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [UriParser](./uriparser/) | Wird verwendet, um ein neues URI‑Schema zu analysieren. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](./makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](./smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [UriShim](./urishim/) | Dienstklasse. |
| [ValueTuple](./valuetuple/) | Klasse, die eine [ValueTuple](./valuetuple/) Datenstruktur repräsentiert. |
| [ValueType](./valuetype/) | Basisklasse für Werttypen mit [Object](./object/)-Vererbung, die aus Leistungsgründen gekürzt wird. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [Version](./version/) | Stellt eine Versionsnummer dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | Unterklasse von [System::SmartPtr](./smartptr/), die sich beim Konstruktor in den Weak‑Modus versetzt. Bitte beachten Sie, dass diese Klasse nicht garantiert, dass ihre Instanz stets im Weak‑Modus bleibt, da [set_Mode()](./smartptr/set_mode/) weiterhin zugänglich ist. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden. |
| [WeakReference](./weakreference/) | Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt dennoch gelöscht werden kann. |
| [WeakReference< T >](./weakreference_t_/) | Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt dennoch gelöscht werden kann. |
| [WeakReference<>](./weakreference__/) | Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt dennoch gelöscht werden kann. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | Aufzählung, die Werte enthält, die verschiedene Formate von base‑64‑kodierten Daten repräsentieren. |
| [DateTimeKind](./datetimekind/) | Aufzählungswerte, die die Arten von Datum und Uhrzeit repräsentieren. |
| [DayOfWeek](./dayofweek/) | Aufzählung, die einen Wochentag darstellt. |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | Gibt den Speicherort der Umgebungsvariablen an. |
| [MidpointRounding](./midpointrounding/) | Gibt das Verhalten von Rundungsfunktionen an. |
| [PlatformID](./platformid/) | Stellt eine Betriebssystemplattform dar. |
| [SmartPtrMode](./smartptrmode/) | [SmartPtr](./smartptr/) Zeigertyp: weak oder shared. Definiert, ob der Zeiger gezählt wird, wenn entschieden wird, ob das Objekt gelöscht werden soll oder nicht. |
| [StringComparison](./stringcomparison/) | Definiert den Stil des Zeichenkettenvergleichs. |
| [StringSplitOptions](./stringsplitoptions/) | Bestimmt das Verhalten beim Aufteilen von Zeichenketten. |
| [TypeCode](./typecode/) | Stellt den Typ eines Objekts dar. |
| [UriComponents](./uricomponents/) | Stellt URI‑Komponenten dar. |
| [UriFormat](./uriformat/) | Gibt an, wie die URI escaped wird. |
| [UriHostNameType](./urihostnametype/) | Stellt den Typ des Hostnamens dar. |
| [UriKind](./urikind/) | Stellt die Arten von URIs dar. |
| [UriPartial](./uripartial/) | Stellt die Teile einer URI für die Methode [Uri.GetLeftPart](./uri/getleftpart/) dar. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Action](./action/) | Delegattyp, der Methoden referenziert, die keinen Rückgabewert haben. |
| [AggregateException](./aggregateexception/) |  |
| [ArrayPtr](./arrayptr/) | Alias für den Typ 'Zeiger auf ein Array'. |
| [AsyncCallback](./asynccallback/) | Ein Delegattyp, der eine Methode repräsentiert, die aufgerufen wird, wenn eine asynchrone Operation abgeschlossen ist. |
| [BadImageFormatException](./badimageformatexception/) | Die Ausnahme, die ausgelöst wird, wenn das Dateiabild einer dynamischen Linkbibliothek (DLL) oder eines ausführbaren Programms ungültig ist. Wickeln Sie niemals Instanzen der Klasse [BadImageFormatException](./badimageformatexception/) in [System::SmartPtr](./smartptr/) ein. |
| [ByteArrayPtr](./bytearrayptr/) | Ein Alias für ein Smart‑Pointer‑Objekt, das auf ein Array von vorzeichenlosen 8‑Bit‑Integern zeigt. |
| [Converter](./converter/) | Repräsentiert einen Zeiger auf das aufrufbare Objekt, das ein einzelnes Argument des Typs **TInput** akzeptiert und einen Wert des Typs **TOutput** zurückgibt. |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/) zeigt. |
| [DecoderFallbackPtr](./decoderfallbackptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::DecoderFallback](../system.text/decoderfallback/) zeigt. |
| [DecoderPtr](./decoderptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::Decoder](../system.text/decoder/) zeigt. |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/) zeigt. |
| [DirectoryInfoPtr](./directoryinfoptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::DirectoryInfo](../system.io/directoryinfo/) zeigt. |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/) zeigt. |
| [EncoderFallbackPtr](./encoderfallbackptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::EncoderFallback](../system.text/encoderfallback/) zeigt. |
| [EncoderPtr](./encoderptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::Encoder](../system.text/encoder/) zeigt. |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/) zeigt. |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/) zeigt. |
| [EncodingInfoPtr](./encodinginfoptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::EncodingInfo](../system.text/encodinginfo/) zeigt. |
| [EncodingPtr](./encodingptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Text::Encoding](../system.text/encoding/) zeigt. |
| [Event](./event/) | Repräsentiert ein Ereignis – einen Mechanismus, über den Abonnenten über ein interessantes Auftreten mittels einer Delegatenaufruf benachrichtigt werden. |
| [EventArgsPtr](./eventargsptr/) | Gemeinsamer Zeiger auf eine Instanz der Klasse [EventArgs](./eventargs/). |
| [EventHandler](./eventhandler/) | Repräsentiert eine Methode, die auf ein Ereignis reagiert und es verarbeitet. Dieser Typ sollte auf dem Stack alloziert und Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](./smartptr/), um Objekte dieses Typs zu verwalten. |
| [Exception](./exception/) | Alias, der anstelle von Details::Exception verwendet werden soll. |
| [ExceptionPtr](./exceptionptr/) | Typalias, der von Ausnahme‑Wrappern verwendet wird. |
| [FileInfoPtr](./fileinfoptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::FileInfo](../system.io/fileinfo/) zeigt. |
| [FileStreamPtr](./filestreamptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::FileStream](../system.io/filestream/) zeigt. |
| [FileSystemInfoPtr](./filesysteminfoptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::FileSystemInfo](../system.io/filesysteminfo/) zeigt. |
| [FunctionPtr](./functionptr/) | Ein Alias für einen Funktionstyp mit Standardaufrufkonvention. |
| [IAsyncResultPtr](./iasyncresultptr/) | Gemeinsamer Zeiger zu [IAsyncResult](./iasyncresult/). |
| [IFormatProviderPtr](./iformatproviderptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IFormatProvider](./iformatprovider/) zeigt. |
| [MakeConstRef_t](./makeconstref_t/) | Hilfstyp für den Modifier [MakeConstRef](./makeconstref/). |
| [MemoryStreamPtr](./memorystreamptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::MemoryStream](../system.io/memorystream/) zeigt. |
| [Predicate](./predicate/) | Stellt einen Zeiger auf ein Prädikat dar – ein aufrufbares Objekt, das ein einzelnes Argument akzeptiert und einen bool‑Wert zurückgibt. |
| [RTaskPtr](./rtaskptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/) zeigt. |
| [SharedPtr](./sharedptr/) | Alias für einen Smart‑Pointer, der in der Bibliothek häufig verwendet wird. |
| [StreamPtr](./streamptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::Stream](../system.io/stream/) zeigt. |
| [StreamReaderPtr](./streamreaderptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::StreamReader](../system.io/streamreader/) zeigt. |
| [StreamWriterPtr](./streamwriterptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::IO::StreamWriter](../system.io/streamwriter/) zeigt. |
| [StringComparerPtr](./stringcomparerptr/) | Ein Alias für einen gemeinsamen Zeiger auf eine Instanz der Klasse [StringComparer](./stringcomparer/). |
| [TaskPtr](./taskptr/) | Ein Alias für einen Smart‑Pointer, der auf eine Instanz der Klasse [System::Threading::Tasks::Task](../system.threading.tasks/task/) zeigt. |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | Alias für einen gemeinsamen Zeiger auf eine Instanz der Klasse [TimeZoneInfo](./timezoneinfo/). |
| [TimeZonePtr](./timezoneptr/) | Gemeinsamer Zeiger auf eine Instanz der Klasse [TimeZone](./timezone/). |
## Functions

| Funktion | Beschreibung |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ConstCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Standard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Standard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Verwerfen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| dynamic_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gleich | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gleich< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gleich< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ExpliziteUmwandlung | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ForceStaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ForEachMemberGVName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| GEqual | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Holen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Holen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Holen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Holen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| get_pointer | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HashCodeAbrufen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HashCodeAbrufen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HashCodeAbrufen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HashCodeAbrufen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| HashCodeAbrufen | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Größer | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| InitObjekt | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ist | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ist | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ist | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_parametrized_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_vp_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IstEnumMetaInfoDefiniert | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IstEnumMetaInfoDefiniert | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNaN | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNegativeInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsPositiveInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| LEqual | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Less | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
