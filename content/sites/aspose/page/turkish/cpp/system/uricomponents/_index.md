---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Page için C++"
description: "System::UriComponents enum. C++'da URI bileşenlerini temsil eder."
type: docs
weight: 8900
url: /tr/cpp/system/uricomponents/
---
## UriComponents enum


URI bileşenlerini temsil eder.

```cpp
enum class UriComponents
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Şema | 1 | Scheme verisi. |
| UserInfo | 2 | UserInfo verisi. |
| Host | 4 | Host verisi. |
| Port | 8 | Port verisi. |
| SchemeAndServer | n/a | Scheme, Host ve Port verileri. |
| Yol | 16 | LocalPath verisi. |
| Sorgu | 32 | Query verisi. |
| PathAndQuery | n/a | LocalPath ve Query verileri. |
| HttpRequestUrl | n/a | Scheme, Host, Port, Query ve LocalPath verileri. |
| Fragment | 64 | Fragment verisi. |
| AbsoluteUri | n/a | Şema, Host, Port, Quer, LocalPath ve Fragment verileri. |
| StrongPort | 128 | Port verileri; port verileri [Uri](../uri/) içinde bulunmuyorsa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür; varsayılan port yoksa, -1 döndürülür. |
| HostAndPort | n/a | Host ve Port verileri; port verileri [Uri](../uri/) içinde bulunmuyorsa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür. Varsayılan port yoksa, -1 döndürülür. |
| StrongAuthority | n/a | UserInfo, Host ve Port verileri. Port verileri [Uri](../uri/) içinde yoksa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür. Varsayılan port yoksa, -1 döndürülür. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Ayırıcıyı dahil edilmesi gerektiğini belirtir. |
| SerializationInfoString | n/a | Seriştiriciler için gereken tam [Uri](../uri/) bağlamı. Bağlam IPv6 kapsamını içerir. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
