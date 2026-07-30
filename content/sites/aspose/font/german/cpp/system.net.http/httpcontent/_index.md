---
title: "System::Net::Http::HttpContent Klasse"
linktitle: "HttpContent"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpContent Klasse. Stellt den Inhalt einer HTTP-Entität dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 400
url: /de/cpp/system.net.http/httpcontent/
---
## HttpContent class


Stellt den Inhalt einer HTTP-Entität dar. [Object](../../system/object/) dieser Klasse sollte nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpContent : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Gibt die aktuelle Instanz frei. Diese Methode gibt auch den Stream frei, der von 'ReadAsStream' zurückgegeben wird, sowie den Speicherpuffer, falls er erstellt wurde. |
| [get_Headers](./get_headers/)() | Gibt die HTTP‑Inhaltsheader zurück. |
| [LoadIntoBuffer](./loadintobuffer/)() | Serialisiert den Inhalt in einen Speicherpuffer. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Serialisiert den Inhalt in einen Speicherpuffer. |
| [ReadAsByteArray](./readasbytearray/)() | Serialisiert den Inhalt und gibt ein Byte-Array zurück. |
| [ReadAsStream](./readasstream/)() | Serialisiert den Inhalt und gibt einen Stream zurück. |
| [ReadAsString](./readasstring/)() | Serialisiert den Inhalt und gibt einen String zurück. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Versucht, die Größe des Inhalts zu berechnen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | Die Standardkodierung. |
| static [MaxBufferSize](./maxbuffersize/) | Die maximale Anzahl an Bytes. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
