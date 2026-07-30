---
title: "System::Net::Http-Namespace"
linktitle: "System::Net::Http"
second_title: "Aspose.Font für C++"
description: "Wie man den System::Net::Http-Namespace in C++ verwendet."
type: docs
weight: 4800
url: /de/cpp/system.net.http/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/) | Stellt HTTP-Inhalt als Byte-Array dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpClient](./httpclient/) | Stellt die Basisklasse eines HTTP-Clients zum Senden von Anfragen und Empfangen von Antworten dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpClientHandler](./httpclienthandler/) | Stellt den Standardnachrichten-Handler dar, der von der Klasse [HttpClient](./httpclient/) verwendet wird. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpContent](./httpcontent/) | Stellt den Inhalt einer HTTP-Entität dar. [Object](../system/object/) dieser Klasse sollte nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpMessageHandler](./httpmessagehandler/) | Stellt einen Basistyp für die HTTP-Nachrichtenhandler dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpMessageInvoker](./httpmessageinvoker/) | Ermöglicht Anwendungen, die Send‑Methode in einer HTTP‑Handler‑Kette aufzurufen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpMethod](./httpmethod/) | Stellt eine HTTP‑Methode dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpRequestMessage](./httprequestmessage/) | Stellt eine HTTP‑Anforderungsnachricht dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpResponseMessage](./httpresponsemessage/) | Stellt eine HTTP‑Antwortnachricht dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [HttpUtilities](./httputilities/) | Enthält die Hilfsmethoden. |
| [StringContent](./stringcontent/) | Stellt HTTP‑Inhalt als Zeichenkette dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [HttpCompletionOption](./httpcompletionoption/) | Gibt an, wann ein [HttpClient](./httpclient/) Vorgang abgeschlossen sein soll. |
| [HttpParseResult](./httpparseresult/) | Gibt das Parsing‑Ergebnis an. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [HttpRequestException](./httprequestexception/) |  |
## Functions

| Funktion | Beschreibung |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
