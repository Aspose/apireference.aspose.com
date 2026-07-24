---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Page för C++"
description: "System::UriComponents enum. Representerar URI-komponenter i C++."
type: docs
weight: 8900
url: /sv/cpp/system/uricomponents/
---
## UriComponents enum


Representerar URI-komponenter.

```cpp
enum class UriComponents
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Schema | 1 | Schemadatan. |
| UserInfo | 2 | UserInfo-datan. |
| Host | 4 | Host-datan. |
| Port | 8 | Port-datan. |
| SchemeAndServer | n/a | Schemadatan, Host-datan och Port-datan. |
| Path | 16 | LocalPath-datan. |
| Fråga | 32 | Query-datan. |
| PathAndQuery | n/a | LocalPath- och Query-datan. |
| HttpRequestUrl | n/a | Schemadatan, Host-datan, Port-datan, Query-datan och LocalPath-datan. |
| Fragment | 64 | Fragment-datan. |
| AbsoluteUri | n/a | Schemat, värden, porten, Quer, LocalPath och fragmentdata. |
| StrongPort | 128 | Portdata; om portdata inte finns i [Uri](../uri/) och en standardport har tilldelats schemat, returneras standardporten; om det inte finns någon standardport, returneras -1. |
| HostAndPort | n/a | Värd- och portdata; om portdata inte finns i [Uri](../uri/) och en standardport har tilldelats schemat, returneras standardporten. Om det inte finns någon standardport, returneras -1. |
| StrongAuthority | n/a | UserInfo-, värd- och portdata. Om ingen portdata finns i [Uri](../uri/) och en standardport har tilldelats schemat, returneras standardporten. Om det inte finns någon standardport, returneras -1. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Anger att avgränsaren ska inkluderas. |
| SerializationInfoString | n/a | Den kompletta [Uri](../uri/) kontexten som behövs för [Uri](../uri/) serialisatorer. Kontexten inkluderar IPv6-omfånget. |

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
