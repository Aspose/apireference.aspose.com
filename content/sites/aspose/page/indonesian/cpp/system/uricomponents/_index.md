---
title: "enum System::UriComponents"
linktitle: "UriComponents"
second_title: "Aspose.Page untuk C++"
description: "enum System::UriComponents. Mewakili komponen URI dalam C++."
type: docs
weight: 8900
url: /id/cpp/system/uricomponents/
---
## UriComponents enum


Mewakili komponen URI.

```cpp
enum class UriComponents
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Skema | 1 | Data Scheme. |
| UserInfo | 2 | Data UserInfo. |
| Host | 4 | Data Host. |
| Port | 8 | Data Port. |
| SchemeAndServer | n/a | Data Scheme, Host, dan Port. |
| Path | 16 | Data LocalPath. |
| Kueri | 32 | Data Query. |
| PathAndQuery | n/a | Data LocalPath dan Query. |
| HttpRequestUrl | n/a | Data Scheme, Host, Port, Query, dan LocalPath. |
| Fragment | 64 | Data Fragment. |
| AbsoluteUri | n/a | Data Scheme, Host, Port, Quer, LocalPath, dan Fragment. |
| StrongPort | 128 | Data Port; jika data port tidak ada dalam [Uri](../uri/) dan port default telah ditetapkan ke Scheme, port default akan dikembalikan; jika tidak ada port default, -1 akan dikembalikan. |
| HostAndPort | n/a | Data Host dan Port; jika data port tidak ada dalam [Uri](../uri/) dan port default telah ditetapkan ke Scheme, port default akan dikembalikan. Jika tidak ada port default, -1 akan dikembalikan. |
| StrongAuthority | n/a | Data UserInfo, Host, dan Port. Jika tidak ada data port dalam [Uri](../uri/) dan port default telah ditetapkan ke Scheme, port default akan dikembalikan. Jika tidak ada port default, -1 akan dikembalikan. |
| NormalizedHost | 256 |  |
| KeepDelimiter | 1073741824 | Menentukan bahwa delimiter harus disertakan. |
| SerializationInfoString | n/a | Konteks lengkap [Uri](../uri/) yang diperlukan untuk Serializers [Uri](../uri/). Konteks mencakup ruang lingkup IPv6. |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
