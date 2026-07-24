---
title: "System::Text::RegularExpressions Namespace"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Page für C++"
description: "Wie man den System::Text::RegularExpressions Namespace in C++ verwendet."
type: docs
weight: 6400
url: /de/cpp/system.text.regularexpressions/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [Capture](./capture/) | Ergebnis einer einzelnen Subausdruck‑Übereinstimmung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [CaptureCollection](./capturecollection/) | Liste der von einer einzelnen Capturing‑Gruppe erfassten Treffer. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Group](./group/) | Ergebnis der Übereinstimmung, die durch eine einzelne Erfassungsgruppe durchgeführt wurde. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [GroupCollection](./groupcollection/) | Liste der Erfassungsgruppen in einer einzelnen Übereinstimmung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) Sammlungszeiger. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const-Referenz übergeben werden. |
| [Match](./match/) | [Single](../system/single/) Übereinstimmung eines regulären Ausdrucks über einen String. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [MatchCollection](./matchcollection/) | Sammlung von Übereinstimmungen, die durch wiederholtes Anwenden eines regulären Ausdrucks auf einen String entstehen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Regex](./regex/) | Regulärer Ausdruck, der einer C#-ähnlichen Syntax folgt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) Optionen. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | Zeiger auf die Erfassungssammlung. |
| [CapturePtr](./captureptr/) | Zeiger auf ein einzelnes Erfassungsobjekt. |
| [GroupPtr](./groupptr/) | Zeiger auf Gruppe. |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) Sammlungszeiger. |
| [MatchEvaluator](./matchevaluator/) | Delegattyp zur Auswertung einer Übereinstimmung. |
| [MatchPtr](./matchptr/) | [Match](./match/) Zeiger. |
| [RegexPtr](./regexptr/) | [Regex](./regex/) Zeiger. |
| [UStringPtr](./ustringptr/) | Gemeinsame UnicodeString, um Kopieren zu vermeiden. |
