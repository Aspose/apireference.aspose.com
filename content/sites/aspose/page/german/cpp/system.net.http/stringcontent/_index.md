---
title: "System::Net::Http::StringContent Klasse"
linktitle: "StringContent"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::StringContent class. Stellt HTTP-Inhalt als Zeichenkette dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 1100
url: /de/cpp/system.net.http/stringcontent/
---
## StringContent class


Stellt HTTP-Inhalt als Zeichenkette dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI-Informationen. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Konstruiert eine neue Instanz. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Konstruiert eine neue Instanz. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Die Standardkodierung. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Die maximale Anzahl von Bytes. |
## Siehe auch

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
