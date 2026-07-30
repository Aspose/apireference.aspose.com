---
title: "Namespace System::Text::RegularExpressions"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Font für C++"
description: "So verwenden Sie den Namespace System::Text::RegularExpressions in C++."
type: docs
weight: 6800
url: /de/cpp/system.text.regularexpressions/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Capture](./capture/) | Ergebnis einer einzelnen Subausdrucksübereinstimmung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [CaptureCollection](./capturecollection/) | Liste der Captures, die von einer einzelnen Capturing-Gruppe erstellt wurden. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Group](./group/) | Ergebnis einer Übereinstimmung, die von einer einzelnen Capturing-Gruppe durchgeführt wurde. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [GroupCollection](./groupcollection/) | Liste der Capture-Gruppen in einer einzelnen Übereinstimmung. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) Sammlungszeiger. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const-Referenz übergeben werden. |
| [Match](./match/) | [Single](../system/single/) Übereinstimmung eines regulären Ausdrucks mit einem String. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [MatchCollection](./matchcollection/) | Sammlung von Übereinstimmungen, die durch wiederholtes Anwenden eines regulären Ausdrucks auf einen String entstehen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Regex](./regex/) | Regulärer Ausdruck, der einer C#-ähnlichen Syntax folgt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) Optionen. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | Zeiger auf Capture-Sammlung. |
| [CapturePtr](./captureptr/) | Zeiger auf einzelnes Capture-Objekt. |
| [GroupPtr](./groupptr/) | Zeiger auf Gruppe. |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) Sammlungszeiger. |
| [MatchEvaluator](./matchevaluator/) | Delegatentyp zur Auswertung einer Übereinstimmung. |
| [MatchPtr](./matchptr/) | [Match](./match/) Zeiger. |
| [RegexPtr](./regexptr/) | [Regex](./regex/) Zeiger. |
| [UStringPtr](./ustringptr/) | Gemeinsame UnicodeString, um Kopieren zu vermeiden. |
