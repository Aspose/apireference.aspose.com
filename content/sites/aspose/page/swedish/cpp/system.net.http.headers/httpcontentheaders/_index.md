---
title: "System::Net::Http::Headers::HttpContentHeaders klass"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::HttpContentHeaders klass. Representerar samlingen av ''Content''-huvuden. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 600
url: /sv/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Representerar samlingen av 'Content'-huvuden. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Lägger till de kända rubrikerna i den angivna samlingen. |
| [get_Allow](./get_allow/)() | RTTI-information. |
| [get_ContentDisposition](./get_contentdisposition/)() | Hämtar ett värde för 'Content-Disposition'-huvudet. |
| [get_ContentEncoding](./get_contentencoding/)() | Hämtar ett värde för 'Content-Encoding'-huvudet. |
| [get_ContentLanguage](./get_contentlanguage/)() | Hämtar ett värde för 'Content-Language'-huvudet. |
| [get_ContentLength](./get_contentlength/)() | Hämtar ett värde för 'Content-Length'-huvudet. |
| [get_ContentLocation](./get_contentlocation/)() | Hämtar ett värde av rubriken 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | Hämtar ett värde av rubriken 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | Hämtar ett värde av rubriken 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | Hämtar ett värde av rubriken 'Content-Type'. |
| [get_Expires](./get_expires/)() | Hämtar ett värde av rubriken 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | Hämtar ett värde av rubriken 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Skapar en ny instans. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Sätter ett värde för rubriken 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Sätter ett värde för rubriken 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Sätter ett värde för rubriken 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Sätter ett värde för rubriken 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Sätter ett värde för rubriken 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Sätter ett värde för rubriken 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för rubriken 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för rubriken 'Last-Modified'. |
## Se även

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
