---
title: "System::Net::Http::Headers::HttpContentHeaders klasse"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::HttpContentHeaders klasse. Vertegenwoordigt de verzameling van de ''Content''-headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Vertegenwoordigt de verzameling van de 'Content'-headers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Voegt de bekende headers toe aan de opgegeven collectie. |
| [get_Allow](./get_allow/)() | RTTI-informatie. |
| [get_ContentDisposition](./get_contentdisposition/)() | Haalt een waarde op van de 'Content-Disposition'-header. |
| [get_ContentEncoding](./get_contentencoding/)() | Haalt een waarde op van de 'Content-Encoding'-header. |
| [get_ContentLanguage](./get_contentlanguage/)() | Haalt een waarde op van de 'Content-Language'-header. |
| [get_ContentLength](./get_contentlength/)() | Haalt een waarde op van de 'Content-Length'-header. |
| [get_ContentLocation](./get_contentlocation/)() | Haalt een waarde op van de 'Content-Location'-header. |
| [get_ContentMD5](./get_contentmd5/)() | Haalt een waarde op van de 'Content-MD5'-header. |
| [get_ContentRange](./get_contentrange/)() | Haalt een waarde op van de 'Content-Range'-header. |
| [get_ContentType](./get_contenttype/)() | Haalt een waarde op van de 'Content-Type'-header. |
| [get_Expires](./get_expires/)() | Haalt een waarde op van de 'Expires'-header. |
| [get_LastModified](./get_lastmodified/)() | Haalt een waarde op van de 'Last-Modified'-header. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Construeert een nieuw exemplaar. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Stelt een waarde in voor de 'Content-Disposition'-header. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Stelt een waarde in voor de 'Content-Length'-header. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Stelt een waarde in voor de 'Content-Location'-header. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Stelt een waarde in voor de 'Content-MD5'-header. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Stelt een waarde in voor de 'Content-Range'-header. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Stelt een waarde in voor de 'Content-Type'-header. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'Expires'-header. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'Last-Modified'-header. |
## Zie ook

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
