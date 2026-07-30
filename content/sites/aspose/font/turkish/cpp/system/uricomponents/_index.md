---
title: "System::UriComponents enum"
linktitle: "UriComponents"
second_title: "Aspose.Font için C++"
description: "System::UriComponents enum. C++'de URI bileşenlerini temsil eder."
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
| AbsoluteUri | n/a | Scheme, Host, Port, Quer, LocalPath ve Fragment verileri. |
| StrongPort | 128 | Port verileri; eğer port verileri [Uri](../uri/) içinde bulunmuyorsa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür; varsayılan port yoksa, -1 döndürülür. |
| HostAndPort | n/a | Host ve Port verileri; eğer port verileri [Uri](../uri/) içinde bulunmuyorsa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür. Varsayılan port yoksa, -1 döndürülür. |
| StrongAuthority | n/a | UserInfo, Host ve Port verileri. Eğer [Uri](../uri/) içinde port verisi yoksa ve Şema'ya varsayılan bir port atanmışsa, varsayılan port döndürülür. Varsayılan port yoksa, -1 döndürülür. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Ayırıcıların dahil edilmesi gerektiğini belirtir. |
| SerializationInfoString | n/a | Tam [Uri](../uri/) bağlamı, [Uri](../uri/) Serileştiricileri için gereklidir. Bağlam IPv6 kapsamını içerir. |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
