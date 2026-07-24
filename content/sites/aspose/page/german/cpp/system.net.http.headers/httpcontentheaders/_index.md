---
title: "System::Net::Http::Headers::HttpContentHeaders Klasse"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::HttpContentHeaders Klasse. Stellt die Sammlung der ''Content''‑Header dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Stellt die Sammlung der 'Content'-Header dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Fügt die bekannten Header zur angegebenen Sammlung hinzu. |
| [get_Allow](./get_allow/)() | RTTI-Informationen. |
| [get_ContentDisposition](./get_contentdisposition/)() | Liest den Wert des 'Content-Disposition'-Headers. |
| [get_ContentEncoding](./get_contentencoding/)() | Liest den Wert des 'Content-Encoding'-Headers. |
| [get_ContentLanguage](./get_contentlanguage/)() | Liest den Wert des 'Content-Language'-Headers. |
| [get_ContentLength](./get_contentlength/)() | Liest den Wert des 'Content-Length'-Headers. |
| [get_ContentLocation](./get_contentlocation/)() | Ermittelt einen Wert des 'Content-Location'-Headers. |
| [get_ContentMD5](./get_contentmd5/)() | Ermittelt einen Wert des 'Content-MD5'-Headers. |
| [get_ContentRange](./get_contentrange/)() | Ermittelt einen Wert des 'Content-Range'-Headers. |
| [get_ContentType](./get_contenttype/)() | Ermittelt einen Wert des 'Content-Type'-Headers. |
| [get_Expires](./get_expires/)() | Ermittelt einen Wert des 'Expires'-Headers. |
| [get_LastModified](./get_lastmodified/)() | Ermittelt einen Wert des 'Last-Modified'-Headers. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Konstruiert eine neue Instanz. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Setzt einen Wert des 'Content-Disposition'-Headers. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Setzt einen Wert des 'Content-Length'-Headers. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Setzt einen Wert des 'Content-Location'-Headers. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Setzt einen Wert des 'Content-MD5'-Headers. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Setzt einen Wert des 'Content-Range'-Headers. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Setzt einen Wert des 'Content-Type'-Headers. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'Expires'-Headers. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'Last-Modified'-Headers. |
## Siehe auch

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
