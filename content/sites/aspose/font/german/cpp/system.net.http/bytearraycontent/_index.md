---
title: "System::Net::Http::ByteArrayContent Klasse"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::ByteArrayContent Klasse. Stellt HTTP-Inhalt als Byte-Array dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Stellt HTTP-Inhalt als Byte-Array dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI-Informationen. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Erstellt eine neue Instanz. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Versucht, die Länge des Byte-Arrays zu berechnen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | Die Standardkodierung. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Die maximale Anzahl an Bytes. |
## Siehe auch

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
